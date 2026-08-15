package chat.stoat.discord.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.fetchChannelMessages
import chat.stoat.discord.routes.sendMessage
import kotlinx.coroutines.launch

@Composable
fun DiscordChannelScreen(navController: NavController, channelId: String) {
    var messages by remember { mutableStateOf(emptyList<DiscordMessage>()) }
    var draft by remember { mutableStateOf("") }
    var loading by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(channelId) {
        scope.launch {
            loading = true
            error = null
            try {
                messages = DiscordHttp.fetchChannelMessages(channelId)
                messages.forEach { m -> m.id?.let { DiscordAPI.messageCache[it] = m } }
            } catch (e: Exception) {
                error = e.message
            } finally {
                loading = false
            }
        }
    }

    Column(Modifier.fillMaxSize()) {
        if (loading) LinearProgressIndicator(Modifier.fillMaxWidth())
        if (error != null) {
            Text(
                error!!,
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(8.dp),
            )
        }

        LazyColumn(
            modifier = Modifier.weight(1f).fillMaxWidth().padding(8.dp),
            reverseLayout = true,
        ) {
            items(messages, key = { it.id ?: it.hashCode().toString() }) { msg ->
                MessageRow(msg)
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OutlinedTextField(
                value = draft,
                onValueChange = { draft = it },
                modifier = Modifier.weight(1f),
                placeholder = { Text("Message") },
                singleLine = true,
            )
            Spacer(Modifier.width(8.dp))
            Button(
                onClick = {
                    scope.launch {
                        val sent = DiscordHttp.sendMessage(channelId, draft)
                        if (sent != null) {
                            messages = listOf(sent) + messages
                            draft = ""
                        }
                    }
                },
                enabled = draft.isNotBlank(),
            ) {
                Text("Send")
            }
        }
    }
}

@Composable
private fun MessageRow(msg: DiscordMessage) {
    Column(Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(
            msg.author?.displayName() ?: "Unknown",
            style = MaterialTheme.typography.labelMedium,
        )
        Text(msg.content ?: "", style = MaterialTheme.typography.bodyMedium)
    }
}
