package com.discord.chat.reactevents;

import a3.e;
import com.discord.chat.presentation.list.a;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015¨\u0006+"}, d2 = {"Lcom/discord/chat/reactevents/TapObscuredMediaToggleData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "", "channelId", "attachmentId", "embedId", "isReveal", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessageId", "()Ljava/lang/String;", "getChannelId", "getAttachmentId", "getEmbedId", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapObscuredMediaToggleData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String attachmentId;

    @NotNull
    private final String channelId;

    @NotNull
    private final String embedId;
    private final boolean isReveal;

    @NotNull
    private final String messageId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/TapObscuredMediaToggleData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapObscuredMediaToggleData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TapObscuredMediaToggleData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TapObscuredMediaToggleData(int i7, String str, String str2, String str3, String str4, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, TapObscuredMediaToggleData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.messageId = str;
        this.channelId = str2;
        this.attachmentId = str3;
        this.embedId = str4;
        this.isReveal = z5;
    }

    public static /* synthetic */ TapObscuredMediaToggleData copy$default(TapObscuredMediaToggleData tapObscuredMediaToggleData, String str, String str2, String str3, String str4, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapObscuredMediaToggleData.messageId;
        }
        if ((i7 & 2) != 0) {
            str2 = tapObscuredMediaToggleData.channelId;
        }
        if ((i7 & 4) != 0) {
            str3 = tapObscuredMediaToggleData.attachmentId;
        }
        if ((i7 & 8) != 0) {
            str4 = tapObscuredMediaToggleData.embedId;
        }
        if ((i7 & 16) != 0) {
            z5 = tapObscuredMediaToggleData.isReveal;
        }
        boolean z6 = z5;
        String str5 = str3;
        return tapObscuredMediaToggleData.copy(str, str2, str5, str4, z6);
    }

    public static final /* synthetic */ void write$Self$chat_release(TapObscuredMediaToggleData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.messageId);
        output.q(serialDesc, 1, self.channelId);
        output.q(serialDesc, 2, self.attachmentId);
        output.q(serialDesc, 3, self.embedId);
        output.p(serialDesc, 4, self.isReveal);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmbedId() {
        return this.embedId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsReveal() {
        return this.isReveal;
    }

    @NotNull
    public final TapObscuredMediaToggleData copy(@NotNull String messageId, @NotNull String channelId, @NotNull String attachmentId, @NotNull String embedId, boolean isReveal) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(embedId, "embedId");
        return new TapObscuredMediaToggleData(messageId, channelId, attachmentId, embedId, isReveal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapObscuredMediaToggleData)) {
            return false;
        }
        TapObscuredMediaToggleData tapObscuredMediaToggleData = (TapObscuredMediaToggleData) other;
        return Intrinsics.areEqual(this.messageId, tapObscuredMediaToggleData.messageId) && Intrinsics.areEqual(this.channelId, tapObscuredMediaToggleData.channelId) && Intrinsics.areEqual(this.attachmentId, tapObscuredMediaToggleData.attachmentId) && Intrinsics.areEqual(this.embedId, tapObscuredMediaToggleData.embedId) && this.isReveal == tapObscuredMediaToggleData.isReveal;
    }

    @NotNull
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final String getEmbedId() {
        return this.embedId;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReveal) + e.d(e.d(e.d(this.messageId.hashCode() * 31, 31, this.channelId), 31, this.attachmentId), 31, this.embedId);
    }

    public final boolean isReveal() {
        return this.isReveal;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        String str = this.messageId;
        String str2 = this.channelId;
        String str3 = this.attachmentId;
        String str4 = this.embedId;
        boolean z5 = this.isReveal;
        StringBuilder sbU = e.u("TapObscuredMediaToggleData(messageId=", str, ", channelId=", str2, ", attachmentId=");
        e.A(sbU, str3, ", embedId=", str4, ", isReveal=");
        return a.m(sbU, z5, ")");
    }

    public TapObscuredMediaToggleData(@NotNull String messageId, @NotNull String channelId, @NotNull String attachmentId, @NotNull String embedId, boolean z5) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(embedId, "embedId");
        this.messageId = messageId;
        this.channelId = channelId;
        this.attachmentId = attachmentId;
        this.embedId = embedId;
        this.isReveal = z5;
    }
}
