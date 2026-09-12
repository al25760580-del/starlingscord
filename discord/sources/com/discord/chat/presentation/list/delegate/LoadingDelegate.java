package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.bridge.row.LoadMoreButton;
import com.discord.chat.bridge.row.LoadingActionType;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.LoadingChatListItem;
import com.discord.chat.presentation.loading.ChatLoadingView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/LoadingDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/LoadingChatListItem;", "Lcom/discord/chat/presentation/loading/ChatLoadingView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "isForItem", "", "item", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "", "view", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadingDelegate extends BaseChatListItemDelegate<LoadingChatListItem, ChatLoadingView> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingActionType.values().length];
            try {
                iArr[LoadingActionType.LOAD_MORE_BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingActionType.LOAD_MORE_AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.list.delegate.LoadingDelegate$bindView$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ChatEventHandler.class, "onTapLoadMessagesBefore", "onTapLoadMessagesBefore()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m530invoke();
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m530invoke() {
            ((ChatEventHandler) this.receiver).onTapLoadMessagesBefore();
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.list.delegate.LoadingDelegate$bindView$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, ChatEventHandler.class, "onTapLoadMessagesAfter", "onTapLoadMessagesAfter()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m531invoke();
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m531invoke() {
            ((ChatEventHandler) this.receiver).onTapLoadMessagesAfter();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public /* bridge */ /* synthetic */ void bindView(View view, ChatListItem chatListItem, BaseChatListItemDelegate.Metadata metadata) {
        bindView((ChatLoadingView) view, (LoadingChatListItem) chatListItem, (BaseChatListItemDelegate.Metadata<ChatLoadingView>) metadata);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(@NotNull ChatListItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof LoadingChatListItem;
    }

    public void bindView(@NotNull ChatLoadingView view, @NotNull LoadingChatListItem item, @NotNull BaseChatListItemDelegate.Metadata<ChatLoadingView> metadata) {
        Function0<Unit> anonymousClass1;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (item.isLoading()) {
            view.showProgress();
            return;
        }
        LoadMoreButton button = item.getButton();
        int color = item.getColor();
        int i7 = WhenMappings.$EnumSwitchMapping$0[item.getButton().getAction().getType().ordinal()];
        if (i7 == 1) {
            anonymousClass1 = new AnonymousClass1(getEventHandler());
        } else {
            if (i7 != 2) {
                throw new n();
            }
            anonymousClass1 = new AnonymousClass2(getEventHandler());
        }
        view.showButton(button, color, anonymousClass1);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    @NotNull
    public ChatLoadingView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ChatLoadingView(context, null, 2, null);
    }
}
