package com.discord.chat.bridge.contentnode;

import a3.e;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColors$$serializer;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.annotation.Annotation;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import pr.h;
import rn.l;
import rn.m;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@f(with = LinkContextDataSerializer.class)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData;", "", "<init>", "()V", "LinkUrl", "LinkContext", "BindUserMenu", "BindJoinStream", "BindTapUsername", "BindTapCommandName", "BindTapActivityText", "BindOpenThreadChannel", "BindOpenInviteSheet", "BindOpenPins", "BindGuildMenu", "BindDismissMessage", "BindOpenRoleSubscriptionOverview", "BindUserSurvey", "BindJumpToMessage", "BindOpenGdmCustomizeActionSheet", "BindOpenUrl", "BindInsertText", "BindDoNothing", "Companion", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDoNothing;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkUrl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class LinkContextData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0004\u001f !\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\fJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "message", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;", "<init>", "(Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "DismissedMessage", "DismissedMessageAuthor", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindDismissMessage extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DismissedMessage message;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindDismissMessage$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @f
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0018\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00064"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;", "", StackTraceHelper.ID_KEY, "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "loggingName", "", "author", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getLoggingName", "getAuthor", "()Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "copy", "copy-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissedMessage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final DismissedMessageAuthor author;
            private final long channelId;

            @NotNull
            private final String id;
            private final String loggingName;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessage;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return LinkContextData$BindDismissMessage$DismissedMessage$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ DismissedMessage(int i7, String str, ChannelId channelId, String str2, DismissedMessageAuthor dismissedMessageAuthor, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
                this(i7, str, channelId, str2, dismissedMessageAuthor, serializationConstructorMarker);
            }

            /* JADX INFO: renamed from: copy-8a0ehIg$default, reason: not valid java name */
            public static /* synthetic */ DismissedMessage m330copy8a0ehIg$default(DismissedMessage dismissedMessage, String str, long j, String str2, DismissedMessageAuthor dismissedMessageAuthor, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = dismissedMessage.id;
                }
                if ((i7 & 2) != 0) {
                    j = dismissedMessage.channelId;
                }
                if ((i7 & 4) != 0) {
                    str2 = dismissedMessage.loggingName;
                }
                if ((i7 & 8) != 0) {
                    dismissedMessageAuthor = dismissedMessage.author;
                }
                return dismissedMessage.m334copy8a0ehIg(str, j, str2, dismissedMessageAuthor);
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM$annotations, reason: not valid java name */
            public static /* synthetic */ void m331getChannelIdo4g7jtM$annotations() {
            }

            public static final /* synthetic */ void write$Self$chat_release(DismissedMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.g(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.id));
                output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
                if (output.u(serialDesc, 2) || self.loggingName != null) {
                    output.r(serialDesc, 2, s1.f17602a, self.loggingName);
                }
                output.g(serialDesc, 3, LinkContextData$BindDismissMessage$DismissedMessageAuthor$$serializer.INSTANCE, self.author);
            }

            @NotNull
            /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
            public final long getChannelId() {
                return this.channelId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getLoggingName() {
                return this.loggingName;
            }

            @NotNull
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final DismissedMessageAuthor getAuthor() {
                return this.author;
            }

            @NotNull
            /* JADX INFO: renamed from: copy-8a0ehIg, reason: not valid java name */
            public final DismissedMessage m334copy8a0ehIg(@NotNull String id2, long channelId, String loggingName, @NotNull DismissedMessageAuthor author) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(author, "author");
                return new DismissedMessage(id2, channelId, loggingName, author, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DismissedMessage)) {
                    return false;
                }
                DismissedMessage dismissedMessage = (DismissedMessage) other;
                return MessageId.m1160equalsimpl0(this.id, dismissedMessage.id) && ChannelId.m1134equalsimpl0(this.channelId, dismissedMessage.channelId) && Intrinsics.areEqual(this.loggingName, dismissedMessage.loggingName) && Intrinsics.areEqual(this.author, dismissedMessage.author);
            }

            @NotNull
            public final DismissedMessageAuthor getAuthor() {
                return this.author;
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
            public final long m335getChannelIdo4g7jtM() {
                return this.channelId;
            }

            @NotNull
            /* JADX INFO: renamed from: getId-3Eiw7ao, reason: not valid java name */
            public final String m336getId3Eiw7ao() {
                return this.id;
            }

            public final String getLoggingName() {
                return this.loggingName;
            }

            public int hashCode() {
                int iD = b.d(this.channelId, MessageId.m1161hashCodeimpl(this.id) * 31, 31);
                String str = this.loggingName;
                return this.author.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                String strM1163toStringimpl = MessageId.m1163toStringimpl(this.id);
                String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
                String str = this.loggingName;
                DismissedMessageAuthor dismissedMessageAuthor = this.author;
                StringBuilder sbU = e.u("DismissedMessage(id=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", loggingName=");
                sbU.append(str);
                sbU.append(", author=");
                sbU.append(dismissedMessageAuthor);
                sbU.append(")");
                return sbU.toString();
            }

            public /* synthetic */ DismissedMessage(String str, long j, String str2, DismissedMessageAuthor dismissedMessageAuthor, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j, str2, dismissedMessageAuthor);
            }

            private /* synthetic */ DismissedMessage(int i7, String str, ChannelId channelId, String str2, DismissedMessageAuthor dismissedMessageAuthor, SerializationConstructorMarker serializationConstructorMarker) {
                if (11 != (i7 & 11)) {
                    e1.l(i7, 11, LinkContextData$BindDismissMessage$DismissedMessage$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.channelId = channelId.m1139unboximpl();
                if ((i7 & 4) == 0) {
                    this.loggingName = null;
                } else {
                    this.loggingName = str2;
                }
                this.author = dismissedMessageAuthor;
            }

            private DismissedMessage(String id2, long j, String str, DismissedMessageAuthor author) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(author, "author");
                this.id = id2;
                this.channelId = j;
                this.loggingName = str;
                this.author = author;
            }

            public /* synthetic */ DismissedMessage(String str, long j, String str2, DismissedMessageAuthor dismissedMessageAuthor, int i7, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j, (i7 & 4) != 0 ? null : str2, dismissedMessageAuthor, null);
            }
        }

        @f
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;", "", NotificationRenderer.USERNAME, "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissedMessageAuthor {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final String username;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage$DismissedMessageAuthor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return LinkContextData$BindDismissMessage$DismissedMessageAuthor$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ DismissedMessageAuthor(int i7, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 == (i7 & 1)) {
                    this.username = str;
                } else {
                    e1.l(i7, 1, LinkContextData$BindDismissMessage$DismissedMessageAuthor$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ DismissedMessageAuthor copy$default(DismissedMessageAuthor dismissedMessageAuthor, String str, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = dismissedMessageAuthor.username;
                }
                return dismissedMessageAuthor.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUsername() {
                return this.username;
            }

            @NotNull
            public final DismissedMessageAuthor copy(@NotNull String username) {
                Intrinsics.checkNotNullParameter(username, "username");
                return new DismissedMessageAuthor(username);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DismissedMessageAuthor) && Intrinsics.areEqual(this.username, ((DismissedMessageAuthor) other).username);
            }

            @NotNull
            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.username.hashCode();
            }

            @NotNull
            public String toString() {
                return g.e("DismissedMessageAuthor(username=", this.username, ")");
            }

            public DismissedMessageAuthor(@NotNull String username) {
                Intrinsics.checkNotNullParameter(username, "username");
                this.username = username;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindDismissMessage(int i7, String str, DismissedMessage dismissedMessage, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindDismissMessage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.message = dismissedMessage;
        }

        public static /* synthetic */ BindDismissMessage copy$default(BindDismissMessage bindDismissMessage, DismissedMessage dismissedMessage, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                dismissedMessage = bindDismissMessage.message;
            }
            return bindDismissMessage.copy(dismissedMessage);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindDismissMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, LinkContextData$BindDismissMessage$DismissedMessage$$serializer.INSTANCE, self.message);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DismissedMessage getMessage() {
            return this.message;
        }

        @NotNull
        public final BindDismissMessage copy(@NotNull DismissedMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new BindDismissMessage(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindDismissMessage) && Intrinsics.areEqual(this.message, ((BindDismissMessage) other).message);
        }

        @NotNull
        public final DismissedMessage getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "BindDismissMessage(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindDismissMessage(@NotNull DismissedMessage message) {
            super("bindDismissMessage", null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }
    }

    @f
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J&\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDoNothing;", "Lcom/discord/chat/bridge/contentnode/LinkContextData;", "linkColor", "", "medium", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDoNothing;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindDoNothing extends LinkContextData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Integer linkColor;
        private final Boolean medium;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDoNothing$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDoNothing;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindDoNothing$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BindDoNothing() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ BindDoNothing copy$default(BindDoNothing bindDoNothing, Integer num, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = bindDoNothing.linkColor;
            }
            if ((i7 & 2) != 0) {
                bool = bindDoNothing.medium;
            }
            return bindDoNothing.copy(num, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindDoNothing self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.u(serialDesc, 0) || self.linkColor != null) {
                output.r(serialDesc, 0, m0.f17573a, self.linkColor);
            }
            if (!output.u(serialDesc, 1) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 1, or.g.f17537a, self.medium);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getLinkColor() {
            return this.linkColor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final BindDoNothing copy(Integer linkColor, Boolean medium) {
            return new BindDoNothing(linkColor, medium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindDoNothing)) {
                return false;
            }
            BindDoNothing bindDoNothing = (BindDoNothing) other;
            return Intrinsics.areEqual(this.linkColor, bindDoNothing.linkColor) && Intrinsics.areEqual(this.medium, bindDoNothing.medium);
        }

        public final Integer getLinkColor() {
            return this.linkColor;
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        public int hashCode() {
            Integer num = this.linkColor;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.medium;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BindDoNothing(linkColor=" + this.linkColor + ", medium=" + this.medium + ")";
        }

        public /* synthetic */ BindDoNothing(int i7, Integer num, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i7 & 1) == 0) {
                this.linkColor = null;
            } else {
                this.linkColor = num;
            }
            if ((i7 & 2) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public /* synthetic */ BindDoNothing(Integer num, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : bool);
        }

        public BindDoNothing(Integer num, Boolean bool) {
            super(null);
            this.linkColor = num;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J&\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "messageReference", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "medium", "", "<init>", "(Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;Ljava/lang/Boolean;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessageReference", "()Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "MessageReference", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindGuildMenu extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean medium;
        private final MessageReference messageReference;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindGuildMenu$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @f
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001e\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "<init>", "(JLcom/discord/primitives/GuildId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "component1", "component1-o4g7jtM", "component2", "component2-qOKuAAo", "copy", "copy-2_zTmBg", "(JLcom/discord/primitives/GuildId;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MessageReference {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final long channelId;
            private final GuildId guildId;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return LinkContextData$BindGuildMenu$MessageReference$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ MessageReference(int i7, ChannelId channelId, GuildId guildId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
                this(i7, channelId, guildId, serializationConstructorMarker);
            }

            /* JADX INFO: renamed from: copy-2_zTmBg$default, reason: not valid java name */
            public static /* synthetic */ MessageReference m337copy2_zTmBg$default(MessageReference messageReference, long j, GuildId guildId, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    j = messageReference.channelId;
                }
                if ((i7 & 2) != 0) {
                    guildId = messageReference.guildId;
                }
                return messageReference.m342copy2_zTmBg(j, guildId);
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM$annotations, reason: not valid java name */
            public static /* synthetic */ void m338getChannelIdo4g7jtM$annotations() {
            }

            /* JADX INFO: renamed from: getGuildId-qOKuAAo$annotations, reason: not valid java name */
            public static /* synthetic */ void m339getGuildIdqOKuAAo$annotations() {
            }

            public static final /* synthetic */ void write$Self$chat_release(MessageReference self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.g(serialDesc, 0, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
                if (!output.u(serialDesc, 1) && self.guildId == null) {
                    return;
                }
                output.r(serialDesc, 1, GuildId$$serializer.INSTANCE, self.guildId);
            }

            /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
            public final long getChannelId() {
                return this.channelId;
            }

            /* JADX INFO: renamed from: component2-qOKuAAo, reason: not valid java name and from getter */
            public final GuildId getGuildId() {
                return this.guildId;
            }

            @NotNull
            /* JADX INFO: renamed from: copy-2_zTmBg, reason: not valid java name */
            public final MessageReference m342copy2_zTmBg(long channelId, GuildId guildId) {
                return new MessageReference(channelId, guildId, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MessageReference)) {
                    return false;
                }
                MessageReference messageReference = (MessageReference) other;
                return ChannelId.m1134equalsimpl0(this.channelId, messageReference.channelId) && Intrinsics.areEqual(this.guildId, messageReference.guildId);
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
            public final long m343getChannelIdo4g7jtM() {
                return this.channelId;
            }

            /* JADX INFO: renamed from: getGuildId-qOKuAAo, reason: not valid java name */
            public final GuildId m344getGuildIdqOKuAAo() {
                return this.guildId;
            }

            public int hashCode() {
                int iM1135hashCodeimpl = ChannelId.m1135hashCodeimpl(this.channelId) * 31;
                GuildId guildId = this.guildId;
                return iM1135hashCodeimpl + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()));
            }

            @NotNull
            public String toString() {
                return "MessageReference(channelId=" + ChannelId.m1137toStringimpl(this.channelId) + ", guildId=" + this.guildId + ")";
            }

            public /* synthetic */ MessageReference(long j, GuildId guildId, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, guildId);
            }

            private /* synthetic */ MessageReference(int i7, ChannelId channelId, GuildId guildId, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i7 & 1)) {
                    e1.l(i7, 1, LinkContextData$BindGuildMenu$MessageReference$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.channelId = channelId.m1139unboximpl();
                if ((i7 & 2) == 0) {
                    this.guildId = null;
                } else {
                    this.guildId = guildId;
                }
            }

            private MessageReference(long j, GuildId guildId) {
                this.channelId = j;
                this.guildId = guildId;
            }

            public /* synthetic */ MessageReference(long j, GuildId guildId, int i7, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i7 & 2) != 0 ? null : guildId, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BindGuildMenu() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ BindGuildMenu copy$default(BindGuildMenu bindGuildMenu, MessageReference messageReference, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                messageReference = bindGuildMenu.messageReference;
            }
            if ((i7 & 2) != 0) {
                bool = bindGuildMenu.medium;
            }
            return bindGuildMenu.copy(messageReference, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindGuildMenu self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            if (output.u(serialDesc, 1) || self.messageReference != null) {
                output.r(serialDesc, 1, LinkContextData$BindGuildMenu$MessageReference$$serializer.INSTANCE, self.messageReference);
            }
            if (!output.u(serialDesc, 2) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 2, or.g.f17537a, self.medium);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageReference getMessageReference() {
            return this.messageReference;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final BindGuildMenu copy(MessageReference messageReference, Boolean medium) {
            return new BindGuildMenu(messageReference, medium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindGuildMenu)) {
                return false;
            }
            BindGuildMenu bindGuildMenu = (BindGuildMenu) other;
            return Intrinsics.areEqual(this.messageReference, bindGuildMenu.messageReference) && Intrinsics.areEqual(this.medium, bindGuildMenu.medium);
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        public final MessageReference getMessageReference() {
            return this.messageReference;
        }

        public int hashCode() {
            MessageReference messageReference = this.messageReference;
            int iHashCode = (messageReference == null ? 0 : messageReference.hashCode()) * 31;
            Boolean bool = this.medium;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BindGuildMenu(messageReference=" + this.messageReference + ", medium=" + this.medium + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindGuildMenu(int i7, String str, MessageReference messageReference, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (1 != (i7 & 1)) {
                e1.l(i7, 1, LinkContextData$BindGuildMenu$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i7 & 2) == 0) {
                this.messageReference = null;
            } else {
                this.messageReference = messageReference;
            }
            if ((i7 & 4) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public /* synthetic */ BindGuildMenu(MessageReference messageReference, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : messageReference, (i7 & 2) != 0 ? null : bool);
        }

        public BindGuildMenu(MessageReference messageReference, Boolean bool) {
            super("bindGuildMenu", null);
            this.messageReference = messageReference;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindInsertText;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "text", "", "addSpace", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "", "action", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getAddSpace", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindInsertText;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindInsertText extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean addSpace;

        @NotNull
        private final String text;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindInsertText$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindInsertText;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindInsertText$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindInsertText(int i7, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindInsertText$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.text = str2;
            if ((i7 & 4) == 0) {
                this.addSpace = null;
            } else {
                this.addSpace = bool;
            }
        }

        public static /* synthetic */ BindInsertText copy$default(BindInsertText bindInsertText, String str, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = bindInsertText.text;
            }
            if ((i7 & 2) != 0) {
                bool = bindInsertText.addSpace;
            }
            return bindInsertText.copy(str, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindInsertText self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.text);
            if (!output.u(serialDesc, 2) && self.addSpace == null) {
                return;
            }
            output.r(serialDesc, 2, or.g.f17537a, self.addSpace);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAddSpace() {
            return this.addSpace;
        }

        @NotNull
        public final BindInsertText copy(@NotNull String text, Boolean addSpace) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new BindInsertText(text, addSpace);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindInsertText)) {
                return false;
            }
            BindInsertText bindInsertText = (BindInsertText) other;
            return Intrinsics.areEqual(this.text, bindInsertText.text) && Intrinsics.areEqual(this.addSpace, bindInsertText.addSpace);
        }

        public final Boolean getAddSpace() {
            return this.addSpace;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            Boolean bool = this.addSpace;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            return "BindInsertText(text=" + this.text + ", addSpace=" + this.addSpace + ")";
        }

        public /* synthetic */ BindInsertText(String str, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? null : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindInsertText(@NotNull String text, Boolean bool) {
            super("bindInsertText", null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.addSpace = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0003\u001f !B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\fJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "stream", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;", "<init>", "(Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStream", "()Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "ApplicationStream", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindJoinStream extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ApplicationStream stream;

        @f
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b#J\t\u0010$\u001a\u00020\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u00067"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;", "", "ownerId", "Lcom/discord/primitives/UserId;", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "streamType", "", "discoverable", "", "<init>", "(JJLcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOwnerId-re6GcUE", "()J", "J", "getChannelId-o4g7jtM", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getStreamType", "()Ljava/lang/String;", "getDiscoverable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component1-re6GcUE", "component2", "component2-o4g7jtM", "component3", "component3-qOKuAAo", "component4", "component5", "copy", "copy-t0eeQLs", "(JJLcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ApplicationStream {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final long channelId;
            private final Boolean discoverable;
            private final GuildId guildId;
            private final long ownerId;

            @NotNull
            private final String streamType;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$ApplicationStream;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return LinkContextData$BindJoinStream$ApplicationStream$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ ApplicationStream(int i7, UserId userId, ChannelId channelId, GuildId guildId, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
                this(i7, userId, channelId, guildId, str, bool, serializationConstructorMarker);
            }

            /* JADX INFO: renamed from: copy-t0eeQLs$default, reason: not valid java name */
            public static /* synthetic */ ApplicationStream m345copyt0eeQLs$default(ApplicationStream applicationStream, long j, long j5, GuildId guildId, String str, Boolean bool, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    j = applicationStream.ownerId;
                }
                long j7 = j;
                if ((i7 & 2) != 0) {
                    j5 = applicationStream.channelId;
                }
                long j10 = j5;
                if ((i7 & 4) != 0) {
                    guildId = applicationStream.guildId;
                }
                GuildId guildId2 = guildId;
                if ((i7 & 8) != 0) {
                    str = applicationStream.streamType;
                }
                String str2 = str;
                if ((i7 & 16) != 0) {
                    bool = applicationStream.discoverable;
                }
                return applicationStream.m349copyt0eeQLs(j7, j10, guildId2, str2, bool);
            }

            public static final /* synthetic */ void write$Self$chat_release(ApplicationStream self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.g(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m1208boximpl(self.ownerId));
                output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
                if (output.u(serialDesc, 2) || self.guildId != null) {
                    output.r(serialDesc, 2, GuildId$$serializer.INSTANCE, self.guildId);
                }
                output.q(serialDesc, 3, self.streamType);
                if (!output.u(serialDesc, 4) && self.discoverable == null) {
                    return;
                }
                output.r(serialDesc, 4, or.g.f17537a, self.discoverable);
            }

            /* JADX INFO: renamed from: component1-re6GcUE, reason: not valid java name and from getter */
            public final long getOwnerId() {
                return this.ownerId;
            }

            /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
            public final long getChannelId() {
                return this.channelId;
            }

            /* JADX INFO: renamed from: component3-qOKuAAo, reason: not valid java name and from getter */
            public final GuildId getGuildId() {
                return this.guildId;
            }

            @NotNull
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getStreamType() {
                return this.streamType;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Boolean getDiscoverable() {
                return this.discoverable;
            }

            @NotNull
            /* JADX INFO: renamed from: copy-t0eeQLs, reason: not valid java name */
            public final ApplicationStream m349copyt0eeQLs(long ownerId, long channelId, GuildId guildId, @NotNull String streamType, Boolean discoverable) {
                Intrinsics.checkNotNullParameter(streamType, "streamType");
                return new ApplicationStream(ownerId, channelId, guildId, streamType, discoverable, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApplicationStream)) {
                    return false;
                }
                ApplicationStream applicationStream = (ApplicationStream) other;
                return UserId.m1212equalsimpl0(this.ownerId, applicationStream.ownerId) && ChannelId.m1134equalsimpl0(this.channelId, applicationStream.channelId) && Intrinsics.areEqual(this.guildId, applicationStream.guildId) && Intrinsics.areEqual(this.streamType, applicationStream.streamType) && Intrinsics.areEqual(this.discoverable, applicationStream.discoverable);
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
            public final long m350getChannelIdo4g7jtM() {
                return this.channelId;
            }

            public final Boolean getDiscoverable() {
                return this.discoverable;
            }

            /* JADX INFO: renamed from: getGuildId-qOKuAAo, reason: not valid java name */
            public final GuildId m351getGuildIdqOKuAAo() {
                return this.guildId;
            }

            /* JADX INFO: renamed from: getOwnerId-re6GcUE, reason: not valid java name */
            public final long m352getOwnerIdre6GcUE() {
                return this.ownerId;
            }

            @NotNull
            public final String getStreamType() {
                return this.streamType;
            }

            public int hashCode() {
                int iD = b.d(this.channelId, UserId.m1213hashCodeimpl(this.ownerId) * 31, 31);
                GuildId guildId = this.guildId;
                int iD2 = e.d((iD + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()))) * 31, 31, this.streamType);
                Boolean bool = this.discoverable;
                return iD2 + (bool != null ? bool.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String strM1215toStringimpl = UserId.m1215toStringimpl(this.ownerId);
                String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
                GuildId guildId = this.guildId;
                String str = this.streamType;
                Boolean bool = this.discoverable;
                StringBuilder sbU = e.u("ApplicationStream(ownerId=", strM1215toStringimpl, ", channelId=", strM1137toStringimpl, ", guildId=");
                sbU.append(guildId);
                sbU.append(", streamType=");
                sbU.append(str);
                sbU.append(", discoverable=");
                sbU.append(bool);
                sbU.append(")");
                return sbU.toString();
            }

            public /* synthetic */ ApplicationStream(long j, long j5, GuildId guildId, String str, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j5, guildId, str, bool);
            }

            private /* synthetic */ ApplicationStream(int i7, UserId userId, ChannelId channelId, GuildId guildId, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                if (11 != (i7 & 11)) {
                    e1.l(i7, 11, LinkContextData$BindJoinStream$ApplicationStream$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.ownerId = userId.m1217unboximpl();
                this.channelId = channelId.m1139unboximpl();
                if ((i7 & 4) == 0) {
                    this.guildId = null;
                } else {
                    this.guildId = guildId;
                }
                this.streamType = str;
                if ((i7 & 16) == 0) {
                    this.discoverable = null;
                } else {
                    this.discoverable = bool;
                }
            }

            private ApplicationStream(long j, long j5, GuildId guildId, String streamType, Boolean bool) {
                Intrinsics.checkNotNullParameter(streamType, "streamType");
                this.ownerId = j;
                this.channelId = j5;
                this.guildId = guildId;
                this.streamType = streamType;
                this.discoverable = bool;
            }

            public /* synthetic */ ApplicationStream(long j, long j5, GuildId guildId, String str, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j5, (i7 & 4) != 0 ? null : guildId, str, (i7 & 16) != 0 ? null : bool, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindJoinStream$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindJoinStream(int i7, String str, ApplicationStream applicationStream, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindJoinStream$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.stream = applicationStream;
        }

        public static /* synthetic */ BindJoinStream copy$default(BindJoinStream bindJoinStream, ApplicationStream applicationStream, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                applicationStream = bindJoinStream.stream;
            }
            return bindJoinStream.copy(applicationStream);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindJoinStream self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, LinkContextData$BindJoinStream$ApplicationStream$$serializer.INSTANCE, self.stream);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ApplicationStream getStream() {
            return this.stream;
        }

        @NotNull
        public final BindJoinStream copy(@NotNull ApplicationStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            return new BindJoinStream(stream);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindJoinStream) && Intrinsics.areEqual(this.stream, ((BindJoinStream) other).stream);
        }

        @NotNull
        public final ApplicationStream getStream() {
            return this.stream;
        }

        public int hashCode() {
            return this.stream.hashCode();
        }

        @NotNull
        public String toString() {
            return "BindJoinStream(stream=" + this.stream + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindJoinStream(@NotNull ApplicationStream stream) {
            super("bindTapUsername", null);
            Intrinsics.checkNotNullParameter(stream, "stream");
            this.stream = stream;
        }
    }

    @f
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJumpToMessage;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "targetChannelId", "", "targetMessageId", "medium", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "", "action", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTargetChannelId", "()Ljava/lang/String;", "getTargetMessageId", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJumpToMessage;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindJumpToMessage extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean medium;

        @NotNull
        private final String targetChannelId;

        @NotNull
        private final String targetMessageId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJumpToMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJumpToMessage;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindJumpToMessage$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindJumpToMessage(int i7, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (7 != (i7 & 7)) {
                e1.l(i7, 7, LinkContextData$BindJumpToMessage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.targetChannelId = str2;
            this.targetMessageId = str3;
            if ((i7 & 8) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public static /* synthetic */ BindJumpToMessage copy$default(BindJumpToMessage bindJumpToMessage, String str, String str2, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = bindJumpToMessage.targetChannelId;
            }
            if ((i7 & 2) != 0) {
                str2 = bindJumpToMessage.targetMessageId;
            }
            if ((i7 & 4) != 0) {
                bool = bindJumpToMessage.medium;
            }
            return bindJumpToMessage.copy(str, str2, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindJumpToMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.targetChannelId);
            output.q(serialDesc, 2, self.targetMessageId);
            if (!output.u(serialDesc, 3) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 3, or.g.f17537a, self.medium);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTargetChannelId() {
            return this.targetChannelId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTargetMessageId() {
            return this.targetMessageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final BindJumpToMessage copy(@NotNull String targetChannelId, @NotNull String targetMessageId, Boolean medium) {
            Intrinsics.checkNotNullParameter(targetChannelId, "targetChannelId");
            Intrinsics.checkNotNullParameter(targetMessageId, "targetMessageId");
            return new BindJumpToMessage(targetChannelId, targetMessageId, medium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindJumpToMessage)) {
                return false;
            }
            BindJumpToMessage bindJumpToMessage = (BindJumpToMessage) other;
            return Intrinsics.areEqual(this.targetChannelId, bindJumpToMessage.targetChannelId) && Intrinsics.areEqual(this.targetMessageId, bindJumpToMessage.targetMessageId) && Intrinsics.areEqual(this.medium, bindJumpToMessage.medium);
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final String getTargetChannelId() {
            return this.targetChannelId;
        }

        @NotNull
        public final String getTargetMessageId() {
            return this.targetMessageId;
        }

        public int hashCode() {
            int iD = e.d(this.targetChannelId.hashCode() * 31, 31, this.targetMessageId);
            Boolean bool = this.medium;
            return iD + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.targetChannelId;
            String str2 = this.targetMessageId;
            Boolean bool = this.medium;
            StringBuilder sbU = e.u("BindJumpToMessage(targetChannelId=", str, ", targetMessageId=", str2, ", medium=");
            sbU.append(bool);
            sbU.append(")");
            return sbU.toString();
        }

        public /* synthetic */ BindJumpToMessage(String str, String str2, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i7 & 4) != 0 ? null : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindJumpToMessage(@NotNull String targetChannelId, @NotNull String targetMessageId, Boolean bool) {
            super("bindJumpToMessage", null);
            Intrinsics.checkNotNullParameter(targetChannelId, "targetChannelId");
            Intrinsics.checkNotNullParameter(targetMessageId, "targetMessageId");
            this.targetChannelId = targetChannelId;
            this.targetMessageId = targetMessageId;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenGdmCustomizeActionSheet;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "messageChannelId", "", "linkColor", "", "medium", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "action", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessageChannelId", "()Ljava/lang/String;", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenGdmCustomizeActionSheet;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindOpenGdmCustomizeActionSheet extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Integer linkColor;
        private final Boolean medium;

        @NotNull
        private final String messageChannelId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenGdmCustomizeActionSheet$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenGdmCustomizeActionSheet;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindOpenGdmCustomizeActionSheet$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindOpenGdmCustomizeActionSheet(int i7, String str, String str2, Integer num, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindOpenGdmCustomizeActionSheet$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.messageChannelId = str2;
            if ((i7 & 4) == 0) {
                this.linkColor = null;
            } else {
                this.linkColor = num;
            }
            if ((i7 & 8) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public static /* synthetic */ BindOpenGdmCustomizeActionSheet copy$default(BindOpenGdmCustomizeActionSheet bindOpenGdmCustomizeActionSheet, String str, Integer num, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = bindOpenGdmCustomizeActionSheet.messageChannelId;
            }
            if ((i7 & 2) != 0) {
                num = bindOpenGdmCustomizeActionSheet.linkColor;
            }
            if ((i7 & 4) != 0) {
                bool = bindOpenGdmCustomizeActionSheet.medium;
            }
            return bindOpenGdmCustomizeActionSheet.copy(str, num, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindOpenGdmCustomizeActionSheet self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.messageChannelId);
            if (output.u(serialDesc, 2) || self.linkColor != null) {
                output.r(serialDesc, 2, m0.f17573a, self.linkColor);
            }
            if (!output.u(serialDesc, 3) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 3, or.g.f17537a, self.medium);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageChannelId() {
            return this.messageChannelId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getLinkColor() {
            return this.linkColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final BindOpenGdmCustomizeActionSheet copy(@NotNull String messageChannelId, Integer linkColor, Boolean medium) {
            Intrinsics.checkNotNullParameter(messageChannelId, "messageChannelId");
            return new BindOpenGdmCustomizeActionSheet(messageChannelId, linkColor, medium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindOpenGdmCustomizeActionSheet)) {
                return false;
            }
            BindOpenGdmCustomizeActionSheet bindOpenGdmCustomizeActionSheet = (BindOpenGdmCustomizeActionSheet) other;
            return Intrinsics.areEqual(this.messageChannelId, bindOpenGdmCustomizeActionSheet.messageChannelId) && Intrinsics.areEqual(this.linkColor, bindOpenGdmCustomizeActionSheet.linkColor) && Intrinsics.areEqual(this.medium, bindOpenGdmCustomizeActionSheet.medium);
        }

        public final Integer getLinkColor() {
            return this.linkColor;
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final String getMessageChannelId() {
            return this.messageChannelId;
        }

        public int hashCode() {
            int iHashCode = this.messageChannelId.hashCode() * 31;
            Integer num = this.linkColor;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.medium;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BindOpenGdmCustomizeActionSheet(messageChannelId=" + this.messageChannelId + ", linkColor=" + this.linkColor + ", medium=" + this.medium + ")";
        }

        public /* synthetic */ BindOpenGdmCustomizeActionSheet(String str, Integer num, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindOpenGdmCustomizeActionSheet(@NotNull String messageChannelId, Integer num, Boolean bool) {
            super("bindOpenGdmCustomizeActionSheet", null);
            Intrinsics.checkNotNullParameter(messageChannelId, "messageChannelId");
            this.messageChannelId = messageChannelId;
            this.linkColor = num;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenInviteSheet;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageChannelId-o4g7jtM", "()J", "J", "component1", "component1-o4g7jtM", "copy", "copy-R7gqayM", "(J)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenInviteSheet;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindOpenInviteSheet extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long messageChannelId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenInviteSheet$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenInviteSheet;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindOpenInviteSheet$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindOpenInviteSheet(int i7, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, channelId, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-R7gqayM$default, reason: not valid java name */
        public static /* synthetic */ BindOpenInviteSheet m353copyR7gqayM$default(BindOpenInviteSheet bindOpenInviteSheet, long j, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindOpenInviteSheet.messageChannelId;
            }
            return bindOpenInviteSheet.m355copyR7gqayM(j);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindOpenInviteSheet self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.messageChannelId));
        }

        /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
        public final long getMessageChannelId() {
            return this.messageChannelId;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-R7gqayM, reason: not valid java name */
        public final BindOpenInviteSheet m355copyR7gqayM(long messageChannelId) {
            return new BindOpenInviteSheet(messageChannelId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindOpenInviteSheet) && ChannelId.m1134equalsimpl0(this.messageChannelId, ((BindOpenInviteSheet) other).messageChannelId);
        }

        /* JADX INFO: renamed from: getMessageChannelId-o4g7jtM, reason: not valid java name */
        public final long m356getMessageChannelIdo4g7jtM() {
            return this.messageChannelId;
        }

        public int hashCode() {
            return ChannelId.m1135hashCodeimpl(this.messageChannelId);
        }

        @NotNull
        public String toString() {
            return g.e("BindOpenInviteSheet(messageChannelId=", ChannelId.m1137toStringimpl(this.messageChannelId), ")");
        }

        public /* synthetic */ BindOpenInviteSheet(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindOpenInviteSheet(int i7, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindOpenInviteSheet$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.messageChannelId = channelId.m1139unboximpl();
        }

        private BindOpenInviteSheet(long j) {
            super("bindOpenInviteSheet", null);
            this.messageChannelId = j;
        }
    }

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenPins;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "medium", "", "<init>", "(JLjava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageChannelId-o4g7jtM", "()J", "J", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component1-o4g7jtM", "component2", "copy", "copy-LJLSWy8", "(JLjava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenPins;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindOpenPins extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean medium;
        private final long messageChannelId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenPins$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenPins;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindOpenPins$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindOpenPins(int i7, String str, ChannelId channelId, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, channelId, bool, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-LJLSWy8$default, reason: not valid java name */
        public static /* synthetic */ BindOpenPins m357copyLJLSWy8$default(BindOpenPins bindOpenPins, long j, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindOpenPins.messageChannelId;
            }
            if ((i7 & 2) != 0) {
                bool = bindOpenPins.medium;
            }
            return bindOpenPins.m359copyLJLSWy8(j, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindOpenPins self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.messageChannelId));
            if (!output.u(serialDesc, 2) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 2, or.g.f17537a, self.medium);
        }

        /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
        public final long getMessageChannelId() {
            return this.messageChannelId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-LJLSWy8, reason: not valid java name */
        public final BindOpenPins m359copyLJLSWy8(long messageChannelId, Boolean medium) {
            return new BindOpenPins(messageChannelId, medium, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindOpenPins)) {
                return false;
            }
            BindOpenPins bindOpenPins = (BindOpenPins) other;
            return ChannelId.m1134equalsimpl0(this.messageChannelId, bindOpenPins.messageChannelId) && Intrinsics.areEqual(this.medium, bindOpenPins.medium);
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        /* JADX INFO: renamed from: getMessageChannelId-o4g7jtM, reason: not valid java name */
        public final long m360getMessageChannelIdo4g7jtM() {
            return this.messageChannelId;
        }

        public int hashCode() {
            int iM1135hashCodeimpl = ChannelId.m1135hashCodeimpl(this.messageChannelId) * 31;
            Boolean bool = this.medium;
            return iM1135hashCodeimpl + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            return "BindOpenPins(messageChannelId=" + ChannelId.m1137toStringimpl(this.messageChannelId) + ", medium=" + this.medium + ")";
        }

        public /* synthetic */ BindOpenPins(long j, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindOpenPins(int i7, String str, ChannelId channelId, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindOpenPins$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.messageChannelId = channelId.m1139unboximpl();
            if ((i7 & 4) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public /* synthetic */ BindOpenPins(long j, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i7 & 2) != 0 ? null : bool, null);
        }

        private BindOpenPins(long j, Boolean bool) {
            super("bindOpenPins", null);
            this.messageChannelId = j;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenRoleSubscriptionOverview;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "guildId", "", "messageId", "channelId", "roleSubscriptionListingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "action", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getGuildId", "()Ljava/lang/String;", "getMessageId", "getChannelId", "getRoleSubscriptionListingId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindOpenRoleSubscriptionOverview extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final String channelId;

        @NotNull
        private final String guildId;
        private final String messageId;
        private final String roleSubscriptionListingId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenRoleSubscriptionOverview$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenRoleSubscriptionOverview;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindOpenRoleSubscriptionOverview$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindOpenRoleSubscriptionOverview(int i7, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (31 != (i7 & 31)) {
                e1.l(i7, 31, LinkContextData$BindOpenRoleSubscriptionOverview$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.guildId = str2;
            this.messageId = str3;
            this.channelId = str4;
            this.roleSubscriptionListingId = str5;
        }

        public static /* synthetic */ BindOpenRoleSubscriptionOverview copy$default(BindOpenRoleSubscriptionOverview bindOpenRoleSubscriptionOverview, String str, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = bindOpenRoleSubscriptionOverview.guildId;
            }
            if ((i7 & 2) != 0) {
                str2 = bindOpenRoleSubscriptionOverview.messageId;
            }
            if ((i7 & 4) != 0) {
                str3 = bindOpenRoleSubscriptionOverview.channelId;
            }
            if ((i7 & 8) != 0) {
                str4 = bindOpenRoleSubscriptionOverview.roleSubscriptionListingId;
            }
            return bindOpenRoleSubscriptionOverview.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindOpenRoleSubscriptionOverview self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.guildId);
            s1 s1Var = s1.f17602a;
            output.r(serialDesc, 2, s1Var, self.messageId);
            output.r(serialDesc, 3, s1Var, self.channelId);
            output.r(serialDesc, 4, s1Var, self.roleSubscriptionListingId);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGuildId() {
            return this.guildId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRoleSubscriptionListingId() {
            return this.roleSubscriptionListingId;
        }

        @NotNull
        public final BindOpenRoleSubscriptionOverview copy(@NotNull String guildId, String messageId, String channelId, String roleSubscriptionListingId) {
            Intrinsics.checkNotNullParameter(guildId, "guildId");
            return new BindOpenRoleSubscriptionOverview(guildId, messageId, channelId, roleSubscriptionListingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindOpenRoleSubscriptionOverview)) {
                return false;
            }
            BindOpenRoleSubscriptionOverview bindOpenRoleSubscriptionOverview = (BindOpenRoleSubscriptionOverview) other;
            return Intrinsics.areEqual(this.guildId, bindOpenRoleSubscriptionOverview.guildId) && Intrinsics.areEqual(this.messageId, bindOpenRoleSubscriptionOverview.messageId) && Intrinsics.areEqual(this.channelId, bindOpenRoleSubscriptionOverview.channelId) && Intrinsics.areEqual(this.roleSubscriptionListingId, bindOpenRoleSubscriptionOverview.roleSubscriptionListingId);
        }

        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getGuildId() {
            return this.guildId;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getRoleSubscriptionListingId() {
            return this.roleSubscriptionListingId;
        }

        public int hashCode() {
            int iHashCode = this.guildId.hashCode() * 31;
            String str = this.messageId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.channelId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.roleSubscriptionListingId;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.guildId;
            String str2 = this.messageId;
            return com.discord.chat.presentation.list.a.l(e.u("BindOpenRoleSubscriptionOverview(guildId=", str, ", messageId=", str2, ", channelId="), this.channelId, ", roleSubscriptionListingId=", this.roleSubscriptionListingId, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindOpenRoleSubscriptionOverview(@NotNull String guildId, String str, String str2, String str3) {
            super("bindOpenRoleSubscriptionOverview", null);
            Intrinsics.checkNotNullParameter(guildId, "guildId");
            this.guildId = guildId;
            this.messageId = str;
            this.channelId = str2;
            this.roleSubscriptionListingId = str3;
        }
    }

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenThreadChannel;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "threadId", "Lcom/discord/primitives/ChannelId;", "medium", "", "<init>", "(JLjava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getThreadId-o4g7jtM", "()J", "J", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component1-o4g7jtM", "component2", "copy", "copy-LJLSWy8", "(JLjava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenThreadChannel;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindOpenThreadChannel extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean medium;
        private final long threadId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenThreadChannel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenThreadChannel;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindOpenThreadChannel$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindOpenThreadChannel(int i7, String str, ChannelId channelId, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, channelId, bool, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-LJLSWy8$default, reason: not valid java name */
        public static /* synthetic */ BindOpenThreadChannel m361copyLJLSWy8$default(BindOpenThreadChannel bindOpenThreadChannel, long j, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindOpenThreadChannel.threadId;
            }
            if ((i7 & 2) != 0) {
                bool = bindOpenThreadChannel.medium;
            }
            return bindOpenThreadChannel.m363copyLJLSWy8(j, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindOpenThreadChannel self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.threadId));
            if (!output.u(serialDesc, 2) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 2, or.g.f17537a, self.medium);
        }

        /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
        public final long getThreadId() {
            return this.threadId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-LJLSWy8, reason: not valid java name */
        public final BindOpenThreadChannel m363copyLJLSWy8(long threadId, Boolean medium) {
            return new BindOpenThreadChannel(threadId, medium, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindOpenThreadChannel)) {
                return false;
            }
            BindOpenThreadChannel bindOpenThreadChannel = (BindOpenThreadChannel) other;
            return ChannelId.m1134equalsimpl0(this.threadId, bindOpenThreadChannel.threadId) && Intrinsics.areEqual(this.medium, bindOpenThreadChannel.medium);
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        /* JADX INFO: renamed from: getThreadId-o4g7jtM, reason: not valid java name */
        public final long m364getThreadIdo4g7jtM() {
            return this.threadId;
        }

        public int hashCode() {
            int iM1135hashCodeimpl = ChannelId.m1135hashCodeimpl(this.threadId) * 31;
            Boolean bool = this.medium;
            return iM1135hashCodeimpl + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            return "BindOpenThreadChannel(threadId=" + ChannelId.m1137toStringimpl(this.threadId) + ", medium=" + this.medium + ")";
        }

        public /* synthetic */ BindOpenThreadChannel(long j, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindOpenThreadChannel(int i7, String str, ChannelId channelId, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindOpenThreadChannel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.threadId = channelId.m1139unboximpl();
            if ((i7 & 4) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public /* synthetic */ BindOpenThreadChannel(long j, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i7 & 2) != 0 ? null : bool, null);
        }

        private BindOpenThreadChannel(long j, Boolean bool) {
            super("bindOpenThreadChannel", null);
            this.threadId = j;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenUrl;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "url", "", "linkColor", "", "medium", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "action", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMedium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenUrl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindOpenUrl extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Integer linkColor;
        private final Boolean medium;

        @NotNull
        private final String url;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenUrl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenUrl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindOpenUrl$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindOpenUrl(int i7, String str, String str2, Integer num, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindOpenUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.url = str2;
            if ((i7 & 4) == 0) {
                this.linkColor = null;
            } else {
                this.linkColor = num;
            }
            if ((i7 & 8) == 0) {
                this.medium = null;
            } else {
                this.medium = bool;
            }
        }

        public static /* synthetic */ BindOpenUrl copy$default(BindOpenUrl bindOpenUrl, String str, Integer num, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = bindOpenUrl.url;
            }
            if ((i7 & 2) != 0) {
                num = bindOpenUrl.linkColor;
            }
            if ((i7 & 4) != 0) {
                bool = bindOpenUrl.medium;
            }
            return bindOpenUrl.copy(str, num, bool);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindOpenUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.q(serialDesc, 1, self.url);
            if (output.u(serialDesc, 2) || self.linkColor != null) {
                output.r(serialDesc, 2, m0.f17573a, self.linkColor);
            }
            if (!output.u(serialDesc, 3) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 3, or.g.f17537a, self.medium);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getLinkColor() {
            return this.linkColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final BindOpenUrl copy(@NotNull String url, Integer linkColor, Boolean medium) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new BindOpenUrl(url, linkColor, medium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindOpenUrl)) {
                return false;
            }
            BindOpenUrl bindOpenUrl = (BindOpenUrl) other;
            return Intrinsics.areEqual(this.url, bindOpenUrl.url) && Intrinsics.areEqual(this.linkColor, bindOpenUrl.linkColor) && Intrinsics.areEqual(this.medium, bindOpenUrl.medium);
        }

        public final Integer getLinkColor() {
            return this.linkColor;
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            Integer num = this.linkColor;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.medium;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BindOpenUrl(url=" + this.url + ", linkColor=" + this.linkColor + ", medium=" + this.medium + ")";
        }

        public /* synthetic */ BindOpenUrl(String str, Integer num, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindOpenUrl(@NotNull String url, Integer num, Boolean bool) {
            super("bindOpenUrl", null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.linkColor = num;
            this.medium = bool;
        }
    }

    @f
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapActivityText;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "applicationUserId", "Lcom/discord/primitives/UserId;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationUserId-re6GcUE", "()J", "J", "getMessageChannelId-o4g7jtM", "component1", "component1-re6GcUE", "component2", "component2-o4g7jtM", "copy", "copy-mgJWFPo", "(JJ)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapActivityText;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindTapActivityText extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long applicationUserId;
        private final long messageChannelId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapActivityText$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapActivityText;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindTapActivityText$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindTapActivityText(int i7, String str, UserId userId, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, userId, channelId, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-mgJWFPo$default, reason: not valid java name */
        public static /* synthetic */ BindTapActivityText m365copymgJWFPo$default(BindTapActivityText bindTapActivityText, long j, long j5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindTapActivityText.applicationUserId;
            }
            if ((i7 & 2) != 0) {
                j5 = bindTapActivityText.messageChannelId;
            }
            return bindTapActivityText.m368copymgJWFPo(j, j5);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindTapActivityText self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, UserId$$serializer.INSTANCE, UserId.m1208boximpl(self.applicationUserId));
            output.g(serialDesc, 2, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.messageChannelId));
        }

        /* JADX INFO: renamed from: component1-re6GcUE, reason: not valid java name and from getter */
        public final long getApplicationUserId() {
            return this.applicationUserId;
        }

        /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
        public final long getMessageChannelId() {
            return this.messageChannelId;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-mgJWFPo, reason: not valid java name */
        public final BindTapActivityText m368copymgJWFPo(long applicationUserId, long messageChannelId) {
            return new BindTapActivityText(applicationUserId, messageChannelId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindTapActivityText)) {
                return false;
            }
            BindTapActivityText bindTapActivityText = (BindTapActivityText) other;
            return UserId.m1212equalsimpl0(this.applicationUserId, bindTapActivityText.applicationUserId) && ChannelId.m1134equalsimpl0(this.messageChannelId, bindTapActivityText.messageChannelId);
        }

        /* JADX INFO: renamed from: getApplicationUserId-re6GcUE, reason: not valid java name */
        public final long m369getApplicationUserIdre6GcUE() {
            return this.applicationUserId;
        }

        /* JADX INFO: renamed from: getMessageChannelId-o4g7jtM, reason: not valid java name */
        public final long m370getMessageChannelIdo4g7jtM() {
            return this.messageChannelId;
        }

        public int hashCode() {
            return ChannelId.m1135hashCodeimpl(this.messageChannelId) + (UserId.m1213hashCodeimpl(this.applicationUserId) * 31);
        }

        @NotNull
        public String toString() {
            return g.f("BindTapActivityText(applicationUserId=", UserId.m1215toStringimpl(this.applicationUserId), ", messageChannelId=", ChannelId.m1137toStringimpl(this.messageChannelId), ")");
        }

        public /* synthetic */ BindTapActivityText(long j, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindTapActivityText(int i7, String str, UserId userId, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (7 != (i7 & 7)) {
                e1.l(i7, 7, LinkContextData$BindTapActivityText$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.applicationUserId = userId.m1217unboximpl();
            this.messageChannelId = channelId.m1139unboximpl();
        }

        private BindTapActivityText(long j, long j5) {
            super("bindTapActivityText", null);
            this.applicationUserId = j;
            this.messageChannelId = j5;
        }
    }

    @f
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000b\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\t\u0010$\u001a\u00020\bHÆ\u0003J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010\u0015JB\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0010HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015¨\u0006:"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "userId", "Lcom/discord/primitives/UserId;", "messageId", "Lcom/discord/primitives/MessageId;", "applicationUserId", "messageType", "Lcom/discord/chat/bridge/MessageType;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "<init>", "(JLjava/lang/String;JLcom/discord/chat/bridge/MessageType;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUserId-re6GcUE", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getApplicationUserId-re6GcUE", "getMessageType", "()Lcom/discord/chat/bridge/MessageType;", "getMessageChannelId-o4g7jtM", "component1", "component1-re6GcUE", "component2", "component2-3Eiw7ao", "component3", "component3-re6GcUE", "component4", "component5", "component5-o4g7jtM", "copy", "copy-7bunf98", "(JLjava/lang/String;JLcom/discord/chat/bridge/MessageType;J)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindTapCommandName extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long applicationUserId;
        private final long messageChannelId;

        @NotNull
        private final String messageId;

        @NotNull
        private final MessageType messageType;
        private final long userId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindTapCommandName$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindTapCommandName(int i7, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, userId, str2, userId2, messageType, channelId, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-7bunf98$default, reason: not valid java name */
        public static /* synthetic */ BindTapCommandName m371copy7bunf98$default(BindTapCommandName bindTapCommandName, long j, String str, long j5, MessageType messageType, long j7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindTapCommandName.userId;
            }
            long j10 = j;
            if ((i7 & 2) != 0) {
                str = bindTapCommandName.messageId;
            }
            String str2 = str;
            if ((i7 & 4) != 0) {
                j5 = bindTapCommandName.applicationUserId;
            }
            long j11 = j5;
            if ((i7 & 8) != 0) {
                messageType = bindTapCommandName.messageType;
            }
            return bindTapCommandName.m376copy7bunf98(j10, str2, j11, messageType, (i7 & 16) != 0 ? bindTapCommandName.messageChannelId : j7);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindTapCommandName self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
            output.g(serialDesc, 1, userId$$serializer, UserId.m1208boximpl(self.userId));
            output.g(serialDesc, 2, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.messageId));
            output.g(serialDesc, 3, userId$$serializer, UserId.m1208boximpl(self.applicationUserId));
            output.g(serialDesc, 4, MessageType.Serializer.INSTANCE, self.messageType);
            output.g(serialDesc, 5, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.messageChannelId));
        }

        /* JADX INFO: renamed from: component1-re6GcUE, reason: not valid java name and from getter */
        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2-3Eiw7ao, reason: not valid java name and from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component3-re6GcUE, reason: not valid java name and from getter */
        public final long getApplicationUserId() {
            return this.applicationUserId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageType getMessageType() {
            return this.messageType;
        }

        /* JADX INFO: renamed from: component5-o4g7jtM, reason: not valid java name and from getter */
        public final long getMessageChannelId() {
            return this.messageChannelId;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-7bunf98, reason: not valid java name */
        public final BindTapCommandName m376copy7bunf98(long userId, @NotNull String messageId, long applicationUserId, @NotNull MessageType messageType, long messageChannelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            return new BindTapCommandName(userId, messageId, applicationUserId, messageType, messageChannelId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindTapCommandName)) {
                return false;
            }
            BindTapCommandName bindTapCommandName = (BindTapCommandName) other;
            return UserId.m1212equalsimpl0(this.userId, bindTapCommandName.userId) && MessageId.m1160equalsimpl0(this.messageId, bindTapCommandName.messageId) && UserId.m1212equalsimpl0(this.applicationUserId, bindTapCommandName.applicationUserId) && this.messageType == bindTapCommandName.messageType && ChannelId.m1134equalsimpl0(this.messageChannelId, bindTapCommandName.messageChannelId);
        }

        /* JADX INFO: renamed from: getApplicationUserId-re6GcUE, reason: not valid java name */
        public final long m377getApplicationUserIdre6GcUE() {
            return this.applicationUserId;
        }

        /* JADX INFO: renamed from: getMessageChannelId-o4g7jtM, reason: not valid java name */
        public final long m378getMessageChannelIdo4g7jtM() {
            return this.messageChannelId;
        }

        @NotNull
        /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
        public final String m379getMessageId3Eiw7ao() {
            return this.messageId;
        }

        @NotNull
        public final MessageType getMessageType() {
            return this.messageType;
        }

        /* JADX INFO: renamed from: getUserId-re6GcUE, reason: not valid java name */
        public final long m380getUserIdre6GcUE() {
            return this.userId;
        }

        public int hashCode() {
            return ChannelId.m1135hashCodeimpl(this.messageChannelId) + ((this.messageType.hashCode() + ((UserId.m1213hashCodeimpl(this.applicationUserId) + ((MessageId.m1161hashCodeimpl(this.messageId) + (UserId.m1213hashCodeimpl(this.userId) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String strM1215toStringimpl = UserId.m1215toStringimpl(this.userId);
            String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
            String strM1215toStringimpl2 = UserId.m1215toStringimpl(this.applicationUserId);
            MessageType messageType = this.messageType;
            String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.messageChannelId);
            StringBuilder sbU = e.u("BindTapCommandName(userId=", strM1215toStringimpl, ", messageId=", strM1163toStringimpl, ", applicationUserId=");
            sbU.append(strM1215toStringimpl2);
            sbU.append(", messageType=");
            sbU.append(messageType);
            sbU.append(", messageChannelId=");
            return com.discord.chat.presentation.list.a.k(sbU, strM1137toStringimpl, ")");
        }

        public /* synthetic */ BindTapCommandName(long j, String str, long j5, MessageType messageType, long j7, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, j5, messageType, j7);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindTapCommandName(int i7, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (63 != (i7 & 63)) {
                e1.l(i7, 63, LinkContextData$BindTapCommandName$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = userId.m1217unboximpl();
            this.messageId = str2;
            this.applicationUserId = userId2.m1217unboximpl();
            this.messageType = messageType;
            this.messageChannelId = channelId.m1139unboximpl();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private BindTapCommandName(long j, String messageId, long j5, MessageType messageType, long j7) {
            super("bindTapCommandName", null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.userId = j;
            this.messageId = messageId;
            this.applicationUserId = j5;
            this.messageType = messageType;
            this.messageChannelId = j7;
        }
    }

    @f
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapUsername;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "userId", "Lcom/discord/primitives/UserId;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUserId-re6GcUE", "()J", "J", "getMessageChannelId-o4g7jtM", "component1", "component1-re6GcUE", "component2", "component2-o4g7jtM", "copy", "copy-mgJWFPo", "(JJ)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapUsername;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindTapUsername extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long messageChannelId;
        private final long userId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapUsername$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapUsername;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindTapUsername$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindTapUsername(int i7, String str, UserId userId, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, userId, channelId, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-mgJWFPo$default, reason: not valid java name */
        public static /* synthetic */ BindTapUsername m381copymgJWFPo$default(BindTapUsername bindTapUsername, long j, long j5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindTapUsername.userId;
            }
            if ((i7 & 2) != 0) {
                j5 = bindTapUsername.messageChannelId;
            }
            return bindTapUsername.m384copymgJWFPo(j, j5);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindTapUsername self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, UserId$$serializer.INSTANCE, UserId.m1208boximpl(self.userId));
            output.g(serialDesc, 2, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.messageChannelId));
        }

        /* JADX INFO: renamed from: component1-re6GcUE, reason: not valid java name and from getter */
        public final long getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
        public final long getMessageChannelId() {
            return this.messageChannelId;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-mgJWFPo, reason: not valid java name */
        public final BindTapUsername m384copymgJWFPo(long userId, long messageChannelId) {
            return new BindTapUsername(userId, messageChannelId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindTapUsername)) {
                return false;
            }
            BindTapUsername bindTapUsername = (BindTapUsername) other;
            return UserId.m1212equalsimpl0(this.userId, bindTapUsername.userId) && ChannelId.m1134equalsimpl0(this.messageChannelId, bindTapUsername.messageChannelId);
        }

        /* JADX INFO: renamed from: getMessageChannelId-o4g7jtM, reason: not valid java name */
        public final long m385getMessageChannelIdo4g7jtM() {
            return this.messageChannelId;
        }

        /* JADX INFO: renamed from: getUserId-re6GcUE, reason: not valid java name */
        public final long m386getUserIdre6GcUE() {
            return this.userId;
        }

        public int hashCode() {
            return ChannelId.m1135hashCodeimpl(this.messageChannelId) + (UserId.m1213hashCodeimpl(this.userId) * 31);
        }

        @NotNull
        public String toString() {
            return g.f("BindTapUsername(userId=", UserId.m1215toStringimpl(this.userId), ", messageChannelId=", ChannelId.m1137toStringimpl(this.messageChannelId), ")");
        }

        public /* synthetic */ BindTapUsername(long j, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindTapUsername(int i7, String str, UserId userId, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (7 != (i7 & 7)) {
                e1.l(i7, 7, LinkContextData$BindTapUsername$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = userId.m1217unboximpl();
            this.messageChannelId = channelId.m1139unboximpl();
        }

        private BindTapUsername(long j, long j5) {
            super("bindTapUsername", null);
            this.userId = j;
            this.messageChannelId = j5;
        }
    }

    @f
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000e\u0010\u0015J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\b,J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 Jb\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\u0012HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 ¨\u0006@"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "userId", "Lcom/discord/primitives/UserId;", "linkColor", "", "roleColor", "roleColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "shouldShowRoleDot", "", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "medium", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/bridge/rolecolors/RoleColors;Ljava/lang/Boolean;Lcom/discord/primitives/ChannelId;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "action", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/bridge/rolecolors/RoleColors;Ljava/lang/Boolean;Lcom/discord/primitives/ChannelId;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUserId-re6GcUE", "()J", "J", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRoleColor", "getRoleColors", "()Lcom/discord/chat/bridge/rolecolors/RoleColors;", "getShouldShowRoleDot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessageChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getMedium", "component1", "component1-re6GcUE", "component2", "component3", "component4", "component5", "component6", "component6-qMVnFVQ", "component7", "copy", "copy-Jh63YWE", "(JLjava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/bridge/rolecolors/RoleColors;Ljava/lang/Boolean;Lcom/discord/primitives/ChannelId;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindUserMenu extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Integer linkColor;
        private final Boolean medium;
        private final ChannelId messageChannelId;
        private final Integer roleColor;
        private final RoleColors roleColors;
        private final Boolean shouldShowRoleDot;
        private final long userId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindUserMenu$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BindUserMenu(int i7, String str, UserId userId, Integer num, Integer num2, RoleColors roleColors, Boolean bool, ChannelId channelId, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, str, userId, num, num2, roleColors, bool, channelId, bool2, serializationConstructorMarker);
        }

        /* JADX INFO: renamed from: copy-Jh63YWE$default, reason: not valid java name */
        public static /* synthetic */ BindUserMenu m387copyJh63YWE$default(BindUserMenu bindUserMenu, long j, Integer num, Integer num2, RoleColors roleColors, Boolean bool, ChannelId channelId, Boolean bool2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bindUserMenu.userId;
            }
            long j5 = j;
            if ((i7 & 2) != 0) {
                num = bindUserMenu.linkColor;
            }
            Integer num3 = num;
            if ((i7 & 4) != 0) {
                num2 = bindUserMenu.roleColor;
            }
            Integer num4 = num2;
            if ((i7 & 8) != 0) {
                roleColors = bindUserMenu.roleColors;
            }
            RoleColors roleColors2 = roleColors;
            if ((i7 & 16) != 0) {
                bool = bindUserMenu.shouldShowRoleDot;
            }
            return bindUserMenu.m390copyJh63YWE(j5, num3, num4, roleColors2, bool, (i7 & 32) != 0 ? bindUserMenu.messageChannelId : channelId, (i7 & 64) != 0 ? bindUserMenu.medium : bool2);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindUserMenu self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, UserId$$serializer.INSTANCE, UserId.m1208boximpl(self.userId));
            if (output.u(serialDesc, 2) || self.linkColor != null) {
                output.r(serialDesc, 2, m0.f17573a, self.linkColor);
            }
            if (output.u(serialDesc, 3) || self.roleColor != null) {
                output.r(serialDesc, 3, m0.f17573a, self.roleColor);
            }
            if (output.u(serialDesc, 4) || self.roleColors != null) {
                output.r(serialDesc, 4, RoleColors$$serializer.INSTANCE, self.roleColors);
            }
            if (output.u(serialDesc, 5) || self.shouldShowRoleDot != null) {
                output.r(serialDesc, 5, or.g.f17537a, self.shouldShowRoleDot);
            }
            if (output.u(serialDesc, 6) || self.messageChannelId != null) {
                output.r(serialDesc, 6, ChannelId$$serializer.INSTANCE, self.messageChannelId);
            }
            if (!output.u(serialDesc, 7) && self.medium == null) {
                return;
            }
            output.r(serialDesc, 7, or.g.f17537a, self.medium);
        }

        /* JADX INFO: renamed from: component1-re6GcUE, reason: not valid java name and from getter */
        public final long getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getLinkColor() {
            return this.linkColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getRoleColor() {
            return this.roleColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final RoleColors getRoleColors() {
            return this.roleColors;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getShouldShowRoleDot() {
            return this.shouldShowRoleDot;
        }

        /* JADX INFO: renamed from: component6-qMVnFVQ, reason: not valid java name and from getter */
        public final ChannelId getMessageChannelId() {
            return this.messageChannelId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getMedium() {
            return this.medium;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-Jh63YWE, reason: not valid java name */
        public final BindUserMenu m390copyJh63YWE(long userId, Integer linkColor, Integer roleColor, RoleColors roleColors, Boolean shouldShowRoleDot, ChannelId messageChannelId, Boolean medium) {
            return new BindUserMenu(userId, linkColor, roleColor, roleColors, shouldShowRoleDot, messageChannelId, medium, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindUserMenu)) {
                return false;
            }
            BindUserMenu bindUserMenu = (BindUserMenu) other;
            return UserId.m1212equalsimpl0(this.userId, bindUserMenu.userId) && Intrinsics.areEqual(this.linkColor, bindUserMenu.linkColor) && Intrinsics.areEqual(this.roleColor, bindUserMenu.roleColor) && Intrinsics.areEqual(this.roleColors, bindUserMenu.roleColors) && Intrinsics.areEqual(this.shouldShowRoleDot, bindUserMenu.shouldShowRoleDot) && Intrinsics.areEqual(this.messageChannelId, bindUserMenu.messageChannelId) && Intrinsics.areEqual(this.medium, bindUserMenu.medium);
        }

        public final Integer getLinkColor() {
            return this.linkColor;
        }

        public final Boolean getMedium() {
            return this.medium;
        }

        /* JADX INFO: renamed from: getMessageChannelId-qMVnFVQ, reason: not valid java name */
        public final ChannelId m391getMessageChannelIdqMVnFVQ() {
            return this.messageChannelId;
        }

        public final Integer getRoleColor() {
            return this.roleColor;
        }

        public final RoleColors getRoleColors() {
            return this.roleColors;
        }

        public final Boolean getShouldShowRoleDot() {
            return this.shouldShowRoleDot;
        }

        /* JADX INFO: renamed from: getUserId-re6GcUE, reason: not valid java name */
        public final long m392getUserIdre6GcUE() {
            return this.userId;
        }

        public int hashCode() {
            int iM1213hashCodeimpl = UserId.m1213hashCodeimpl(this.userId) * 31;
            Integer num = this.linkColor;
            int iHashCode = (iM1213hashCodeimpl + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.roleColor;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            RoleColors roleColors = this.roleColors;
            int iHashCode3 = (iHashCode2 + (roleColors == null ? 0 : roleColors.hashCode())) * 31;
            Boolean bool = this.shouldShowRoleDot;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            ChannelId channelId = this.messageChannelId;
            int iM1135hashCodeimpl = (iHashCode4 + (channelId == null ? 0 : ChannelId.m1135hashCodeimpl(channelId.m1139unboximpl()))) * 31;
            Boolean bool2 = this.medium;
            return iM1135hashCodeimpl + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BindUserMenu(userId=" + UserId.m1215toStringimpl(this.userId) + ", linkColor=" + this.linkColor + ", roleColor=" + this.roleColor + ", roleColors=" + this.roleColors + ", shouldShowRoleDot=" + this.shouldShowRoleDot + ", messageChannelId=" + this.messageChannelId + ", medium=" + this.medium + ")";
        }

        public /* synthetic */ BindUserMenu(long j, Integer num, Integer num2, RoleColors roleColors, Boolean bool, ChannelId channelId, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, num, num2, roleColors, bool, channelId, bool2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ BindUserMenu(int i7, String str, UserId userId, Integer num, Integer num2, RoleColors roleColors, Boolean bool, ChannelId channelId, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindUserMenu$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.userId = userId.m1217unboximpl();
            if ((i7 & 4) == 0) {
                this.linkColor = null;
            } else {
                this.linkColor = num;
            }
            if ((i7 & 8) == 0) {
                this.roleColor = null;
            } else {
                this.roleColor = num2;
            }
            if ((i7 & 16) == 0) {
                this.roleColors = null;
            } else {
                this.roleColors = roleColors;
            }
            if ((i7 & 32) == 0) {
                this.shouldShowRoleDot = null;
            } else {
                this.shouldShowRoleDot = bool;
            }
            if ((i7 & 64) == 0) {
                this.messageChannelId = null;
            } else {
                this.messageChannelId = channelId;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                this.medium = null;
            } else {
                this.medium = bool2;
            }
        }

        public /* synthetic */ BindUserMenu(long j, Integer num, Integer num2, RoleColors roleColors, Boolean bool, ChannelId channelId, Boolean bool2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? null : roleColors, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? null : channelId, (i7 & 64) != 0 ? null : bool2, null);
        }

        private BindUserMenu(long j, Integer num, Integer num2, RoleColors roleColors, Boolean bool, ChannelId channelId, Boolean bool2) {
            super("bindUserMenu", null);
            this.userId = j;
            this.linkColor = num;
            this.roleColor = num2;
            this.roleColors = roleColors;
            this.shouldShowRoleDot = bool;
            this.messageChannelId = channelId;
            this.medium = bool2;
        }
    }

    @f
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003#$%B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\rJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "message", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;", "notificationType", "", "<init>", "(Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;Ljava/lang/String;)V", "seen0", "", "action", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;", "getNotificationType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "SurveyMessage", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindUserSurvey extends LinkContext {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final SurveyMessage message;
        private final String notificationType;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkContextData$BindUserSurvey$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @f
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000bHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006/"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;", "", StackTraceHelper.ID_KEY, "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "loggingName", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getLoggingName", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "copy", "copy-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SurveyMessage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final long channelId;

            @NotNull
            private final String id;
            private final String loggingName;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey$SurveyMessage;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return LinkContextData$BindUserSurvey$SurveyMessage$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ SurveyMessage(int i7, String str, ChannelId channelId, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
                this(i7, str, channelId, str2, serializationConstructorMarker);
            }

            /* JADX INFO: renamed from: copy-Eqy5D80$default, reason: not valid java name */
            public static /* synthetic */ SurveyMessage m393copyEqy5D80$default(SurveyMessage surveyMessage, String str, long j, String str2, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = surveyMessage.id;
                }
                if ((i7 & 2) != 0) {
                    j = surveyMessage.channelId;
                }
                if ((i7 & 4) != 0) {
                    str2 = surveyMessage.loggingName;
                }
                return surveyMessage.m397copyEqy5D80(str, j, str2);
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM$annotations, reason: not valid java name */
            public static /* synthetic */ void m394getChannelIdo4g7jtM$annotations() {
            }

            public static final /* synthetic */ void write$Self$chat_release(SurveyMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.g(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.id));
                output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
                if (!output.u(serialDesc, 2) && self.loggingName == null) {
                    return;
                }
                output.r(serialDesc, 2, s1.f17602a, self.loggingName);
            }

            @NotNull
            /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
            public final long getChannelId() {
                return this.channelId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getLoggingName() {
                return this.loggingName;
            }

            @NotNull
            /* JADX INFO: renamed from: copy-Eqy5D80, reason: not valid java name */
            public final SurveyMessage m397copyEqy5D80(@NotNull String id2, long channelId, String loggingName) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new SurveyMessage(id2, channelId, loggingName, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SurveyMessage)) {
                    return false;
                }
                SurveyMessage surveyMessage = (SurveyMessage) other;
                return MessageId.m1160equalsimpl0(this.id, surveyMessage.id) && ChannelId.m1134equalsimpl0(this.channelId, surveyMessage.channelId) && Intrinsics.areEqual(this.loggingName, surveyMessage.loggingName);
            }

            /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
            public final long m398getChannelIdo4g7jtM() {
                return this.channelId;
            }

            @NotNull
            /* JADX INFO: renamed from: getId-3Eiw7ao, reason: not valid java name */
            public final String m399getId3Eiw7ao() {
                return this.id;
            }

            public final String getLoggingName() {
                return this.loggingName;
            }

            public int hashCode() {
                int iD = b.d(this.channelId, MessageId.m1161hashCodeimpl(this.id) * 31, 31);
                String str = this.loggingName;
                return iD + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String strM1163toStringimpl = MessageId.m1163toStringimpl(this.id);
                String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
                return com.discord.chat.presentation.list.a.k(e.u("SurveyMessage(id=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", loggingName="), this.loggingName, ")");
            }

            public /* synthetic */ SurveyMessage(String str, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j, str2);
            }

            private /* synthetic */ SurveyMessage(int i7, String str, ChannelId channelId, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i7 & 3)) {
                    e1.l(i7, 3, LinkContextData$BindUserSurvey$SurveyMessage$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.channelId = channelId.m1139unboximpl();
                if ((i7 & 4) == 0) {
                    this.loggingName = null;
                } else {
                    this.loggingName = str2;
                }
            }

            private SurveyMessage(String id2, long j, String str) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.channelId = j;
                this.loggingName = str;
            }

            public /* synthetic */ SurveyMessage(String str, long j, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j, (i7 & 4) != 0 ? null : str2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BindUserSurvey(int i7, String str, SurveyMessage surveyMessage, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i7, str, serializationConstructorMarker);
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, LinkContextData$BindUserSurvey$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.message = surveyMessage;
            if ((i7 & 4) == 0) {
                this.notificationType = null;
            } else {
                this.notificationType = str2;
            }
        }

        public static /* synthetic */ BindUserSurvey copy$default(BindUserSurvey bindUserSurvey, SurveyMessage surveyMessage, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                surveyMessage = bindUserSurvey.message;
            }
            if ((i7 & 2) != 0) {
                str = bindUserSurvey.notificationType;
            }
            return bindUserSurvey.copy(surveyMessage, str);
        }

        public static final /* synthetic */ void write$Self$chat_release(BindUserSurvey self, CompositeEncoder output, SerialDescriptor serialDesc) {
            LinkContext.write$Self(self, output, serialDesc);
            output.g(serialDesc, 1, LinkContextData$BindUserSurvey$SurveyMessage$$serializer.INSTANCE, self.message);
            if (!output.u(serialDesc, 2) && self.notificationType == null) {
                return;
            }
            output.r(serialDesc, 2, s1.f17602a, self.notificationType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SurveyMessage getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNotificationType() {
            return this.notificationType;
        }

        @NotNull
        public final BindUserSurvey copy(@NotNull SurveyMessage message, String notificationType) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new BindUserSurvey(message, notificationType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindUserSurvey)) {
                return false;
            }
            BindUserSurvey bindUserSurvey = (BindUserSurvey) other;
            return Intrinsics.areEqual(this.message, bindUserSurvey.message) && Intrinsics.areEqual(this.notificationType, bindUserSurvey.notificationType);
        }

        @NotNull
        public final SurveyMessage getMessage() {
            return this.message;
        }

        public final String getNotificationType() {
            return this.notificationType;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.notificationType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "BindUserSurvey(message=" + this.message + ", notificationType=" + this.notificationType + ")";
        }

        public /* synthetic */ BindUserSurvey(SurveyMessage surveyMessage, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(surveyMessage, (i7 & 2) != 0 ? null : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindUserSurvey(@NotNull SurveyMessage message, String str) {
            super("bindUserSurvey", null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.notificationType = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LinkContextDataSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @pr.e(discriminator = "action")
    @f
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "Lcom/discord/chat/bridge/contentnode/LinkContextData;", "action", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindDismissMessage;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindInsertText;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJoinStream;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindJumpToMessage;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenGdmCustomizeActionSheet;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenInviteSheet;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenPins;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenRoleSubscriptionOverview;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenThreadChannel;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindOpenUrl;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapActivityText;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapUsername;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserSurvey;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class LinkContext extends LinkContextData {

        @NotNull
        private final String action;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Lazy $cachedSerializer$delegate = l.a(m.f19486e, new a(11));

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkContext;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) LinkContext.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LinkContext(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new SealedClassSerializer("com.discord.chat.bridge.contentnode.LinkContextData.LinkContext", Reflection.getOrCreateKotlinClass(LinkContext.class), new KClass[]{Reflection.getOrCreateKotlinClass(BindDismissMessage.class), Reflection.getOrCreateKotlinClass(BindGuildMenu.class), Reflection.getOrCreateKotlinClass(BindInsertText.class), Reflection.getOrCreateKotlinClass(BindJoinStream.class), Reflection.getOrCreateKotlinClass(BindJumpToMessage.class), Reflection.getOrCreateKotlinClass(BindOpenGdmCustomizeActionSheet.class), Reflection.getOrCreateKotlinClass(BindOpenInviteSheet.class), Reflection.getOrCreateKotlinClass(BindOpenPins.class), Reflection.getOrCreateKotlinClass(BindOpenRoleSubscriptionOverview.class), Reflection.getOrCreateKotlinClass(BindOpenThreadChannel.class), Reflection.getOrCreateKotlinClass(BindOpenUrl.class), Reflection.getOrCreateKotlinClass(BindTapActivityText.class), Reflection.getOrCreateKotlinClass(BindTapCommandName.class), Reflection.getOrCreateKotlinClass(BindTapUsername.class), Reflection.getOrCreateKotlinClass(BindUserMenu.class), Reflection.getOrCreateKotlinClass(BindUserSurvey.class)}, new KSerializer[]{LinkContextData$BindDismissMessage$$serializer.INSTANCE, LinkContextData$BindGuildMenu$$serializer.INSTANCE, LinkContextData$BindInsertText$$serializer.INSTANCE, LinkContextData$BindJoinStream$$serializer.INSTANCE, LinkContextData$BindJumpToMessage$$serializer.INSTANCE, LinkContextData$BindOpenGdmCustomizeActionSheet$$serializer.INSTANCE, LinkContextData$BindOpenInviteSheet$$serializer.INSTANCE, LinkContextData$BindOpenPins$$serializer.INSTANCE, LinkContextData$BindOpenRoleSubscriptionOverview$$serializer.INSTANCE, LinkContextData$BindOpenThreadChannel$$serializer.INSTANCE, LinkContextData$BindOpenUrl$$serializer.INSTANCE, LinkContextData$BindTapActivityText$$serializer.INSTANCE, LinkContextData$BindTapCommandName$$serializer.INSTANCE, LinkContextData$BindTapUsername$$serializer.INSTANCE, LinkContextData$BindUserMenu$$serializer.INSTANCE, LinkContextData$BindUserSurvey$$serializer.INSTANCE}, new Annotation[]{new LinkContextData$LinkContext$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("action")});
        }

        public static final /* synthetic */ void write$Self(LinkContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.action);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        public /* synthetic */ LinkContext(int i7, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            this.action = str;
        }

        private LinkContext(String str) {
            super(null);
            this.action = str;
        }
    }

    @f(with = LinkUrlSerializer.class)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkUrl;", "Lcom/discord/chat/bridge/contentnode/LinkContextData;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LinkUrlSerializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkUrl extends LinkContextData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String url;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkUrl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkUrl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return LinkUrlSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkUrl$LinkUrlSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$LinkUrl;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LinkUrlSerializer implements KSerializer {

            @NotNull
            public static final LinkUrlSerializer INSTANCE = new LinkUrlSerializer();

            private LinkUrlSerializer() {
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            @NotNull
            public SerialDescriptor getDescriptor() {
                return m3.m.a("LinkUrl", mr.e.j);
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            @NotNull
            public LinkUrl deserialize(@NotNull Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                try {
                    if (decoder instanceof pr.g) {
                        return new LinkUrl(h.k(((pr.g) decoder).a()).a());
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                } catch (Exception unused) {
                    return new LinkUrl("");
                }
            }

            @Override // kotlinx.serialization.KSerializer
            public void serialize(@NotNull Encoder encoder, @NotNull LinkUrl value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkUrl(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ LinkUrl copy$default(LinkUrl linkUrl, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = linkUrl.url;
            }
            return linkUrl.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final LinkUrl copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new LinkUrl(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LinkUrl) && Intrinsics.areEqual(this.url, ((LinkUrl) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return g.e("LinkUrl(url=", this.url, ")");
        }
    }

    public /* synthetic */ LinkContextData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LinkContextData() {
    }
}
