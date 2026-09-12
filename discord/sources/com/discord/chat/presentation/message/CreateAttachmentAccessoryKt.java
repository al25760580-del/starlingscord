package com.discord.chat.presentation.message;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.AttachmentType;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"createAttachmentAccessory", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "Lcom/discord/chat/bridge/attachment/Attachment;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "constrainedWidth", "radiusPx", "verifyAge", "", "(Lcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/Message;IIILjava/lang/Boolean;)Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CreateAttachmentAccessoryKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType.File.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachmentType.Audio.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final MessageAttachmentAccessory createAttachmentAccessory(@NotNull Attachment attachment, @NotNull Message message, int i7, int i10, int i11, Boolean bool) {
        String strM267getId3Eiw7ao;
        Intrinsics.checkNotNullParameter(attachment, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        SpoilerAttributes spoilerAttributesForAttachment = SpoilerAttributes.INSTANCE.forAttachment(attachment, message, i7, bool);
        if (!Intrinsics.areEqual(message.isCurrentUserMessageAuthor(), Boolean.TRUE) || (strM267getId3Eiw7ao = message.m268getNonceN_6c4I0()) == null) {
            strM267getId3Eiw7ao = message.m267getId3Eiw7ao();
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[attachment.type().ordinal()];
        if (i12 == 1) {
            String str = strM267getId3Eiw7ao;
            Boolean useAttachmentGridLayout = message.getUseAttachmentGridLayout();
            return new ImageAttachmentMessageAccessory(str, attachment, i7, message.getAttachmentsOpacity(), i10, i11, spoilerAttributesForAttachment, useAttachmentGridLayout != null ? useAttachmentGridLayout.booleanValue() : false, null);
        }
        if (i12 != 2) {
            if (i12 == 3) {
                return new FileAttachmentMessageAccessory(strM267getId3Eiw7ao, attachment, i7, message.getAttachmentsOpacity(), spoilerAttributesForAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), null);
            }
            if (i12 == 4) {
                return new AudioAttachmentMessageAccessory(message.m264getChannelIdo4g7jtM(), strM267getId3Eiw7ao, attachment, i7, message.getAttachmentsOpacity(), message.m263getAuthorIdwUX8bhU(), message.getAudioAttachmentBackgroundColor(), MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.IS_VOICE_MESSAGE), null);
            }
            throw new rn.n();
        }
        String str2 = strM267getId3Eiw7ao;
        long jM264getChannelIdo4g7jtM = message.m264getChannelIdo4g7jtM();
        Boolean useAttachmentGridLayout2 = message.getUseAttachmentGridLayout();
        boolean zBooleanValue = useAttachmentGridLayout2 != null ? useAttachmentGridLayout2.booleanValue() : false;
        Boolean useAttachmentUploadPreview = message.getUseAttachmentUploadPreview();
        return new VideoAttachmentMessageAccessory(jM264getChannelIdo4g7jtM, str2, i7, attachment, message.getAttachmentsOpacity(), i10, i11, spoilerAttributesForAttachment, zBooleanValue, (useAttachmentUploadPreview != null ? useAttachmentUploadPreview.booleanValue() : false) && attachment.getProgress() != null, null);
    }
}
