package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.InfoLinkViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/message/view/InfoLinkView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/InfoLinkViewBinding;", "configure", "", "text", "", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "onInfoLinkClicked", "Lkotlin/Function0;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfoLinkView extends FrameLayout {

    @NotNull
    private final InfoLinkViewBinding binding;

    public /* synthetic */ InfoLinkView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    public final void configure(@NotNull String text, @NotNull ReactAsset icon, @NotNull Function0<Unit> onInfoLinkClicked) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onInfoLinkClicked, "onInfoLinkClicked");
        this.binding.description.setText(text);
        this.binding.description.setContentDescription(text);
        this.binding.description.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        TextView description = this.binding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        DiscordFontUtilsKt.setDiscordFont(description, DiscordFont.PrimaryNormal);
        SimpleDraweeView icon2 = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon2, "icon");
        ReactAssetUtilsKt.setReactAsset(icon2, icon);
        SimpleDraweeView icon3 = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon3, "icon");
        ColorUtilsKt.setTintColor(icon3, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        ConstraintLayout infoLinkContainer = this.binding.infoLinkContainer;
        Intrinsics.checkNotNullExpressionValue(infoLinkContainer, "infoLinkContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(infoLinkContainer, false, new a6.a(3, onInfoLinkClicked), 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoLinkView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        InfoLinkViewBinding infoLinkViewBindingInflate = InfoLinkViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(infoLinkViewBindingInflate, "inflate(...)");
        this.binding = infoLinkViewBindingInflate;
    }
}
