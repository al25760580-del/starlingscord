package chat.stoat.api.routes.push

import chat.stoat.api.routes.account.WebPushData

/**
 * Discord user accounts have no web-push subscription surface; push delivery
 * is not available, so these are no-ops.
 */
suspend fun subscribePush(
    endpoint: String = "fcm",
    auth: String,
    p256diffieHellman: String? = null,
) {
    // no-op
}

suspend fun unsubscribePush() {
    // no-op
}
