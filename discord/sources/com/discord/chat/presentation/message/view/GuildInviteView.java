package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.u0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.GuildInviteViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0018J5\u0010\u001c\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0015J\u0010\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0012J\u0017\u0010%\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u001a\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0015J\u0010\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0015J\u0017\u0010+\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0017\u0010,\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ5\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u00104J\u000e\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020/R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildInviteViewBinding;", "setBackgroundRectangleColor", "", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "setInviteSplash", "url", "", "setHeaderText", "headerText", "", "setGuildBadge", "setHeaderColor", "(Ljava/lang/Integer;)Lkotlin/Unit;", "setTitleText", StackTraceHelper.NAME_KEY, "setTitleColor", "setGuildImage", "thumbnailText", "thumbnailBackgroundColor", "thumbnailCornerRadius", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setSubtitle", "subtitle", "setSubtitleIcon", "subtitleIconUrl", "setSubtitleColor", "setPresence", "onlineText", "memberText", "setButtonText", "text", "setButtonTextColor", "setButtonBackgroundColor", "setClickListeners", "canBeAccepted", "", "tapEmbedListener", "Landroid/view/View$OnClickListener;", "tapAcceptListener", "accessibilityActionLabel", "(Ljava/lang/Boolean;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Ljava/lang/CharSequence;)V", "setLoading", "loading", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuildInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildInviteView.kt\ncom/discord/chat/presentation/message/view/GuildInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n257#2,2:211\n257#2,2:213\n257#2,2:216\n257#2,2:218\n257#2,2:220\n257#2,2:222\n1#3:215\n*S KotlinDebug\n*F\n+ 1 GuildInviteView.kt\ncom/discord/chat/presentation/message/view/GuildInviteView\n*L\n97#1:211,2\n102#1:213,2\n150#1:216,2\n153#1:218,2\n157#1:220,2\n163#1:222,2\n*E\n"})
public final class GuildInviteView extends ConstraintLayout {

    @NotNull
    private final GuildInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setClickListeners$default(GuildInviteView guildInviteView, Boolean bool, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, CharSequence charSequence, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            charSequence = null;
        }
        guildInviteView.setClickListeners(bool, onClickListener, onClickListener2, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setClickListeners$lambda$12(View.OnClickListener onClickListener, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        Intrinsics.checkNotNullParameter(view, "view");
        onClickListener.onClick(view);
        return true;
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

    public final void setButtonBackgroundColor(Integer color) {
        this.binding.itemInviteJoinedButton.setBackgroundColor(color);
    }

    public final void setButtonText(CharSequence text) {
        DCDButton itemInviteJoinedButton = this.binding.itemInviteJoinedButton;
        Intrinsics.checkNotNullExpressionValue(itemInviteJoinedButton, "itemInviteJoinedButton");
        itemInviteJoinedButton.setVisibility(text == null || StringsKt.K(text) ? 8 : 0);
        this.binding.itemInviteJoinedButton.setText(text);
    }

    public final void setButtonTextColor(Integer color) {
        this.binding.itemInviteJoinedButton.setTextColor(color);
    }

    public final void setClickListeners(Boolean canBeAccepted, View.OnClickListener tapEmbedListener, View.OnClickListener tapAcceptListener, CharSequence accessibilityActionLabel) {
        ConstraintLayout itemBottomContainer = this.binding.itemBottomContainer;
        Intrinsics.checkNotNullExpressionValue(itemBottomContainer, "itemBottomContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested(itemBottomContainer, true, tapEmbedListener);
        DCDButton dCDButton = this.binding.itemInviteJoinedButton;
        dCDButton.setImportantForAccessibility(4);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(canBeAccepted, bool)) {
            dCDButton.setOnClickButtonListener(tapAcceptListener);
        } else {
            dCDButton.setOnClickButtonListener(tapEmbedListener);
        }
        if (Intrinsics.areEqual(canBeAccepted, bool)) {
            tapEmbedListener = tapAcceptListener;
        }
        if (tapEmbedListener != null) {
            u0.n(this.binding.itemBottomContainer, androidx.core.view.accessibility.a.f1618g, accessibilityActionLabel, new app.rive.runtime.kotlin.core.a(12, tapEmbedListener));
        }
    }

    public final void setGuildBadge(String url) {
        SimpleDraweeView itemGuildBadge = this.binding.itemGuildBadge;
        Intrinsics.checkNotNullExpressionValue(itemGuildBadge, "itemGuildBadge");
        ReactAssetUtilsKt.setOptionalReactImageUrl(itemGuildBadge, url);
    }

    public final void setGuildImage(String url, String thumbnailText, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius) {
        GuildView.configure$default(this.binding.itemInviteImage, url, thumbnailText, thumbnailBackgroundColor, thumbnailCornerRadius, null, 16, null);
    }

    public final Unit setHeaderColor(Integer color) {
        if (color == null) {
            return null;
        }
        this.binding.itemInviteHeader.setTextColor(color.intValue());
        return Unit.f14616a;
    }

    public final void setHeaderText(CharSequence headerText) {
        TextView itemInviteHeader = this.binding.itemInviteHeader;
        Intrinsics.checkNotNullExpressionValue(itemInviteHeader, "itemInviteHeader");
        itemInviteHeader.setVisibility(headerText == null || headerText.length() == 0 ? 8 : 0);
        this.binding.itemInviteHeader.setText(headerText);
    }

    public final void setInviteSplash(String url) {
        SimpleDraweeView itemInviteSplash = this.binding.itemInviteSplash;
        Intrinsics.checkNotNullExpressionValue(itemInviteSplash, "itemInviteSplash");
        itemInviteSplash.setVisibility(url == null || url.length() == 0 ? 8 : 0);
        this.binding.itemInviteSplash.setImageURI(url);
    }

    public final void setLoading(boolean loading) {
        DCDButton.setLoading$default(this.binding.itemInviteJoinedButton, loading, false, 2, null);
    }

    public final void setPresence(CharSequence onlineText, CharSequence memberText) {
        ImageView itemInviteOnlineDot = this.binding.itemInviteOnlineDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteOnlineDot, "itemInviteOnlineDot");
        boolean z5 = true;
        itemInviteOnlineDot.setVisibility(!(onlineText == null || StringsKt.K(onlineText)) ? 0 : 8);
        ImageView itemInviteOnlineDot2 = this.binding.itemInviteOnlineDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteOnlineDot2, "itemInviteOnlineDot");
        ViewBackgroundUtilsKt.setBackgroundOval$default(itemInviteOnlineDot2, ColorUtilsKt.getColorCompat(this, R.color.green_360), 0, 2, null);
        this.binding.itemInviteOnlineText.setText(onlineText);
        ImageView itemInviteTotalMemberDot = this.binding.itemInviteTotalMemberDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
        itemInviteTotalMemberDot.setVisibility(!(memberText == null || StringsKt.K(memberText)) ? 0 : 8);
        ImageView itemInviteTotalMemberDot2 = this.binding.itemInviteTotalMemberDot;
        Intrinsics.checkNotNullExpressionValue(itemInviteTotalMemberDot2, "itemInviteTotalMemberDot");
        ViewBackgroundUtilsKt.setBackgroundOval$default(itemInviteTotalMemberDot2, ColorUtilsKt.getColorCompat(this, R.color.primary_500), 0, 2, null);
        this.binding.itemInviteTotalMemberText.setText(memberText);
        LinearLayout itemInviteMemberContainer = this.binding.itemInviteMemberContainer;
        Intrinsics.checkNotNullExpressionValue(itemInviteMemberContainer, "itemInviteMemberContainer");
        if ((onlineText == null || StringsKt.K(onlineText)) && (memberText == null || StringsKt.K(memberText))) {
            z5 = false;
        }
        itemInviteMemberContainer.setVisibility(z5 ? 0 : 8);
    }

    public final void setSubtitle(CharSequence subtitle) {
        TextView itemInviteSubtitle = this.binding.itemInviteSubtitle;
        Intrinsics.checkNotNullExpressionValue(itemInviteSubtitle, "itemInviteSubtitle");
        ViewUtilsKt.setOptionalText(itemInviteSubtitle, subtitle);
    }

    public final void setSubtitleColor(Integer color) {
        if (color != null) {
            this.binding.itemInviteSubtitle.setTextColor(color.intValue());
        }
        SimpleDraweeView itemInviteSubtitleIcon = this.binding.itemInviteSubtitleIcon;
        Intrinsics.checkNotNullExpressionValue(itemInviteSubtitleIcon, "itemInviteSubtitleIcon");
        ColorUtilsKt.setTintColor(itemInviteSubtitleIcon, Integer.valueOf(color != null ? color.intValue() : ThemeManagerKt.getTheme().getTextSubtle()));
    }

    public final void setSubtitleIcon(String subtitleIconUrl) {
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSubtitleIcon;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, subtitleIconUrl);
    }

    public final Unit setTitleColor(Integer color) {
        if (color == null) {
            return null;
        }
        this.binding.itemInviteTitle.setTextColor(color.intValue());
        return Unit.f14616a;
    }

    public final void setTitleText(CharSequence name) {
        this.binding.itemInviteTitle.setText(name);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuildInviteView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        GuildInviteViewBinding guildInviteViewBindingInflate = GuildInviteViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(guildInviteViewBindingInflate, "inflate(...)");
        this.binding = guildInviteViewBindingInflate;
        TextView textView = guildInviteViewBindingInflate.itemInviteHeader;
        textView.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
        TextView textView2 = guildInviteViewBindingInflate.itemInviteTitle;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        TextView textView3 = guildInviteViewBindingInflate.itemInviteSubtitle;
        textView3.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView3);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        TextView textView4 = guildInviteViewBindingInflate.itemInviteOnlineText;
        textView4.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView4);
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        TextView textView5 = guildInviteViewBindingInflate.itemInviteTotalMemberText;
        textView5.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView5);
        SetTextSizeSpKt.setTextSizeSp(textView5, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont);
        TextView textView6 = guildInviteViewBindingInflate.itemInviteHubLink;
        textView6.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView6);
        DiscordFontUtilsKt.setDiscordFont(textView6, discordFont2);
        guildInviteViewBindingInflate.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(context, R.color.brand));
        u0.p(guildInviteViewBindingInflate.itemBottomContainer, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.view.GuildInviteView.2
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.o("android.widget.Button");
            }
        });
    }
}
