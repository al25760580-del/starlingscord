package chat.stoat.api.routes.channel

import chat.stoat.api.internals.DiscordMappings
import chat.stoat.core.model.schemas.Channel
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.screens.create.MAX_ADDABLE_PEOPLE_IN_GROUP
import io.ktor.client.request.delete
import io.ktor.client.request.patch
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer

@Serializable
private data class CreateGroupDMBody(
    val recipients: List<String>,
)

@Serializable
private data class RenameGroupBody(
    val name: String,
)

/** Creates a group DM: `POST /users/@me/channels` + rename. */
suspend fun createGroupDM(name: String, members: List<String>): Channel {
    if (members.size > MAX_ADDABLE_PEOPLE_IN_GROUP) {
        throw Exception("Too many members, maximum is $MAX_ADDABLE_PEOPLE_IN_GROUP")
    }

    val response = DiscordHttp.post("$DISCORD_API/users/@me/channels") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordJson.encodeToString(
                CreateGroupDMBody.serializer(),
                CreateGroupDMBody(recipients = members),
            )
        )
    }.bodyAsText()

    val channel = DiscordJson.decodeFromString(
        chat.stoat.core.discord.models.DiscordChannel.serializer(),
        response,
    )

    if (name.isNotBlank()) {
        channel.id?.let { cid ->
            runCatching {
                DiscordHttp.patch("$DISCORD_API/channels/$cid") {
                    contentType(ContentType.Application.Json)
                    setBody(
                        DiscordJson.encodeToString(
                            RenameGroupBody.serializer(),
                            RenameGroupBody(name),
                        )
                    )
                }
            }
        }
    }

    val adapted = DiscordMappings.adaptChannel(channel.copy(name = name.ifBlank { channel.name ?: "" }))
    adapted.id?.let { chat.stoat.api.StoatAPI.channelCache[it] = adapted }
    return adapted
}

suspend fun removeMember(channelId: String, userId: String) {
    val response = DiscordHttp.delete("$DISCORD_API/channels/$channelId/recipients/$userId")
    if (!response.status.isSuccess()) {
        throw Error(response.status.toString())
    }
}

suspend fun addMember(channelId: String, userId: String) {
    val response = DiscordHttp.put("$DISCORD_API/channels/$channelId/recipients/$userId")
    if (!response.status.isSuccess()) {
        throw Error(response.status.toString())
    }
}
