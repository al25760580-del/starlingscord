package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.bridge.gift_intent.GiftIntentEmbed;
import com.discord.chat.bridge.gift_intent.GiftIntentSubHeaderPart;
import com.discord.chat.databinding.GiftIntentViewBinding;
import com.discord.chat.presentation.message.messagepart.GiftIntentMessageAccessory;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.logging.Log;
import com.discord.misc.utilities.drawable.GetDrawableCompatKt;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u00016B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0017\u001a\u00020\u000e2 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0010Ju\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00122\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00122\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\u0010R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R0\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00102R0\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R0\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010+¨\u00067"}, d2 = {"Lcom/discord/chat/presentation/message/view/GiftIntentView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/discord/chat/bridge/gift_intent/GiftIntentSubHeaderPart;", "parts", "", "composeSubHeader", "(Ljava/util/List;)Ljava/lang/CharSequence;", "", "handlePrimaryCtaTapped", "()V", "handleSecondaryCtaTapped", "Lkotlin/Function3;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/UserId;", "", "callback", "handleCtaTapped", "(Lkotlin/jvm/functions/Function3;)V", "onFinishInflate", "Lcom/discord/chat/presentation/message/messagepart/GiftIntentMessageAccessory;", "accessory", "onViewed", "onPrimaryCtaTapped", "onSecondaryCtaTapped", "bind", "(Lcom/discord/chat/presentation/message/messagepart/GiftIntentMessageAccessory;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "onAttachedToWindow", "Lcom/discord/chat/databinding/GiftIntentViewBinding;", "binding", "Lcom/discord/chat/databinding/GiftIntentViewBinding;", "Landroid/graphics/drawable/GradientDrawable;", "primaryCtaBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "secondaryCtaBackgroundDrawable", "borderDrawable", "cardStrokeWidth", "I", "ctaStrokeWidth", "messageId", "Ljava/lang/String;", "", "hasViewed", "Z", "Lkotlin/jvm/functions/Function3;", "recipientUserId", "Lcom/discord/primitives/UserId;", "giftIntentType", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGiftIntentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftIntentView.kt\ncom/discord/chat/presentation/message/view/GiftIntentView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,192:1\n1#2:193\n257#3,2:194\n257#3,2:196\n257#3,2:198\n257#3,2:200\n*S KotlinDebug\n*F\n+ 1 GiftIntentView.kt\ncom/discord/chat/presentation/message/view/GiftIntentView\n*L\n107#1:194,2\n108#1:196,2\n114#1:198,2\n115#1:200,2\n*E\n"})
public final class GiftIntentView extends CardView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String LOG_TAG = "GiftIntentView";

    @Deprecated
    public static final int UNBOUND_GIFT_INTENT_TYPE = -1;
    private GiftIntentViewBinding binding;

    @NotNull
    private final GradientDrawable borderDrawable;
    private final int cardStrokeWidth;
    private final int ctaStrokeWidth;
    private int giftIntentType;
    private boolean hasViewed;
    private String messageId;
    private Function3 onPrimaryCtaTapped;
    private Function3 onSecondaryCtaTapped;
    private Function3 onViewed;
    private GradientDrawable primaryCtaBackgroundDrawable;
    private UserId recipientUserId;
    private GradientDrawable secondaryCtaBackgroundDrawable;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/GiftIntentView$Companion;", "", "<init>", "()V", "UNBOUND_GIFT_INTENT_TYPE", "", "LOG_TAG", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GiftIntentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final CharSequence composeSubHeader(List<GiftIntentSubHeaderPart> parts) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (GiftIntentSubHeaderPart giftIntentSubHeaderPart : parts) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) giftIntentSubHeaderPart.getText());
            if (giftIntentSubHeaderPart.getBold()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    private final void handleCtaTapped(Function3 callback) {
        UserId userId;
        String str = this.messageId;
        if (str == null || (userId = this.recipientUserId) == null) {
            return;
        }
        long jM1217unboximpl = userId.m1217unboximpl();
        if (callback == null || this.giftIntentType == -1) {
            return;
        }
        callback.invoke(MessageId.m1156boximpl(str), UserId.m1208boximpl(jM1217unboximpl), Integer.valueOf(this.giftIntentType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePrimaryCtaTapped() {
        handleCtaTapped(this.onPrimaryCtaTapped);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSecondaryCtaTapped() {
        handleCtaTapped(this.onSecondaryCtaTapped);
    }

    public final void bind(@NotNull GiftIntentMessageAccessory accessory, @NotNull Function3 onViewed, @NotNull Function3 onPrimaryCtaTapped, @NotNull Function3 onSecondaryCtaTapped) {
        GradientDrawable gradientDrawable;
        Drawable drawableMutate;
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onViewed, "onViewed");
        Intrinsics.checkNotNullParameter(onPrimaryCtaTapped, "onPrimaryCtaTapped");
        Intrinsics.checkNotNullParameter(onSecondaryCtaTapped, "onSecondaryCtaTapped");
        GiftIntentEmbed giftIntent = accessory.getGiftIntent();
        this.hasViewed = false;
        this.messageId = accessory.getMessageId();
        Long lA0 = StringsKt.a0(giftIntent.getRecipientUserId());
        GiftIntentViewBinding giftIntentViewBinding = null;
        UserId userIdM1208boximpl = lA0 != null ? UserId.m1208boximpl(UserId.m1209constructorimpl(lA0.longValue())) : null;
        this.recipientUserId = userIdM1208boximpl;
        if (userIdM1208boximpl == null) {
            Log.w$default(Log.INSTANCE, LOG_TAG, "Invalid gift intent recipient user id", (Throwable) null, 4, (Object) null);
        }
        this.giftIntentType = giftIntent.getGiftIntentType();
        this.onViewed = onViewed;
        this.onPrimaryCtaTapped = onPrimaryCtaTapped;
        this.onSecondaryCtaTapped = onSecondaryCtaTapped;
        setCardBackgroundColor(giftIntent.getBackgroundColor());
        if (giftIntent.getBackgroundColor() == giftIntent.getBorderColor()) {
            gradientDrawable = null;
        } else {
            gradientDrawable = this.borderDrawable;
            gradientDrawable.setStroke(this.cardStrokeWidth, giftIntent.getBorderColor());
        }
        setForeground(gradientDrawable);
        GiftIntentViewBinding giftIntentViewBinding2 = this.binding;
        if (giftIntentViewBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding2 = null;
        }
        SimpleDraweeView recipientAvatar = giftIntentViewBinding2.recipientAvatar;
        Intrinsics.checkNotNullExpressionValue(recipientAvatar, "recipientAvatar");
        ReactAssetUtilsKt.setOptionalReactImageUrl(recipientAvatar, giftIntent.getRecipientAvatarUrl());
        GiftIntentViewBinding giftIntentViewBinding3 = this.binding;
        if (giftIntentViewBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding3 = null;
        }
        giftIntentViewBinding3.avatarContainer.setContentDescription(giftIntent.getRecipientName());
        if (giftIntent.getCurrentUserAvatarUrl() != null) {
            GiftIntentViewBinding giftIntentViewBinding4 = this.binding;
            if (giftIntentViewBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding4 = null;
            }
            SimpleDraweeView currentUserAvatar = giftIntentViewBinding4.currentUserAvatar;
            Intrinsics.checkNotNullExpressionValue(currentUserAvatar, "currentUserAvatar");
            currentUserAvatar.setVisibility(0);
            GiftIntentViewBinding giftIntentViewBinding5 = this.binding;
            if (giftIntentViewBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding5 = null;
            }
            View recipientAvatarCutout = giftIntentViewBinding5.recipientAvatarCutout;
            Intrinsics.checkNotNullExpressionValue(recipientAvatarCutout, "recipientAvatarCutout");
            recipientAvatarCutout.setVisibility(0);
            GiftIntentViewBinding giftIntentViewBinding6 = this.binding;
            if (giftIntentViewBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding6 = null;
            }
            Drawable background = giftIntentViewBinding6.recipientAvatarCutout.getBackground();
            if (background != null && (drawableMutate = background.mutate()) != null) {
                drawableMutate.setTint(giftIntent.getBackgroundColor());
            }
            GiftIntentViewBinding giftIntentViewBinding7 = this.binding;
            if (giftIntentViewBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding7 = null;
            }
            SimpleDraweeView currentUserAvatar2 = giftIntentViewBinding7.currentUserAvatar;
            Intrinsics.checkNotNullExpressionValue(currentUserAvatar2, "currentUserAvatar");
            ReactAssetUtilsKt.setOptionalReactImageUrl(currentUserAvatar2, giftIntent.getCurrentUserAvatarUrl());
        } else {
            GiftIntentViewBinding giftIntentViewBinding8 = this.binding;
            if (giftIntentViewBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding8 = null;
            }
            SimpleDraweeView currentUserAvatar3 = giftIntentViewBinding8.currentUserAvatar;
            Intrinsics.checkNotNullExpressionValue(currentUserAvatar3, "currentUserAvatar");
            currentUserAvatar3.setVisibility(8);
            GiftIntentViewBinding giftIntentViewBinding9 = this.binding;
            if (giftIntentViewBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding9 = null;
            }
            View recipientAvatarCutout2 = giftIntentViewBinding9.recipientAvatarCutout;
            Intrinsics.checkNotNullExpressionValue(recipientAvatarCutout2, "recipientAvatarCutout");
            recipientAvatarCutout2.setVisibility(8);
            GiftIntentViewBinding giftIntentViewBinding10 = this.binding;
            if (giftIntentViewBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                giftIntentViewBinding10 = null;
            }
            SimpleDraweeView currentUserAvatar4 = giftIntentViewBinding10.currentUserAvatar;
            Intrinsics.checkNotNullExpressionValue(currentUserAvatar4, "currentUserAvatar");
            ReactAssetUtilsKt.setOptionalReactImageUrl(currentUserAvatar4, null);
        }
        GiftIntentViewBinding giftIntentViewBinding11 = this.binding;
        if (giftIntentViewBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding11 = null;
        }
        giftIntentViewBinding11.headerLabel.setText(giftIntent.getHeaderText());
        GiftIntentViewBinding giftIntentViewBinding12 = this.binding;
        if (giftIntentViewBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding12 = null;
        }
        giftIntentViewBinding12.headerLabel.setTextColor(giftIntent.getHeaderTextColor());
        GiftIntentViewBinding giftIntentViewBinding13 = this.binding;
        if (giftIntentViewBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding13 = null;
        }
        giftIntentViewBinding13.subHeaderLabel.setText(composeSubHeader(giftIntent.getSubHeaderParts()));
        GiftIntentViewBinding giftIntentViewBinding14 = this.binding;
        if (giftIntentViewBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding14 = null;
        }
        giftIntentViewBinding14.subHeaderLabel.setTextColor(giftIntent.getSubHeaderTextColor());
        GiftIntentViewBinding giftIntentViewBinding15 = this.binding;
        if (giftIntentViewBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding15 = null;
        }
        SimpleDraweeView subHeaderIcon = giftIntentViewBinding15.subHeaderIcon;
        Intrinsics.checkNotNullExpressionValue(subHeaderIcon, "subHeaderIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(subHeaderIcon, giftIntent.getSubHeaderIconUrl());
        GiftIntentViewBinding giftIntentViewBinding16 = this.binding;
        if (giftIntentViewBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding16 = null;
        }
        SimpleDraweeView subHeaderIcon2 = giftIntentViewBinding16.subHeaderIcon;
        Intrinsics.checkNotNullExpressionValue(subHeaderIcon2, "subHeaderIcon");
        ColorUtilsKt.setTintColor(subHeaderIcon2, Integer.valueOf(giftIntent.getSubHeaderTextColor()));
        GradientDrawable gradientDrawable2 = this.primaryCtaBackgroundDrawable;
        if (gradientDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("primaryCtaBackgroundDrawable");
            gradientDrawable2 = null;
        }
        gradientDrawable2.setColor(ThemeManagerKt.getTheme().getControlPrimaryBackgroundDefault());
        gradientDrawable2.setStroke(this.ctaStrokeWidth, ThemeManagerKt.getTheme().getControlPrimaryBorderDefault());
        GiftIntentViewBinding giftIntentViewBinding17 = this.binding;
        if (giftIntentViewBinding17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding17 = null;
        }
        giftIntentViewBinding17.primaryCtaLabel.setText(giftIntent.getPrimaryCtaLabel());
        GiftIntentViewBinding giftIntentViewBinding18 = this.binding;
        if (giftIntentViewBinding18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding18 = null;
        }
        giftIntentViewBinding18.primaryCtaLabel.setTextColor(ThemeManagerKt.getTheme().getControlPrimaryTextDefault());
        GiftIntentViewBinding giftIntentViewBinding19 = this.binding;
        if (giftIntentViewBinding19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding19 = null;
        }
        SimpleDraweeView primaryCtaIcon = giftIntentViewBinding19.primaryCtaIcon;
        Intrinsics.checkNotNullExpressionValue(primaryCtaIcon, "primaryCtaIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(primaryCtaIcon, giftIntent.getPrimaryCtaIconUrl());
        GiftIntentViewBinding giftIntentViewBinding20 = this.binding;
        if (giftIntentViewBinding20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding20 = null;
        }
        SimpleDraweeView primaryCtaIcon2 = giftIntentViewBinding20.primaryCtaIcon;
        Intrinsics.checkNotNullExpressionValue(primaryCtaIcon2, "primaryCtaIcon");
        ColorUtilsKt.setTintColor(primaryCtaIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getControlPrimaryTextDefault()));
        GiftIntentViewBinding giftIntentViewBinding21 = this.binding;
        if (giftIntentViewBinding21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding21 = null;
        }
        giftIntentViewBinding21.primaryCtaButton.setContentDescription(giftIntent.getPrimaryCtaLabel());
        GradientDrawable gradientDrawable3 = this.secondaryCtaBackgroundDrawable;
        if (gradientDrawable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondaryCtaBackgroundDrawable");
            gradientDrawable3 = null;
        }
        gradientDrawable3.setColor(ThemeManagerKt.getTheme().getControlSecondaryBackgroundDefault());
        gradientDrawable3.setStroke(this.ctaStrokeWidth, ThemeManagerKt.getTheme().getControlSecondaryBorderDefault());
        GiftIntentViewBinding giftIntentViewBinding22 = this.binding;
        if (giftIntentViewBinding22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding22 = null;
        }
        SimpleDraweeView secondaryCtaIcon = giftIntentViewBinding22.secondaryCtaIcon;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaIcon, "secondaryCtaIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(secondaryCtaIcon, giftIntent.getSecondaryCtaIconUrl());
        GiftIntentViewBinding giftIntentViewBinding23 = this.binding;
        if (giftIntentViewBinding23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding23 = null;
        }
        SimpleDraweeView secondaryCtaIcon2 = giftIntentViewBinding23.secondaryCtaIcon;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaIcon2, "secondaryCtaIcon");
        ColorUtilsKt.setTintColor(secondaryCtaIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getControlSecondaryTextDefault()));
        GiftIntentViewBinding giftIntentViewBinding24 = this.binding;
        if (giftIntentViewBinding24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            giftIntentViewBinding = giftIntentViewBinding24;
        }
        giftIntentViewBinding.secondaryCtaButton.setContentDescription(giftIntent.getSecondaryCtaAccessibilityLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.giftIntentType == -1 || this.hasViewed) {
            return;
        }
        String str = this.messageId;
        UserId userId = this.recipientUserId;
        Function3 function3 = this.onViewed;
        if (str == null || userId == null || function3 == null) {
            return;
        }
        function3.invoke(MessageId.m1156boximpl(str), userId, Integer.valueOf(this.giftIntentType));
        this.hasViewed = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        GiftIntentViewBinding giftIntentViewBindingBind = GiftIntentViewBinding.bind(this);
        this.binding = giftIntentViewBindingBind;
        if (giftIntentViewBindingBind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBindingBind = null;
        }
        Drawable drawableMutate = giftIntentViewBindingBind.primaryCtaButton.getBackground().mutate();
        Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.primaryCtaBackgroundDrawable = (GradientDrawable) drawableMutate;
        GiftIntentViewBinding giftIntentViewBinding = this.binding;
        if (giftIntentViewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding = null;
        }
        Drawable drawableMutate2 = giftIntentViewBinding.secondaryCtaButton.getBackground().mutate();
        Intrinsics.checkNotNull(drawableMutate2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.secondaryCtaBackgroundDrawable = (GradientDrawable) drawableMutate2;
        GiftIntentViewBinding giftIntentViewBinding2 = this.binding;
        if (giftIntentViewBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            giftIntentViewBinding2 = null;
        }
        TextView headerLabel = giftIntentViewBinding2.headerLabel;
        Intrinsics.checkNotNullExpressionValue(headerLabel, "headerLabel");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(headerLabel, discordFont);
        TextView subHeaderLabel = giftIntentViewBinding2.subHeaderLabel;
        Intrinsics.checkNotNullExpressionValue(subHeaderLabel, "subHeaderLabel");
        DiscordFontUtilsKt.setDiscordFont(subHeaderLabel, DiscordFont.PrimaryNormal);
        TextView primaryCtaLabel = giftIntentViewBinding2.primaryCtaLabel;
        Intrinsics.checkNotNullExpressionValue(primaryCtaLabel, "primaryCtaLabel");
        DiscordFontUtilsKt.setDiscordFont(primaryCtaLabel, discordFont);
        ConstraintLayout primaryCtaButton = giftIntentViewBinding2.primaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(primaryCtaButton, "primaryCtaButton");
        final int i7 = 0;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(primaryCtaButton, false, new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.view.n

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ GiftIntentView f4227e;

            {
                this.f4227e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f4227e.handlePrimaryCtaTapped();
                        break;
                    default:
                        this.f4227e.handleSecondaryCtaTapped();
                        break;
                }
            }
        }, 1, null);
        FrameLayout secondaryCtaButton = giftIntentViewBinding2.secondaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaButton, "secondaryCtaButton");
        final int i10 = 1;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(secondaryCtaButton, false, new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.view.n

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ GiftIntentView f4227e;

            {
                this.f4227e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f4227e.handlePrimaryCtaTapped();
                        break;
                    default:
                        this.f4227e.handleSecondaryCtaTapped();
                        break;
                }
            }
        }, 1, null);
    }

    public /* synthetic */ GiftIntentView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftIntentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawableCompat = GetDrawableCompatKt.getDrawableCompat(context, R.drawable.gift_intent_card_foreground);
        if (drawableCompat != null) {
            Drawable drawableMutate = drawableCompat.mutate();
            Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            this.borderDrawable = (GradientDrawable) drawableMutate;
            this.cardStrokeWidth = getResources().getDimensionPixelSize(R.dimen.gift_intent_card_stroke_width);
            this.ctaStrokeWidth = getResources().getDimensionPixelSize(R.dimen.gift_intent_cta_stroke_width);
            this.giftIntentType = -1;
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
