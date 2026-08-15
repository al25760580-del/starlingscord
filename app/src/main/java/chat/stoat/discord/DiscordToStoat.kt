package chat.stoat.discord

import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.ULID
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordChannelType
import chat.stoat.core.discord.models.DiscordEmbed
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.discord.routes.fetchDMs
import chat.stoat.discord.routes.fetchGuildChannels
import chat.stoat.discord.routes.fetchGuilds
import android.util.Log
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
 * Builds a Discord CDN asset URL.
 *
 * NOTE: Discord's CDN rejects `.gif` requests with HTTP 415 ("Invalid resource")
 * even for animated `a_` hashes. `.png` (and `.webp`/`.jpeg`) all return 200, so we
 * always request `.png`. This keeps avatars / server icons / banners rendering.
 * e.g. https://cdn.discordapp.com/avatars/{user_id}/{hash}.png
 */
private fun discordCdnUrl(kind: String, id: String, hash: String): String {
    return "https://cdn.discordapp.com/$kind/$id/$hash.png"
}

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

    /**
     * Resolve a creation timestamp from an id that may be a Revolt ULID or a
     * Discord snowflake. Returns null if the id is neither (e.g. blank). Used by
     * Stoat UI that derives "joined/created" dates from [User.id].
     */
    fun idCreationTimestamp(id: String?): Long? {
        if (id == null) return null
        if (id.length == 26) {
            return runCatching { ULID.asTimestamp(id) }.getOrNull()
        }
        return snowflakeTimestamp(id)
    }

    fun adaptUser(u: DiscordUser?): User? {
        // Bind the cross-module nullable id to a local so it can be safely
        // smart-cast to non-null String (public API props in another module
        // cannot be smart-cast directly).
        val uid = u?.id ?: return null
        return User(
            id = uid,
            username = u.username,
            displayName = u.globalName,
            discriminator = u.discriminator,
            avatar = u.avatar?.let { h -> AutumnResource(id = discordCdnUrl("avatars", uid, h)) },
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
            icon = g.icon?.let { h -> AutumnResource(id = discordCdnUrl("icons", g.id ?: "", h)) },
            banner = g.banner?.let { h -> AutumnResource(id = discordCdnUrl("banners", g.id ?: "", h)) },
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

    /**
     * Seeds [StoatAPI] (and [DiscordAPI]) caches from REST endpoints so the UI has
     * servers, DMs and channels immediately, independent of the gateway. The
     * reduced guild objects from `/users/@me/guilds` lack [DiscordGuild.description]
     * and [DiscordGuild.banner]; those arrive later via gateway `GUILD_CREATE`,
     * which delivers the full guild object.
     */
    suspend fun populateFromRest() {
        runCatching {
            DiscordHttp.fetchGuilds().forEach { guild ->
                val gid = guild.id ?: return@forEach
                DiscordAPI.guildCache[gid] = guild
                val channels = runCatching { DiscordHttp.fetchGuildChannels(gid) }
                    .getOrElse { emptyList() }
                channels.forEach { ch ->
                    ch.id?.let { cid ->
                        DiscordAPI.channelCache[cid] = ch
                        StoatAPI.channelCache[cid] = adaptChannel(ch)
                    }
                }
                StoatAPI.serverCache[gid] = adaptServer(guild, channels.mapNotNull { it.id })
            }
            DiscordHttp.fetchDMs().forEach { ch ->
                ch.id?.let { cid ->
                    DiscordAPI.dmCache[cid] = ch
                    StoatAPI.channelCache[cid] = adaptChannel(ch)
                }
            }
        }.onFailure {
            Log.e("DiscordToStoat", "populateFromRest failed", it)
        }
    }
}
