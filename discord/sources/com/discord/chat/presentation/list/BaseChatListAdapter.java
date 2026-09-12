package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.facebook.react.uimanager.ViewProps;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B+\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R?\u0010&\u001a*\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0006\b\u0001\u0012\u00020$0#0\"\u0012\u0004\u0012\u00020\u00150!j\u0002`%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/c;", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/presentation/list/ChatListAdapter;", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "eventHandlerProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageComponentProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "fillAdapter", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getChatListItems", "()Ljava/util/List;", "", ViewProps.POSITION, "getChatListItem", "(I)Lcom/discord/chat/presentation/list/item/ChatListItem;", "", "getItemId", "(I)J", "chatListItems", "Ljava/util/List;", "getChatListItems$chat_release", "setChatListItems$chat_release", "(Ljava/util/List;)V", "", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Landroid/view/View;", "Lcom/discord/chat/presentation/list/DelegateViewTypes;", "delegateViewTypes", "Ljava/util/Map;", "getDelegateViewTypes", "()Ljava/util/Map;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseChatListAdapter extends com.hannesdorfmann.adapterdelegates4.c implements ChatListAdapter {

    @NotNull
    private List<? extends ChatListItem> chatListItems;

    @NotNull
    private final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> delegateViewTypes;

    public BaseChatListAdapter(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider, @NotNull Function0<ComponentProvider> messageComponentProvider) {
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
        Intrinsics.checkNotNullParameter(messageComponentProvider, "messageComponentProvider");
        this.chatListItems = n0.f14659d;
        AdapterDelegatesManager delegatesManager = this.delegatesManager;
        Intrinsics.checkNotNullExpressionValue(delegatesManager, "delegatesManager");
        this.delegateViewTypes = ChatListAdapterConfiguratorKt.chatListAdapterConfigurator(delegatesManager, eventHandlerProvider, messageComponentProvider, SharedRecycledViewPools.INSTANCE.getAccessoriesViewPool());
        setHasStableIds(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fillAdapter(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        SharedRecycledViewPools sharedRecycledViewPools = SharedRecycledViewPools.INSTANCE;
        sharedRecycledViewPools.configureChatListViewPoolSizes(this.delegateViewTypes);
        ChatListViewFactoryKt.fillChatList(recyclerView, this, this.delegateViewTypes, sharedRecycledViewPools.getChatListViewPool());
        ChatListViewFactoryKt.fillAccessories(recyclerView, new MessageAccessoriesAdapter(null, 1, 0 == true ? 1 : 0), sharedRecycledViewPools.getAccessoriesViewPool());
    }

    @Override // com.discord.chat.presentation.list.ChatListAdapter
    public ChatListItem getChatListItem(int position) {
        return (ChatListItem) CollectionsKt.M(position, this.chatListItems);
    }

    @Override // com.discord.chat.presentation.list.ChatListAdapter
    @NotNull
    public List<ChatListItem> getChatListItems() {
        Object items = this.items;
        Intrinsics.checkNotNullExpressionValue(items, "items");
        return (List) items;
    }

    @NotNull
    public final List<ChatListItem> getChatListItems$chat_release() {
        return this.chatListItems;
    }

    @NotNull
    public final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> getDelegateViewTypes() {
        return this.delegateViewTypes;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return ((ChatListItem) ((List) this.items).get(position)).getRecyclerItemId();
    }

    public final void setChatListItems$chat_release(@NotNull List<? extends ChatListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.chatListItems = list;
    }
}
