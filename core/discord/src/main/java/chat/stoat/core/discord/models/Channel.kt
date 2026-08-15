package chat.stoat.core.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Discord channel types. See https://docs.discord.food/resources/channel#channel-object */
object DiscordChannelType {
    const val GUILD_TEXT = 0
    const val DM = 1
    const val GUILD_VOICE = 2
    const val GROUP_DM = 3
    const val GUILD_CATEGORY = 4
    const val GUILD_ANNOUNCEMENT = 5
    const val ANNOUNCEMENT_THREAD = 10
    const val PUBLIC_THREAD = 11
    const val PRIVATE_THREAD = 12
    const val GUILD_STAGE_VOICE = 13
    const val GUILD_DIRECTORY = 14
    const val GUILD_FORUM = 15
}

@Serializable
data class DiscordChannel(
    val id: String? = null,
    val type: Int = DiscordChannelType.GUILD_TEXT,
    @SerialName("guild_id")
    val guildId: String? = null,
    val name: String? = null,
    val topic: String? = null,
    val position: Int? = null,
    val nsfw: Boolean = false,
    val recipients: List<DiscordUser>? = null,
    @SerialName("last_message_id")
    val lastMessageId: String? = null,
    @SerialName("parent_id")
    val parentId: String? = null,
    val icon: String? = null,
    @SerialName("permission_overwrites")
    val permissionOverwrites: List<DiscordPermissionOverwrite>? = null,
) {
    /** A human-readable name for a channel, falling back to recipients for DMs. */
    fun displayName(): String {
        if (!name.isNullOrBlank()) return name
        return when (type) {
            DiscordChannelType.DM, DiscordChannelType.GROUP_DM -> {
                recipients?.joinToString(", ") { it.displayName() }?.takeIf { it.isNotBlank() }
                    ?: "Direct Message"
            }
            else -> "Unnamed Channel"
        }
    }
}

@Serializable
data class DiscordPermissionOverwrite(
    val id: String? = null,
    val type: Int = 0,
    val allow: String? = null,
    val deny: String? = null,
)
