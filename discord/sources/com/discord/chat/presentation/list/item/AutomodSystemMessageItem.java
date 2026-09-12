package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "allowChildGestures", "", "<init>", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Z)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "getAllowChildGestures", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutomodSystemMessageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomodSystemMessageItem.kt\ncom/discord/chat/presentation/list/item/AutomodSystemMessageItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final /* data */ class AutomodSystemMessageItem extends ChatListItem {
    private final boolean allowChildGestures;

    @NotNull
    private final Message message;

    @NotNull
    private final MessageContext messageContext;

    public /* synthetic */ AutomodSystemMessageItem(Message message, MessageContext messageContext, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, (i7 & 2) != 0 ? new MessageContext(false, false, null, null, false, null, false, false, false, false, null, null, null, 8191, null) : messageContext, (i7 & 4) != 0 ? true : z5);
    }

    public static /* synthetic */ AutomodSystemMessageItem copy$default(AutomodSystemMessageItem automodSystemMessageItem, Message message, MessageContext messageContext, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            message = automodSystemMessageItem.message;
        }
        if ((i7 & 2) != 0) {
            messageContext = automodSystemMessageItem.messageContext;
        }
        if ((i7 & 4) != 0) {
            z5 = automodSystemMessageItem.allowChildGestures;
        }
        return automodSystemMessageItem.copy(message, messageContext, z5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAllowChildGestures() {
        return this.allowChildGestures;
    }

    @NotNull
    public final AutomodSystemMessageItem copy(@NotNull Message message, @NotNull MessageContext messageContext, boolean allowChildGestures) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        return new AutomodSystemMessageItem(message, messageContext, allowChildGestures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutomodSystemMessageItem)) {
            return false;
        }
        AutomodSystemMessageItem automodSystemMessageItem = (AutomodSystemMessageItem) other;
        return Intrinsics.areEqual(this.message, automodSystemMessageItem.message) && Intrinsics.areEqual(this.messageContext, automodSystemMessageItem.messageContext) && this.allowChildGestures == automodSystemMessageItem.allowChildGestures;
    }

    public final boolean getAllowChildGestures() {
        return this.allowChildGestures;
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    public int hashCode() {
        return Boolean.hashCode(this.allowChildGestures) + ((this.messageContext.hashCode() + (this.message.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Message message = this.message;
        MessageContext messageContext = this.messageContext;
        boolean z5 = this.allowChildGestures;
        StringBuilder sb2 = new StringBuilder("AutomodSystemMessageItem(message=");
        sb2.append(message);
        sb2.append(", messageContext=");
        sb2.append(messageContext);
        sb2.append(", allowChildGestures=");
        return a.m(sb2, z5, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageItem(@NotNull Message message, @NotNull MessageContext messageContext, boolean z5) {
        super(MessageId.m1163toStringimpl(message.m267getId3Eiw7ao()), null);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        this.message = message;
        this.messageContext = messageContext;
        this.allowChildGestures = z5;
        if (!MessageKt.isAutomodSystemMessage(message)) {
            throw new IllegalArgumentException("Only automod system messages are allowed");
        }
    }
}
