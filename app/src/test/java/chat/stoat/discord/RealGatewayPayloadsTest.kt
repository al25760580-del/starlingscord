package chat.stoat.discord

import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.GatewayPayload
import chat.stoat.core.discord.models.GatewayReady
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Decodes REAL gateway payloads captured from a live v10 user-session
 * (2026-09-12, then anonymized: usernames/emails/phones/content masked,
 * snowflake ids kept for referential integrity - see
 * app/src/test/resources/gateway/). This is the strongest regression net we
 * can have: if Discord changes any field shape the models read, this test
 * breaks before the app ships a "Failed to handle dispatch" loop.
 *
 * The capture exists because the READY dispatch used to crash on
 * {"type":"role"} overwrites (string type from the gateway vs int from REST),
 * silently discarding the whole session state - no guilds, no session_id
 * (so no RESUME), no live events.
 */
class RealGatewayPayloadsTest {

    private val json = Json { ignoreUnknownKeys = true; explicitNulls = false }

    private fun resource(name: String): String =
        javaClass.getResourceAsStream("/gateway/$name")!!
            .bufferedReader().readText()

    @Test
    fun realReadyPayloadDecodes() {
        val payload = json.parseToJsonElement(resource("ready.json")).jsonObject
        val frame = json.decodeFromJsonElement(GatewayPayload.serializer(), payload)
        assertEquals(0, frame.op)
        assertEquals("READY", frame.t)

        val ready = json.decodeFromJsonElement(GatewayReady.serializer(), frame.d!!)
        // 5 real guilds with 3000+ permission overwrites between them.
        assertEquals(5, ready.guilds?.size)
        assertNotNull(ready.user?.id)
        assertTrue("session_id must be captured for RESUME", !ready.sessionId.isNullOrBlank())
        assertTrue(ready.resumeGatewayUrl?.startsWith("wss://") == true)
    }

    @Test
    fun realReadyGuildsContainNormalizedOverwrites() {
        val ready = json.decodeFromJsonElement(
            GatewayReady.serializer(),
            json.parseToJsonElement(resource("ready.json")).jsonObject["d"]!!,
        )
        val overwrites = ready.guilds.orEmpty()
            .flatMap { it.channels.orEmpty() }
            .flatMap { it.permissionOverwrites.orEmpty() }
        assertTrue("expected a healthy number of overwrites, got ${overwrites.size}", overwrites.size > 100)
        // Every gateway "role"/"member" string must have normalized to 0/1.
        assertTrue(overwrites.all { it.type == 0 || it.type == 1 })
        // And at least one of each kind (REST semantics preserved).
        assertTrue(overwrites.any { it.type == 0 })
        assertTrue(overwrites.any { it.type == 1 })
    }

    @Test
    fun realMessageCreatePayloadDecodes() {
        val payload = json.parseToJsonElement(resource("message_create.json")).jsonObject
        val frame = json.decodeFromJsonElement(GatewayPayload.serializer(), payload)
        assertEquals("MESSAGE_CREATE", frame.t)
        val message = json.decodeFromJsonElement(DiscordMessage.serializer(), frame.d!!)
        assertNotNull(message.id)
        assertTrue(!message.channelId.isNullOrBlank())
        assertNotNull(message.author?.id)
    }
}
