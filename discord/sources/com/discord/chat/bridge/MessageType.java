package com.discord.chat.bridge;

import com.discord.chat.bridge.MessageType;
import com.discord.serialization.IntEnum;
import com.discord.serialization.IntEnumSerializer;
import com.facebook.imagepipeline.nativecode.b;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.discord.chat.bridge.MessageType, still in use, count: 1, list:
  (r0v1 com.discord.chat.bridge.MessageType) from 0x0330: INVOKE (r0v2 java.util.EnumSet) = 
  (r0v1 com.discord.chat.bridge.MessageType)
  (wrap com.discord.chat.bridge.MessageType[]:0x0328: FILLED_NEW_ARRAY 
  (r3v0 com.discord.chat.bridge.MessageType)
  (r4v0 com.discord.chat.bridge.MessageType)
  (r5v0 com.discord.chat.bridge.MessageType)
  (r6v0 com.discord.chat.bridge.MessageType)
  (r7v0 com.discord.chat.bridge.MessageType)
  (r8v0 com.discord.chat.bridge.MessageType)
  (r9v0 com.discord.chat.bridge.MessageType)
  (r10v0 com.discord.chat.bridge.MessageType)
  (r11v0 com.discord.chat.bridge.MessageType)
  (r12v0 com.discord.chat.bridge.MessageType)
  (r13v0 com.discord.chat.bridge.MessageType)
  (r14v0 com.discord.chat.bridge.MessageType)
  (r15v0 com.discord.chat.bridge.MessageType)
  (r1v15 com.discord.chat.bridge.MessageType)
  (r2v16 com.discord.chat.bridge.MessageType)
  (r1v17 com.discord.chat.bridge.MessageType)
  (r2v18 com.discord.chat.bridge.MessageType)
  (r1v21 com.discord.chat.bridge.MessageType)
  (r2v22 com.discord.chat.bridge.MessageType)
  (r1v25 com.discord.chat.bridge.MessageType)
  (r1v27 com.discord.chat.bridge.MessageType)
  (r2v28 com.discord.chat.bridge.MessageType)
  (r1v29 com.discord.chat.bridge.MessageType)
  (r2v30 com.discord.chat.bridge.MessageType)
  (r1v31 com.discord.chat.bridge.MessageType)
  (r2v32 com.discord.chat.bridge.MessageType)
  (r1v33 com.discord.chat.bridge.MessageType)
  (r2v34 com.discord.chat.bridge.MessageType)
  (r1v40 com.discord.chat.bridge.MessageType)
  (r1v42 com.discord.chat.bridge.MessageType)
  (r1v44 com.discord.chat.bridge.MessageType)
  (r1v46 com.discord.chat.bridge.MessageType)
  (r2v47 com.discord.chat.bridge.MessageType)
  (r1v48 com.discord.chat.bridge.MessageType)
  (r2v49 com.discord.chat.bridge.MessageType)
  (r1v50 com.discord.chat.bridge.MessageType)
  (r2v51 com.discord.chat.bridge.MessageType)
  (r1v52 com.discord.chat.bridge.MessageType)
  (r2v53 com.discord.chat.bridge.MessageType)
  (r1v54 com.discord.chat.bridge.MessageType)
  (r1v35 com.discord.chat.bridge.MessageType)
  (r1v56 com.discord.chat.bridge.MessageType)
  (r2v55 com.discord.chat.bridge.MessageType)
  (r2v57 com.discord.chat.bridge.MessageType)
 A[WRAPPED] (LINE:809) elemType: com.discord.chat.bridge.MessageType)
 STATIC call: java.util.EnumSet.of(java.lang.Enum, java.lang.Enum[]):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>, E extends java.lang.Enum<E>[]):java.util.EnumSet<E extends java.lang.Enum<E>> VARARG (c), VARARG_CALL] (LINE:817)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 O2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002NOB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010C\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bC\u0010ER\u001b\u0010H\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bH\u0010ER\u001b\u0010J\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bJ\u0010ER\u001b\u0010L\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bL\u0010Ej\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bB¨\u0006P"}, d2 = {"Lcom/discord/chat/bridge/MessageType;", "Lcom/discord/serialization/IntEnum;", "", "serialNumber", "", "<init>", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "DEFAULT", "RECIPIENT_ADD", "RECIPIENT_REMOVE", "CALL", "CHANNEL_NAME_CHANGE", "CHANNEL_ICON_CHANGE", "CHANNEL_PINNED_MESSAGE", "USER_JOIN", "USER_PREMIUM_GUILD_SUBSCRIPTION", "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1", "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2", "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3", "CHANNEL_FOLLOW_ADD", "GUILD_STREAM", "GUILD_DISCOVERY_DISQUALIFIED", "GUILD_DISCOVERY_REQUALIFIED", "GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING", "GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING", "THREAD_CREATED", "REPLY", "CHAT_INPUT_COMMAND", "THREAD_STARTER_MESSAGE", "GUILD_INVITE_REMINDER", "CONTEXT_MENU_COMMAND", "AUTO_MODERATION_ACTION", "ROLE_SUBSCRIPTION_PURCHASE", "INTERACTION_PREMIUM_UPSELL", "STAGE_START", "STAGE_END", "STAGE_SPEAKER", "STAGE_RAISE_HAND", "STAGE_TOPIC", "GUILD_APPLICATION_PREMIUM_SUBSCRIPTION", "PRIVATE_CHANNEL_INTEGRATION_ADDED", "PRIVATE_CHANNEL_INTEGRATION_REMOVED", "PREMIUM_REFERRAL", "GUILD_INCIDENT_ALERT_MODE_ENABLED", "GUILD_INCIDENT_ALERT_MODE_DISABLED", "GUILD_INCIDENT_REPORT_RAID", "GUILD_INCIDENT_REPORT_FALSE_ALARM", "GUILD_DEADCHAT_REVIVE_PROMPT", "CUSTOM_GIFT", "GUILD_GAMING_STATS_PROMPT", "VOICE_CHANNEL_INVITE", "POLL_RESULT", "CHANGELOG", "CHANNEL_LINKED_TO_LOBBY", "GIFTING_PROMPT", "IN_GAME_MESSAGE_NUX", "GUILD_JOIN_REQUEST_ACCEPT_NOTIFICATION", "GUILD_JOIN_REQUEST_REJECT_NOTIFICATION", "GUILD_JOIN_REQUEST_WITHDRAWN_NOTIFICATION", "CHAT_WALLPAPER_SET", "CHAT_WALLPAPER_REMOVED", "EMOJI_ADDED", "PREMIUM_GROUP_INVITE", "VOICE_SESSION", "FRIEND_REQUEST_ACCEPTED", "isSystem", "", "()Z", "isSystem$delegate", "Lkotlin/Lazy;", "isAutomodSystem", "isAutomodSystem$delegate", "isCall", "isCall$delegate", "isPremiumSystem", "isPremiumSystem$delegate", "Serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageType implements IntEnum {
    DEFAULT(0),
    RECIPIENT_ADD(1),
    RECIPIENT_REMOVE(2),
    CALL(3),
    CHANNEL_NAME_CHANGE(4),
    CHANNEL_ICON_CHANGE(5),
    CHANNEL_PINNED_MESSAGE(6),
    USER_JOIN(7),
    USER_PREMIUM_GUILD_SUBSCRIPTION(8),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1(9),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2(10),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3(11),
    CHANNEL_FOLLOW_ADD(12),
    GUILD_STREAM(13),
    GUILD_DISCOVERY_DISQUALIFIED(14),
    GUILD_DISCOVERY_REQUALIFIED(15),
    GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING(16),
    GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING(17),
    THREAD_CREATED(18),
    REPLY(19),
    CHAT_INPUT_COMMAND(20),
    THREAD_STARTER_MESSAGE(21),
    GUILD_INVITE_REMINDER(22),
    CONTEXT_MENU_COMMAND(23),
    AUTO_MODERATION_ACTION(24),
    ROLE_SUBSCRIPTION_PURCHASE(25),
    INTERACTION_PREMIUM_UPSELL(26),
    STAGE_START(27),
    STAGE_END(28),
    STAGE_SPEAKER(29),
    STAGE_RAISE_HAND(30),
    STAGE_TOPIC(31),
    GUILD_APPLICATION_PREMIUM_SUBSCRIPTION(32),
    PRIVATE_CHANNEL_INTEGRATION_ADDED(33),
    PRIVATE_CHANNEL_INTEGRATION_REMOVED(34),
    PREMIUM_REFERRAL(35),
    GUILD_INCIDENT_ALERT_MODE_ENABLED(36),
    GUILD_INCIDENT_ALERT_MODE_DISABLED(37),
    GUILD_INCIDENT_REPORT_RAID(38),
    GUILD_INCIDENT_REPORT_FALSE_ALARM(39),
    GUILD_DEADCHAT_REVIVE_PROMPT(40),
    CUSTOM_GIFT(41),
    GUILD_GAMING_STATS_PROMPT(42),
    VOICE_CHANNEL_INVITE(45),
    POLL_RESULT(46),
    CHANGELOG(47),
    CHANNEL_LINKED_TO_LOBBY(49),
    GIFTING_PROMPT(50),
    IN_GAME_MESSAGE_NUX(51),
    GUILD_JOIN_REQUEST_ACCEPT_NOTIFICATION(52),
    GUILD_JOIN_REQUEST_REJECT_NOTIFICATION(53),
    GUILD_JOIN_REQUEST_WITHDRAWN_NOTIFICATION(54),
    CHAT_WALLPAPER_SET(56),
    CHAT_WALLPAPER_REMOVED(57),
    EMOJI_ADDED(63),
    PREMIUM_GROUP_INVITE(64),
    VOICE_SESSION(65),
    FRIEND_REQUEST_ACCEPTED(67);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private static final Set<MessageType> CallTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Set<MessageType> PremiumSystemTypes;

    @NotNull
    private static final Set<MessageType> SystemTypes;

    /* JADX INFO: renamed from: isAutomodSystem$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isAutomodSystem;

    /* JADX INFO: renamed from: isCall$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isCall;

    /* JADX INFO: renamed from: isPremiumSystem$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isPremiumSystem;

    /* JADX INFO: renamed from: isSystem$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isSystem;
    private final int serialNumber;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/bridge/MessageType$Companion;", "", "<init>", "()V", "SystemTypes", "", "Lcom/discord/chat/bridge/MessageType;", "getSystemTypes", "()Ljava/util/Set;", "CallTypes", "getCallTypes", "PremiumSystemTypes", "getPremiumSystemTypes", "serializer", "Lkotlinx/serialization/KSerializer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<MessageType> getCallTypes() {
            return MessageType.CallTypes;
        }

        @NotNull
        public final Set<MessageType> getPremiumSystemTypes() {
            return MessageType.PremiumSystemTypes;
        }

        @NotNull
        public final Set<MessageType> getSystemTypes() {
            return MessageType.SystemTypes;
        }

        @NotNull
        public final KSerializer serializer() {
            return Serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/bridge/MessageType$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/chat/bridge/MessageType;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serializer extends IntEnumSerializer<MessageType> {

        @NotNull
        public static final Serializer INSTANCE = new Serializer();

        /* JADX WARN: Multi-variable type inference failed */
        private Serializer() {
            super(Reflection.getOrCreateKotlinClass(MessageType.class), null, 2, 0 == true ? 1 : 0);
        }
    }

    static {
        MessageType messageType = CALL;
        MessageType messageType2 = GUILD_STREAM;
        MessageType messageType3 = PREMIUM_REFERRAL;
        MessageType messageType4 = PREMIUM_GROUP_INVITE;
        $ENTRIES = b.l(values());
        INSTANCE = new Companion(null);
        EnumSet enumSetOf = EnumSet.of(new MessageType(1), new MessageType(2), messageType, new MessageType(4), new MessageType(5), new MessageType(6), new MessageType(7), new MessageType(8), new MessageType(9), new MessageType(10), new MessageType(11), new MessageType(12), messageType2, new MessageType(14), new MessageType(15), new MessageType(16), new MessageType(17), new MessageType(18), new MessageType(21), new MessageType(22), new MessageType(25), new MessageType(27), new MessageType(28), new MessageType(29), new MessageType(30), new MessageType(31), new MessageType(32), new MessageType(33), new MessageType(34), new MessageType(40), new MessageType(42), new MessageType(46), new MessageType(49), new MessageType(50), new MessageType(51), new MessageType(52), new MessageType(53), new MessageType(54), new MessageType(56), new MessageType(57), new MessageType(63), messageType3, new MessageType(65), messageType4, new MessageType(67));
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
        SystemTypes = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(messageType, messageType2);
        Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
        CallTypes = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(messageType3, messageType4);
        Intrinsics.checkNotNullExpressionValue(enumSetOf3, "of(...)");
        PremiumSystemTypes = enumSetOf3;
    }

    private MessageType(int i7) {
        super(str, i);
        this.serialNumber = i7;
        final int i10 = 0;
        this.isSystem = l.b(new Function0(this) { // from class: l5.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MessageType f14970e;

            {
                this.f14970e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zIsSystem_delegate$lambda$0;
                switch (i10) {
                    case 0:
                        zIsSystem_delegate$lambda$0 = MessageType.isSystem_delegate$lambda$0(this.f14970e);
                        break;
                    case 1:
                        zIsSystem_delegate$lambda$0 = MessageType.isAutomodSystem_delegate$lambda$1(this.f14970e);
                        break;
                    case 2:
                        zIsSystem_delegate$lambda$0 = MessageType.isCall_delegate$lambda$2(this.f14970e);
                        break;
                    default:
                        zIsSystem_delegate$lambda$0 = MessageType.isPremiumSystem_delegate$lambda$3(this.f14970e);
                        break;
                }
                return Boolean.valueOf(zIsSystem_delegate$lambda$0);
            }
        });
        final int i11 = 1;
        this.isAutomodSystem = l.b(new Function0(this) { // from class: l5.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MessageType f14970e;

            {
                this.f14970e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zIsSystem_delegate$lambda$0;
                switch (i11) {
                    case 0:
                        zIsSystem_delegate$lambda$0 = MessageType.isSystem_delegate$lambda$0(this.f14970e);
                        break;
                    case 1:
                        zIsSystem_delegate$lambda$0 = MessageType.isAutomodSystem_delegate$lambda$1(this.f14970e);
                        break;
                    case 2:
                        zIsSystem_delegate$lambda$0 = MessageType.isCall_delegate$lambda$2(this.f14970e);
                        break;
                    default:
                        zIsSystem_delegate$lambda$0 = MessageType.isPremiumSystem_delegate$lambda$3(this.f14970e);
                        break;
                }
                return Boolean.valueOf(zIsSystem_delegate$lambda$0);
            }
        });
        final int i12 = 2;
        this.isCall = l.b(new Function0(this) { // from class: l5.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MessageType f14970e;

            {
                this.f14970e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zIsSystem_delegate$lambda$0;
                switch (i12) {
                    case 0:
                        zIsSystem_delegate$lambda$0 = MessageType.isSystem_delegate$lambda$0(this.f14970e);
                        break;
                    case 1:
                        zIsSystem_delegate$lambda$0 = MessageType.isAutomodSystem_delegate$lambda$1(this.f14970e);
                        break;
                    case 2:
                        zIsSystem_delegate$lambda$0 = MessageType.isCall_delegate$lambda$2(this.f14970e);
                        break;
                    default:
                        zIsSystem_delegate$lambda$0 = MessageType.isPremiumSystem_delegate$lambda$3(this.f14970e);
                        break;
                }
                return Boolean.valueOf(zIsSystem_delegate$lambda$0);
            }
        });
        final int i13 = 3;
        this.isPremiumSystem = l.b(new Function0(this) { // from class: l5.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MessageType f14970e;

            {
                this.f14970e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zIsSystem_delegate$lambda$0;
                switch (i13) {
                    case 0:
                        zIsSystem_delegate$lambda$0 = MessageType.isSystem_delegate$lambda$0(this.f14970e);
                        break;
                    case 1:
                        zIsSystem_delegate$lambda$0 = MessageType.isAutomodSystem_delegate$lambda$1(this.f14970e);
                        break;
                    case 2:
                        zIsSystem_delegate$lambda$0 = MessageType.isCall_delegate$lambda$2(this.f14970e);
                        break;
                    default:
                        zIsSystem_delegate$lambda$0 = MessageType.isPremiumSystem_delegate$lambda$3(this.f14970e);
                        break;
                }
                return Boolean.valueOf(zIsSystem_delegate$lambda$0);
            }
        });
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutomodSystem_delegate$lambda$1(MessageType messageType) {
        return messageType == AUTO_MODERATION_ACTION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCall_delegate$lambda$2(MessageType messageType) {
        return CallTypes.contains(messageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPremiumSystem_delegate$lambda$3(MessageType messageType) {
        return PremiumSystemTypes.contains(messageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSystem_delegate$lambda$0(MessageType messageType) {
        return SystemTypes.contains(messageType);
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public final boolean isAutomodSystem() {
        return ((Boolean) this.isAutomodSystem.getValue()).booleanValue();
    }

    public final boolean isCall() {
        return ((Boolean) this.isCall.getValue()).booleanValue();
    }

    public final boolean isPremiumSystem() {
        return ((Boolean) this.isPremiumSystem.getValue()).booleanValue();
    }

    public final boolean isSystem() {
        return ((Boolean) this.isSystem.getValue()).booleanValue();
    }
}
