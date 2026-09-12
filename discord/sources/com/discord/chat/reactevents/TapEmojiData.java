package com.discord.chat.reactevents;

import com.discord.chat.bridge.contentnode.CustomEmojiContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/reactevents/TapEmojiData;", "Lcom/discord/reactevents/ReactEvent;", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "<init>", "(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapEmojiData implements ReactEvent {

    @NotNull
    private final EmojiContentNode emoji;

    public TapEmojiData(@NotNull EmojiContentNode emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.emoji = emoji;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final EmojiContentNode getEmoji() {
        return this.emoji;
    }

    public static /* synthetic */ TapEmojiData copy$default(TapEmojiData tapEmojiData, EmojiContentNode emojiContentNode, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            emojiContentNode = tapEmojiData.emoji;
        }
        return tapEmojiData.copy(emojiContentNode);
    }

    @NotNull
    public final TapEmojiData copy(@NotNull EmojiContentNode emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        return new TapEmojiData(emoji);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TapEmojiData) && Intrinsics.areEqual(this.emoji, ((TapEmojiData) other).emoji);
    }

    public int hashCode() {
        return this.emoji.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        WritableNativeMap writableNativeMapNativeMapOf;
        EmojiContentNode emojiContentNode = this.emoji;
        if (emojiContentNode instanceof UnicodeEmojiContentNode) {
            writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair("surrogate", ((UnicodeEmojiContentNode) emojiContentNode).getSurrogate()), new Pair("content", ((UnicodeEmojiContentNode) this.emoji).getContent()));
        } else {
            if (!(emojiContentNode instanceof CustomEmojiContentNode)) {
                throw new n();
            }
            writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, String.valueOf(((CustomEmojiContentNode) emojiContentNode).getId())), new Pair("alt", ((CustomEmojiContentNode) this.emoji).getAlt()), new Pair("src", ((CustomEmojiContentNode) this.emoji).getSrc()));
        }
        return NativeMapExtensionsKt.nativeMapOf(new Pair("node", writableNativeMapNativeMapOf));
    }

    @NotNull
    public String toString() {
        return "TapEmojiData(emoji=" + this.emoji + ")";
    }
}
