package chat.stoat.core.discord.models

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive

/** Discord channel types. See https://docs.discord.food/resources/channel#channel-object */
object DiscordChannelType {
    const val GUILD_TEXT = 0
    const val DM = 1
    const val GUILD_VOICE = 2
    const val GROUP_DM = 3
    const val GUILD_CATEGORY = 4
    const val GUILD_ANNOUNCEMENT = 5
    const val ANNOUNCEMENT_THREAD = 10
    const val PUBLIC_THREAD = 11
    const val PRIVATE_THREAD = 12
    const val GUILD_STAGE_VOICE = 13
    const val GUILD_DIRECTORY = 14
    const val GUILD_FORUM = 15
}

@Serializable
data class DiscordChannel(
    val id: String? = null,
    val type: Int = DiscordChannelType.GUILD_TEXT,
    @SerialName("guild_id")
    val guildId: String? = null,
    val name: String? = null,
    val topic: String? = null,
    val position: Int? = null,
    val nsfw: Boolean = false,
    val recipients: List<DiscordUser>? = null,
    @SerialName("last_message_id")
    val lastMessageId: String? = null,
    @SerialName("parent_id")
    val parentId: String? = null,
    val icon: String? = null,
    @SerialName("permission_overwrites")
    val permissionOverwrites: List<DiscordPermissionOverwrite>? = null,
) {
    /** A human-readable name for a channel, falling back to recipients for DMs. */
    fun displayName(): String {
        if (!name.isNullOrBlank()) return name
        return when (type) {
            DiscordChannelType.DM, DiscordChannelType.GROUP_DM -> {
                recipients?.joinToString(", ") { it.displayName() }?.takeIf { it.isNotBlank() }
                    ?: "Direct Message"
            }
            else -> "Unnamed Channel"
        }
    }
}

/**
 * The overwrite "type" comes in two shapes depending on the surface: REST (v9)
 * sends an int (0=role, 1=member) while the v10 gateway (user sessions) sends
 * a string ("role"/"member"). The string form was observed live in
 * READY.guilds[].channels[] and crashed the whole READY dispatch with
 * "Failed to parse literal '"role"' as an int value". This serializer
 * normalizes both shapes (plus legacy "0"/"1" strings) to the int form so the
 * permission code can keep comparing against 0/1.
 */
object PermissionOverwriteTypeSerializer : KSerializer<Int> {
    override val descriptor =
        PrimitiveSerialDescriptor("PermissionOverwriteType", PrimitiveKind.INT)

    override fun serialize(encoder: Encoder, value: Int) = encoder.encodeInt(value)

    override fun deserialize(decoder: Decoder): Int {
        val element = decoder.decodeSerializableValue(JsonElement.serializer())
        val primitive = element as? JsonPrimitive ?: return 0
        return when {
            !primitive.isString -> primitive.content.toIntOrNull() ?: 0
            primitive.content == "role" -> 0
            primitive.content == "member" -> 1
            else -> primitive.content.toIntOrNull() ?: 0
        }
    }
}

/**
 * Permission bitfields (allow/deny) arrive as JSON STRINGS from REST
 * ("1071698660925") but as JSON NUMBERS from the v10 gateway (3072). The
 * model stores them as String (REST convention; consumers use toLongOrNull),
 * so this serializer accepts both shapes and normalizes to the string form.
 */
object PermissionBitfieldSerializer : KSerializer<String?> {
    override val descriptor =
        PrimitiveSerialDescriptor("PermissionBitfield", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: String?) =
        if (value == null) encoder.encodeNull() else encoder.encodeString(value)

    override fun deserialize(decoder: Decoder): String? {
        return when (val element = decoder.decodeSerializableValue(JsonElement.serializer())) {
            is JsonNull -> null
            is JsonPrimitive -> element.content
            else -> null
        }
    }
}

@Serializable
data class DiscordPermissionOverwrite(
    val id: String? = null,
    @Serializable(with = PermissionOverwriteTypeSerializer::class)
    val type: Int = 0,
    @Serializable(with = PermissionBitfieldSerializer::class)
    val allow: String? = null,
    @Serializable(with = PermissionBitfieldSerializer::class)
    val deny: String? = null,
)
