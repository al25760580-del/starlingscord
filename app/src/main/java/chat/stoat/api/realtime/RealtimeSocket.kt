package chat.stoat.api.realtime

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Connection state of the realtime gateway, surfaced to the UI (disconnect
 * notices, "connecting" indicators).
 */
sealed class DisconnectionState {
    data object Connected : DisconnectionState()
    data object Reconnecting : DisconnectionState()
    data object Disconnected : DisconnectionState()
}

/**
 * Realtime connection state holder.
 *
 * The actual transport is [DiscordGateway] (the Discord gateway websocket),
 * which reports its state here. The UI (chat router, disconnect notice)
 * observes [disconnectionState] and asks [chat.stoat.api.StoatAPI] to
 * reconnect.
 */
object RealtimeSocket {
    var disconnectionState: DisconnectionState by mutableStateOf(DisconnectionState.Disconnected)
        private set

    fun updateDisconnectionState(state: DisconnectionState) {
        disconnectionState = state
    }
}

/**
 * Sentinel values pushed through [chat.stoat.api.StoatAPI.wsFrameChannel] to
 * notify listeners about connection lifecycle transitions; the Discord
 * gateway has no equivalent wire frames.
 */
object RealtimeSocketFrames {
    object Reconnected
}
