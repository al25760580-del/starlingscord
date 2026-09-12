package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ListOperation;
import kotlin.Metadata;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"label", "", "Lcom/discord/chat/listmanager/ChatListAction;", "Lcom/discord/chat/listmanager/ListOperation;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ChatListAdapterUpdateLogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String label(ChatListAction chatListAction) {
        if (chatListAction instanceof ChatListAction.Clear) {
            return "Clear";
        }
        if (chatListAction instanceof ChatListAction.Noop) {
            return "Noop";
        }
        if (chatListAction instanceof ChatListAction.ScrollTo) {
            return "ScrollTo";
        }
        if (chatListAction instanceof ChatListAction.StickToBottomIfAtBottom) {
            return "StickToBottomIfAtBottom";
        }
        throw new n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String label(ListOperation listOperation) {
        if (listOperation instanceof ListOperation.Insert) {
            return s0.g.d(((ListOperation.Insert) listOperation).getIndex(), "INS(", ")");
        }
        if (listOperation instanceof ListOperation.InsertRange) {
            ListOperation.InsertRange insertRange = (ListOperation.InsertRange) listOperation;
            return s0.g.c(insertRange.getFirst(), "IRNG(", insertRange.getLast(), "-", ")");
        }
        if (listOperation instanceof ListOperation.Remove) {
            return s0.g.d(((ListOperation.Remove) listOperation).getIndex(), "REM(", ")");
        }
        if (listOperation instanceof ListOperation.RemoveRange) {
            ListOperation.RemoveRange removeRange = (ListOperation.RemoveRange) listOperation;
            return s0.g.c(removeRange.getFirst(), "RRNG(", removeRange.getLast(), "-", ")");
        }
        if (listOperation instanceof ListOperation.Change) {
            return s0.g.d(((ListOperation.Change) listOperation).getIndex(), "CHA(", ")");
        }
        if (listOperation instanceof ListOperation.ChangeRange) {
            ListOperation.ChangeRange changeRange = (ListOperation.ChangeRange) listOperation;
            return s0.g.c(changeRange.getFirst(), "CRNG(", changeRange.getLast(), "-", ")");
        }
        throw new n();
    }
}
