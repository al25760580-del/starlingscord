package chat.stoat.core.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DiscordMessage(
    val id: String? = null,
    @SerialName("channel_id")
    val channelId: String? = null,
    val author: DiscordUser? = null,
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
