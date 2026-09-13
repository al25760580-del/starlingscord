package chat.stoat.api.routes.account

import chat.stoat.api.StoatAPIError
import chat.stoat.core.model.util.RsResult
import kotlinx.serialization.Serializable

@Serializable
data class RegistrationBody(
    val email: String,
    val password: String,
    val invite: String? = null,
    val captcha: String
)

/**
 * Account registration is not supported: Discord's signup flow requires
 * captchas / phone verification that the user API does not expose.
 */
suspend fun register(body: RegistrationBody): RsResult<Unit, StoatAPIError> {
    return RsResult.err(StoatAPIError("RegistrationNotSupported"))
}
