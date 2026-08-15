package chat.stoat.discord.realtime

import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.core.discord.models.GatewayHello
import chat.stoat.core.discord.models.GatewayIdentify
import chat.stoat.core.discord.models.GatewayPayload
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.core.discord.models.IdentifyData
import chat.stoat.core.discord.models.IdentifyProperties
import chat.stoat.core.discord.models.PresenceData
import chat.stoat.core.discord.models.ClientState
import chat.stoat.api.StoatAPI
import chat.stoat.discord.DISCORD_GATEWAY
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordToStoat
import io.ktor.client.plugins.websocket.ws
import io.ktor.websocket.CloseReason
import io.ktor.websocket.Frame
import io.ktor.websocket.WebSocketSession
import io.ktor.websocket.close
import io.ktor.websocket.readText
import io.ktor.websocket.send
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.serialization.json.JsonPrimitive
import android.util.Log

/**
 * Discord gateway client, mirroring [chat.stoat.api.realtime.RealtimeSocket].
 *
 * Handles the HELLO -> IDENTIFY -> READY handshake, heartbeats and a handful of
 * the most important dispatch events (guilds, channels, messages). The connection
 * is long-lived and is launched from [chat.stoat.discord.DiscordAPI.startSocketOps].
 */
object DiscordGateway {
    var socket: WebSocketSession? = null
        private set

    @Volatile
    private var lastSeq: Int? = null

    @Volatile
    private var heartbeatIntervalMs: Long = 0

    suspend fun connect(token: String) {
        DiscordHttp.ws(DISCORD_GATEWAY) {
            socket = this
            var heartbeatJob: Job? = null
            try {
                for (frame in incoming) {
                    if (frame is Frame.Close) {
                        Log.w("DiscordGateway", "Gateway closed by server (close frame received)")
                        break
                    }
                    if (frame !is Frame.Text) continue
                    val text = frame.readText()
                    val payload = try {
                        DiscordJson.decodeFromString(GatewayPayload.serializer(), text)
                    } catch (e: Exception) {
                        continue
                    }

                    when (payload.op) {
                        10 -> { // HELLO
                            val hello = DiscordJson.decodeFromJsonElement(
                                GatewayHello.serializer(),
                                payload.d!!,
                            )
                            heartbeatIntervalMs = hello.heartbeatInterval
                            if (heartbeatJob == null) {
                                heartbeatJob = launch { heartbeatLoop() }
                            }
                            sendIdentify(token)
                        }

                        11 -> {
                            // Heartbeat ACK - nothing to do.
                        }

                        0 -> { // DISPATCH
                            lastSeq = payload.s
                            handleDispatch(payload)
                        }

                        7 -> { // RECONNECT
                            close(CloseReason(CloseReason.Codes.NORMAL, "Reconnect requested"))
                        }

                        9 -> { // INVALID SESSION
                            lastSeq = null
                            sendIdentify(token)
                        }
                    }
                }
            } finally {
                heartbeatJob?.cancel()
                socket = null
                DiscordAPI.connected = false
            }
        }
    }

    private suspend fun WebSocketSession.handleDispatch(payload: GatewayPayload) {
        when (payload.t) {
            "READY" -> {
                val ready = DiscordJson.decodeFromJsonElement(
                    GatewayReady.serializer(),
                    payload.d!!,
                )
                DiscordAPI.selfId = ready.user?.id
                DiscordAPI.sessionId = ready.sessionId ?: ""
                ready.user?.let { u -> u.id?.let { DiscordAPI.userCache[it] = u } }
                ready.guilds?.forEach { g -> g.id?.let { DiscordAPI.guildCache[it] = g } }
                ready.privateChannels?.forEach { c -> c.id?.let { DiscordAPI.dmCache[it] = c } }
                // Feed Stoat's existing UI caches (servers, channels, users, self)
                // so every screen renders Discord data.
                DiscordToStoat.populateFromReady(ready)
                DiscordAPI.connected = true
                DiscordAPI.connectionError = null
                Log.i("DiscordGateway", "READY received for user ${ready.user?.id}")
            }

            "GUILD_CREATE" -> {
                val guild = DiscordJson.decodeFromJsonElement(
                    DiscordGuild.serializer(),
                    payload.d!!,
                )
                guild.id?.let { gid ->
                    DiscordAPI.guildCache[gid] = guild
                    // The full guild object carries channels, description and
                    // banner -- none of which are present on the reduced guild
                    // shapes from READY or /users/@me/guilds.
                    val channelIds = guild.channels?.mapNotNull { it.id } ?: emptyList()
                    guild.channels?.forEach { ch ->
                        ch.id?.let { cid ->
                            StoatAPI.channelCache[cid] = DiscordToStoat.adaptChannel(ch)
                        }
                    }
                    StoatAPI.serverCache[gid] = DiscordToStoat.adaptServer(guild, channelIds)
                }
            }

            "GUILD_DELETE" -> {
                val guild = DiscordJson.decodeFromJsonElement(
                    DiscordGuild.serializer(),
                    payload.d!!,
                )
                guild.id?.let { DiscordAPI.guildCache.remove(it) }
            }

            "CHANNEL_CREATE" -> {
                val channel = DiscordJson.decodeFromJsonElement(
                    DiscordChannel.serializer(),
                    payload.d!!,
                )
                channel.id?.let { DiscordAPI.channelCache[it] = channel }
            }

            "CHANNEL_DELETE" -> {
                val channel = DiscordJson.decodeFromJsonElement(
                    DiscordChannel.serializer(),
                    payload.d!!,
                )
                channel.id?.let { DiscordAPI.channelCache.remove(it) }
            }

            "MESSAGE_CREATE" -> {
                val message = DiscordJson.decodeFromJsonElement(
                    DiscordMessage.serializer(),
                    payload.d!!,
                )
                message.id?.let { DiscordAPI.messageCache[it] = message }
                // Adapt into a Revolt-shaped Message and push it through Stoat's
                // existing websocket frame channel so ChannelScreenViewModel's
                // listenToWsEvents renders it live, exactly like a Revolt message.
                val adapted = DiscordToStoat.adaptMessage(message) ?: return@handleDispatch
                message.author?.id?.let { aid ->
                    StoatAPI.userCache.putIfAbsent(aid, DiscordToStoat.adaptUser(message.author) ?: return@let)
                }
                adapted.id?.let { StoatAPI.messageCache[it] = adapted }
                StoatAPI.wsFrameChannel.tryEmit(adapted)
            }

            "MESSAGE_UPDATE" -> {
                val message = DiscordJson.decodeFromJsonElement(
                    DiscordMessage.serializer(),
                    payload.d!!,
                )
                message.id?.let { id -> DiscordAPI.messageCache[id] = message }
            }

            else -> {
                Log.d("DiscordGateway", "Unhandled dispatch: ${payload.t}")
            }
        }
    }

    private suspend fun WebSocketSession.sendIdentify(token: String) {
        val identify = GatewayIdentify(
            d = IdentifyData(
                token = token,
                properties = IdentifyProperties(),
                compress = false,
                capabilities = 16381,
                presence = PresenceData(),
                clientState = ClientState(),
            ),
        )
        send(DiscordJson.encodeToString(GatewayIdentify.serializer(), identify))
        Log.i("DiscordGateway", "Sent IDENTIFY")
    }

    private suspend fun WebSocketSession.heartbeatLoop() {
        while (isActive) {
            delay(heartbeatIntervalMs)
            val payload = GatewayPayload(op = 1, d = lastSeq?.let { JsonPrimitive(it) })
            try {
                send(DiscordJson.encodeToString(GatewayPayload.serializer(), payload))
            } catch (e: Exception) {
                break
            }
        }
    }
}
