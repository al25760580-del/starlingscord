package chat.stoat.api.routes.user

import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.core.model.schemas.Channel
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable

@Serializable
private data class OpenDMBody(
    @kotlinx.serialization.SerialName("recipient_id")
    val recipientId: String,
)

/** Opens (or returns) the DM channel with a user: `POST /users/@me/channels`. */
suspend fun openDM(userId: String): Channel {
    val response = DiscordHttp.post("$DISCORD_API/users/@me/channels") {
        contentType(ContentType.Application.Json)
        setBody(
            DiscordJson.encodeToString(
                OpenDMBody.serializer(),
                OpenDMBody(recipientId = userId),
            )
        )
    }.bodyAsText()

    val channel = DiscordJson.decodeFromString(
        chat.stoat.core.discord.models.DiscordChannel.serializer(),
        response,
    )
    val adapted = DiscordMappings.adaptChannel(channel)
    adapted.id?.let {
        StoatAPI.channelCache[it] = adapted
        chat.stoat.discord.DiscordAPI.dmCache[it] = channel
    }
    return adapted
}
