package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ListOperation;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u000fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u001a\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0019R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u0010\u001d¨\u00063"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", AlertFragment.ARG_ITEMS, "Lcom/discord/chat/listmanager/ListOperation;", "listOperations", "Lcom/discord/chat/listmanager/ChatListAction;", "chatListAction", "", "updateId", "Lkotlin/Function1;", "", "", "preCommit", "Lkotlin/Function0;", "postCommit", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/discord/chat/listmanager/ChatListAction;", "component4", "()I", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getListOperations", "Lcom/discord/chat/listmanager/ChatListAction;", "getChatListAction", "I", "getUpdateId", "Lkotlin/jvm/functions/Function1;", "getPreCommit", "Lkotlin/jvm/functions/Function0;", "getPostCommit", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChatListItemUpdate extends ChannelChatListAdapterUpdate {
    private final ChatListAction chatListAction;

    @NotNull
    private final List<ChatListItem> items;
    private final List<ListOperation> listOperations;

    @NotNull
    private final Function0<Unit> postCommit;

    @NotNull
    private final Function1<Boolean, Unit> preCommit;
    private final int updateId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatListItemUpdate(@NotNull List<? extends ChatListItem> items, List<? extends ListOperation> list, ChatListAction chatListAction, int i7, @NotNull Function1<? super Boolean, Unit> preCommit, @NotNull Function0<Unit> postCommit) {
        super(i7, preCommit, postCommit, null);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(preCommit, "preCommit");
        Intrinsics.checkNotNullParameter(postCommit, "postCommit");
        this.items = items;
        this.listOperations = list;
        this.chatListAction = chatListAction;
        this.updateId = i7;
        this.preCommit = preCommit;
        this.postCommit = postCommit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatListItemUpdate copy$default(ChatListItemUpdate chatListItemUpdate, List list, List list2, ChatListAction chatListAction, int i7, Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = chatListItemUpdate.items;
        }
        if ((i10 & 2) != 0) {
            list2 = chatListItemUpdate.listOperations;
        }
        if ((i10 & 4) != 0) {
            chatListAction = chatListItemUpdate.chatListAction;
        }
        if ((i10 & 8) != 0) {
            i7 = chatListItemUpdate.updateId;
        }
        if ((i10 & 16) != 0) {
            function1 = chatListItemUpdate.preCommit;
        }
        if ((i10 & 32) != 0) {
            function0 = chatListItemUpdate.postCommit;
        }
        Function1 function2 = function1;
        Function0 function3 = function0;
        return chatListItemUpdate.copy(list, list2, chatListAction, i7, function2, function3);
    }

    @NotNull
    public final List<ChatListItem> component1() {
        return this.items;
    }

    public final List<ListOperation> component2() {
        return this.listOperations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatListAction getChatListAction() {
        return this.chatListAction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUpdateId() {
        return this.updateId;
    }

    @NotNull
    public final Function1<Boolean, Unit> component5() {
        return this.preCommit;
    }

    @NotNull
    public final Function0<Unit> component6() {
        return this.postCommit;
    }

    @NotNull
    public final ChatListItemUpdate copy(@NotNull List<? extends ChatListItem> items, List<? extends ListOperation> listOperations, ChatListAction chatListAction, int updateId, @NotNull Function1<? super Boolean, Unit> preCommit, @NotNull Function0<Unit> postCommit) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(preCommit, "preCommit");
        Intrinsics.checkNotNullParameter(postCommit, "postCommit");
        return new ChatListItemUpdate(items, listOperations, chatListAction, updateId, preCommit, postCommit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListItemUpdate)) {
            return false;
        }
        ChatListItemUpdate chatListItemUpdate = (ChatListItemUpdate) other;
        return Intrinsics.areEqual(this.items, chatListItemUpdate.items) && Intrinsics.areEqual(this.listOperations, chatListItemUpdate.listOperations) && Intrinsics.areEqual(this.chatListAction, chatListItemUpdate.chatListAction) && this.updateId == chatListItemUpdate.updateId && Intrinsics.areEqual(this.preCommit, chatListItemUpdate.preCommit) && Intrinsics.areEqual(this.postCommit, chatListItemUpdate.postCommit);
    }

    public final ChatListAction getChatListAction() {
        return this.chatListAction;
    }

    @NotNull
    public final List<ChatListItem> getItems() {
        return this.items;
    }

    public final List<ListOperation> getListOperations() {
        return this.listOperations;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    @NotNull
    public Function0<Unit> getPostCommit() {
        return this.postCommit;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    @NotNull
    public Function1<Boolean, Unit> getPreCommit() {
        return this.preCommit;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    public int getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        List<ListOperation> list = this.listOperations;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ChatListAction chatListAction = this.chatListAction;
        return this.postCommit.hashCode() + a3.e.e(a.u(this.updateId, (iHashCode2 + (chatListAction != null ? chatListAction.hashCode() : 0)) * 31, 31), 31, this.preCommit);
    }

    @NotNull
    public String toString() {
        return "ChatListItemUpdate(items=" + this.items + ", listOperations=" + this.listOperations + ", chatListAction=" + this.chatListAction + ", updateId=" + this.updateId + ", preCommit=" + this.preCommit + ", postCommit=" + this.postCommit + ")";
    }
}
