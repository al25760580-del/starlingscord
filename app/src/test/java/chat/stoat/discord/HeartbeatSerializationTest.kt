package chat.stoat.discord

import chat.stoat.core.discord.models.GatewayPayload
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Regression test for the gateway 4002 "Error while decoding payload" bug.
 *
 * The gateway REQUIRES the "d" field on every heartbeat opcode 1 payload:
 * null before the first dispatch event, the last sequence number afterwards.
 * DiscordJson runs with explicitNulls=false, and kotlinx also omits
 * properties equal to their default - so a Kotlin-null "d" disappeared and
 * the first heartbeat went out as {"op":1}, which the live gateway answers
 * with close code 4002 before READY (verified empirically: {"op":1} ->
 * 4002, {"op":1,"d":null} -> heartbeat ACK). The fix serializes JsonNull, a
 * non-null JsonElement that renders as an explicit "d":null.
 */
class HeartbeatSerializationTest {

    /** Same configuration as the app's DiscordJson. */
    private val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    @Test
    fun firstHeartbeatSerializesExplicitNullD() {
        val lastSeq: Int? = null
        val payload = GatewayPayload(
            op = 1,
            d = lastSeq?.let { JsonPrimitive(it) } ?: JsonNull,
        )
        val encoded = json.encodeToString(GatewayPayload.serializer(), payload)
        assertEquals("""{"op":1,"d":null}""", encoded)
    }

    @Test
    fun subsequentHeartbeatCarriesSequenceNumber() {
        val payload = GatewayPayload(op = 1, d = JsonPrimitive(42))
        val encoded = json.encodeToString(GatewayPayload.serializer(), payload)
        assertEquals("""{"op":1,"d":42}""", encoded)
    }

    @Test
    fun kotlinNullDWouldBeOmittedAndBreakTheHeartbeat() {
        // Documents the original bug: with explicitNulls=false a Kotlin-null
        // "d" (the property default) is dropped from the wire format, and
        // {"op":1} alone makes the gateway close with 4002. If this test
        // starts failing because kotlinx now emits "d":null, the explicit
        // JsonNull in sendHeartbeat is redundant but still correct.
        val payload = GatewayPayload(op = 1, d = null)
        val encoded = json.encodeToString(GatewayPayload.serializer(), payload)
        assertEquals("""{"op":1}""", encoded)
    }
}
