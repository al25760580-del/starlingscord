package chat.stoat.discord

import android.os.Build
import android.util.Base64
import android.util.Log
import androidx.compose.runtime.mutableStateMapOf
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
    var connectionError: String? = null

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
    }
}
