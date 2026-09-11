package chat.stoat.api.routes.user

import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.request.delete
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable

@Serializable
private data class RelationshipTypeBody(val type: Int)

@Serializable
private data class FriendByUsernameBody(val username: String, val discriminator: String = "0")

/** Blocks a user: `PUT /users/@me/relationships/{uid}` with type 2. */
suspend fun blockUser(userId: String) {
    val response = DiscordHttp.put("$DISCORD_API/users/@me/relationships/$userId") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordJson.encodeToString(
                RelationshipTypeBody.serializer(),
                RelationshipTypeBody(type = 2),
            )
        )
    }
    ensureOk(response.bodyAsText(), response.status.value)
}

/** Unblocks (or unfriends / cancels a request from) a user. */
suspend fun unblockUser(userId: String) {
    val response = DiscordHttp.delete("$DISCORD_API/users/@me/relationships/$userId")
    ensureOk(response.bodyAsText(), response.status.value)
}

/** Sends a friend request by username: `POST /users/@me/relationship`. */
suspend fun friendUser(username: String) {
    val response = DiscordHttp.post("$DISCORD_API/users/@me/relationship") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordJson.encodeToString(
                FriendByUsernameBody.serializer(),
                FriendByUsernameBody(username = username),
            )
        )
    }
    ensureOk(response.bodyAsText(), response.status.value)
}

/** Accepts an incoming friend request (or re-sends one): `PUT /users/@me/relationships/@me`. */
suspend fun acceptFriendRequest(userId: String) {
    val response = DiscordHttp.put("$DISCORD_API/users/@me/relationships/@me") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordJson.encodeToString(
                FriendByIdBody.serializer(),
                FriendByIdBody(id = userId),
            )
        )
    }
    ensureOk(response.bodyAsText(), response.status.value)
}

@Serializable
private data class FriendByIdBody(val type: Int = 1, val id: String)

/** Removes a friend / declines a request. */
suspend fun unfriendUser(userId: String) {
    val response = DiscordHttp.delete("$DISCORD_API/users/@me/relationships/$userId")
    ensureOk(response.bodyAsText(), response.status.value)
}

private fun ensureOk(body: String, status: Int) {
    if (status !in 200..299) {
        throw Exception("Discord relationship action failed: HTTP $status: ${body.take(200)}")
    }
}
