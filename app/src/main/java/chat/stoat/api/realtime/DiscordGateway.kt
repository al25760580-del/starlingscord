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
import kotlinx.coroutines.CancellationException
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

    /** resume_gateway_url from READY; reconnects after a drop go here. */
    @Volatile
    private var resumeGatewayUrl: String? = null

    /** Whether the current session can be resumed (set on READY, cleared on invalid session). */
    @Volatile
    private var canResume = false

    /** Whether the last heartbeat was ACKed by the server. */
    @Volatile
    private var lastHeartbeatAcked = true

    suspend fun connect(token: String, onReady: (() -> Unit)? = null) {
        onReadyCallback = onReady
        RealtimeSocket.updateDisconnectionState(DisconnectionState.Reconnecting)
        // After a drop, resume via resume_gateway_url instead of the default
        // gateway (docs: not doing so causes disconnects at a higher rate).
        val gatewayUrl = if (canResume && resumeGatewayUrl != null) {
            resumeGatewayUrl!!
        } else {
            DISCORD_GATEWAY
        }
        DiscordHttp.ws(gatewayUrl) {
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
                            // Fresh connection: reset the ACK state so a
                            // stale "missed ACK" from a previous connection
                            // can't instantly close this one (that was the
                            // infinite reconnect loop).
                            lastHeartbeatAcked = true
                            if (heartbeatJob == null) {
                                heartbeatJob = launch { heartbeatLoop() }
                            }
                            if (canResume && !DiscordAPI.sessionId.isNullOrBlank()) {
                                sendResume(token)
                            } else {
                                sendIdentify(token)
                            }
                        }

                        1 -> { // Heartbeat request from the server: answer now.
                            sendHeartbeat()
                        }

                        11 -> { // Heartbeat ACK
                            lastHeartbeatAcked = true
                        }

                        0 -> { // DISPATCH
                            lastSeq = payload.s
                            // One bad event must never kill the connection.
                            try {
                                handleDispatch(payload)
                            } catch (e: CancellationException) {
                                throw e
                            } catch (e: Exception) {
                                Log.e(
                                    "DiscordGateway",
                                    "Failed to handle dispatch ${payload.t} (s=${payload.s})",
                                    e,
                                )
                            }
                        }

                        7 -> { // RECONNECT
                            // NOT close code 1000/1001: those invalidate the
                            // session. Keep it resumable.
                            close(CloseReason(4000.toShort(), "Reconnect requested"))
                        }

                        9 -> { // INVALID_SESSION
                            val resumable = (payload.d as? JsonPrimitive)?.content == "true"
                            if (resumable) {
                                sendResume(token)
                            } else {
                                canResume = false
                                lastSeq = null
                                // Docs: the session is dead - disconnect,
                                // wait 1-5s, reconnect with a fresh IDENTIFY.
                                // The wait runs in a child coroutine so frame
                                // processing (incl. heartbeat ACKs) isn't
                                // blocked; the outer loop does the reconnect.
                                launch {
                                    delay((1000L..5000L).random())
                                    close(CloseReason(4000.toShort(), "Invalid session"))
                                }
                            }
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
                ready.resumeGatewayUrl?.let { resumeGatewayUrl = it }
                canResume = true
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
                // Channel ids are raw snowflakes throughout the UI caches.
                val channelId = message.channelId ?: return@handleDispatch
                val data = StoatJson.encodeToJsonElement(Message.serializer(), adapted)
                    as? JsonObject ?: return@handleDispatch
                StoatAPI.wsFrameChannel.tryEmit(
                    MessageUpdateFrame(
                        id = messageUlid,
                        channel = channelId,
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
                // Deterministic ULID for the message id; channels stay snowflakes.
                val messageUlid = DiscordMappings.snowflakeToUlid(snowflake)
                    ?: DiscordMappings.ulidForRequest(snowflake)
                    ?: return@handleDispatch
                val channelId = deleted.channelId ?: return@handleDispatch
                DiscordAPI.messageCache.remove(snowflake)
                StoatAPI.messageCache.remove(messageUlid)
                StoatAPI.wsFrameChannel.tryEmit(
                    MessageDeleteFrame(id = messageUlid, channel = channelId)
                )
            }

            "TYPING_START" -> {
                val typing = DiscordJson.decodeFromJsonElement(
                    TypingStartPayload.serializer(),
                    payload.d!!,
                )
                // Channel and user ids are raw snowflakes in the UI caches.
                val channelId = typing.channelId ?: return@handleDispatch
                val userId = typing.userId ?: return@handleDispatch
                StoatAPI.wsFrameChannel.tryEmit(
                    ChannelStartTypingFrame(id = channelId, user = userId)
                )
            }

            "RESUMED" -> {
                DiscordAPI.connected = true
                DiscordAPI.connectionError = null
                RealtimeSocket.updateDisconnectionState(DisconnectionState.Connected)
                // Same treatment as READY: let the open channel resync.
                onReadyCallback?.invoke()
                Log.i("DiscordGateway", "Session resumed; missed events replayed")
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

    private suspend fun WebSocketSession.sendHeartbeat() {
        val payload = GatewayPayload(op = 1, d = lastSeq?.let { JsonPrimitive(it) })
        send(DiscordJson.encodeToString(GatewayPayload.serializer(), payload))
    }

    /**
     * Sends an Opcode 6 Resume so the server replays missed events from
     * [lastSeq] instead of starting a fresh session.
     */
    private suspend fun WebSocketSession.sendResume(token: String) {
        val body = buildJsonObject {
            put("token", token)
            put("session_id", DiscordAPI.sessionId)
            put("seq", lastSeq)
        }
        send(
            DiscordJson.encodeToString(
                JsonObject.serializer(),
                buildJsonObject {
                    put("op", 6)
                    put("d", body)
                },
            )
        )
        Log.i("DiscordGateway", "Sent RESUME (session=${DiscordAPI.sessionId}, seq=$lastSeq)")
    }

    private suspend fun WebSocketSession.heartbeatLoop() {
        // Docs: send the first heartbeat immediately after HELLO (with
        // optional jitter), then every interval; if an ACK hasn't arrived by
        // the next beat, the connection is a zombie - close (not 1000/1001!)
        // and let the outer loop reconnect.
        delay((heartbeatIntervalMs / 4L).coerceIn(0L..2000L).let { (0..it).random() })
        while (isActive) {
            if (!lastHeartbeatAcked) {
                Log.w("DiscordGateway", "No heartbeat ACK; closing zombie connection")
                close(CloseReason(4000.toShort(), "Zombie connection (no heartbeat ACK)"))
                return
            }
            try {
                lastHeartbeatAcked = false
                sendHeartbeat()
            } catch (e: Exception) {
                break
            }
            delay(heartbeatIntervalMs)
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
