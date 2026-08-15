package chat.stoat.discord

import android.os.Build
import android.util.Base64
import android.util.Log
import androidx.compose.runtime.mutableStateMapOf
import chat.stoat.BuildConfig
import chat.stoat.StoatApplication
import chat.stoat.api.StoatAPI
import chat.stoat.persistence.KVStorage
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.discord.DiscordToStoat
import chat.stoat.discord.realtime.DiscordGateway
import chat.stoat.discord.routes.fetchCurrentUser
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.websocket.WebSockets
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.client.request.url
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

/** Base URL for the (unofficial) Discord user API. */
const val DISCORD_API = "https://discord.com/api/v9"

/** Gateway URL (JSON encoding, gateway protocol v10). */
const val DISCORD_GATEWAY = "wss://gateway.discord.gg/?v=10&encoding=json"

/** Authorization header name used by the Discord API. */
const val DISCORD_TOKEN_HEADER = "Authorization"

@OptIn(ExperimentalSerializationApi::class)
val DiscordJson = Json {
    ignoreUnknownKeys = true
    explicitNulls = false
}

/**
 * Encodes the standard client "super properties" that Discord expects on every
 * request. Mirrors what the official client sends (base64-encoded JSON).
 */
private fun buildSuperProperties(): String {
    val json = """{"os":"Android","browser":"Stoat","device":"Stoat","system_locale":"en-US","release_channel":"googleplay","client_version":"${BuildConfig.VERSION_NAME}","os_version":"${Build.VERSION.RELEASE}","os_arch":"arm","app_arch":"arm","platform":"Android"}"""
    return Base64.encodeToString(json.toByteArray(Charsets.UTF_8), Base64.NO_WRAP)
}

/**
 * Ktor HTTP client for Discord, mirroring the structure of [chat.stoat.api.StoatHttp].
 *
 * The [DISCORD_TOKEN_HEADER] and [chat.stoat.discord.DiscordAPI.fingerprint] headers are
 * injected on every request via an OkHttp interceptor, in the same way StoatAPI
 * injects its session token.
 */
val DiscordHttp = HttpClient(OkHttp) {
    install(DefaultRequest)
    install(ContentNegotiation) { json(DiscordJson) }
    install(WebSockets)
    install(HttpRequestRetry) {
        retryOnServerErrors(maxRetries = 3)
        exponentialDelay()
    }
    install(Logging) { level = LogLevel.INFO }

    engine {
        addInterceptor { chain ->
            val request = with(chain.request().newBuilder()) {
                header("User-Agent", "StoatForAndroid/${BuildConfig.VERSION_NAME} Discord")
                header("X-Super-Properties", buildSuperProperties())
                DiscordAPI.fingerprint?.let { header("X-Fingerprint", it) }
                if (DiscordAPI.sessionToken.isNotBlank()) {
                    header(DISCORD_TOKEN_HEADER, DiscordAPI.sessionToken)
                }
                build()
            }
            chain.proceed(request)
        }
    }

    defaultRequest {
        url(DISCORD_API)
    }
}

/**
 * Singleton holding the Discord session state, in-memory caches and entry points,
 * mirroring [chat.stoat.api.StoatAPI].
 */
object DiscordAPI {
    var sessionToken: String = ""
        private set
    var sessionId: String = ""
        internal set
    var fingerprint: String? = null
        private set

    var selfId: String? = null
        internal set

    /** When true, Discord is the active backend feeding [StoatAPI] (full_backend mode). */
    var isActive = false

    /** True once the gateway READY has been received and we are live. */
    var connected = false

    /** Last connection error, surfaced for diagnostics / UI. */
    var connectionError: String? = null

    /**
     * Maps a Revolt-shaped ULID (used as [chat.stoat.core.model.schemas.Message].id)
     * back to the original Discord snowflake, so actions that need the real id
     * (delete / edit / react) can be round-tripped.
     */
    val idMap = mutableMapOf<String, String>()

    private var socketJob: Job? = null

    val userCache = mutableStateMapOf<String, DiscordUser>()
    val guildCache = mutableStateMapOf<String, DiscordGuild>()
    val channelCache = mutableStateMapOf<String, DiscordChannel>()
    val messageCache = mutableStateMapOf<String, DiscordMessage>()
    val dmCache = mutableStateMapOf<String, DiscordChannel>()

    fun setSessionToken(token: String) {
        sessionToken = token
    }

    fun setFingerprint(fp: String) {
        fingerprint = fp
    }

    fun isLoggedIn(): Boolean = selfId != null

    /** Completes login using an already-acquired token, then opens the gateway. */
    suspend fun loginAs(token: String) {
        setSessionToken(token)

        // Persist so a cold start can boot straight into Discord (full_backend mode).
        runCatching { KVStorage(StoatApplication.instance).set("auth_backend", "discord") }
        runCatching { KVStorage(StoatApplication.instance).set("discord_session_token", token) }

        // Reset any stale Revolt session state so Discord owns the UI caches.
        StoatAPI.userCache.clear()
        StoatAPI.serverCache.clear()
        StoatAPI.channelCache.clear()
        StoatAPI.messageCache.clear()
        StoatAPI.emojiCache.clear()
        StoatAPI.voiceStateCache.clear()
        StoatAPI.userSlowmodeCache.clear()
        StoatAPI.members.clear()
        StoatAPI.selfId = null

        val self = DiscordHttp.fetchCurrentUser()
        selfId = self?.id
        // Set synchronously so Stoat's chat screen (which treats a null selfId as
        // "logged out") does not bounce back to the login route before the
        // gateway READY event arrives.
        StoatAPI.selfId = self?.id
        self?.let { s -> s.id?.let { id -> DiscordToStoat.adaptUser(s)?.let { u -> StoatAPI.userCache[id] = u } } }
        isActive = true
        // Seed servers / DMs / channels from REST immediately so the home screen
        // is populated even before (or without) the gateway delivering READY.
        DiscordToStoat.populateFromRest()
        startSocketOps()
    }

    private fun startSocketOps() {
        socketJob?.cancel()
        socketJob = CoroutineScope(Dispatchers.IO).launch {
            var reconnectDelay = 1000L
            while (isActive) {
                try {
                    DiscordGateway.connect(sessionToken)
                    Log.i("DiscordAPI", "Gateway connection closed; reconnecting if still active")
                } catch (e: CancellationException) {
                    throw e
                } catch (e: Exception) {
                    connectionError = e.message ?: e.javaClass.simpleName
                    Log.e("DiscordAPI", "Gateway error: $connectionError", e)
                }
                if (!isActive) break
                delay(reconnectDelay)
                reconnectDelay = (reconnectDelay * 2).coerceAtMost(30_000)
            }
        }
    }

    fun logout() {
        socketJob?.cancel()
        socketJob = null
        // Clear the persisted Discord session so a cold start does not retry Discord.
        runCatching { KVStorage(StoatApplication.instance).remove("auth_backend") }
        runCatching { KVStorage(StoatApplication.instance).remove("discord_session_token") }
        sessionToken = ""
        sessionId = ""
        selfId = null
        fingerprint = null
        isActive = false
        connected = false
        connectionError = null
        idMap.clear()
        userCache.clear()
        guildCache.clear()
        channelCache.clear()
        messageCache.clear()
        dmCache.clear()
        // Clear the Stoat UI caches we populated so the UI returns to a clean state.
        StoatAPI.userCache.clear()
        StoatAPI.serverCache.clear()
        StoatAPI.channelCache.clear()
        StoatAPI.messageCache.clear()
        StoatAPI.members.clear()
        StoatAPI.selfId = null
    }
}
