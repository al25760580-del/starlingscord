package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.PostPreviewEmbedViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0099\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020(H\u0002J\u0012\u0010+\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010(H\u0002J\u001f\u0010,\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J&\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u00101\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002J2\u00102\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/PostPreviewEmbedViewBinding;", "setPostPreviewEmbed", "", AlertFragment.ARG_TITLE, "", "subtitle", "ctaCopy", "ctaButtonColor", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageId", "Lcom/discord/primitives/MessageId;", "thumbnailUrl", "blurredThumbnailUrl", "coverImageOverlayText", "backgroundImageUrl", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "isSpoiler", "", "isObscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "setPostPreviewEmbed-4itWklQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "setButtonText", "cta", "", "setButtonColor", "setTitle", "setSubtitle", "setFooter", "setFooter-Ayv7vGE", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "setCoverImage", "url", "setCoverImageButtonText", "setupSpoilerView", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPostPreviewEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPreviewEmbedView.kt\ncom/discord/chat/presentation/message/view/PostPreviewEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,172:1\n257#2,2:173\n257#2,2:175\n257#2,2:177\n257#2,2:179\n255#2:181\n257#2,2:182\n257#2,2:184\n*S KotlinDebug\n*F\n+ 1 PostPreviewEmbedView.kt\ncom/discord/chat/presentation/message/view/PostPreviewEmbedView\n*L\n100#1:173,2\n125#1:175,2\n126#1:177,2\n144#1:179,2\n157#1:181\n161#1:182,2\n164#1:184,2\n*E\n"})
public final class PostPreviewEmbedView extends ConstraintLayout {

    @NotNull
    private final PostPreviewEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setButtonColor(int ctaButtonColor) {
        this.binding.cta.setBackgroundColor(ctaButtonColor);
    }

    private final void setButtonText(CharSequence cta) {
        this.binding.cta.setText(cta);
    }

    private final void setCoverImage(String url, String blurredThumbnailUrl, String backgroundImageUrl) {
        boolean z5 = ((url == null || StringsKt.K(url)) && (blurredThumbnailUrl == null || StringsKt.K(blurredThumbnailUrl))) ? false : true;
        SimpleDraweeView coverImage = this.binding.coverImage;
        Intrinsics.checkNotNullExpressionValue(coverImage, "coverImage");
        coverImage.setVisibility(z5 ? 0 : 8);
        SimpleDraweeView backgroundImage = this.binding.backgroundImage;
        Intrinsics.checkNotNullExpressionValue(backgroundImage, "backgroundImage");
        backgroundImage.setVisibility((!z5 || backgroundImageUrl == null || StringsKt.K(backgroundImageUrl)) ? 8 : 0);
        if (url == null || StringsKt.K(url)) {
            if (blurredThumbnailUrl == null || StringsKt.K(blurredThumbnailUrl)) {
                return;
            }
            SimpleDraweeView coverImage2 = this.binding.coverImage;
            Intrinsics.checkNotNullExpressionValue(coverImage2, "coverImage");
            ReactAssetUtilsKt.setOptionalReactImageUrl(coverImage2, blurredThumbnailUrl);
            return;
        }
        if (backgroundImageUrl == null || StringsKt.K(backgroundImageUrl)) {
            ((GenericDraweeHierarchy) this.binding.coverImage.getHierarchy()).j(com.facebook.drawee.drawable.o.f4689c);
        } else {
            ((GenericDraweeHierarchy) this.binding.coverImage.getHierarchy()).j(com.facebook.drawee.drawable.o.f4692f);
            this.binding.backgroundImage.setImageURI(backgroundImageUrl);
        }
        this.binding.coverImage.setImageURI(url);
    }

    private final void setCoverImageButtonText(String coverImageOverlayText) {
        DCDButton dCDButton = this.binding.coverImageOverlayButton;
        Intrinsics.checkNotNull(dCDButton);
        dCDButton.setVisibility(coverImageOverlayText == null || StringsKt.K(coverImageOverlayText) ? 8 : 0);
        dCDButton.setText(coverImageOverlayText);
    }

    /* JADX INFO: renamed from: setFooter-Ayv7vGE, reason: not valid java name */
    private final void m751setFooterAyv7vGE(StructurableText footer, String messageId) {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.footer;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        Context context = simpleDraweeSpanTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Paint.FontMetrics fontMetrics = simpleDraweeSpanTextView.getPaint().getFontMetrics();
        Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
        float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
        TextPaint paint = simpleDraweeSpanTextView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        ViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, TextUtilsKt.toSpannable(footer, context, messageId, false, false, false, true, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : true, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false));
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(simpleDraweeSpanTextView, false, 1, null);
    }

    private final void setSubtitle(CharSequence subtitle) {
        TextView subtitle2 = this.binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle2, "subtitle");
        subtitle2.setVisibility(subtitle == null || StringsKt.K(subtitle) ? 8 : 0);
        this.binding.subtitle.setText(subtitle);
    }

    private final void setTitle(CharSequence title) {
        this.binding.title.setText(title);
    }

    private final void setupSpoilerView(SpoilerConfig spoilerConfig, boolean isSpoiler, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque) {
        this.binding.spoiler.configure(spoilerConfig, this);
        SpoilerView spoiler = this.binding.spoiler;
        Intrinsics.checkNotNullExpressionValue(spoiler, "spoiler");
        if (spoiler.getVisibility() == 0) {
            this.binding.spoiler.handleObscureAwaitingScan(isObscureAwaitingScan);
            this.binding.spoiler.setRevealButtonVisible(!obscureHideControls);
            this.binding.spoiler.setOpaqueBackgroundVisible(obscureIsOpaque);
            FrameLayout imageBlurBg = this.binding.imageBlurBg;
            Intrinsics.checkNotNullExpressionValue(imageBlurBg, "imageBlurBg");
            imageBlurBg.setVisibility(0);
            this.binding.coverImage.setImportantForAccessibility(4);
            return;
        }
        FrameLayout imageBlurBg2 = this.binding.imageBlurBg;
        Intrinsics.checkNotNullExpressionValue(imageBlurBg2, "imageBlurBg");
        imageBlurBg2.setVisibility(8);
        this.binding.coverImage.setImportantForAccessibility(0);
        if (isSpoiler) {
            this.binding.coverImage.requestFocus();
        }
    }

    /* JADX INFO: renamed from: setPostPreviewEmbed-4itWklQ, reason: not valid java name */
    public final void m752setPostPreviewEmbed4itWklQ(@NotNull String title, String subtitle, @NotNull String ctaCopy, int ctaButtonColor, @NotNull StructurableText footer, @NotNull String messageId, String thumbnailUrl, String blurredThumbnailUrl, String coverImageOverlayText, String backgroundImageUrl, @NotNull View.OnClickListener onButtonClickListener, boolean isSpoiler, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque, SpoilerConfig spoilerConfig) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaCopy, "ctaCopy");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(onButtonClickListener, "onButtonClickListener");
        setButtonText(ctaCopy);
        setButtonColor(ctaButtonColor);
        setTitle(title);
        setSubtitle(subtitle);
        m751setFooterAyv7vGE(footer, messageId);
        setCoverImage(thumbnailUrl, blurredThumbnailUrl, backgroundImageUrl);
        setCoverImageButtonText(coverImageOverlayText);
        this.binding.cta.setOnClickButtonListener(onButtonClickListener);
        SimpleDraweeView coverImage = this.binding.coverImage;
        Intrinsics.checkNotNullExpressionValue(coverImage, "coverImage");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(coverImage, false, onButtonClickListener, 1, null);
        this.binding.coverImageOverlayButton.setOnClickButtonListener(onButtonClickListener);
        setupSpoilerView(spoilerConfig, isSpoiler, isObscureAwaitingScan, obscureHideControls, obscureIsOpaque);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        PostPreviewEmbedViewBinding postPreviewEmbedViewBindingInflate = PostPreviewEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(postPreviewEmbedViewBindingInflate, "inflate(...)");
        this.binding = postPreviewEmbedViewBindingInflate;
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
        TextView textView = postPreviewEmbedViewBindingInflate.title;
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = postPreviewEmbedViewBindingInflate.subtitle;
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = postPreviewEmbedViewBindingInflate.footer;
        simpleDraweeSpanTextView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont);
        DCDButton dCDButton = postPreviewEmbedViewBindingInflate.coverImageOverlayButton;
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLower());
        dCDButton.setAlpha(0.7f);
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(64));
    }
}
