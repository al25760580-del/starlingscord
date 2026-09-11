package chat.stoat.api.routes.channel

import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.core.model.schemas.Channel
import chat.stoat.core.model.schemas.Message
import chat.stoat.core.model.schemas.MessagesInChannel
import chat.stoat.core.model.schemas.User
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.core.discord.models.DiscordMessageReference
import chat.stoat.discord.routes.DiscordAttachmentRef
import chat.stoat.discord.routes.DiscordMessageSend
import chat.stoat.discord.routes.ackChannel
import chat.stoat.discord.routes.fetchChannelMessages
import chat.stoat.discord.routes.fetchDiscordMessage
import chat.stoat.discord.routes.sendMessage
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.patch
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.client.request.parameter
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

suspend fun fetchMessagesFromChannel(
    channelId: String,
    limit: Int = 50,
    includeUsers: Boolean = false,
    before: String? = null,
    after: String? = null,
    nearby: String? = null,
    sort: String? = null
): MessagesInChannel {
    // `before`/`after` arrive as UI message ids (ULIDs); the backend needs
    // the original Discord snowflakes.
    val messages = DiscordHttp.fetchChannelMessages(
        channelId = channelId,
        limit = limit,
        before = before?.let { DiscordMappings.idForRequest(it) },
        after = after?.let { DiscordMappings.idForRequest(it) },
    )

    val adapted = messages.mapNotNull { DiscordMappings.cacheMessage(it) }
    val users = messages.mapNotNull { it.author }.mapNotNull { DiscordMappings.adaptUser(it) }
    users.forEach { u -> u.id?.let { StoatAPI.userCache.putIfAbsent(it, u) } }

    return MessagesInChannel(
        messages = adapted,
        users = users.distinctBy { it.id },
        members = emptyList(),
    )
}

@kotlinx.serialization.Serializable
data class SendMessageReply(
    val id: String,
    val mention: Boolean
)

@kotlinx.serialization.Serializable
data class SendMessageBody(
    val content: String,
    val nonce: String = "",
    val replies: List<SendMessageReply> = emptyList(),
    val attachments: List<String>?
)

@kotlinx.serialization.Serializable
data class EditMessageBody(
    val content: String?
)

@kotlinx.serialization.Serializable
data class CreateInviteResponse(
    val type: String,
    @SerialName("_id")
    val id: String,
    val server: String,
    val creator: String,
    val channel: String,
)

@Serializable
private data class DiscordInviteCreated(
    val code: String? = null,
)

/** Sends a message via Discord and returns the new message's UI id. */
suspend fun sendMessage(
    channelId: String,
    content: String,
    nonce: String = "",
    replies: List<SendMessageReply>? = null,
    attachments: List<DiscordAttachmentRef>? = null,
    idempotencyKey: String = ""
): String {
    val messageReference = replies?.firstOrNull()?.let {
        DiscordMessageReference(
            messageId = DiscordMappings.idForRequest(it.id),
            channelId = channelId,
        )
    }
    val sent = DiscordHttp.sendMessage(
        channelId,
        content,
        messageReference,
        attachments ?: emptyList(),
    ) ?: throw Exception("Failed to send message")
    val adapted = DiscordMappings.cacheMessage(sent)
    return adapted?.id ?: sent.id ?: ""
}

suspend fun editMessage(channelId: String, messageId: String, newContent: String? = null) {
    val mid = DiscordMappings.idForRequest(messageId)
    DiscordHttp.patch("$DISCORD_API/channels/$channelId/messages/$mid") {
        contentType(ContentType.Application.Json)
        setBody(EditMessageBody(content = newContent))
    }
}

suspend fun deleteMessage(channelId: String, messageId: String) {
    val mid = DiscordMappings.idForRequest(messageId)
    DiscordHttp.delete("$DISCORD_API/channels/$channelId/messages/$mid")
}

suspend fun ackChannel(channelId: String, messageId: String = "") {
    // Discord read-state is managed over the gateway; acknowledge best-effort.
    try {
        val mid = if (messageId.isBlank()) null else DiscordMappings.idForRequest(messageId)
        DiscordHttp.ackChannel(channelId, mid ?: DiscordMappings.idForRequest(messageId))
    } catch (_: Exception) {
        // best-effort; read state is also maintained over the gateway
    }
}

suspend fun fetchSingleChannel(channelId: String): Channel {
    val response = DiscordHttp.get("$DISCORD_API/channels/$channelId").bodyAsText()
    val channel = DiscordJson.decodeFromString(
        chat.stoat.core.discord.models.DiscordChannel.serializer(),
        response,
    )
    val adapted = DiscordMappings.adaptChannel(channel)
    adapted.id?.let { StoatAPI.channelCache[it] = adapted }
    return adapted
}

suspend fun fetchGroupParticipants(channelId: String): List<User> {
    val response = DiscordHttp.get("$DISCORD_API/channels/$channelId").bodyAsText()
    val channel = DiscordJson.decodeFromString(
        chat.stoat.core.discord.models.DiscordChannel.serializer(),
        response,
    )
    return channel.recipients?.mapNotNull { DiscordMappings.adaptUser(it) } ?: emptyList()
}

suspend fun createInvite(channelId: String): CreateInviteResponse {
    val response = DiscordHttp.post("$DISCORD_API/channels/$channelId/invites").bodyAsText()
    val invite = DiscordJson.decodeFromString(DiscordInviteCreated.serializer(), response)
    return CreateInviteResponse(
        type = "Server",
        id = invite.code ?: "",
        server = StoatAPI.channelCache[channelId]?.server ?: "",
        creator = StoatAPI.selfId ?: "",
        channel = channelId,
    )
}

suspend fun fetchSingleMessage(channelId: String, messageId: String): Message {
    val mid = DiscordMappings.idForRequest(messageId)
    val message = DiscordHttp.fetchDiscordMessage(channelId, mid)
        ?: throw Exception("Message not found")
    return DiscordMappings.cacheMessage(message) ?: throw Exception("Message not found")
}

suspend fun leaveDeleteOrCloseChannel(channelId: String, leaveSilently: Boolean = false) {
    DiscordHttp.delete("$DISCORD_API/channels/$channelId")
}

suspend fun patchChannel(
    channelId: String,
    name: String? = null,
    description: String? = null,
    icon: String? = null,
    banner: String? = null,
    remove: List<String>? = null,
    nsfw: Boolean? = null,
    pure: Boolean = false
) {
    val body = mutableMapOf<String, String>()
    if (name != null) body["name"] = name
    if (description != null) body["topic"] = description
    if (nsfw != null) body["nsfw"] = nsfw.toString()

    if (body.isNotEmpty()) {
        DiscordHttp.patch("$DISCORD_API/channels/$channelId") {
            contentType(ContentType.Application.Json)
            setBody(
                DiscordJson.encodeToString(
                    MapSerializer(String.serializer(), String.serializer()),
                    body,
                )
            )
        }
    }
    if (!pure) {
        runCatching { fetchSingleChannel(channelId) }
    }
}

@Serializable
private data class DiscordSearchResponse(
    val messages: List<List<chat.stoat.core.discord.models.DiscordMessage>>? = null,
)

suspend fun searchChannel(
    channelId: String,
    query: String? = null,
    pinned: Boolean? = null,
    includeUsers: Boolean? = null,
    after: String? = null,
    before: String? = null,
    limit: Int? = null,
    sort: String? = null
): MessagesInChannel {
    // Discord user-account search: GET /channels/{id}/messages/search.
    // Pinned-only search is not supported.
    if (pinned == true || query.isNullOrBlank()) {
        return MessagesInChannel(messages = emptyList(), users = emptyList(), members = emptyList())
    }

    return try {
        val response = DiscordHttp.get("$DISCORD_API/channels/$channelId/messages/search") {
            parameter("content", query)
        }.bodyAsText()
        val search = DiscordJson.decodeFromString(DiscordSearchResponse.serializer(), response)
        val messages = search.messages.orEmpty().flatten()
        val adapted = messages.mapNotNull { DiscordMappings.cacheMessage(it) }
        val users = messages.mapNotNull { it.author }.mapNotNull { DiscordMappings.adaptUser(it) }
        users.forEach { u -> u.id?.let { StoatAPI.userCache.putIfAbsent(it, u) } }
        MessagesInChannel(
            messages = adapted,
            users = users.distinctBy { it.id },
            members = emptyList(),
        )
    } catch (e: Exception) {
        MessagesInChannel(messages = emptyList(), users = emptyList(), members = emptyList())
    }
}
