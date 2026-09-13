package chat.stoat.internals

import chat.stoat.api.StoatAPI
import chat.stoat.api.internals.DiscordMappings
import chat.stoat.api.internals.PermissionBit
import chat.stoat.api.internals.Roles
import chat.stoat.api.internals.has
import chat.stoat.composables.chat.AutocompleteSuggestion
import chat.stoat.core.model.schemas.ChannelType
import chat.stoat.discord.DiscordAPI
import chat.stoat.discord.DiscordHttp
import chat.stoat.discord.routes.searchGuildMembers

object Autocomplete {
    private val emojiImpl = EmojiImpl()

    fun emoji(query: String): List<AutocompleteSuggestion.Emoji> {
        val unicodeResults = emojiImpl.shortcodeContains(query).map {
            AutocompleteSuggestion.Emoji(
                it.shortcodes.find { shortcode -> shortcode.contains(query, ignoreCase = true) }
                    ?: it.shortcodes.first(),
                it.base.joinToString("") { s -> String(Character.toChars(s.toInt())) },
                null,
                query
            )
        }.distinctBy { it.shortcode }

        // Custom emoji from the Discord backend's guild-emoji cache;
        // StoatAPI.emojiCache is the Revolt-backend cache and stays empty
        // there. The shortcode is the full Discord token (<:name:id> or the
        // animated <a:name:id> form) so insert-and-send just works.
        val customResults =
            DiscordAPI.emojiCache.values.filter {
                it.name?.contains(query, ignoreCase = true) == true && it.id != null
            }.mapNotNull {
                if (it.name != null && it.id != null) {
                    AutocompleteSuggestion.Emoji(
                        "<${if (it.animated) "a" else ""}:${it.name}:${it.id}>",
                        null,
                        chat.stoat.core.model.schemas.Emoji(
                            id = it.id,
                            parent = chat.stoat.core.model.schemas.EmojiParent(
                                type = "Server",
                                id = it.guildId
                            ),
                            name = it.name,
                            animated = it.animated,
                        ),
                        query
                    )
                } else {
                    null
                }
            }.distinctBy { it.custom?.id }

        return (unicodeResults + customResults)
    }

    suspend fun userOrRole(
        channelId: String,
        serverId: String? = null,
        query: String
    ): List<AutocompleteSuggestion> {
        val channel = StoatAPI.channelCache[channelId] ?: return emptyList()

        val member = serverId?.let { StoatAPI.members.getMember(serverId, StoatAPI.selfId ?: "") }
        val massMentionSuggestions = listOf("everyone", "online")
            .filter { it.startsWith(query, ignoreCase = true) }
        val hereIsOnlineMnemonic = if (query == "here") listOf("online") else emptyList()

        val selfPermissions = StoatAPI.channelCache[channelId]?.let { ch ->
            Roles.permissionFor(
                ch,
                StoatAPI.userCache[StoatAPI.selfId],
                member
            )
        }

        fun userMatches(u: chat.stoat.core.model.schemas.User): Boolean {
            // Match on both the username and the display/global name; Discord
            // users are most often addressed by their display name.
            return u.displayName?.contains(query, ignoreCase = true) == true ||
                    u.username?.contains(query, ignoreCase = true) == true
        }

        return when (channel.channelType) {
            ChannelType.DirectMessage -> {
                val otherUser = channel.recipients?.find { it != StoatAPI.selfId }
                if (otherUser != null) {
                    val user = StoatAPI.userCache[otherUser]
                    if (user != null && userMatches(user)) {
                        listOf(
                            AutocompleteSuggestion.User(
                                user,
                                null,
                                query
                            )
                        )
                    } else {
                        emptyList()
                    }
                } else {
                    emptyList()
                }
            }

            ChannelType.Group -> {
                val users =
                    channel.recipients?.mapNotNull { StoatAPI.userCache[it] } ?: emptyList()
                users
                    .filter(::userMatches)
                    .map {
                        AutocompleteSuggestion.User(
                            it,
                            null,
                            query
                        )
                    }
            }

            ChannelType.SavedMessages -> {
                val user = StoatAPI.userCache[StoatAPI.selfId]
                return if (user != null && userMatches(user)) {
                    listOf(
                        AutocompleteSuggestion.User(
                            user,
                            null,
                            query
                        )
                    )
                } else {
                    emptyList()
                }
            }

            ChannelType.TextChannel, ChannelType.VoiceChannel -> {
                if (serverId == null) return emptyList()
                if (query.isEmpty()) return emptyList()

                val roles =
                    if (selfPermissions has PermissionBit.MentionRoles) StoatAPI.serverCache[serverId]?.roles
                        ?: emptyMap() else emptyMap()
                val byNickname = StoatAPI.members.filterNamesFor(serverId, query)
                    .map { m -> m to StoatAPI.userCache[m.id?.user] }.filter { (_, u) ->
                        u != null
                    }.map { (m, u) ->
                        m to u!!
                    }
                val byUsername = StoatAPI.userCache.values.filter(::userMatches)
                    .mapNotNull {
                        it.id?.let { id ->
                            StoatAPI.members.getMember(
                                serverId,
                                id
                            ) to it
                        }
                    }.filter { (member, _) ->
                        member != null
                    }.map { (member, user) ->
                        member!! to user
                    }

                val allUsers = (byNickname + byUsername).distinctBy { it.first.id }

                // Server-side search fills the gap: the gateway only delivers
                // members for the subscribed member-list ranges (~the first
                // 100), so most of the guild is unknown locally. Results are
                // cached into the same stores the UI reads, so member roles
                // (name colours) resolve too.
                val combined = if (allUsers.size < 10) {
                    val found = DiscordHttp.searchGuildMembers(serverId, query, limit = 10)
                    found.forEach { dm ->
                        DiscordMappings.cacheMemberUser(dm)
                        DiscordMappings.adaptMember(serverId, dm)?.let { adapted ->
                            if (adapted.id != null) {
                                StoatAPI.members.setMember(serverId, adapted)
                            }
                        }
                    }
                    val searched = found.mapNotNull { dm ->
                        val dmUser = dm.user ?: return@mapNotNull null
                        val adaptedUser =
                            DiscordMappings.adaptUser(dmUser) ?: return@mapNotNull null
                        val dmMember = StoatAPI.members.getMember(serverId, dmUser.id ?: "")
                            ?: return@mapNotNull null
                        dmMember to adaptedUser
                    }.filter { (m, _) ->
                        allUsers.none { it.first.id?.user == m.id?.user }
                    }
                    allUsers + searched
                } else {
                    allUsers
                }

                val rolesByName =
                    roles.filter { it.value.name?.contains(query, ignoreCase = true) == true }
                        .map { it.value to it.key }


                (combined.map {
                    AutocompleteSuggestion.User(
                        it.second,
                        it.first,
                        query
                    )
                } + rolesByName.map { (role, roleId) ->
                    AutocompleteSuggestion.Role(
                        role,
                        roleId,
                        query
                    )
                })
                    .sortedBy {
                        when (it) {
                            is AutocompleteSuggestion.User -> it.user.username
                            is AutocompleteSuggestion.Role -> it.role.name
                            else -> ""
                        }
                    }
            }

            null -> emptyList()
        } + if (selfPermissions has PermissionBit.MentionEveryone) (massMentionSuggestions + hereIsOnlineMnemonic).map { mention ->
            AutocompleteSuggestion.MassMention(mention)
        } else listOf()
    }

    fun channel(
        serverId: String,
        query: String
    ): List<AutocompleteSuggestion.Channel> {
        val server = StoatAPI.serverCache[serverId] ?: return emptyList()
        val channels = server.channels?.mapNotNull { StoatAPI.channelCache[it] } ?: emptyList()

        return channels.filter { it.name?.contains(query, ignoreCase = true) == true }.map {
            AutocompleteSuggestion.Channel(
                it,
                query
            )
        }
    }
}