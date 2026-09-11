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
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.http.ContentType
import io.ktor.http.content.OutgoingContent
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import io.ktor.utils.io.ByteWriteChannel
import io.ktor.utils.io.writeFully
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.builtins.ListSerializer
import java.io.File

@Serializable
data class DiscordMessageSend(
    val content: String,
    val tts: Boolean = false,
    val nonce: String? = null,
    @SerialName("message_reference")
    val messageReference: DiscordMessageReference? = null,
    val attachments: List<DiscordAttachmentRef>? = null,
)

/** Request body for POST /channels/{channel.id}/attachments. */
@Serializable
data class DiscordUploadFileRequest(
    val filename: String,
    @SerialName("file_size") val fileSize: Long,
)

@Serializable
data class DiscordUploadFilesRequest(val files: List<DiscordUploadFileRequest>)

/** A signed upload URL minted by the Create Message Attachments endpoint. */
@Serializable
data class DiscordCloudAttachment(
    val id: String? = null,
    @SerialName("upload_url") val uploadUrl: String = "",
    @SerialName("upload_filename") val uploadFilename: String = "",
)

@Serializable
data class DiscordCloudAttachmentsResponse(
    val attachments: List<DiscordCloudAttachment> = emptyList(),
)

/** A pre-uploaded file, referenced by the message send request. */
@Serializable
data class DiscordAttachmentRef(
    val id: String,
    val filename: String,
    @SerialName("uploaded_filename") val uploadedFilename: String,
)

/**
 * Plain client for the signed Google Cloud Storage upload URLs: the Discord
 * auth/super-properties headers must not be sent to (and break) the signed
 * URL.
 */
private val CloudUploadHttpClient = HttpClient(OkHttp)

/**
 * Discord's cloud upload flow (docs: topics/cloud-uploads):
 *  1. POST /channels/{channel.id}/attachments mints a signed GCS upload URL;
 *  2. the raw bytes are PUT to that URL (no Discord auth headers);
 *  3. the message references the returned upload_filename.
 */
suspend fun uploadChannelAttachment(
    channelId: String,
    file: File,
    filename: String,
    onProgress: (Long, Long) -> Unit = { _, _ -> },
): DiscordAttachmentRef {
    // 1. Mint the signed upload URL.
    val response = DiscordHttp.post("$DISCORD_API/channels/$channelId/attachments") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordUploadFilesRequest(
                files = listOf(
                    DiscordUploadFileRequest(filename = filename, fileSize = file.length())
                )
            )
        )
    }
    val cloud = DiscordJson
        .decodeFromString(DiscordCloudAttachmentsResponse.serializer(), response.bodyAsText())
        .attachments.firstOrNull()
        ?: throw Exception("No upload URL returned for $filename")

    // 2. Stream the bytes to GCS, reporting progress as we go.
    val total = file.length()
    val body = object : OutgoingContent.WriteChannelContent() {
        override val contentLength: Long = total
        override suspend fun writeTo(channel: ByteWriteChannel) {
            file.inputStream().use { input ->
                val buffer = ByteArray(64 * 1024)
                var written = 0L
                while (true) {
                    val read = input.read(buffer)
                    if (read <= 0) break
                    channel.writeFully(buffer, 0, read)
                    written += read
                    onProgress(written, total)
                }
            }
        }
    }
    val uploaded = CloudUploadHttpClient.put(cloud.uploadUrl) {
        contentType(ContentType.Application.OctetStream)
        setBody(body)
    }
    if (!uploaded.status.isSuccess()) {
        throw Exception("Upload of $filename failed: HTTP ${uploaded.status.value}")
    }

    // 3. Reference for the message body; `id` is re-indexed by
    //    [sendMessage] to the attachment's position in the message.
    return DiscordAttachmentRef(
        id = "0",
        filename = filename,
        uploadedFilename = cloud.uploadFilename,
    )
}

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

suspend fun HttpClient.sendMessage(
    channelId: String,
    content: String,
    messageReference: DiscordMessageReference? = null,
    attachments: List<DiscordAttachmentRef> = emptyList(),
): DiscordMessage? {
    return try {
        val response = post("$DISCORD_API/channels/$channelId/messages") {
            contentType(ContentType.Application.Json)
            setBody(
                DiscordMessageSend(
                    content = content,
                    messageReference = messageReference,
                    // `id` is the attachment's index within the message.
                    attachments = attachments
                        .mapIndexed { i, ref -> ref.copy(id = i.toString()) }
                        .takeIf { it.isNotEmpty() },
                )
            )
        }
        DiscordJson.decodeFromString(DiscordMessage.serializer(), response.bodyAsText())
    } catch (e: Exception) {
        null
    }
}

/** Top-level wrapper so callers can send a Discord message without referencing the
 *  [HttpClient] extension directly (avoids clashing with Revolt's sendMessage). */
suspend fun sendDiscordMessage(
    channelId: String,
    content: String,
    messageReference: DiscordMessageReference? = null,
    attachments: List<DiscordAttachmentRef> = emptyList(),
): DiscordMessage? {
    return DiscordHttp.sendMessage(channelId, content, messageReference, attachments)
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
