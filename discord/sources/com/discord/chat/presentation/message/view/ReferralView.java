package com.discord.chat.presentation.message.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.referral.ReferralEmbed;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.databinding.ReferralViewBinding;
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\b0\u00122\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/discord/chat/presentation/message/view/ReferralView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "initTextStyling", "()V", "", "accessoryId", "", "didResolve", "(J)Z", "Lcom/discord/chat/presentation/message/messagepart/ReferralMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "onTapAccept", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "bind", "(Lcom/discord/chat/presentation/message/messagepart/ReferralMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/databinding/ReferralViewBinding;", "binding", "Lcom/discord/chat/databinding/ReferralViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ReferralViewBinding;", "Lcom/discord/chat/presentation/message/view/ReferralView$Companion$State;", "lastState", "Lcom/discord/chat/presentation/message/view/ReferralView$Companion$State;", "Landroid/animation/LayoutTransition;", "resolvedTransition", "Landroid/animation/LayoutTransition;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReferralView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferralView.kt\ncom/discord/chat/presentation/message/view/ReferralView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,218:1\n1#2:219\n257#3,2:220\n257#3,2:222\n257#3,2:224\n257#3,2:226\n257#3,2:228\n257#3,2:230\n257#3,2:232\n257#3,2:234\n*S KotlinDebug\n*F\n+ 1 ReferralView.kt\ncom/discord/chat/presentation/message/view/ReferralView\n*L\n109#1:220,2\n119#1:222,2\n146#1:224,2\n157#1:226,2\n179#1:228,2\n182#1:230,2\n191#1:232,2\n194#1:234,2\n*E\n"})
public final class ReferralView extends CardView {

    @NotNull
    private final ReferralViewBinding binding;
    private Companion.State lastState;

    @NotNull
    private final LayoutTransition resolvedTransition;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReferralView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$13$lambda$11(Function2 function2, ReferralMessageAccessory referralMessageAccessory, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(referralMessageAccessory.getMessageId()), node);
        return Unit.f14616a;
    }

    private final boolean didResolve(long accessoryId) {
        Companion.State state = this.lastState;
        Companion.State.Resolving resolving = state instanceof Companion.State.Resolving ? (Companion.State.Resolving) state : null;
        return resolving != null && resolving.getAccessoryId() == accessoryId;
    }

    private final void initTextStyling() {
        TextView textView = this.binding.imageCopy;
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = this.binding.title;
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont2);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.subtitle;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont2);
        TextView textView3 = this.binding.trialInfo;
        Intrinsics.checkNotNull(textView3);
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        DCDButton dCDButton = this.binding.acceptButton;
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setDiscordFont(discordFont);
        TextView textView4 = this.binding.footer;
        Intrinsics.checkNotNull(textView4);
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void bind(@NotNull ReferralMessageAccessory accessory, @NotNull Function1<? super String, Unit> onTapAccept, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapAccept, "onTapAccept");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        setCardBackgroundColor(accessory.getReferral().getBackgroundColor());
        ConstraintLayout content = this.binding.content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(content, false, null, 1, null);
        ReferralEmbed referral = accessory.getReferral();
        if (referral instanceof ReferralEmbed.Resolving) {
            this.lastState = new Companion.State.Resolving(accessory.getItemId().longValue());
            return;
        }
        if (!(referral instanceof ReferralEmbed.Resolved)) {
            throw new rn.n();
        }
        boolean zDidResolve = didResolve(accessory.getItemId().longValue());
        ConstraintLayout constraintLayout = this.binding.content;
        LayoutTransition layoutTransition = this.resolvedTransition;
        if (!zDidResolve) {
            layoutTransition = null;
        }
        constraintLayout.setLayoutTransition(layoutTransition);
        SimpleDraweeView nitroLogoBanner = this.binding.nitroLogoBanner;
        Intrinsics.checkNotNullExpressionValue(nitroLogoBanner, "nitroLogoBanner");
        ReferralEmbed.Resolved resolved = (ReferralEmbed.Resolved) referral;
        ReactAssetUtilsKt.setOptionalReactImageUrl(nitroLogoBanner, resolved.getHeaderLogoUrl());
        TextView textView = this.binding.imageCopy;
        textView.setText(resolved.getHeaderText());
        textView.setTextColor(resolved.getHeaderColor());
        Intrinsics.checkNotNull(textView);
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(!StringsKt.K(text) ? 0 : 8);
        SimpleDraweeView nitroTicket = this.binding.nitroTicket;
        Intrinsics.checkNotNullExpressionValue(nitroTicket, "nitroTicket");
        ReactAssetUtilsKt.setOptionalReactImageUrl(nitroTicket, resolved.getThumbnailUrl());
        TextView textView2 = this.binding.title;
        textView2.setText(resolved.getTitleText());
        Integer titleColor = resolved.getTitleColor();
        if (titleColor != null) {
            textView2.setTextColor(titleColor.intValue());
        }
        Intrinsics.checkNotNull(textView2);
        CharSequence text2 = textView2.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        textView2.setVisibility(!StringsKt.K(text2) ? 0 : 8);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.subtitle;
        String bodyText = resolved.getBodyText();
        if (bodyText != null && !StringsKt.K(bodyText)) {
            simpleDraweeSpanTextView.setText(resolved.getBodyText());
        } else if (resolved.getStructuredBodyText() != null) {
            AnnotatedStructurableText structuredBodyText = resolved.getStructuredBodyText();
            Context context = simpleDraweeSpanTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strMo575getMessageId3Eiw7ao = accessory.getMessageId();
            Paint.FontMetrics fontMetrics = simpleDraweeSpanTextView.getPaint().getFontMetrics();
            Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
            float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
            TextPaint paint = simpleDraweeSpanTextView.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            simpleDraweeSpanTextView.setDraweeSpanStringBuilder(TextUtilsKt.toSpannable(structuredBodyText, context, strMo575getMessageId3Eiw7ao, false, true, false, false, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new b7.a(14, onTapLink, accessory), (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false));
            Intrinsics.checkNotNull(simpleDraweeSpanTextView);
            NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(simpleDraweeSpanTextView, true);
        }
        Integer bodyTextColor = resolved.getBodyTextColor();
        if (bodyTextColor != null) {
            simpleDraweeSpanTextView.setTextColor(bodyTextColor.intValue());
        }
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        String bodyText2 = resolved.getBodyText();
        simpleDraweeSpanTextView.setVisibility(((bodyText2 == null || StringsKt.K(bodyText2)) && resolved.getStructuredBodyText() == null) ? 8 : 0);
        TextView textView3 = this.binding.trialInfo;
        textView3.setText(resolved.getSubText());
        Intrinsics.checkNotNull(textView3);
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        Integer subTextColor = resolved.getSubTextColor();
        if (subTextColor != null) {
            textView3.setTextColor(subTextColor.intValue());
        }
        CharSequence text3 = textView3.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        textView3.setVisibility(!StringsKt.K(text3) ? 0 : 8);
        String acceptLabelText = resolved.getAcceptLabelText();
        if (acceptLabelText == null || StringsKt.K(acceptLabelText)) {
            DCDButton acceptButton = this.binding.acceptButton;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            acceptButton.setVisibility(8);
        } else {
            DCDButton dCDButton = this.binding.acceptButton;
            String acceptLabelIconUrl = resolved.getAcceptLabelIconUrl();
            if (acceptLabelIconUrl != null) {
                dCDButton.setIcon(acceptLabelIconUrl, SizeUtilsKt.getDpToPx(20));
            }
            dCDButton.setText(resolved.getAcceptLabelText());
            dCDButton.setTextColor(resolved.getAcceptLabelColor());
            dCDButton.setOnClickButtonListener(new x(onTapAccept, 1));
            Context context2 = dCDButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableCompat = GetDrawableCompatKt.getDrawableCompat(context2, R.drawable.premium_tier2_gradient);
            GradientDrawable gradientDrawable = drawableCompat instanceof GradientDrawable ? (GradientDrawable) drawableCompat : null;
            if (gradientDrawable != null) {
                gradientDrawable.mutate();
                gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(20));
                dCDButton.setDrawableBackground(gradientDrawable);
            }
            Boolean canBeAccepted = resolved.getCanBeAccepted();
            boolean zBooleanValue = canBeAccepted != null ? canBeAccepted.booleanValue() : false;
            dCDButton.setEnabled(zBooleanValue);
            dCDButton.setAlpha(zBooleanValue ? 1.0f : 0.5f);
            Intrinsics.checkNotNull(dCDButton);
            dCDButton.setVisibility(0);
            Intrinsics.checkNotNull(dCDButton);
        }
        String footerText = resolved.getFooterText();
        if (footerText == null || StringsKt.K(footerText)) {
            TextView footer = this.binding.footer;
            Intrinsics.checkNotNullExpressionValue(footer, "footer");
            footer.setVisibility(8);
        } else {
            TextView textView4 = this.binding.footer;
            textView4.setText(resolved.getFooterText());
            if (resolved.getFooterTextColor() != null) {
                textView4.setTextColor(resolved.getFooterTextColor().intValue());
            }
            Intrinsics.checkNotNull(textView4);
            textView4.setVisibility(0);
            Intrinsics.checkNotNull(textView4);
        }
        this.lastState = new Companion.State.Resolved(accessory.getItemId().longValue());
    }

    @NotNull
    public final ReferralViewBinding getBinding() {
        return this.binding;
    }

    public /* synthetic */ ReferralView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ReferralViewBinding referralViewBindingInflate = ReferralViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(referralViewBindingInflate, "inflate(...)");
        this.binding = referralViewBindingInflate;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        this.resolvedTransition = layoutTransition;
        setUseCompatPadding(true);
        setClickable(true);
        setRadius(SizeUtilsKt.getDpToPx(4));
        setCardElevation(SizeUtilsKt.getDpToPx(1));
        initTextStyling();
    }
}
