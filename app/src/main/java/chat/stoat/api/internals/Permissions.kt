package chat.stoat.api.internals

/**
 * Discord's bitwise permission flags, as documented at
 * https://docs.discord.food/topics/permissions.
 *
 * The enum members carry the names used across the UI; where the UI still
 * speaks the old Revolt vocabulary (SendMessage, InviteOthers, ...), legacy
 * aliases point at the matching Discord bit.
 */
enum class PermissionBit(val value: Long) {
    // * Discord guild permissions
    CreateInstantInvite(1L shl 0),   // CREATE_INSTANT_INVITE
    KickMembers(1L shl 1),           // KICK_MEMBERS
    BanMembers(1L shl 2),            // BAN_MEMBERS
    Administrator(1L shl 3),         // ADMINISTRATOR
    ManageChannel(1L shl 4),         // MANAGE_CHANNELS
    ManageServer(1L shl 5),          // MANAGE_GUILD
    AddReactions(1L shl 6),          // ADD_REACTIONS
    ViewAuditLog(1L shl 7),          // VIEW_AUDIT_LOG
    PrioritySpeaker(1L shl 8),       // PRIORITY_SPEAKER
    Stream(1L shl 9),                // STREAM
    ViewChannel(1L shl 10),          // VIEW_CHANNEL
    SendMessage(1L shl 11),          // SEND_MESSAGES
    SendTtsMessages(1L shl 12),      // SEND_TTS_MESSAGES
    ManageMessages(1L shl 13),       // MANAGE_MESSAGES
    EmbedLinks(1L shl 14),           // EMBED_LINKS
    AttachFiles(1L shl 15),          // ATTACH_FILES
    ReadMessageHistory(1L shl 16),   // READ_MESSAGE_HISTORY
    MentionEveryone(1L shl 17),      // MENTION_EVERYONE
    UseExternalEmojis(1L shl 18),    // USE_EXTERNAL_EMOJIS
    ViewGuildInsights(1L shl 19),    // VIEW_GUILD_INSIGHTS
    Connect(1L shl 20),              // CONNECT
    Speak(1L shl 21),                // SPEAK
    MuteMembers(1L shl 22),          // MUTE_MEMBERS
    DeafenMembers(1L shl 23),        // DEAFEN_MEMBERS
    MoveMembers(1L shl 24),          // MOVE_MEMBERS
    UseVad(1L shl 25),               // USE_VAD
    ChangeNickname(1L shl 26),       // CHANGE_NICKNAME
    ManageNicknames(1L shl 27),      // MANAGE_NICKNAMES
    ManageRoles(1L shl 28),          // MANAGE_ROLES
    ManageWebhooks(1L shl 29),       // MANAGE_WEBHOOKS
    ManageExpressions(1L shl 30),    // MANAGE_EXPRESSIONS
    UseApplicationCommands(1L shl 31), // USE_APPLICATION_COMMANDS
    RequestToSpeak(1L shl 32),       // REQUEST_TO_SPEAK
    ManageEvents(1L shl 33),         // MANAGE_EVENTS
    ManageThreads(1L shl 34),        // MANAGE_THREADS
    CreatePublicThreads(1L shl 35),  // CREATE_PUBLIC_THREADS
    CreatePrivateThreads(1L shl 36), // CREATE_PRIVATE_THREADS
    UseExternalStickers(1L shl 37),  // USE_EXTERNAL_STICKERS
    SendMessagesInThreads(1L shl 38), // SEND_MESSAGES_IN_THREADS
    UseEmbeddedActivities(1L shl 39), // USE_EMBEDDED_ACTIVITIES
    TimeoutMembers(1L shl 40),       // MODERATE_MEMBERS
    UseSoundboard(1L shl 42),        // USE_SOUNDBOARD
    CreateExpressions(1L shl 43),    // CREATE_EXPRESSIONS
    CreateEvents(1L shl 44),         // CREATE_EVENTS
    UseExternalSounds(1L shl 45),    // USE_EXTERNAL_SOUNDS
    SendVoiceMessages(1L shl 46),    // SEND_VOICE_MESSAGES
    SendPolls(1L shl 49),            // SEND_POLLS
    UseExternalApps(1L shl 50),      // USE_EXTERNAL_APPS
    PinMessages(1L shl 51),          // PIN_MESSAGES
    BypassSlowmode(1L shl 52),       // BYPASS_SLOWMODE

    // * Legacy (Revolt-vocabulary) aliases used by the existing UI
    ManagePermissions(1L shl 28),    // -> MANAGE_ROLES ("Manage Permissions")
    ManageRole(1L shl 28),           // -> MANAGE_ROLES
    ManageCustomisation(1L shl 30),  // -> MANAGE_EXPRESSIONS
    AssignRoles(1L shl 28),          // -> MANAGE_ROLES
    ChangeAvatar(1L shl 26),         // -> CHANGE_NICKNAME
    RemoveAvatars(1L shl 27),        // -> MANAGE_NICKNAMES
    InviteOthers(1L shl 0),          // -> CREATE_INSTANT_INVITE
    SendEmbeds(1L shl 14),           // -> EMBED_LINKS
    UploadFiles(1L shl 15),          // -> ATTACH_FILES
    Masquerade(1L shl 12),           // -> SEND_TTS_MESSAGES (no equivalent)
    React(1L shl 6),                 // -> ADD_REACTIONS
    Video(1L shl 9),                 // -> STREAM
    Listen(1L shl 21),               // -> SPEAK (no separate listen bit)
    MentionRoles(1L shl 17),         // -> MENTION_EVERYONE

    // * Grant all permissions
    /** Every permission Discord defines (bits 0-52, minus reserved gaps). */
    GrantAllSafe(0x001FFFFFFFFFFFFFL),
    GrantAll(Long.MAX_VALUE);

    operator fun plus(other: PermissionBit): Long {
        return this.value or other.value
    }

    operator fun plus(other: Long): Long {
        return this.value or other
    }
}

operator fun Long.plus(other: PermissionBit): Long {
    return this or other.value
}

fun Long.hasPermission(permission: PermissionBit): Boolean {
    return this and permission.value == permission.value
}

infix fun Long?.has(permission: PermissionBit): Boolean {
    return this != null && this.hasPermission(permission)
}

/**
 * Standard permission sets, mirroring what Discord grants implicitly.
 */
object BitDefaults {
    /** What a timed-out (communication-disabled) member can still do. */
    val AllowedInTimeout =
        PermissionBit.ViewChannel + PermissionBit.ReadMessageHistory

    val ViewOnly =
        PermissionBit.ViewChannel + PermissionBit.ReadMessageHistory

    /** Typical guild text permissions. */
    val Default =
        ViewOnly +
                PermissionBit.SendMessage +
                PermissionBit.SendMessagesInThreads +
                PermissionBit.CreatePublicThreads +
                PermissionBit.InviteOthers +
                PermissionBit.SendEmbeds +
                PermissionBit.UploadFiles +
                PermissionBit.React +
                PermissionBit.UseExternalEmojis +
                PermissionBit.MentionEveryone +
                PermissionBit.Connect +
                PermissionBit.Speak +
                PermissionBit.Listen

    val SavedMessages =
        PermissionBit.GrantAllSafe.value

    /** Everything reachable in a DM: Discord imposes no permission gates there. */
    val DirectMessages =
        Default +
                PermissionBit.ManageChannel +
                PermissionBit.ManageMessages +
                PermissionBit.SendTtsMessages +
                PermissionBit.SendVoiceMessages

    /** Fallback when a guild has no parseable role permissions. */
    val Server =
        Default +
                PermissionBit.ChangeNickname

    val Webhook =
        PermissionBit.SendMessage + PermissionBit.SendEmbeds + PermissionBit.React
}
