package com.discord.chat.presentation.list.delegate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.BaseChatListAdapter;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem;
import com.discord.chat.presentation.message.ErrorMessageView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/DeserializationErrorMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;", "Lcom/discord/chat/presentation/message/ErrorMessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "isForItem", "", "item", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "", "view", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeserializationErrorMessageDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializationErrorMessageDelegate.kt\ncom/discord/chat/presentation/list/delegate/DeserializationErrorMessageDelegate\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n176#2,2:54\n1573#3:56\n1604#3,4:57\n*S KotlinDebug\n*F\n+ 1 DeserializationErrorMessageDelegate.kt\ncom/discord/chat/presentation/list/delegate/DeserializationErrorMessageDelegate\n*L\n19#1:54,2\n40#1:56\n40#1:57,4\n*E\n"})
public final class DeserializationErrorMessageDelegate extends BaseChatListItemDelegate<DeserializationErrorMessageItem, ErrorMessageView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationErrorMessageDelegate(@NotNull Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(BaseChatListItemDelegate.Metadata metadata, DeserializationErrorMessageItem deserializationErrorMessageItem, boolean z5) {
        RecyclerView.Adapter bindingAdapter = metadata.getHolder().getBindingAdapter();
        Intrinsics.checkNotNull(bindingAdapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.BaseChatListAdapter");
        BaseChatListAdapter baseChatListAdapter = (BaseChatListAdapter) bindingAdapter;
        int bindingAdapterPosition = metadata.getHolder().getBindingAdapterPosition();
        DeserializationErrorMessageItem deserializationErrorMessageItem2 = new DeserializationErrorMessageItem(deserializationErrorMessageItem.getMessage(), z5);
        Object items = baseChatListAdapter.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        Iterable iterable = (Iterable) items;
        ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
        int i7 = 0;
        for (Object obj : iterable) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            ChatListItem chatListItem = (ChatListItem) obj;
            if (i7 == bindingAdapterPosition) {
                chatListItem = deserializationErrorMessageItem2;
            }
            arrayList.add(chatListItem);
            i7 = i10;
        }
        baseChatListAdapter.setItems(arrayList);
        baseChatListAdapter.notifyItemChanged(bindingAdapterPosition);
        return Unit.f14616a;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public /* bridge */ /* synthetic */ void bindView(View view, ChatListItem chatListItem, BaseChatListItemDelegate.Metadata metadata) {
        bindView((ErrorMessageView) view, (DeserializationErrorMessageItem) chatListItem, (BaseChatListItemDelegate.Metadata<ErrorMessageView>) metadata);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(@NotNull ChatListItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof DeserializationErrorMessageItem;
    }

    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull ErrorMessageView view, @NotNull DeserializationErrorMessageItem item, @NotNull BaseChatListItemDelegate.Metadata<ErrorMessageView> metadata) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(SizeUtilsKt.getDpToPx(16), 0, SizeUtilsKt.getDpToPx(16), 0);
        view.setErrorMessage(item.getMessage());
        view.setExpandInfo(item.isExpanded(), new b7.a(5, metadata, item));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    @NotNull
    public ErrorMessageView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ErrorMessageView errorMessageView = new ErrorMessageView(context, null, 2, 0 == true ? 1 : 0);
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        errorMessageView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        return errorMessageView;
    }
}
