package com.discord.chat.bridge.row;

import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSeparatorChatListItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SeparatorRowKt {
    @NotNull
    public static final ChatListItem toSeparatorChatListItem(@NotNull SeparatorRow separatorRow) {
        Intrinsics.checkNotNullParameter(separatorRow, "<this>");
        if (separatorRow.getSummary() == null) {
            return new SeparatorChatListItem(separatorRow.getColor(), separatorRow.getBorderColor(), separatorRow.getText());
        }
        return new SummarySeparatorChatListItem(separatorRow.getColor(), separatorRow.getSummary(), Intrinsics.areEqual(separatorRow.isBeforeContent(), Boolean.TRUE));
    }
}
