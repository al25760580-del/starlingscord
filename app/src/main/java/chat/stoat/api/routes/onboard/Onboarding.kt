package chat.stoat.api.routes.onboard

import chat.stoat.api.StoatAPI
import chat.stoat.api.StoatAPIError
import chat.stoat.core.model.util.RsResult
import kotlinx.serialization.Serializable

@Serializable
data class OnboardingResponse(
    val onboarding: Boolean
)

/** Discord accounts need no onboarding; login goes straight to the app. */
suspend fun needsOnboarding(sessionToken: String = StoatAPI.sessionToken): Boolean {
    return false
}

@Serializable
data class OnboardingCompletionBody(
    val username: String
)

suspend fun completeOnboarding(
    body: OnboardingCompletionBody,
    sessionToken: String = StoatAPI.sessionToken
): RsResult<Unit, StoatAPIError> {
    return RsResult.ok(Unit)
}
