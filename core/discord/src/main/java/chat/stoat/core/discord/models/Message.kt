package chat.stoat.core.discord.models

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive

/**
 * Decodes a field that Discord sends as EITHER a JSON string or a JSON number
 * (e.g. message nonces: this client sends <=25-char strings, others send
 * integers) into the model's String? convention.
 */
object LenientStringSerializer : KSerializer<String?> {
    override val descriptor =
        PrimitiveSerialDescriptor("LenientString", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: String?) =
        if (value == null) encoder.encodeNull() else encoder.encodeString(value)

    override fun deserialize(decoder: Decoder): String? {
        return when (val element = decoder.decodeSerializableValue(JsonElement.serializer())) {
            is JsonNull -> null
            is JsonPrimitive -> element.content
            else -> null
        }
    }
}

@Serializable
data class DiscordMessage(
    val id: String? = null,
    @SerialName("channel_id")
    val channelId: String? = null,
    val author: DiscordUser? = null,
    // Client-generated id echoed back on the REST response AND the gateway
    // MESSAGE_CREATE - lets the UI swap its optimistic "pending" bubble for
    // the real message no matter which arrives first. Discord allows integer
    // nonces too (other clients send them), so decode tolerates both shapes.
    @Serializable(with = LenientStringSerializer::class)
    val nonce: String? = null,
    @SerialName("webhook_id")
    val webhookId: String? = null,
    val content: String? = null,
    val timestamp: String? = null,
    @SerialName("edited_timestamp")
    val editedTimestamp: String? = null,
    val tts: Boolean = false,
    val mention_everyone: Boolean = false,
    val mentions: List<DiscordUser>? = null,
    @SerialName("mention_roles")
    val mentionRoles: List<String>? = null,
    val attachments: List<DiscordAttachment>? = null,
    val embeds: List<DiscordEmbed>? = null,
    val pinned: Boolean = false,
    val type: Int = 0,
    @SerialName("message_reference")
    val messageReference: DiscordMessageReference? = null,
    @SerialName("referenced_message")
    val referencedMessage: DiscordMessage? = null,
    @SerialName("reactions")
    val reactions: List<DiscordReaction>? = null,
    @SerialName("member")
    val member: DiscordMember? = null,
    val flags: Int? = null,
)

@Serializable
data class DiscordReaction(
    val count: Int = 0,
    val me: Boolean = false,
    val emoji: DiscordReactionEmoji? = null,
)

@Serializable
data class DiscordReactionEmoji(
    val id: String? = null,
    val name: String? = null,
    val animated: Boolean = false,
)

@Serializable
data class DiscordGuildEmoji(
    val id: String? = null,
    val name: String? = null,
    val animated: Boolean = false,
    @SerialName("guild_id")
    val guildId: String? = null,
)

@Serializable
data class DiscordAttachment(
    val id: String? = null,
    val filename: String? = null,
    val size: Int? = null,
    val url: String? = null,
    @SerialName("proxy_url")
    val proxyUrl: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    @SerialName("content_type")
    val contentType: String? = null,
)

@Serializable
data class DiscordEmbed(
    val title: String? = null,
    val type: String? = null,
    val description: String? = null,
    val url: String? = null,
    val color: Int? = null,
    val image: DiscordEmbedMedia? = null,
    val thumbnail: DiscordEmbedMedia? = null,
    val video: DiscordEmbedMedia? = null,
    val provider: DiscordEmbedProvider? = null,
    val author: DiscordEmbedAuthor? = null,
    val footer: DiscordEmbedFooter? = null,
)

@Serializable
data class DiscordEmbedMedia(
    val url: String? = null,
    @SerialName("proxy_url") val proxyUrl: String? = null,
    val width: Int? = null,
    val height: Int? = null,
)

@Serializable
data class DiscordEmbedProvider(
    val name: String? = null,
    val url: String? = null,
)

@Serializable
data class DiscordEmbedAuthor(
    val name: String? = null,
    val url: String? = null,
    @SerialName("icon_url") val iconUrl: String? = null,
)

@Serializable
data class DiscordEmbedFooter(
    val text: String? = null,
    @SerialName("icon_url") val iconUrl: String? = null,
)

@Serializable
data class DiscordMessageReference(
    @SerialName("message_id")
    val messageId: String? = null,
    @SerialName("channel_id")
    val channelId: String? = null,
    @SerialName("guild_id")
    val guildId: String? = null,
)
