package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuildEmoji
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordMessageReference
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.delete
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.builtins.ListSerializer

@Serializable
data class DiscordMessageSend(
    val content: String,
    val tts: Boolean = false,
    val nonce: String? = null,
    @SerialName("message_reference")
    val messageReference: DiscordMessageReference? = null,
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

suspend fun HttpClient.sendMessage(channelId: String, content: String, messageReference: DiscordMessageReference? = null): DiscordMessage? {
    return try {
        val response = post("$DISCORD_API/channels/$channelId/messages") {
            contentType(ContentType.Application.Json)
            setBody(DiscordMessageSend(content = content, messageReference = messageReference))
        }
        DiscordJson.decodeFromString(DiscordMessage.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        null
    }
}

/** Top-level wrapper so callers can send a Discord message without referencing the
 *  [HttpClient] extension directly (avoids clashing with Revolt's sendMessage). */
suspend fun sendDiscordMessage(channelId: String, content: String, messageReference: DiscordMessageReference? = null): DiscordMessage? {
    return DiscordHttp.sendMessage(channelId, content, messageReference)
}

/** Discord read-state acknowledgement: POST /channels/{id}/messages/{id}/ack. */
suspend fun HttpClient.ackChannel(channelId: String, messageId: String) {
    post("$DISCORD_API/channels/$channelId/messages/$messageId/ack")
}

/** List a guild's custom emoji (used to render custom emoji + reactions). */
suspend fun HttpClient.fetchGuildEmojis(guildId: String): List<DiscordGuildEmoji> {
    return try {
        val response = get("$DISCORD_API/guilds/$guildId/emojis")
        DiscordJson.decodeFromString(
            ListSerializer(DiscordGuildEmoji.serializer()),
            response.bodyAsText(),
        ).map { it.copy(guildId = guildId) }
    } catch (e: Exception) {
        emptyList()
    }
}

/** Fetch a single Discord message by id (used to resolve uncached reply targets). */
suspend fun HttpClient.fetchDiscordMessage(channelId: String, messageId: String): DiscordMessage? {
    return try {
        val response = get("$DISCORD_API/channels/$channelId/messages/$messageId")
        DiscordJson.decodeFromString(DiscordMessage.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        null
    }
}

/** Add a reaction to a Discord message. [emoji] is either a unicode char or the
 *  snowflake id of a custom emoji (resolved to `name:id` via [DiscordAPI.emojiCache]). */
suspend fun HttpClient.reactDiscord(channelId: String, messageId: String, emoji: String) {
    val identifier = DiscordAPI.emojiCache[emoji]?.name?.let { "$it:$emoji" } ?: emoji
    val enc = java.net.URLEncoder.encode(identifier, "UTF-8").replace("+", "%20")
    put("$DISCORD_API/channels/$channelId/messages/$messageId/reactions/$enc/@me")
}

/** Remove the authenticated user's reaction from a Discord message. */
suspend fun HttpClient.unreactDiscord(channelId: String, messageId: String, emoji: String) {
    val identifier = DiscordAPI.emojiCache[emoji]?.name?.let { "$it:$emoji" } ?: emoji
    val enc = java.net.URLEncoder.encode(identifier, "UTF-8").replace("+", "%20")
    delete("$DISCORD_API/channels/$channelId/messages/$messageId/reactions/$enc/@me")
}

/**
 * Fires a typing indicator in a channel. Discord typing indicators expire
 * server-side after a few seconds; there is no "stop typing" call.
 */
suspend fun HttpClient.triggerTyping(channelId: String) {
    post("$DISCORD_API/channels/$channelId/typing")
}
