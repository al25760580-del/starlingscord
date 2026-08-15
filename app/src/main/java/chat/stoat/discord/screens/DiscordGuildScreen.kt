package chat.stoat.discord.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.fetchGuildChannels
import kotlinx.coroutines.launch

@Composable
fun DiscordGuildScreen(navController: NavController, guildId: String) {
    var channels by remember { mutableStateOf(emptyList<DiscordChannel>()) }
    var loading by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(guildId) {
        scope.launch {
            loading = true
            error = null
            try {
                channels = DiscordHttp.fetchGuildChannels(guildId)
                channels.forEach { c -> c.id?.let { DiscordAPI.channelCache[it] = c } }
            } catch (e: Exception) {
                error = e.message
            } finally {
                loading = false
            }
        }
    }

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Channels", style = MaterialTheme.typography.titleLarge)
        if (loading) LinearProgressIndicator(Modifier.fillMaxWidth())
        if (error != null) Text(error!!, color = MaterialTheme.colorScheme.error)

        LazyColumn(Modifier.fillMaxSize()) {
            items(channels, key = { it.id ?: it.hashCode().toString() }) { ch ->
                ChannelRow(ch) { ch.id?.let { id -> navController.navigate("discord/channel/$id") } }
            }
        }
    }
}
