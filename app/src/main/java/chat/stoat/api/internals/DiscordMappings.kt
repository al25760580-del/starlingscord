package chat.stoat.api.internals

import android.util.Log
import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.ULID
import chat.stoat.core.discord.models.DiscordChannel
import chat.stoat.core.discord.models.DiscordChannelType
import chat.stoat.core.discord.models.DiscordEmbed
import chat.stoat.core.discord.models.DiscordGuild
import chat.stoat.core.discord.models.DiscordGuildEmoji
import chat.stoat.core.discord.models.DiscordMember
import chat.stoat.core.discord.models.DiscordMessage
import chat.stoat.core.discord.models.DiscordReaction
import chat.stoat.core.discord.models.DiscordUser
import chat.stoat.core.discord.models.GatewayReady
import chat.stoat.core.model.schemas.AutumnResource
import chat.stoat.core.model.schemas.Category
import chat.stoat.core.discord.models.DiscordRole
import chat.stoat.core.model.schemas.Profile
import chat.stoat.core.model.schemas.Role
import chat.stoat.core.discord.models.DiscordUserProfile
import chat.stoat.core.model.schemas.Channel
import chat.stoat.core.model.schemas.ChannelType
import chat.stoat.core.model.schemas.Emoji
import chat.stoat.core.model.schemas.EmojiParent
import chat.stoat.core.model.schemas.Embed
import chat.stoat.core.model.schemas.Image
import chat.stoat.core.model.schemas.Member
import chat.stoat.core.model.schemas.Message
import chat.stoat.core.model.schemas.Server
import chat.stoat.core.model.schemas.ServerUserChoice
import chat.stoat.core.model.schemas.ServerWithChannelObjects
import chat.stoat.core.model.schemas.User
import chat.stoat.core.model.schemas.UserBadges
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.fetchDMs
import chat.stoat.discord.routes.fetchGuildChannels
import chat.stoat.discord.routes.fetchGuildEmojis
import chat.stoat.discord.routes.fetchGuildRoles
import chat.stoat.discord.routes.fetchGuilds
import chat.stoat.discord.routes.fetchSelfGuildMember

/**
 * Response mappers for the Discord backend.
 *
 * This is the transport-layer mapping of the (single, exclusive) Discord
 * backend into the app's UI models ([chat.stoat.core.model.schemas]) —
 * the equivalent of what a REST client's DTO mappers do in any app.
 *
 * ID strategy: Discord uses decimal snowflakes. The UI derives timestamps
 * from message ids via [ULID.asTimestamp], so message ids are converted to
 * ULIDs derived from the snowflake's embedded timestamp. Every other id
 * (users, channels, servers, members) keeps its raw snowflake string and is
 * used consistently as a cache key across [StoatAPI]. [DiscordAPI.idMap]
 * keeps the ULID -> snowflake mapping for round-tripping actions.
 */
object DiscordMappings {
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

    /**
     * Convert a Discord snowflake to a ULID (used for message ids).
     *
     * The ULID is DETERMINISTIC: its entropy bytes are the big-endian
     * snowflake itself, so the same snowflake always maps to the same ULID.
     * This keeps reply references, message cache keys and idMap round-trips
     * consistent no matter which code path adapted the message.
     */
    /**
     * Prefix for placeholder reactor ids that carry Discord's server-side
     * reaction counts into the UI's Map<String, List<String>> model. Real
     * user ids replace these as MESSAGE_REACTION_ADD events arrive.
     */
    const val REACTION_GHOST_PREFIX = "react-ghost:"

    fun snowflakeToUlid(snowflake: String?): String? {
        val ts = snowflakeTimestamp(snowflake) ?: return null
        val sf = snowflake?.toLongOrNull() ?: return null
        val entropy = ByteArray(10)
        for (i in 0 until 8) {
            entropy[i] = (sf ushr (8 * (7 - i))).toByte()
        }
        return runCatching { ULID.makeSpecial(ts, entropy) }.getOrNull()
    }

    /**
     * Resolve a creation timestamp from an id that may be a ULID or a Discord
     * snowflake. Returns null if the id is neither (e.g. blank). Used by UI
     * that derives "joined/created" dates from ids.
     */
    fun idCreationTimestamp(id: String?): Long? {
        if (id == null) return null
        if (id.length == 26) {
            return runCatching { ULID.asTimestamp(id) }.getOrNull()
        }
        return snowflakeTimestamp(id)
    }

    /** Map a (message) id as used by the UI back to a Discord snowflake. */
    fun idForRequest(id: String): String = DiscordAPI.idMap[id] ?: id

    /** Reverse of [idForRequest]: maps a Discord snowflake back to its ULID. */
    fun ulidForRequest(snowflake: String): String? =
        DiscordAPI.idMap.entries.firstOrNull { it.value == snowflake }?.key

    fun adaptUser(u: DiscordUser?, profile: DiscordUserProfile? = null): User? {
        // Bind the cross-module nullable id to a local so it can be safely
        // smart-cast to non-null String (public API props in another module
        // cannot be smart-cast directly).
        val uid = u?.id ?: return null
        val meta = profile?.userProfile
        return User(
            id = uid,
            username = u.username,
            displayName = u.globalName,
            discriminator = u.discriminator,
            avatar = u.avatar?.let { h -> AutumnResource(id = discordCdnUrl("avatars", uid, h)) },
            badges = legacyBadgesFromPublicFlags(u.publicFlags),
            pronouns = meta?.pronouns,
            profile = Profile(
                content = meta?.bio ?: u.bio,
                background = (meta?.banner ?: u.banner)?.let { h ->
                    AutumnResource(id = discordCdnUrl("banners", uid, h, size = 2048))
                },
            ),
        )
    }

    /**
     * Maps a Discord role onto the app's [Role] model and registers the raw
     * permission bits in [DiscordAPI.roleCache] for the permission calculator.
     * Discord role positions grow upwards; the app's rank shrinks upwards, so
     * position is negated. The @everyone role's ID equals the guild's ID.
     */
    fun adaptRole(r: DiscordRole): Role? {
        val rid = r.id ?: return null
        DiscordAPI.roleCache[rid] = r
        val colourInt = r.colors?.primaryColor ?: r.color ?: 0L
        return Role(
            name = r.name,
            colour = if (colourInt != 0L) {
                String.format("#%06X", colourInt and 0xFFFFFF)
            } else {
                null
            },
            hoist = r.hoist,
            rank = -(r.position ?: 0).toDouble(),
            icon = r.icon?.let { h ->
                AutumnResource(id = "https://cdn.discordapp.com/role-icons/$rid/$h.png")
            },
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
     * directories and threads are excluded — categories are rendered as
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
     * - Derives [Category] objects from Discord category channels, each carrying
     *   the ids of the channels nested under it (in position order).
     * - Records top-level channel ids on [Server.channels].
     *
     * Crucially, if this payload yields no channels/categories it PRESERVES the
     * already-cached ones, so a flaky REST/gateway fetch can never wipe out
     * channels that were already being shown.
     */
    fun upsertServer(gid: String, guild: DiscordGuild, rawChannels: List<DiscordChannel>) {
        val listable = rawChannels.filter { isListableChannel(it.type) }
        // Keep the raw channel objects (with permission overwrites) around for
        // the permission calculator.
        rawChannels.forEach { ch -> ch.id?.let { DiscordAPI.channelCache[it] = ch } }
        // /users/@me/guilds carries the computed base permissions for the user.
        guild.permissions?.toLongOrNull()?.let { DiscordAPI.guildPermissions[gid] = it }
        listable.forEach { ch -> ch.id?.let { StoatAPI.channelCache[it] = adaptChannel(ch) } }

        val categories = rawChannels.filter { it.type == DiscordChannelType.GUILD_CATEGORY }
        val categoryIds = categories.mapNotNull { it.id }.toSet()

        val uiCategories = categories.sortedBy { it.position ?: 0 }.mapNotNull { cat ->
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

        // Roles: adapted into the app model (colours, hoist, rank, icon) and
        // registered raw for permission computation.
        val rolesMap = buildMap {
            guild.roles?.forEach { r ->
                r.id?.let { rid -> adaptRole(r)?.let { adapted -> put(rid, adapted) } }
            }
            // Preserve roles already cached from a previous payload.
            base.roles?.forEach { (rid, role) -> if (!containsKey(rid)) put(rid, role) }
        }

        StoatAPI.serverCache[gid] = Server(
            id = gid,
            owner = guild.ownerId ?: base.owner,
            name = guild.name ?: base.name,
            description = guild.description ?: base.description,
            channels = if (topLevel.isNotEmpty()) topLevel else base.channels,
            categories = if (uiCategories.isNotEmpty()) uiCategories else base.categories,
            roles = if (rolesMap.isNotEmpty()) rolesMap else base.roles,
            icon = guild.icon?.let { h -> AutumnResource(id = discordCdnUrl("icons", gid, h)) }
                ?: base.icon,
            banner = guild.banner?.let { h ->
                AutumnResource(id = discordCdnUrl("banners", gid, h, size = 2048))
            } ?: base.banner,
        )

        // Hide channels the user cannot view (VIEW_CHANNEL), now that roles,
        // raw channels and guild permissions are all in place.
        refilterServerChannelVisibility(gid)
    }

    /**
     * Re-applies the VIEW_CHANNEL filter to a cached server's channel list.
     * Runs after every upsert (and after the self member arrives) so channels
     * hidden by overwrites disappear once permission data is available.
     */
    fun refilterServerChannelVisibility(gid: String) {
        val server = StoatAPI.serverCache[gid] ?: return
        val uid = DiscordAPI.selfId ?: return
        val base = Roles.guildBasePermissions(gid, uid)
        // No permission data yet (or admin/owner): keep everything visible.
        if (base == 0L || base has PermissionBit.Administrator) return

        fun visible(id: String): Boolean {
            val channel = StoatAPI.channelCache[id] ?: return true
            return Roles.permissionFor(channel, User(id = uid), null) has PermissionBit.ViewChannel
        }

        val filteredChannels = server.channels?.filter(::visible) ?: return
        val filteredCategories = server.categories
            ?.mapNotNull { cat ->
                val kept = cat.channels?.filter(::visible) ?: return@mapNotNull null
                if (kept.isEmpty()) null else cat.copy(channels = kept)
            }
            ?: return

        if (filteredChannels.size == server.channels?.size &&
            filteredCategories.size == server.categories?.size
        ) return // nothing changed

        StoatAPI.serverCache[gid] = server.copy(
            channels = filteredChannels,
            categories = filteredCategories,
        )
    }

    /** Cache a Discord guild member's user object so the UI can resolve names. */
    fun cacheMemberUser(member: DiscordMember?) {
        val u = member?.user ?: return
        val uid = u.id ?: return
        val adapted = adaptUser(u) ?: return
        val existing = StoatAPI.userCache[uid]
        if (existing != null) {
            // Preserve the presence (from PRESENCE_UPDATE) and online flag.
            StoatAPI.userCache[uid] = adapted.copy(
                online = existing.online,
                status = existing.status,
            )
        } else {
            StoatAPI.userCache[uid] = adapted
        }
    }

    /** Map a Discord guild member onto the app's [Member] model. */
    fun adaptMember(serverId: String, m: DiscordMember): Member? {
        val uid = m.user?.id ?: return null
        return Member(
            id = ServerUserChoice(server = serverId, user = uid),
            joinedAt = m.joinedAt,
            nickname = m.nick,
            roles = m.roles,
            avatar = (m.avatar ?: m.user?.avatar)?.let { h ->
                AutumnResource(id = discordCdnUrl("avatars", uid, h))
            },
        )
    }

    /** Map a Discord guild emoji onto the app's [Emoji] model. */
    fun adaptEmoji(e: DiscordGuildEmoji, guildId: String?): Emoji {
        return Emoji(
            id = e.id,
            parent = EmojiParent(type = "Server", id = guildId ?: e.guildId),
            name = e.name,
            animated = e.animated,
        )
    }

    /** Map a guild + its raw channels into a [ServerWithChannelObjects]. */
    fun adaptServerWithChannels(guild: DiscordGuild, rawChannels: List<DiscordChannel>): ServerWithChannelObjects {
        upsertServer(guild.id ?: "", guild, rawChannels)
        val server = StoatAPI.serverCache[guild.id ?: ""]
        return ServerWithChannelObjects(
            id = guild.id,
            owner = guild.ownerId,
            name = guild.name,
            description = guild.description,
            channels = StoatAPI.channelCache.values.filter { it.server == guild.id },
            categories = server?.categories,
            icon = server?.icon,
            banner = server?.banner,
        )
    }

    fun adaptMessage(m: DiscordMessage): Message? {
        val id = snowflakeToUlid(m.id) ?: return null
        val embeds = buildList {
            m.embeds?.forEach { e -> add(adaptEmbed(e)) }
            m.attachments?.forEach { a ->
                val url = a.url ?: return@forEach
                val ct = a.contentType?.lowercase().orEmpty()
                val name = a.filename?.lowercase().orEmpty()
                val isImage = ct.startsWith("image/") ||
                        listOf(".png", ".jpg", ".jpeg", ".gif", ".webp").any { name.endsWith(it) }
                val isVideo = ct.startsWith("video/") ||
                        listOf(".mp4", ".webm", ".mov").any { name.endsWith(it) }
                when {
                    // Regular video attachments get a full player with
                    // controls; only gifv embeds (Tenor) render GIF-like.
                    isVideo -> add(
                        Embed(
                            type = "Video",
                            url = url,
                            video = Image(
                                url = url,
                                width = a.width?.toLong(),
                                height = a.height?.toLong(),
                            ),
                            width = a.width?.toLong(),
                            height = a.height?.toLong(),
                        )
                    )

                    isImage -> add(
                        Embed(
                            type = "Image",
                            url = url,
                            width = a.width?.toLong() ?: 480L,
                            height = a.height?.toLong() ?: 360L,
                        )
                    )

                    // Generic files render as a small card linking to the file.
                    else -> add(
                        Embed(
                            type = "Website",
                            url = url,
                            originalURL = url,
                            title = a.filename ?: "File",
                            siteName = a.contentType ?: "File",
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
            // Carried so the UI can match this message against the optimistic
            // pending bubble created at send time (Discord echoes the nonce
            // on both the REST response and the gateway MESSAGE_CREATE).
            nonce = m.nonce,
            embeds = embeds.ifEmpty { null },
            mentions = m.mentions?.mapNotNull { it.id },
            pinned = m.pinned,
            replies = replies,
            reactions = m.reactions?.let { mapDiscordReactions(m, it) },
        )
        m.id?.let { DiscordAPI.idMap[id] = it }

        // Register the replied-to message's snowflake under its (deterministic)
        // ULID so InReplyTo can round-trip the id even when the referenced
        // message itself has never been cached.
        m.messageReference?.messageId?.let { refSf ->
            snowflakeToUlid(refSf)?.let { refUlid -> DiscordAPI.idMap[refUlid] = refSf }
        }

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

    /** Cache a fully-adapted message and return it. */
    fun cacheMessage(m: DiscordMessage): Message? {
        val adapted = adaptMessage(m) ?: return null
        adapted.id?.let { StoatAPI.messageCache[it] = adapted }
        return adapted
    }

    /**
     * Map Discord reactions onto the `reactions: Map<emojiKey, List<userId>>`
     * shape. The key is the emoji's snowflake id (custom) or its char (unicode);
     * the list contains the self user when [DiscordReaction.me] is true so the
     * Reaction UI can show the "own reaction" highlight + toggle.
     */
    private fun mapDiscordReactions(
        m: DiscordMessage,
        reactions: List<DiscordReaction>,
    ): Map<String, List<String>> {
        val selfId = StoatAPI.selfId
        val map = mutableMapOf<String, List<String>>()
        reactions.forEach { r ->
            val emoji = r.emoji ?: return@forEach
            val key = emoji.id ?: emoji.name ?: return@forEach
            // Register custom emojis (even foreign ones) so reaction chips can
            // load the CDN asset and the react routes can build name:id.
            val eid = emoji.id
            if (eid != null && emoji.name != null && eid !in DiscordAPI.emojiCache) {
                // guildId=null: reaction emojis may come from foreign servers;
                // they must render (CDN) but not pollute the picker's sections.
                DiscordAPI.emojiCache[eid] = DiscordGuildEmoji(
                    id = eid,
                    name = emoji.name,
                    animated = emoji.animated,
                    guildId = null,
                )
            }
            // The app model counts a reaction as the size of its reactor id
            // list, but Discord only ships a count: pad with ghost ids.
            val list = mutableListOf<String>()
            if (r.me && selfId != null) list.add(selfId)
            while (list.size < r.count) {
                list.add("$REACTION_GHOST_PREFIX$key-${list.size}")
            }
            map[key] = list
            Log.d(
                "StoatReact",
                "reaction emoji=$key count=${r.count} me=${r.me} " +
                    "ghosts=${list.size - if (r.me && selfId != null) 1 else 0}",
            )
        }
        return map
    }

    /**
     * GIF providers whose mp4 "gifv" media the official clients play inline
     * like an autoplaying, looping GIF. Hardcoded, like Discord does; any
     * other video (including every attachment) gets the full player.
     */
    private val GIF_PROVIDER_HOSTS = listOf(
        "tenor.com", // Google Tenor (the classic GIF picker source)
        "giphy.com", // Giphy (Discord's other GIF provider)
        "klipy.com", // Klipy (founded by the Tenor team; Discord's new default)
    )

    private fun isGifProviderUrl(url: String?): Boolean {
        val host = runCatching { java.net.URI(url ?: return false).host }.getOrNull()
            ?: return false
        return GIF_PROVIDER_HOSTS.any { host == it || host.endsWith(".$it") }
    }

    private fun adaptEmbed(e: DiscordEmbed): Embed {
        val colour = e.color?.let { String.format("#%06X", it and 0xFFFFFF) }

        // Like the official client:
        //  - gifv media from GIF providers (Tenor/Giphy/Klipy) plays inline
        //    as an autoplaying looping GIF;
        //  - direct video FILES (.mp4/.webm/.mov) get the full player;
        //  - everything else with a video field (YouTube etc. embeds, whose
        //    video.url is an iframe page, NOT a playable file) renders as a
        //    website card with the thumbnail - never a broken player.
        val video = e.video
        val videoUrl = video?.url
        if (videoUrl != null) {
            val gifProvider = isGifProviderUrl(videoUrl) || isGifProviderUrl(e.url)
            val isDirectVideoFile = listOf(".mp4", ".webm", ".mov").any {
                videoUrl.substringBefore('?').endsWith(it)
            }
            when {
                // Tenor/Giphy/Klipy gifv: inline looping GIF.
                gifProvider -> return Embed(
                    type = "Gif",
                    url = e.url ?: videoUrl,
                    originalURL = e.url,
                    video = Image(
                        url = videoUrl,
                        width = video?.width?.toLong(),
                        height = video?.height?.toLong(),
                    ),
                    width = video?.width?.toLong(),
                    height = video?.height?.toLong(),
                )

                // Direct playable video file: full player with controls.
                isDirectVideoFile -> return Embed(
                    type = "Video",
                    url = videoUrl,
                    originalURL = e.url ?: videoUrl,
                    video = Image(
                        url = videoUrl,
                        width = video?.width?.toLong(),
                        height = video?.height?.toLong(),
                    ),
                    width = video?.width?.toLong(),
                    height = video?.height?.toLong(),
                )

                // YouTube and friends (video.url is a page, not a file):
                // fall through to the website card with the thumbnail.
            }
        }

        // Bare image links arrive as type "image" with just an image field:
        // render them as full-width images, not as website cards.
        val image = e.image
        if (e.type == "image" && image?.url != null) {
            return Embed(
                type = "Image",
                url = image.url,
                width = image.width?.toLong() ?: 480L,
                height = image.height?.toLong() ?: 360L,
            )
        }

        return Embed(
            type = "Website",
            url = e.url,
            originalURL = e.url,
            title = e.title ?: e.author?.name,
            description = e.description,
            image = (e.image ?: e.thumbnail)?.let { m ->
                Image(url = m.url, width = m.width?.toLong(), height = m.height?.toLong())
            },
            iconURL = e.author?.iconUrl ?: e.footer?.iconUrl,
            siteName = e.provider?.name,
            colour = colour,
        )
    }

    /**
     * Populates [StoatAPI] caches from a Discord gateway READY event so that all
     * existing screens render Discord data. Channels are fetched per guild via
     * REST because the READY guild objects are reduced (no channels).
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
            hydrateSelfMember(gid)
            hydrateGuildRoles(gid, guild.roles)
            runCatching { DiscordHttp.fetchGuildEmojis(gid) }
                .getOrElse { emptyList() }
                .forEach { e -> e.id?.let { DiscordAPI.emojiCache[it] = e } }
        }

        ready.privateChannels?.forEach { ch ->
            ch.id?.let { StoatAPI.channelCache[it] = adaptChannel(ch) }
        }
    }

    /**
     * Seeds the caches from REST endpoints so the UI has servers, DMs and
     * channels immediately, independent of the gateway. The reduced guild
     * objects from `/users/@me/guilds` lack description and banner; those
     * arrive later via gateway `GUILD_CREATE`, which delivers the full object.
     */
    suspend fun populateFromRest() {
        runCatching {
            DiscordHttp.fetchGuilds().forEach { guild ->
                val gid = guild.id ?: return@forEach
                DiscordAPI.guildCache[gid] = guild
                val channels = runCatching { DiscordHttp.fetchGuildChannels(gid) }
                    .getOrElse { emptyList() }
                upsertServer(gid, guild, channels)
                hydrateSelfMember(gid)
                hydrateGuildRoles(gid, guild.roles)
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
            Log.e("DiscordMappings", "populateFromRest failed", it)
        }
    }

    /**
     * Fetches and caches the logged-in user's own member object (role IDs,
     * nickname, timeout state) for a guild, then re-runs the channel
     * visibility filter with the fresh roles.
     */
    suspend fun hydrateSelfMember(gid: String) {
        runCatching {
            val sm = DiscordHttp.fetchSelfGuildMember(gid) ?: return@runCatching
            DiscordAPI.selfMembers[gid] = sm
            adaptMember(gid, sm)?.let { StoatAPI.members.setMember(gid, it) }
            refilterServerChannelVisibility(gid)
        }.onFailure { Log.w("DiscordMappings", "hydrateSelfMember($gid) failed", it) }
    }

    /**
     * If no roles arrived with the guild payload, fetches them via REST
     * (`GET /guilds/{id}/roles`) and re-runs the visibility filter.
     */
    suspend fun hydrateGuildRoles(gid: String, existing: List<DiscordRole>?) {
        if (!existing.isNullOrEmpty()) return
        runCatching {
            val roles = DiscordHttp.fetchGuildRoles(gid)
            if (roles.isEmpty()) return@runCatching
            val server = StoatAPI.serverCache[gid] ?: return@runCatching
            val rolesMap = buildMap {
                roles.forEach { r ->
                    r.id?.let { rid -> adaptRole(r)?.let { adapted -> put(rid, adapted) } }
                }
                server.roles?.forEach { (rid, role) -> if (!containsKey(rid)) put(rid, role) }
            }
            StoatAPI.serverCache[gid] = server.copy(roles = rolesMap)
            refilterServerChannelVisibility(gid)
        }.onFailure { Log.w("DiscordMappings", "hydrateGuildRoles($gid) failed", it) }
    }
}

/**
 * Translates Discord `public_flags` user badges onto the app's badge enum
 * (which speaks the legacy vocabulary), so the badge row in profile sheets
 * shows meaningful icons instead of mismatched bits.
 *
 * Discord bits: https://docs.discord.food/resources/user#user-flags
 */
private fun legacyBadgesFromPublicFlags(flags: Int?): Long {
    if (flags == null) return 0L
    fun has(bit: Int) = (flags shr bit) and 1 == 1

    var out = 0L
    // Staff -> platform team; Partner -> founder; HypeSquad events -> supporter.
    if (has(0)) out = out or UserBadges.PlatformModeration.value
    if (has(1)) out = out or UserBadges.Founder.value
    if (has(2)) out = out or UserBadges.Supporter.value
    // Bug Hunter (levels 1 and 2) -> responsible disclosure.
    if (has(3) || has(16)) out = out or UserBadges.ResponsibleDisclosure.value
    // Early Supporter -> early adopter.
    if (has(11)) out = out or UserBadges.EarlyAdopter.value
    // Verified Bot Developer / Active Developer -> developer.
    if (has(17) || has(18)) out = out or UserBadges.Developer.value
    return out
}

/**
 * Builds a Discord CDN asset URL.
 *
 * NOTE: Discord's CDN rejects `.gif` requests with HTTP 415 ("Invalid resource")
 * even for animated `a_` hashes. `.png` (and `.webp`/`.jpeg`) all return 200, so
 * we always request `.png`. This keeps avatars / server icons / banners
 * rendering. e.g. https://cdn.discordapp.com/avatars/{user_id}/{hash}.png
 */
internal fun discordCdnUrl(kind: String, id: String, hash: String, size: Int? = null): String {
    val base = "https://cdn.discordapp.com/$kind/$id/$hash.png"
    // Without ?size=N the CDN serves banners at 600x240, which looks blurry
    // when stretched full-width. Powers of two, 16..4096, are accepted.
    return if (size != null) "$base?size=$size" else base
}
