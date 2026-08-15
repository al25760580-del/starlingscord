package chat.stoat.api.routes.user

import android.util.Log
import chat.stoat.api.StoatAPI
import chat.stoat.api.StoatAPIError
import chat.stoat.api.StoatHttp
import chat.stoat.api.StoatJson
import chat.stoat.api.api
import chat.stoat.core.model.schemas.Profile
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.discord.DiscordToStoat
import chat.stoat.discord.routes.fetchCurrentUser
import chat.stoat.discord.routes.fetchUser
import chat.stoat.discord.routes.patchCurrentUser
import chat.stoat.core.model.schemas.Status
import chat.stoat.core.model.schemas.User
import chat.stoat.discord.realtime.DiscordGateway
import io.ktor.client.request.get
import io.ktor.client.request.patch
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.SerializationException
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

suspend fun fetchSelf(): User {
    if (DiscordAPI.isActive) {
        // Discord already populated StoatAPI.userCache[selfId] during loginAs.
        return StoatAPI.userCache[StoatAPI.selfId]
            ?: User.getPlaceholder(StoatAPI.selfId ?: "0")
    }
    val response = StoatHttp.get("/users/@me".api())
        .bodyAsText()

    try {
        val error = StoatJson.decodeFromString(StoatAPIError.serializer(), response)
        throw Exception(error.type)
    } catch (e: SerializationException) {
        // Not an error
    }

    val user = StoatJson.decodeFromString(User.serializer(), response)

    if (user.id == null) {
        throw Exception("Self user ID is null")
    }

    StoatAPI.userCache[user.id!!] = user
    StoatAPI.selfId = user.id

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
    if (DiscordAPI.isActive) {
        // In Discord mode the Stoat API is unreachable, so route edits to Discord.
        patchSelfDiscord(status, pronouns, avatar, background, bio, remove)
        return
    }
    val body = mutableMapOf<String, JsonElement>()

    if (status != null) {
        body["status"] = StoatJson.encodeToJsonElement(Status.serializer(), status)
    }

    if (pronouns != null) {
        body["pronouns"] = StoatJson.encodeToJsonElement(String.serializer(), pronouns)
    }

    if (avatar != null) {
        body["avatar"] = StoatJson.encodeToJsonElement(String.serializer(), avatar)
    }

    if (background != null || bio != null) {
        val profileMap = mutableMapOf<String, String>()

        if (background != null) {
            profileMap["background"] = background
        }
        if (bio != null) {
            profileMap["content"] = bio
        }

        body["profile"] = StoatJson.encodeToJsonElement(
            MapSerializer(
                String.serializer(),
                String.serializer()
            ),
            profileMap
        )
    }

    if (remove != null) {
        body["remove"] = StoatJson.encodeToJsonElement(ListSerializer(String.serializer()), remove)
    }

    val response = StoatHttp.patch("/users/@me".api()) {
        contentType(ContentType.Application.Json)
        setBody(
            StoatJson.encodeToString(
                MapSerializer(
                    String.serializer(),
                    JsonElement.serializer()
                ),
                body
            )
        )
    }
        .bodyAsText()

    if (StoatAPI.selfId == null) {
        throw Error("Self ID is null")
    }

    val currentUser = StoatAPI.userCache[StoatAPI.selfId] ?: fetchSelf()
    val newUserKeys = StoatJson.decodeFromString(User.serializer(), response)
    var mergedUser = currentUser.mergeWithPartial(newUserKeys)

    if ("Pronouns" in remove.orEmpty()) {
        mergedUser = mergedUser.copy(pronouns = null)
    }

    if (!pure) {
        StoatAPI.userCache[StoatAPI.selfId!!] = mergedUser
    }
}

/**
 * Discord-mode implementation of [patchSelf]. Routes profile edits to Discord's
 * `PATCH /users/@me` and activity status to the gateway PRESENCE_UPDATE.
 *
 * Note: the Stoat profile UI uploads avatars/backgrounds to Autumn and passes an
 * Autumn file id; Discord requires a base64 data-URI for `avatar`, so avatar and
 * background edits are skipped (logged) unless a real data-URI is supplied.
 */
private suspend fun patchSelfDiscord(
    status: Status?,
    pronouns: String?,
    avatar: String?,
    background: String?,
    bio: String?,
    remove: List<String>?,
) {
    // Status (presence + custom status text) is gateway-driven for user accounts.
    if (status != null) {
        DiscordGateway.updatePresence(revoltPresenceToDiscord(status.presence), status.text)
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
            Log.w("User", "Discord avatar edit needs a data-URI; got Autumn id '$avatar' (skipped)")
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
    DiscordHttp.fetchCurrentUser()?.let { u ->
        u.id?.let { StoatAPI.userCache[it] = DiscordToStoat.adaptUser(u) ?: return@let }
    }
}

/** Maps a Revolt presence string (Online/Idle/Busy/Focus/Invisible) to Discord. */
private fun revoltPresenceToDiscord(presence: String?): String {
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
    if (DiscordAPI.isActive) {
        val du = DiscordHttp.fetchUser(id)
        return DiscordToStoat.adaptUser(du)?.also { u ->
            u.id?.let { StoatAPI.userCache[it] = u }
        } ?: User.getPlaceholder(id)
    }
    val res = StoatHttp.get("/users/$id".api())

    if (res.status.value == 404) {
        return User.getPlaceholder(id)
    }

    val response = res.bodyAsText()

    try {
        val error = StoatJson.decodeFromString(StoatAPIError.serializer(), response)
        throw Exception(error.type)
    } catch (e: SerializationException) {
        // Not an error
    }

    val user = StoatJson.decodeFromString(User.serializer(), response)

    user.id?.let {
        StoatAPI.userCache[it] = user
    }

    return user
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
    if (DiscordAPI.isActive) {
        // Discord has no separate profile endpoint; the user object carries bio/banner.
        val du = DiscordHttp.fetchUser(id)
        return Profile(content = du?.bio, background = null)
    }
    val res = StoatHttp.get("/users/$id/profile".api())

    val response = res.bodyAsText()

    try {
        val error = StoatJson.decodeFromString(StoatAPIError.serializer(), response)
        throw Exception(error.type)
    } catch (e: SerializationException) {
        // Not an error
    }

    return StoatJson.decodeFromString(Profile.serializer(), response)
}
