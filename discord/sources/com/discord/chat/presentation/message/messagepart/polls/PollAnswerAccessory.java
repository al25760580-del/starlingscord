package com.discord.chat.presentation.message.messagepart.polls;

import a3.e;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.polls.IPollStyleSet;
import com.discord.chat.bridge.polls.PollAnswer;
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType;
import com.discord.chat.bridge.polls.PollResources;
import com.discord.chat.bridge.polls.PollStyleSet;
import com.discord.chat.presentation.list.a;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.recycler_view.utils.ItemDiffableType;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u00109\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010\u001fJ\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010D\u001a\u00020\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J\t\u0010H\u001a\u00020\rHÆ\u0003J\t\u0010I\u001a\u00020\u001bHÆ\u0003Jº\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001a\u00020\r2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0018\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u0019\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000206X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010S\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0014\u0010X\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0012\u0010Z\u001a\u00020QX\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010UR\u0014\u0010\\\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010UR\u0014\u0010^\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010UR\u0014\u0010`\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010UR\u0014\u0010b\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u0010U¨\u0006d"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "Lcom/discord/chat/bridge/polls/IPollStyleSet;", "messageId", "Lcom/discord/primitives/MessageId;", "resources", "Lcom/discord/chat/bridge/polls/PollResources;", "answer", "Lcom/discord/chat/bridge/polls/PollAnswer;", "attachments", "", "Lcom/discord/chat/bridge/attachment/Attachment;", "canTapAnswers", "", "canSelectMultipleAnswers", "canShowVoteCounts", "hasVoted", "isExpired", "myAvatarUrl", "", "interactionType", "Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;", "tapAccessibilityLabel", "shouldAnimateTransition", "shouldAnimateEmoji", "shouldAutoPlayGifs", "styleSet", "Lcom/discord/chat/bridge/polls/PollStyleSet;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollResources;Lcom/discord/chat/bridge/polls/PollAnswer;Ljava/util/List;ZZZZZLjava/lang/String;Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;Ljava/lang/String;ZZZLcom/discord/chat/bridge/polls/PollStyleSet;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getResources", "()Lcom/discord/chat/bridge/polls/PollResources;", "getAnswer", "()Lcom/discord/chat/bridge/polls/PollAnswer;", "getAttachments", "()Ljava/util/List;", "getCanTapAnswers", "()Z", "getCanSelectMultipleAnswers", "getCanShowVoteCounts", "getHasVoted", "getMyAvatarUrl", "getInteractionType", "()Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;", "getTapAccessibilityLabel", "getShouldAnimateTransition", "getShouldAnimateEmoji", "getShouldAutoPlayGifs", "getStyleSet", "()Lcom/discord/chat/bridge/polls/PollStyleSet;", "itemId", "", "getItemId", "()Ljava/lang/Long;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "copy-VVrV5cY", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollResources;Lcom/discord/chat/bridge/polls/PollAnswer;Ljava/util/List;ZZZZZLjava/lang/String;Lcom/discord/chat/bridge/polls/PollChatAnswerInteractionType;Ljava/lang/String;ZZZLcom/discord/chat/bridge/polls/PollStyleSet;)Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "equals", "other", "", "hashCode", "", "toString", "answerBackgroundColor", "getAnswerBackgroundColor", "()I", "answerFillColor", "getAnswerFillColor", ViewProps.BORDER_COLOR, "getBorderColor", "borderWidthPx", "getBorderWidthPx", "fillColor", "getFillColor", "labelColor", "getLabelColor", "radioBackgroundColor", "getRadioBackgroundColor", "radioForegroundColor", "getRadioForegroundColor", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PollAnswerAccessory implements ItemDiffableType, IPollStyleSet {

    @NotNull
    private final PollAnswer answer;

    @NotNull
    private final List<Attachment> attachments;
    private final boolean canSelectMultipleAnswers;
    private final boolean canShowVoteCounts;
    private final boolean canTapAnswers;
    private final boolean hasVoted;

    @NotNull
    private final PollChatAnswerInteractionType interactionType;
    private final boolean isExpired;
    private final long itemId;

    @NotNull
    private final String messageId;
    private final String myAvatarUrl;

    @NotNull
    private final PollResources resources;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldAnimateTransition;
    private final boolean shouldAutoPlayGifs;

    @NotNull
    private final PollStyleSet styleSet;
    private final String tapAccessibilityLabel;

    public /* synthetic */ PollAnswerAccessory(String str, PollResources pollResources, PollAnswer pollAnswer, List list, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, String str2, PollChatAnswerInteractionType pollChatAnswerInteractionType, String str3, boolean z12, boolean z13, boolean z14, PollStyleSet pollStyleSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pollResources, pollAnswer, list, z5, z6, z7, z10, z11, str2, pollChatAnswerInteractionType, str3, z12, z13, z14, pollStyleSet);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PollChatAnswerInteractionType getInteractionType() {
        return this.interactionType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTapAccessibilityLabel() {
        return this.tapAccessibilityLabel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getShouldAnimateTransition() {
        return this.shouldAnimateTransition;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getShouldAutoPlayGifs() {
        return this.shouldAutoPlayGifs;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PollStyleSet getStyleSet() {
        return this.styleSet;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PollResources getResources() {
        return this.resources;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PollAnswer getAnswer() {
        return this.answer;
    }

    @NotNull
    public final List<Attachment> component4() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanTapAnswers() {
        return this.canTapAnswers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanSelectMultipleAnswers() {
        return this.canSelectMultipleAnswers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getCanShowVoteCounts() {
        return this.canShowVoteCounts;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasVoted() {
        return this.hasVoted;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-VVrV5cY, reason: not valid java name */
    public final PollAnswerAccessory m724copyVVrV5cY(@NotNull String messageId, @NotNull PollResources resources, @NotNull PollAnswer answer, @NotNull List<Attachment> attachments, boolean canTapAnswers, boolean canSelectMultipleAnswers, boolean canShowVoteCounts, boolean hasVoted, boolean isExpired, String myAvatarUrl, @NotNull PollChatAnswerInteractionType interactionType, String tapAccessibilityLabel, boolean shouldAnimateTransition, boolean shouldAnimateEmoji, boolean shouldAutoPlayGifs, @NotNull PollStyleSet styleSet) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(interactionType, "interactionType");
        Intrinsics.checkNotNullParameter(styleSet, "styleSet");
        return new PollAnswerAccessory(messageId, resources, answer, attachments, canTapAnswers, canSelectMultipleAnswers, canShowVoteCounts, hasVoted, isExpired, myAvatarUrl, interactionType, tapAccessibilityLabel, shouldAnimateTransition, shouldAnimateEmoji, shouldAutoPlayGifs, styleSet, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAnswerAccessory)) {
            return false;
        }
        PollAnswerAccessory pollAnswerAccessory = (PollAnswerAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, pollAnswerAccessory.messageId) && Intrinsics.areEqual(this.resources, pollAnswerAccessory.resources) && Intrinsics.areEqual(this.answer, pollAnswerAccessory.answer) && Intrinsics.areEqual(this.attachments, pollAnswerAccessory.attachments) && this.canTapAnswers == pollAnswerAccessory.canTapAnswers && this.canSelectMultipleAnswers == pollAnswerAccessory.canSelectMultipleAnswers && this.canShowVoteCounts == pollAnswerAccessory.canShowVoteCounts && this.hasVoted == pollAnswerAccessory.hasVoted && this.isExpired == pollAnswerAccessory.isExpired && Intrinsics.areEqual(this.myAvatarUrl, pollAnswerAccessory.myAvatarUrl) && this.interactionType == pollAnswerAccessory.interactionType && Intrinsics.areEqual(this.tapAccessibilityLabel, pollAnswerAccessory.tapAccessibilityLabel) && this.shouldAnimateTransition == pollAnswerAccessory.shouldAnimateTransition && this.shouldAnimateEmoji == pollAnswerAccessory.shouldAnimateEmoji && this.shouldAutoPlayGifs == pollAnswerAccessory.shouldAutoPlayGifs && Intrinsics.areEqual(this.styleSet, pollAnswerAccessory.styleSet);
    }

    @NotNull
    public final PollAnswer getAnswer() {
        return this.answer;
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getAnswerBackgroundColor() {
        return this.styleSet.getAnswerBackgroundColor();
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getAnswerFillColor() {
        return this.styleSet.getAnswerFillColor();
    }

    @NotNull
    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getBorderColor() {
        return this.styleSet.getBorderColor();
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getBorderWidthPx() {
        return this.styleSet.getBorderWidthPx();
    }

    public final boolean getCanSelectMultipleAnswers() {
        return this.canSelectMultipleAnswers;
    }

    public final boolean getCanShowVoteCounts() {
        return this.canShowVoteCounts;
    }

    public final boolean getCanTapAnswers() {
        return this.canTapAnswers;
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getFillColor() {
        return this.styleSet.getFillColor();
    }

    public final boolean getHasVoted() {
        return this.hasVoted;
    }

    @NotNull
    public final PollChatAnswerInteractionType getInteractionType() {
        return this.interactionType;
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getLabelColor() {
        return this.styleSet.getLabelColor();
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m725getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getRadioBackgroundColor() {
        return this.styleSet.getRadioBackgroundColor();
    }

    @Override // com.discord.chat.bridge.polls.IPollStyleSet
    public int getRadioForegroundColor() {
        return this.styleSet.getRadioForegroundColor();
    }

    @NotNull
    public final PollResources getResources() {
        return this.resources;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldAnimateTransition() {
        return this.shouldAnimateTransition;
    }

    public final boolean getShouldAutoPlayGifs() {
        return this.shouldAutoPlayGifs;
    }

    @NotNull
    public final PollStyleSet getStyleSet() {
        return this.styleSet;
    }

    public final String getTapAccessibilityLabel() {
        return this.tapAccessibilityLabel;
    }

    public int hashCode() {
        int iG = a.g(a.g(a.g(a.g(a.g(e.f(this.attachments, (this.answer.hashCode() + ((this.resources.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31)) * 31, 31), 31, this.canTapAnswers), 31, this.canSelectMultipleAnswers), 31, this.canShowVoteCounts), 31, this.hasVoted), 31, this.isExpired);
        String str = this.myAvatarUrl;
        int iHashCode = (this.interactionType.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.tapAccessibilityLabel;
        return this.styleSet.hashCode() + a.g(a.g(a.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.shouldAnimateTransition), 31, this.shouldAnimateEmoji), 31, this.shouldAutoPlayGifs);
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        PollResources pollResources = this.resources;
        PollAnswer pollAnswer = this.answer;
        List<Attachment> list = this.attachments;
        boolean z5 = this.canTapAnswers;
        boolean z6 = this.canSelectMultipleAnswers;
        boolean z7 = this.canShowVoteCounts;
        boolean z10 = this.hasVoted;
        boolean z11 = this.isExpired;
        String str = this.myAvatarUrl;
        PollChatAnswerInteractionType pollChatAnswerInteractionType = this.interactionType;
        String str2 = this.tapAccessibilityLabel;
        boolean z12 = this.shouldAnimateTransition;
        boolean z13 = this.shouldAnimateEmoji;
        boolean z14 = this.shouldAutoPlayGifs;
        PollStyleSet pollStyleSet = this.styleSet;
        StringBuilder sb2 = new StringBuilder("PollAnswerAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", resources=");
        sb2.append(pollResources);
        sb2.append(", answer=");
        sb2.append(pollAnswer);
        sb2.append(", attachments=");
        sb2.append(list);
        sb2.append(", canTapAnswers=");
        e.B(sb2, z5, ", canSelectMultipleAnswers=", z6, ", canShowVoteCounts=");
        e.B(sb2, z7, ", hasVoted=", z10, ", isExpired=");
        sb2.append(z11);
        sb2.append(", myAvatarUrl=");
        sb2.append(str);
        sb2.append(", interactionType=");
        sb2.append(pollChatAnswerInteractionType);
        sb2.append(", tapAccessibilityLabel=");
        sb2.append(str2);
        sb2.append(", shouldAnimateTransition=");
        e.B(sb2, z12, ", shouldAnimateEmoji=", z13, ", shouldAutoPlayGifs=");
        sb2.append(z14);
        sb2.append(", styleSet=");
        sb2.append(pollStyleSet);
        sb2.append(")");
        return sb2.toString();
    }

    private PollAnswerAccessory(String messageId, PollResources resources, PollAnswer answer, List<Attachment> attachments, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, String str, PollChatAnswerInteractionType interactionType, String str2, boolean z12, boolean z13, boolean z14, PollStyleSet styleSet) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(interactionType, "interactionType");
        Intrinsics.checkNotNullParameter(styleSet, "styleSet");
        this.messageId = messageId;
        this.resources = resources;
        this.answer = answer;
        this.attachments = attachments;
        this.canTapAnswers = z5;
        this.canSelectMultipleAnswers = z6;
        this.canShowVoteCounts = z7;
        this.hasVoted = z10;
        this.isExpired = z11;
        this.myAvatarUrl = str;
        this.interactionType = interactionType;
        this.tapAccessibilityLabel = str2;
        this.shouldAnimateTransition = z12;
        this.shouldAnimateEmoji = z13;
        this.shouldAutoPlayGifs = z14;
        this.styleSet = styleSet;
        this.itemId = IdUtilsKt.convertToId(MessageId.m1163toStringimpl(messageId) + ":" + answer.getAnswerId());
    }

    @Override // com.discord.recycler_view.utils.ItemDiffableType
    @NotNull
    public Long getItemId() {
        return Long.valueOf(this.itemId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PollAnswerAccessory(String str, PollResources pollResources, PollAnswer pollAnswer, List list, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, String str2, PollChatAnswerInteractionType pollChatAnswerInteractionType, String str3, boolean z12, boolean z13, boolean z14, PollStyleSet pollStyleSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        PollStyleSet pollStyleSet2;
        boolean z15 = (i7 & 8192) != 0 ? false : z13;
        boolean z16 = (i7 & 16384) != 0 ? false : z14;
        if ((i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            PollStyleSet pollStyleSet3 = pollResources.getStyles().get(pollAnswer.getStyle());
            pollStyleSet2 = pollStyleSet3 == null ? PollStyleSet.INSTANCE.getDEFAULT() : pollStyleSet3;
        } else {
            pollStyleSet2 = pollStyleSet;
        }
        this(str, pollResources, pollAnswer, list, z5, z6, z7, z10, z11, str2, pollChatAnswerInteractionType, str3, z12, z15, z16, pollStyleSet2, null);
    }
}
