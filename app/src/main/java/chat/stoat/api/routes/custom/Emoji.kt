package chat.stoat.api.routes.custom

import chat.stoat.api.internals.DiscordMappings
import chat.stoat.core.model.schemas.Emoji
import chat.stoat.discord.DiscordAPI

/**
 * Resolves an emoji by id from the guild-emoji cache filled at login / from
 * gateway GUILD_CREATE payloads.
 */
suspend fun fetchEmoji(id: String): Emoji {
    val cached = DiscordAPI.emojiCache[id]
        ?: return Emoji(id = id, name = "emoji")
    return DiscordMappings.adaptEmoji(cached, cached.guildId)
}
