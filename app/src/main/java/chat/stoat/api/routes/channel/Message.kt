package chat.stoat.api.routes.channel

import chat.stoat.api.StoatHttp
import chat.stoat.api.api
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.reactDiscord
import chat.stoat.discord.routes.unreactDiscord
import io.ktor.client.request.delete
import io.ktor.client.request.put

suspend fun react(channelId: String, messageId: String, emoji: String) {
    if (DiscordAPI.isActive) {
        DiscordHttp.reactDiscord(channelId, messageId, emoji)
    } else {
        StoatHttp.put("/channels/$channelId/messages/$messageId/reactions/$emoji".api())
    }
}

suspend fun unreact(channelId: String, messageId: String, emoji: String) {
    if (DiscordAPI.isActive) {
        DiscordHttp.unreactDiscord(channelId, messageId, emoji)
    } else {
        StoatHttp.delete("/channels/$channelId/messages/$messageId/reactions/$emoji".api())
    }
}