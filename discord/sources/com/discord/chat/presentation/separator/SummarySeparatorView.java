package com.discord.chat.presentation.separator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.SeparatorSummaryViewBinding;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.chat.presentation.list.delegate.b;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/separator/SummarySeparatorView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SeparatorSummaryViewBinding;", "setDividerColor", "", ViewProps.COLOR, "", "setIsBeforeContent", "isBeforeContent", "", "setText", "text", "", "setJumpToBottomHandler", "onJumpToBottom", "Landroid/view/View$OnClickListener;", "setMoreActionsHandler", "onMoreActions", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSummarySeparatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummarySeparatorView.kt\ncom/discord/chat/presentation/separator/SummarySeparatorView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n146#2,8:114\n255#2:122\n255#2:123\n*S KotlinDebug\n*F\n+ 1 SummarySeparatorView.kt\ncom/discord/chat/presentation/separator/SummarySeparatorView\n*L\n34#1:114,8\n57#1:122\n59#1:123\n*E\n"})
public final class SummarySeparatorView extends ChatListConstraintLayout {

    @NotNull
    private final SeparatorSummaryViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SummarySeparatorView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(SeparatorSummaryViewBinding separatorSummaryViewBinding, View view) {
        SimpleDraweeView jumpButton = separatorSummaryViewBinding.jumpButton;
        Intrinsics.checkNotNullExpressionValue(jumpButton, "jumpButton");
        if (jumpButton.getVisibility() == 0) {
            separatorSummaryViewBinding.jumpButton.performClick();
            return;
        }
        SimpleDraweeView moreButton = separatorSummaryViewBinding.moreButton;
        Intrinsics.checkNotNullExpressionValue(moreButton, "moreButton");
        if (moreButton.getVisibility() == 0) {
            separatorSummaryViewBinding.moreButton.performClick();
        }
    }

    public final void setDividerColor(int color) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        SimpleDraweeView indicatorTop = separatorSummaryViewBinding.indicatorTop;
        Intrinsics.checkNotNullExpressionValue(indicatorTop, "indicatorTop");
        ColorUtilsKt.setTintColor(indicatorTop, Integer.valueOf(color));
        SimpleDraweeView indicatorBottom = separatorSummaryViewBinding.indicatorBottom;
        Intrinsics.checkNotNullExpressionValue(indicatorBottom, "indicatorBottom");
        ColorUtilsKt.setTintColor(indicatorBottom, Integer.valueOf(color));
        separatorSummaryViewBinding.rightBar.setBackgroundColor(color);
        SimpleDraweeView icon = separatorSummaryViewBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ColorUtilsKt.setTintColor(icon, Integer.valueOf(color));
        separatorSummaryViewBinding.middleText.setTextColor(color);
    }

    public final void setIsBeforeContent(boolean isBeforeContent) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        if (isBeforeContent) {
            separatorSummaryViewBinding.indicatorTop.setVisibility(0);
            separatorSummaryViewBinding.indicatorBottom.setVisibility(8);
            separatorSummaryViewBinding.jumpButton.setVisibility(0);
            separatorSummaryViewBinding.moreButton.setVisibility(8);
            separatorSummaryViewBinding.topGuideline.setGuidelineBegin(SizeUtilsKt.getDpToPx(4));
            separatorSummaryViewBinding.bottomGuideline.setGuidelineEnd(0);
            return;
        }
        separatorSummaryViewBinding.indicatorTop.setVisibility(8);
        separatorSummaryViewBinding.indicatorBottom.setVisibility(0);
        separatorSummaryViewBinding.jumpButton.setVisibility(8);
        separatorSummaryViewBinding.moreButton.setVisibility(0);
        separatorSummaryViewBinding.topGuideline.setGuidelineBegin(0);
        separatorSummaryViewBinding.bottomGuideline.setGuidelineEnd(SizeUtilsKt.getDpToPx(4));
    }

    public final void setJumpToBottomHandler(@NotNull View.OnClickListener onJumpToBottom) {
        Intrinsics.checkNotNullParameter(onJumpToBottom, "onJumpToBottom");
        SimpleDraweeView jumpButton = this.binding.jumpButton;
        Intrinsics.checkNotNullExpressionValue(jumpButton, "jumpButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(jumpButton, false, onJumpToBottom, 1, null);
    }

    public final void setMoreActionsHandler(@NotNull View.OnClickListener onMoreActions) {
        Intrinsics.checkNotNullParameter(onMoreActions, "onMoreActions");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onMoreActions, 1, null);
        SimpleDraweeView moreButton = this.binding.moreButton;
        Intrinsics.checkNotNullExpressionValue(moreButton, "moreButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(moreButton, false, onMoreActions, 1, null);
    }

    public final void setText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.binding.middleText.setText(text);
    }

    public /* synthetic */ SummarySeparatorView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SeparatorSummaryViewBinding separatorSummaryViewBindingInflate = SeparatorSummaryViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(separatorSummaryViewBindingInflate, "inflate(...)");
        this.binding = separatorSummaryViewBindingInflate;
        View root = separatorSummaryViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.message_divider_margin_horiz), root.getPaddingTop(), context.getResources().getDimensionPixelSize(R.dimen.message_divider_margin_horiz), root.getPaddingBottom());
        TextView textView = separatorSummaryViewBindingInflate.middleText;
        Intrinsics.checkNotNull(textView);
        ViewClippingUtilsKt.clipToRoundedRectangle(textView, SizeUtilsKt.getDpToPx(4));
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        SimpleDraweeView indicatorTop = separatorSummaryViewBindingInflate.indicatorTop;
        Intrinsics.checkNotNullExpressionValue(indicatorTop, "indicatorTop");
        ReactAssetUtilsKt.setReactAsset(indicatorTop, ReactAsset.SummaryIndicatorStart);
        SimpleDraweeView indicatorBottom = separatorSummaryViewBindingInflate.indicatorBottom;
        Intrinsics.checkNotNullExpressionValue(indicatorBottom, "indicatorBottom");
        ReactAssetUtilsKt.setReactAsset(indicatorBottom, ReactAsset.SummaryIndicatorEnd);
        SimpleDraweeView icon = separatorSummaryViewBindingInflate.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ReactAssetUtilsKt.setReactAsset(icon, ReactAsset.TopicsIcon);
        SimpleDraweeView jumpButton = separatorSummaryViewBindingInflate.jumpButton;
        Intrinsics.checkNotNullExpressionValue(jumpButton, "jumpButton");
        ReactAssetUtilsKt.setReactAsset(jumpButton, ReactAsset.ChevronSmallDownIcon);
        SimpleDraweeView jumpButton2 = separatorSummaryViewBindingInflate.jumpButton;
        Intrinsics.checkNotNullExpressionValue(jumpButton2, "jumpButton");
        ColorUtilsKt.setTintColor(jumpButton2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        SimpleDraweeView moreButton = separatorSummaryViewBindingInflate.moreButton;
        Intrinsics.checkNotNullExpressionValue(moreButton, "moreButton");
        ReactAssetUtilsKt.setReactAsset(moreButton, ReactAsset.MoreHorizontalIcon);
        SimpleDraweeView moreButton2 = separatorSummaryViewBindingInflate.moreButton;
        Intrinsics.checkNotNullExpressionValue(moreButton2, "moreButton");
        ColorUtilsKt.setTintColor(moreButton2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        FrameLayout buttonWrapper = separatorSummaryViewBindingInflate.buttonWrapper;
        Intrinsics.checkNotNullExpressionValue(buttonWrapper, "buttonWrapper");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(buttonWrapper, false, new b(9, separatorSummaryViewBindingInflate), 1, null);
    }
}
