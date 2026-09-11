package chat.stoat.api.realtime

import android.util.Log
import chat.stoat.api.StoatAPI
import chat.stoat.api.StoatJson
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.api.realtime.frames.receivable.ChannelStartTypingFrame
import chat.stoat.api.realtime.frames.receivable.MessageDeleteFrame
import chat.stoat.api.realtime.frames.receivable.MessageUpdateFrame
import chat.stoat.core.discord.models.ClientState
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.GatewayHello
import chat.stoat.core.discord.models.GatewayIdentify
import chat.stoat.core.discord.models.GatewayPayload
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.core.discord.models.IdentifyData
import chat.stoat.core.discord.models.IdentifyProperties
import chat.stoat.core.discord.models.PresenceData
import chat.stoat.core.model.schemas.Message
import chat.stoat.discord.DISCORD_GATEWAY
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject

/**
 * The app's realtime transport: the Discord gateway websocket.
 *
 * Handles the HELLO -> IDENTIFY -> READY handshake, heartbeats and the most
 * important dispatch events (guilds, channels, messages), keeping the
 * [StoatAPI] caches up to date and pushing incoming messages through
 * [StoatAPI.wsFrameChannel] so the existing UI renders them live.
 *
 * The connection is long-lived and is launched from [StoatAPI.connectWS].
 */
object DiscordGateway {
    var socket: WebSocketSession? = null
        private set

    @Volatile
    private var lastSeq: Int? = null

    @Volatile
    private var heartbeatIntervalMs: Long = 0

    @Volatile
    private var onReadyCallback: (() -> Unit)? = null

    suspend fun connect(token: String, onReady: (() -> Unit)? = null) {
        onReadyCallback = onReady
        RealtimeSocket.updateDisconnectionState(DisconnectionState.Reconnecting)
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
                RealtimeSocket.updateDisconnectionState(DisconnectionState.Disconnected)
                // Capture the close reason so we can see WHY Discord dropped the
                // connection (e.g. 4004 auth failed, 4012 invalid api version).
                // Ktor does not surface the close frame as a Frame.Close in the
                // incoming stream, so we read it here instead.
                try {
                    val reason = closeReason.await()
                    if (reason != null) {
                        Log.w(
                            "DiscordGateway",
                            "Gateway closed by server: code=${reason.code}, message='${reason.message}'",
                        )
                        DiscordAPI.connectionError = "Gateway closed: ${reason.code} ${reason.message}"
                    } else {
                        Log.w("DiscordGateway", "Gateway closed (server provided no close reason)")
                        DiscordAPI.connectionError = "Gateway connection closed"
                    }
                } catch (e: Exception) {
                    Log.w(
                        "DiscordGateway",
                        "Gateway closed; could not read close reason: ${e.message}",
                    )
                    DiscordAPI.connectionError = "Gateway closed (${e.message})"
                }
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
                // Populate the shared caches (servers, channels, users, self)
                // so every screen renders Discord data.
                DiscordMappings.populateFromReady(ready)
                DiscordAPI.connected = true
                DiscordAPI.connectionError = null
                RealtimeSocket.updateDisconnectionState(DisconnectionState.Connected)
                onReadyCallback?.invoke()
                Log.i("DiscordGateway", "READY received for user ${ready.user?.id}")
            }

            "GUILD_CREATE" -> {
                val guild = DiscordJson.decodeFromJsonElement(
                    DiscordGuild.serializer(),
                    payload.d!!,
                )
                guild.id?.let { gid ->
                    DiscordAPI.guildCache[gid] = guild
                    // The full guild object carries channels (incl. categories),
                    // banner, roles and members -- none of which are present on
                    // the reduced guild shapes from READY or /users/@me/guilds.
                    DiscordMappings.upsertServer(gid, guild, guild.channels ?: emptyList())
                    guild.members?.forEach { m ->
                        DiscordMappings.cacheMemberUser(m)
                        DiscordMappings.adaptMember(gid, m)?.let { adapted ->
                            if (adapted.id != null) {
                                StoatAPI.members.setMember(gid, adapted)
                            }
                        }
                        if (m.user?.id == DiscordAPI.selfId) {
                            DiscordAPI.selfMembers[gid] = m
                            DiscordMappings.refilterServerChannelVisibility(gid)
                        }
                    }
                    // The full guild object also carries the guild's custom
                    // emojis; cache them so the emoji picker has them without
                    // an extra REST round-trip per guild.
                    guild.emojis?.forEach { e ->
                        e.id?.let { eid -> DiscordAPI.emojiCache[eid] = e.copy(guildId = gid) }
                    }
                }
            }

            "GUILD_DELETE" -> {
                val guild = DiscordJson.decodeFromJsonElement(
                    DiscordGuild.serializer(),
                    payload.d!!,
                )
                guild.id?.let { gid ->
                    DiscordAPI.guildCache.remove(gid)
                    StoatAPI.serverCache.remove(gid)
                }
            }

            "CHANNEL_CREATE" -> {
                val channel = DiscordJson.decodeFromJsonElement(
                    DiscordChannel.serializer(),
                    payload.d!!,
                )
                channel.id?.let { cid ->
                    DiscordAPI.channelCache[cid] = channel
                    StoatAPI.channelCache[cid] = DiscordMappings.adaptChannel(channel)
                }
            }

            "CHANNEL_DELETE" -> {
                val channel = DiscordJson.decodeFromJsonElement(
                    DiscordChannel.serializer(),
                    payload.d!!,
                )
                channel.id?.let { cid ->
                    DiscordAPI.channelCache.remove(cid)
                    DiscordAPI.dmCache.remove(cid)
                    StoatAPI.channelCache.remove(cid)
                }
            }

            "MESSAGE_CREATE" -> {
                val message = DiscordJson.decodeFromJsonElement(
                    DiscordMessage.serializer(),
                    payload.d!!,
                )
                message.id?.let { DiscordAPI.messageCache[it] = message }
                // Adapt into the app's Message model and push it through the
                // websocket frame channel so ChannelScreenViewModel's
                // listenToWsEvents renders it live.
                val adapted = DiscordMappings.adaptMessage(message) ?: return@handleDispatch
                message.author?.id?.let { aid ->
                    StoatAPI.userCache.putIfAbsent(
                        aid,
                        DiscordMappings.adaptUser(message.author) ?: return@let,
                    )
                }
                message.member?.let { DiscordMappings.cacheMemberUser(it) }
                adapted.id?.let { StoatAPI.messageCache[it] = adapted }
                StoatAPI.wsFrameChannel.tryEmit(adapted)
            }

            "MESSAGE_UPDATE" -> {
                val message = DiscordJson.decodeFromJsonElement(
                    DiscordMessage.serializer(),
                    payload.d!!,
                )
                message.id?.let { id -> DiscordAPI.messageCache[id] = message }
                val adapted = DiscordMappings.cacheMessage(message) ?: return@handleDispatch
                val messageUlid = adapted.id ?: return@handleDispatch
                val channelUlid = message.channelId?.let { DiscordMappings.ulidForRequest(it) }
                    ?: return@handleDispatch
                val data = StoatJson.encodeToJsonElement(Message.serializer(), adapted)
                    as? JsonObject ?: return@handleDispatch
                StoatAPI.wsFrameChannel.tryEmit(
                    MessageUpdateFrame(
                        id = messageUlid,
                        channel = channelUlid,
                        data = data,
                    )
                )
            }

            "MESSAGE_DELETE" -> {
                val deleted = DiscordJson.decodeFromJsonElement(
                    MessageDeletePayload.serializer(),
                    payload.d!!,
                )
                val snowflake = deleted.id ?: return@handleDispatch
                val messageUlid = DiscordMappings.ulidForRequest(snowflake)
                    ?: return@handleDispatch
                val channelUlid = deleted.channelId?.let { DiscordMappings.ulidForRequest(it) }
                    ?: return@handleDispatch
                DiscordAPI.messageCache.remove(snowflake)
                StoatAPI.messageCache.remove(messageUlid)
                StoatAPI.wsFrameChannel.tryEmit(
                    MessageDeleteFrame(id = messageUlid, channel = channelUlid)
                )
            }

            "TYPING_START" -> {
                val typing = DiscordJson.decodeFromJsonElement(
                    TypingStartPayload.serializer(),
                    payload.d!!,
                )
                val channelUlid = typing.channelId?.let { DiscordMappings.ulidForRequest(it) }
                    ?: return@handleDispatch
                val userUlid = typing.userId?.let { DiscordMappings.ulidForRequest(it) }
                    ?: return@handleDispatch
                StoatAPI.wsFrameChannel.tryEmit(
                    ChannelStartTypingFrame(id = channelUlid, user = userUlid)
                )
            }

            else -> {
                Log.d("DiscordGateway", "Unhandled dispatch: ${payload.t}")
            }
        }
    }

    private suspend fun WebSocketSession.sendIdentify(token: String) {
        // Mirror the official user client's identify presence exactly: empty
        // activity list, status "unknown", since 0. A non-standard presence (a
        // custom-activity type:4, or status "online") can make Discord drop the
        // connection immediately after HELLO.
        val identify = GatewayIdentify(
            d = IdentifyData(
                token = token,
                properties = IdentifyProperties(device = android.os.Build.MODEL),
                compress = false,
                capabilities = 16381,
                presence = PresenceData(
                    status = "unknown",
                    since = 0,
                    activities = emptyList(),
                    afk = false,
                ),
                clientState = ClientState(
                    guildVersions = emptyMap(),
                    apiCodeVersion = 0,
                ),
            ),
        )
        val json = DiscordJson.encodeToString(GatewayIdentify.serializer(), identify)
        Log.i("DiscordGateway", "Sent IDENTIFY")
        send(json)
    }

    /**
     * Sends a gateway PRESENCE_UPDATE (opcode 3) to change the current user's
     * activity status (online / idle / dnd / invisible) and optional custom
     * status text. User-account status is gateway-driven, not a REST PATCH.
     */
    suspend fun updatePresence(discordStatus: String, customStatusText: String? = null) {
        val socket = socket ?: run {
            Log.w("DiscordGateway", "updatePresence: no active gateway socket")
            return
        }
        val activitiesJson = if (customStatusText.isNullOrBlank()) {
            JsonArray(emptyList())
        } else {
            buildJsonArray {
                add(
                    buildJsonObject {
                        put("type", 4)
                        put("state", customStatusText)
                        put("name", "Custom Status")
                    },
                )
            }
        }
        val payload = buildJsonObject {
            put("op", 3)
            putJsonObject("d") {
                put("status", discordStatus)
                put("since", 0)
                put("activities", activitiesJson)
                put("afk", false)
            }
        }
        try {
            socket.send(DiscordJson.encodeToString(JsonObject.serializer(), payload))
            Log.i("DiscordGateway", "Sent PRESENCE_UPDATE status=$discordStatus")
        } catch (e: Exception) {
            Log.e("DiscordGateway", "Failed to send PRESENCE_UPDATE", e)
        }
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

@Serializable
private data class MessageDeletePayload(
    val id: String? = null,
    @SerialName("channel_id") val channelId: String? = null,
)

@Serializable
private data class TypingStartPayload(
    @SerialName("channel_id") val channelId: String? = null,
    @SerialName("user_id") val userId: String? = null,
)
