package com.discord.chat.presentation.root;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\u008f\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00108\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006="}, d2 = {"Lcom/discord/chat/presentation/root/MessageContext;", "", "showDivider", "", "canAddNewReactions", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "usingGradientTheme", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "useAttachmentGridLayout", "useAttachmentUploadPreview", "enableSwipeToReply", "enableSwipeToEdit", "obscureLearnMoreLabel", "contextType", "Lcom/discord/chat/presentation/root/MessageContextType;", "theme", "Lcom/discord/theme/DiscordThemeObject;", "<init>", "(ZZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZLcom/discord/chat/bridge/truncation/Truncation;ZZZZLjava/lang/String;Lcom/discord/chat/presentation/root/MessageContextType;Lcom/discord/theme/DiscordThemeObject;)V", "getShowDivider", "()Z", "getCanAddNewReactions", "getAddNewReactionAccessibilityLabel", "()Ljava/lang/String;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getUsingGradientTheme", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "getUseAttachmentGridLayout", "getUseAttachmentUploadPreview", "getEnableSwipeToReply", "getEnableSwipeToEdit", "getObscureLearnMoreLabel", "getContextType", "()Lcom/discord/chat/presentation/root/MessageContextType;", "getTheme", "()Lcom/discord/theme/DiscordThemeObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageContext {

    @NotNull
    private final String addNewReactionAccessibilityLabel;
    private final boolean canAddNewReactions;

    @NotNull
    private final MessageContextType contextType;
    private final boolean enableSwipeToEdit;
    private final boolean enableSwipeToReply;

    @NotNull
    private final String obscureLearnMoreLabel;
    private final ReactionsTheme reactionsTheme;
    private final boolean showDivider;

    @NotNull
    private final DiscordThemeObject theme;
    private final Truncation truncation;
    private final boolean useAttachmentGridLayout;
    private final boolean useAttachmentUploadPreview;
    private final boolean usingGradientTheme;

    public MessageContext() {
        this(false, false, null, null, false, null, false, false, false, false, null, null, null, 8191, null);
    }

    public static /* synthetic */ MessageContext copy$default(MessageContext messageContext, boolean z5, boolean z6, String str, ReactionsTheme reactionsTheme, boolean z7, Truncation truncation, boolean z10, boolean z11, boolean z12, boolean z13, String str2, MessageContextType messageContextType, DiscordThemeObject discordThemeObject, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = messageContext.showDivider;
        }
        return messageContext.copy(z5, (i7 & 2) != 0 ? messageContext.canAddNewReactions : z6, (i7 & 4) != 0 ? messageContext.addNewReactionAccessibilityLabel : str, (i7 & 8) != 0 ? messageContext.reactionsTheme : reactionsTheme, (i7 & 16) != 0 ? messageContext.usingGradientTheme : z7, (i7 & 32) != 0 ? messageContext.truncation : truncation, (i7 & 64) != 0 ? messageContext.useAttachmentGridLayout : z10, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? messageContext.useAttachmentUploadPreview : z11, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? messageContext.enableSwipeToReply : z12, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? messageContext.enableSwipeToEdit : z13, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? messageContext.obscureLearnMoreLabel : str2, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? messageContext.contextType : messageContextType, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? messageContext.theme : discordThemeObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getEnableSwipeToEdit() {
        return this.enableSwipeToEdit;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getObscureLearnMoreLabel() {
        return this.obscureLearnMoreLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final MessageContextType getContextType() {
        return this.contextType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DiscordThemeObject getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUsingGradientTheme() {
        return this.usingGradientTheme;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Truncation getTruncation() {
        return this.truncation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getUseAttachmentGridLayout() {
        return this.useAttachmentGridLayout;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getUseAttachmentUploadPreview() {
        return this.useAttachmentUploadPreview;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    @NotNull
    public final MessageContext copy(boolean showDivider, boolean canAddNewReactions, @NotNull String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, boolean usingGradientTheme, Truncation truncation, boolean useAttachmentGridLayout, boolean useAttachmentUploadPreview, boolean enableSwipeToReply, boolean enableSwipeToEdit, @NotNull String obscureLearnMoreLabel, @NotNull MessageContextType contextType, @NotNull DiscordThemeObject theme) {
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        Intrinsics.checkNotNullParameter(obscureLearnMoreLabel, "obscureLearnMoreLabel");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new MessageContext(showDivider, canAddNewReactions, addNewReactionAccessibilityLabel, reactionsTheme, usingGradientTheme, truncation, useAttachmentGridLayout, useAttachmentUploadPreview, enableSwipeToReply, enableSwipeToEdit, obscureLearnMoreLabel, contextType, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageContext)) {
            return false;
        }
        MessageContext messageContext = (MessageContext) other;
        return this.showDivider == messageContext.showDivider && this.canAddNewReactions == messageContext.canAddNewReactions && Intrinsics.areEqual(this.addNewReactionAccessibilityLabel, messageContext.addNewReactionAccessibilityLabel) && Intrinsics.areEqual(this.reactionsTheme, messageContext.reactionsTheme) && this.usingGradientTheme == messageContext.usingGradientTheme && Intrinsics.areEqual(this.truncation, messageContext.truncation) && this.useAttachmentGridLayout == messageContext.useAttachmentGridLayout && this.useAttachmentUploadPreview == messageContext.useAttachmentUploadPreview && this.enableSwipeToReply == messageContext.enableSwipeToReply && this.enableSwipeToEdit == messageContext.enableSwipeToEdit && Intrinsics.areEqual(this.obscureLearnMoreLabel, messageContext.obscureLearnMoreLabel) && this.contextType == messageContext.contextType && Intrinsics.areEqual(this.theme, messageContext.theme);
    }

    @NotNull
    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @NotNull
    public final MessageContextType getContextType() {
        return this.contextType;
    }

    public final boolean getEnableSwipeToEdit() {
        return this.enableSwipeToEdit;
    }

    public final boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    @NotNull
    public final String getObscureLearnMoreLabel() {
        return this.obscureLearnMoreLabel;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    @NotNull
    public final DiscordThemeObject getTheme() {
        return this.theme;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    public final boolean getUseAttachmentGridLayout() {
        return this.useAttachmentGridLayout;
    }

    public final boolean getUseAttachmentUploadPreview() {
        return this.useAttachmentUploadPreview;
    }

    public final boolean getUsingGradientTheme() {
        return this.usingGradientTheme;
    }

    public int hashCode() {
        int iD = e.d(com.discord.chat.presentation.list.a.g(Boolean.hashCode(this.showDivider) * 31, 31, this.canAddNewReactions), 31, this.addNewReactionAccessibilityLabel);
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int iG = com.discord.chat.presentation.list.a.g((iD + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31, 31, this.usingGradientTheme);
        Truncation truncation = this.truncation;
        return this.theme.hashCode() + ((this.contextType.hashCode() + e.d(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g((iG + (truncation != null ? truncation.hashCode() : 0)) * 31, 31, this.useAttachmentGridLayout), 31, this.useAttachmentUploadPreview), 31, this.enableSwipeToReply), 31, this.enableSwipeToEdit), 31, this.obscureLearnMoreLabel)) * 31);
    }

    @NotNull
    public String toString() {
        boolean z5 = this.showDivider;
        boolean z6 = this.canAddNewReactions;
        String str = this.addNewReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        boolean z7 = this.usingGradientTheme;
        Truncation truncation = this.truncation;
        boolean z10 = this.useAttachmentGridLayout;
        boolean z11 = this.useAttachmentUploadPreview;
        boolean z12 = this.enableSwipeToReply;
        boolean z13 = this.enableSwipeToEdit;
        String str2 = this.obscureLearnMoreLabel;
        MessageContextType messageContextType = this.contextType;
        DiscordThemeObject discordThemeObject = this.theme;
        StringBuilder sb2 = new StringBuilder("MessageContext(showDivider=");
        sb2.append(z5);
        sb2.append(", canAddNewReactions=");
        sb2.append(z6);
        sb2.append(", addNewReactionAccessibilityLabel=");
        sb2.append(str);
        sb2.append(", reactionsTheme=");
        sb2.append(reactionsTheme);
        sb2.append(", usingGradientTheme=");
        sb2.append(z7);
        sb2.append(", truncation=");
        sb2.append(truncation);
        sb2.append(", useAttachmentGridLayout=");
        e.B(sb2, z10, ", useAttachmentUploadPreview=", z11, ", enableSwipeToReply=");
        e.B(sb2, z12, ", enableSwipeToEdit=", z13, ", obscureLearnMoreLabel=");
        sb2.append(str2);
        sb2.append(", contextType=");
        sb2.append(messageContextType);
        sb2.append(", theme=");
        sb2.append(discordThemeObject);
        sb2.append(")");
        return sb2.toString();
    }

    public MessageContext(boolean z5, boolean z6, @NotNull String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, boolean z7, Truncation truncation, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull String obscureLearnMoreLabel, @NotNull MessageContextType contextType, @NotNull DiscordThemeObject theme) {
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        Intrinsics.checkNotNullParameter(obscureLearnMoreLabel, "obscureLearnMoreLabel");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.showDivider = z5;
        this.canAddNewReactions = z6;
        this.addNewReactionAccessibilityLabel = addNewReactionAccessibilityLabel;
        this.reactionsTheme = reactionsTheme;
        this.usingGradientTheme = z7;
        this.truncation = truncation;
        this.useAttachmentGridLayout = z10;
        this.useAttachmentUploadPreview = z11;
        this.enableSwipeToReply = z12;
        this.enableSwipeToEdit = z13;
        this.obscureLearnMoreLabel = obscureLearnMoreLabel;
        this.contextType = contextType;
        this.theme = theme;
    }

    public /* synthetic */ MessageContext(boolean z5, boolean z6, String str, ReactionsTheme reactionsTheme, boolean z7, Truncation truncation, boolean z10, boolean z11, boolean z12, boolean z13, String str2, MessageContextType messageContextType, DiscordThemeObject discordThemeObject, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z5, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? null : reactionsTheme, (i7 & 16) != 0 ? false : z7, (i7 & 32) == 0 ? truncation : null, (i7 & 64) != 0 ? false : z10, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z11, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z12, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? z13 : false, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0 ? str2 : "", (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? MessageContextType.DEFAULT : messageContextType, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? ThemeManagerKt.getTheme() : discordThemeObject);
    }
}
