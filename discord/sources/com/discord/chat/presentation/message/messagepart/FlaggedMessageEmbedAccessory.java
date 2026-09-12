package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlaggedMessageEmbedAccessory extends MessageAccessory {

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final Message message;

    @NotNull
    private final MessageContext messageContext;

    @NotNull
    private final String messageId;

    public /* synthetic */ FlaggedMessageEmbedAccessory(String str, MessageMargins messageMargins, Message message, MessageContext messageContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, message, messageContext);
    }

    /* JADX INFO: renamed from: copy-AFFcxXc$default, reason: not valid java name */
    public static /* synthetic */ FlaggedMessageEmbedAccessory m614copyAFFcxXc$default(FlaggedMessageEmbedAccessory flaggedMessageEmbedAccessory, String str, MessageMargins messageMargins, Message message, MessageContext messageContext, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = flaggedMessageEmbedAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            messageMargins = flaggedMessageEmbedAccessory.margins;
        }
        if ((i7 & 4) != 0) {
            message = flaggedMessageEmbedAccessory.message;
        }
        if ((i7 & 8) != 0) {
            messageContext = flaggedMessageEmbedAccessory.messageContext;
        }
        return flaggedMessageEmbedAccessory.m616copyAFFcxXc(str, messageMargins, message, messageContext);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-AFFcxXc, reason: not valid java name */
    public final FlaggedMessageEmbedAccessory m616copyAFFcxXc(@NotNull String messageId, @NotNull MessageMargins margins, @NotNull Message message, @NotNull MessageContext messageContext) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        return new FlaggedMessageEmbedAccessory(messageId, margins, message, messageContext, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlaggedMessageEmbedAccessory)) {
            return false;
        }
        FlaggedMessageEmbedAccessory flaggedMessageEmbedAccessory = (FlaggedMessageEmbedAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, flaggedMessageEmbedAccessory.messageId) && Intrinsics.areEqual(this.margins, flaggedMessageEmbedAccessory.margins) && Intrinsics.areEqual(this.message, flaggedMessageEmbedAccessory.message) && Intrinsics.areEqual(this.messageContext, flaggedMessageEmbedAccessory.messageContext);
    }

    @NotNull
    public final MessageMargins getMargins() {
        return this.margins;
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.messageContext.hashCode() + ((this.message.hashCode() + ((this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FlaggedMessageEmbedAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", margins=" + this.margins + ", message=" + this.message + ", messageContext=" + this.messageContext + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FlaggedMessageEmbedAccessory(String messageId, MessageMargins margins, Message message, MessageContext messageContext) {
        super(messageId, "flagged-message-embed", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        this.messageId = messageId;
        this.margins = margins;
        this.message = message;
        this.messageContext = messageContext;
    }
}
