package com.discord.chat.reactevents;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/reactevents/TapStickerData;", "Lcom/discord/reactevents/ReactEvent;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "messageId", "Lcom/discord/primitives/MessageId;", "<init>", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component2-3Eiw7ao", "copy", "copy-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapStickerData;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapStickerData implements ReactEvent {

    @NotNull
    private final String messageId;

    @NotNull
    private final Sticker sticker;

    public /* synthetic */ TapStickerData(Sticker sticker, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sticker, str);
    }

    /* JADX INFO: renamed from: copy-Ayv7vGE$default, reason: not valid java name */
    public static /* synthetic */ TapStickerData m911copyAyv7vGE$default(TapStickerData tapStickerData, Sticker sticker, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            sticker = tapStickerData.sticker;
        }
        if ((i7 & 2) != 0) {
            str = tapStickerData.messageId;
        }
        return tapStickerData.m913copyAyv7vGE(sticker, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Sticker getSticker() {
        return this.sticker;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Ayv7vGE, reason: not valid java name */
    public final TapStickerData m913copyAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new TapStickerData(sticker, messageId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapStickerData)) {
            return false;
        }
        TapStickerData tapStickerData = (TapStickerData) other;
        return Intrinsics.areEqual(this.sticker, tapStickerData.sticker) && MessageId.m1160equalsimpl0(this.messageId, tapStickerData.messageId);
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m914getMessageId3Eiw7ao() {
        return this.messageId;
    }

    @NotNull
    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return MessageId.m1161hashCodeimpl(this.messageId) + (this.sticker.hashCode() * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("messageId", this.messageId), new Pair("sticker", NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, String.valueOf(this.sticker.getId())), new Pair(StackTraceHelper.NAME_KEY, this.sticker.getName()))));
    }

    @NotNull
    public String toString() {
        return "TapStickerData(sticker=" + this.sticker + ", messageId=" + MessageId.m1163toStringimpl(this.messageId) + ")";
    }

    private TapStickerData(Sticker sticker, String messageId) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.sticker = sticker;
        this.messageId = messageId;
    }
}
