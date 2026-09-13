package chat.stoat.api.routes.voice

import kotlinx.serialization.Serializable

@Serializable
data class JoinCallResponse(
    val token: String,
    val url: String,
)

/**
 * Voice calls are not supported on Discord user accounts from this client
 * yet (Discord voice uses its own gateway + UDP media transport, not LiveKit).
 */
suspend fun joinCall(
    channelId: String,
    nodeName: String,
    forceDisconnect: Boolean = true
): JoinCallResponse {
    throw Exception("Voice calls are not supported on Discord")
}
