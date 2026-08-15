package chat.stoat.discord.screens

import androidx.compose.foundation.clickable
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
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.fetchDMs
import chat.stoat.discord.routes.fetchGuilds
import kotlinx.coroutines.launch

@Composable
fun DiscordHomeScreen(navController: NavController) {
    var guilds by remember { mutableStateOf(DiscordAPI.guildCache.values.toList()) }
    var dms by remember { mutableStateOf(DiscordAPI.dmCache.values.toList()) }
    var loading by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            loading = true
            error = null
            try {
                DiscordHttp.fetchGuilds().forEach { g -> g.id?.let { DiscordAPI.guildCache[it] = g } }
                DiscordHttp.fetchDMs().forEach { c -> c.id?.let { DiscordAPI.dmCache[it] = c } }
                guilds = DiscordAPI.guildCache.values.toList()
                dms = DiscordAPI.dmCache.values.toList()
            } catch (e: Exception) {
                error = e.message
            } finally {
                loading = false
            }
        }
    }

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Discord", style = MaterialTheme.typography.titleLarge)
        if (loading) LinearProgressIndicator(Modifier.fillMaxWidth())
        if (error != null) Text(error!!, color = MaterialTheme.colorScheme.error)

        LazyColumn(Modifier.fillMaxSize()) {
            if (dms.isNotEmpty()) {
                item { Text("Direct Messages", style = MaterialTheme.typography.labelMedium) }
                items(dms, key = { it.id ?: it.hashCode().toString() }) { ch ->
                    ChannelRow(ch) { ch.id?.let { id -> navController.navigate("discord/channel/$id") } }
                }
            }
            item { Text("Servers", style = MaterialTheme.typography.labelMedium) }
            items(guilds, key = { it.id ?: it.hashCode().toString() }) { g ->
                GuildRow(g) { g.id?.let { id -> navController.navigate("discord/guild/$id") } }
            }
        }
    }
}

@Composable
internal fun GuildRow(guild: DiscordGuild, onClick: () -> Unit) {
    Column(
        Modifier.fillMaxWidth().clickable(onClick = onClick).padding(vertical = 8.dp),
    ) {
        Text(guild.name ?: "Unknown Server", style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
internal fun ChannelRow(channel: DiscordChannel, onClick: () -> Unit) {
    Column(
        Modifier.fillMaxWidth().clickable(onClick = onClick).padding(vertical = 8.dp),
    ) {
        Text(channel.displayName(), style = MaterialTheme.typography.bodyLarge)
    }
}
