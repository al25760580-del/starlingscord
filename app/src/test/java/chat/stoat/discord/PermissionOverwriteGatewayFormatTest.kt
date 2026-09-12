package chat.stoat.discord

import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordPermissionOverwrite
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Regression test for the READY decode crash ("Failed to parse literal
 * '"role"' as an int value at path: $.type"), captured from a live v10
 * gateway session on 2026-09-12: the gateway sends overwrite "type" as a
 * STRING ("role"/"member") while REST v9 sends an int, and allow/deny arrive
 * as ints alongside string *_new variants. The models must tolerate every
 * shape or the entire READY dispatch (and with it the live session) is lost.
 */
class PermissionOverwriteGatewayFormatTest {

    private val json = Json { ignoreUnknownKeys = true; explicitNulls = false }

    /** Verbatim from logcat: gateway v10 user-session READY payload. */
    private val gatewayOverwrite =
        """{"type":"role","id":"574723854103085057","deny_new":"0","deny":0,"allow_new":"0","allow":0}"""

    @Test
    fun gatewayStringRoleTypeNormalizesToZero() {
        val ow = json.decodeFromString(DiscordPermissionOverwrite.serializer(), gatewayOverwrite)
        assertEquals(0, ow.type)
        assertEquals("574723854103085057", ow.id)
    }

    @Test
    fun gatewayIntAllowDenyDecodeAsStringBitfield() {
        val ow = json.decodeFromString(DiscordPermissionOverwrite.serializer(), gatewayOverwrite)
        // "deny":0 / "allow":0 arrive as JSON numbers; the model reads them
        // as String bitfields - kotlinx coerces the literal's content.
        assertEquals("0", ow.deny)
        assertEquals("0", ow.allow)
    }

    @Test
    fun gatewayMemberStringNormalizesToOne() {
        val ow = json.decodeFromString(
            DiscordPermissionOverwrite.serializer(),
            """{"type":"member","id":"123","deny":16,"allow":1024}""",
        )
        assertEquals(1, ow.type)
        assertEquals("16", ow.deny)
        assertEquals("1024", ow.allow)
    }

    @Test
    fun restIntTypeStillDecodes() {
        val ow = json.decodeFromString(
            DiscordPermissionOverwrite.serializer(),
            """{"type":0,"id":"456","allow":"1071698660925","deny":"0"}""",
        )
        assertEquals(0, ow.type)
        assertEquals("1071698660925", ow.allow)
    }

    @Test
    fun fullChannelWithGatewayOverwritesDecodes() {
        // A channel exactly as it appears inside READY.guilds[].channels[]
        // (string overwrite types, numeric allow/deny, unknown *_new keys).
        val channel =
            """{"id":"1199435481538529403","type":0,"guild_id":"435452901964513291",
               "name":"general","position":0,"nsfw":false,"last_message_id":"1199435481538529404",
               "permission_overwrites":[
                 {"type":"role","id":"435452901964513291","deny_new":"3072","deny":3072,"allow_new":"0","allow":0},
                 {"type":"member","id":"287965941457815553","deny_new":"0","deny":0,"allow_new":"2048","allow":2048}]}"""
        val decoded = json.decodeFromString(DiscordChannel.serializer(), channel)
        assertEquals(2, decoded.permissionOverwrites?.size)
        assertEquals(0, decoded.permissionOverwrites!![0].type)
        assertEquals("3072", decoded.permissionOverwrites!![0].deny)
        assertEquals(1, decoded.permissionOverwrites!![1].type)
        assertEquals("2048", decoded.permissionOverwrites!![1].allow)
    }
}
