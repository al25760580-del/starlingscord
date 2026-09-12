package com.discord.chat.reactevents;

import a3.e;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/reactevents/LongPressPollImageData;", "Lcom/discord/reactevents/ReactEvent;", "channelId", "", "messageId", "attachmentId", "layout", "Lcom/discord/chat/reactevents/TapImageData$Layout;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;)V", "getChannelId", "()Ljava/lang/String;", "getMessageId", "getAttachmentId", "getLayout", "()Lcom/discord/chat/reactevents/TapImageData$Layout;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LongPressPollImageData implements ReactEvent {

    @NotNull
    private final String attachmentId;

    @NotNull
    private final String channelId;

    @NotNull
    private final TapImageData.Layout layout;

    @NotNull
    private final String messageId;

    public LongPressPollImageData(@NotNull String channelId, @NotNull String messageId, @NotNull String attachmentId, @NotNull TapImageData.Layout layout) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.channelId = channelId;
        this.messageId = messageId;
        this.attachmentId = attachmentId;
        this.layout = layout;
    }

    public static /* synthetic */ LongPressPollImageData copy$default(LongPressPollImageData longPressPollImageData, String str, String str2, String str3, TapImageData.Layout layout, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = longPressPollImageData.channelId;
        }
        if ((i7 & 2) != 0) {
            str2 = longPressPollImageData.messageId;
        }
        if ((i7 & 4) != 0) {
            str3 = longPressPollImageData.attachmentId;
        }
        if ((i7 & 8) != 0) {
            layout = longPressPollImageData.layout;
        }
        return longPressPollImageData.copy(str, str2, str3, layout);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TapImageData.Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LongPressPollImageData copy(@NotNull String channelId, @NotNull String messageId, @NotNull String attachmentId, @NotNull TapImageData.Layout layout) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new LongPressPollImageData(channelId, messageId, attachmentId, layout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongPressPollImageData)) {
            return false;
        }
        LongPressPollImageData longPressPollImageData = (LongPressPollImageData) other;
        return Intrinsics.areEqual(this.channelId, longPressPollImageData.channelId) && Intrinsics.areEqual(this.messageId, longPressPollImageData.messageId) && Intrinsics.areEqual(this.attachmentId, longPressPollImageData.attachmentId) && Intrinsics.areEqual(this.layout, longPressPollImageData.layout);
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
    public final TapImageData.Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.layout.hashCode() + e.d(e.d(this.channelId.hashCode() * 31, 31, this.messageId), 31, this.attachmentId);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("channelId", this.channelId), new Pair("messageId", this.messageId), new Pair("attachmentId", this.attachmentId), new Pair("layout", this.layout.serialize()));
    }

    @NotNull
    public String toString() {
        String str = this.channelId;
        String str2 = this.messageId;
        String str3 = this.attachmentId;
        TapImageData.Layout layout = this.layout;
        StringBuilder sbU = e.u("LongPressPollImageData(channelId=", str, ", messageId=", str2, ", attachmentId=");
        sbU.append(str3);
        sbU.append(", layout=");
        sbU.append(layout);
        sbU.append(")");
        return sbU.toString();
    }
}
