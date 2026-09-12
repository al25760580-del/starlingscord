package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0012J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentIndex", "", "attachmentsOpacity", "", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "uploaderId", "", "uploaderItemId", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUploaderId", "getUploaderItemId", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copy-dB0-bEw", "(Ljava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FileAttachmentMessageAccessory extends MessageAttachmentAccessory {

    @NotNull
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;

    @NotNull
    private final String messageId;
    private final SpoilerAttributes spoilerAttributes;
    private final String uploaderId;
    private final String uploaderItemId;

    public /* synthetic */ FileAttachmentMessageAccessory(String str, Attachment attachment, int i7, Float f2, SpoilerAttributes spoilerAttributes, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attachment, i7, f2, spoilerAttributes, str2, str3);
    }

    /* JADX INFO: renamed from: copy-dB0-bEw$default, reason: not valid java name */
    public static /* synthetic */ FileAttachmentMessageAccessory m608copydB0bEw$default(FileAttachmentMessageAccessory fileAttachmentMessageAccessory, String str, Attachment attachment, int i7, Float f2, SpoilerAttributes spoilerAttributes, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fileAttachmentMessageAccessory.messageId;
        }
        if ((i10 & 2) != 0) {
            attachment = fileAttachmentMessageAccessory.attachment;
        }
        if ((i10 & 4) != 0) {
            i7 = fileAttachmentMessageAccessory.attachmentIndex;
        }
        if ((i10 & 8) != 0) {
            f2 = fileAttachmentMessageAccessory.attachmentsOpacity;
        }
        if ((i10 & 16) != 0) {
            spoilerAttributes = fileAttachmentMessageAccessory.spoilerAttributes;
        }
        if ((i10 & 32) != 0) {
            str2 = fileAttachmentMessageAccessory.uploaderId;
        }
        if ((i10 & 64) != 0) {
            str3 = fileAttachmentMessageAccessory.uploaderItemId;
        }
        String str4 = str2;
        String str5 = str3;
        SpoilerAttributes spoilerAttributes2 = spoilerAttributes;
        int i11 = i7;
        return fileAttachmentMessageAccessory.m610copydB0bEw(str, attachment, i11, f2, spoilerAttributes2, str4, str5);
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
    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUploaderId() {
        return this.uploaderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-dB0-bEw, reason: not valid java name */
    public final FileAttachmentMessageAccessory m610copydB0bEw(@NotNull String messageId, @NotNull Attachment attachment, int attachmentIndex, Float attachmentsOpacity, SpoilerAttributes spoilerAttributes, String uploaderId, String uploaderItemId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        return new FileAttachmentMessageAccessory(messageId, attachment, attachmentIndex, attachmentsOpacity, spoilerAttributes, uploaderId, uploaderItemId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileAttachmentMessageAccessory)) {
            return false;
        }
        FileAttachmentMessageAccessory fileAttachmentMessageAccessory = (FileAttachmentMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, fileAttachmentMessageAccessory.messageId) && Intrinsics.areEqual(this.attachment, fileAttachmentMessageAccessory.attachment) && this.attachmentIndex == fileAttachmentMessageAccessory.attachmentIndex && Intrinsics.areEqual((Object) this.attachmentsOpacity, (Object) fileAttachmentMessageAccessory.attachmentsOpacity) && Intrinsics.areEqual(this.spoilerAttributes, fileAttachmentMessageAccessory.spoilerAttributes) && Intrinsics.areEqual(this.uploaderId, fileAttachmentMessageAccessory.uploaderId) && Intrinsics.areEqual(this.uploaderItemId, fileAttachmentMessageAccessory.uploaderItemId);
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

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory, com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public final String getUploaderId() {
        return this.uploaderId;
    }

    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    public int hashCode() {
        int iU = a.u(this.attachmentIndex, (this.attachment.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31, 31);
        Float f2 = this.attachmentsOpacity;
        int iHashCode = (iU + (f2 == null ? 0 : f2.hashCode())) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int iHashCode2 = (iHashCode + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        String str = this.uploaderId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploaderItemId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        Attachment attachment = this.attachment;
        int i7 = this.attachmentIndex;
        Float f2 = this.attachmentsOpacity;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        String str = this.uploaderId;
        String str2 = this.uploaderItemId;
        StringBuilder sb2 = new StringBuilder("FileAttachmentMessageAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", attachment=");
        sb2.append(attachment);
        sb2.append(", attachmentIndex=");
        sb2.append(i7);
        sb2.append(", attachmentsOpacity=");
        sb2.append(f2);
        sb2.append(", spoilerAttributes=");
        sb2.append(spoilerAttributes);
        sb2.append(", uploaderId=");
        sb2.append(str);
        sb2.append(", uploaderItemId=");
        return a.k(sb2, str2, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FileAttachmentMessageAccessory(String messageId, Attachment attachment, int i7, Float f2, SpoilerAttributes spoilerAttributes, String str, String str2) {
        super(messageId, attachment, i7, f2, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.messageId = messageId;
        this.attachment = attachment;
        this.attachmentIndex = i7;
        this.attachmentsOpacity = f2;
        this.spoilerAttributes = spoilerAttributes;
        this.uploaderId = str;
        this.uploaderItemId = str2;
    }
}
