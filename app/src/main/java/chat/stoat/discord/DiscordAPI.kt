package chat.stoat.discord

import android.os.Build
import android.util.Base64
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import chat.stoat.BuildConfig
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordRole
import chat.stoat.core.discord.models.DiscordMember
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordGuildEmoji
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordUser
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.websocket.WebSockets
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.client.request.url
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

/** Base URL for the (unofficial) Discord user API. */
const val DISCORD_API = "https://discord.com/api/v9"

/** Gateway URL (JSON encoding, gateway protocol v10). */
/**
 * Fallback gateway URL; the real one is fetched at runtime via
 * GET /gateway (what the official client does - the docs prescribe fetching
 * and caching the WebSocket URL instead of hardcoding it, and old versions
 * like v=9 get rejected with close code 4012).
 */
const val DISCORD_GATEWAY = "wss://gateway.discord.gg/?v=10&encoding=json"

/** Authorization header name used by the Discord API. */
const val DISCORD_TOKEN_HEADER = "Authorization"

@OptIn(ExperimentalSerializationApi::class)
val DiscordJson = Json {
    ignoreUnknownKeys = true
    explicitNulls = false
}

/**
 * Encodes the "super properties" Discord expects on every request, matching
 * the official Android client's shape
 * (https://docs.discord.food/reference#client-properties). A non-standard
 * browser/device string or a missing client_build_number is one of the
 * signals Discord uses to flag automated ("self-bot") accounts.
 */
private val clientLaunchId: String = java.util.UUID.randomUUID().toString()
private val heartbeatSessionId: String = java.util.UUID.randomUUID().toString()
private val launchSignature: String = System.nanoTime().toString()
private val deviceVendorId: String = java.util.UUID.randomUUID().toString()

private fun buildSuperProperties(): String {
    val json = """{"os":"Android","browser":"Discord Android","device":"${Build.MODEL}","system_locale":"${java.util.Locale.getDefault().toLanguageTag()}","has_client_mods":false,"client_version":"280.2 - rn","release_channel":"googleplay","device_vendor_id":"$deviceVendorId","design_id":2,"browser_user_agent":"","browser_version":"","os_version":"${Build.VERSION.SDK_INT}","client_build_number":4025,"client_event_source":null,"client_launch_id":"$clientLaunchId","launch_signature":"$launchSignature","client_heartbeat_session_id":"$heartbeatSessionId"}"""
    return Base64.encodeToString(json.toByteArray(Charsets.UTF_8), Base64.NO_WRAP)
}

/**
 * Ktor HTTP client for the Discord backend (the app's only HTTP client).
 *
 * The [DISCORD_TOKEN_HEADER] and [DiscordAPI.fingerprint] headers are
 * injected on every request via an OkHttp interceptor.
 */
val DiscordHttp = HttpClient(OkHttp) {
    install(DefaultRequest)
    install(ContentNegotiation) { json(DiscordJson) }
    install(WebSockets)
    install(HttpRequestRetry) {
        retryOnServerErrors(maxRetries = 3)
        // A timed-out request (server holding the connection - seen live on
        // freshly-flagged accounts) gets a couple of retries before failing.
        retryOnExceptionIf(maxRetries = 2) { _, cause ->
            cause is HttpRequestTimeoutException
        }
        exponentialDelay()
    }
    // Hard bound on every REST call. Without this, a request the server
    // holds forever (observed on an account right after Discord flags the
    // "new login detected" security flow) leaves the app hung on the login
    // screen with zero diagnostics - the login coroutine never returns.
    // WebSockets opt out per-request (see DiscordGateway.connect).
    install(HttpTimeout) {
        connectTimeoutMillis = 10_000
        requestTimeoutMillis = 20_000
    }
    install(Logging) { level = LogLevel.INFO }

    engine {
        addInterceptor { chain ->
            val request = with(chain.request().newBuilder()) {
                // The official Android client's User-Agent; a custom one is a
                // self-bot signal. 280202 = client_version 280.2, RNA = React
                // Native Android.
                header("User-Agent", "Discord-Android/280202;RNA")
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
 * Discord session state and backend-native caches.
 *
 * Session lifecycle lives in [chat.stoat.api.StoatAPI] (loginAs / logout);
 * realtime lives in [chat.stoat.api.realtime.DiscordGateway].
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

    /** True once the gateway READY has been received and we are live. */
    var connected = false

    /** Last connection error, surfaced for diagnostics / UI. */
    /** Last gateway close reason; surfaced in the reconnect banner so
     *  failures are visible without logcat. */
    var connectionError: String? by mutableStateOf<String?>(null)

    /**
     * Maps a UI message id (ULID derived from the snowflake timestamp) back to
     * the original Discord snowflake, so actions that need the real id
     * (delete / edit / react / reply) can be round-tripped.
     */
    val idMap = mutableMapOf<String, String>()

    val userCache = mutableStateMapOf<String, DiscordUser>()
    val guildCache = mutableStateMapOf<String, DiscordGuild>()
    val channelCache = mutableStateMapOf<String, DiscordChannel>()
    val messageCache = mutableStateMapOf<String, DiscordMessage>()
    /** Guild custom emoji, keyed by snowflake id, used to render custom emoji
     *  in messages and reactions from the Discord CDN. */
    val emojiCache = mutableStateMapOf<String, DiscordGuildEmoji>()
    val dmCache = mutableStateMapOf<String, DiscordChannel>()

    /** Guild roles by role ID (snowflakes are globally unique). */
    val roleCache = mutableStateMapOf<String, DiscordRole>()

    /** Base permissions for the logged-in user per guild (from /users/@me/guilds). */
    val guildPermissions = mutableMapOf<String, Long>()

    /** The logged-in user's own guild member object (carrying role IDs) per guild. */
    val selfMembers = mutableStateMapOf<String, DiscordMember>()

    /** The logged-in user's premium type (0 none, 1 Classic, 2 Nitro, 3 Basic). */
    var selfPremiumType: Int? = null

    fun setSessionToken(token: String) {
        sessionToken = token
    }

    fun setFingerprint(fp: String) {
        fingerprint = fp
    }

    /** Clears all session state; called from [chat.stoat.api.StoatAPI.logout]. */
    fun reset() {
        sessionToken = ""
        sessionId = ""
        selfId = null
        fingerprint = null
        connected = false
        connectionError = null
        idMap.clear()
        userCache.clear()
        guildCache.clear()
        channelCache.clear()
        messageCache.clear()
        emojiCache.clear()
        dmCache.clear()
        roleCache.clear()
        guildPermissions.clear()
        selfMembers.clear()
        selfPremiumType = null
    }
}
