package chat.stoat.discord

import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.ULID
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordChannelType
import chat.stoat.core.discord.models.DiscordEmbed
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordReaction
import chat.stoat.discord.routes.fetchDMs
import chat.stoat.discord.routes.fetchGuildChannels
import chat.stoat.discord.routes.fetchGuildEmojis
import chat.stoat.discord.routes.fetchGuilds
import android.util.Log
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.core.model.schemas.AutumnResource
import chat.stoat.core.model.schemas.Category
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

    /**
     * Channel types that belong in the channel list. Categories, forums,
     * directories and threads are excluded — categories are rendered as Revolt
     * [Category] headers instead, and the others don't map to a normal text row.
     */
    fun isListableChannel(type: Int): Boolean = when (type) {
        DiscordChannelType.GUILD_CATEGORY,
        DiscordChannelType.GUILD_FORUM,
        DiscordChannelType.GUILD_DIRECTORY,
        DiscordChannelType.ANNOUNCEMENT_THREAD,
        DiscordChannelType.PUBLIC_THREAD,
        DiscordChannelType.PRIVATE_THREAD -> false
        else -> true
    }

    /**
     * Update the cached [Server] for [gid] from a Discord guild + its channels.
     *
     * - Adapts listable channels into [StoatAPI.channelCache].
     * - Derives Revolt-style [Category] objects from Discord category channels,
     *   each carrying the ids of the channels nested under it (in position order).
     * - Records top-level channel ids on [Server.channels].
     *
     * Crucially, if this payload yields no channels/categories it PRESERVES the
     * already-cached ones, so a flaky REST/gateway fetch can never wipe out
     * channels that were already being shown (the intermittent
     * "channels appear then vanish" bug).
     */
    fun upsertServer(gid: String, guild: DiscordGuild, rawChannels: List<DiscordChannel>) {
        val listable = rawChannels.filter { isListableChannel(it.type) }
        listable.forEach { ch -> ch.id?.let { StoatAPI.channelCache[it] = adaptChannel(ch) } }

        val categories = rawChannels.filter { it.type == DiscordChannelType.GUILD_CATEGORY }
        val categoryIds = categories.mapNotNull { it.id }.toSet()

        val revoltCategories = categories.sortedBy { it.position ?: 0 }.mapNotNull { cat ->
            val cid = cat.id ?: return@mapNotNull null
            Category(
                id = cid,
                title = cat.name ?: "Category",
                // Children resolve by parent_id; sorted by position like Discord.
                channels = listable
                    .filter { it.type != DiscordChannelType.GUILD_CATEGORY && it.parentId == cid }
                    .sortedBy { it.position ?: 0 }
                    .mapNotNull { it.id },
            )
        }

        // Top-level = channels with no parent, or a parent that isn't a known
        // category (orphans) — so nothing gets dropped.
        val topLevel = listable
            .filter {
                it.type != DiscordChannelType.GUILD_CATEGORY &&
                    (it.parentId.isNullOrBlank() || it.parentId !in categoryIds)
            }
            .sortedBy { it.position ?: 0 }
            .mapNotNull { it.id }

        val existing = StoatAPI.serverCache[gid]
        val base = existing ?: Server(id = gid)
        StoatAPI.serverCache[gid] = Server(
            id = gid,
            owner = guild.ownerId ?: base.owner,
            name = guild.name ?: base.name,
            description = guild.description ?: base.description,
            channels = if (topLevel.isNotEmpty()) topLevel else base.channels,
            categories = if (revoltCategories.isNotEmpty()) revoltCategories else base.categories,
            icon = guild.icon?.let { h -> AutumnResource(id = discordCdnUrl("icons", gid, h)) }
                ?: base.icon,
            banner = guild.banner?.let { h -> AutumnResource(id = discordCdnUrl("banners", gid, h)) }
                ?: base.banner,
        )
    }

    /** Cache a Discord guild member's user object so the UI can resolve names. */
    fun cacheMemberUser(member: DiscordMember?) {
        val u = member?.user ?: return
        val uid = u.id ?: return
        StoatAPI.userCache[uid] = adaptUser(u) ?: return
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
        val replies = m.messageReference?.messageId?.let { snowflakeToUlid(it) }?.let { listOf(it) }

        val result = Message(
            id = id,
            channel = m.channelId,
            author = m.author?.id,
            content = m.content,
            embeds = embeds.ifEmpty { null },
            mentions = m.mentions?.mapNotNull { it.id },
            pinned = m.pinned,
            replies = replies,
            reactions = m.reactions?.let { mapDiscordReactions(it) },
        )
        m.id?.let { DiscordAPI.idMap[id] = it }

        // Cache the referenced (replied-to) message so the InReplyTo preview can
        // resolve it directly from StoatAPI.messageCache.
        m.referencedMessage?.let { ref ->
            val refId = snowflakeToUlid(ref.id)
            if (refId != null && refId !in StoatAPI.messageCache) {
                adaptMessage(ref)?.let { StoatAPI.messageCache[refId] = it }
            }
        }
        return result
    }

    /** Map Discord reactions onto Revolt's `reactions: Map<emojiKey, List<userId>>`
     *  shape. The key is the emoji's snowflake id (custom) or its char (unicode);
     *  the list contains the self user when [DiscordReaction.me] is true so the
     *  existing Reaction UI can show the "own reaction" highlight + toggle. */
    private fun mapDiscordReactions(reactions: List<DiscordReaction>): Map<String, List<String>> {
        val map = mutableMapOf<String, List<String>>()
        reactions.forEach { r ->
            val emoji = r.emoji ?: return@forEach
            val key = emoji.id ?: emoji.name ?: return@forEach
            map[key] = if (r.me) listOf(StoatAPI.selfId ?: "") else emptyList()
        }
        return map
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
            upsertServer(gid, guild, channels)
            runCatching { DiscordHttp.fetchGuildEmojis(gid) }
                .getOrElse { emptyList() }
                .forEach { e -> e.id?.let { DiscordAPI.emojiCache[it] = e } }
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
                upsertServer(gid, guild, channels)
                runCatching { DiscordHttp.fetchGuildEmojis(gid) }
                    .getOrElse { emptyList() }
                    .forEach { e -> e.id?.let { DiscordAPI.emojiCache[it] = e } }
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
