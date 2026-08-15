package chat.stoat.discord.routes

import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DiscordLoginRequest(
    val login: String,
    val password: String,
    val undelete: Boolean = false,
)

@Serializable
data class DiscordLoginResponse(
    @SerialName("user_id")
    val userId: String? = null,
    val token: String? = null,
    @SerialName("login_instance_id")
    val loginInstanceId: String? = null,
    val ticket: String? = null,
    val mfa: Boolean = false,
    val totp: Boolean = false,
    val sms: Boolean = false,
    val backup: Boolean = false,
    val webauthn: String? = null,
)

@Serializable
data class DiscordMfaRequest(
    val ticket: String,
    @SerialName("login_instance_id")
    val loginInstanceId: String? = null,
    val code: String,
)

@Serializable
data class DiscordMfaResponse(
    val token: String? = null,
    @SerialName("user_settings")
    val userSettings: DiscordUserSettings? = null,
)

@Serializable
data class DiscordUserSettings(
    val locale: String? = null,
    val theme: String? = null,
)

@Serializable
data class DiscordExperimentsResponse(
    val fingerprint: String? = null,
)

/** Result of a Discord login attempt. */
sealed interface DiscordLoginResult {
    val userId: String?
}

data class DiscordLoginSuccess(
    val token: String,
    val user: DiscordUser? = null,
    override val userId: String? = null,
) : DiscordLoginResult

data class DiscordLoginMfaRequired(
    val ticket: String,
    override val userId: String? = null,
    val totp: Boolean,
    val sms: Boolean,
    val backup: Boolean,
) : DiscordLoginResult

data class DiscordLoginError(
    val message: String,
    override val userId: String? = null,
) : DiscordLoginResult

/** Fetches an anonymous fingerprint, required for unauthenticated requests. */
suspend fun HttpClient.fetchFingerprint(): String? {
    return try {
        val response: HttpResponse = get("$DISCORD_API/experiments")
        val text = response.bodyAsText()
        DiscordJson.decodeFromString(DiscordExperimentsResponse.serializer(), text).fingerprint
    } catch (e: Exception) {
        null
    }
}

/**
 * Performs the first step of the Discord login flow (email/phone + password).
 * If MFA is required, returns [DiscordLoginMfaRequired] with a ticket to pass to
 * [discordVerifyMfa].
 */
suspend fun HttpClient.discordLogin(email: String, password: String): DiscordLoginResult {
    DiscordAPI.fingerprint ?: fetchFingerprint()?.also { DiscordAPI.setFingerprint(it) }

    return try {
        val response: HttpResponse = post("$DISCORD_API/auth/login") {
            contentType(ContentType.Application.Json)
            setBody(DiscordLoginRequest(login = email, password = password))
        }
        val text = response.bodyAsText()
        val login = DiscordJson.decodeFromString(DiscordLoginResponse.serializer(), text)
        when {
            login.token != null -> DiscordLoginSuccess(
                token = login.token!!,
                userId = login.userId,
            )

            login.mfa -> DiscordLoginMfaRequired(
                ticket = login.ticket ?: "",
                userId = login.userId,
                totp = login.totp,
                sms = login.sms,
                backup = login.backup,
            )

            else -> DiscordLoginError(
                message = "Login failed (no token returned)",
                userId = login.userId,
            )
        }
    } catch (e: Exception) {
        DiscordLoginError(message = e.message ?: "Login request failed")
    }
}

/**
 * Completes the MFA step. [type] is one of `totp`, `sms`, `backup` or `webauthn`.
 */
suspend fun HttpClient.discordVerifyMfa(
    ticket: String,
    code: String,
    type: String,
    loginInstanceId: String? = null,
): DiscordLoginResult {
    return try {
        val response: HttpResponse = post("$DISCORD_API/auth/mfa/$type") {
            contentType(ContentType.Application.Json)
            setBody(
                DiscordMfaRequest(
                    ticket = ticket,
                    loginInstanceId = loginInstanceId,
                    code = code,
                ),
            )
        }
        val text = response.bodyAsText()
        val mfa = DiscordJson.decodeFromString(DiscordMfaResponse.serializer(), text)
        if (mfa.token != null) {
            DiscordLoginSuccess(token = mfa.token!!)
        } else {
            DiscordLoginError(message = "MFA verification failed")
        }
    } catch (e: Exception) {
        DiscordLoginError(message = e.message ?: "MFA verification failed")
    }
}
