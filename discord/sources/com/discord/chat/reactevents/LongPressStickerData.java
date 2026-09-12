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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/reactevents/LongPressStickerData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;)Lcom/discord/chat/reactevents/LongPressStickerData;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LongPressStickerData implements ReactEvent {

    @NotNull
    private final String messageId;

    @NotNull
    private final Sticker sticker;

    public /* synthetic */ LongPressStickerData(String str, Sticker sticker, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sticker);
    }

    /* JADX INFO: renamed from: copy-ntcYbpo$default, reason: not valid java name */
    public static /* synthetic */ LongPressStickerData m825copyntcYbpo$default(LongPressStickerData longPressStickerData, String str, Sticker sticker, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = longPressStickerData.messageId;
        }
        if ((i7 & 2) != 0) {
            sticker = longPressStickerData.sticker;
        }
        return longPressStickerData.m827copyntcYbpo(str, sticker);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Sticker getSticker() {
        return this.sticker;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ntcYbpo, reason: not valid java name */
    public final LongPressStickerData m827copyntcYbpo(@NotNull String messageId, @NotNull Sticker sticker) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        return new LongPressStickerData(messageId, sticker, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongPressStickerData)) {
            return false;
        }
        LongPressStickerData longPressStickerData = (LongPressStickerData) other;
        return MessageId.m1160equalsimpl0(this.messageId, longPressStickerData.messageId) && Intrinsics.areEqual(this.sticker, longPressStickerData.sticker);
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m828getMessageId3Eiw7ao() {
        return this.messageId;
    }

    @NotNull
    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return this.sticker.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("messageId", this.messageId), new Pair("sticker", NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, String.valueOf(this.sticker.getId())), new Pair(StackTraceHelper.NAME_KEY, this.sticker.getName()))));
    }

    @NotNull
    public String toString() {
        return "LongPressStickerData(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", sticker=" + this.sticker + ")";
    }

    private LongPressStickerData(String messageId, Sticker sticker) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        this.messageId = messageId;
        this.sticker = sticker;
    }
}
