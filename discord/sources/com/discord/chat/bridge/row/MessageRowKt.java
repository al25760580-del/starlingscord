package com.discord.chat.bridge.row;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.presentation.list.item.AutomodSystemMessageItem;
import com.discord.chat.presentation.list.item.CallSystemMessageItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.SystemMessageItem;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"toChatListMessageItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/bridge/row/MessageRow;", "Lcom/discord/chat/bridge/MessageBase;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "allowChildGestures", "", "renderContentOnly", "reactTag", "", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/presentation/root/MessageContext;ZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/ChatListItem;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessageRowKt {
    @NotNull
    public static final ChatListItem toChatListMessageItem(@NotNull MessageRow messageRow) {
        Intrinsics.checkNotNullParameter(messageRow, "<this>");
        return toChatListMessageItem$default(messageRow.getMessage(), MessageContextKt.getMessageContext(messageRow), false, messageRow.getRenderContentOnly(), messageRow.getReactTag(), messageRow.getBackgroundHighlight(), 2, null);
    }

    public static /* synthetic */ ChatListItem toChatListMessageItem$default(MessageBase messageBase, MessageContext messageContext, boolean z5, boolean z6, Integer num, BackgroundHighlight backgroundHighlight, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = true;
        }
        boolean z7 = z5;
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return toChatListMessageItem(messageBase, messageContext, z7, z6, (i7 & 8) != 0 ? null : num, (i7 & 16) != 0 ? null : backgroundHighlight);
    }

    @NotNull
    public static final ChatListItem toChatListMessageItem(@NotNull MessageBase messageBase, @NotNull MessageContext messageContext, boolean z5, boolean z6, Integer num, BackgroundHighlight backgroundHighlight) {
        Intrinsics.checkNotNullParameter(messageBase, "<this>");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        if (messageBase instanceof Message) {
            Message message = (Message) messageBase;
            if (MessageKt.isSystemMessage(message)) {
                return MessageKt.isCallMessage(message) ? new CallSystemMessageItem(message) : new SystemMessageItem(message, messageContext, backgroundHighlight);
            }
            return MessageKt.isAutomodSystemMessage(message) ? new AutomodSystemMessageItem(message, messageContext, z5) : new MessageItem(message, messageContext, z5, backgroundHighlight, num, z6);
        }
        if (messageBase instanceof ErrorMessage) {
            return new DeserializationErrorMessageItem((ErrorMessage) messageBase, false, 2, null);
        }
        throw new n();
    }
}
