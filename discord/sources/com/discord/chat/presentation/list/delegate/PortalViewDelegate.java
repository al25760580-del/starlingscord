package com.discord.chat.presentation.list.delegate;

import a1.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListFrameLayout;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import com.discord.portals.utils.ViewRemoveFromParentKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/PortalViewDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "Lcom/discord/chat/presentation/list/ChatListFrameLayout;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "isForItem", "", "item", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "", "view", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPortalViewDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PortalViewDelegate.kt\ncom/discord/chat/presentation/list/delegate/PortalViewDelegate\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,62:1\n257#2,2:63\n327#2,4:65\n*S KotlinDebug\n*F\n+ 1 PortalViewDelegate.kt\ncom/discord/chat/presentation/list/delegate/PortalViewDelegate\n*L\n32#1:63,2\n38#1:65,4\n*E\n"})
public final class PortalViewDelegate extends BaseChatListItemDelegate<PortalViewChatListItem, ChatListFrameLayout> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PortalViewDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(PortalViewChatListItem portalViewChatListItem, ChatListFrameLayout chatListFrameLayout) {
        if (portalViewChatListItem.getView().getParent() == null) {
            chatListFrameLayout.addView(portalViewChatListItem.getView());
        }
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public /* bridge */ /* synthetic */ void bindView(View view, ChatListItem chatListItem, BaseChatListItemDelegate.Metadata metadata) {
        bindView((ChatListFrameLayout) view, (PortalViewChatListItem) chatListItem, (BaseChatListItemDelegate.Metadata<ChatListFrameLayout>) metadata);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(@NotNull ChatListItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof PortalViewChatListItem;
    }

    public void bindView(@NotNull ChatListFrameLayout view, @NotNull PortalViewChatListItem item, @NotNull BaseChatListItemDelegate.Metadata<ChatListFrameLayout> metadata) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        item.getView().setVisibility(0);
        ViewRemoveFromParentKt.removeFromParent(item.getView());
        if (item.getMeasuredDimensions() != null) {
            Pair<Integer, Integer> measuredDimensions = item.getMeasuredDimensions();
            int iIntValue = ((Number) measuredDimensions.f14612d).intValue();
            int iIntValue2 = ((Number) measuredDimensions.f14613e).intValue();
            View view2 = item.getView();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            view2.setLayoutParams(layoutParams);
        }
        view.removeAllViews();
        if (item.getView().getParent() == null) {
            view.addView(item.getView());
        } else {
            view.post(new k(10, item, view));
        }
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    @NotNull
    public ChatListFrameLayout createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ChatListFrameLayout(context, null, 2, null);
    }
}
