package chat.stoat.api.internals

import chat.stoat.api.StoatAPI
import chat.stoat.core.model.schemas.Channel
import chat.stoat.core.model.schemas.ChannelType
import chat.stoat.core.model.schemas.Member
import chat.stoat.core.model.schemas.Role
import chat.stoat.core.model.schemas.Server
import chat.stoat.core.model.schemas.User
import chat.stoat.discord.DiscordAPI
import java.time.Instant

/**
 * Role bookkeeping and Discord permission calculation.
 *
 * Implements the algorithm documented at
 * https://docs.discord.food/topics/permissions:
 *
 * 1. Base permissions: @everyone role permissions OR-ed with the member's
 *    roles' permissions (owner and ADMINISTRATOR grant everything).
 * 2. Channel overwrites: apply the @everyone overwrite, then the union of the
 *    member's roles' overwrites, then the member-specific overwrite.
 * 3. Timed-out members are restricted to [BitDefaults.AllowedInTimeout].
 */
object Roles {
    // lowest rank = highest role
    private fun highestRoleWithPredicate(roles: List<Role?>, predicate: (Role) -> Boolean): Role? {
        return roles.filter { role ->
            if (role == null) return@filter false
            predicate(role)
        }.minByOrNull { role ->
            role?.rank ?: 0.0
        }
    }

    fun resolveHighestRole(
        serverId: String,
        userId: String,
        withColour: Boolean = false,
        hoisted: Boolean = false
    ): Role? {
        val server = StoatAPI.serverCache[serverId] ?: return null
        val member = StoatAPI.members.getMember(serverId, userId) ?: return null

        val roles = member.roles?.map { roleId ->
            server.roles?.get(roleId)
        } ?: return null

        return highestRoleWithPredicate(roles) { role ->
            val hoistPredicate = if (hoisted) (role.hoist == true) else true
            val colourPredicate = if (withColour) (role.colour != null) else true

            hoistPredicate && colourPredicate
        }
    }

    fun inOrder(serverId: String, predicate: (Role) -> Boolean): List<Role> {
        val server = StoatAPI.serverCache[serverId] ?: return emptyList()

        return server.roles?.values?.filter(predicate)?.sortedBy { it.rank } ?: emptyList()
    }

    /** Whether the member is currently timed out (communication disabled). */
    fun isTimedOut(serverId: String, userId: String): Boolean {
        val until = DiscordAPI.selfMembers[serverId]?.communicationDisabledUntil
            ?: return false
        if (userId != DiscordAPI.selfId) return false
        return runCatching { Instant.parse(until) }
            .getOrNull()
            ?.isAfter(Instant.now()) == true
    }

    /**
     * Guild-level base permissions for [userId] in [serverId], excluding
     * channel overwrites. Mirrors `compute_base_permissions` from the docs.
     */
    fun guildBasePermissions(serverId: String, userId: String?): Long {
        val server = StoatAPI.serverCache[serverId] ?: return 0L
        val uid = userId ?: return 0L

        // The guild owner always has everything.
        if (server.owner == uid) return PermissionBit.GrantAllSafe.value

        // /users/@me/guilds conveniently carries the computed base permissions.
        DiscordAPI.guildPermissions[serverId]?.let {
            if (it != 0L) {
                return if (it has PermissionBit.Administrator) {
                    PermissionBit.GrantAllSafe.value
                } else {
                    it
                }
            }
        }

        // Fallback: compute from the cached roles.
        val member = StoatAPI.members.getMember(serverId, uid) ?: return 0L

        // @everyone role shares the guild's ID.
        var calculated = rolePermissions(serverId, serverId)
            ?: BitDefaults.Server

        member.roles?.forEach { roleId ->
            calculated = calculated or (rolePermissions(serverId, roleId) ?: 0L)
        }

        if (calculated has PermissionBit.Administrator) {
            return PermissionBit.GrantAllSafe.value
        }

        return calculated
    }

    /** Raw Discord permission bits for a cached role. */
    fun rolePermissions(serverId: String, roleId: String): Long? {
        DiscordAPI.roleCache[roleId]?.permissions?.toLongOrNull()?.let { return it }
        return null
    }

    /** Permissions of [user]/[member] inside a guild channel, overwrites applied. */
    fun permissionFor(channel: Channel, user: User? = null, member: Member? = null): Long {
        return when (channel.channelType) {
            ChannelType.SavedMessages -> BitDefaults.SavedMessages

            ChannelType.DirectMessage -> BitDefaults.DirectMessages

            ChannelType.Group -> if (channel.owner == user?.id) {
                PermissionBit.GrantAllSafe.value
            } else {
                BitDefaults.DirectMessages
            }

            ChannelType.TextChannel, ChannelType.VoiceChannel -> {
                val serverId = channel.server ?: return 0L
                val server = StoatAPI.serverCache[serverId]
                    // Don't lock the composer on launch if the server hasn't
                    // loaded yet; assume the member can act.
                    ?: return PermissionBit.GrantAllSafe.value

                val uid = user?.id ?: member?.id?.user ?: return 0L
                if (server.owner == uid) return PermissionBit.GrantAllSafe.value

                val base = guildBasePermissions(serverId, uid)
                if (base has PermissionBit.Administrator) {
                    return PermissionBit.GrantAllSafe.value
                }

                val chMember = member ?: StoatAPI.members.getMember(serverId, uid)
                val roleIds = chMember?.roles
                    ?: DiscordAPI.selfMembers[serverId]?.roles
                    ?: emptyList()

                var calculated = applyOverwrites(base, serverId, uid, roleIds, channel.id)

                if (isTimedOut(serverId, uid)) {
                    calculated = calculated and BitDefaults.AllowedInTimeout
                }

                return calculated
            }

            null -> 0L
        }
    }

    /**
     * Applies channel permission overwrites (@everyone, then the union of the
     * member's roles, then member-specific), per the docs' hierarchy.
     */
    private fun applyOverwrites(
        base: Long,
        serverId: String,
        userId: String,
        roleIds: List<String>,
        channelId: String?
    ): Long {
        val raw = DiscordAPI.channelCache[channelId ?: return base] ?: return base
        val overwrites = raw.permissionOverwrites ?: return base

        var calculated = base

        // 1. @everyone overwrite (role overwrite whose id == guild id).
        overwrites.firstOrNull { it.type == 0 && it.id == serverId }?.let { ow ->
            calculated = calculated and (ow.deny?.toLongOrNull() ?: 0L).inv()
            calculated = calculated or (ow.allow?.toLongOrNull() ?: 0L)
        }

        // 2. Role-specific overwrites: union allow/deny across all roles.
        val roleAllow = overwrites
            .filter { it.type == 0 && it.id != null && it.id in roleIds }
            .fold(0L) { acc, ow -> acc or (ow.allow?.toLongOrNull() ?: 0L) }
        val roleDeny = overwrites
            .filter { it.type == 0 && it.id != null && it.id in roleIds }
            .fold(0L) { acc, ow -> acc or (ow.deny?.toLongOrNull() ?: 0L) }
        calculated = calculated and roleDeny.inv()
        calculated = calculated or roleAllow

        // 3. Member-specific overwrite.
        overwrites.firstOrNull { it.type == 1 && it.id == userId }?.let { ow ->
            calculated = calculated and (ow.deny?.toLongOrNull() ?: 0L).inv()
            calculated = calculated or (ow.allow?.toLongOrNull() ?: 0L)
        }

        return calculated
    }

    /**
     * Guild-level permissions for a member (kept for the permission editor UI):
     * base permissions, no channel overwrites.
     */
    fun permissionFor(server: Server, member: Member): Long {
        val uid = member.id?.user ?: return 0L
        if (server.owner == uid) return PermissionBit.GrantAllSafe.value
        return guildBasePermissions(server.id ?: return 0L, uid)
    }
}
