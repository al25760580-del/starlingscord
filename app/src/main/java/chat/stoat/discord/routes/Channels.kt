package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuildEmoji
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordMessageReference
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import android.util.Log
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.patch
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
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

/**
 * Normalizes a reaction emoji reference into Discord's wire format:
 * `<:name:id>` / `<a:name:id>` (from the picker), a bare custom emoji snowflake
 * or `name:id` all become `name:id`; unicode emoji pass through untouched.
 */
private fun reactionIdentifier(emoji: String): String {
    Regex("^<a?:([^:]+):(\\d+)>$").find(emoji)?.let {
        return "${it.groupValues[1]}:${it.groupValues[2]}"
    }
    DiscordAPI.emojiCache[emoji]?.name?.let { return "$it:$emoji" }
    return emoji
}

/** Add a reaction to a Discord message. [emoji] is a unicode char, `<:name:id>`
 *  (picker) or a custom emoji snowflake (reaction chip). Returns whether the
 *  server accepted it (403 = missing ADD_REACTIONS / USE_EXTERNAL_EMOJIS). */
suspend fun HttpClient.reactDiscord(channelId: String, messageId: String, emoji: String): Boolean {
    val identifier = reactionIdentifier(emoji)
    val enc = java.net.URLEncoder.encode(identifier, "UTF-8").replace("+", "%20")
    val response = put("$DISCORD_API/channels/$channelId/messages/$messageId/reactions/$enc/@me")
    val ok = response.status.isSuccess()
    if (ok) {
        Log.i("StoatReact", "react '$identifier' ok (msg=$messageId)")
    } else {
        // 403 = no ADD_REACTIONS / USE_EXTERNAL_EMOJIS; 10008 = unknown message.
        Log.w("StoatReact", "react '$identifier' FAILED: HTTP ${response.status.value} (msg=$messageId)")
    }
    return ok
}

/** Remove the authenticated user's reaction from a Discord message. */
suspend fun HttpClient.unreactDiscord(channelId: String, messageId: String, emoji: String): Boolean {
    val identifier = reactionIdentifier(emoji)
    val enc = java.net.URLEncoder.encode(identifier, "UTF-8").replace("+", "%20")
    val response = delete("$DISCORD_API/channels/$channelId/messages/$messageId/reactions/$enc/@me")
    val ok = response.status.isSuccess()
    if (!ok) {
        Log.w("StoatReact", "unreact '$identifier' FAILED: HTTP ${response.status.value} (msg=$messageId)")
    }
    return ok
}

/** Pinned messages for a channel (docs: GET /channels/{channel.id}/pins). */
suspend fun HttpClient.fetchDiscordPins(channelId: String): List<DiscordMessage> {
    return try {
        val response = get("$DISCORD_API/channels/$channelId/pins")
        val messages = DiscordJson.decodeFromString(
            ListSerializer(DiscordMessage.serializer()),
            response.bodyAsText(),
        )
        Log.i("StoatPins", "fetched ${messages.size} pinned messages (channel=$channelId)")
        messages
    } catch (e: Exception) {
        Log.e("StoatPins", "failed to fetch pins (channel=$channelId)", e)
        emptyList()
    }
}

/**
 * Persists the account's status (and optional custom status text) via
 * PATCH /users/@me/settings - the endpoint the official user-account client
 * uses, so the status survives sessions and syncs across devices.
 */
suspend fun patchSelfSettings(status: String, customStatusText: String? = null): Boolean {
    return try {
        val body = buildJsonObject {
            put("status", status)
            if (!customStatusText.isNullOrBlank()) {
                put("custom_status", buildJsonObject {
                    put("text", customStatusText)
                })
            }
        }
        val response = DiscordHttp.patch("$DISCORD_API/users/@me/settings") {
            contentType(ContentType.Application.Json)
            setBody(body)
        }
        val ok = response.status.isSuccess()
        if (ok) {
            Log.i("StoatPresence", "PATCH /users/@me/settings status=$status ok")
        } else {
            Log.w(
                "StoatPresence",
                "PATCH /users/@me/settings FAILED: HTTP ${response.status.value}",
            )
        }
        ok
    } catch (e: Exception) {
        Log.e("StoatPresence", "PATCH /users/@me/settings failed", e)
        false
    }
}

/** The account's own status (online/idle/dnd/invisible), from user settings. */
suspend fun fetchSelfStatus(): String? {
    return try {
        val body = DiscordHttp.get("$DISCORD_API/users/@me/settings").bodyAsText()
        DiscordJson.parseToJsonElement(body)
            .jsonObject["status"]?.jsonPrimitive?.contentOrNull
    } catch (e: Exception) {
        Log.w("StoatPresence", "failed to fetch /users/@me/settings: ${e.message}")
        null
    }
}

/**
 * Fires a typing indicator in a channel. Discord typing indicators expire
 * server-side after a few seconds; there is no "stop typing" call.
 */
suspend fun HttpClient.triggerTyping(channelId: String) {
    post("$DISCORD_API/channels/$channelId/typing")
}
