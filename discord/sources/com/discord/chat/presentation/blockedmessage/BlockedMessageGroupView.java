package com.discord.chat.presentation.blockedmessage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.databinding.BlockedMessageGroupViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.BaseChatListAdapter;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J*\u0010\u0015\u001a\u00020\u000f2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u00192\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u001b0\u0017j\u0002`\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/BlockedMessageGroupViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/BlockedMessageGroupViewBinding;", "listAdapter", "Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "bind", "", "item", "Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "setOnToggleHandler", "onClickListener", "Landroid/view/View$OnClickListener;", "setupUI", "eventHandler", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlockedMessageGroupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockedMessageGroupView.kt\ncom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,104:1\n146#2,8:105\n257#2,2:113\n257#2,2:115\n*S KotlinDebug\n*F\n+ 1 BlockedMessageGroupView.kt\ncom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView\n*L\n40#1:105,8\n69#1:113,2\n84#1:115,2\n*E\n"})
public final class BlockedMessageGroupView extends ChatListConstraintLayout {

    @NotNull
    private final BlockedMessageGroupViewBinding binding;
    private BaseChatListAdapter listAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockedMessageGroupView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void bind(@NotNull BlockedGroupChatListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, item.isRevealed() ? item.getBackgroundColor() : 0, SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
        boolean canUncollapse = item.getCanUncollapse();
        SimpleDraweeView closeIcon = this.binding.closeIcon;
        Intrinsics.checkNotNullExpressionValue(closeIcon, "closeIcon");
        closeIcon.setVisibility(!canUncollapse ? 0 : 8);
        if (!canUncollapse) {
            SimpleDraweeView closeIcon2 = this.binding.closeIcon;
            Intrinsics.checkNotNullExpressionValue(closeIcon2, "closeIcon");
            ReactAssetUtilsKt.setReactAsset(closeIcon2, ReactAsset.ChatXIcon);
            SimpleDraweeView closeIcon3 = this.binding.closeIcon;
            Intrinsics.checkNotNullExpressionValue(closeIcon3, "closeIcon");
            ColorUtilsKt.setTintColor(closeIcon3, Integer.valueOf(ThemeManagerKt.getTheme().getTextDefault()));
        }
        this.binding.blockedMessageGroupButton.setText(item.getText());
        if (canUncollapse) {
            TextView blockedMessageGroupButton = this.binding.blockedMessageGroupButton;
            Intrinsics.checkNotNullExpressionValue(blockedMessageGroupButton, "blockedMessageGroupButton");
            DiscordFontUtilsKt.setDiscordFont(blockedMessageGroupButton, DiscordFont.PrimarySemibold);
            this.binding.blockedMessageGroupButton.setTextSize(14.0f);
            this.binding.blockedMessageGroupButton.setTextColor(item.getTextColor());
        } else {
            TextView blockedMessageGroupButton2 = this.binding.blockedMessageGroupButton;
            Intrinsics.checkNotNullExpressionValue(blockedMessageGroupButton2, "blockedMessageGroupButton");
            DiscordFontUtilsKt.setDiscordFont(blockedMessageGroupButton2, DiscordFont.PrimaryNormal);
            this.binding.blockedMessageGroupButton.setTextSize(16.0f);
            this.binding.blockedMessageGroupButton.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        }
        RecyclerView blockedMessages = this.binding.blockedMessages;
        Intrinsics.checkNotNullExpressionValue(blockedMessages, "blockedMessages");
        blockedMessages.setVisibility(item.isRevealed() ? 0 : 8);
        BaseChatListAdapter baseChatListAdapter = this.listAdapter;
        BaseChatListAdapter baseChatListAdapter2 = null;
        if (baseChatListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listAdapter");
            baseChatListAdapter = null;
        }
        baseChatListAdapter.setItems(item.getContent());
        BaseChatListAdapter baseChatListAdapter3 = this.listAdapter;
        if (baseChatListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listAdapter");
        } else {
            baseChatListAdapter2 = baseChatListAdapter3;
        }
        baseChatListAdapter2.notifyDataSetChanged();
    }

    @NotNull
    public final BlockedMessageGroupViewBinding getBinding() {
        return this.binding;
    }

    public final void setOnToggleHandler(View.OnClickListener onClickListener) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onClickListener, 1, null);
    }

    public final void setupUI(@NotNull Function0<? extends ChatEventHandler> eventHandler, @NotNull Function0<ComponentProvider> componentProvider) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        BaseChatListAdapter baseChatListAdapter = new BaseChatListAdapter(eventHandler, componentProvider);
        this.listAdapter = baseChatListAdapter;
        this.binding.blockedMessages.setAdapter(baseChatListAdapter);
    }

    public /* synthetic */ BlockedMessageGroupView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedMessageGroupView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        BlockedMessageGroupViewBinding blockedMessageGroupViewBindingInflate = BlockedMessageGroupViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(blockedMessageGroupViewBindingInflate, "inflate(...)");
        this.binding = blockedMessageGroupViewBindingInflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        setPaddingRelative(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        TextView blockedMessageGroupButton = blockedMessageGroupViewBindingInflate.blockedMessageGroupButton;
        Intrinsics.checkNotNullExpressionValue(blockedMessageGroupButton, "blockedMessageGroupButton");
        DiscordFontUtilsKt.setDiscordFont(blockedMessageGroupButton, DiscordFont.PrimarySemibold);
        RecyclerView recyclerView = blockedMessageGroupViewBindingInflate.blockedMessages;
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new BackgroundHighlightDecoration(context));
        recyclerView.addItemDecoration(new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(16), 0, SizeUtilsKt.getDpToPx(16), true, 2, null));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setReverseLayout(true);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
