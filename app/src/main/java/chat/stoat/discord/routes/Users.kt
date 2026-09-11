package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordUserProfile

import android.util.Log
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.parameter
import io.ktor.client.request.get
import io.ktor.client.request.patch
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType

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

/** PATCH the current Discord user account (bio, avatar data-URI, etc.). */
suspend fun HttpClient.patchCurrentUser(body: String) {
    val response = patch("$DISCORD_API/users/@me") {
        contentType(ContentType.Application.Json)
        setBody(body)
    }
    if (response.status.value !in 200..299) {
        Log.w(
            "DiscordRoutes",
            "patchCurrentUser -> HTTP ${response.status.value}: ${response.bodyAsText().take(300)}",
        )
        throw Exception("Discord patchCurrentUser failed: HTTP ${response.status.value}")
    }
    Log.i("DiscordRoutes", "patchCurrentUser OK")
}

/**
 * Fetches a user's profile (bio, pronouns, banner, badges):
 * `GET /users/{user.id}/profile`. Works with `@me` for the logged-in user.
 * https://docs.discord.food/resources/user#get-user-profile
 */
suspend fun HttpClient.fetchProfile(userId: String): DiscordUserProfile? {
    return try {
        val response = get("$DISCORD_API/users/$userId/profile") {
            parameter("with_mutual_guilds", "false")
            parameter("with_mutual_friends_count", "false")
        }
        DiscordJson.decodeFromString(DiscordUserProfile.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        Log.w("DiscordRoutes", "fetchProfile($userId) failed", e)
        null
    }
}
