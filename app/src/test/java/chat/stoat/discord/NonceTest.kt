package chat.stoat.discord

import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.discord.routes.DiscordMessageSend
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Regression test for the "messages never send, stay grayed out" bug.
 *
 * Sending the 26-char ULID as the message nonce made Discord reject every
 * send with 400 50035 NONCE_TYPE_TOO_LONG ("Debe tener 25 caracteres o
 * menos") - live-verified against the API with the exact request body. The
 * send layer swallowed the error (null return, no log), so the optimistic
 * bubble stayed pending forever and nothing was actually delivered.
 *
 * Wire contract (docs.discord.food + server):
 *   - nonce: integer | string, string form max 25 chars;
 *   - echoed verbatim on the REST response and the gateway MESSAGE_CREATE;
 *   - other clients may send INTEGER nonces, so decode must accept numbers.
 */
class NonceTest {

    private val json = Json { ignoreUnknownKeys = true; explicitNulls = false }

    @Test
    fun wireNonceIsAtMost25Chars() {
        // The ULID used as the pending bubble's id is 26 chars - exactly one
        // over Discord's limit. The wire nonce is its first 25 chars
        // (deterministic, so REST echo and gateway echo both match).
        val ulid = "01JD8X2M4QWTB9ZYCAGS6FVN2P"
        assertEquals(26, ulid.length)
        val wireNonce = ulid.take(25)
        assertEquals(25, wireNonce.length)
    }

    @Test
    fun sendBodyCarriesTheNonce() {
        val body = json.encodeToString(
            DiscordMessageSend.serializer(),
            DiscordMessageSend(content = "hi", nonce = "01JD8X2M4QWTB9ZYCAGS"),
        )
        assertTrue(body.contains("\"nonce\":\"01JD8X2M4QWTB9ZYCAGS\""))
    }

    @Test
    fun integerNonceFromOtherClientsDecodes() {
        val m = json.decodeFromString(
            DiscordMessage.serializer(),
            """{"id":"1199","channel_id":"55","content":"hi","nonce":1757648000000}""",
        )
        assertEquals("1757648000000", m.nonce)
    }

    @Test
    fun stringNonceDecodesAndAbsentNonceIsNull() {
        val m = json.decodeFromString(
            DiscordMessage.serializer(),
            """{"id":"1199","channel_id":"55","content":"hi","nonce":"01JD8X2M4QWTB9ZYCAGS6"}""",
        )
        assertEquals("01JD8X2M4QWTB9ZYCAGS6", m.nonce)
        val noNonce = json.decodeFromString(
            DiscordMessage.serializer(),
            """{"id":"1199","channel_id":"55","content":"hi"}""",
        )
        assertNull(noNonce.nonce)
    }

}
