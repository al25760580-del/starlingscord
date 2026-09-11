package chat.stoat.api.routes.microservices.health

import chat.stoat.core.model.schemas.HealthNotice

/** The Discord backend has no maintenance banner surface; always healthy. */
suspend fun healthCheck(): HealthNotice {
    return HealthNotice()
}
