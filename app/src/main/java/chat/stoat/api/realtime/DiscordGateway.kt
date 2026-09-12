package chat.stoat.api.realtime

import android.util.Log
import chat.stoat.api.StoatAPI
import chat.stoat.api.StoatJson
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.api.realtime.frames.receivable.ChannelStartTypingFrame
import chat.stoat.api.realtime.frames.receivable.MessageDeleteFrame
import chat.stoat.api.realtime.frames.receivable.MessageReactFrame
import chat.stoat.api.realtime.frames.receivable.MessageUnreactFrame
import chat.stoat.api.realtime.frames.receivable.MessageUpdateFrame
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordGuildEmoji
import chat.stoat.core.discord.models.DiscordMember
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordPresence
import chat.stoat.core.discord.models.DiscordPresenceUser
import chat.stoat.core.discord.models.DiscordReactionEmoji
import chat.stoat.core.discord.models.GatewayHello
import chat.stoat.core.discord.models.GatewayPayload
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.core.model.schemas.Message
import chat.stoat.core.model.schemas.Status
import chat.stoat.core.model.schemas.User
import chat.stoat.discord.DISCORD_GATEWAY
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import chat.stoat.discord.routes.fetchGatewayUrl
import chat.stoat.discord.routes.fetchSelfStatus
import chat.stoat.discord.routes.patchSelfSettings
import io.ktor.client.plugins.HttpTimeoutConfig
import io.ktor.client.plugins.timeout
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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.add
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
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

    /** Recommended gateway URL from GET /gateway (cached per session). */
    @Volatile
    private var cachedGatewayUrl: String? = null

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
        // Fresh connections use the URL from GET /gateway (fetched and cached
        // like the official client; a hardcoded old version such as v=9 gets
        // rejected with close code 4012, which caused an infinite reconnect
        // loop and zero live events).
        val gatewayUrl = if (canResume && resumeGatewayUrl != null) {
            resumeGatewayUrl!!
        } else {
            // Fresh session: drop any sequence number left over from a dead
            // session. Observed live: after a socket abort the first
            // heartbeat of the NEW session carried the old session's seq
            // ({"op":1,"d":3} before any dispatch arrived), which is a
            // protocol violation waiting to bite (heartbeats must carry the
            // current session's last seq, or null before the first event).
            lastSeq = null
            cachedGatewayUrl ?: fetchGatewayUrl()?.also { cachedGatewayUrl = it } ?: DISCORD_GATEWAY
        }
        Log.i("DiscordGateway", "Connecting to $gatewayUrl (resume=$canResume)")
        DiscordHttp.ws(
            gatewayUrl,
            {
                // The gateway is long-lived; the global 20s request timeout
                // would kill the session right after the upgrade (KTOR-3337).
                // The heartbeat loop already handles dead connections.
                timeout {
                    requestTimeoutMillis = HttpTimeoutConfig.INFINITE_TIMEOUT_MS
                }
            },
        ) {
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
                        // 1000/1001 invalidate the session outright; 4006/4007/
                        // 4009 mean the resume data is no longer valid. Clear
                        // it so the next attempt does a fresh IDENTIFY instead
                        // of looping on a dead RESUME.
                        when (reason.code.toInt()) {
                            1000, 1001, 4006, 4007, 4009 -> {
                                canResume = false
                                lastSeq = null
                                Log.w("DiscordGateway", "Session invalidated by close code; will re-identify")
                            }
                        }
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
        // Trace every dispatch so any gap between "event received" and
        // "frame emitted" is visible in logcat.
        Log.d("DiscordGateway", "Dispatch ${payload.t} (s=${payload.s})")
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
                // The account's own status isn't in READY; pull it from the
                // user-account settings endpoint so the self dot is correct.
                launch {
                    val selfStatus = fetchSelfStatus()
                    if (selfStatus != null) {
                        applyPresence(
                            DiscordPresence(
                                user = DiscordPresenceUser(id = DiscordAPI.selfId),
                                status = selfStatus,
                            ),
                            "self-settings",
                        )
                    } else {
                        Log.w("StoatPresence", "Could not fetch own status via /users/@me/settings")
                    }
                }
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
                    // Member presences (online/idle/dnd/offline); PRESENCE_UPDATE
                    // keeps them current afterwards. Parsed element-by-element
                    // from the raw payload so a bad/unexpected presence shape
                    // can never fail the GUILD_CREATE decode (which caches
                    // roles, members, emojis and channels).
                    var appliedPresences = 0
                    (payload.d as? JsonObject)?.get("presences")?.let { presencesEl ->
                        if (presencesEl is JsonArray) {
                            presencesEl.forEach { el ->
                                val presence = runCatching {
                                    DiscordJson.decodeFromJsonElement(
                                        DiscordPresence.serializer(),
                                        el,
                                    )
                                }.onFailure {
                                    Log.w("StoatPresence", "bad presence entry: ${it.message}")
                                }.getOrNull()
                                if (presence != null) {
                                    applyPresence(presence, "GUILD_CREATE")
                                    appliedPresences++
                                }
                            }
                        }
                    }
                    Log.i(
                        "DiscordGateway",
                        "GUILD_CREATE $gid: ${guild.members?.size ?: 0} members, " +
                            "$appliedPresences presences, " +
                            "${guild.roles?.size ?: 0} roles, ${guild.emojis?.size ?: 0} emojis",
                    )
                    // Subscribe to the guild (typing + activities + presence
                    // stream + the first 100 member-list slots). The current
                    // protocol uses opcode 37 GUILD_SUBSCRIPTIONS_BULK (what
                    // the official client sends); the old op 14 "lazy request"
                    // no longer decodes server-side and gets the connection
                    // closed with 4002.
                    guild.channels
                        ?.firstOrNull { DiscordMappings.isListableChannel(it.type) }
                        ?.id?.let { firstChannelId -> sendGuildSubscription(gid, firstChannelId) }
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
                // Cache the member (with its roles) so chat usernames pick up
                // role colours without visiting the profile screen first.
                message.member?.let { member ->
                    DiscordMappings.cacheMemberUser(member)
                    val gid = message.channelId?.let { StoatAPI.channelCache[it]?.server }
                    if (gid != null) {
                        DiscordMappings.adaptMember(gid, member)?.let { adapted ->
                            if (adapted.id != null) {
                                StoatAPI.members.setMember(gid, adapted)
                            }
                        }
                    } else {
                        Log.d(
                            "StoatRoles",
                            "MESSAGE_CREATE member without resolvable guild (channel=${message.channelId})",
                        )
                    }
                }
                adapted.id?.let { StoatAPI.messageCache[it] = adapted }
                val emitted = StoatAPI.wsFrameChannel.tryEmit(adapted)
                Log.d(
                    "DiscordGateway",
                    "MESSAGE_CREATE id=${message.id} channel=${message.channelId} " +
                        "author=${message.author?.id} ulid=${adapted.id} emitted=$emitted",
                )
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
                val emitted = StoatAPI.wsFrameChannel.tryEmit(
                    MessageDeleteFrame(id = messageUlid, channel = channelId)
                )
                Log.i(
                    "DiscordGateway",
                    "MESSAGE_DELETE id=$snowflake channel=$channelId ulid=$messageUlid emitted=$emitted",
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
                val emitted = StoatAPI.wsFrameChannel.tryEmit(
                    ChannelStartTypingFrame(id = channelId, user = userId)
                )
                Log.d("StoatTyping", "user=$userId channel=$channelId emitted=$emitted")
            }

            "MESSAGE_REACTION_ADD", "MESSAGE_REACTION_REMOVE", "MESSAGE_REACTION_REMOVE_ALL" -> {
                val data = DiscordJson.decodeFromJsonElement(
                    MessageReactionPayload.serializer(),
                    payload.d!!,
                )
                val channelId = data.channelId ?: return@handleDispatch
                val messageSf = data.messageId ?: return@handleDispatch
                val messageUlid = DiscordMappings.snowflakeToUlid(messageSf)
                    ?: DiscordMappings.ulidForRequest(messageSf)
                    ?: run {
                        Log.w("StoatReact", "${payload.t}: no ULID for message $messageSf")
                        return@handleDispatch
                    }
                val emoji = data.emoji ?: return@handleDispatch
                val key = emoji.id ?: emoji.name ?: run {
                    Log.w("StoatReact", "${payload.t}: emoji without id/name")
                    return@handleDispatch
                }
                // Register the emoji so chips and the react routes resolve
                // name:id + the CDN asset even for foreign-server emojis.
                val eid = emoji.id
                if (eid != null && emoji.name != null && eid !in DiscordAPI.emojiCache) {
                    // guildId=null: the emoji may belong to a foreign server;
                    // null keeps it out of the picker's server sections while
                    // chips/sheets still render it from the Discord CDN.
                    DiscordAPI.emojiCache[eid] = DiscordGuildEmoji(
                        id = eid,
                        name = emoji.name,
                        animated = emoji.animated,
                        guildId = null,
                    )
                }
                val add = payload.t == "MESSAGE_REACTION_ADD"
                val removeAll = payload.t == "MESSAGE_REACTION_REMOVE_ALL"
                val updated = updateCachedReactions(messageUlid, key, data.userId, add, removeAll)
                val frame = if (add) {
                    MessageReactFrame(
                        id = messageUlid,
                        channel_id = channelId,
                        user_id = data.userId ?: "",
                        emoji_id = key,
                    )
                } else {
                    MessageUnreactFrame(
                        id = messageUlid,
                        channel_id = channelId,
                        user_id = data.userId ?: "",
                        emoji_id = key,
                    )
                }
                val emitted = StoatAPI.wsFrameChannel.tryEmit(frame)
                Log.i(
                    "StoatReact",
                    "${payload.t} msg=$messageUlid emoji=$key user=${data.userId} " +
                        "cached=${updated != null} emitted=$emitted",
                )
            }

            "PRESENCE_UPDATE" -> {
                val presence = DiscordJson.decodeFromJsonElement(
                    DiscordPresence.serializer(),
                    payload.d!!,
                )
                applyPresence(presence, "PRESENCE_UPDATE")
            }

            "SESSIONS_REPLACE" -> {
                // The account's session list (each session carries its own
                // live status). This is the ONLY event a client gets when the
                // status is changed from ANOTHER client of the same account
                // (verified live: no self PRESENCE_UPDATE is sent). Diff
                // against the previous snapshot to find which session's
                // status changed and mirror it on the self user.
                handleSessionsReplace(payload.d)
            }

            "CHANNEL_PINS_UPDATE" -> {
                Log.i("StoatPins", "CHANNEL_PINS_UPDATE ${payload.d}")
            }

            "GUILD_MEMBER_LIST_UPDATE" -> {
                // Response to op 14: the live member list. SYNC carries
                // {member, presence} pairs in bulk - exactly what role
                // colours and status dots need. Parsed item-by-item so one
                // bad entry can never fail the event.
                val d = payload.d as? JsonObject ?: return@handleDispatch
                val gid = (d["guild_id"] as? JsonPrimitive)?.content ?: return@handleDispatch
                var members = 0
                var presences = 0
                (d["ops"] as? JsonArray)?.forEach { opEl ->
                    val op = opEl as? JsonObject ?: return@forEach
                    val items = (op["items"] as? JsonArray)
                        ?: listOfNotNull(op["item"]).let { it }
                    items.forEach { itemEl ->
                        val memberWrapper = (itemEl as? JsonObject)?.get("member")
                            as? JsonObject ?: return@forEach
                        runCatching {
                            (memberWrapper["member"] as? JsonObject)?.let { memberJson ->
                                val member = DiscordJson.decodeFromJsonElement(
                                    DiscordMember.serializer(),
                                    memberJson,
                                )
                                DiscordMappings.cacheMemberUser(member)
                                DiscordMappings.adaptMember(gid, member)?.let { adapted ->
                                    if (adapted.id != null) {
                                        StoatAPI.members.setMember(gid, adapted)
                                        members++
                                    }
                                }
                                if (member.user?.id == DiscordAPI.selfId) {
                                    DiscordAPI.selfMembers[gid] = member
                                }
                            }
                            (memberWrapper["presence"] as? JsonObject)?.let { presenceJson ->
                                val presence = DiscordJson.decodeFromJsonElement(
                                    DiscordPresence.serializer(),
                                    presenceJson,
                                )
                                applyPresence(presence, "MEMBER_LIST")
                                presences++
                            }
                        }.onFailure {
                            Log.w("StoatPresence", "bad member-list entry: ${it.message}")
                        }
                    }
                }
                Log.i(
                    "StoatPresence",
                    "GUILD_MEMBER_LIST_UPDATE $gid: +$members members, +$presences presences " +
                        "(count=${(d["member_count"] as? JsonPrimitive)?.content})",
                )
            }

            "GUILD_MEMBERS_CHUNK" -> {
                // Response to op 8 (member search); also carries presences
                // when requested. Cache defensively, entry by entry.
                val d = payload.d as? JsonObject ?: return@handleDispatch
                val gid = (d["guild_id"] as? JsonPrimitive)?.content ?: return@handleDispatch
                var members = 0
                var presences = 0
                (d["members"] as? JsonArray)?.forEach { el ->
                    runCatching {
                        val member = DiscordJson.decodeFromJsonElement(
                            DiscordMember.serializer(),
                            el,
                        )
                        DiscordMappings.cacheMemberUser(member)
                        DiscordMappings.adaptMember(gid, member)?.let { adapted ->
                            if (adapted.id != null) {
                                StoatAPI.members.setMember(gid, adapted)
                                members++
                            }
                        }
                    }.onFailure {
                        Log.w("StoatPresence", "bad chunk member: ${it.message}")
                    }
                }
                (d["presences"] as? JsonArray)?.forEach { el ->
                    runCatching {
                        val presence = DiscordJson.decodeFromJsonElement(
                            DiscordPresence.serializer(),
                            el,
                        )
                        applyPresence(presence, "MEMBERS_CHUNK")
                        presences++
                    }.onFailure {
                        Log.w("StoatPresence", "bad chunk presence: ${it.message}")
                    }
                }
                Log.i(
                    "StoatPresence",
                    "GUILD_MEMBERS_CHUNK $gid: +$members members, +$presences presences " +
                        "(chunk=${(d["chunk_index"] as? JsonPrimitive)?.content}/" +
                        "${(d["chunk_count"] as? JsonPrimitive)?.content})",
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

    /**
     * Opcode 37 GUILD_SUBSCRIPTIONS_BULK: subscribes to a guild's presence
     * stream (typing/activities/threads) and, via the channels map, to member
     * list ranges - the server then sends GUILD_MEMBER_LIST_UPDATE events
     * with members + presences, and PRESENCE_UPDATEs for that guild. This is
     * the only form the official client still uses (the legacy op 14 "lazy
     * request" is gone and gets the connection killed with close code 4002).
     */
    private suspend fun WebSocketSession.sendGuildSubscription(
        guildId: String,
        channelId: String?,
    ) {
        val subscription = buildJsonObject {
            put("typing", true)
            put("threads", true)
            put("activities", true)
            put("member_updates", false)
            if (channelId != null) {
                putJsonObject("channels") {
                    putJsonArray(channelId) {
                        add(buildJsonArray {
                            add(JsonPrimitive(0))
                            add(JsonPrimitive(99))
                        })
                    }
                }
            }
        }
        val payload = buildJsonObject {
            put("op", 37)
            putJsonObject("d") {
                putJsonObject("subscriptions") {
                    put(guildId, subscription)
                }
            }
        }
        try {
            send(DiscordJson.encodeToString(JsonObject.serializer(), payload))
            Log.i(
                "StoatPresence",
                "Sent guild subscription (op 37) for $guildId (member list via $channelId)",
            )
        } catch (e: Exception) {
            Log.e("StoatPresence", "Failed to send guild subscription for $guildId", e)
        }
    }

    /**
     * Previous SESSIONS_REPLACE snapshot (session_id -> status), used to tell
     * WHICH session changed presence when the account's session list is
     * broadcast (every client of the account receives it on any change).
     */
    private var lastSessionStatuses: Map<String, String>? = null

    /** Test hook: clears the SESSIONS_REPLACE diff baseline between tests. */
    fun resetSessionStatusesForTest() {
        lastSessionStatuses = null
    }

    /**
     * SESSIONS_REPLACE: d is the array of the account's sessions, each with
     * its own live status/activities. Verified live: when a status is set
     * from another client (op 3 there), this is the only event we get - so
     * without this handler cross-client status changes never showed up.
     *
     * Rule: mirror the status of the session that CHANGED (added/removed
     * sessions are ignored - a device merely connecting shouldn't flip our
     * picker); prefer a session other than ours (i.e. what the other client
     * set), falling back to our own session (the echo of our own op 3).
     */
    internal fun handleSessionsReplace(d: JsonElement?) {
        val arr = d as? JsonArray ?: return
        val current = buildMap {
            arr.forEach { el ->
                val obj = el as? JsonObject ?: return@forEach
                val sid = (obj["session_id"] as? JsonPrimitive)?.contentOrNull ?: return@forEach
                val status = (obj["status"] as? JsonPrimitive)?.contentOrNull ?: return@forEach
                put(sid, status)
            }
        }
        val previous = lastSessionStatuses
        lastSessionStatuses = current
        if (previous == null) return // first snapshot after READY: nothing to diff

        val changed = current.filter { (sid, status) ->
            when {
                // A session present in both snapshots with a different
                // status = a real status change.
                sid in previous -> previous[sid] != status
                // A newly-appeared session announcing a NON-default status
                // set it explicitly (e.g. a client connecting while
                // invisible/idle) - mirror that. Appearing as "online" is
                // just a device connecting; ignore it so it can't flip our
                // picker.
                else -> status != "online"
            }
        }
        if (changed.isEmpty()) return
        val pick = changed.keys.firstOrNull { it != DiscordAPI.sessionId }
            ?: changed.keys.firstOrNull()
            ?: return
        val status = changed[pick] ?: return
        var customText: String? = null
        arr.forEach { el ->
            val obj = el as? JsonObject ?: return@forEach
            if ((obj["session_id"] as? JsonPrimitive)?.contentOrNull == pick) {
                (obj["activities"] as? JsonArray)?.forEach { act ->
                    val actObj = act as? JsonObject ?: return@forEach
                    if ((actObj["type"] as? JsonPrimitive)?.contentOrNull == "4") {
                        customText = (actObj["state"] as? JsonPrimitive)?.contentOrNull
                    }
                }
            }
        }

        val selfId = StoatAPI.selfId ?: return
        val base = StoatAPI.userCache[selfId] ?: User(id = selfId)
        StoatAPI.userCache[selfId] = base.copy(
            online = status == "online" || status == "idle" || status == "dnd",
            status = Status(
                text = customText ?: base.status?.text,
                presence = when (status) {
                    "online" -> "Online"
                    "idle" -> "Idle"
                    "dnd" -> "Busy"
                    else -> null // invisible / offline
                },
            ),
        )
        Log.i(
            "StoatPresence",
            "[SESSIONS_REPLACE] session=${pick.take(12)} changed -> $status " +
                "(mine=${pick == DiscordAPI.sessionId})",
        )
    }

    /** Map a Discord presence onto the app's user cache (status dot + custom text). */
    private fun applyPresence(p: DiscordPresence, source: String) {        val uid = p.user?.id ?: return
        val online = p.status == "online" || p.status == "idle" || p.status == "dnd"
        val mapped = when (p.status) {
            "online" -> "Online"
            "idle" -> "Idle"
            "dnd" -> "Busy"
            else -> null // offline / invisible
        }
        val customText = p.activities?.firstOrNull { it.type == 4 }?.state
        val base = StoatAPI.userCache[uid] ?: User(id = uid)
        StoatAPI.userCache[uid] = base.copy(
            online = online,
            status = Status(text = customText, presence = mapped),
        )
        Log.i(
            "StoatPresence",
            "[$source] user=$uid discord=${p.status} -> $mapped (online=$online)",
        )
    }

    /**
     * Apply a reaction change to the cached adapted message, keeping the chip
     * count in sync: real user ids replace ghost placeholders as
     * MESSAGE_REACTION_ADD events arrive. Returns the updated message, or
     * null when it wasn't cached (nothing to update in the UI either).
     */
    private fun updateCachedReactions(
        messageUlid: String,
        emojiKey: String,
        userId: String?,
        add: Boolean,
        removeAll: Boolean,
    ): Message? {
        val msg = StoatAPI.messageCache[messageUlid]
            ?: run {
                Log.d("StoatReact", "reaction event for uncached message $messageUlid")
                return null
            }
        val map = msg.reactions?.toMutableMap() ?: mutableMapOf()
        when {
            removeAll -> map.remove(emojiKey)

            add -> {
                val list = (map[emojiKey] ?: emptyList()).toMutableList()
                if (userId == null || userId in list) {
                    // nothing to do
                } else {
                    val ghostIndex = list.indexOfFirst {
                        it.startsWith(DiscordMappings.REACTION_GHOST_PREFIX)
                    }
                    when {
                        ghostIndex >= 0 -> list[ghostIndex] = userId
                        else -> list.add(userId)
                    }
                }
                map[emojiKey] = list
            }

            else -> {
                val list = (map[emojiKey] ?: emptyList()).toMutableList()
                var removed = false
                if (userId != null) {
                    removed = list.remove(userId)
                }
                if (!removed) {
                    val ghostIndex = list.indexOfFirst {
                        it.startsWith(DiscordMappings.REACTION_GHOST_PREFIX)
                    }
                    if (ghostIndex >= 0) {
                        list.removeAt(ghostIndex)
                        removed = true
                    }
                }
                if (!removed) return msg
                if (list.isEmpty()) map.remove(emojiKey) else map[emojiKey] = list
            }
        }
        val updated = msg.copy(reactions = map)
        StoatAPI.messageCache[messageUlid] = updated
        return updated
    }

/**
 * Builds the opcode 2 IDENTIFY frame field by field, deliberately bypassing
 * the @Serializable models. Reason (found the hard way, live-tested with a
 * real session): DiscordJson runs with kotlinx defaults, which OMIT any
 * property equal to its default value (encodeDefaults=false) - the same bug
 * class that broke heartbeats. On the identify that silently dropped:
 *
 *  - "capabilities" (=16381) and "compress" (=false) -> with them missing the
 *    gateway serves a degraded session: READY arrives but NO GUILD_CREATE is
 *    ever dispatched, so guild subscriptions (op 37) are never sent and
 *    member lists / lazy presences never arrive. With
 *    capabilities=1734653 (current official web client value) GUILD_CREATE,
 *    PASSIVE_UPDATE_V2, THREAD_LIST_SYNC etc. flow normally.
 *  - "$os"/"$browser" (defaults "Android"/"Discord Android") -> the official
 *    client always sends the full properties object.
 *
 * Verified live (60s windows, same token): capabilities omitted -> 0
 * GUILD_CREATE; 16381 -> live MESSAGE_CREATE/PRESENCE_UPDATE but still 0
 * GUILD_CREATE; 1734653 -> full event stream including GUILD_CREATE, which
 * is what triggers our op 37 subscription.
 */
internal fun buildIdentifyPayload(token: String, deviceModel: String): JsonObject =
    buildJsonObject {
        put("op", 2)
        putJsonObject("d") {
            put("token", token)
            putJsonObject("properties") {
                put("\$os", "Android")
                put("\$browser", "Discord Android")
                put("\$device", deviceModel)
            }
            putJsonObject("presence") {
                put("status", "unknown")
                put("since", 0)
                putJsonArray("activities") {}
                put("afk", false)
            }
            putJsonObject("client_state") {
                put("api_code_version", 0)
                putJsonObject("guild_versions") {}
            }
            put("compress", false)
            put("capabilities", 1734653)
        }
    }

/**
 * Replaces the raw token with "<redacted>" in a serialized payload so the
 * frame can be logged safely. No-op for a blank token.
 */
internal fun redactToken(json: String, token: String): String =
    if (token.isBlank()) json else json.replace(token, "<redacted>")

    private suspend fun WebSocketSession.sendIdentify(token: String) {
        val payload = buildIdentifyPayload(token, android.os.Build.MODEL)
        val json = DiscordJson.encodeToString(JsonObject.serializer(), payload)
        // Diagnostic trail with the token REDACTED - the raw identify frame
        // must never land in logcat (the shape is what matters: presence of
        // capabilities/compress etc., see buildIdentifyPayload).
        Log.i("DiscordGateway", "Sent IDENTIFY: ${redactToken(json, token)}")
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
        // Reflect the change locally right away (the REST self-refresh in
        // patchSelf carries no presence, and the server only broadcasts
        // SESSIONS_REPLACE - no self PRESENCE_UPDATE), so the status picker
        // shows what was just picked instead of falling back to "invisible".
        val selfId = StoatAPI.selfId
        if (selfId != null) {
            val base = StoatAPI.userCache[selfId] ?: User(id = selfId)
            StoatAPI.userCache[selfId] = base.copy(
                online = discordStatus == "online" || discordStatus == "idle" || discordStatus == "dnd",
                status = Status(
                    text = customStatusText ?: base.status?.text,
                    presence = when (discordStatus) {
                        "online" -> "Online"
                        "idle" -> "Idle"
                        "dnd" -> "Busy"
                        else -> null // invisible / offline
                    },
                ),
            )
            Log.i("StoatPresence", "Local self presence set to $discordStatus")
        }
        // User accounts persist status via PATCH /users/@me/settings (what
        // the official client does); the gateway op 3 only affects the live
        // session.
        patchSelfSettings(discordStatus, customStatusText)
    }

    private suspend fun WebSocketSession.sendHeartbeat() {
        // The gateway REQUIRES the "d" field on every heartbeat: null before
        // the first dispatch event, the last sequence number afterwards.
        // kotlinx's explicitNulls=false makes a null/default property get
        // OMITTED entirely, so the first heartbeat went out as {"op":1} and
        // the server killed the connection with close code 4002 "Error while
        // decoding payload" - right after HELLO, before READY, which is why
        // no live events ever arrived (and why the op 14 -> op 37 change
        // did not fix the banner: the subscription was never even sent).
        // JsonNull is a non-null JsonElement, so "d":null is serialized
        // explicitly. Verified against the live gateway: {"op":1} -> 4002,
        // {"op":1,"d":null} -> heartbeat ACK.
        val json = DiscordJson.encodeToString(
            GatewayPayload.serializer(),
            GatewayPayload(op = 1, d = lastSeq?.let { JsonPrimitive(it) } ?: JsonNull),
        )
        Log.d("DiscordGateway", "Heartbeat frame: $json")
        send(json)
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
private data class MessageReactionPayload(
    @SerialName("user_id") val userId: String? = null,
    @SerialName("channel_id") val channelId: String? = null,
    @SerialName("message_id") val messageId: String? = null,
    val emoji: DiscordReactionEmoji? = null,
)

@Serializable
private data class TypingStartPayload(
    @SerialName("channel_id") val channelId: String? = null,
    @SerialName("user_id") val userId: String? = null,
)
