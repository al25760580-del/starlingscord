package chat.stoat.api.routes.invites

import chat.stoat.api.StoatAPIError
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.api.internals.discordCdnUrl
import chat.stoat.core.model.schemas.AutumnResource
import chat.stoat.core.model.schemas.Invite
import chat.stoat.core.model.schemas.InviteJoined
import chat.stoat.core.model.util.RsResult
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
private data class DiscordInviteGuild(
    val id: String? = null,
    val name: String? = null,
    val icon: String? = null,
    val banner: String? = null,
    val description: String? = null,
)

@Serializable
private data class DiscordInviteChannel(
    val id: String? = null,
    val name: String? = null,
    val type: Int? = null,
)

@Serializable
private data class DiscordInviteInviter(
    val id: String? = null,
    val username: String? = null,
    val globalName: String? = null,
    val avatar: String? = null,
)

@Serializable
private data class DiscordInviteResponse(
    val code: String? = null,
    val guild: DiscordInviteGuild? = null,
    val channel: DiscordInviteChannel? = null,
    val inviter: DiscordInviteInviter? = null,
    @SerialName("approximate_member_count")
    val approximateMemberCount: Long? = null,
)

private fun DiscordInviteResponse.toInvite(): Invite {
    return Invite(
        type = "Server",
        code = code,
        serverId = guild?.id,
        serverName = guild?.name,
        serverIcon = guild?.id?.let { gid ->
            guild.icon?.let { h -> AutumnResource(id = discordCdnUrl("icons", gid, h)) }
        },
        serverBanner = guild?.id?.let { gid ->
            guild.banner?.let { h ->
                AutumnResource(id = discordCdnUrl("banners", gid, h, size = 2048))
            }
        },
        channelId = channel?.id,
        channelName = channel?.name,
        userName = inviter?.globalName ?: inviter?.username,
        userAvatar = inviter?.id?.let { uid ->
            inviter.avatar?.let { h -> AutumnResource(id = discordCdnUrl("avatars", uid, h)) }
        },
        memberCount = approximateMemberCount,
    )
}

/** Fetches invite metadata: `GET /invites/{code}`. */
suspend fun fetchInviteByCode(code: String): RsResult<Invite, StoatAPIError> {
    return try {
        val response = DiscordHttp.get("$DISCORD_API/invites/$code").bodyAsText()
        val invite = DiscordJson.decodeFromString(DiscordInviteResponse.serializer(), response)
        RsResult.ok(invite.toInvite())
    } catch (e: Exception) {
        RsResult.err(StoatAPIError("NotFound"))
    }
}

/** Joins a server via invite: `POST /invites/{code}`. */
suspend fun joinInviteByCode(code: String): RsResult<InviteJoined, StoatAPIError> {
    return try {
        val response = DiscordHttp.post("$DISCORD_API/invites/$code").bodyAsText()
        val invite = DiscordJson.decodeFromString(DiscordInviteResponse.serializer(), response)
        val guildId = invite.guild?.id

        // Populate the server + channels from the joined guild so the UI can
        // navigate to it straight away.
        val server = guildId?.let { chat.stoat.api.StoatAPI.serverCache[it] }
        RsResult.ok(
            InviteJoined(
                type = "Server",
                channels = chat.stoat.api.StoatAPI.channelCache.values.filter { it.server == guildId },
                server = server,
            )
        )
    } catch (e: Exception) {
        RsResult.err(StoatAPIError("JoinFailed"))
    }
}
