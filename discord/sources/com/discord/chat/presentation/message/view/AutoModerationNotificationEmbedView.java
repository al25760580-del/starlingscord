package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.AutoModerationNotification;
import com.discord.chat.databinding.AutoModerationNotificationEmbedViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react.FontManager;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\r\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/AutoModerationNotificationEmbedViewBinding;", "allowChildGestures", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "configure", "", "moderationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "onTapAutoModerationActions", "Landroid/view/View$OnClickListener;", "onTapAutoModerationFeedback", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoModerationNotificationEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoModerationNotificationEmbedView.kt\ncom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,192:1\n257#2,2:193\n257#2,2:195\n257#2,2:197\n257#2,2:199\n257#2,2:201\n257#2,2:203\n257#2,2:205\n257#2,2:207\n257#2,2:209\n257#2,2:211\n257#2,2:213\n257#2,2:215\n257#2,2:217\n257#2,2:219\n257#2,2:221\n257#2,2:223\n257#2,2:225\n257#2,2:227\n257#2,2:229\n*S KotlinDebug\n*F\n+ 1 AutoModerationNotificationEmbedView.kt\ncom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView\n*L\n115#1:193,2\n116#1:195,2\n117#1:197,2\n118#1:199,2\n119#1:201,2\n120#1:203,2\n121#1:205,2\n125#1:207,2\n129#1:209,2\n133#1:211,2\n134#1:213,2\n136#1:215,2\n142#1:217,2\n146#1:219,2\n150#1:221,2\n154#1:223,2\n158#1:225,2\n161#1:227,2\n168#1:229,2\n*E\n"})
public final class AutoModerationNotificationEmbedView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView {
    private boolean allowChildGestures;

    @NotNull
    private final AutoModerationNotificationEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoModerationNotificationEmbedView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void configure(@NotNull AutoModerationContext moderationContext, @NotNull View.OnClickListener onTapAutoModerationActions, @NotNull View.OnClickListener onTapAutoModerationFeedback) {
        Intrinsics.checkNotNullParameter(moderationContext, "moderationContext");
        Intrinsics.checkNotNullParameter(onTapAutoModerationActions, "onTapAutoModerationActions");
        Intrinsics.checkNotNullParameter(onTapAutoModerationFeedback, "onTapAutoModerationFeedback");
        AutoModerationNotification notification = moderationContext.getNotification();
        TextView header = this.binding.header;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        header.setVisibility(8);
        SimpleDraweeView headerIcon = this.binding.headerIcon;
        Intrinsics.checkNotNullExpressionValue(headerIcon, "headerIcon");
        headerIcon.setVisibility(8);
        TextView subtitleLeft = this.binding.subtitleLeft;
        Intrinsics.checkNotNullExpressionValue(subtitleLeft, "subtitleLeft");
        subtitleLeft.setVisibility(8);
        TextView subtitleRight = this.binding.subtitleRight;
        Intrinsics.checkNotNullExpressionValue(subtitleRight, "subtitleRight");
        subtitleRight.setVisibility(8);
        SimpleDraweeView subtitleLeftAvatar = this.binding.subtitleLeftAvatar;
        Intrinsics.checkNotNullExpressionValue(subtitleLeftAvatar, "subtitleLeftAvatar");
        subtitleLeftAvatar.setVisibility(8);
        TextView subtitleLeftAuthor = this.binding.subtitleLeftAuthor;
        Intrinsics.checkNotNullExpressionValue(subtitleLeftAuthor, "subtitleLeftAuthor");
        subtitleLeftAuthor.setVisibility(8);
        TextView body = this.binding.body;
        Intrinsics.checkNotNullExpressionValue(body, "body");
        body.setVisibility(8);
        if (notification != null) {
            TextView header2 = this.binding.header;
            Intrinsics.checkNotNullExpressionValue(header2, "header");
            header2.setVisibility(0);
            this.binding.header.setText(notification.getHeader());
            this.binding.header.setTextColor(notification.getHeaderColor());
            SimpleDraweeView headerIcon2 = this.binding.headerIcon;
            Intrinsics.checkNotNullExpressionValue(headerIcon2, "headerIcon");
            headerIcon2.setVisibility(0);
            SimpleDraweeView headerIcon3 = this.binding.headerIcon;
            Intrinsics.checkNotNullExpressionValue(headerIcon3, "headerIcon");
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(headerIcon3, notification.getHeaderIconURL());
            SimpleDraweeView headerIcon4 = this.binding.headerIcon;
            Intrinsics.checkNotNullExpressionValue(headerIcon4, "headerIcon");
            ColorUtilsKt.setTintColor(headerIcon4, Integer.valueOf(notification.getHeaderIconColor()));
            TextView body2 = this.binding.body;
            Intrinsics.checkNotNullExpressionValue(body2, "body");
            body2.setVisibility(0);
            LinearLayout actions = this.binding.actions;
            Intrinsics.checkNotNullExpressionValue(actions, "actions");
            actions.setVisibility(notification.getShouldShowActions() ? 0 : 8);
            ImageView subtitleDivider = this.binding.subtitleDivider;
            Intrinsics.checkNotNullExpressionValue(subtitleDivider, "subtitleDivider");
            subtitleDivider.setVisibility(notification.getSubtitleLeft() != null && notification.getSubtitleRight() != null ? 0 : 8);
            if (notification.getBody() != null) {
                this.binding.body.setText(notification.getBody());
                TextView body3 = this.binding.body;
                Intrinsics.checkNotNullExpressionValue(body3, "body");
                body3.setVisibility(0);
            }
            if (notification.getSubtitleLeft() != null) {
                this.binding.subtitleLeft.setText(notification.getSubtitleLeft());
                TextView subtitleLeft2 = this.binding.subtitleLeft;
                Intrinsics.checkNotNullExpressionValue(subtitleLeft2, "subtitleLeft");
                subtitleLeft2.setVisibility(0);
            } else if (notification.getSeverity() != null) {
                this.binding.subtitleLeft.setText(notification.getSeverity());
                TextView subtitleLeft3 = this.binding.subtitleLeft;
                Intrinsics.checkNotNullExpressionValue(subtitleLeft3, "subtitleLeft");
                subtitleLeft3.setVisibility(0);
            }
            if (notification.getSubtitleRight() != null) {
                this.binding.subtitleRight.setText(notification.getSubtitleRight());
                TextView subtitleRight2 = this.binding.subtitleRight;
                Intrinsics.checkNotNullExpressionValue(subtitleRight2, "subtitleRight");
                subtitleRight2.setVisibility(0);
            } else if (notification.getStartTime() != null) {
                this.binding.subtitleLeft.setText(notification.getStartTime());
                TextView subtitleLeft4 = this.binding.subtitleLeft;
                Intrinsics.checkNotNullExpressionValue(subtitleLeft4, "subtitleLeft");
                subtitleLeft4.setVisibility(0);
            }
            if (notification.getEnabledByUsername() != null) {
                TextView subtitleLeftAuthor2 = this.binding.subtitleLeftAuthor;
                Intrinsics.checkNotNullExpressionValue(subtitleLeftAuthor2, "subtitleLeftAuthor");
                subtitleLeftAuthor2.setVisibility(0);
                this.binding.subtitleLeftAuthor.setText(notification.getEnabledByUsername());
            }
            if (notification.getEnabledByColor() != null) {
                this.binding.subtitleLeftAuthor.setTextColor(notification.getEnabledByColor().intValue());
            }
            if (notification.getEnabledByAvatarURL() != null) {
                SimpleDraweeView subtitleLeftAvatar2 = this.binding.subtitleLeftAvatar;
                Intrinsics.checkNotNullExpressionValue(subtitleLeftAvatar2, "subtitleLeftAvatar");
                subtitleLeftAvatar2.setVisibility(0);
                SimpleDraweeView subtitleLeftAvatar3 = this.binding.subtitleLeftAvatar;
                Intrinsics.checkNotNullExpressionValue(subtitleLeftAvatar3, "subtitleLeftAvatar");
                ReactAssetUtilsKt.setReactImageUrl(subtitleLeftAvatar3, notification.getEnabledByAvatarURL());
            }
        }
        String actionsIconURL = moderationContext.getActionsIconURL();
        String actionsText = moderationContext.getActionsText();
        DCDButton dCDButton = this.binding.actionsButton;
        if (actionsIconURL != null) {
            dCDButton.setIcon(actionsIconURL, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton.setText(actionsText);
        dCDButton.setOnClickButtonListener(onTapAutoModerationActions);
        String feedbackText = moderationContext.getFeedbackText();
        DCDButton dCDButton2 = this.binding.feedbackButton;
        dCDButton2.setText(feedbackText);
        dCDButton2.setOnClickButtonListener(onTapAutoModerationFeedback);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        return !this.allowChildGestures;
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    @NotNull
    /* JADX INFO: renamed from: spacingPxOverride */
    public Integer getBottomSpacingPx() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    public /* synthetic */ AutoModerationNotificationEmbedView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoModerationNotificationEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AutoModerationNotificationEmbedViewBinding autoModerationNotificationEmbedViewBindingInflate = AutoModerationNotificationEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(autoModerationNotificationEmbedViewBindingInflate, "inflate(...)");
        this.binding = autoModerationNotificationEmbedViewBindingInflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
        View root = autoModerationNotificationEmbedViewBindingInflate.getRoot();
        root.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        Intrinsics.checkNotNull(root);
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(8));
        TextView textView = autoModerationNotificationEmbedViewBindingInflate.header;
        textView.setTextColor(ThemeManagerKt.getTheme().getTextFeedbackCritical());
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f, 20.0f);
        textView.setLineSpacing(0.0f, 1.05f);
        ImageView imageView = autoModerationNotificationEmbedViewBindingInflate.subtitleDivider;
        imageView.setBackgroundColor(ThemeManagerKt.getTheme().getBorderSubtle());
        Intrinsics.checkNotNull(imageView);
        ViewClippingUtilsKt.clipToRoundedRectangle(imageView, SizeUtilsKt.getDpToPx(4));
        TextView textView2 = autoModerationNotificationEmbedViewBindingInflate.subtitleLeft;
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f, 20.0f);
        TextView textView3 = autoModerationNotificationEmbedViewBindingInflate.subtitleRight;
        textView3.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView3);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f, 20.0f);
        TextView textView4 = autoModerationNotificationEmbedViewBindingInflate.subtitleLeftAuthor;
        textView4.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView4);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f, 20.0f);
        TextView textView5 = autoModerationNotificationEmbedViewBindingInflate.body;
        textView5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(textView5);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont2);
        SetTextSizeSpKt.setTextSizeSp(textView5, FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context) ? 14.0f : 16.0f);
        autoModerationNotificationEmbedViewBindingInflate.actions.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
        ImageView imageView2 = autoModerationNotificationEmbedViewBindingInflate.separatorDot;
        imageView2.setBackgroundColor(ThemeManagerKt.getTheme().getBorderSubtle());
        Intrinsics.checkNotNull(imageView2);
        ViewClippingUtilsKt.clipToRoundedRectangle(imageView2, SizeUtilsKt.getDpToPx(4));
        DCDButton dCDButton = autoModerationNotificationEmbedViewBindingInflate.actionsButton;
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextLink()));
        dCDButton.setDiscordFont(discordFont2);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
        DCDButton dCDButton2 = autoModerationNotificationEmbedViewBindingInflate.feedbackButton;
        dCDButton2.setTextSizeSp(12.0f);
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextLink()));
        dCDButton2.setDiscordFont(discordFont2);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
    }
}
