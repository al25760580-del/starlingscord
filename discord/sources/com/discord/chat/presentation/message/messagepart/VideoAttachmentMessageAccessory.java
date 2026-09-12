package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.media.PortalUiModel;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u0017J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010\u001aJ\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0012HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003Jx\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\bHÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001R\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(¨\u0006?"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "Lcom/discord/chat/presentation/media/PortalUiModel;", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentsOpacity", "", "constrainedWidth", "radiusPx", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "useNewAltTextButton", "", "hideMediaPlayButton", "<init>", "(JLjava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Ljava/lang/Float;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getIndex", "()I", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getConstrainedWidth", "getRadiusPx", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUseNewAltTextButton", "()Z", "getHideMediaPlayButton", "component1", "component1-o4g7jtM", "component2", "component2-3Eiw7ao", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "copy-z64KZZs", "(JLjava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Ljava/lang/Float;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;ZZ)Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VideoAttachmentMessageAccessory extends MessageAttachmentAccessory implements PortalUiModel {

    @NotNull
    private final Attachment attachment;
    private final Float attachmentsOpacity;
    private final long channelId;
    private final int constrainedWidth;
    private final boolean hideMediaPlayButton;
    private final int index;

    @NotNull
    private final String messageId;
    private final int radiusPx;
    private final SpoilerAttributes spoilerAttributes;
    private final boolean useNewAltTextButton;

    public /* synthetic */ VideoAttachmentMessageAccessory(long j, String str, int i7, Attachment attachment, Float f2, int i10, int i11, SpoilerAttributes spoilerAttributes, boolean z5, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i7, attachment, f2, i10, i11, spoilerAttributes, z5, z6);
    }

    /* JADX INFO: renamed from: copy-z64KZZs$default, reason: not valid java name */
    public static /* synthetic */ VideoAttachmentMessageAccessory m714copyz64KZZs$default(VideoAttachmentMessageAccessory videoAttachmentMessageAccessory, long j, String str, int i7, Attachment attachment, Float f2, int i10, int i11, SpoilerAttributes spoilerAttributes, boolean z5, boolean z6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j = videoAttachmentMessageAccessory.channelId;
        }
        long j5 = j;
        if ((i12 & 2) != 0) {
            str = videoAttachmentMessageAccessory.messageId;
        }
        return videoAttachmentMessageAccessory.m717copyz64KZZs(j5, str, (i12 & 4) != 0 ? videoAttachmentMessageAccessory.index : i7, (i12 & 8) != 0 ? videoAttachmentMessageAccessory.attachment : attachment, (i12 & 16) != 0 ? videoAttachmentMessageAccessory.attachmentsOpacity : f2, (i12 & 32) != 0 ? videoAttachmentMessageAccessory.constrainedWidth : i10, (i12 & 64) != 0 ? videoAttachmentMessageAccessory.radiusPx : i11, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? videoAttachmentMessageAccessory.spoilerAttributes : spoilerAttributes, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? videoAttachmentMessageAccessory.useNewAltTextButton : z5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? videoAttachmentMessageAccessory.hideMediaPlayButton : z6);
    }

    /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHideMediaPlayButton() {
        return this.hideMediaPlayButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Attachment getAttachment() {
        return this.attachment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getRadiusPx() {
        return this.radiusPx;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getUseNewAltTextButton() {
        return this.useNewAltTextButton;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-z64KZZs, reason: not valid java name */
    public final VideoAttachmentMessageAccessory m717copyz64KZZs(long channelId, @NotNull String messageId, int index, @NotNull Attachment attachment, Float attachmentsOpacity, int constrainedWidth, int radiusPx, SpoilerAttributes spoilerAttributes, boolean useNewAltTextButton, boolean hideMediaPlayButton) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        return new VideoAttachmentMessageAccessory(channelId, messageId, index, attachment, attachmentsOpacity, constrainedWidth, radiusPx, spoilerAttributes, useNewAltTextButton, hideMediaPlayButton, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoAttachmentMessageAccessory)) {
            return false;
        }
        VideoAttachmentMessageAccessory videoAttachmentMessageAccessory = (VideoAttachmentMessageAccessory) other;
        return ChannelId.m1134equalsimpl0(this.channelId, videoAttachmentMessageAccessory.channelId) && MessageId.m1160equalsimpl0(this.messageId, videoAttachmentMessageAccessory.messageId) && this.index == videoAttachmentMessageAccessory.index && Intrinsics.areEqual(this.attachment, videoAttachmentMessageAccessory.attachment) && Intrinsics.areEqual((Object) this.attachmentsOpacity, (Object) videoAttachmentMessageAccessory.attachmentsOpacity) && this.constrainedWidth == videoAttachmentMessageAccessory.constrainedWidth && this.radiusPx == videoAttachmentMessageAccessory.radiusPx && Intrinsics.areEqual(this.spoilerAttributes, videoAttachmentMessageAccessory.spoilerAttributes) && this.useNewAltTextButton == videoAttachmentMessageAccessory.useNewAltTextButton && this.hideMediaPlayButton == videoAttachmentMessageAccessory.hideMediaPlayButton;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
    @NotNull
    public Attachment getAttachment() {
        return this.attachment;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
    public Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m718getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final boolean getHideMediaPlayButton() {
        return this.hideMediaPlayButton;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory, com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public double getPortal() {
        return PortalUiModel.DefaultImpls.getPortal(this);
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public final boolean getUseNewAltTextButton() {
        return this.useNewAltTextButton;
    }

    public int hashCode() {
        int iHashCode = (this.attachment.hashCode() + a.u(this.index, (MessageId.m1161hashCodeimpl(this.messageId) + (ChannelId.m1135hashCodeimpl(this.channelId) * 31)) * 31, 31)) * 31;
        Float f2 = this.attachmentsOpacity;
        int iU = a.u(this.radiusPx, a.u(this.constrainedWidth, (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31, 31), 31);
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return Boolean.hashCode(this.hideMediaPlayButton) + a.g((iU + (spoilerAttributes != null ? spoilerAttributes.hashCode() : 0)) * 31, 31, this.useNewAltTextButton);
    }

    @NotNull
    public String toString() {
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        int i7 = this.index;
        Attachment attachment = this.attachment;
        Float f2 = this.attachmentsOpacity;
        int i10 = this.constrainedWidth;
        int i11 = this.radiusPx;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        boolean z5 = this.useNewAltTextButton;
        boolean z6 = this.hideMediaPlayButton;
        StringBuilder sbU = e.u("VideoAttachmentMessageAccessory(channelId=", strM1137toStringimpl, ", messageId=", strM1163toStringimpl, ", index=");
        sbU.append(i7);
        sbU.append(", attachment=");
        sbU.append(attachment);
        sbU.append(", attachmentsOpacity=");
        sbU.append(f2);
        sbU.append(", constrainedWidth=");
        sbU.append(i10);
        sbU.append(", radiusPx=");
        sbU.append(i11);
        sbU.append(", spoilerAttributes=");
        sbU.append(spoilerAttributes);
        sbU.append(", useNewAltTextButton=");
        sbU.append(z5);
        sbU.append(", hideMediaPlayButton=");
        sbU.append(z6);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private VideoAttachmentMessageAccessory(long j, String messageId, int i7, Attachment attachment, Float f2, int i10, int i11, SpoilerAttributes spoilerAttributes, boolean z5, boolean z6) {
        super(messageId, attachment, i7, f2, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.channelId = j;
        this.messageId = messageId;
        this.index = i7;
        this.attachment = attachment;
        this.attachmentsOpacity = f2;
        this.constrainedWidth = i10;
        this.radiusPx = i11;
        this.spoilerAttributes = spoilerAttributes;
        this.useNewAltTextButton = z5;
        this.hideMediaPlayButton = z6;
    }
}
