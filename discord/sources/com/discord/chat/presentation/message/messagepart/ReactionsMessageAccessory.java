package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import com.discord.theme.DiscordTheme;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010/\u001a\u00020\bHÆ\u0003Jx\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0011HÖ\u0001J\t\u00107\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u00068"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "theme", "Lcom/discord/theme/DiscordTheme;", "targetKind", "embedIndex", "", "showReactLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Ljava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getReactions", "()Ljava/util/List;", "getCanAddNewReactions", "()Z", "getAddNewReactionAccessibilityLabel", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "getTargetKind", "getEmbedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowReactLabel", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-IwdeaXA", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReactionsMessageAccessory extends MessageAccessory {

    @NotNull
    private final String addNewReactionAccessibilityLabel;
    private final boolean canAddNewReactions;
    private final Integer embedIndex;

    @NotNull
    private final String messageId;

    @NotNull
    private final List<MessageReaction> reactions;
    private final ReactionsTheme reactionsTheme;
    private final boolean showReactLabel;
    private final String targetKind;
    private final DiscordTheme theme;

    public /* synthetic */ ReactionsMessageAccessory(String str, List list, boolean z5, String str2, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, String str3, Integer num, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z5, str2, reactionsTheme, discordTheme, str3, num, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-IwdeaXA$default, reason: not valid java name */
    public static /* synthetic */ ReactionsMessageAccessory m679copyIwdeaXA$default(ReactionsMessageAccessory reactionsMessageAccessory, String str, List list, boolean z5, String str2, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, String str3, Integer num, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = reactionsMessageAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            list = reactionsMessageAccessory.reactions;
        }
        if ((i7 & 4) != 0) {
            z5 = reactionsMessageAccessory.canAddNewReactions;
        }
        if ((i7 & 8) != 0) {
            str2 = reactionsMessageAccessory.addNewReactionAccessibilityLabel;
        }
        if ((i7 & 16) != 0) {
            reactionsTheme = reactionsMessageAccessory.reactionsTheme;
        }
        if ((i7 & 32) != 0) {
            discordTheme = reactionsMessageAccessory.theme;
        }
        if ((i7 & 64) != 0) {
            str3 = reactionsMessageAccessory.targetKind;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            num = reactionsMessageAccessory.embedIndex;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z6 = reactionsMessageAccessory.showReactLabel;
        }
        Integer num2 = num;
        boolean z7 = z6;
        DiscordTheme discordTheme2 = discordTheme;
        String str4 = str3;
        ReactionsTheme reactionsTheme2 = reactionsTheme;
        boolean z10 = z5;
        return reactionsMessageAccessory.m681copyIwdeaXA(str, list, z10, str2, reactionsTheme2, discordTheme2, str4, num2, z7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final List<MessageReaction> component2() {
        return this.reactions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DiscordTheme getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTargetKind() {
        return this.targetKind;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getEmbedIndex() {
        return this.embedIndex;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowReactLabel() {
        return this.showReactLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-IwdeaXA, reason: not valid java name */
    public final ReactionsMessageAccessory m681copyIwdeaXA(@NotNull String messageId, @NotNull List<MessageReaction> reactions, boolean canAddNewReactions, @NotNull String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, DiscordTheme theme, String targetKind, Integer embedIndex, boolean showReactLabel) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        return new ReactionsMessageAccessory(messageId, reactions, canAddNewReactions, addNewReactionAccessibilityLabel, reactionsTheme, theme, targetKind, embedIndex, showReactLabel, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionsMessageAccessory)) {
            return false;
        }
        ReactionsMessageAccessory reactionsMessageAccessory = (ReactionsMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, reactionsMessageAccessory.messageId) && Intrinsics.areEqual(this.reactions, reactionsMessageAccessory.reactions) && this.canAddNewReactions == reactionsMessageAccessory.canAddNewReactions && Intrinsics.areEqual(this.addNewReactionAccessibilityLabel, reactionsMessageAccessory.addNewReactionAccessibilityLabel) && Intrinsics.areEqual(this.reactionsTheme, reactionsMessageAccessory.reactionsTheme) && this.theme == reactionsMessageAccessory.theme && Intrinsics.areEqual(this.targetKind, reactionsMessageAccessory.targetKind) && Intrinsics.areEqual(this.embedIndex, reactionsMessageAccessory.embedIndex) && this.showReactLabel == reactionsMessageAccessory.showReactLabel;
    }

    @NotNull
    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    public final Integer getEmbedIndex() {
        return this.embedIndex;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getShowReactLabel() {
        return this.showReactLabel;
    }

    public final String getTargetKind() {
        return this.targetKind;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iD = e.d(a.g(e.f(this.reactions, MessageId.m1161hashCodeimpl(this.messageId) * 31, 31), 31, this.canAddNewReactions), 31, this.addNewReactionAccessibilityLabel);
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int iHashCode = (iD + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        DiscordTheme discordTheme = this.theme;
        int iHashCode2 = (iHashCode + (discordTheme == null ? 0 : discordTheme.hashCode())) * 31;
        String str = this.targetKind;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.embedIndex;
        return Boolean.hashCode(this.showReactLabel) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        List<MessageReaction> list = this.reactions;
        boolean z5 = this.canAddNewReactions;
        String str = this.addNewReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        DiscordTheme discordTheme = this.theme;
        String str2 = this.targetKind;
        Integer num = this.embedIndex;
        boolean z6 = this.showReactLabel;
        StringBuilder sb2 = new StringBuilder("ReactionsMessageAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", reactions=");
        sb2.append(list);
        sb2.append(", canAddNewReactions=");
        sb2.append(z5);
        sb2.append(", addNewReactionAccessibilityLabel=");
        sb2.append(str);
        sb2.append(", reactionsTheme=");
        sb2.append(reactionsTheme);
        sb2.append(", theme=");
        sb2.append(discordTheme);
        sb2.append(", targetKind=");
        a.r(num, str2, ", embedIndex=", ", showReactLabel=", sb2);
        return a.m(sb2, z6, ")");
    }

    public /* synthetic */ ReactionsMessageAccessory(String str, List list, boolean z5, String str2, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, String str3, Integer num, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z5, str2, reactionsTheme, (i7 & 32) != 0 ? null : discordTheme, (i7 & 64) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z6, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ReactionsMessageAccessory(String messageId, List<MessageReaction> reactions, boolean z5, String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, String str, Integer num, boolean z6) {
        super(messageId, "reactions", false, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        this.messageId = messageId;
        this.reactions = reactions;
        this.canAddNewReactions = z5;
        this.addNewReactionAccessibilityLabel = addNewReactionAccessibilityLabel;
        this.reactionsTheme = reactionsTheme;
        this.theme = discordTheme;
        this.targetKind = str;
        this.embedIndex = num;
        this.showReactLabel = z6;
    }
}
