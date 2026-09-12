package com.discord.chat.presentation.message.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.databinding.GiftViewBinding;
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.views.image.ReactImageView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/view/GiftView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "initTextStyling", "()V", "", "accessoryId", "", "didResolve", "(J)Z", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "gift", "bindSplash", "(Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;Z)V", "Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "onTapEmbed", "onTapAccept", "bind", "(Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/databinding/GiftViewBinding;", "binding", "Lcom/discord/chat/databinding/GiftViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/GiftViewBinding;", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "lastState", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "Landroid/animation/LayoutTransition;", "resolvedTransition", "Landroid/animation/LayoutTransition;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGiftView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftView.kt\ncom/discord/chat/presentation/message/view/GiftView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,229:1\n13493#2,2:230\n257#3,2:232\n257#3,2:235\n257#3,2:237\n257#3,2:239\n257#3,2:242\n257#3,2:244\n257#3,2:246\n1#4:234\n27#5:241\n*S KotlinDebug\n*F\n+ 1 GiftView.kt\ncom/discord/chat/presentation/message/view/GiftView\n*L\n105#1:230,2\n110#1:232,2\n122#1:235,2\n139#1:237,2\n145#1:239,2\n151#1:242,2\n152#1:244,2\n165#1:246,2\n150#1:241\n*E\n"})
public final class GiftView extends CardView {

    @NotNull
    private final GiftViewBinding binding;
    private Companion.State lastState;

    @NotNull
    private final LayoutTransition resolvedTransition;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GiftView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$14(Function1 function1, GiftEmbed giftEmbed, View view) {
        function1.invoke(((GiftEmbed.Resolved.Valid) giftEmbed).getGiftCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$17$lambda$16(Function1 function1, GiftEmbed giftEmbed, View view) {
        function1.invoke(((GiftEmbed.Resolved.Valid) giftEmbed).getGiftCode());
    }

    private final void bindSplash(GiftEmbed.Resolved.Valid gift, boolean didResolve) {
        f9.c cVarA;
        ((GenericDraweeHierarchy) this.binding.splash.getHierarchy()).l(didResolve ? ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS : 0);
        int iE = b1.c.e(gift.getBackgroundColor(), ho.c.b(gift.getSplashOpacity() * 255));
        SimpleDraweeView simpleDraweeView = this.binding.splash;
        ImageRequest imageRequestFromUri = ImageRequest.fromUri(gift.getSplashUrl());
        if (imageRequestFromUri != null) {
            PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = c9.a.f3531a.get();
            ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(imageRequestFromUri);
            imageRequestBuilderB.f5135l = new PostProcessor.Composite(PostProcessor.Grayscale.INSTANCE, new PostProcessor.Gradient(PostProcessor.Gradient.Direction.TopToBottom, iE, gift.getBackgroundColor(), 0.0f, 0.5f, 8, null)).create();
            pipelineDraweeControllerBuilder.f4633b = imageRequestBuilderB.a();
            pipelineDraweeControllerBuilder.f4632a = a3.e.m("splash-", gift.getGiftCode(), "-", gift.getSplashUrl());
            pipelineDraweeControllerBuilder.f4638g = this.binding.splash.getController();
            cVarA = pipelineDraweeControllerBuilder.a();
        } else {
            cVarA = null;
        }
        simpleDraweeView.setController(cVarA);
    }

    private final boolean didResolve(long accessoryId) {
        Companion.State state = this.lastState;
        Companion.State.Resolving resolving = state instanceof Companion.State.Resolving ? (Companion.State.Resolving) state : null;
        return resolving != null && resolving.getAccessoryId() == accessoryId;
    }

    private final void initTextStyling() {
        TextView textView = this.binding.header;
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
        TextView textView2 = this.binding.title;
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView2.setMarqueeRepeatLimit(-1);
        TextView textView3 = this.binding.subtitle;
        Intrinsics.checkNotNull(textView3);
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        TextView textView4 = this.binding.body;
        Intrinsics.checkNotNull(textView4);
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
        DCDButton dCDButton = this.binding.acceptButton;
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setDiscordFont(discordFont);
    }

    public final void bind(@NotNull GiftMessageAccessory accessory, @NotNull final Function1<? super String, Unit> onTapEmbed, @NotNull final Function1<? super String, Unit> onTapAccept) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapEmbed, "onTapEmbed");
        Intrinsics.checkNotNullParameter(onTapAccept, "onTapAccept");
        setCardBackgroundColor(accessory.getGift().getBackgroundColor());
        ConstraintLayout content = this.binding.content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(content, false, null, 1, null);
        GiftEmbed gift = accessory.getGift();
        if (gift instanceof GiftEmbed.Resolving) {
            GiftEmbed.Resolving resolving = (GiftEmbed.Resolving) gift;
            GradientDrawable gradientDrawable = new GradientDrawable(ViewUtilsKt.isLtr(this) ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{resolving.getResolvingGradientStart(), resolving.getResolvingGradientEnd()});
            gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(4));
            int[] referencedIds = this.binding.gradients.getReferencedIds();
            Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
            for (int i7 : referencedIds) {
                this.binding.getRoot().findViewById(i7).setBackground(gradientDrawable);
            }
            Group group = this.binding.gradients;
            Intrinsics.checkNotNull(group);
            group.setVisibility(0);
            group.setAlpha(0.5f);
            this.lastState = new Companion.State.Resolving(accessory.getItemId().longValue());
            return;
        }
        if (!(gift instanceof GiftEmbed.Resolved)) {
            throw new rn.n();
        }
        boolean zDidResolve = didResolve(accessory.getItemId().longValue());
        ConstraintLayout constraintLayout = this.binding.content;
        LayoutTransition layoutTransition = this.resolvedTransition;
        if (!zDidResolve) {
            layoutTransition = null;
        }
        constraintLayout.setLayoutTransition(layoutTransition);
        Group gradients = this.binding.gradients;
        Intrinsics.checkNotNullExpressionValue(gradients, "gradients");
        gradients.setVisibility(8);
        TextView textView = this.binding.header;
        textView.setText(gift.getHeaderText());
        textView.setTextColor(gift.getHeaderColor());
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        Intrinsics.checkNotNull(simpleDraweeView);
        final GiftEmbed.Resolved resolved = (GiftEmbed.Resolved) gift;
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, resolved.getThumbnailUrl());
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) simpleDraweeView.getHierarchy();
        float dpToPx = SizeUtilsKt.getDpToPx(gift.getThumbnailCornerRadius());
        i9.b bVar = new i9.b();
        float[] fArr = new float[8];
        bVar.f11404c = fArr;
        Arrays.fill(fArr, dpToPx);
        genericDraweeHierarchy.p(bVar);
        TextView textView2 = this.binding.title;
        textView2.setText(resolved.getTitleText());
        textView2.setTextColor(resolved.getTitleColor());
        Intrinsics.checkNotNull(textView2);
        CharSequence text = textView2.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(!StringsKt.K(text) ? 0 : 8);
        TextView textView3 = this.binding.subtitle;
        textView3.setText(resolved.getSubtitle());
        textView3.setTextColor(resolved.getSubtitleColor());
        Intrinsics.checkNotNull(textView3);
        CharSequence text2 = textView3.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        textView3.setVisibility(!StringsKt.K(text2) ? 0 : 8);
        if (resolved instanceof GiftEmbed.Resolved.Invalid) {
            ((GenericDraweeHierarchy) this.binding.thumbnail.getHierarchy()).k(new ColorDrawable(((GiftEmbed.Resolved.Invalid) gift).getThumbnailBackgroundColor()), 0);
            TextView body = this.binding.body;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            body.setVisibility(8);
            DCDButton acceptButton = this.binding.acceptButton;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            acceptButton.setVisibility(8);
        } else {
            if (!(resolved instanceof GiftEmbed.Resolved.Valid)) {
                throw new rn.n();
            }
            ConstraintLayout content2 = this.binding.content;
            Intrinsics.checkNotNullExpressionValue(content2, "content");
            final int i10 = 0;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(content2, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            GiftView.bind$lambda$14(onTapEmbed, resolved, view);
                            break;
                        default:
                            GiftView.bind$lambda$17$lambda$16(onTapEmbed, resolved, view);
                            break;
                    }
                }
            }, 1, null);
            GiftEmbed.Resolved.Valid valid = (GiftEmbed.Resolved.Valid) gift;
            bindSplash(valid, zDidResolve);
            ((GenericDraweeHierarchy) this.binding.thumbnail.getHierarchy()).k(null, 0);
            TextView textView4 = this.binding.body;
            textView4.setText(valid.getBodyText());
            textView4.setTextColor(valid.getBodyTextColor());
            Intrinsics.checkNotNull(textView4);
            CharSequence text3 = textView4.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            textView4.setVisibility(StringsKt.K(text3) ? 8 : 0);
            DCDButton dCDButton = this.binding.acceptButton;
            dCDButton.setText(valid.getAcceptLabelText());
            dCDButton.setTextColor(Integer.valueOf(valid.getAcceptLabelColor()));
            dCDButton.setBackgroundColor(valid.getAcceptLabelBackgroundColor());
            final int i11 = 1;
            dCDButton.setOnClickButtonListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            GiftView.bind$lambda$14(onTapAccept, resolved, view);
                            break;
                        default:
                            GiftView.bind$lambda$17$lambda$16(onTapAccept, resolved, view);
                            break;
                    }
                }
            });
            dCDButton.setEnabled(valid.getCanBeAccepted());
            Intrinsics.checkNotNull(dCDButton);
        }
        this.lastState = new Companion.State.Resolved(accessory.getItemId().longValue());
    }

    @NotNull
    public final GiftViewBinding getBinding() {
        return this.binding;
    }

    public /* synthetic */ GiftView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GiftViewBinding giftViewBindingInflate = GiftViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(giftViewBindingInflate, "inflate(...)");
        this.binding = giftViewBindingInflate;
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
