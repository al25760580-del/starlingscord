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
)
