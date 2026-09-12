package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u0015J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003Jf\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\fHÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 ¨\u00067"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "channelId", "Lcom/discord/primitives/ChannelId;", "attachments", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "constrainedWidth", "", "isForwardedContent", "", "messageState", "Lcom/discord/chat/bridge/MessageState;", "shouldAutoPlayGif", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;JLjava/util/List;IZLcom/discord/chat/bridge/MessageState;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getChannelId-o4g7jtM", "()J", "J", "getAttachments", "()Ljava/util/List;", "getConstrainedWidth", "()I", "()Z", "getMessageState", "()Lcom/discord/chat/bridge/MessageState;", "getShouldAutoPlayGif", "component1", "component1-3Eiw7ao", "component2", "component3", "component3-o4g7jtM", "component4", "component5", "component6", "component7", "component8", "copy", "copy-SFu99iY", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;JLjava/util/List;IZLcom/discord/chat/bridge/MessageState;Z)Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaMosaicAttachmentMessageAccessory extends MessageAccessory {

    @NotNull
    private final List<MessageAttachmentAccessory> attachments;
    private final long channelId;
    private final int constrainedWidth;
    private final boolean isForwardedContent;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final String messageId;

    @NotNull
    private final MessageState messageState;
    private final boolean shouldAutoPlayGif;

    public /* synthetic */ MediaMosaicAttachmentMessageAccessory(String str, MessageMargins messageMargins, long j, List list, int i7, boolean z5, MessageState messageState, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, j, list, i7, z5, messageState, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-SFu99iY$default, reason: not valid java name */
    public static /* synthetic */ MediaMosaicAttachmentMessageAccessory m657copySFu99iY$default(MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory, String str, MessageMargins messageMargins, long j, List list, int i7, boolean z5, MessageState messageState, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mediaMosaicAttachmentMessageAccessory.messageId;
        }
        if ((i10 & 2) != 0) {
            messageMargins = mediaMosaicAttachmentMessageAccessory.margins;
        }
        if ((i10 & 4) != 0) {
            j = mediaMosaicAttachmentMessageAccessory.channelId;
        }
        if ((i10 & 8) != 0) {
            list = mediaMosaicAttachmentMessageAccessory.attachments;
        }
        if ((i10 & 16) != 0) {
            i7 = mediaMosaicAttachmentMessageAccessory.constrainedWidth;
        }
        if ((i10 & 32) != 0) {
            z5 = mediaMosaicAttachmentMessageAccessory.isForwardedContent;
        }
        if ((i10 & 64) != 0) {
            messageState = mediaMosaicAttachmentMessageAccessory.messageState;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            z6 = mediaMosaicAttachmentMessageAccessory.shouldAutoPlayGif;
        }
        boolean z7 = z6;
        boolean z10 = z5;
        List list2 = list;
        long j5 = j;
        return mediaMosaicAttachmentMessageAccessory.m660copySFu99iY(str, messageMargins, j5, list2, i7, z10, messageState, z7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageMargins getMargins() {
        return this.margins;
    }

    /* JADX INFO: renamed from: component3-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final List<MessageAttachmentAccessory> component4() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsForwardedContent() {
        return this.isForwardedContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageState getMessageState() {
        return this.messageState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShouldAutoPlayGif() {
        return this.shouldAutoPlayGif;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-SFu99iY, reason: not valid java name */
    public final MediaMosaicAttachmentMessageAccessory m660copySFu99iY(@NotNull String messageId, @NotNull MessageMargins margins, long channelId, @NotNull List<? extends MessageAttachmentAccessory> attachments, int constrainedWidth, boolean isForwardedContent, @NotNull MessageState messageState, boolean shouldAutoPlayGif) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(messageState, "messageState");
        return new MediaMosaicAttachmentMessageAccessory(messageId, margins, channelId, attachments, constrainedWidth, isForwardedContent, messageState, shouldAutoPlayGif, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaMosaicAttachmentMessageAccessory)) {
            return false;
        }
        MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory = (MediaMosaicAttachmentMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, mediaMosaicAttachmentMessageAccessory.messageId) && Intrinsics.areEqual(this.margins, mediaMosaicAttachmentMessageAccessory.margins) && ChannelId.m1134equalsimpl0(this.channelId, mediaMosaicAttachmentMessageAccessory.channelId) && Intrinsics.areEqual(this.attachments, mediaMosaicAttachmentMessageAccessory.attachments) && this.constrainedWidth == mediaMosaicAttachmentMessageAccessory.constrainedWidth && this.isForwardedContent == mediaMosaicAttachmentMessageAccessory.isForwardedContent && this.messageState == mediaMosaicAttachmentMessageAccessory.messageState && this.shouldAutoPlayGif == mediaMosaicAttachmentMessageAccessory.shouldAutoPlayGif;
    }

    @NotNull
    public final List<MessageAttachmentAccessory> getAttachments() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m661getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
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

    @NotNull
    public final MessageState getMessageState() {
        return this.messageState;
    }

    public final boolean getShouldAutoPlayGif() {
        return this.shouldAutoPlayGif;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldAutoPlayGif) + ((this.messageState.hashCode() + a.g(a.u(this.constrainedWidth, e.f(this.attachments, b.d(this.channelId, (this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31, 31), 31), 31), 31, this.isForwardedContent)) * 31);
    }

    public final boolean isForwardedContent() {
        return this.isForwardedContent;
    }

    @NotNull
    public String toString() {
        return "MediaMosaicAttachmentMessageAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", margins=" + this.margins + ", channelId=" + ChannelId.m1137toStringimpl(this.channelId) + ", attachments=" + this.attachments + ", constrainedWidth=" + this.constrainedWidth + ", isForwardedContent=" + this.isForwardedContent + ", messageState=" + this.messageState + ", shouldAutoPlayGif=" + this.shouldAutoPlayGif + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private MediaMosaicAttachmentMessageAccessory(String messageId, MessageMargins margins, long j, List<? extends MessageAttachmentAccessory> attachments, int i7, boolean z5, MessageState messageState, boolean z6) {
        super(messageId, "multimedia attachment", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(messageState, "messageState");
        this.messageId = messageId;
        this.margins = margins;
        this.channelId = j;
        this.attachments = attachments;
        this.constrainedWidth = i7;
        this.isForwardedContent = z5;
        this.messageState = messageState;
        this.shouldAutoPlayGif = z6;
    }
}
