package chat.stoat.api.internals

import chat.stoat.api.StoatAPI
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.discord.DiscordAPI
import java.io.File
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject

/**
 * Regression test for the lazy data layer: the user-session READY payload
 * carries FULL guilds (channels/roles/emojis) plus merged_members (the self
 * member per guild), so [DiscordMappings.populateFromReady] must populate
 * every UI cache with ZERO REST calls. If this breaks, login starts firing
 * ~60 requests again (33s on a flaky network, live logcat).
 */
class PopulateFromReadyTest {
    private val json = Json { ignoreUnknownKeys = true; explicitNulls = false }

    private fun parseFixture(): GatewayReady {
        val frame = json.parseToJsonElement(
            File("src/test/resources/gateway/ready.json").readText(),
        ).jsonObject
        return json.decodeFromJsonElement(
            GatewayReady.serializer(),
            frame["d"]!!.jsonObject,
        )
    }

    private fun clearCaches() {
        StoatAPI.serverCache.clear()
        StoatAPI.channelCache.clear()
        StoatAPI.userCache.clear()
        StoatAPI.selfId = null
        StoatAPI.members.clear()
        DiscordAPI.guildCache.clear()
        DiscordAPI.selfMembers.clear()
        DiscordAPI.emojiCache.clear()
        DiscordAPI.guildPermissions.clear()
    }

    @org.junit.Before
    fun setUp() = clearCaches()

    @org.junit.After
    fun tearDown() = clearCaches()

    @org.junit.Test
    fun `ready payload populates servers channels emojis and self members without REST`() = runBlocking {
        val ready = parseFixture()
        DiscordMappings.populateFromReady(ready)

        // Servers: every guild in the payload.
        org.junit.Assert.assertEquals(5, StoatAPI.serverCache.size)
        org.junit.Assert.assertEquals(5, DiscordAPI.guildCache.size)

        // Channels: 418 raw in the fixture, 357 listable after
        // isListableChannel drops categories/forums/threads.
        val guildChannelCount = StoatAPI.channelCache.values.count { it.server != null }
        org.junit.Assert.assertEquals(357, guildChannelCount)

        // Emojis: 458+139+299+164+0 = 1060 from the payload.
        org.junit.Assert.assertEquals(1060, DiscordAPI.emojiCache.size)

        // Self member: one merged_members entry per guild, index-aligned.
        org.junit.Assert.assertEquals(5, DiscordAPI.selfMembers.size)
        org.junit.Assert.assertEquals("Nick", DiscordAPI.selfMembers.values.first()?.nick)

        // Self user cached and selfId set.
        org.junit.Assert.assertEquals("481684516281516032", StoatAPI.selfId)
        org.junit.Assert.assertTrue(StoatAPI.userCache.containsKey("481684516281516032"))

        // DMs: private_channels from the payload.
        org.junit.Assert.assertTrue(
            StoatAPI.channelCache.values.any { it.server == null && it.channelType == chat.stoat.core.model.schemas.ChannelType.DirectMessage },
        )
    }

    @org.junit.Test
    fun `ensureServerHydrated is a no-op when channels are already cached`() = runBlocking {
        val ready = parseFixture()
        DiscordMappings.populateFromReady(ready)
        // populateFromReady already cached all channels; the on-demand
        // fallback must not fire any request (fetchGuildChannels would be
        // the only REST call in this path - it must not run). If it did, it
        // would need an HTTP client that isn't wired in JVM tests and throw.
        DiscordMappings.ensureServerHydrated("435452901964513291")
        org.junit.Assert.assertEquals(357, StoatAPI.channelCache.values.count { it.server != null })
    }
}
