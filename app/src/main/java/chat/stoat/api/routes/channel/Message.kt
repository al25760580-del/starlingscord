package chat.stoat.api.routes.channel

import android.util.Log
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.reactDiscord
import chat.stoat.discord.routes.unreactDiscord

suspend fun react(channelId: String, messageId: String, emoji: String) {
    Log.d("StoatReact", "react requested: channel=$channelId msg=$messageId emoji=$emoji")
    DiscordHttp.reactDiscord(channelId, messageId, emoji)
}

suspend fun unreact(channelId: String, messageId: String, emoji: String) {
    Log.d("StoatReact", "unreact requested: channel=$channelId msg=$messageId emoji=$emoji")
    DiscordHttp.unreactDiscord(channelId, messageId, emoji)
}
