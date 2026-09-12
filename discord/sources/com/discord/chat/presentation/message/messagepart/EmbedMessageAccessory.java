package com.discord.chat.presentation.message.messagepart;

import a3.e;
import android.view.View;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.media.PortalUiModel;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010\u001dJ\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\u0010\u00108\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u0010$J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003Jª\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0013\u0010H\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\bHÖ\u0001J\t\u0010L\u001a\u00020MHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010+¨\u0006N"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/presentation/media/PortalUiModel;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "index", "", "channelId", "Lcom/discord/primitives/ChannelId;", "constrainedWidth", "radiusPx", "embed", "Lcom/discord/chat/bridge/embed/Embed;", "shouldAutoPlayGifs", "", "shouldAnimateEmoji", "shouldShowLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "isForwardedContent", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;IJIILcom/discord/chat/bridge/embed/Embed;ZZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getIndex", "()I", "getChannelId-o4g7jtM", "()J", "J", "getConstrainedWidth", "getRadiusPx", "getEmbed", "()Lcom/discord/chat/bridge/embed/Embed;", "getShouldAutoPlayGifs", "()Z", "getShouldAnimateEmoji", "getShouldShowLinkDecorations", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getOnLongClick", "()Landroid/view/View$OnLongClickListener;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-o4g7jtM", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "copy-BDjX1ak", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;IJIILcom/discord/chat/bridge/embed/Embed;ZZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Z)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmbedMessageAccessory extends MessageAccessory implements PortalUiModel {
    private final long channelId;
    private final int constrainedWidth;

    @NotNull
    private final Embed embed;
    private final int index;
    private final boolean isForwardedContent;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final String messageId;
    private final View.OnLongClickListener onLongClick;
    private final int radiusPx;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldAutoPlayGifs;
    private final boolean shouldShowLinkDecorations;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final SpoilerAttributes spoilerAttributes;

    public /* synthetic */ EmbedMessageAccessory(String str, MessageMargins messageMargins, int i7, long j, int i10, int i11, Embed embed, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, i7, j, i10, i11, embed, z5, z6, z7, z10, z11, spoilerAttributes, onLongClickListener, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShouldShowLinkDecorations() {
        return this.shouldShowLinkDecorations;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsForwardedContent() {
        return this.isForwardedContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageMargins getMargins() {
        return this.margins;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRadiusPx() {
        return this.radiusPx;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Embed getEmbed() {
        return this.embed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShouldAutoPlayGifs() {
        return this.shouldAutoPlayGifs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-BDjX1ak, reason: not valid java name */
    public final EmbedMessageAccessory m600copyBDjX1ak(@NotNull String messageId, @NotNull MessageMargins margins, int index, long channelId, int constrainedWidth, int radiusPx, @NotNull Embed embed, boolean shouldAutoPlayGifs, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClick, boolean isForwardedContent) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(embed, "embed");
        return new EmbedMessageAccessory(messageId, margins, index, channelId, constrainedWidth, radiusPx, embed, shouldAutoPlayGifs, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, spoilerAttributes, onLongClick, isForwardedContent, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbedMessageAccessory)) {
            return false;
        }
        EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, embedMessageAccessory.messageId) && Intrinsics.areEqual(this.margins, embedMessageAccessory.margins) && this.index == embedMessageAccessory.index && ChannelId.m1134equalsimpl0(this.channelId, embedMessageAccessory.channelId) && this.constrainedWidth == embedMessageAccessory.constrainedWidth && this.radiusPx == embedMessageAccessory.radiusPx && Intrinsics.areEqual(this.embed, embedMessageAccessory.embed) && this.shouldAutoPlayGifs == embedMessageAccessory.shouldAutoPlayGifs && this.shouldAnimateEmoji == embedMessageAccessory.shouldAnimateEmoji && this.shouldShowLinkDecorations == embedMessageAccessory.shouldShowLinkDecorations && this.shouldShowRoleDot == embedMessageAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == embedMessageAccessory.shouldShowRoleOnName && Intrinsics.areEqual(this.spoilerAttributes, embedMessageAccessory.spoilerAttributes) && Intrinsics.areEqual(this.onLongClick, embedMessageAccessory.onLongClick) && this.isForwardedContent == embedMessageAccessory.isForwardedContent;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m601getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @NotNull
    public final Embed getEmbed() {
        return this.embed;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public int getIndex() {
        return this.index;
    }

    @NotNull
    public final MessageMargins getMargins() {
        return this.margins;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public double getPortal() {
        return PortalUiModel.DefaultImpls.getPortal(this);
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldAutoPlayGifs() {
        return this.shouldAutoPlayGifs;
    }

    public final boolean getShouldShowLinkDecorations() {
        return this.shouldShowLinkDecorations;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public int hashCode() {
        int iG = a.g(a.g(a.g(a.g(a.g((this.embed.hashCode() + a.u(this.radiusPx, a.u(this.constrainedWidth, b.d(this.channelId, a.u(this.index, (this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31, 31), 31), 31), 31)) * 31, 31, this.shouldAutoPlayGifs), 31, this.shouldAnimateEmoji), 31, this.shouldShowLinkDecorations), 31, this.shouldShowRoleDot), 31, this.shouldShowRoleOnName);
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int iHashCode = (iG + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        return Boolean.hashCode(this.isForwardedContent) + ((iHashCode + (onLongClickListener != null ? onLongClickListener.hashCode() : 0)) * 31);
    }

    public final boolean isForwardedContent() {
        return this.isForwardedContent;
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        MessageMargins messageMargins = this.margins;
        int i7 = this.index;
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        int i10 = this.constrainedWidth;
        int i11 = this.radiusPx;
        Embed embed = this.embed;
        boolean z5 = this.shouldAutoPlayGifs;
        boolean z6 = this.shouldAnimateEmoji;
        boolean z7 = this.shouldShowLinkDecorations;
        boolean z10 = this.shouldShowRoleDot;
        boolean z11 = this.shouldShowRoleOnName;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        boolean z12 = this.isForwardedContent;
        StringBuilder sb2 = new StringBuilder("EmbedMessageAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", margins=");
        sb2.append(messageMargins);
        sb2.append(", index=");
        sb2.append(i7);
        sb2.append(", channelId=");
        sb2.append(strM1137toStringimpl);
        sb2.append(", constrainedWidth=");
        e.z(sb2, i10, ", radiusPx=", i11, ", embed=");
        sb2.append(embed);
        sb2.append(", shouldAutoPlayGifs=");
        sb2.append(z5);
        sb2.append(", shouldAnimateEmoji=");
        e.B(sb2, z6, ", shouldShowLinkDecorations=", z7, ", shouldShowRoleDot=");
        e.B(sb2, z10, ", shouldShowRoleOnName=", z11, ", spoilerAttributes=");
        sb2.append(spoilerAttributes);
        sb2.append(", onLongClick=");
        sb2.append(onLongClickListener);
        sb2.append(", isForwardedContent=");
        return a.m(sb2, z12, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EmbedMessageAccessory(String messageId, MessageMargins margins, int i7, long j, int i10, int i11, Embed embed, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z12) {
        super(messageId, "embed " + i7, false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(embed, "embed");
        this.messageId = messageId;
        this.margins = margins;
        this.index = i7;
        this.channelId = j;
        this.constrainedWidth = i10;
        this.radiusPx = i11;
        this.embed = embed;
        this.shouldAutoPlayGifs = z5;
        this.shouldAnimateEmoji = z6;
        this.shouldShowLinkDecorations = z7;
        this.shouldShowRoleDot = z10;
        this.shouldShowRoleOnName = z11;
        this.spoilerAttributes = spoilerAttributes;
        this.onLongClick = onLongClickListener;
        this.isForwardedContent = z12;
    }
}
