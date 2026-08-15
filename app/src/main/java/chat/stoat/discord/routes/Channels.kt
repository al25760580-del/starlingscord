package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer

@Serializable
data class DiscordMessageSend(
    val content: String,
    val tts: Boolean = false,
    val nonce: String? = null,
)

suspend fun HttpClient.fetchDMs(): List<DiscordChannel> {
    return try {
        val response = get("$DISCORD_API/users/@me/channels")
        DiscordJson.decodeFromString(
            ListSerializer(DiscordChannel.serializer()),
            response.bodyAsText(),
        )
    } catch (e: Exception) {
        emptyList()
    }
}

suspend fun HttpClient.fetchChannelMessages(
    channelId: String,
    limit: Int = 50,
    before: String? = null,
    after: String? = null,
): List<DiscordMessage> {
    return try {
        val params = buildList {
            add("limit=$limit")
            before?.let { add("before=$it") }
            after?.let { add("after=$it") }
        }.joinToString("&")
        val response = get("$DISCORD_API/channels/$channelId/messages?$params")
        DiscordJson.decodeFromString(
            ListSerializer(DiscordMessage.serializer()),
            response.bodyAsText(),
        )
    } catch (e: Exception) {
        emptyList()
    }
}

suspend fun HttpClient.sendMessage(channelId: String, content: String): DiscordMessage? {
    return try {
        val response = post("$DISCORD_API/channels/$channelId/messages") {
            contentType(ContentType.Application.Json)
            setBody(DiscordMessageSend(content = content))
        }
        DiscordJson.decodeFromString(DiscordMessage.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        null
    }
}

/** Top-level wrapper so callers can send a Discord message without referencing the
 *  [HttpClient] extension directly (avoids clashing with Revolt's sendMessage). */
suspend fun sendDiscordMessage(channelId: String, content: String): DiscordMessage? {
    return DiscordHttp.sendMessage(channelId, content)
}
