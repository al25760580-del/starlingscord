package com.discord.chat.bridge.forums;

import a3.e;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
import com.discord.chat.presentation.list.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "numDisplayedReactions", "", "isFollowing", "", "followIcon", "", "followLabel", "shareIcon", "shareLabel", "defaultReaction", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "sharePrompt", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;Lcom/discord/chat/bridge/forums/PostSharePrompt;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;Lcom/discord/chat/bridge/forums/PostSharePrompt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNumDisplayedReactions", "()I", "()Z", "getFollowIcon", "()Ljava/lang/String;", "getFollowLabel", "getShareIcon", "getShareLabel", "getDefaultReaction", "()Lcom/discord/chat/bridge/reaction/MessageReaction;", "getSharePrompt", "()Lcom/discord/chat/bridge/forums/PostSharePrompt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ForumPostActions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final MessageReaction defaultReaction;
    private final String followIcon;

    @NotNull
    private final String followLabel;
    private final boolean isFollowing;
    private final int numDisplayedReactions;
    private final String shareIcon;

    @NotNull
    private final String shareLabel;
    private final PostSharePrompt sharePrompt;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ForumPostActions$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ForumPostActions(int i7, int i10, boolean z5, String str, String str2, String str3, String str4, MessageReaction messageReaction, PostSharePrompt postSharePrompt, SerializationConstructorMarker serializationConstructorMarker) {
        if (43 != (i7 & 43)) {
            e1.l(i7, 43, ForumPostActions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.numDisplayedReactions = i10;
        this.isFollowing = z5;
        if ((i7 & 4) == 0) {
            this.followIcon = null;
        } else {
            this.followIcon = str;
        }
        this.followLabel = str2;
        if ((i7 & 16) == 0) {
            this.shareIcon = null;
        } else {
            this.shareIcon = str3;
        }
        this.shareLabel = str4;
        if ((i7 & 64) == 0) {
            this.defaultReaction = null;
        } else {
            this.defaultReaction = messageReaction;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.sharePrompt = null;
        } else {
            this.sharePrompt = postSharePrompt;
        }
    }

    public static /* synthetic */ ForumPostActions copy$default(ForumPostActions forumPostActions, int i7, boolean z5, String str, String str2, String str3, String str4, MessageReaction messageReaction, PostSharePrompt postSharePrompt, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = forumPostActions.numDisplayedReactions;
        }
        if ((i10 & 2) != 0) {
            z5 = forumPostActions.isFollowing;
        }
        if ((i10 & 4) != 0) {
            str = forumPostActions.followIcon;
        }
        if ((i10 & 8) != 0) {
            str2 = forumPostActions.followLabel;
        }
        if ((i10 & 16) != 0) {
            str3 = forumPostActions.shareIcon;
        }
        if ((i10 & 32) != 0) {
            str4 = forumPostActions.shareLabel;
        }
        if ((i10 & 64) != 0) {
            messageReaction = forumPostActions.defaultReaction;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            postSharePrompt = forumPostActions.sharePrompt;
        }
        MessageReaction messageReaction2 = messageReaction;
        PostSharePrompt postSharePrompt2 = postSharePrompt;
        String str5 = str3;
        String str6 = str4;
        return forumPostActions.copy(i7, z5, str, str2, str5, str6, messageReaction2, postSharePrompt2);
    }

    public static final /* synthetic */ void write$Self$chat_release(ForumPostActions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.numDisplayedReactions, serialDesc);
        output.p(serialDesc, 1, self.isFollowing);
        if (output.u(serialDesc, 2) || self.followIcon != null) {
            output.r(serialDesc, 2, s1.f17602a, self.followIcon);
        }
        output.q(serialDesc, 3, self.followLabel);
        if (output.u(serialDesc, 4) || self.shareIcon != null) {
            output.r(serialDesc, 4, s1.f17602a, self.shareIcon);
        }
        output.q(serialDesc, 5, self.shareLabel);
        if (output.u(serialDesc, 6) || self.defaultReaction != null) {
            output.r(serialDesc, 6, MessageReaction$$serializer.INSTANCE, self.defaultReaction);
        }
        if (!output.u(serialDesc, 7) && self.sharePrompt == null) {
            return;
        }
        output.r(serialDesc, 7, PostSharePrompt$$serializer.INSTANCE, self.sharePrompt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumDisplayedReactions() {
        return this.numDisplayedReactions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFollowIcon() {
        return this.followIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFollowLabel() {
        return this.followLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShareIcon() {
        return this.shareIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShareLabel() {
        return this.shareLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageReaction getDefaultReaction() {
        return this.defaultReaction;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PostSharePrompt getSharePrompt() {
        return this.sharePrompt;
    }

    @NotNull
    public final ForumPostActions copy(int numDisplayedReactions, boolean isFollowing, String followIcon, @NotNull String followLabel, String shareIcon, @NotNull String shareLabel, MessageReaction defaultReaction, PostSharePrompt sharePrompt) {
        Intrinsics.checkNotNullParameter(followLabel, "followLabel");
        Intrinsics.checkNotNullParameter(shareLabel, "shareLabel");
        return new ForumPostActions(numDisplayedReactions, isFollowing, followIcon, followLabel, shareIcon, shareLabel, defaultReaction, sharePrompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForumPostActions)) {
            return false;
        }
        ForumPostActions forumPostActions = (ForumPostActions) other;
        return this.numDisplayedReactions == forumPostActions.numDisplayedReactions && this.isFollowing == forumPostActions.isFollowing && Intrinsics.areEqual(this.followIcon, forumPostActions.followIcon) && Intrinsics.areEqual(this.followLabel, forumPostActions.followLabel) && Intrinsics.areEqual(this.shareIcon, forumPostActions.shareIcon) && Intrinsics.areEqual(this.shareLabel, forumPostActions.shareLabel) && Intrinsics.areEqual(this.defaultReaction, forumPostActions.defaultReaction) && Intrinsics.areEqual(this.sharePrompt, forumPostActions.sharePrompt);
    }

    public final MessageReaction getDefaultReaction() {
        return this.defaultReaction;
    }

    public final String getFollowIcon() {
        return this.followIcon;
    }

    @NotNull
    public final String getFollowLabel() {
        return this.followLabel;
    }

    public final int getNumDisplayedReactions() {
        return this.numDisplayedReactions;
    }

    public final String getShareIcon() {
        return this.shareIcon;
    }

    @NotNull
    public final String getShareLabel() {
        return this.shareLabel;
    }

    public final PostSharePrompt getSharePrompt() {
        return this.sharePrompt;
    }

    public int hashCode() {
        int iG = a.g(Integer.hashCode(this.numDisplayedReactions) * 31, 31, this.isFollowing);
        String str = this.followIcon;
        int iD = e.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.followLabel);
        String str2 = this.shareIcon;
        int iD2 = e.d((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.shareLabel);
        MessageReaction messageReaction = this.defaultReaction;
        int iHashCode = (iD2 + (messageReaction == null ? 0 : messageReaction.hashCode())) * 31;
        PostSharePrompt postSharePrompt = this.sharePrompt;
        return iHashCode + (postSharePrompt != null ? postSharePrompt.hashCode() : 0);
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    @NotNull
    public String toString() {
        int i7 = this.numDisplayedReactions;
        boolean z5 = this.isFollowing;
        String str = this.followIcon;
        String str2 = this.followLabel;
        String str3 = this.shareIcon;
        String str4 = this.shareLabel;
        MessageReaction messageReaction = this.defaultReaction;
        PostSharePrompt postSharePrompt = this.sharePrompt;
        StringBuilder sb2 = new StringBuilder("ForumPostActions(numDisplayedReactions=");
        sb2.append(i7);
        sb2.append(", isFollowing=");
        sb2.append(z5);
        sb2.append(", followIcon=");
        e.A(sb2, str, ", followLabel=", str2, ", shareIcon=");
        e.A(sb2, str3, ", shareLabel=", str4, ", defaultReaction=");
        sb2.append(messageReaction);
        sb2.append(", sharePrompt=");
        sb2.append(postSharePrompt);
        sb2.append(")");
        return sb2.toString();
    }

    public ForumPostActions(int i7, boolean z5, String str, @NotNull String followLabel, String str2, @NotNull String shareLabel, MessageReaction messageReaction, PostSharePrompt postSharePrompt) {
        Intrinsics.checkNotNullParameter(followLabel, "followLabel");
        Intrinsics.checkNotNullParameter(shareLabel, "shareLabel");
        this.numDisplayedReactions = i7;
        this.isFollowing = z5;
        this.followIcon = str;
        this.followLabel = followLabel;
        this.shareIcon = str2;
        this.shareLabel = shareLabel;
        this.defaultReaction = messageReaction;
        this.sharePrompt = postSharePrompt;
    }

    public /* synthetic */ ForumPostActions(int i7, boolean z5, String str, String str2, String str3, String str4, MessageReaction messageReaction, PostSharePrompt postSharePrompt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, z5, (i10 & 4) != 0 ? null : str, str2, (i10 & 16) != 0 ? null : str3, str4, (i10 & 64) != 0 ? null : messageReaction, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : postSharePrompt);
    }
}
