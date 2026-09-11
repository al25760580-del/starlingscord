package chat.stoat.api.routes.microservices.january

/**
 * January (Stoat's proxy/metadata microservice) has no Discord equivalent;
 * URLs pass through unchanged.
 */
fun asJanuaryProxyUrl(url: String): String {
    return url
}
