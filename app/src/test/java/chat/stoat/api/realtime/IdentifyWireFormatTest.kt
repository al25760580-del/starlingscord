package chat.stoat.api.realtime

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Regression test for the "degraded session" identify bug.
 *
 * DiscordJson/kotlinx omits properties equal to their default value, which
 * silently dropped "capabilities" and "compress" from the opcode 2 IDENTIFY.
 * Live-verified consequences on a real session (same token, 60s windows):
 *
 *   capabilities omitted  -> READY ok, but ZERO GUILD_CREATE dispatches, so
 *                            guild subscriptions (op 37) are never sent and
 *                            member lists / lazy presences never arrive;
 *   capabilities=16381    -> live MESSAGE_CREATE/PRESENCE_UPDATE but still
 *                            zero GUILD_CREATE;
 *   capabilities=1734653  -> full event stream including GUILD_CREATE (the
 *                            current official web client's value).
 *
 * buildIdentifyPayload therefore assembles the frame by hand and these tests
 * pin every field that must be present on the wire.
 */
class IdentifyWireFormatTest {

    private fun identifyJson(): JsonObject =
        DiscordGateway.buildIdentifyPayload(token = "TOKEN", deviceModel = "Pixel 8").jsonObject

    @Test
    fun frameHasOpcode2AndData() {
        val json = identifyJson()
        assertEquals(2, json["op"]!!.jsonPrimitive.content.toInt())
        assertTrue(json["d"] is JsonObject)
    }

    @Test
    fun capabilitiesAndCompressAreExplicitlyOnTheWire() {
        val d = identifyJson()["d"]!!.jsonObject
        assertEquals(1734653, d["capabilities"]!!.jsonPrimitive.content.toInt())
        assertEquals("false", d["compress"]!!.jsonPrimitive.content)
    }

    @Test
    fun propertiesCarriesOsBrowserDevice() {
        val props = identifyJson()["d"]!!.jsonObject["properties"]!!.jsonObject
        assertEquals("Android", props["\$os"]!!.jsonPrimitive.content)
        assertEquals("Discord Android", props["\$browser"]!!.jsonPrimitive.content)
        assertEquals("Pixel 8", props["\$device"]!!.jsonPrimitive.content)
    }

    @Test
    fun presenceMirrorsOfficialClientAndClientStateIsEmpty() {
        val d = identifyJson()["d"]!!.jsonObject
        val presence = d["presence"]!!.jsonObject
        assertEquals("unknown", presence["status"]!!.jsonPrimitive.content)
        assertEquals("0", presence["since"]!!.jsonPrimitive.content)
        assertEquals("false", presence["afk"]!!.jsonPrimitive.content)
        assertEquals(0, presence["activities"]!!.let { (it as kotlinx.serialization.json.JsonArray).size })
        val clientState = d["client_state"]!!.jsonObject
        assertEquals("0", clientState["api_code_version"]!!.jsonPrimitive.content)
        assertTrue(clientState["guild_versions"] is JsonObject)
        assertTrue(clientState["guild_versions"]!!.jsonObject.isEmpty())
    }

    @Test
    fun tokenIsIncludedAndIntentsIsNot() {
        val d = identifyJson()["d"]!!.jsonObject
        assertEquals("TOKEN", d["token"]!!.jsonPrimitive.content)
        assertFalse("user accounts never send gateway intents", d.containsKey("intents"))
    }

    @Test
    fun encodesStableJsonForLogging() {
        val encoded = Json.encodeToString(JsonObject.serializer(), DiscordGateway.buildIdentifyPayload("T", "D"))
        assertTrue(encoded.contains("\"capabilities\":1734653"))
        assertTrue(encoded.contains("\"compress\":false"))
    }

    @Test
    fun tokenIsRedactedFromLoggedIdentify() {
        // The raw identify frame must never reach logcat with a live token.
        val token = "NDg4.TOKEN.abc123"
        val encoded = Json.encodeToString(
            JsonObject.serializer(),
            DiscordGateway.buildIdentifyPayload(token, "Pixel 8"),
        )
        val logged = DiscordGateway.redactToken(encoded, token)
        assertTrue(logged.contains("\"token\":\"<redacted>\""))
        assertTrue("raw token must not survive redaction", !logged.contains(token))
        // Blank token: nothing to redact, log as-is.
        assertEquals(encoded, DiscordGateway.redactToken(encoded, ""))
    }
}
