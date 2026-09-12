package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedFooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/FlaggedMessageEmbedFooterViewBinding;", "setAutomodContext", "", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlaggedMessageEmbedFooterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlaggedMessageEmbedFooterView.kt\ncom/discord/chat/presentation/message/view/FlaggedMessageEmbedFooterView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,58:1\n257#2,2:59\n*S KotlinDebug\n*F\n+ 1 FlaggedMessageEmbedFooterView.kt\ncom/discord/chat/presentation/message/view/FlaggedMessageEmbedFooterView\n*L\n55#1:59,2\n*E\n"})
public final class FlaggedMessageEmbedFooterView extends ConstraintLayout {

    @NotNull
    private final FlaggedMessageEmbedFooterViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlaggedMessageEmbedFooterView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAutomodContext(@NotNull AutoModerationContext autoModerationContext) {
        Intrinsics.checkNotNullParameter(autoModerationContext, "autoModerationContext");
        String keywordDisplayText = autoModerationContext.getKeywordDisplayText();
        String ruleDisplayText = autoModerationContext.getRuleDisplayText();
        if (keywordDisplayText != null && !Intrinsics.areEqual(keywordDisplayText, "")) {
            this.binding.flaggedMessageKeyword.setText(keywordDisplayText);
        }
        if (ruleDisplayText != null && !Intrinsics.areEqual(ruleDisplayText, "")) {
            this.binding.flaggedMessageRuleName.setText(ruleDisplayText);
        }
        ImageView separatorDot = this.binding.separatorDot;
        Intrinsics.checkNotNullExpressionValue(separatorDot, "separatorDot");
        separatorDot.setVisibility(keywordDisplayText != null && !Intrinsics.areEqual(keywordDisplayText, "") && ruleDisplayText != null && !Intrinsics.areEqual(ruleDisplayText, "") ? 0 : 8);
    }

    public /* synthetic */ FlaggedMessageEmbedFooterView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageEmbedFooterView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        FlaggedMessageEmbedFooterViewBinding flaggedMessageEmbedFooterViewBindingInflate = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(flaggedMessageEmbedFooterViewBindingInflate, "inflate(...)");
        this.binding = flaggedMessageEmbedFooterViewBindingInflate;
        ImageView imageView = flaggedMessageEmbedFooterViewBindingInflate.separatorDot;
        imageView.setBackgroundColor(ThemeManagerKt.getTheme().getBorderSubtle());
        Intrinsics.checkNotNull(imageView);
        ViewClippingUtilsKt.clipToRoundedRectangle(imageView, SizeUtilsKt.getDpToPx(4));
        TextView textView = flaggedMessageEmbedFooterViewBindingInflate.flaggedMessageKeyword;
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f, 15.0f);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView textView2 = flaggedMessageEmbedFooterViewBindingInflate.flaggedMessageRuleName;
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f, 15.0f);
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
