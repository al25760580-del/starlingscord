package chat.stoat.api.routes.auth

import chat.stoat.core.model.schemas.Session
import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.DiscordJson
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer

@Serializable
private data class DiscordSessionClientInfo(
    val os: String? = null,
    val platform: String? = null,
    val location: String? = null,
    val name: String? = null,
    val version: String? = null,
)

@Serializable
private data class DiscordSession(
    val id: String? = null,
    @SerialName("client_info")
    val clientInfo: DiscordSessionClientInfo? = null,
    @SerialName("approx_last_used_time")
    val approxLastUsedTime: String? = null,
)

/** Lists the account's active sessions: `GET /users/@me/sessions`. */
suspend fun fetchAllSessions(): List<Session> {
    return try {
        val response = DiscordHttp.get("$DISCORD_API/users/@me/sessions").bodyAsText()
        DiscordJson.decodeFromString(ListSerializer(DiscordSession.serializer()), response)
            .mapNotNull { s ->
                s.id?.let { id ->
                    Session(
                        id = id,
                        name = s.clientInfo?.name
                            ?: listOfNotNull(s.clientInfo?.platform, s.clientInfo?.os)
                                .joinToString(" / ")
                            .ifBlank { "Discord session" },
                    )
                }
            }
    } catch (e: Exception) {
        emptyList()
    }
}

/** Revokes a single session: `DELETE /users/@me/sessions/{id}`. */
suspend fun logoutSessionById(id: String) {
    DiscordHttp.delete("$DISCORD_API/users/@me/sessions/$id")
}

/**
 * Revokes sessions. Discord has no bulk endpoint, so every known session is
 * revoked individually; with [includingSelf] the current session is revoked
 * too (which logs this client out of the API).
 */
suspend fun logoutAllSessions(includingSelf: Boolean = false) {
    val sessions = fetchAllSessions()
    sessions.forEach { session ->
        if (includingSelf || session.id != chat.stoat.discord.DiscordAPI.sessionId) {
            runCatching { logoutSessionById(session.id) }
        }
    }
}
