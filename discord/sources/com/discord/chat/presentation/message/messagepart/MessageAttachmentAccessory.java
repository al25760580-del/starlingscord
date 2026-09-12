package com.discord.chat.presentation.message.messagepart;

import c6.a;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.chat.presentation.message.view.UploadItemProps;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0004 !\"#¨\u0006$"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachment", "", "attachmentIndex", "", "attachmentsOpacity", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;)V", "Lkotlin/Function2;", "", "", "onCancelUploadItem", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "getUploadItemProps", "(Lkotlin/jvm/functions/Function2;)Lcom/discord/chat/presentation/message/view/UploadItemProps;", "Ljava/lang/String;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "I", "getAttachmentIndex", "()I", "Ljava/lang/Float;", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Companion", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessageAttachmentAccessory extends MessageAccessory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;

    @NotNull
    private final String messageId;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory$Companion;", "", "<init>", "()V", "createAccessoryDescription", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentIndex", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createAccessoryDescription(Attachment attachment, int attachmentIndex) {
            return b.k(attachment.type().getIndexLabel(), " ", (attachment.getUploaderId() == null || attachment.getUploaderItemId() == null) ? String.valueOf(attachmentIndex) : b.k(attachment.getUploaderId(), " ", attachment.getUploaderItemId()));
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageAttachmentAccessory(String str, Attachment attachment, int i7, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attachment, i7, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadItemProps$lambda$0(Function2 function2, UploadContext uploadContext) {
        function2.invoke(uploadContext.getUploaderId(), uploadContext.getUploadItemId());
        return Unit.f14616a;
    }

    @NotNull
    public Attachment getAttachment() {
        return this.attachment;
    }

    public int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    public Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: from getter */
    public String getMessageId() {
        return this.messageId;
    }

    public final UploadItemProps getUploadItemProps(@NotNull Function2<? super String, ? super String, Unit> onCancelUploadItem) {
        Intrinsics.checkNotNullParameter(onCancelUploadItem, "onCancelUploadItem");
        String uploaderId = getAttachment().getUploaderId();
        String uploaderItemId = getAttachment().getUploaderItemId();
        Integer progress = getAttachment().getProgress();
        Float attachmentsOpacity = getAttachmentsOpacity();
        if (uploaderId == null || uploaderItemId == null || progress == null || attachmentsOpacity == null) {
            return null;
        }
        UploadContext uploadContext = new UploadContext(uploaderId, uploaderItemId);
        return new UploadItemProps(progress.intValue(), uploadContext, attachmentsOpacity.floatValue(), new a(0, onCancelUploadItem, uploadContext));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MessageAttachmentAccessory(String messageId, Attachment attachment, int i7, Float f2) {
        super(messageId, INSTANCE.createAccessoryDescription(attachment, i7), false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.messageId = messageId;
        this.attachment = attachment;
        this.attachmentIndex = i7;
        this.attachmentsOpacity = f2;
    }
}
