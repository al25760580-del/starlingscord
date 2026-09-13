package chat.stoat.api.realtime

import chat.stoat.api.StoatAPI
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test

/**
 * Regression test for cross-client status sync (SESSIONS_REPLACE).
 *
 * Verified live with two simultaneous gateway sessions: when a status is set
 * from another client of the same account (op 3 there), the ONLY event the
 * other sessions receive is SESSIONS_REPLACE - the account's session array,
 * each entry with its own live status. Without handling it, a status changed
 * on e.g. the desktop client never showed up in this app.
 *
 * Payload shape captured live (anonymized session ids):
 *  [{"status":"online","session_id":"<hex>","processed_at_timestamp":0,
 *    "hidden_activities":[],
 *    "client_info":{"version":0,"os":"android","client":"mobile"},
 *    "activities":[]}, ...]
 */
class SessionsReplaceTest {

    private val selfId = "481684516281516032"
    private val mySession = "aaaa1111bbbb2222cccc3333dddd4444"
    private val otherSession = "eeee5555ffff6666aabb7788ccdd9911"

    private fun sessions(vararg pairs: Pair<String, String>): JsonElement {
        val body = pairs.joinToString(",") { (sid, status) ->
            """{"status":"$status","session_id":"$sid","processed_at_timestamp":0,
                "hidden_activities":[],
                "client_info":{"version":0,"os":"android","client":"mobile"},
                "activities":[]}"""
        }
        return Json.parseToJsonElement("[$body]")
    }

    @Before
    fun setUp() {
        StoatAPI.selfId = selfId
        StoatAPI.userCache.clear()
        StoatAPI.userCache[selfId] = chat.stoat.core.model.schemas.User(id = selfId)
        DiscordGateway.resetSessionStatusesForTest()
    }

    @After
    fun tearDown() {
        DiscordGateway.resetSessionStatusesForTest()
        StoatAPI.userCache.clear()
    }

    @Test
    fun firstSnapshotIsBaselineOnly() {
        DiscordGateway.handleSessionsReplace(
            sessions(mySession to "online", otherSession to "online"),
        )
        // Baseline: no status inferred yet.
        assertNull(StoatAPI.userCache[selfId]?.status?.presence)
    }

    @Test
    fun statusChangedOnAnotherClientIsMirrored() {
        DiscordGateway.handleSessionsReplace(
            sessions(mySession to "online", otherSession to "online"),
        )
        DiscordGateway.handleSessionsReplace(
            sessions(mySession to "online", otherSession to "idle"),
        )
        assertEquals("Idle", StoatAPI.userCache[selfId]?.status?.presence)
        assertEquals(true, StoatAPI.userCache[selfId]?.online)
    }

    @Test
    fun ownSessionEchoIsMirroredToo() {
        DiscordGateway.handleSessionsReplace(sessions(mySession to "online"))
        DiscordGateway.handleSessionsReplace(sessions(mySession to "dnd"))
        assertEquals("Busy", StoatAPI.userCache[selfId]?.status?.presence)
    }

    @Test
    fun invisibleFromAnotherClientShowsOffline() {
        DiscordGateway.handleSessionsReplace(sessions(mySession to "online", otherSession to "online"))
        DiscordGateway.handleSessionsReplace(sessions(mySession to "online", otherSession to "invisible"))
        assertNull(StoatAPI.userCache[selfId]?.status?.presence)
        assertEquals(false, StoatAPI.userCache[selfId]?.online)
    }

    @Test
    fun newlyConnectedSessionDoesNotFlipOurStatus() {
        // Self status comes from the presence pipeline (GUILD_CREATE member
        // lists); simulate it, then take the SESSIONS_REPLACE baseline.
        StoatAPI.userCache[selfId] = chat.stoat.core.model.schemas.User(
            id = selfId,
            status = chat.stoat.core.model.schemas.Status(presence = "Idle"),
            online = true,
        )
        DiscordGateway.handleSessionsReplace(sessions(mySession to "idle"))
        // A third device connects (new session appears as online) - not a
        // status change; our picker must stay on Idle.
        DiscordGateway.handleSessionsReplace(
            sessions(mySession to "idle", "ffff0000eeee1111dddd2222cccc3333" to "online"),
        )
        assertEquals("Idle", StoatAPI.userCache[selfId]?.status?.presence)
    }

    @Test
    fun customStatusTextFromAnotherSessionIsMirrored() {
        DiscordGateway.handleSessionsReplace(sessions(mySession to "online"))
        val withCustom = """
            [{"status":"idle","session_id":"$otherSession","processed_at_timestamp":0,
              "hidden_activities":[],
              "client_info":{"version":0,"os":"android","client":"mobile"},
              "activities":[{"type":4,"state":"erm","name":"Custom Status"}]}]
        """.trimIndent()
        DiscordGateway.handleSessionsReplace(Json.parseToJsonElement(withCustom))
        assertEquals("Idle", StoatAPI.userCache[selfId]?.status?.presence)
        assertEquals("erm", StoatAPI.userCache[selfId]?.status?.text)
    }
}
