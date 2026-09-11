package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordMember
import chat.stoat.core.discord.models.DiscordRole

import android.util.Log
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.parameter
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.builtins.ListSerializer

suspend fun HttpClient.fetchGuilds(): List<DiscordGuild> {
    return try {
        val response = get("$DISCORD_API/users/@me/guilds")
        DiscordJson.decodeFromString(
            ListSerializer(DiscordGuild.serializer()),
            response.bodyAsText(),
        )
    } catch (e: Exception) {
        Log.w("DiscordRoutes", "fetchGuilds failed", e)
        emptyList()
    }
}

suspend fun HttpClient.fetchGuildChannels(guildId: String): List<DiscordChannel> {
    return try {
        // Logged-in user token: GET /guilds/{id}/channels returns the guild's
        // channels. The /users/@me/guilds/{id}/channels path does NOT exist on
        // Discord and returns 404 ("404: Not Found", code 0), so channels never
        // came through this fallback.
        val response = get("$DISCORD_API/guilds/$guildId/channels")
        val text = response.bodyAsText()
        if (response.status.value !in 200..299) {
            Log.w(
                "DiscordRoutes",
                "fetchGuildChannels($guildId) -> HTTP ${response.status.value}: " +
                    text.take(300),
            )
            return emptyList()
        }
        DiscordJson.decodeFromString(
            ListSerializer(DiscordChannel.serializer()),
            text,
        )
    } catch (e: Exception) {
        Log.w("DiscordRoutes", "fetchGuildChannels($guildId) failed", e)
        emptyList()
    }
}

/**
 * Fetches the full guild object (includes `roles`), `GET /guilds/{id}`.
 * `with_counts=true` also yields approximate member/presence counts.
 */
suspend fun HttpClient.fetchGuild(guildId: String): DiscordGuild? {
    return try {
        val response = get("$DISCORD_API/guilds/$guildId") {
            parameter("with_counts", "true")
        }
        DiscordJson.decodeFromString(DiscordGuild.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        Log.w("DiscordRoutes", "fetchGuild($guildId) failed", e)
        null
    }
}

/**
 * Fetches the guild's roles: `GET /guilds/{id}/roles`.
 * https://docs.discord.food/resources/guild (role object).
 */
suspend fun HttpClient.fetchGuildRoles(guildId: String): List<DiscordRole> {
    return try {
        val response = get("$DISCORD_API/guilds/$guildId/roles")
        DiscordJson.decodeFromString(
            ListSerializer(DiscordRole.serializer()),
            response.bodyAsText(),
        )
    } catch (e: Exception) {
        Log.w("DiscordRoutes", "fetchGuildRoles($guildId) failed", e)
        emptyList()
    }
}

/**
 * Fetches the logged-in user's own member object (with role IDs) for a guild:
 * `GET /users/@me/guilds/{guild.id}/member`.
 */
suspend fun HttpClient.fetchSelfGuildMember(guildId: String): DiscordMember? {
    return try {
        val response = get("$DISCORD_API/users/@me/guilds/$guildId/member")
        DiscordJson.decodeFromString(DiscordMember.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        Log.w("DiscordRoutes", "fetchSelfGuildMember($guildId) failed", e)
        null
    }
}
