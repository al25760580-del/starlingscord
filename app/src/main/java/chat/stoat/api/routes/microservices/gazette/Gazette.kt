package chat.stoat.api.routes.microservices.gazette

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GazetteChangelog(
    val id: String,
    val title: String,
    @SerialName("markdown_content") val markdownContent: String,
    @SerialName("ios_version") val iosVersion: String,
    @SerialName("android_version") val androidVersion: String,
    @SerialName("web_version") val webVersion: String,
    @SerialName("published_at") val publishedAt: String = "",
    @SerialName("created_at") val createdAt: String = "",
    @SerialName("updated_at") val updatedAt: String = "",
)

/** There is no changelog feed on the Discord backend. */
suspend fun getLatestChangelog(): GazetteChangelog {
    throw Exception("No changelog available on the Discord backend")
}

suspend fun getChangelogById(id: String): GazetteChangelog {
    throw Exception("No changelog available on the Discord backend")
}
