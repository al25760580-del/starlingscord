package chat.stoat.api.routes.user

import android.util.Log
import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.api.internals.discordCdnUrl
import chat.stoat.core.model.schemas.AutumnResource
import chat.stoat.core.model.schemas.Profile
import chat.stoat.core.model.schemas.Status
import chat.stoat.core.model.schemas.User
import chat.stoat.api.realtime.DiscordGateway
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.discord.routes.fetchCurrentUser
import chat.stoat.discord.routes.fetchProfile
import chat.stoat.discord.routes.fetchUser
import chat.stoat.discord.routes.patchCurrentUser
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

/** Fetches the logged-in user from Discord and refreshes the caches. */
suspend fun fetchSelf(): User {
    val self = DiscordHttp.fetchCurrentUser()
        ?: throw Exception("Could not fetch self user (invalid token or network error)")

    // Enrich with the profile endpoint (bio, pronouns, banner, badges):
    // GET /users/@me/profile, per https://docs.discord.food/resources/user.
    val profile = runCatching { DiscordHttp.fetchProfile(self.id ?: "@me") }
        .getOrNull()

    var user = DiscordMappings.adaptUser(self, profile)
        ?: User.getPlaceholder(self.id ?: "0")

    if (user.id == null) {
        throw Exception("Self user ID is null")
    }

    StoatAPI.userCache[user.id!!] = user
    StoatAPI.selfId = user.id
    self.id?.let { chat.stoat.discord.DiscordAPI.userCache[it] = self }
    // Premium type gates emoji usage (external/animated custom emoji).
    chat.stoat.discord.DiscordAPI.selfPremiumType = self.premiumType ?: 0

    return user
}

suspend fun patchSelf(
    status: Status? = null,
    pronouns: String? = null,
    avatar: String? = null,
    background: String? = null,
    bio: String? = null,
    remove: List<String>? = null,
    pure: Boolean = false
) {
    // Status (presence + custom status text) is gateway-driven for user accounts.
    if (status != null) {
        DiscordGateway.updatePresence(presenceToDiscord(status.presence), status.text)
    }

    val body = mutableMapOf<String, JsonElement>()
    if (bio != null) {
        body["bio"] = DiscordJson.encodeToJsonElement(String.serializer(), bio)
    }
    if (pronouns != null) {
        body["pronouns"] = DiscordJson.encodeToJsonElement(String.serializer(), pronouns)
    }
    if (avatar != null) {
        if (avatar.startsWith("data:")) {
            body["avatar"] = DiscordJson.encodeToJsonElement(String.serializer(), avatar)
        } else {
            Log.w("User", "Discord avatar edit needs a data-URI; got '$avatar' (skipped)")
        }
    }
    if (remove != null && "Avatar" in remove) {
        body["avatar"] = JsonPrimitive("null")
    }
    if (background != null || remove?.contains("ProfileBackground") == true) {
        Log.w("User", "Discord user accounts have no profile background field; ignored")
    }

    if (body.isNotEmpty()) {
        DiscordHttp.patchCurrentUser(
            DiscordJson.encodeToString(
                MapSerializer(String.serializer(), JsonElement.serializer()),
                body,
            ),
        )
    }

    // Refresh the cached self user from Discord.
    if (!pure) {
        DiscordHttp.fetchCurrentUser()?.let { u ->
            u.id?.let { StoatAPI.userCache[it] = DiscordMappings.adaptUser(u) ?: return@let }
        }
    }
}

/** Maps a UI presence string (Online/Idle/Busy/Focus/Invisible) to Discord. */
private fun presenceToDiscord(presence: String?): String {
    return when (presence) {
        "Online" -> "online"
        "Idle" -> "idle"
        "Busy" -> "dnd"
        "Focus" -> "online"
        "Invisible", "Offline" -> "invisible"
        else -> "online"
    }
}

suspend fun fetchUser(id: String): User {
    val du = DiscordHttp.fetchUser(id)
    return DiscordMappings.adaptUser(du)?.also { u ->
        u.id?.let { StoatAPI.userCache[it] = u }
    } ?: User.getPlaceholder(id)
}

suspend fun getOrFetchUser(id: String): User {
    return StoatAPI.userCache[id] ?: fetchUser(id)
}

suspend fun addUserIfUnknown(id: String) {
    if (StoatAPI.userCache[id] == null) {
        StoatAPI.userCache[id] = fetchUser(id)
    }
}

suspend fun fetchUserProfile(id: String): Profile {
    // GET /users/{user.id}/profile returns the profile metadata (bio, banner).
    // https://docs.discord.food/resources/user#get-user-profile
    val profile = runCatching { DiscordHttp.fetchProfile(id) }.getOrNull()
    if (profile != null) {
        return Profile(
            content = profile.userProfile?.bio ?: profile.user?.bio,
            background = profile.userProfile?.banner?.let { h ->
                AutumnResource(id = discordCdnUrl("banners", id, h, size = 2048))
            },
        )
    }
    // Fallback to the bare user object (carries bio for self).
    val du = DiscordHttp.fetchUser(id)
    return Profile(content = du?.bio, background = null)
}
