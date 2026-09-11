package chat.stoat.api.routes.microservices.geo

/**
 * The age-restriction geo gate was a Stoat-specific feature; Discord has no
 * equivalent, so we report an unrestricted geo.
 */
data class GeoResponse(
    val countryCode: String,
    val isAgeRestrictedGeo: Boolean,
)

suspend fun queryGeo(): GeoResponse {
    return GeoResponse(countryCode = "", isAgeRestrictedGeo = false)
}
