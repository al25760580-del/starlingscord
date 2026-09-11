package chat.stoat.api.routes.channel

import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.reactDiscord
import chat.stoat.discord.routes.unreactDiscord

suspend fun react(channelId: String, messageId: String, emoji: String) {
    DiscordHttp.reactDiscord(channelId, messageId, emoji)
}

suspend fun unreact(channelId: String, messageId: String, emoji: String) {
    DiscordHttp.unreactDiscord(channelId, messageId, emoji)
}
