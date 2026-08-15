package chat.stoat.discord

import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.ULID
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordChannelType
import chat.stoat.core.discord.models.DiscordEmbed
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.discord.routes.fetchGuildChannels
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.core.model.schemas.AutumnResource
import chat.stoat.core.model.schemas.Channel
import chat.stoat.core.model.schemas.ChannelType
import chat.stoat.core.model.schemas.Embed
import chat.stoat.core.model.schemas.Image
import chat.stoat.core.model.schemas.Message
import chat.stoat.core.model.schemas.Server
import chat.stoat.core.model.schemas.User

/**
 * Adapts Discord API/models into Revolt-shaped
 * [chat.stoat.core.model.schemas] objects so that Stoat's existing UI (servers,
 * channels, messages, profile, settings) can render Discord data directly from
 * [StoatAPI].
 *
 * ID strategy: Discord uses decimal snowflakes. Revolt's [Message] composable
 * calls [ULID.asTimestamp] on [Message.id], so message ids are converted to
 * ULIDs derived from the snowflake's embedded timestamp. Every other id
 * (users, channels, servers, members) keeps its raw snowflake string and is
 * used consistently as a cache key across [StoatAPI]. [DiscordAPI.idMap] keeps
 * the ULID -> snowflake mapping for round-tripping actions.
 */
object DiscordToStoat {
    private const val DISCORD_EPOCH = 1420070400000L

    /** Convert a Discord snowflake to a unix-ms timestamp. */
    fun snowflakeTimestamp(snowflake: String?): Long? {
        if (snowflake == null) return null
        return try {
            (snowflake.toLong() shr 22) + DISCORD_EPOCH
        } catch (_: NumberFormatException) {
            null
        }
    }

    /** Convert a Discord snowflake to a Revolt-shaped ULID. */
    fun snowflakeToUlid(snowflake: String?): String? {
        val ts = snowflakeTimestamp(snowflake) ?: return null
        return ULID.makeSpecial(ts)
    }

    fun adaptUser(u: DiscordUser?): User? {
        if (u?.id == null) return null
        return User(
            id = u.id,
            username = u.username,
            displayName = u.globalName,
            discriminator = u.discriminator,
            avatar = u.avatar?.let { AutumnResource(id = it) },
            badges = u.publicFlags?.toLong(),
        )
    }

    fun adaptServer(g: DiscordGuild, channelIds: List<String> = emptyList()): Server {
        return Server(
            id = g.id,
            owner = g.ownerId,
            name = g.name,
            description = g.description,
            channels = channelIds,
            icon = g.icon?.let { AutumnResource(id = it) },
            banner = g.banner?.let { AutumnResource(id = it) },
        )
    }

    fun adaptChannel(c: DiscordChannel): Channel {
        val type = when (c.type) {
            DiscordChannelType.DM -> ChannelType.DirectMessage
            DiscordChannelType.GROUP_DM -> ChannelType.Group
            DiscordChannelType.GUILD_VOICE,
            DiscordChannelType.GUILD_STAGE_VOICE -> ChannelType.VoiceChannel
            else -> ChannelType.TextChannel
        }
        return Channel(
            id = c.id,
            channelType = type,
            name = c.name ?: c.displayName(),
            description = c.topic,
            recipients = c.recipients?.mapNotNull { it.id },
            user = if (c.type == DiscordChannelType.DM) c.recipients?.firstOrNull()?.id else null,
            nsfw = c.nsfw,
            server = c.guildId,
            lastMessageID = c.lastMessageId,
        )
    }

    fun adaptMessage(m: DiscordMessage): Message? {
        val id = snowflakeToUlid(m.id) ?: return null
        val embeds = buildList {
            m.embeds?.forEach { e -> add(adaptEmbed(e)) }
            m.attachments?.forEach { a ->
                if (a.url != null) {
                    add(
                        Embed(
                            image = Image(
                                url = a.url,
                                width = a.width?.toLong(),
                                height = a.height?.toLong(),
                            )
                        )
                    )
                }
            }
        }
        val result = Message(
            id = id,
            channel = m.channelId,
            author = m.author?.id,
            content = m.content,
            embeds = embeds.ifEmpty { null },
            mentions = m.mentions?.mapNotNull { it.id },
            pinned = m.pinned,
        )
        m.id?.let { DiscordAPI.idMap[id] = it }
        return result
    }

    private fun adaptEmbed(e: DiscordEmbed): Embed {
        return Embed(
            title = e.title,
            description = e.description,
            url = e.url,
        )
    }

    /**
     * Populates [StoatAPI] caches from a Discord gateway READY event so that all
     * of Stoat's existing screens render Discord data. Channels are fetched per
     * guild via REST because the READY guild objects are reduced (no channels).
     */
    suspend fun populateFromReady(ready: GatewayReady) {
        val self = ready.user ?: return
        StoatAPI.selfId = self.id
        self.id?.let { StoatAPI.userCache[it] = adaptUser(self) ?: return@let }

        ready.guilds?.forEach { guild ->
            val gid = guild.id ?: return@forEach
            val channels = runCatching { DiscordHttp.fetchGuildChannels(gid) }
                .getOrElse { emptyList() }
            channels.forEach { ch ->
                ch.id?.let { StoatAPI.channelCache[it] = adaptChannel(ch) }
            }
            val channelIds = channels.mapNotNull { it.id }
            StoatAPI.serverCache[gid] = adaptServer(guild, channelIds)
        }

        ready.privateChannels?.forEach { ch ->
            ch.id?.let { StoatAPI.channelCache[it] = adaptChannel(ch) }
        }
    }
}
