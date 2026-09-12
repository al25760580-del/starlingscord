package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.discord.chat.databinding.IconButtonViewBinding;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/message/view/IconButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/IconButtonViewBinding;", "configure", "", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "alt", "Lcom/discord/react_strings/I18nMessage;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IconButtonView extends FrameLayout {

    @NotNull
    private final IconButtonViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IconButtonView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void configure(@NotNull ReactAsset icon, @NotNull I18nMessage alt, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(alt, "alt");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        SimpleDraweeView simpleDraweeView = this.binding.iconButton;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, icon);
        I18nUtilsKt.i18nContentDescription$default(simpleDraweeView, alt, (Function1) null, 2, (Object) null);
        FrameLayout iconContainer = this.binding.iconContainer;
        Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(iconContainer, false, new a6.a(2, onClick), 1, null);
    }

    public /* synthetic */ IconButtonView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonViewBinding iconButtonViewBindingInflate = IconButtonViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(iconButtonViewBindingInflate, "inflate(...)");
        this.binding = iconButtonViewBindingInflate;
        FrameLayout iconContainer = iconButtonViewBindingInflate.iconContainer;
        Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(iconContainer, SizeUtilsKt.getDpToPx(8));
        ((GenericDraweeHierarchy) iconButtonViewBindingInflate.iconButton.getHierarchy()).l(0);
    }
}
