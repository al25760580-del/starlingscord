package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

suspend fun HttpClient.fetchCurrentUser(): DiscordUser? {
    return try {
        val response = get("$DISCORD_API/users/@me")
        DiscordJson.decodeFromString(DiscordUser.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        null
    }
}

suspend fun HttpClient.fetchUser(userId: String): DiscordUser? {
    return try {
        val response = get("$DISCORD_API/users/$userId")
        DiscordJson.decodeFromString(DiscordUser.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        null
    }
}
