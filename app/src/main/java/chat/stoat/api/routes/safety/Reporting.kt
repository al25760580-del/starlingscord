package chat.stoat.api.routes.safety

import android.util.Log
import chat.stoat.core.model.schemas.ContentReportReason
import chat.stoat.core.model.schemas.UserReportReason

/**
 * Content reporting against Discord's user API is not wired up yet; reports
 * are accepted by the UI and logged best-effort.
 */
suspend fun putMessageReport(
    messageId: String,
    reason: ContentReportReason,
    additionalContext: String? = null
) {
    Log.w("Safety", "Message report not supported on Discord yet: $messageId ($reason)")
}

suspend fun putServerReport(
    serverId: String,
    reason: ContentReportReason,
    additionalContext: String? = null
) {
    Log.w("Safety", "Server report not supported on Discord yet: $serverId ($reason)")
}

suspend fun putUserReport(
    userId: String,
    reason: UserReportReason,
    additionalContext: String? = null
) {
    Log.w("Safety", "User report not supported on Discord yet: $userId ($reason)")
}
