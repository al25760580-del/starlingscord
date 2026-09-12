package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.GuildInviteDisabledViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J*\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0018J\u0017\u0010\u0019\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0012J\u0017\u0010\u001c\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ+\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015J\u0017\u0010%\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildInviteDisabledViewBinding;", "setBackgroundRectangleColor", "", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "setHeaderText", "headerText", "", "setHelpIcon", "label", "", "helpArticleLink", "onHelpArticleClicked", "Lkotlin/Function1;", "setHeaderColor", "setTitleText", StackTraceHelper.NAME_KEY, "setTitleColor", "setGuildImage", "url", "thumbnailText", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setSubtitle", "subtitle", "guildName", "setSubtitleColor", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuildInviteDisabledView extends ConstraintLayout {

    @NotNull
    private final GuildInviteDisabledViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBackgroundRectangleColor(Integer color) {
        int colorCompat;
        if (color != null) {
            colorCompat = color.intValue();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            colorCompat = ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_100, R.color.primary_630));
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, colorCompat, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }

    public final void setGuildImage(String url, String thumbnailText, Integer thumbnailBackgroundColor) {
        GuildView.configure$default(this.binding.itemInviteImage, url, thumbnailText, thumbnailBackgroundColor, null, null, 24, null);
        SimpleDraweeView itemInviteDisabledIcon = this.binding.itemInviteDisabledIcon;
        Intrinsics.checkNotNullExpressionValue(itemInviteDisabledIcon, "itemInviteDisabledIcon");
        ReactAssetUtilsKt.setReactAsset(itemInviteDisabledIcon, ReactAsset.PauseIcon);
    }

    public final void setHeaderColor(Integer color) {
        this.binding.itemInviteHeader.setTextColor(color != null ? color.intValue() : ThemeManagerKt.getTheme().getInteractiveTextDefault());
    }

    public final void setHeaderText(@NotNull CharSequence headerText) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        this.binding.itemInviteHeader.setText(headerText);
    }

    public final void setHelpIcon(@NotNull String label, @NotNull String helpArticleLink, @NotNull Function1<? super String, Unit> onHelpArticleClicked) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helpArticleLink, "helpArticleLink");
        Intrinsics.checkNotNullParameter(onHelpArticleClicked, "onHelpArticleClicked");
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteHelpIcon;
        simpleDraweeView.setContentDescription(label);
        simpleDraweeView.setOnClickListener(new e(1, helpArticleLink, onHelpArticleClicked));
    }

    public final void setSubtitle(@NotNull String subtitle, @NotNull String guildName) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder(subtitle);
        draweeSpanStringBuilder.append((CharSequence) guildName);
        draweeSpanStringBuilder.setSpan(new StyleSpan(1), subtitle.length(), draweeSpanStringBuilder.length(), 33);
        this.binding.itemInviteSubtitle.setText(draweeSpanStringBuilder);
    }

    public final void setSubtitleColor(Integer color) {
        this.binding.itemInviteSubtitle.setTextColor(color != null ? color.intValue() : ThemeManagerKt.getTheme().getTextDefault());
    }

    public final void setTitleColor(Integer color) {
        this.binding.itemInviteTitle.setTextColor(color != null ? color.intValue() : ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
    }

    public final void setTitleText(@NotNull CharSequence name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.binding.itemInviteTitle.setText(name);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuildInviteDisabledView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        GuildInviteDisabledViewBinding guildInviteDisabledViewBindingInflate = GuildInviteDisabledViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(guildInviteDisabledViewBindingInflate, "inflate(...)");
        this.binding = guildInviteDisabledViewBindingInflate;
        TextView textView = guildInviteDisabledViewBindingInflate.itemInviteHeader;
        textView.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 11.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
        SimpleDraweeView simpleDraweeView = guildInviteDisabledViewBindingInflate.itemInviteHelpIcon;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.CircleQuestionIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        TextView textView2 = guildInviteDisabledViewBindingInflate.itemInviteTitle;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryMedium);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = guildInviteDisabledViewBindingInflate.itemInviteSubtitle;
        simpleDraweeSpanTextView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, DiscordFont.PrimaryNormal);
    }
}
