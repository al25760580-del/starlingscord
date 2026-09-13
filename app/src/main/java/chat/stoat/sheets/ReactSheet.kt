package chat.stoat.sheets

import android.util.Log
import androidx.compose.runtime.Composable
import chat.stoat.api.StoatAPI
import chat.stoat.composables.emoji.EmojiPicker

@Composable
fun ReactSheet(messageId: String, onSelect: (String?) -> Unit) {
    val message = StoatAPI.messageCache[messageId]

    if (message == null) {
        Log.w("ReactSheet", "message $messageId not in cache; closing picker")
        onSelect(null)
        return
    }

    // Resolve the server so its emojis aren't Nitro-gated in the picker;
    // reactions carry no Nitro restriction (the server enforces permissions
    // and the outcome is logged by the react route).
    val serverId = message.channel?.let { StoatAPI.channelCache[it]?.server }
    Log.d("ReactSheet", "reaction picker: msg=$messageId server=$serverId")

    EmojiPicker(serverId = serverId, forReaction = true) {
        onSelect(it.removeSurrounding(":"))
    }

}