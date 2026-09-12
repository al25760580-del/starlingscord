package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.referral.ReferralEmbedRedesign;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.databinding.ReferralViewRedesignBinding;
import com.discord.chat.presentation.message.messagepart.ReferralRedesignMessageAccessory;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.drawable.GetDrawableCompatKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/ReferralRedesignView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/presentation/message/messagepart/ReferralRedesignMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "", "onTapAccept", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "bind", "(Lcom/discord/chat/presentation/message/messagepart/ReferralRedesignMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/databinding/ReferralViewRedesignBinding;", "binding", "Lcom/discord/chat/databinding/ReferralViewRedesignBinding;", "getBinding", "()Lcom/discord/chat/databinding/ReferralViewRedesignBinding;", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReferralRedesignView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferralRedesignView.kt\ncom/discord/chat/presentation/message/view/ReferralRedesignView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,178:1\n1#2:179\n257#3,2:180\n257#3,2:182\n257#3,2:184\n257#3,2:186\n257#3,2:188\n257#3,2:190\n257#3,2:192\n257#3,2:194\n*S KotlinDebug\n*F\n+ 1 ReferralRedesignView.kt\ncom/discord/chat/presentation/message/view/ReferralRedesignView\n*L\n95#1:180,2\n108#1:182,2\n133#1:184,2\n139#1:186,2\n161#1:188,2\n164#1:190,2\n171#1:192,2\n174#1:194,2\n*E\n"})
public final class ReferralRedesignView extends LinearLayout {

    @NotNull
    private final ReferralViewRedesignBinding binding;

    @NotNull
    private final CardView cardView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReferralRedesignView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$13$lambda$11(Function2 function2, ReferralRedesignMessageAccessory referralRedesignMessageAccessory, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(referralRedesignMessageAccessory.getMessageId()), node);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7$lambda$6(Function2 function2, ReferralRedesignMessageAccessory referralRedesignMessageAccessory, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(referralRedesignMessageAccessory.getMessageId()), node);
        return Unit.f14616a;
    }

    public final void bind(@NotNull final ReferralRedesignMessageAccessory accessory, @NotNull Function1<? super String, Unit> onTapAccept, @NotNull final Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapAccept, "onTapAccept");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        ReferralEmbedRedesign referral = accessory.getReferral();
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.titleText;
        Integer titleColor = referral.getTitleColor();
        if (titleColor != null) {
            simpleDraweeSpanTextView.setTextColor(titleColor.intValue());
        }
        if (referral.getLearnMoreLink() != null) {
            AnnotatedStructurableText learnMoreLink = referral.getLearnMoreLink();
            Context context = simpleDraweeSpanTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strMo575getMessageId3Eiw7ao = accessory.getMessageId();
            Paint.FontMetrics fontMetrics = simpleDraweeSpanTextView.getPaint().getFontMetrics();
            Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
            float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
            TextPaint paint = simpleDraweeSpanTextView.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            final int i7 = 0;
            simpleDraweeSpanTextView.setDraweeSpanStringBuilder(TextUtilsKt.toSpannable(learnMoreLink, context, strMo575getMessageId3Eiw7ao, false, true, false, false, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new Function1() { // from class: com.discord.chat.presentation.message.view.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i7) {
                        case 0:
                            return ReferralRedesignView.bind$lambda$7$lambda$6(onTapLink, accessory, (LinkContentNode) obj);
                        default:
                            return ReferralRedesignView.bind$lambda$13$lambda$11(onTapLink, accessory, (LinkContentNode) obj);
                    }
                }
            }, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false));
            Intrinsics.checkNotNull(simpleDraweeSpanTextView);
            NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(simpleDraweeSpanTextView, true);
        } else {
            simpleDraweeSpanTextView.setText(referral.getTitleText());
        }
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        simpleDraweeSpanTextView.setVisibility((referral.getLearnMoreLink() == null && StringsKt.K(referral.getTitleText())) ? 8 : 0);
        Integer backgroundColor = referral.getBackgroundColor();
        if (backgroundColor != null) {
            int iIntValue = backgroundColor.intValue();
            Drawable background = this.binding.cardContent.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(iIntValue);
            } else {
                this.binding.cardContent.setBackgroundColor(iIntValue);
            }
        }
        SimpleDraweeView headerImage = this.binding.headerImage;
        Intrinsics.checkNotNullExpressionValue(headerImage, "headerImage");
        ReactAssetUtilsKt.setOptionalReactImageUrl(headerImage, referral.getHeaderImageUrl());
        TextView textView = this.binding.headerText;
        textView.setText(referral.getHeaderText());
        Integer headerColor = referral.getHeaderColor();
        if (headerColor != null) {
            textView.setTextColor(headerColor.intValue());
        }
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(!StringsKt.K(referral.getHeaderText()) ? 0 : 8);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = this.binding.bodyText;
        String bodyText = referral.getBodyText();
        if (bodyText != null && !StringsKt.K(bodyText)) {
            simpleDraweeSpanTextView2.setText(referral.getBodyText());
        } else if (referral.getStructuredBodyText() != null) {
            AnnotatedStructurableText structuredBodyText = referral.getStructuredBodyText();
            Context context2 = simpleDraweeSpanTextView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String strMo575getMessageId3Eiw7ao2 = accessory.getMessageId();
            Paint.FontMetrics fontMetrics2 = simpleDraweeSpanTextView2.getPaint().getFontMetrics();
            Intrinsics.checkNotNullExpressionValue(fontMetrics2, "getFontMetrics(...)");
            float baselineHeightPx2 = TextUtilsKt.getBaselineHeightPx(fontMetrics2);
            TextPaint paint2 = simpleDraweeSpanTextView2.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
            final int i10 = 1;
            simpleDraweeSpanTextView2.setDraweeSpanStringBuilder(TextUtilsKt.toSpannable(structuredBodyText, context2, strMo575getMessageId3Eiw7ao2, false, true, false, false, paint2, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new Function1() { // from class: com.discord.chat.presentation.message.view.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            return ReferralRedesignView.bind$lambda$7$lambda$6(onTapLink, accessory, (LinkContentNode) obj);
                        default:
                            return ReferralRedesignView.bind$lambda$13$lambda$11(onTapLink, accessory, (LinkContentNode) obj);
                    }
                }
            }, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx2, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false));
            Intrinsics.checkNotNull(simpleDraweeSpanTextView2);
            NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(simpleDraweeSpanTextView2, true);
        }
        Integer bodyTextColor = referral.getBodyTextColor();
        if (bodyTextColor != null) {
            simpleDraweeSpanTextView2.setTextColor(bodyTextColor.intValue());
        }
        Intrinsics.checkNotNull(simpleDraweeSpanTextView2);
        String bodyText2 = referral.getBodyText();
        simpleDraweeSpanTextView2.setVisibility(((bodyText2 == null || StringsKt.K(bodyText2)) && referral.getStructuredBodyText() == null) ? 8 : 0);
        TextView textView2 = this.binding.subText;
        textView2.setText(referral.getSubText());
        Integer subTextColor = referral.getSubTextColor();
        if (subTextColor != null) {
            textView2.setTextColor(subTextColor.intValue());
        }
        Intrinsics.checkNotNull(textView2);
        String subText = referral.getSubText();
        textView2.setVisibility((subText == null || StringsKt.K(subText)) ? 8 : 0);
        String acceptLabelText = referral.getAcceptLabelText();
        if (acceptLabelText == null || StringsKt.K(acceptLabelText)) {
            DCDButton acceptButton = this.binding.acceptButton;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            acceptButton.setVisibility(8);
        } else {
            DCDButton dCDButton = this.binding.acceptButton;
            String acceptLabelIconUrl = referral.getAcceptLabelIconUrl();
            if (acceptLabelIconUrl != null) {
                dCDButton.setIcon(acceptLabelIconUrl, SizeUtilsKt.getDpToPx(20));
            }
            dCDButton.setText(referral.getAcceptLabelText());
            dCDButton.setTextColor(referral.getAcceptLabelColor());
            dCDButton.setOnClickButtonListener(new x(onTapAccept, 0));
            Context context3 = dCDButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Drawable drawableCompat = GetDrawableCompatKt.getDrawableCompat(context3, R.drawable.premium_tier2_gradient);
            GradientDrawable gradientDrawable2 = drawableCompat instanceof GradientDrawable ? (GradientDrawable) drawableCompat : null;
            if (gradientDrawable2 != null) {
                gradientDrawable2.mutate();
                gradientDrawable2.setCornerRadius(SizeUtilsKt.getDpToPx(20));
                dCDButton.setDrawableBackground(gradientDrawable2);
            }
            Boolean canBeAccepted = referral.getCanBeAccepted();
            boolean zBooleanValue = canBeAccepted != null ? canBeAccepted.booleanValue() : false;
            dCDButton.setEnabled(zBooleanValue);
            dCDButton.setAlpha(zBooleanValue ? 1.0f : 0.5f);
            Intrinsics.checkNotNull(dCDButton);
            dCDButton.setVisibility(0);
            Intrinsics.checkNotNull(dCDButton);
        }
        String footerText = referral.getFooterText();
        if (footerText == null || StringsKt.K(footerText)) {
            TextView footer = this.binding.footer;
            Intrinsics.checkNotNullExpressionValue(footer, "footer");
            footer.setVisibility(8);
            return;
        }
        TextView textView3 = this.binding.footer;
        textView3.setText(referral.getFooterText());
        Integer footerTextColor = referral.getFooterTextColor();
        if (footerTextColor != null) {
            textView3.setTextColor(footerTextColor.intValue());
        }
        Intrinsics.checkNotNull(textView3);
        textView3.setVisibility(0);
        Intrinsics.checkNotNull(textView3);
    }

    @NotNull
    public final ReferralViewRedesignBinding getBinding() {
        return this.binding;
    }

    public /* synthetic */ ReferralRedesignView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralRedesignView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ReferralViewRedesignBinding referralViewRedesignBindingInflate = ReferralViewRedesignBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(referralViewRedesignBindingInflate, "inflate(...)");
        this.binding = referralViewRedesignBindingInflate;
        setOrientation(1);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = referralViewRedesignBindingInflate.titleText;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 16.0f);
        TextView headerText = referralViewRedesignBindingInflate.headerText;
        Intrinsics.checkNotNullExpressionValue(headerText, "headerText");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(headerText, discordFont2);
        SimpleDraweeSpanTextView bodyText = referralViewRedesignBindingInflate.bodyText;
        Intrinsics.checkNotNullExpressionValue(bodyText, "bodyText");
        DiscordFontUtilsKt.setDiscordFont(bodyText, discordFont);
        TextView subText = referralViewRedesignBindingInflate.subText;
        Intrinsics.checkNotNullExpressionValue(subText, "subText");
        DiscordFontUtilsKt.setDiscordFont(subText, discordFont);
        DCDButton dCDButton = referralViewRedesignBindingInflate.acceptButton;
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setDiscordFont(discordFont2);
        TextView footer = referralViewRedesignBindingInflate.footer;
        Intrinsics.checkNotNullExpressionValue(footer, "footer");
        DiscordFontUtilsKt.setDiscordFont(footer, discordFont);
        LinearLayout linearLayout = referralViewRedesignBindingInflate.cardContent;
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(16));
        linearLayout.setBackground(gradientDrawable);
        CardView cardView = new CardView(context, null);
        cardView.setUseCompatPadding(true);
        cardView.setRadius(SizeUtilsKt.getDpToPx(16));
        cardView.setCardElevation(SizeUtilsKt.getDpToPx(1));
        this.cardView = cardView;
    }
}
