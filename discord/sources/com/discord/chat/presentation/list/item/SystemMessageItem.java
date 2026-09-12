package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.presentation.root.MessageContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/list/item/SystemMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "<init>", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "getBackgroundHighlight", "()Lcom/discord/chat/bridge/BackgroundHighlight;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemMessageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemMessageItem.kt\ncom/discord/chat/presentation/list/item/SystemMessageItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final /* data */ class SystemMessageItem extends ChatListItem {
    private final BackgroundHighlight backgroundHighlight;

    @NotNull
    private final Message message;

    @NotNull
    private final MessageContext messageContext;

    public /* synthetic */ SystemMessageItem(Message message, MessageContext messageContext, BackgroundHighlight backgroundHighlight, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, messageContext, (i7 & 4) != 0 ? null : backgroundHighlight);
    }

    public static /* synthetic */ SystemMessageItem copy$default(SystemMessageItem systemMessageItem, Message message, MessageContext messageContext, BackgroundHighlight backgroundHighlight, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            message = systemMessageItem.message;
        }
        if ((i7 & 2) != 0) {
            messageContext = systemMessageItem.messageContext;
        }
        if ((i7 & 4) != 0) {
            backgroundHighlight = systemMessageItem.backgroundHighlight;
        }
        return systemMessageItem.copy(message, messageContext, backgroundHighlight);
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
    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
    }

    @NotNull
    public final SystemMessageItem copy(@NotNull Message message, @NotNull MessageContext messageContext, BackgroundHighlight backgroundHighlight) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        return new SystemMessageItem(message, messageContext, backgroundHighlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemMessageItem)) {
            return false;
        }
        SystemMessageItem systemMessageItem = (SystemMessageItem) other;
        return Intrinsics.areEqual(this.message, systemMessageItem.message) && Intrinsics.areEqual(this.messageContext, systemMessageItem.messageContext) && Intrinsics.areEqual(this.backgroundHighlight, systemMessageItem.backgroundHighlight);
    }

    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
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
        int iHashCode = (this.messageContext.hashCode() + (this.message.hashCode() * 31)) * 31;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        return iHashCode + (backgroundHighlight == null ? 0 : backgroundHighlight.hashCode());
    }

    @NotNull
    public String toString() {
        return "SystemMessageItem(message=" + this.message + ", messageContext=" + this.messageContext + ", backgroundHighlight=" + this.backgroundHighlight + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemMessageItem(@NotNull Message message, @NotNull MessageContext messageContext, BackgroundHighlight backgroundHighlight) {
        super(message.m267getId3Eiw7ao(), null);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        this.message = message;
        this.messageContext = messageContext;
        this.backgroundHighlight = backgroundHighlight;
        if (!MessageKt.isSystemMessage(message)) {
            throw new IllegalArgumentException("Only system messages are allowed");
        }
    }
}
