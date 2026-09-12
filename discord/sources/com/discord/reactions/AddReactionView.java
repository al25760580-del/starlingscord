package com.discord.reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.reactions.databinding.AddReactionViewBinding;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J,\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/reactions/AddReactionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/reactions/databinding/AddReactionViewBinding;", "getAccessibilityClassName", "", "configure", "", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "isBurst", "", "imageAsset", "Lcom/discord/react_asset_fetcher/ReactAsset;", "showReactLabel", "Companion", "reactions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
public final class AddReactionView extends LinearLayout {
    private static final int VERTICAL_PADDING = SizeUtilsKt.getDpToPx(6);

    @NotNull
    private final AddReactionViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddReactionView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void configure$default(AddReactionView addReactionView, ReactionView.ReactionsTheme reactionsTheme, boolean z5, ReactAsset reactAsset, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            reactAsset = ReactAsset.ReactionIcon;
        }
        if ((i7 & 8) != 0) {
            z6 = false;
        }
        addReactionView.configure(reactionsTheme, z5, reactAsset, z6);
    }

    public final void configure(ReactionView.ReactionsTheme reactionsTheme, boolean isBurst, @NotNull ReactAsset imageAsset, boolean showReactLabel) {
        Integer reactionBackgroundColor;
        Integer reactionTextColor;
        Intrinsics.checkNotNullParameter(imageAsset, "imageAsset");
        int backgroundModStrong = ThemeManagerKt.getTheme().getBackgroundModStrong();
        ReactionView.Companion companion = ReactionView.INSTANCE;
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, backgroundModStrong, companion.getCORNER_RADIUS(), null, 0, 12, null);
        if (showReactLabel) {
            TextView addReactionText = this.binding.addReactionText;
            Intrinsics.checkNotNullExpressionValue(addReactionText, "addReactionText");
            DiscordFontUtilsKt.setDiscordFont(addReactionText, DiscordFont.PrimarySemibold);
            TextView addReactionText2 = this.binding.addReactionText;
            Intrinsics.checkNotNullExpressionValue(addReactionText2, "addReactionText");
            SetTextSizeSpKt.setTextSizeSp(addReactionText2, 14.0f, 14.0f);
            this.binding.addReactionText.setPadding(companion.getHORIZ_PADDING(), 0, companion.getHORIZ_PADDING(), 0);
            this.binding.addReactionText.setTextColor((reactionsTheme == null || (reactionTextColor = reactionsTheme.getReactionTextColor()) == null) ? ThemeManagerKt.getTheme().getTextMuted() : reactionTextColor.intValue());
            TextView textView = this.binding.addReactionText;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setText(I18nUtilsKt.i18nFormat$default(context, I18nMessage.REACT, null, 2, null));
            this.binding.addReactionText.setVisibility(0);
        } else {
            this.binding.addReactionText.setVisibility(8);
        }
        SimpleDraweeView addReactionImage = this.binding.addReactionImage;
        Intrinsics.checkNotNullExpressionValue(addReactionImage, "addReactionImage");
        if (isBurst) {
            imageAsset = ReactAsset.SuperReactionIcon;
        }
        ReactAssetUtilsKt.setReactAsset(addReactionImage, imageAsset);
        SimpleDraweeView addReactionImage2 = this.binding.addReactionImage;
        Intrinsics.checkNotNullExpressionValue(addReactionImage2, "addReactionImage");
        ColorUtilsKt.setTintColor(addReactionImage2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        this.binding.addReactionImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, (reactionsTheme == null || (reactionBackgroundColor = reactionsTheme.getReactionBackgroundColor()) == null) ? ThemeManagerKt.getTheme().getBackgroundModStrong() : reactionBackgroundColor.intValue(), companion.getCORNER_RADIUS(), reactionsTheme != null ? reactionsTheme.getReactionBorderColor() : null, companion.getSTROKE_WIDTH());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = Button.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public /* synthetic */ AddReactionView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReactionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AddReactionViewBinding addReactionViewBindingInflate = AddReactionViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(addReactionViewBindingInflate, "inflate(...)");
        this.binding = addReactionViewBindingInflate;
        setOrientation(0);
        setGravity(16);
        ReactionView.Companion companion = ReactionView.INSTANCE;
        int horiz_padding = companion.getHORIZ_PADDING();
        int i7 = VERTICAL_PADDING;
        setPadding(horiz_padding, i7, companion.getHORIZ_PADDING(), i7);
    }
}
