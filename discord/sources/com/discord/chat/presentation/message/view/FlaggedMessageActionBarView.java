package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.databinding.FlaggedMessageActionBarViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\r\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;", "Landroid/widget/LinearLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/FlaggedMessageActionBarViewBinding;", "setActions", "", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "onTapAutoModerationActions", "Landroid/view/View$OnClickListener;", "onTapAutoModerationFeedback", "spacingPxOverride", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlaggedMessageActionBarView extends LinearLayout implements VerticalSpacingItemDecoration.SpacingProviderView {

    @NotNull
    private final FlaggedMessageActionBarViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setActions(@NotNull AutoModerationContext autoModerationContext, @NotNull View.OnClickListener onTapAutoModerationActions, @NotNull View.OnClickListener onTapAutoModerationFeedback) {
        Intrinsics.checkNotNullParameter(autoModerationContext, "autoModerationContext");
        Intrinsics.checkNotNullParameter(onTapAutoModerationActions, "onTapAutoModerationActions");
        Intrinsics.checkNotNullParameter(onTapAutoModerationFeedback, "onTapAutoModerationFeedback");
        String actionsIconURL = autoModerationContext.getActionsIconURL();
        String actionsText = autoModerationContext.getActionsText();
        DCDButton dCDButton = this.binding.actionsButton;
        if (actionsIconURL != null) {
            dCDButton.setIcon(actionsIconURL, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton.setText(actionsText);
        dCDButton.setOnClickButtonListener(onTapAutoModerationActions);
        String feedbackText = autoModerationContext.getFeedbackText();
        DCDButton dCDButton2 = this.binding.feedbackButton;
        dCDButton2.setText(feedbackText);
        dCDButton2.setOnClickButtonListener(onTapAutoModerationFeedback);
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    @NotNull
    /* JADX INFO: renamed from: spacingPxOverride */
    public Integer getBottomSpacingPx() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlaggedMessageActionBarView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        FlaggedMessageActionBarViewBinding flaggedMessageActionBarViewBindingInflate = FlaggedMessageActionBarViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(flaggedMessageActionBarViewBindingInflate, "inflate(...)");
        this.binding = flaggedMessageActionBarViewBindingInflate;
        ImageView imageView = flaggedMessageActionBarViewBindingInflate.separatorDot;
        imageView.setBackgroundColor(ThemeManagerKt.getTheme().getBorderSubtle());
        Intrinsics.checkNotNull(imageView);
        ViewClippingUtilsKt.clipToRoundedRectangle(imageView, SizeUtilsKt.getDpToPx(4));
        DCDButton dCDButton = flaggedMessageActionBarViewBindingInflate.actionsButton;
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextBrand()));
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        dCDButton.setDiscordFont(discordFont);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLow());
        DCDButton dCDButton2 = flaggedMessageActionBarViewBindingInflate.feedbackButton;
        dCDButton2.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton2.setTextSizeSp(12.0f);
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextBrand()));
        dCDButton2.setDiscordFont(discordFont);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLow());
    }
}
