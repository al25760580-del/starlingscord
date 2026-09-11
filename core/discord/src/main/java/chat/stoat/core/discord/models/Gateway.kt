package chat.stoat.core.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

/**
 * Raw gateway envelope. `d` is kept as a [JsonElement] so we can defer decoding
 * to the specific event type once we know the opcode / event name.
 *
 * Opcodes: 0 Dispatch, 1 Heartbeat, 2 Identify, 6 Resume, 7 Reconnect,
 * 8 Request Guild Members, 9 Invalid Session, 10 Hello, 11 Heartbeat ACK.
 */
@Serializable
data class GatewayPayload(
    val op: Int,
    val d: JsonElement? = null,
    val s: Int? = null,
    val t: String? = null,
)

@Serializable
data class GatewayHello(
    @SerialName("heartbeat_interval")
    val heartbeatInterval: Long = 0,
    val _trace: List<String>? = null,
)

@Serializable
data class GatewayReady(
    val v: Int? = null,
    val user: DiscordUser? = null,
    val guilds: List<DiscordGuild>? = null,
    @SerialName("private_channels")
    val privateChannels: List<DiscordChannel>? = null,
    @SerialName("session_id")
    val sessionId: String? = null,
    val application: GatewayApplication? = null,
)

@Serializable
data class GatewayApplication(
    val id: String? = null,
    val flags: Int? = null,
)

/** Sendable IDENTIFY frame (opcode 2). */
@Serializable
data class GatewayIdentify(
    val op: Int = 2,
    val d: IdentifyData,
)

@Serializable
data class IdentifyData(
    val token: String,
    val properties: IdentifyProperties,
    val compress: Boolean = false,
    // 16381 is the capability bitfield Discord's own user client sends. A
    // non-standard value (e.g. 16384) can make the gateway reject the identify
    // and drop the connection immediately after HELLO.
    val capabilities: Int = 16381,
    val presence: PresenceData? = null,
    val intents: Int? = null,
    @SerialName("client_state")
    val clientState: ClientState? = null,
)

/** Optional cache-state object sent during identify (mirrors the official client). */
@Serializable
data class ClientState(
    @SerialName("api_code_version")
    val apiCodeVersion: Int = 0,
    @SerialName("guild_versions")
    val guildVersions: Map<String, Int> = emptyMap(),
)

@Serializable
data class IdentifyProperties(
    @SerialName("\$os")
    val os: String = "Android",
    @SerialName("\$browser")
    val browser: String = "Discord Android",
    @SerialName("\$device")
    val device: String = "",
    // Web-only fields; omitted (null) on mobile clients.
    @SerialName("\$referrer")
    val referrer: String? = null,
    @SerialName("\$referring_domain")
    val referringDomain: String? = null,
)

@Serializable
data class PresenceData(
    val status: String = "online",
    val since: Long? = null,
    val activities: List<ActivityData> = emptyList(),
    val afk: Boolean = false,
)

@Serializable
data class ActivityData(
    val name: String = "Stoat",
    val type: Int = 4,
)
