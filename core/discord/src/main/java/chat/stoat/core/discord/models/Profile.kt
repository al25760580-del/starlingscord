package chat.stoat.core.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Response of `GET /users/{user.id}/profile` (works with `@me`), documented at
 * https://docs.discord.food/resources/user#get-user-profile.
 */
@Serializable
data class DiscordUserProfile(
    val user: DiscordUser? = null,
    @SerialName("user_profile")
    val userProfile: DiscordProfileMetadata? = null,
    val badges: List<DiscordProfileBadge>? = null,
    @SerialName("guild_member")
    val guildMember: DiscordMember? = null,
    @SerialName("guild_member_profile")
    val guildMemberProfile: DiscordProfileMetadata? = null,
)

/** Profile metadata: the parts of a user that are not on the bare user object. */
@Serializable
data class DiscordProfileMetadata(
    val bio: String? = null,
    val pronouns: String? = null,
    val banner: String? = null,
    @SerialName("accent_color")
    val accentColor: Long? = null,
    @SerialName("profile_effect")
    val profileEffect: String? = null,
    @SerialName("legacy_username")
    val legacyUsername: String? = null,
)

/** A rendered profile badge (guild tag / premium / verified etc.). */
@Serializable
data class DiscordProfileBadge(
    val id: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val label: String? = null,
)
