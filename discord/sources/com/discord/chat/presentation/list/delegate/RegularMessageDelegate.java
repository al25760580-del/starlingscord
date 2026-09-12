package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListAdapter;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J&\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0016J\u001e\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0002R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "Lcom/discord/chat/presentation/message/MessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "componentProvider", "getComponentProvider", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "isForItem", "", "item", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "createView", "parent", "Landroid/view/ViewGroup;", "onViewRecycled", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bindView", "view", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "getChainPart", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegularMessageDelegate extends BaseChatListItemDelegate<MessageItem, MessageView> {

    @NotNull
    private final RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool;

    @NotNull
    private final Function0<ComponentProvider> messageComponentProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RegularMessageDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider, @NotNull Function0<ComponentProvider> messageComponentProvider, @NotNull RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool) {
        super(eventHandlerProvider, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
        Intrinsics.checkNotNullParameter(messageComponentProvider, "messageComponentProvider");
        Intrinsics.checkNotNullParameter(messageAccessoriesRecycledViewPool, "messageAccessoriesRecycledViewPool");
        this.messageComponentProvider = messageComponentProvider;
        this.messageAccessoriesRecycledViewPool = messageAccessoriesRecycledViewPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageView.ChainPart getChainPart(MessageItem item, BaseChatListItemDelegate.Metadata<MessageView> metadata) {
        Object bindingAdapter = metadata.getHolder().getBindingAdapter();
        Intrinsics.checkNotNull(bindingAdapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
        ChatListItem chatListItem = (ChatListItem) CollectionsKt.M(metadata.getHolder().getBindingAdapterPosition() - 1, ((ChatListAdapter) bindingAdapter).getChatListItems());
        boolean z5 = item.getMessage().getTimestamp() == null;
        boolean z6 = (chatListItem instanceof MessageItem) && ((MessageItem) chatListItem).getMessage().getTimestamp() == null;
        if (z6 && !z5) {
            return MessageView.ChainPart.START;
        }
        if (z6 && z5) {
            return MessageView.ChainPart.MIDDLE;
        }
        return (z6 || !z5) ? MessageView.ChainPart.ONLY : MessageView.ChainPart.END;
    }

    private final ComponentProvider getComponentProvider() {
        return (ComponentProvider) this.messageComponentProvider.invoke();
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public /* bridge */ /* synthetic */ void bindView(View view, ChatListItem chatListItem, BaseChatListItemDelegate.Metadata metadata) {
        bindView((MessageView) view, (MessageItem) chatListItem, (BaseChatListItemDelegate.Metadata<MessageView>) metadata);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(@NotNull ChatListItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof MessageItem;
    }

    @Override // com.hannesdorfmann.adapterdelegates4.b
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageView");
        ((MessageView) view).onRecycledHint();
        super.onViewRecycled(holder);
    }

    public void bindView(@NotNull MessageView view, @NotNull MessageItem item, @NotNull BaseChatListItemDelegate.Metadata<MessageView> metadata) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Message message = item.getMessage();
        ChatEventHandler eventHandler = getEventHandler();
        ComponentProvider componentProvider = getComponentProvider();
        view.setMessage(message, item.getMessageContext(), eventHandler, componentProvider, new c(this, item, metadata, 0), item.getAllowChildGestures(), item.getRenderContentOnly());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    @NotNull
    public MessageView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MessageView messageView = new MessageView(context, null, 2, 0 == true ? 1 : 0);
        messageView.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
        return messageView;
    }
}
