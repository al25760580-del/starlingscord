package com.discord.chat.reactevents;

import a3.e;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.reactions.ReactionView;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import kk.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/discord/chat/reactevents/LongPressReactionData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "<init>", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getReaction", "()Lcom/discord/reactions/ReactionView$Reaction;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "copy", "copy-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)Lcom/discord/chat/reactevents/LongPressReactionData;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LongPressReactionData implements ReactEvent {
    private final long channelId;

    @NotNull
    private final String messageId;
    private final ReactionView.Reaction reaction;

    public /* synthetic */ LongPressReactionData(String str, long j, ReactionView.Reaction reaction, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, reaction);
    }

    /* JADX INFO: renamed from: copy-Eqy5D80$default, reason: not valid java name */
    public static /* synthetic */ LongPressReactionData m819copyEqy5D80$default(LongPressReactionData longPressReactionData, String str, long j, ReactionView.Reaction reaction, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = longPressReactionData.messageId;
        }
        if ((i7 & 2) != 0) {
            j = longPressReactionData.channelId;
        }
        if ((i7 & 4) != 0) {
            reaction = longPressReactionData.reaction;
        }
        return longPressReactionData.m822copyEqy5D80(str, j, reaction);
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
    public final ReactionView.Reaction getReaction() {
        return this.reaction;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Eqy5D80, reason: not valid java name */
    public final LongPressReactionData m822copyEqy5D80(@NotNull String messageId, long channelId, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new LongPressReactionData(messageId, channelId, reaction, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongPressReactionData)) {
            return false;
        }
        LongPressReactionData longPressReactionData = (LongPressReactionData) other;
        return MessageId.m1160equalsimpl0(this.messageId, longPressReactionData.messageId) && ChannelId.m1134equalsimpl0(this.channelId, longPressReactionData.channelId) && Intrinsics.areEqual(this.reaction, longPressReactionData.reaction);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m823getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m824getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final ReactionView.Reaction getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        int iD = b.d(this.channelId, MessageId.m1161hashCodeimpl(this.messageId) * 31, 31);
        ReactionView.Reaction reaction = this.reaction;
        return iD + (reaction == null ? 0 : reaction.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        ReactionView.Reaction reaction = this.reaction;
        WritableNativeMap writableNativeMapNativeMapOf = reaction != null ? NativeMapExtensionsKt.nativeMapOf(new Pair("emoji", NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.NAME_KEY, reaction.getEmoji().getName()), new Pair(StackTraceHelper.ID_KEY, this.reaction.getEmoji().getId()))), new Pair("me", Boolean.valueOf(this.reaction.getIsMe()))) : null;
        Pair pair = new Pair("messageId", this.messageId);
        Pair pair2 = new Pair("channelId", ChannelId.m1137toStringimpl(this.channelId));
        Pair pair3 = new Pair("reaction", writableNativeMapNativeMapOf);
        ReactionView.Reaction reaction2 = this.reaction;
        return NativeMapExtensionsKt.nativeMapOf(pair, pair2, pair3, new Pair("isBurst", reaction2 != null ? Boolean.valueOf(reaction2.isBurstReaction()) : null));
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        ReactionView.Reaction reaction = this.reaction;
        StringBuilder sbU = e.u("LongPressReactionData(messageId=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", reaction=");
        sbU.append(reaction);
        sbU.append(")");
        return sbU.toString();
    }

    private LongPressReactionData(String messageId, long j, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.channelId = j;
        this.reaction = reaction;
    }
}
