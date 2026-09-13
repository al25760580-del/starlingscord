package chat.stoat.api.routes.misc

import chat.stoat.discord.DISCORD_GATEWAY
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Root(
    val revolt: String,
    val features: Features,
    val ws: String,
    val app: String,
    val vapid: String
)

@Serializable
data class Features(
    val captcha: CAPTCHAFeature,
    val email: Boolean,
    @SerialName("invite_only") val inviteOnly: Boolean,
    val autumn: AutumnJanuaryFeature,
    val january: AutumnJanuaryFeature,
    val voso: LegacyVoiceFeature? = null,
    val livekit: LiveKitFeature? = null,
)

@Serializable
data class AutumnJanuaryFeature(
    val enabled: Boolean,
    val url: String
)

@Serializable
data class CAPTCHAFeature(
    val enabled: Boolean,
    val key: String
)

@Serializable
data class LegacyVoiceFeature(
    val enabled: Boolean,
    val url: String,
    val ws: String
)

@Serializable
data class LiveKitFeature(
    val enabled: Boolean,
    val nodes: List<LiveKitNode>
)

@Serializable
data class LiveKitNode(
    val name: String,
    val lat: Double,
    val lon: Double,
    @SerialName("public_url") val publicUrl: String,
)

/**
 * The backend is Discord; the root descriptor is synthesised so screens that
 * read feature flags (captcha, invite-only, livekit nodes) get sane values.
 */
suspend fun getRootRoute(): Root {
    return Root(
        revolt = "Discord",
        features = Features(
            captcha = CAPTCHAFeature(enabled = false, key = ""),
            email = true,
            inviteOnly = false,
            autumn = AutumnJanuaryFeature(enabled = false, url = ""),
            january = AutumnJanuaryFeature(enabled = false, url = ""),
            livekit = LiveKitFeature(enabled = false, nodes = emptyList()),
        ),
        ws = DISCORD_GATEWAY,
        app = "https://discord.com",
        vapid = "",
    )
}
