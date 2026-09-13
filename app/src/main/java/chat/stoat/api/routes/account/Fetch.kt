package chat.stoat.api.routes.account

import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.fetchCurrentUser
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AccountResponse(
    @SerialName("_id") val id: String,
    val email: String,
)

@Serializable
private data class DiscordSelfResponse(
    val id: String? = null,
    val email: String? = null,
)

/** Fetches the account email via Discord's `GET /users/@me`. */
suspend fun fetchAccount(): AccountResponse {
    val user = DiscordHttp.fetchCurrentUser()
    return AccountResponse(
        id = user?.id ?: "",
        email = user?.email ?: ""
    )
}

@Serializable
data class MfaSettings(
    @SerialName("email_otp") val emailOtp: Boolean? = null,
    @SerialName("trusted_handover") val trustedHandover: Boolean? = null,
    @SerialName("email_mfa") val emailMfa: Boolean? = null,
    @SerialName("totp_mfa") val totpMfa: Boolean? = null,
    @SerialName("security_key_mfa") val securityKeyMfa: Boolean? = null,
    @SerialName("recovery_active") val recoveryActive: Boolean? = null,
)

/** Derives MFA settings from Discord's `mfa_enabled` on the self user. */
suspend fun fetchMfaSettings(): MfaSettings {
    val user = DiscordHttp.fetchCurrentUser()
    val totp = user?.mfaEnabled ?: false
    return MfaSettings(
        emailOtp = false,
        trustedHandover = false,
        emailMfa = false,
        totpMfa = totp,
        securityKeyMfa = false,
        recoveryActive = totp,
    )
}
