package chat.stoat.api

import android.util.Log
import androidx.compose.runtime.mutableStateMapOf
import chat.stoat.BuildConfig
import chat.stoat.StoatApplication
import chat.stoat.api.internals.ActiveSlowmode
import chat.stoat.api.internals.Members
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.api.realtime.DiscordGateway
import chat.stoat.api.realtime.DisconnectionState
import chat.stoat.api.realtime.RealtimeSocket
import chat.stoat.api.realtime.RealtimeSocketFrames
import chat.stoat.api.routes.user.fetchSelf
import chat.stoat.api.unreads.Unreads
import chat.stoat.core.model.schemas.ChannelType
import chat.stoat.core.model.schemas.Emoji
import chat.stoat.core.model.schemas.Message
import chat.stoat.core.model.schemas.Server
import chat.stoat.core.model.schemas.User
import chat.stoat.core.model.util.ChannelVoiceState
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.persistence.Database
import chat.stoat.persistence.SqlStorage
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.chuckerteam.chucker.api.RetentionManager
import io.ktor.client.request.header
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.sentry.Sentry
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.json.Json
import logcat.LogPriority
import logcat.asLog
import logcat.logcat
import kotlin.time.Duration.Companion.seconds
import chat.stoat.core.model.schemas.Channel as ChannelSchema

fun buildUserAgent(accessMethod: String = "Ktor"): String {
    return "$accessMethod StoatForAndroid/${BuildConfig.VERSION_NAME} " +
            "${BuildConfig.APPLICATION_ID} Android/${android.os.Build.VERSION.SDK_INT} " +
            "(${android.os.Build.MANUFACTURER} ${android.os.Build.DEVICE}) Kotlin/${KotlinVersion.CURRENT}"
}

@OptIn(ExperimentalSerializationApi::class)
val StoatJson = Json {
    ignoreUnknownKeys = true
    explicitNulls = false
}

@OptIn(ExperimentalSerializationApi::class)
val StoatCbor = Cbor {
    ignoreUnknownKeys = true
}

object StoatAPI {
    const val TOKEN_HEADER_NAME = "Authorization"
    private const val WS_EVENT_BUFFER_CAPACITY =
        128 // arbitrary -- should be adjusted if too much gets dropped...
    private val INITIAL_RECONNECT_DELAY = 1.seconds
    private val MAX_RECONNECT_DELAY = 30.seconds

    val userCache = mutableStateMapOf<String, User>()
    val serverCache = mutableStateMapOf<String, Server>()
    val channelCache = mutableStateMapOf<String, ChannelSchema>()
    val emojiCache = mutableStateMapOf<String, Emoji>()
    val messageCache = mutableStateMapOf<String, Message>()
    val voiceStateCache = mutableStateMapOf<String, ChannelVoiceState>()
    val userSlowmodeCache = mutableStateMapOf<String, ActiveSlowmode>()

    val members = Members()

    val unreads = Unreads()

    var selfId: String? = null

    var sessionToken: String = ""
        private set
    var sessionId: String = ""
        private set

    @OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
    val realtimeContext = newSingleThreadContext("RealtimeContext")
    val wsFrameChannel = MutableSharedFlow<Any>(
        replay = 0,
        extraBufferCapacity = WS_EVENT_BUFFER_CAPACITY,
    )

    private var socketCoroutine: Job? = null

    fun setSessionHeader(token: String) {
        sessionToken = token
        DiscordAPI.setSessionToken(token)
    }

    fun setSessionId(id: String) {
        sessionId = id
    }

    suspend fun loginAs(token: String) {
        setSessionHeader(token)
        fetchSelf()
        DiscordMappings.populateFromRest()
        startSocketOps()
        unreads.sync()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    suspend fun connectWS() {
        socketCoroutine?.cancelAndJoin()
        RealtimeSocket.updateDisconnectionState(DisconnectionState.Reconnecting)
        val token = sessionToken
        socketCoroutine = CoroutineScope(Dispatchers.IO).launch {
            var reconnectDelay = INITIAL_RECONNECT_DELAY
            var firstConnection = true
            while (isActive && sessionToken == token) {
                try {
                    withContext(realtimeContext) {
                        DiscordGateway.connect(token) {
                            // After a drop, tell listeners to resync (e.g. reload
                            // the latest messages in the open channel).
                            if (!firstConnection) {
                                wsFrameChannel.tryEmit(RealtimeSocketFrames.Reconnected)
                            }
                            firstConnection = false
                        }
                    }
                    reconnectDelay = INITIAL_RECONNECT_DELAY
                } catch (e: CancellationException) {
                    throw e
                } catch (e: Exception) {
                    logcat(LogPriority.ERROR) { "Gateway error:\n${e.asLog()}" }
                }

                if (!isActive || sessionToken != token) break

                try {
                    RealtimeSocket.updateDisconnectionState(DisconnectionState.Reconnecting)
                    delay(reconnectDelay)
                    reconnectDelay =
                        (reconnectDelay * 2).coerceAtMost(MAX_RECONNECT_DELAY)
                } catch (e: CancellationException) {
                    throw e
                } catch (e: Exception) {
                    RealtimeSocket.updateDisconnectionState(DisconnectionState.Disconnected)
                    Sentry.captureMessage("Error in socket error handling: $e")
                }
            }
        }
    }

    private suspend fun startSocketOps() {
        connectWS()
    }

    suspend fun initialize() {
        if (sessionToken != "") {
            fetchSelf()
        }
    }

    /**
     * Returns true if the user is logged in and the current user has been fetched at least once.
     * Call [initialize] to fetch the current user first, else this will return false.
     */
    fun isLoggedIn(): Boolean {
        return selfId != null
    }

    /**
     * Clears the API client's state completely.
     */
    fun logout() {
        selfId = null
        sessionToken = ""
        sessionId = ""

        userCache.clear()
        serverCache.clear()
        channelCache.clear()
        emojiCache.clear()
        messageCache.clear()
        userSlowmodeCache.clear()

        members.clear()
        unreads.clear()

        socketCoroutine?.cancel()

        DiscordAPI.reset()

        clearPersistentCache()
    }

    /**
     * Checks if a session token is valid (against Discord's /users/@me).
     */
    suspend fun checkSessionToken(token: String): Boolean {
        return try {
            setSessionHeader(token)
            val response = DiscordHttp.get("https://discord.com/api/v9/users/@me")
            response.status.value in 200..299
        } catch (e: Exception) {
            false
        }
    }

    /**
     * Hydrate caches from a local database.
     *
     * The persistent cache is a leftover of the previous backend; Discord data
     * is always fetched fresh from REST + gateway on login, so hydration is a
     * no-op and the stale tables are cleared.
     */
    fun hydrateFromPersistentCache() {
        clearPersistentCache()
    }

    /**
     * Clear the local caching database.
     */
    private fun clearPersistentCache() {
        try {
            val db = Database(SqlStorage.driver)
            db.serverQueries.clear()
            db.channelQueries.clear()
        } catch (e: Exception) {
            Log.w("StoatAPI", "Failed to clear persistent cache", e)
        }
    }

    /**
     * Marks database as hydrated (after real data was fetched, for example).
     */
    fun closeHydration() {
        // no-op: see [hydrateFromPersistentCache]
    }
}

@Serializable
data class StoatAPIError(val type: String)

@Serializable
data class RateLimitResponse(@SerialName("retry_after") val retryAfter: Int) {
    fun toException(): HitRateLimitException {
        return HitRateLimitException(retryAfter)
    }
}

internal const val NO_RETRY_AFTER = Int.MIN_VALUE

class HitRateLimitException(retryAfter: Int = NO_RETRY_AFTER) :
    Exception(if (retryAfter == NO_RETRY_AFTER) "Hit rate limit" else "Hit rate limit, retry after ${retryAfter}ms")
