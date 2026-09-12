package com.discord.chat.listmanager;

import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017JP\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/discord/chat/listmanager/ChatListUpdate;", "", AlertFragment.ARG_ITEMS, "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "action", "Lcom/discord/chat/listmanager/ChatListAction;", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "changesetUpdateId", "", "forceReload", "", "<init>", "(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;ILjava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "getAction", "()Lcom/discord/chat/listmanager/ChatListAction;", "getListOperations", "getChangesetUpdateId", "()I", "getForceReload", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;ILjava/lang/Boolean;)Lcom/discord/chat/listmanager/ChatListUpdate;", "equals", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChatListUpdate {

    @NotNull
    private final ChatListAction action;
    private final int changesetUpdateId;
    private final Boolean forceReload;

    @NotNull
    private final List<ChatListItem> items;
    private final List<ListOperation> listOperations;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatListUpdate(@NotNull List<? extends ChatListItem> items, @NotNull ChatListAction action, List<? extends ListOperation> list, int i7, Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(action, "action");
        this.items = items;
        this.action = action;
        this.listOperations = list;
        this.changesetUpdateId = i7;
        this.forceReload = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatListUpdate copy$default(ChatListUpdate chatListUpdate, List list, ChatListAction chatListAction, List list2, int i7, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = chatListUpdate.items;
        }
        if ((i10 & 2) != 0) {
            chatListAction = chatListUpdate.action;
        }
        if ((i10 & 4) != 0) {
            list2 = chatListUpdate.listOperations;
        }
        if ((i10 & 8) != 0) {
            i7 = chatListUpdate.changesetUpdateId;
        }
        if ((i10 & 16) != 0) {
            bool = chatListUpdate.forceReload;
        }
        Boolean bool2 = bool;
        List list3 = list2;
        return chatListUpdate.copy(list, chatListAction, list3, i7, bool2);
    }

    @NotNull
    public final List<ChatListItem> component1() {
        return this.items;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatListAction getAction() {
        return this.action;
    }

    public final List<ListOperation> component3() {
        return this.listOperations;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChangesetUpdateId() {
        return this.changesetUpdateId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getForceReload() {
        return this.forceReload;
    }

    @NotNull
    public final ChatListUpdate copy(@NotNull List<? extends ChatListItem> items, @NotNull ChatListAction action, List<? extends ListOperation> listOperations, int changesetUpdateId, Boolean forceReload) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ChatListUpdate(items, action, listOperations, changesetUpdateId, forceReload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListUpdate)) {
            return false;
        }
        ChatListUpdate chatListUpdate = (ChatListUpdate) other;
        return Intrinsics.areEqual(this.items, chatListUpdate.items) && Intrinsics.areEqual(this.action, chatListUpdate.action) && Intrinsics.areEqual(this.listOperations, chatListUpdate.listOperations) && this.changesetUpdateId == chatListUpdate.changesetUpdateId && Intrinsics.areEqual(this.forceReload, chatListUpdate.forceReload);
    }

    @NotNull
    public final ChatListAction getAction() {
        return this.action;
    }

    public final int getChangesetUpdateId() {
        return this.changesetUpdateId;
    }

    public final Boolean getForceReload() {
        return this.forceReload;
    }

    @NotNull
    public final List<ChatListItem> getItems() {
        return this.items;
    }

    public final List<ListOperation> getListOperations() {
        return this.listOperations;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + (this.items.hashCode() * 31)) * 31;
        List<ListOperation> list = this.listOperations;
        int iU = a.u(this.changesetUpdateId, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        Boolean bool = this.forceReload;
        return iU + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatListUpdate(items=" + this.items + ", action=" + this.action + ", listOperations=" + this.listOperations + ", changesetUpdateId=" + this.changesetUpdateId + ", forceReload=" + this.forceReload + ")";
    }

    public /* synthetic */ ChatListUpdate(List list, ChatListAction chatListAction, List list2, int i7, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, chatListAction, list2, i7, (i10 & 16) != 0 ? null : bool);
    }
}
