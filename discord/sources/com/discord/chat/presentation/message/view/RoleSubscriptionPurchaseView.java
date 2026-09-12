package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.RoleSubscriptionPurchaseViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/RoleSubscriptionPurchaseViewBinding;", "configure", "", "authorUsername", "", "authorAvatar", "widthPx", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoleSubscriptionPurchaseView extends ConstraintLayout {

    @NotNull
    private final RoleSubscriptionPurchaseViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void configure(String authorUsername, String authorAvatar, int widthPx) {
        this.binding.roleSubscriptionPurchaserUsername.setText(authorUsername);
        SimpleDraweeView roleSubscriptionPurchaserAvatar = this.binding.roleSubscriptionPurchaserAvatar;
        Intrinsics.checkNotNullExpressionValue(roleSubscriptionPurchaserAvatar, "roleSubscriptionPurchaserAvatar");
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(roleSubscriptionPurchaserAvatar, authorAvatar);
        ViewGroup.LayoutParams layoutParams = this.binding.roleSubscriptionPurchaseCardBg.getLayoutParams();
        layoutParams.width = widthPx;
        double d6 = widthPx;
        layoutParams.height = (int) (0.339d * d6);
        ViewGroup.LayoutParams layoutParams2 = this.binding.roleSubscriptionPurchaseBadge.getLayoutParams();
        int i7 = (int) (0.21d * d6);
        layoutParams2.width = i7;
        layoutParams2.height = (int) (((double) i7) * 1.37d);
        ViewGroup.LayoutParams layoutParams3 = this.binding.roleSubscriptionPurchaseLanyard.getLayoutParams();
        int i10 = (int) (d6 * 0.18d);
        layoutParams3.width = i10;
        layoutParams3.height = (int) (((double) i10) * 2.327d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoleSubscriptionPurchaseView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        RoleSubscriptionPurchaseViewBinding roleSubscriptionPurchaseViewBindingInflate = RoleSubscriptionPurchaseViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(roleSubscriptionPurchaseViewBindingInflate, "inflate(...)");
        this.binding = roleSubscriptionPurchaseViewBindingInflate;
        TextView textView = roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionWelcome;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f);
        textView.setTextColor(ThemeManagerKt.getTheme().getStatusPositiveText());
        TextView textView2 = roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionPurchaserUsername;
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(textView2, 20.0f);
        textView2.setTextColor(ThemeManagerKt.getTheme().getStatusPositiveText());
        SimpleDraweeView roleSubscriptionPurchaseBadge = roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionPurchaseBadge;
        Intrinsics.checkNotNullExpressionValue(roleSubscriptionPurchaseBadge, "roleSubscriptionPurchaseBadge");
        ReactAssetUtilsKt.setReactAsset(roleSubscriptionPurchaseBadge, ReactAsset.RoleSubscriptionBadge);
        SimpleDraweeView roleSubscriptionPurchaseLanyard = roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionPurchaseLanyard;
        Intrinsics.checkNotNullExpressionValue(roleSubscriptionPurchaseLanyard, "roleSubscriptionPurchaseLanyard");
        ReactAssetUtilsKt.setReactAsset(roleSubscriptionPurchaseLanyard, ReactAsset.RoleSubscriptionLanyard);
        SimpleDraweeView roleSubscriptionPurchaseCardBg = roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionPurchaseCardBg;
        Intrinsics.checkNotNullExpressionValue(roleSubscriptionPurchaseCardBg, "roleSubscriptionPurchaseCardBg");
        ReactAssetUtilsKt.setReactAsset(roleSubscriptionPurchaseCardBg, ReactAsset.RoleSubscriptionPurchaseCard);
        SimpleDraweeView roleSubscriptionPurchaserAvatar = roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionPurchaserAvatar;
        Intrinsics.checkNotNullExpressionValue(roleSubscriptionPurchaserAvatar, "roleSubscriptionPurchaserAvatar");
        ViewClippingUtilsKt.clipToCircle(roleSubscriptionPurchaserAvatar);
        roleSubscriptionPurchaseViewBindingInflate.roleSubscriptionWelcome.setText(I18nUtilsKt.i18nFormat$default(context, I18nMessage.ROLE_SUBSCRIPTION_WELCOME_LABEL, null, 2, null));
    }
}
