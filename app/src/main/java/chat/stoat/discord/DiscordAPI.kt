package chat.stoat.discord

import android.os.Build
import android.util.Base64
import android.util.Log
import androidx.compose.runtime.mutableStateMapOf
import chat.stoat.BuildConfig
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.discord.realtime.DiscordGateway
import chat.stoat.discord.routes.fetchCurrentUser
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.ContentNegotiation
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.WebSockets
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.client.request.url
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
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
        private set
    var fingerprint: String? = null
        private set

    var selfId: String? = null
        private set

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
        val self = DiscordHttp.fetchCurrentUser()
        selfId = self?.id
        startSocketOps()
    }

    private fun startSocketOps() {
        socketJob?.cancel()
        socketJob = CoroutineScope(Dispatchers.IO).launch {
            DiscordGateway.connect(sessionToken)
        }
    }

    fun logout() {
        socketJob?.cancel()
        socketJob = null
        sessionToken = ""
        sessionId = ""
        selfId = null
        fingerprint = null
        userCache.clear()
        guildCache.clear()
        channelCache.clear()
        messageCache.clear()
        dmCache.clear()
    }
}
