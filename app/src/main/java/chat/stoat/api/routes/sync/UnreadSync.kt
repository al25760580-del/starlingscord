package chat.stoat.api.routes.sync

import chat.stoat.core.model.schemas.ChannelUnreadResponse

/**
 * Discord maintains read states server-side (ack'd via /ack and the gateway);
 * there is no bulk unread sync to fetch.
 */
suspend fun syncUnreads(): List<ChannelUnreadResponse> {
    return emptyList()
}
