package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.CallSystemMessageItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.system.CallSystemMessageView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;", "Lcom/discord/chat/presentation/message/system/CallSystemMessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "isForItem", "", "item", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "", "view", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createAndBindStandaloneView", "message", "Lcom/discord/chat/bridge/Message;", "bindViewInternal", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCallSystemMessageDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageDelegate.kt\ncom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n327#2,4:47\n*S KotlinDebug\n*F\n+ 1 CallSystemMessageDelegate.kt\ncom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate\n*L\n38#1:47,4\n*E\n"})
public final class CallSystemMessageDelegate extends BaseChatListItemDelegate<CallSystemMessageItem, CallSystemMessageView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
    }

    private final void bindViewInternal(CallSystemMessageView view, CallSystemMessageItem item) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = SizeUtilsKt.getDpToPx(12);
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = SizeUtilsKt.getDpToPx(12);
        view.setLayoutParams(layoutParams2);
        view.setMessage(item.getMessage(), getEventHandler());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public /* bridge */ /* synthetic */ void bindView(View view, ChatListItem chatListItem, BaseChatListItemDelegate.Metadata metadata) {
        bindView((CallSystemMessageView) view, (CallSystemMessageItem) chatListItem, (BaseChatListItemDelegate.Metadata<CallSystemMessageView>) metadata);
    }

    @NotNull
    public final CallSystemMessageView createAndBindStandaloneView(@NotNull ViewGroup parent, @NotNull Message message) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(message, "message");
        CallSystemMessageView callSystemMessageViewCreateView = createView(parent);
        bindViewInternal(callSystemMessageViewCreateView, new CallSystemMessageItem(message));
        return callSystemMessageViewCreateView;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(@NotNull ChatListItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof CallSystemMessageItem;
    }

    public void bindView(@NotNull CallSystemMessageView view, @NotNull CallSystemMessageItem item, @NotNull BaseChatListItemDelegate.Metadata<CallSystemMessageView> metadata) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        bindViewInternal(view, item);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    @NotNull
    public CallSystemMessageView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new CallSystemMessageView(context, null, 2, null);
    }
}
