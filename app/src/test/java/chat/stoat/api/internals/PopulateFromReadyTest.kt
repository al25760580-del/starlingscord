package chat.stoat.api.internals

import chat.stoat.api.StoatAPI
import chat.stoat.core.discord.models.DiscordGuild
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

    @org.junit.Test
    fun `reduced REST guild adds identity without losing payload data`() = runBlocking {
        val ready = parseFixture()
        DiscordMappings.populateFromReady(ready)
        val gid = "435452901964513291"
        val channelsBefore = StoatAPI.channelCache.values.count { it.server == gid }
        val emojisBefore = DiscordAPI.emojiCache.values.count { it.guildId == gid }
        org.junit.Assert.assertTrue(channelsBefore > 0)

        // What GET /users/@me/guilds returns: identity only, no channels.
        val restGuild = DiscordGuild(
            id = gid,
            name = "Restored Name",
            icon = "aabbccdd",
            owner = true,
            permissions = "2147483647",
        )
        DiscordMappings.upsertServerIdentity(gid, restGuild)

        // Identity restored (this is what the server rail renders).
        org.junit.Assert.assertEquals("Restored Name", StoatAPI.serverCache[gid]?.name)
        org.junit.Assert.assertNotNull(StoatAPI.serverCache[gid]?.icon)
        // Base permissions feed the visibility filter.
        org.junit.Assert.assertEquals(2147483647L, DiscordAPI.guildPermissions[gid])
        // Payload data survived the merge.
        org.junit.Assert.assertEquals(channelsBefore, StoatAPI.channelCache.values.count { it.server == gid })
        org.junit.Assert.assertEquals(emojisBefore, DiscordAPI.emojiCache.values.count { it.guildId == gid })
        org.junit.Assert.assertTrue((DiscordAPI.guildCache[gid]?.channels?.size ?: 0) > 0)
        // Roles from the payload are preserved in the adapted server.
        org.junit.Assert.assertTrue((StoatAPI.serverCache[gid]?.roles?.size ?: 0) > 0)
    }
}
