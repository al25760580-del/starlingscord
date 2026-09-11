package chat.stoat.core.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

import chat.stoat.core.discord.models.DiscordChannel

/**
 * Discord guild (server) object. The `/users/@me/guilds` endpoint returns a
 * reduced shape; the gateway `GUILD_CREATE`/`READY` events return the full one.
 */
@Serializable
data class DiscordGuild(
    val id: String? = null,
    val name: String? = null,
    val icon: String? = null,
    val owner: Boolean = false,
    @SerialName("owner_id")
    val ownerId: String? = null,
    val description: String? = null,
    val banner: String? = null,
    val splash: String? = null,
    val features: List<String>? = null,
    @SerialName("approximate_member_count")
    val approximateMemberCount: Int? = null,

    /** Present on the full guild object delivered by gateway GUILD_CREATE. */
    @SerialName("channels")
    val channels: List<DiscordChannel>? = null,

    /** Present on the full guild object delivered by gateway GUILD_CREATE. */
    @SerialName("members")
    val members: List<DiscordMember>? = null,

    /** Present on the full guild object (GUILD_CREATE, GET /guilds/{id}). */
    @SerialName("roles")
    val roles: List<DiscordRole>? = null,

    /** Total permissions for the requesting user, excluding channel overwrites. */
    val permissions: String? = null,

    @SerialName("premium_tier")
    val premiumTier: Int? = null,

    @SerialName("premium_subscription_count")
    val premiumSubscriptionCount: Int? = null,

    @SerialName("vanity_url_code")
    val vanityUrlCode: String? = null,
)

/**
 * Discord guild member as nested on gateway [DiscordGuild] payloads and on
 * guild/text [DiscordMessage]s. [user] carries the account; [nick] is the
 * guild-specific display name.
 */
@Serializable
data class DiscordMember(
    val user: DiscordUser? = null,
    val nick: String? = null,
    val roles: List<String>? = null,
    @SerialName("joined_at")
    val joinedAt: String? = null,
    val avatar: String? = null,
    val banner: String? = null,
    val bio: String? = null,
    @SerialName("premium_since")
    val premiumSince: String? = null,
    @SerialName("communication_disabled_until")
    val communicationDisabledUntil: String? = null,
    val pending: Boolean? = null,
    val flags: Long? = null,
)

/**
 * Discord role object (guild-level permission set), as documented at
 * https://docs.discord.food/resources/guild#role-object. The @everyone role
 * shares the guild's ID. `permissions` is a stringified bitwise value.
 */
@Serializable
data class DiscordRole(
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val color: Long? = null,
    val colors: DiscordRoleColors? = null,
    val hoist: Boolean? = null,
    val icon: String? = null,
    @SerialName("unicode_emoji")
    val unicodeEmoji: String? = null,
    val position: Int? = null,
    val permissions: String? = null,
    val managed: Boolean? = null,
    val mentionable: Boolean? = null,
    val flags: Int? = null,
)

/** Gradient-capable role colors (ENHANCED_ROLE_COLORS guild feature). */
@Serializable
data class DiscordRoleColors(
    @SerialName("primary_color") val primaryColor: Long? = null,
    @SerialName("secondary_color") val secondaryColor: Long? = null,
    @SerialName("tertiary_color") val tertiaryColor: Long? = null,
)
