package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u0014J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u0017J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\b.J\u0010\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\t\u00100\u001a\u00020\u0010HÆ\u0003Jf\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\tHÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%¨\u0006:"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentIndex", "", "attachmentsOpacity", "", "authorId", "Lcom/discord/primitives/UserId;", ViewProps.COLOR, "isVoiceMessage", "", "<init>", "(JLjava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;Lcom/discord/primitives/UserId;Ljava/lang/Integer;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAuthorId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component1-o4g7jtM", "component2", "component2-3Eiw7ao", "component3", "component4", "component5", "component6", "component6-wUX8bhU", "component7", "component8", "copy", "copy-adMySAk", "(JLjava/lang/String;Lcom/discord/chat/bridge/attachment/Attachment;ILjava/lang/Float;Lcom/discord/primitives/UserId;Ljava/lang/Integer;Z)Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioAttachmentMessageAccessory extends MessageAttachmentAccessory {

    @NotNull
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;
    private final UserId authorId;
    private final long channelId;
    private final Integer color;
    private final boolean isVoiceMessage;

    @NotNull
    private final String messageId;

    public /* synthetic */ AudioAttachmentMessageAccessory(long j, String str, Attachment attachment, int i7, Float f2, UserId userId, Integer num, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, attachment, i7, f2, userId, num, z5);
    }

    /* JADX INFO: renamed from: copy-adMySAk$default, reason: not valid java name */
    public static /* synthetic */ AudioAttachmentMessageAccessory m582copyadMySAk$default(AudioAttachmentMessageAccessory audioAttachmentMessageAccessory, long j, String str, Attachment attachment, int i7, Float f2, UserId userId, Integer num, boolean z5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = audioAttachmentMessageAccessory.channelId;
        }
        long j5 = j;
        if ((i10 & 2) != 0) {
            str = audioAttachmentMessageAccessory.messageId;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            attachment = audioAttachmentMessageAccessory.attachment;
        }
        Attachment attachment2 = attachment;
        if ((i10 & 8) != 0) {
            i7 = audioAttachmentMessageAccessory.attachmentIndex;
        }
        return audioAttachmentMessageAccessory.m586copyadMySAk(j5, str2, attachment2, i7, (i10 & 16) != 0 ? audioAttachmentMessageAccessory.attachmentsOpacity : f2, (i10 & 32) != 0 ? audioAttachmentMessageAccessory.authorId : userId, (i10 & 64) != 0 ? audioAttachmentMessageAccessory.color : num, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? audioAttachmentMessageAccessory.isVoiceMessage : z5);
    }

    /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Attachment getAttachment() {
        return this.attachment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    /* JADX INFO: renamed from: component6-wUX8bhU, reason: not valid java name and from getter */
    public final UserId getAuthorId() {
        return this.authorId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsVoiceMessage() {
        return this.isVoiceMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-adMySAk, reason: not valid java name */
    public final AudioAttachmentMessageAccessory m586copyadMySAk(long channelId, @NotNull String messageId, @NotNull Attachment attachment, int attachmentIndex, Float attachmentsOpacity, UserId authorId, Integer color, boolean isVoiceMessage) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        return new AudioAttachmentMessageAccessory(channelId, messageId, attachment, attachmentIndex, attachmentsOpacity, authorId, color, isVoiceMessage, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioAttachmentMessageAccessory)) {
            return false;
        }
        AudioAttachmentMessageAccessory audioAttachmentMessageAccessory = (AudioAttachmentMessageAccessory) other;
        return ChannelId.m1134equalsimpl0(this.channelId, audioAttachmentMessageAccessory.channelId) && MessageId.m1160equalsimpl0(this.messageId, audioAttachmentMessageAccessory.messageId) && Intrinsics.areEqual(this.attachment, audioAttachmentMessageAccessory.attachment) && this.attachmentIndex == audioAttachmentMessageAccessory.attachmentIndex && Intrinsics.areEqual((Object) this.attachmentsOpacity, (Object) audioAttachmentMessageAccessory.attachmentsOpacity) && Intrinsics.areEqual(this.authorId, audioAttachmentMessageAccessory.authorId) && Intrinsics.areEqual(this.color, audioAttachmentMessageAccessory.color) && this.isVoiceMessage == audioAttachmentMessageAccessory.isVoiceMessage;
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

    /* JADX INFO: renamed from: getAuthorId-wUX8bhU, reason: not valid java name */
    public final UserId m587getAuthorIdwUX8bhU() {
        return this.authorId;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m588getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final Integer getColor() {
        return this.color;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory, com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        int iU = a.u(this.attachmentIndex, (this.attachment.hashCode() + ((MessageId.m1161hashCodeimpl(this.messageId) + (ChannelId.m1135hashCodeimpl(this.channelId) * 31)) * 31)) * 31, 31);
        Float f2 = this.attachmentsOpacity;
        int iHashCode = (iU + (f2 == null ? 0 : f2.hashCode())) * 31;
        UserId userId = this.authorId;
        int iM1213hashCodeimpl = (iHashCode + (userId == null ? 0 : UserId.m1213hashCodeimpl(userId.m1217unboximpl()))) * 31;
        Integer num = this.color;
        return Boolean.hashCode(this.isVoiceMessage) + ((iM1213hashCodeimpl + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final boolean isVoiceMessage() {
        return this.isVoiceMessage;
    }

    @NotNull
    public String toString() {
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        Attachment attachment = this.attachment;
        int i7 = this.attachmentIndex;
        Float f2 = this.attachmentsOpacity;
        UserId userId = this.authorId;
        Integer num = this.color;
        boolean z5 = this.isVoiceMessage;
        StringBuilder sbU = e.u("AudioAttachmentMessageAccessory(channelId=", strM1137toStringimpl, ", messageId=", strM1163toStringimpl, ", attachment=");
        sbU.append(attachment);
        sbU.append(", attachmentIndex=");
        sbU.append(i7);
        sbU.append(", attachmentsOpacity=");
        sbU.append(f2);
        sbU.append(", authorId=");
        sbU.append(userId);
        sbU.append(", color=");
        sbU.append(num);
        sbU.append(", isVoiceMessage=");
        sbU.append(z5);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AudioAttachmentMessageAccessory(long j, String messageId, Attachment attachment, int i7, Float f2, UserId userId, Integer num, boolean z5) {
        super(messageId, attachment, i7, f2, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.channelId = j;
        this.messageId = messageId;
        this.attachment = attachment;
        this.attachmentIndex = i7;
        this.attachmentsOpacity = f2;
        this.authorId = userId;
        this.color = num;
        this.isVoiceMessage = z5;
    }
}
