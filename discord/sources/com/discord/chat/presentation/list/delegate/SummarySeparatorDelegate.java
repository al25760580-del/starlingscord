package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import com.discord.chat.presentation.separator.SummarySeparatorView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/SummarySeparatorDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/separator/SummarySeparatorView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "isForItem", "", "item", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "", "view", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SummarySeparatorDelegate extends BaseChatListItemDelegate<SummarySeparatorChatListItem, SummarySeparatorView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2$lambda$0(SummarySeparatorDelegate summarySeparatorDelegate, SummarySeparatorChatListItem summarySeparatorChatListItem, View view) {
        summarySeparatorDelegate.getEventHandler().mo513onTapSummarysekaTiM(summarySeparatorChatListItem.getSummary().m459getChannelIdo4g7jtM(), summarySeparatorChatListItem.m532getCurrentMsgId3Eiw7ao(), summarySeparatorChatListItem.getSummary().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2$lambda$1(SummarySeparatorDelegate summarySeparatorDelegate, SummarySeparatorChatListItem summarySeparatorChatListItem, View view) {
        summarySeparatorDelegate.getEventHandler().mo514onTapSummaryJumpsekaTiM(summarySeparatorChatListItem.getSummary().m459getChannelIdo4g7jtM(), summarySeparatorChatListItem.m533getJumpToMsgId3Eiw7ao(), summarySeparatorChatListItem.getSummary().getId());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public /* bridge */ /* synthetic */ void bindView(View view, ChatListItem chatListItem, BaseChatListItemDelegate.Metadata metadata) {
        bindView((SummarySeparatorView) view, (SummarySeparatorChatListItem) chatListItem, (BaseChatListItemDelegate.Metadata<SummarySeparatorView>) metadata);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(@NotNull ChatListItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof SummarySeparatorChatListItem;
    }

    public void bindView(@NotNull SummarySeparatorView view, @NotNull final SummarySeparatorChatListItem item, @NotNull BaseChatListItemDelegate.Metadata<SummarySeparatorView> metadata) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        view.setDividerColor(item.getColor());
        view.setText(item.getText());
        view.setIsBeforeContent(item.isBeforeContent());
        final int i7 = 0;
        view.setMoreActionsHandler(new View.OnClickListener(this) { // from class: com.discord.chat.presentation.list.delegate.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SummarySeparatorDelegate f4098e;

            {
                this.f4098e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        SummarySeparatorDelegate.bindView$lambda$2$lambda$0(this.f4098e, item, view2);
                        break;
                    default:
                        SummarySeparatorDelegate.bindView$lambda$2$lambda$1(this.f4098e, item, view2);
                        break;
                }
            }
        });
        final int i10 = 1;
        view.setJumpToBottomHandler(new View.OnClickListener(this) { // from class: com.discord.chat.presentation.list.delegate.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SummarySeparatorDelegate f4098e;

            {
                this.f4098e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        SummarySeparatorDelegate.bindView$lambda$2$lambda$0(this.f4098e, item, view2);
                        break;
                    default:
                        SummarySeparatorDelegate.bindView$lambda$2$lambda$1(this.f4098e, item, view2);
                        break;
                }
            }
        });
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    @NotNull
    public SummarySeparatorView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SummarySeparatorView(context, null, 2, null);
    }
}
