package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.reactions.ReactionView;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006$"}, d2 = {"Lcom/discord/chat/reactevents/TapReactionData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "isBurst", "", "location", "", "<init>", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getReaction", "()Lcom/discord/reactions/ReactionView$Reaction;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLocation", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapReactionData;", "equals", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapReactionData implements ReactEvent {
    private final Boolean isBurst;
    private final String location;

    @NotNull
    private final String messageId;
    private final ReactionView.Reaction reaction;

    public /* synthetic */ TapReactionData(String str, ReactionView.Reaction reaction, Boolean bool, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, reaction, bool, str2);
    }

    /* JADX INFO: renamed from: copy-AFFcxXc$default, reason: not valid java name */
    public static /* synthetic */ TapReactionData m895copyAFFcxXc$default(TapReactionData tapReactionData, String str, ReactionView.Reaction reaction, Boolean bool, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapReactionData.messageId;
        }
        if ((i7 & 2) != 0) {
            reaction = tapReactionData.reaction;
        }
        if ((i7 & 4) != 0) {
            bool = tapReactionData.isBurst;
        }
        if ((i7 & 8) != 0) {
            str2 = tapReactionData.location;
        }
        return tapReactionData.m897copyAFFcxXc(str, reaction, bool, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReactionView.Reaction getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsBurst() {
        return this.isBurst;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-AFFcxXc, reason: not valid java name */
    public final TapReactionData m897copyAFFcxXc(@NotNull String messageId, ReactionView.Reaction reaction, Boolean isBurst, String location) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new TapReactionData(messageId, reaction, isBurst, location, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapReactionData)) {
            return false;
        }
        TapReactionData tapReactionData = (TapReactionData) other;
        return MessageId.m1160equalsimpl0(this.messageId, tapReactionData.messageId) && Intrinsics.areEqual(this.reaction, tapReactionData.reaction) && Intrinsics.areEqual(this.isBurst, tapReactionData.isBurst) && Intrinsics.areEqual(this.location, tapReactionData.location);
    }

    public final String getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m898getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final ReactionView.Reaction getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        int iM1161hashCodeimpl = MessageId.m1161hashCodeimpl(this.messageId) * 31;
        ReactionView.Reaction reaction = this.reaction;
        int iHashCode = (iM1161hashCodeimpl + (reaction == null ? 0 : reaction.hashCode())) * 31;
        Boolean bool = this.isBurst;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.location;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isBurst() {
        return this.isBurst;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        ReactionView.Reaction reaction = this.reaction;
        WritableNativeMap writableNativeMapNativeMapOf = reaction != null ? NativeMapExtensionsKt.nativeMapOf(new Pair("emoji", NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.NAME_KEY, reaction.getEmoji().getName()), new Pair(StackTraceHelper.ID_KEY, this.reaction.getEmoji().getId()))), new Pair("me", Boolean.valueOf(this.reaction.getIsMe())), new Pair("me_burst", Boolean.valueOf(this.reaction.isMeBurst()))) : null;
        Pair pair = new Pair("messageId", this.messageId);
        Pair pair2 = new Pair("reaction", writableNativeMapNativeMapOf);
        ReactionView.Reaction reaction2 = this.reaction;
        return NativeMapExtensionsKt.nativeMapOf(pair, pair2, new Pair("isBurst", reaction2 != null ? Boolean.valueOf(reaction2.isBurstReaction()) : this.isBurst), new Pair("location", this.location));
    }

    @NotNull
    public String toString() {
        return "TapReactionData(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", reaction=" + this.reaction + ", isBurst=" + this.isBurst + ", location=" + this.location + ")";
    }

    private TapReactionData(String messageId, ReactionView.Reaction reaction, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.reaction = reaction;
        this.isBurst = bool;
        this.location = str;
    }

    public /* synthetic */ TapReactionData(String str, ReactionView.Reaction reaction, Boolean bool, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, reaction, (i7 & 4) != 0 ? Boolean.FALSE : bool, str2, null);
    }
}
