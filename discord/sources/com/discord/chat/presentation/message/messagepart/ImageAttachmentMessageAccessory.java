package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0013J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jd\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0007HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentIndex", "", "attachmentsOpacity", "", "constrainedWidth", "radiusPx", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "useNewAltTextButton", "", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getConstrainedWidth", "getRadiusPx", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUseNewAltTextButton", "()Z", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy-NsYpSCE", "(Ljava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Z)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageAttachmentMessageAccessory extends MessageAttachmentAccessory {

    @NotNull
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;
    private final int constrainedWidth;

    @NotNull
    private final String messageId;
    private final int radiusPx;
    private final SpoilerAttributes spoilerAttributes;
    private final boolean useNewAltTextButton;

    public /* synthetic */ ImageAttachmentMessageAccessory(String str, Attachment attachment, int i7, Float f2, int i10, int i11, SpoilerAttributes spoilerAttributes, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attachment, i7, f2, i10, i11, spoilerAttributes, z5);
    }

    /* JADX INFO: renamed from: copy-NsYpSCE$default, reason: not valid java name */
    public static /* synthetic */ ImageAttachmentMessageAccessory m646copyNsYpSCE$default(ImageAttachmentMessageAccessory imageAttachmentMessageAccessory, String str, Attachment attachment, int i7, Float f2, int i10, int i11, SpoilerAttributes spoilerAttributes, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageAttachmentMessageAccessory.messageId;
        }
        if ((i12 & 2) != 0) {
            attachment = imageAttachmentMessageAccessory.attachment;
        }
        if ((i12 & 4) != 0) {
            i7 = imageAttachmentMessageAccessory.attachmentIndex;
        }
        if ((i12 & 8) != 0) {
            f2 = imageAttachmentMessageAccessory.attachmentsOpacity;
        }
        if ((i12 & 16) != 0) {
            i10 = imageAttachmentMessageAccessory.constrainedWidth;
        }
        if ((i12 & 32) != 0) {
            i11 = imageAttachmentMessageAccessory.radiusPx;
        }
        if ((i12 & 64) != 0) {
            spoilerAttributes = imageAttachmentMessageAccessory.spoilerAttributes;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            z5 = imageAttachmentMessageAccessory.useNewAltTextButton;
        }
        SpoilerAttributes spoilerAttributes2 = spoilerAttributes;
        boolean z6 = z5;
        int i13 = i10;
        int i14 = i11;
        return imageAttachmentMessageAccessory.m648copyNsYpSCE(str, attachment, i7, f2, i13, i14, spoilerAttributes2, z6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Attachment getAttachment() {
        return this.attachment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRadiusPx() {
        return this.radiusPx;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getUseNewAltTextButton() {
        return this.useNewAltTextButton;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-NsYpSCE, reason: not valid java name */
    public final ImageAttachmentMessageAccessory m648copyNsYpSCE(@NotNull String messageId, @NotNull Attachment attachment, int attachmentIndex, Float attachmentsOpacity, int constrainedWidth, int radiusPx, SpoilerAttributes spoilerAttributes, boolean useNewAltTextButton) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        return new ImageAttachmentMessageAccessory(messageId, attachment, attachmentIndex, attachmentsOpacity, constrainedWidth, radiusPx, spoilerAttributes, useNewAltTextButton, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageAttachmentMessageAccessory)) {
            return false;
        }
        ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, imageAttachmentMessageAccessory.messageId) && Intrinsics.areEqual(this.attachment, imageAttachmentMessageAccessory.attachment) && this.attachmentIndex == imageAttachmentMessageAccessory.attachmentIndex && Intrinsics.areEqual((Object) this.attachmentsOpacity, (Object) imageAttachmentMessageAccessory.attachmentsOpacity) && this.constrainedWidth == imageAttachmentMessageAccessory.constrainedWidth && this.radiusPx == imageAttachmentMessageAccessory.radiusPx && Intrinsics.areEqual(this.spoilerAttributes, imageAttachmentMessageAccessory.spoilerAttributes) && this.useNewAltTextButton == imageAttachmentMessageAccessory.useNewAltTextButton;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
    @NotNull
    public Attachment getAttachment() {
        return this.attachment;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
    public int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
    public Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory, com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
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
        int iU = a.u(this.attachmentIndex, (this.attachment.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31, 31);
        Float f2 = this.attachmentsOpacity;
        int iU2 = a.u(this.radiusPx, a.u(this.constrainedWidth, (iU + (f2 == null ? 0 : f2.hashCode())) * 31, 31), 31);
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return Boolean.hashCode(this.useNewAltTextButton) + ((iU2 + (spoilerAttributes != null ? spoilerAttributes.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        Attachment attachment = this.attachment;
        int i7 = this.attachmentIndex;
        Float f2 = this.attachmentsOpacity;
        int i10 = this.constrainedWidth;
        int i11 = this.radiusPx;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        boolean z5 = this.useNewAltTextButton;
        StringBuilder sb2 = new StringBuilder("ImageAttachmentMessageAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", attachment=");
        sb2.append(attachment);
        sb2.append(", attachmentIndex=");
        sb2.append(i7);
        sb2.append(", attachmentsOpacity=");
        sb2.append(f2);
        sb2.append(", constrainedWidth=");
        e.z(sb2, i10, ", radiusPx=", i11, ", spoilerAttributes=");
        sb2.append(spoilerAttributes);
        sb2.append(", useNewAltTextButton=");
        sb2.append(z5);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ImageAttachmentMessageAccessory(String messageId, Attachment attachment, int i7, Float f2, int i10, int i11, SpoilerAttributes spoilerAttributes, boolean z5) {
        super(messageId, attachment, i7, f2, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.messageId = messageId;
        this.attachment = attachment;
        this.attachmentIndex = i7;
        this.attachmentsOpacity = f2;
        this.constrainedWidth = i10;
        this.radiusPx = i11;
        this.spoilerAttributes = spoilerAttributes;
        this.useNewAltTextButton = z5;
    }
}
