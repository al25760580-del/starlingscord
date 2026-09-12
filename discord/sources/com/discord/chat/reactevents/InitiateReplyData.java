package com.discord.chat.reactevents;

import a3.e;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00063"}, d2 = {"Lcom/discord/chat/reactevents/InitiateReplyData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "triggerHaptic", "", "location", "", "<init>", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getTriggerHaptic", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLocation", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "copy", "copy-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)Lcom/discord/chat/reactevents/InitiateReplyData;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InitiateReplyData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long channelId;
    private final String location;

    @NotNull
    private final String messageId;
    private final Boolean triggerHaptic;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/InitiateReplyData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/InitiateReplyData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return InitiateReplyData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InitiateReplyData(int i7, String str, ChannelId channelId, Boolean bool, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, channelId, bool, str2, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-8a0ehIg$default, reason: not valid java name */
    public static /* synthetic */ InitiateReplyData m807copy8a0ehIg$default(InitiateReplyData initiateReplyData, String str, long j, Boolean bool, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = initiateReplyData.messageId;
        }
        if ((i7 & 2) != 0) {
            j = initiateReplyData.channelId;
        }
        if ((i7 & 4) != 0) {
            bool = initiateReplyData.triggerHaptic;
        }
        if ((i7 & 8) != 0) {
            str2 = initiateReplyData.location;
        }
        return initiateReplyData.m810copy8a0ehIg(str, j, bool, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(InitiateReplyData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.messageId));
        output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
        if (output.u(serialDesc, 2) || !Intrinsics.areEqual(self.triggerHaptic, Boolean.FALSE)) {
            output.r(serialDesc, 2, g.f17537a, self.triggerHaptic);
        }
        output.r(serialDesc, 3, s1.f17602a, self.location);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getTriggerHaptic() {
        return this.triggerHaptic;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-8a0ehIg, reason: not valid java name */
    public final InitiateReplyData m810copy8a0ehIg(@NotNull String messageId, long channelId, Boolean triggerHaptic, String location) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new InitiateReplyData(messageId, channelId, triggerHaptic, location, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitiateReplyData)) {
            return false;
        }
        InitiateReplyData initiateReplyData = (InitiateReplyData) other;
        return MessageId.m1160equalsimpl0(this.messageId, initiateReplyData.messageId) && ChannelId.m1134equalsimpl0(this.channelId, initiateReplyData.channelId) && Intrinsics.areEqual(this.triggerHaptic, initiateReplyData.triggerHaptic) && Intrinsics.areEqual(this.location, initiateReplyData.location);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m811getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m812getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final Boolean getTriggerHaptic() {
        return this.triggerHaptic;
    }

    public int hashCode() {
        int iD = b.d(this.channelId, MessageId.m1161hashCodeimpl(this.messageId) * 31, 31);
        Boolean bool = this.triggerHaptic;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.location;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        Boolean bool = this.triggerHaptic;
        String str = this.location;
        StringBuilder sbU = e.u("InitiateReplyData(messageId=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", triggerHaptic=");
        sbU.append(bool);
        sbU.append(", location=");
        sbU.append(str);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ InitiateReplyData(String str, long j, Boolean bool, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, bool, str2);
    }

    private /* synthetic */ InitiateReplyData(int i7, String str, ChannelId channelId, Boolean bool, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i7 & 11)) {
            e1.l(i7, 11, InitiateReplyData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.messageId = str;
        this.channelId = channelId.m1139unboximpl();
        if ((i7 & 4) == 0) {
            this.triggerHaptic = Boolean.FALSE;
        } else {
            this.triggerHaptic = bool;
        }
        this.location = str2;
    }

    private InitiateReplyData(String messageId, long j, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.channelId = j;
        this.triggerHaptic = bool;
        this.location = str;
    }

    public /* synthetic */ InitiateReplyData(String str, long j, Boolean bool, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i7 & 4) != 0 ? Boolean.FALSE : bool, str2, null);
    }
}
