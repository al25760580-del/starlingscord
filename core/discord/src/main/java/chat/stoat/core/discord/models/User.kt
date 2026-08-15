package chat.stoat.core.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Discord user object, as returned by the (unofficial) user API documented at
 * https://docs.discord.food/. Only the fields we actually consume are modelled;
 * [Serializable] with [kotlinx.serialization.json.Json.ignoreUnknownKeys] means
 * additional fields are ignored gracefully.
 */
@Serializable
data class DiscordUser(
    val id: String? = null,
    val username: String? = null,
    @SerialName("global_name")
    val globalName: String? = null,
    val discriminator: String? = null,
    val avatar: String? = null,
    @SerialName("avatar_decoration")
    val avatarDecoration: String? = null,
    val bot: Boolean = false,
    val system: Boolean = false,
    @SerialName("mfa_enabled")
    val mfaEnabled: Boolean? = null,
    val banner: String? = null,
    @SerialName("accent_color")
    val accentColor: Int? = null,
    val bio: String? = null,
    @SerialName("public_flags")
    val publicFlags: Int? = null,
    val flags: Int? = null,
    @SerialName("premium_type")
    val premiumType: Int? = null,
    val email: String? = null,
    val phone: String? = null,
    val verified: Boolean? = null,
    val locale: String? = null,
) {
    fun displayName(): String = globalName ?: username ?: "Unknown User"
}
