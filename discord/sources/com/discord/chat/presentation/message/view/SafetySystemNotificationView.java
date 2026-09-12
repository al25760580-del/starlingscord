package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.bridge.safetysystemnotification.FooterTheme;
import com.discord.chat.databinding.SafetySystemNotificationBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u001aH\u0002¢\u0006\u0004\b!\u0010\u001dJ\u007f\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/discord/chat/presentation/message/view/SafetySystemNotificationView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "titleText", "", "setTitle", "(Ljava/lang/String;)V", "titleIcon", "setTitleIcon", "subtitle", "setSubtitle", "description", "setDescription", "Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;", "footerTheme", "setTheme", "(Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;)V", "primaryCtaText", "primaryCtaType", "primaryCtaKey", "Lkotlin/Function2;", "callback", "setPrimaryCta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "secondaryCtaText", "secondaryCtaType", "secondaryCtaKey", "setSecondaryCta", "subtitleText", "descriptionText", "onTapCta", "setContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/databinding/SafetySystemNotificationBinding;", "binding", "Lcom/discord/chat/databinding/SafetySystemNotificationBinding;", "getBinding", "()Lcom/discord/chat/databinding/SafetySystemNotificationBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafetySystemNotificationView extends LinearLayout {

    @NotNull
    private final SafetySystemNotificationBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SafetySystemNotificationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setDescription(String description) {
        if (StringsKt.K(description)) {
            this.binding.description.setVisibility(8);
            return;
        }
        TextView textView = this.binding.description;
        textView.setText(description);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
        textView.setVisibility(0);
        Intrinsics.checkNotNull(textView);
    }

    private final void setPrimaryCta(String primaryCtaText, String primaryCtaType, String primaryCtaKey, Function2<? super String, ? super String, Unit> callback) {
        TextView textView = this.binding.primaryCta;
        textView.setOnClickListener(new k(1, primaryCtaType, primaryCtaKey, callback));
        textView.setText(primaryCtaText);
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
    }

    private final void setSecondaryCta(String secondaryCtaText, String secondaryCtaType, String secondaryCtaKey, Function2<? super String, ? super String, Unit> callback) {
        TextView textView = this.binding.secondaryCta;
        textView.setOnClickListener(new k(2, secondaryCtaType, secondaryCtaKey, callback));
        textView.setText(secondaryCtaText);
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
    }

    private final void setSubtitle(String subtitle) {
        if (StringsKt.K(subtitle)) {
            this.binding.subtitleText.setVisibility(8);
            return;
        }
        TextView textView = this.binding.subtitleText;
        textView.setText(subtitle);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        textView.setVisibility(0);
        Intrinsics.checkNotNull(textView);
    }

    private final void setTheme(FooterTheme footerTheme) {
        if (footerTheme == FooterTheme.DANGER) {
            this.binding.footer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundFeedbackCritical());
            this.binding.primaryCta.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
            this.binding.secondaryCta.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
            SimpleDraweeView icon = this.binding.icon;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            ColorUtilsKt.setTintColor(icon, Integer.valueOf(ThemeManagerKt.getTheme().getTextFeedbackCritical()));
            return;
        }
        this.binding.footer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
        this.binding.primaryCta.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        this.binding.secondaryCta.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        SimpleDraweeView icon2 = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon2, "icon");
        ColorUtilsKt.setTintColor(icon2, Integer.valueOf(ThemeManagerKt.getTheme().getTextLink()));
    }

    private final void setTitle(String titleText) {
        if (StringsKt.K(titleText)) {
            this.binding.titleContainer.setVisibility(8);
            return;
        }
        TextView textView = this.binding.title;
        textView.setText(titleText);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        textView.setVisibility(0);
        Intrinsics.checkNotNull(textView);
    }

    private final void setTitleIcon(String titleIcon) {
        SimpleDraweeView icon = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(icon, titleIcon, null, null, null, null, null, 62, null);
    }

    @NotNull
    public final SafetySystemNotificationBinding getBinding() {
        return this.binding;
    }

    public final void setContent(@NotNull String titleText, @NotNull String titleIcon, @NotNull String subtitleText, @NotNull String descriptionText, @NotNull String primaryCtaText, @NotNull String primaryCtaKey, @NotNull String primaryCtaType, @NotNull String secondaryCtaText, @NotNull String secondaryCtaType, @NotNull String secondaryCtaKey, @NotNull FooterTheme footerTheme, @NotNull Function2<? super String, ? super String, Unit> onTapCta) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(primaryCtaKey, "primaryCtaKey");
        Intrinsics.checkNotNullParameter(primaryCtaType, "primaryCtaType");
        Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaType, "secondaryCtaType");
        Intrinsics.checkNotNullParameter(secondaryCtaKey, "secondaryCtaKey");
        Intrinsics.checkNotNullParameter(footerTheme, "footerTheme");
        Intrinsics.checkNotNullParameter(onTapCta, "onTapCta");
        setTitle(titleText);
        setTitleIcon(titleIcon);
        setSubtitle(subtitleText);
        setDescription(descriptionText);
        setTheme(footerTheme);
        setPrimaryCta(primaryCtaText, primaryCtaType, primaryCtaKey, onTapCta);
        if (!StringsKt.K(secondaryCtaText) && !StringsKt.K(secondaryCtaKey)) {
            setSecondaryCta(secondaryCtaText, secondaryCtaType, secondaryCtaKey, onTapCta);
        }
        if (StringsKt.K(primaryCtaText) || StringsKt.K(secondaryCtaText)) {
            return;
        }
        this.binding.separator.setVisibility(0);
    }

    public /* synthetic */ SafetySystemNotificationView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetySystemNotificationView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SafetySystemNotificationBinding safetySystemNotificationBindingInflate = SafetySystemNotificationBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(safetySystemNotificationBindingInflate, "inflate(...)");
        this.binding = safetySystemNotificationBindingInflate;
        View root = safetySystemNotificationBindingInflate.getRoot();
        root.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        Intrinsics.checkNotNull(root);
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(8));
        TextView textView = safetySystemNotificationBindingInflate.separator;
        textView.setText("•");
        textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
        textView.setVisibility(8);
    }
}
