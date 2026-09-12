package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.SafetyPolicyNoticeBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "titleText", "", "setTitle", "(Ljava/lang/String;)V", "subtitle", "setSubtitle", "description", "setDescription", "ctaText", "setCta", "classificationId", "Lkotlin/Function1;", "callback", "setOnClickListener", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", AlertFragment.ARG_TITLE, "onTapEmbed", "setContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/databinding/SafetyPolicyNoticeBinding;", "binding", "Lcom/discord/chat/databinding/SafetyPolicyNoticeBinding;", "getBinding", "()Lcom/discord/chat/databinding/SafetyPolicyNoticeBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafetyPolicyNoticeView extends ConstraintLayout {

    @NotNull
    private final SafetyPolicyNoticeBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SafetyPolicyNoticeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setCta(String ctaText) {
        this.binding.footer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundFeedbackCritical());
        TextView textView = this.binding.learnMore;
        textView.setText(ctaText);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
    }

    private final void setDescription(String description) {
        TextView textView = this.binding.description;
        textView.setText(description);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
    }

    private final void setOnClickListener(String classificationId, Function1<? super String, Unit> callback) {
        this.binding.getRoot().setOnClickListener(new e(2, classificationId, callback));
    }

    private final void setSubtitle(String subtitle) {
        TextView textView = this.binding.subtitleText;
        textView.setText(subtitle);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
    }

    private final void setTitle(String titleText) {
        TextView textView = this.binding.title;
        textView.setText(titleText);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
    }

    @NotNull
    public final SafetyPolicyNoticeBinding getBinding() {
        return this.binding;
    }

    public final void setContent(@NotNull String title, @NotNull String subtitle, @NotNull String description, @NotNull String ctaText, @NotNull String classificationId, @NotNull Function1<? super String, Unit> onTapEmbed) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        Intrinsics.checkNotNullParameter(onTapEmbed, "onTapEmbed");
        setTitle(title);
        setSubtitle(subtitle);
        setDescription(description);
        setCta(ctaText);
        setOnClickListener(classificationId, onTapEmbed);
    }

    public /* synthetic */ SafetyPolicyNoticeView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPolicyNoticeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SafetyPolicyNoticeBinding safetyPolicyNoticeBindingInflate = SafetyPolicyNoticeBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(safetyPolicyNoticeBindingInflate, "inflate(...)");
        this.binding = safetyPolicyNoticeBindingInflate;
        View root = safetyPolicyNoticeBindingInflate.getRoot();
        root.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        Intrinsics.checkNotNull(root);
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(8));
        SimpleDraweeView simpleDraweeView = safetyPolicyNoticeBindingInflate.icon;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.WarningIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getIconFeedbackCritical()));
    }
}
