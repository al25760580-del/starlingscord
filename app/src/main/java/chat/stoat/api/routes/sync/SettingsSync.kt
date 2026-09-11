package chat.stoat.api.routes.sync

import kotlinx.serialization.Serializable

@Serializable
data class SyncedSetting(val timestamp: Long, val value: String)

/**
 * Cross-device settings sync is not available on Discord user accounts; keys
 * resolve to nothing and writes are kept locally only.
 */
suspend fun getKeys(vararg keys: String, token: String): Map<String, SyncedSetting> {
    return emptyMap()
}

suspend fun getKeys(vararg keys: String): Map<String, SyncedSetting> {
    return emptyMap()
}

suspend fun setKey(key: String, value: String) {
    // no-op: settings stay local to this device
}
