package com.discord.chat.presentation.list;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListAdapterUpdateLog;", "", "<init>", "()V", "MAX_SIZE", "", "queue", "", "Lcom/discord/chat/presentation/list/ChatListAdapterUpdateLogItem;", "addChatListItemUpdate", "", "chatListItemUpdate", "Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "addPortalUpdate", "updateType", "Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;", "addPortalRemovalFromChatListItemUpdate", "addNoOpDataSetChanged", "addInternal", "item", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatListAdapterUpdateLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListAdapterUpdateLog.kt\ncom/discord/chat/presentation/list/ChatListAdapterUpdateLog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1833#2,8:100\n*S KotlinDebug\n*F\n+ 1 ChatListAdapterUpdateLog.kt\ncom/discord/chat/presentation/list/ChatListAdapterUpdateLog\n*L\n77#1:100,8\n*E\n"})
public final class ChatListAdapterUpdateLog {
    private static final int MAX_SIZE = 5;

    @NotNull
    public static final ChatListAdapterUpdateLog INSTANCE = new ChatListAdapterUpdateLog();

    @NotNull
    private static final List<ChatListAdapterUpdateLogItem> queue = new ArrayList();

    private ChatListAdapterUpdateLog() {
    }

    private final void addInternal(ChatListAdapterUpdateLogItem item) {
        List<ChatListAdapterUpdateLogItem> list = queue;
        list.add(item);
        if (list.size() > 5) {
            list.remove(0);
        }
    }

    public final void addChatListItemUpdate(@NotNull ChatListItemUpdate chatListItemUpdate) {
        Intrinsics.checkNotNullParameter(chatListItemUpdate, "chatListItemUpdate");
        addInternal(new ChatListAdapterUpdateLogItem.ChatList(chatListItemUpdate));
    }

    public final void addNoOpDataSetChanged() {
        addInternal(ChatListAdapterUpdateLogItem.NoOpDataSetChanged.INSTANCE);
    }

    public final void addPortalRemovalFromChatListItemUpdate() {
        addInternal(ChatListAdapterUpdateLogItem.PortalViewRemovalFromChatListItemUpdate.INSTANCE);
    }

    public final void addPortalUpdate(@NotNull ChannelChatListAdapter.PortalViewUpdateType updateType) {
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        addInternal(new ChatListAdapterUpdateLogItem.PortalView(updateType));
    }

    @NotNull
    public String toString() {
        List<ChatListAdapterUpdateLogItem> list = queue;
        if (list.isEmpty()) {
            return "ChatListAdapterUpdateLog: No Chat Updates Processed";
        }
        String str = "";
        if (!list.isEmpty()) {
            ListIterator<ChatListAdapterUpdateLogItem> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                str = str + listIterator.previous() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
        }
        return "ChatListAdapterUpdateLog: Most Recent Updates (Most Recent at Top)\n" + ((Object) str);
    }
}
