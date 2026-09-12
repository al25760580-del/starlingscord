package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.databinding.ForwardHeaderViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/view/ForwardHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ForwardHeaderViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ForwardHeaderViewBinding;", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForwardHeaderView extends LinearLayout implements VerticalSpacingItemDecoration.SpacingProviderView {

    @NotNull
    private final ForwardHeaderViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForwardHeaderView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ForwardHeaderViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    @NotNull
    /* JADX INFO: renamed from: spacingPxOverride */
    public Integer getBottomSpacingPx() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    public /* synthetic */ ForwardHeaderView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ForwardHeaderViewBinding forwardHeaderViewBindingInflate = ForwardHeaderViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(forwardHeaderViewBindingInflate, "inflate(...)");
        this.binding = forwardHeaderViewBindingInflate;
        setGravity(16);
        forwardHeaderViewBindingInflate.getRoot().setPadding(0, SizeUtilsKt.getDpToPx(2), 0, 0);
        SimpleDraweeView icon = forwardHeaderViewBindingInflate.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ReactAssetUtilsKt.setReactAsset(icon, ReactAsset.ArrowAngleRightUpIcon);
        SimpleDraweeView icon2 = forwardHeaderViewBindingInflate.icon;
        Intrinsics.checkNotNullExpressionValue(icon2, "icon");
        ColorUtilsKt.setTintColor(icon2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        TextView label = forwardHeaderViewBindingInflate.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        DiscordFontUtilsKt.setDiscordFont(label, DiscordFont.PrimarySemiboldItalic);
        TextView label2 = forwardHeaderViewBindingInflate.label;
        Intrinsics.checkNotNullExpressionValue(label2, "label");
        I18nUtilsKt.i18nSetText$default(label2, I18nMessage.MESSAGE_FORWARDED, null, 2, null);
        forwardHeaderViewBindingInflate.label.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
