package chat.stoat.api.routes.account

import chat.stoat.api.StoatAPIError
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.DiscordLoginError
import chat.stoat.discord.routes.DiscordLoginMfaRequired
import chat.stoat.discord.routes.DiscordLoginResult
import chat.stoat.discord.routes.DiscordLoginSuccess
import chat.stoat.discord.routes.discordLogin
import chat.stoat.discord.routes.discordVerifyMfa
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor

@Serializable
data class LoginNegotiation(
    val email: String,
    val password: String,

    @SerialName("friendly_name")
    val friendlyName: String,
    val captcha: String? = null
)

@Serializable
data class LoginMfaAmendmentTotpCode(
    @SerialName("mfa_ticket")
    val mfaTicket: String,

    @SerialName("mfa_response")
    val mfaResponse: MfaResponseTotpCode,

    @SerialName("friendly_name")
    val friendlyName: String
)

@Serializable
data class LoginMfaAmendmentRecoveryCode(
    @SerialName("mfa_ticket")
    val mfaTicket: String,

    @SerialName("mfa_response")
    val mfaResponse: MfaResponseRecoveryCode,

    @SerialName("friendly_name")
    val friendlyName: String
)

/**
 * To add a new MFA method, add a variant here plus its branch in [MfaResponseSerializer]
 * then describe the UI in [chat.stoat.composables.mfa.MfaMethod].
 */
@Serializable(with = MfaResponseSerializer::class)
sealed interface MfaResponse

@Serializable
data class MfaResponsePassword(
    val password: String
) : MfaResponse

@Serializable
data class MfaResponseRecoveryCode(
    @SerialName("recovery_code")
    val recoveryCode: String
) : MfaResponse

@Serializable
data class MfaResponseTotpCode(
    @SerialName("totp_code")
    val totpCode: String
) : MfaResponse

@Serializable
data class MfaLoginSpec(
    val result: String,
    val ticket: String,

    @SerialName("allowed_methods")
    val allowedMethods: List<String>
)

@Serializable
data class MfaCheck(
    val result: String
)

@Serializable
data class WebPushData(
    val endpoint: String,

    @SerialName("p256dh")
    val p256diffieHellman: String,
    val auth: String
)

@Serializable
data class UserHints(
    val result: String,

    @SerialName("_id")
    val id: String,

    @SerialName("user_id")
    val userId: String,
    val token: String,
    val name: String,
    val subscription: WebPushData? = null
)

data class EmailPasswordAssessment(
    val proceedMfa: Boolean = false,
    val mfaSpec: MfaLoginSpec? = null,
    val firstUserHints: UserHints? = null,
    val error: StoatAPIError? = null
)

/**
 * Logs in against Discord's user API (`POST /auth/login`). Returns either a
 * session token (mapped into [UserHints]) or an MFA ticket when 2FA is
 * enabled on the account.
 */
suspend fun negotiateAuthentication(email: String, password: String): EmailPasswordAssessment {
    return when (val result: DiscordLoginResult = DiscordHttp.discordLogin(email, password)) {
        is DiscordLoginSuccess -> EmailPasswordAssessment(
            firstUserHints = UserHints(
                result = "Success",
                id = result.userId ?: "discord",
                userId = result.userId ?: "",
                token = result.token,
                name = "Discord"
            )
        )

        is DiscordLoginMfaRequired -> EmailPasswordAssessment(
            proceedMfa = true,
            mfaSpec = MfaLoginSpec(
                result = "MFA",
                ticket = result.ticket,
                allowedMethods = buildList {
                    add("Totp")
                    if (result.backup) add("Recovery")
                }
            )
        )

        is DiscordLoginError -> EmailPasswordAssessment(
            error = StoatAPIError(result.message)
        )
    }
}

/** Completes login with a TOTP code (`POST /auth/mfa/totp`). */
suspend fun authenticateWithMfaTotpCode(
    mfaTicket: String,
    mfaResponse: MfaResponseTotpCode
): EmailPasswordAssessment {
    return verifyDiscordMfa(mfaTicket, mfaResponse.totpCode, "totp")
}

/** Completes login with a backup/recovery code (`POST /auth/mfa/backup`). */
suspend fun authenticateWithMfaRecoveryCode(
    mfaTicket: String,
    mfaResponse: MfaResponseRecoveryCode
): EmailPasswordAssessment {
    return verifyDiscordMfa(mfaTicket, mfaResponse.recoveryCode, "backup")
}

private suspend fun verifyDiscordMfa(
    mfaTicket: String,
    code: String,
    type: String
): EmailPasswordAssessment {
    return when (val result: DiscordLoginResult = DiscordHttp.discordVerifyMfa(mfaTicket, code, type)) {
        is DiscordLoginSuccess -> EmailPasswordAssessment(
            firstUserHints = UserHints(
                result = "Success",
                id = result.userId ?: "discord",
                userId = result.userId ?: "",
                token = result.token,
                name = "Discord"
            )
        )

        is DiscordLoginMfaRequired -> EmailPasswordAssessment(
            error = StoatAPIError("InvalidMfaCode")
        )

        is DiscordLoginError -> EmailPasswordAssessment(
            error = StoatAPIError(result.message)
        )
    }
}

fun friendlySessionName(): String {
    return "Stoat for Android on ${android.os.Build.MANUFACTURER} ${android.os.Build.MODEL}"
}

object MfaResponseSerializer : KSerializer<MfaResponse> {
    @OptIn(InternalSerializationApi::class, ExperimentalSerializationApi::class)
    override val descriptor: SerialDescriptor =
        buildSerialDescriptor("MfaResponse", PolymorphicKind.SEALED)

    override fun serialize(encoder: Encoder, value: MfaResponse) = when (value) {
        is MfaResponsePassword ->
            encoder.encodeSerializableValue(MfaResponsePassword.serializer(), value)

        is MfaResponseRecoveryCode ->
            encoder.encodeSerializableValue(MfaResponseRecoveryCode.serializer(), value)

        is MfaResponseTotpCode ->
            encoder.encodeSerializableValue(MfaResponseTotpCode.serializer(), value)
    }

    override fun deserialize(decoder: Decoder): MfaResponse =
        throw UnsupportedOperationException("MfaResponse is only ever sent to the API")
}
