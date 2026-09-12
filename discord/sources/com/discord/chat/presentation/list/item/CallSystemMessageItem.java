package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "<init>", "(Lcom/discord/chat/bridge/Message;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCallSystemMessageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageItem.kt\ncom/discord/chat/presentation/list/item/CallSystemMessageItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
public final /* data */ class CallSystemMessageItem extends ChatListItem {

    @NotNull
    private final Message message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageItem(@NotNull Message message) {
        super(message.m267getId3Eiw7ao(), null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        if (!MessageKt.isCallMessage(message)) {
            throw new IllegalArgumentException("Only \"call\" system messages are allowed");
        }
    }

    public static /* synthetic */ CallSystemMessageItem copy$default(CallSystemMessageItem callSystemMessageItem, Message message, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            message = callSystemMessageItem.message;
        }
        return callSystemMessageItem.copy(message);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    public final CallSystemMessageItem copy(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new CallSystemMessageItem(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CallSystemMessageItem) && Intrinsics.areEqual(this.message, ((CallSystemMessageItem) other).message);
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "CallSystemMessageItem(message=" + this.message + ")";
    }
}
