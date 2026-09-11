package chat.stoat.api.routes.account

import chat.stoat.discord.DISCORD_API
import chat.stoat.discord.DiscordHttp
import io.ktor.client.request.patch
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChangeEmailBody(
    val email: String,
    val password: String
)

/** Changes the account email: `PATCH /users/@me`. */
suspend fun changeEmail(newEmail: String, currentPassword: String) {
    val res = DiscordHttp.patch("$DISCORD_API/users/@me") {
        contentType(ContentType.Application.Json)
        setBody(ChangeEmailBody(email = newEmail, password = currentPassword))
    }
    if (!res.status.isSuccess()) {
        throw Exception("Failed to change email: HTTP ${res.status.value}: ${res.bodyAsText().take(200)}")
    }
}

@Serializable
data class ChangePasswordBody(
    @SerialName("new_password")
    val newPassword: String,
    val password: String
)

/** Changes the account password: `PATCH /users/@me`. */
suspend fun changePassword(newPassword: String, currentPassword: String) {
    val res = DiscordHttp.patch("$DISCORD_API/users/@me") {
        contentType(ContentType.Application.Json)
        setBody(ChangePasswordBody(newPassword = newPassword, password = currentPassword))
    }
    if (!res.status.isSuccess()) {
        throw Exception("Failed to change password: HTTP ${res.status.value}: ${res.bodyAsText().take(200)}")
    }
}
