package chat.stoat.api.internals

import chat.stoat.api.api
import chat.stoat.core.model.data.STOAT_FILES
import chat.stoat.core.model.schemas.User

/**
 * Discord assets are stored on [chat.stoat.core.model.schemas.AutumnResource.id]
 * as full `cdn.discordapp.com` URLs, but Stoat's UI builders prefix them with
 * [STOAT_FILES], producing a doubled URL such as
 * `https://cdn.stoatusercontent.com/avatars/https://cdn.discordapp.com/...`.
 * This strips the Revolt CDN prefix and returns the embedded Discord URL.
 * Revolt URLs (which never contain `cdn.discordapp.com`) are returned unchanged.
 * Trailing `/null` (a null Revolt filename appended to a Discord id) is dropped.
 */
fun String.normalizeCdnUrl(): String {
    val idx = indexOf("https://cdn.discordapp.com/", ignoreCase = true)
    if (idx <= 0) return this
    val out = substring(idx)
    return if (out.endsWith("/null")) out.removeSuffix("/null") else out
}

object ResourceLocations {
    fun userAvatarUrl(user: User?): String {
        val id = user?.avatar?.id
        if (id != null) {
            // Discord assets store a full cdn.discordapp.com URL in `id`;
            // Revolt stores a bare Autumn ULID.
            return if (id.startsWith("http")) id else "$STOAT_FILES/avatars/$id"
        }
        return "/users/${(user?.id ?: "").ifBlank { "0".repeat(26) }}/default_avatar".api()
    }
}