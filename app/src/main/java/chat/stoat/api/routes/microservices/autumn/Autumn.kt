package chat.stoat.api.routes.microservices.autumn

import android.util.Log
import java.io.File
import io.ktor.http.ContentType

const val MAX_ATTACHMENTS_PER_MESSAGE = 5

data class FileArgs(
    val file: File,
    val filename: String,
    val contentType: String,
    val spoiler: Boolean = false,
    val pickerIdentifier: String? = null,
)

/**
 * File uploads are not wired up to Discord's user-attachment flow yet
 * (POST /users/@me/attachments + upload to the returned URL).
 */
suspend fun uploadToAutumn(
    file: File,
    name: String,
    tag: String,
    contentType: ContentType,
    onProgress: (Long, Long) -> Unit = { _, _ -> }
): String {
    Log.w("Autumn", "File uploads are not supported on the Discord backend yet")
    throw Exception("File uploads are not supported on the Discord backend yet")
}
