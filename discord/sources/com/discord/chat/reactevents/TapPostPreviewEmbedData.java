package com.discord.chat.reactevents;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0013\u0010\u0010¨\u0006-"}, d2 = {"Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "Lcom/discord/reactevents/ReactEvent;", "guildId", "", "parentChannelId", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGuildId", "()Ljava/lang/String;", "getParentChannelId", "getThreadId", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "component1", "component2", "component3", "component4", "component4-3Eiw7ao", "copy", "copy-wInV0_I", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapPostPreviewEmbedData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String guildId;

    @NotNull
    private final String messageId;

    @NotNull
    private final String parentChannelId;

    @NotNull
    private final String threadId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/TapPostPreviewEmbedData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TapPostPreviewEmbedData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TapPostPreviewEmbedData(int i7, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, str2, str3, str4, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-wInV0_I$default, reason: not valid java name */
    public static /* synthetic */ TapPostPreviewEmbedData m887copywInV0_I$default(TapPostPreviewEmbedData tapPostPreviewEmbedData, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapPostPreviewEmbedData.guildId;
        }
        if ((i7 & 2) != 0) {
            str2 = tapPostPreviewEmbedData.parentChannelId;
        }
        if ((i7 & 4) != 0) {
            str3 = tapPostPreviewEmbedData.threadId;
        }
        if ((i7 & 8) != 0) {
            str4 = tapPostPreviewEmbedData.messageId;
        }
        return tapPostPreviewEmbedData.m889copywInV0_I(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$chat_release(TapPostPreviewEmbedData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.guildId);
        output.q(serialDesc, 1, self.parentChannelId);
        output.q(serialDesc, 2, self.threadId);
        output.g(serialDesc, 3, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.messageId));
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuildId() {
        return this.guildId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentChannelId() {
        return this.parentChannelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-wInV0_I, reason: not valid java name */
    public final TapPostPreviewEmbedData m889copywInV0_I(@NotNull String guildId, @NotNull String parentChannelId, @NotNull String threadId, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(guildId, "guildId");
        Intrinsics.checkNotNullParameter(parentChannelId, "parentChannelId");
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new TapPostPreviewEmbedData(guildId, parentChannelId, threadId, messageId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapPostPreviewEmbedData)) {
            return false;
        }
        TapPostPreviewEmbedData tapPostPreviewEmbedData = (TapPostPreviewEmbedData) other;
        return Intrinsics.areEqual(this.guildId, tapPostPreviewEmbedData.guildId) && Intrinsics.areEqual(this.parentChannelId, tapPostPreviewEmbedData.parentChannelId) && Intrinsics.areEqual(this.threadId, tapPostPreviewEmbedData.threadId) && MessageId.m1160equalsimpl0(this.messageId, tapPostPreviewEmbedData.messageId);
    }

    @NotNull
    public final String getGuildId() {
        return this.guildId;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m890getMessageId3Eiw7ao() {
        return this.messageId;
    }

    @NotNull
    public final String getParentChannelId() {
        return this.parentChannelId;
    }

    @NotNull
    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return MessageId.m1161hashCodeimpl(this.messageId) + e.d(e.d(this.guildId.hashCode() * 31, 31, this.parentChannelId), 31, this.threadId);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        String str = this.guildId;
        String str2 = this.parentChannelId;
        return a.l(e.u("TapPostPreviewEmbedData(guildId=", str, ", parentChannelId=", str2, ", threadId="), this.threadId, ", messageId=", MessageId.m1163toStringimpl(this.messageId), ")");
    }

    public /* synthetic */ TapPostPreviewEmbedData(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    private /* synthetic */ TapPostPreviewEmbedData(int i7, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, TapPostPreviewEmbedData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.guildId = str;
        this.parentChannelId = str2;
        this.threadId = str3;
        this.messageId = str4;
    }

    private TapPostPreviewEmbedData(String guildId, String parentChannelId, String threadId, String messageId) {
        Intrinsics.checkNotNullParameter(guildId, "guildId");
        Intrinsics.checkNotNullParameter(parentChannelId, "parentChannelId");
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.guildId = guildId;
        this.parentChannelId = parentChannelId;
        this.threadId = threadId;
        this.messageId = messageId;
    }
}
