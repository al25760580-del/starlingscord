package chat.stoat.api.realtime.frames.receivable

import chat.stoat.core.model.schemas.Embed
import chat.stoat.core.model.schemas.Message
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

/**
 * Frame-shaped notifications pushed through [chat.stoat.api.StoatAPI.wsFrameChannel].
 *
 * The transport is the Discord gateway (see [chat.stoat.api.realtime.DiscordGateway]),
 * which has no wire frames of its own for these UI events; the gateway synthesises
 * the frames below so the existing view models keep working unchanged.
 */

/** Incoming messages arrive as fully adapted [Message] schemas. */
typealias MessageFrame = Message

@Serializable
data class MessageUpdateFrame(
    val type: String = "MessageUpdate",
    val id: String,
    val channel: String,
    val data: JsonObject
)

@Serializable
data class Appendable(
    val embeds: List<Embed>? = null
)

@Serializable
data class MessageAppendFrame(
    val type: String = "MessageAppend",
    val id: String,
    val channel: String,
    val append: Appendable
)

@Serializable
data class MessageDeleteFrame(
    val type: String = "MessageDelete",
    val id: String,
    val channel: String
)

@Serializable
data class MessageReactFrame(
    val type: String = "MessageReact",
    val id: String,
    val channel_id: String,
    val user_id: String,
    val emoji_id: String
)

@Serializable
data class MessageUnreactFrame(
    val type: String = "MessageUnreact",
    val id: String,
    val channel_id: String,
    val user_id: String,
    val emoji_id: String
)

@Serializable
data class ChannelDeleteFrame(
    val type: String = "ChannelDelete",
    val id: String
)

@Serializable
data class ChannelStartTypingFrame(
    val type: String = "ChannelStartTyping",
    val id: String,
    val user: String
)

@Serializable
data class ChannelStopTypingFrame(
    val type: String = "ChannelStopTyping",
    val id: String,
    val user: String
)
