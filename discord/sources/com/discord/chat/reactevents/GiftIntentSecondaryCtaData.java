package com.discord.chat.reactevents;

import a3.e;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00061"}, d2 = {"Lcom/discord/chat/reactevents/GiftIntentSecondaryCtaData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "recipientUserId", "Lcom/discord/primitives/UserId;", "giftIntentType", "", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;ILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getRecipientUserId-re6GcUE", "()J", "J", "getGiftIntentType", "()I", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component1-3Eiw7ao", "component2", "component2-re6GcUE", "component3", "copy", "copy-gzHKzLY", "(Ljava/lang/String;JI)Lcom/discord/chat/reactevents/GiftIntentSecondaryCtaData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GiftIntentSecondaryCtaData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int giftIntentType;

    @NotNull
    private final String messageId;
    private final long recipientUserId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/GiftIntentSecondaryCtaData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/GiftIntentSecondaryCtaData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GiftIntentSecondaryCtaData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GiftIntentSecondaryCtaData(int i7, String str, UserId userId, int i10, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, userId, i10, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-gzHKzLY$default, reason: not valid java name */
    public static /* synthetic */ GiftIntentSecondaryCtaData m795copygzHKzLY$default(GiftIntentSecondaryCtaData giftIntentSecondaryCtaData, String str, long j, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftIntentSecondaryCtaData.messageId;
        }
        if ((i10 & 2) != 0) {
            j = giftIntentSecondaryCtaData.recipientUserId;
        }
        if ((i10 & 4) != 0) {
            i7 = giftIntentSecondaryCtaData.giftIntentType;
        }
        return giftIntentSecondaryCtaData.m798copygzHKzLY(str, j, i7);
    }

    public static final /* synthetic */ void write$Self$chat_release(GiftIntentSecondaryCtaData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.messageId));
        output.g(serialDesc, 1, UserId$$serializer.INSTANCE, UserId.m1208boximpl(self.recipientUserId));
        output.l(2, self.giftIntentType, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2-re6GcUE, reason: not valid java name and from getter */
    public final long getRecipientUserId() {
        return this.recipientUserId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGiftIntentType() {
        return this.giftIntentType;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-gzHKzLY, reason: not valid java name */
    public final GiftIntentSecondaryCtaData m798copygzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new GiftIntentSecondaryCtaData(messageId, recipientUserId, giftIntentType, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftIntentSecondaryCtaData)) {
            return false;
        }
        GiftIntentSecondaryCtaData giftIntentSecondaryCtaData = (GiftIntentSecondaryCtaData) other;
        return MessageId.m1160equalsimpl0(this.messageId, giftIntentSecondaryCtaData.messageId) && UserId.m1212equalsimpl0(this.recipientUserId, giftIntentSecondaryCtaData.recipientUserId) && this.giftIntentType == giftIntentSecondaryCtaData.giftIntentType;
    }

    public final int getGiftIntentType() {
        return this.giftIntentType;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m799getMessageId3Eiw7ao() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: getRecipientUserId-re6GcUE, reason: not valid java name */
    public final long m800getRecipientUserIdre6GcUE() {
        return this.recipientUserId;
    }

    public int hashCode() {
        return Integer.hashCode(this.giftIntentType) + ((UserId.m1213hashCodeimpl(this.recipientUserId) + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return GiftIntentCardViewedDataKt.m788serializeGiftIntentEventgzHKzLY(this.messageId, this.recipientUserId, this.giftIntentType);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String strM1215toStringimpl = UserId.m1215toStringimpl(this.recipientUserId);
        return b.l(e.u("GiftIntentSecondaryCtaData(messageId=", strM1163toStringimpl, ", recipientUserId=", strM1215toStringimpl, ", giftIntentType="), this.giftIntentType, ")");
    }

    public /* synthetic */ GiftIntentSecondaryCtaData(String str, long j, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i7);
    }

    private /* synthetic */ GiftIntentSecondaryCtaData(int i7, String str, UserId userId, int i10, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, GiftIntentSecondaryCtaData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.messageId = str;
        this.recipientUserId = userId.m1217unboximpl();
        this.giftIntentType = i10;
    }

    private GiftIntentSecondaryCtaData(String messageId, long j, int i7) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.recipientUserId = j;
        this.giftIntentType = i7;
    }
}
