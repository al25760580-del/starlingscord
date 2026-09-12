package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003JT\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006-"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "message", "Lcom/discord/chat/bridge/Message;", "messageComponents", "", "Lcom/discord/chat/bridge/botuikit/Component;", "constrainedWidth", "", "embedId", "", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/Message;Ljava/util/List;ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageComponents", "()Ljava/util/List;", "getConstrainedWidth", "()I", "getEmbedId", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "copy", "copy-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/Message;Ljava/util/List;ILjava/lang/String;)Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageComponentsAccessory extends MessageAccessory {
    private final int constrainedWidth;
    private final String embedId;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final Message message;

    @NotNull
    private final List<Component> messageComponents;

    @NotNull
    private final String messageId;

    public /* synthetic */ MessageComponentsAccessory(String str, MessageMargins messageMargins, Message message, List list, int i7, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, message, list, i7, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-LdU2QRA$default, reason: not valid java name */
    public static /* synthetic */ MessageComponentsAccessory m662copyLdU2QRA$default(MessageComponentsAccessory messageComponentsAccessory, String str, MessageMargins messageMargins, Message message, List list, int i7, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = messageComponentsAccessory.messageId;
        }
        if ((i10 & 2) != 0) {
            messageMargins = messageComponentsAccessory.margins;
        }
        if ((i10 & 4) != 0) {
            message = messageComponentsAccessory.message;
        }
        if ((i10 & 8) != 0) {
            list = messageComponentsAccessory.messageComponents;
        }
        if ((i10 & 16) != 0) {
            i7 = messageComponentsAccessory.constrainedWidth;
        }
        if ((i10 & 32) != 0) {
            str2 = messageComponentsAccessory.embedId;
        }
        int i11 = i7;
        String str3 = str2;
        return messageComponentsAccessory.m664copyLdU2QRA(str, messageMargins, message, list, i11, str3);
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
    public final List<Component> component4() {
        return this.messageComponents;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmbedId() {
        return this.embedId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-LdU2QRA, reason: not valid java name */
    public final MessageComponentsAccessory m664copyLdU2QRA(@NotNull String messageId, @NotNull MessageMargins margins, @NotNull Message message, @NotNull List<? extends Component> messageComponents, int constrainedWidth, String embedId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageComponents, "messageComponents");
        return new MessageComponentsAccessory(messageId, margins, message, messageComponents, constrainedWidth, embedId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComponentsAccessory)) {
            return false;
        }
        MessageComponentsAccessory messageComponentsAccessory = (MessageComponentsAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, messageComponentsAccessory.messageId) && Intrinsics.areEqual(this.margins, messageComponentsAccessory.margins) && Intrinsics.areEqual(this.message, messageComponentsAccessory.message) && Intrinsics.areEqual(this.messageComponents, messageComponentsAccessory.messageComponents) && this.constrainedWidth == messageComponentsAccessory.constrainedWidth && Intrinsics.areEqual(this.embedId, messageComponentsAccessory.embedId);
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final String getEmbedId() {
        return this.embedId;
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
    public final List<Component> getMessageComponents() {
        return this.messageComponents;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        int iU = a.u(this.constrainedWidth, e.f(this.messageComponents, (this.message.hashCode() + ((this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31)) * 31, 31), 31);
        String str = this.embedId;
        return iU + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessageComponentsAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", margins=" + this.margins + ", message=" + this.message + ", messageComponents=" + this.messageComponents + ", constrainedWidth=" + this.constrainedWidth + ", embedId=" + this.embedId + ")";
    }

    public /* synthetic */ MessageComponentsAccessory(String str, MessageMargins messageMargins, Message message, List list, int i7, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, message, list, i7, (i10 & 32) != 0 ? null : str2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private MessageComponentsAccessory(String messageId, MessageMargins margins, Message message, List<? extends Component> messageComponents, int i7, String str) {
        super(messageId, "bot component", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageComponents, "messageComponents");
        this.messageId = messageId;
        this.margins = margins;
        this.message = message;
        this.messageComponents = messageComponents;
        this.constrainedWidth = i7;
        this.embedId = str;
    }
}
