package chat.stoat.api.routes.user

import chat.stoat.api.StoatAPI
import chat.stoat.api.StoatAPIError
import chat.stoat.api.StoatHttp
import chat.stoat.api.StoatJson
import chat.stoat.api.api
import chat.stoat.core.model.schemas.Profile
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordToStoat
import chat.stoat.core.model.schemas.Status
import chat.stoat.core.model.schemas.User
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
