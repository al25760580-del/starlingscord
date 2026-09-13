package chat.stoat.api.routes.server

import android.util.Log
import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.core.model.schemas.Member
import chat.stoat.core.model.schemas.ServerWithChannelObjects
import chat.stoat.core.model.schemas.User
import chat.stoat.core.discord.models.DiscordMember
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.discord.routes.fetchGuildChannels
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer

@Serializable
data class FetchMembersResponse(
    val members: List<Member>,
    val users: List<User>
)

suspend fun ackServer(serverId: String) {
    // Discord read states are maintained over the gateway; nothing to do.
}

/** Lists guild members: `GET /guilds/{id}/members`. */
suspend fun fetchMembers(
    serverId: String,
    includeOffline: Boolean = false,
    pure: Boolean = false
): FetchMembersResponse {
    // A failed member fetch (HTTP error such as 50001 Missing Access, or an
    // unexpected body) must return empty lists, never crash the caller.
    return try {
        val http = DiscordHttp.get("$DISCORD_API/guilds/$serverId/members") {
            parameter("limit", 1000)
        }
        if (!http.status.isSuccess()) {
            Log.w(
                "StoatMembers",
                "fetchMembers($serverId) failed: HTTP ${http.status.value} — " +
                    http.bodyAsText().take(200),
            )
            return FetchMembersResponse(members = emptyList(), users = emptyList())
        }

        val discordMembers = DiscordJson.decodeFromString(
            ListSerializer(DiscordMember.serializer()),
            http.bodyAsText(),
        )

        val members = discordMembers.mapNotNull { DiscordMappings.adaptMember(serverId, it) }
        val users = discordMembers.mapNotNull { it.user }.mapNotNull { DiscordMappings.adaptUser(it) }

        if (!pure) {
            members.forEach { member ->
                member.id?.let { choice ->
                    if (!StoatAPI.members.hasMember(serverId, choice.user)) {
                        StoatAPI.members.setMember(serverId, member)
                    }
                }
            }
            users.forEach { user ->
                user.id?.let { StoatAPI.userCache.putIfAbsent(it, user) }
            }
        }

        Log.i("StoatMembers", "fetchMembers($serverId): ${members.size} members")
        FetchMembersResponse(members = members, users = users)
    } catch (e: kotlinx.coroutines.CancellationException) {
        throw e
    } catch (e: Exception) {
        Log.e("StoatMembers", "fetchMembers($serverId) failed", e)
        FetchMembersResponse(members = emptyList(), users = emptyList())
    }
}

/** Fetches one guild member: `GET /guilds/{id}/members/{uid}`. */
suspend fun fetchMember(serverId: String, userId: String, pure: Boolean = false): Member {
    val response = DiscordHttp.get("$DISCORD_API/guilds/$serverId/members/$userId").bodyAsText()
    val discordMember = try {
        DiscordJson.decodeFromString(DiscordMember.serializer(), response)
    } catch (e: Exception) {
        Log.w("StoatMembers", "fetchMember($serverId/$userId) failed: ${e.message}")
        throw Exception("Member not found")
    }
    val member = DiscordMappings.adaptMember(serverId, discordMember)
        ?: throw Exception("Member not found")

    if (!pure) {
        member.id?.let {
            if (!StoatAPI.members.hasMember(serverId, it.user)) {
                StoatAPI.members.setMember(serverId, member)
            }
        }
    }

    return member
}

/**
 * Leaves the guild (`DELETE /guilds/{id}/members/@me`); if that is rejected
 * (e.g. the caller owns the guild), deletes the guild instead.
 */
suspend fun leaveOrDeleteServer(serverId: String, leaveSilently: Boolean = false) {
    val leave = DiscordHttp.delete("$DISCORD_API/guilds/$serverId/members/@me")
    if (leave.status.value !in 200..299) {
        DiscordHttp.delete("$DISCORD_API/guilds/$serverId")
    }
}

@Serializable
private data class CreateGuildBody(
    val name: String,
)

/** Creates a guild: `POST /guilds`. */
suspend fun createServer(
    name: String,
    description: String = "",
    nsfw: Boolean = false
): ServerWithChannelObjects {
    val response = DiscordHttp.post("$DISCORD_API/guilds") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordJson.encodeToString(
                CreateGuildBody.serializer(),
                CreateGuildBody(name = name),
            )
        )
    }.bodyAsText()

    val guild = DiscordJson.decodeFromString(
        chat.stoat.core.discord.models.DiscordGuild.serializer(),
        response,
    )
    guild.id?.let { gid ->
        chat.stoat.discord.DiscordAPI.guildCache[gid] = guild
        val channels = runCatching { DiscordHttp.fetchGuildChannels(gid) }.getOrElse { emptyList() }
        return DiscordMappings.adaptServerWithChannels(guild, channels)
    }
    throw Exception("Guild creation returned no id")
}
