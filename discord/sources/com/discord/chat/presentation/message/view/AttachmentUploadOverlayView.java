package com.discord.chat.presentation.message.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.discord.chat.databinding.AttachmentUploadOverlayViewBinding;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 72\u00020\u0001:\u0003567B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!J\u0014\u0010#\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010JS\u0010$\u001a\u00020\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010&¢\u0006\u0002\u0010-J#\u0010.\u001a\u00020\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00100J\u0018\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020&H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "transitionInDuration", "", "transitionOutDuration", "transitionDelay", "animationStartDelay", "binding", "Lcom/discord/chat/databinding/AttachmentUploadOverlayViewBinding;", "onAnimationComplete", "Lkotlin/Function0;", "", "uploadContext", "Lcom/discord/chat/presentation/message/view/UploadContext;", "progressViewConfig", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$ProgressViewConfig;", "completeViewConfig", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$CompleteViewConfig;", "setUploadCompleteBackgroundVisible", "Landroid/animation/ValueAnimator;", "uploadCompleteCheckmarkFadeInAnim", "Landroid/animation/AnimatorSet;", "uploadCompleteCheckmarkFadeOutAnim", "uploadCompleteAnimationSequence", "resetUploadOverlay", "setProgress", "uploadItemProps", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "setUploadCancel", "setOnProgressAnimationComplete", "configureProgressView", "backgroundSize", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "cancelButtonSize", "primaryColor", "progressIndicatorSize", "trackColor", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "configureCompleteView", "checkmarkButtonSize", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setSquareLayoutParam", "view", "Landroid/view/View;", "dimension", "ProgressViewConfig", "CompleteViewConfig", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttachmentUploadOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachmentUploadOverlayView.kt\ncom/discord/chat/presentation/message/view/AttachmentUploadOverlayView\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,299:1\n29#2:300\n85#2,18:301\n29#2:319\n85#2,18:320\n257#3,2:338\n257#3,2:340\n*S KotlinDebug\n*F\n+ 1 AttachmentUploadOverlayView.kt\ncom/discord/chat/presentation/message/view/AttachmentUploadOverlayView\n*L\n137#1:300\n137#1:301,18\n149#1:319\n149#1:320,18\n173#1:338,2\n177#1:340,2\n*E\n"})
public final class AttachmentUploadOverlayView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long animationStartDelay;

    @NotNull
    private final AttachmentUploadOverlayViewBinding binding;
    private CompleteViewConfig completeViewConfig;

    @NotNull
    private Function0<Unit> onAnimationComplete;
    private ProgressViewConfig progressViewConfig;
    private final long transitionDelay;
    private final long transitionInDuration;
    private final long transitionOutDuration;
    private UploadContext uploadContext;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$Companion;", "", "<init>", "()V", "createAndAttachUploadOverlayView", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "radiusPx", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final AttachmentUploadOverlayView createAndAttachUploadOverlayView(@NotNull ConstraintLayout constraintLayout, int i7) {
            Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AttachmentUploadOverlayView attachmentUploadOverlayView = new AttachmentUploadOverlayView(context, null, 2, 0 == true ? 1 : 0);
            attachmentUploadOverlayView.setId(View.generateViewId());
            ViewClippingUtilsKt.clipToRoundedRectangle(attachmentUploadOverlayView, i7);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, SizeUtilsKt.getDpToPx(2), SizeUtilsKt.getDpToPx(2), 0);
            attachmentUploadOverlayView.setLayoutParams(layoutParams);
            constraintLayout.addView(attachmentUploadOverlayView);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.c(constraintLayout);
            constraintSet.d(attachmentUploadOverlayView.getId(), 7, 7);
            constraintSet.d(attachmentUploadOverlayView.getId(), 3, 3);
            constraintSet.a(constraintLayout);
            return attachmentUploadOverlayView;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$CompleteViewConfig;", "", "backgroundSize", "", "checkmarkButtonSize", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCheckmarkButtonSize", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$CompleteViewConfig;", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CompleteViewConfig {
        private final Integer backgroundSize;
        private final Integer checkmarkButtonSize;

        public CompleteViewConfig(Integer num, Integer num2) {
            this.backgroundSize = num;
            this.checkmarkButtonSize = num2;
        }

        public static /* synthetic */ CompleteViewConfig copy$default(CompleteViewConfig completeViewConfig, Integer num, Integer num2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = completeViewConfig.backgroundSize;
            }
            if ((i7 & 2) != 0) {
                num2 = completeViewConfig.checkmarkButtonSize;
            }
            return completeViewConfig.copy(num, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getBackgroundSize() {
            return this.backgroundSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getCheckmarkButtonSize() {
            return this.checkmarkButtonSize;
        }

        @NotNull
        public final CompleteViewConfig copy(Integer backgroundSize, Integer checkmarkButtonSize) {
            return new CompleteViewConfig(backgroundSize, checkmarkButtonSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompleteViewConfig)) {
                return false;
            }
            CompleteViewConfig completeViewConfig = (CompleteViewConfig) other;
            return Intrinsics.areEqual(this.backgroundSize, completeViewConfig.backgroundSize) && Intrinsics.areEqual(this.checkmarkButtonSize, completeViewConfig.checkmarkButtonSize);
        }

        public final Integer getBackgroundSize() {
            return this.backgroundSize;
        }

        public final Integer getCheckmarkButtonSize() {
            return this.checkmarkButtonSize;
        }

        public int hashCode() {
            Integer num = this.backgroundSize;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.checkmarkButtonSize;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CompleteViewConfig(backgroundSize=" + this.backgroundSize + ", checkmarkButtonSize=" + this.checkmarkButtonSize + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$ProgressViewConfig;", "", "backgroundSize", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "cancelButtonSize", "primaryColor", "progressIndicatorSize", "trackColor", "<init>", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getCancelButtonSize", "getPrimaryColor", "getProgressIndicatorSize", "getTrackColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView$ProgressViewConfig;", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProgressViewConfig {
        private final Drawable backgroundDrawable;
        private final Integer backgroundSize;
        private final Integer cancelButtonSize;
        private final Integer primaryColor;
        private final Integer progressIndicatorSize;
        private final Integer trackColor;

        public ProgressViewConfig(Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.backgroundSize = num;
            this.backgroundDrawable = drawable;
            this.cancelButtonSize = num2;
            this.primaryColor = num3;
            this.progressIndicatorSize = num4;
            this.trackColor = num5;
        }

        public static /* synthetic */ ProgressViewConfig copy$default(ProgressViewConfig progressViewConfig, Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = progressViewConfig.backgroundSize;
            }
            if ((i7 & 2) != 0) {
                drawable = progressViewConfig.backgroundDrawable;
            }
            if ((i7 & 4) != 0) {
                num2 = progressViewConfig.cancelButtonSize;
            }
            if ((i7 & 8) != 0) {
                num3 = progressViewConfig.primaryColor;
            }
            if ((i7 & 16) != 0) {
                num4 = progressViewConfig.progressIndicatorSize;
            }
            if ((i7 & 32) != 0) {
                num5 = progressViewConfig.trackColor;
            }
            Integer num6 = num4;
            Integer num7 = num5;
            return progressViewConfig.copy(num, drawable, num2, num3, num6, num7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getBackgroundSize() {
            return this.backgroundSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Drawable getBackgroundDrawable() {
            return this.backgroundDrawable;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getCancelButtonSize() {
            return this.cancelButtonSize;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getPrimaryColor() {
            return this.primaryColor;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getProgressIndicatorSize() {
            return this.progressIndicatorSize;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getTrackColor() {
            return this.trackColor;
        }

        @NotNull
        public final ProgressViewConfig copy(Integer backgroundSize, Drawable backgroundDrawable, Integer cancelButtonSize, Integer primaryColor, Integer progressIndicatorSize, Integer trackColor) {
            return new ProgressViewConfig(backgroundSize, backgroundDrawable, cancelButtonSize, primaryColor, progressIndicatorSize, trackColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressViewConfig)) {
                return false;
            }
            ProgressViewConfig progressViewConfig = (ProgressViewConfig) other;
            return Intrinsics.areEqual(this.backgroundSize, progressViewConfig.backgroundSize) && Intrinsics.areEqual(this.backgroundDrawable, progressViewConfig.backgroundDrawable) && Intrinsics.areEqual(this.cancelButtonSize, progressViewConfig.cancelButtonSize) && Intrinsics.areEqual(this.primaryColor, progressViewConfig.primaryColor) && Intrinsics.areEqual(this.progressIndicatorSize, progressViewConfig.progressIndicatorSize) && Intrinsics.areEqual(this.trackColor, progressViewConfig.trackColor);
        }

        public final Drawable getBackgroundDrawable() {
            return this.backgroundDrawable;
        }

        public final Integer getBackgroundSize() {
            return this.backgroundSize;
        }

        public final Integer getCancelButtonSize() {
            return this.cancelButtonSize;
        }

        public final Integer getPrimaryColor() {
            return this.primaryColor;
        }

        public final Integer getProgressIndicatorSize() {
            return this.progressIndicatorSize;
        }

        public final Integer getTrackColor() {
            return this.trackColor;
        }

        public int hashCode() {
            Integer num = this.backgroundSize;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Drawable drawable = this.backgroundDrawable;
            int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            Integer num2 = this.cancelButtonSize;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.primaryColor;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.progressIndicatorSize;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.trackColor;
            return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.backgroundSize;
            Drawable drawable = this.backgroundDrawable;
            Integer num2 = this.cancelButtonSize;
            Integer num3 = this.primaryColor;
            Integer num4 = this.progressIndicatorSize;
            Integer num5 = this.trackColor;
            StringBuilder sb2 = new StringBuilder("ProgressViewConfig(backgroundSize=");
            sb2.append(num);
            sb2.append(", backgroundDrawable=");
            sb2.append(drawable);
            sb2.append(", cancelButtonSize=");
            kk.b.s(sb2, num2, ", primaryColor=", num3, ", progressIndicatorSize=");
            sb2.append(num4);
            sb2.append(", trackColor=");
            sb2.append(num5);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentUploadOverlayView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void configureCompleteView$default(AttachmentUploadOverlayView attachmentUploadOverlayView, Integer num, Integer num2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            num2 = null;
        }
        attachmentUploadOverlayView.configureCompleteView(num, num2);
    }

    public static /* synthetic */ void configureProgressView$default(AttachmentUploadOverlayView attachmentUploadOverlayView, Integer num, Drawable drawable, Integer num2, Integer num3, Integer num4, Integer num5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            drawable = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        if ((i7 & 8) != 0) {
            num3 = null;
        }
        if ((i7 & 16) != 0) {
            num4 = null;
        }
        if ((i7 & 32) != 0) {
            num5 = null;
        }
        attachmentUploadOverlayView.configureProgressView(num, drawable, num2, num3, num4, num5);
    }

    private final void resetUploadOverlay() {
        this.binding.uploadProgressLayout.setAlpha(1.0f);
        this.binding.uploadComplete.setAlpha(0.0f);
        this.binding.uploadProgress.setProgress(0);
    }

    private final void setSquareLayoutParam(View view, int dimension) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        layoutParams.width = dimension;
        layoutParams.height = dimension;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUploadCancel$lambda$20(UploadItemProps uploadItemProps, View view) {
        uploadItemProps.getOnCancelUploadItem().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUploadCancel$lambda$21(View view) {
    }

    private final ValueAnimator setUploadCompleteBackgroundVisible() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setStartDelay(this.animationStartDelay);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(0L);
        valueAnimator.addUpdateListener(new h(this, 3));
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUploadCompleteBackgroundVisible$lambda$4$lambda$3(AttachmentUploadOverlayView attachmentUploadOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        attachmentUploadOverlayView.binding.uploadCompleteLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    private final AnimatorSet uploadCompleteAnimationSequence() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(setUploadCompleteBackgroundVisible(), uploadCompleteCheckmarkFadeInAnim(), uploadCompleteCheckmarkFadeOutAnim());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.message.view.AttachmentUploadOverlayView$uploadCompleteAnimationSequence$lambda$19$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.onAnimationComplete.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return animatorSet;
    }

    private final AnimatorSet uploadCompleteCheckmarkFadeInAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.transitionInDuration);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new h(this, 0));
        Unit unit = Unit.f14616a;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setFloatValues(0.8f, 0.9f);
        valueAnimator2.setInterpolator(new OvershootInterpolator(8.0f));
        valueAnimator2.addUpdateListener(new h(this, 1));
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setFloatValues(1.0f, 0.0f);
        valueAnimator3.addUpdateListener(new h(this, 2));
        animatorSet.playTogether(valueAnimator, valueAnimator2, valueAnimator3);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeInAnim$lambda$11$lambda$10$lambda$9(AttachmentUploadOverlayView attachmentUploadOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        attachmentUploadOverlayView.binding.uploadProgressLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeInAnim$lambda$11$lambda$6$lambda$5(AttachmentUploadOverlayView attachmentUploadOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        attachmentUploadOverlayView.binding.uploadComplete.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeInAnim$lambda$11$lambda$8$lambda$7(AttachmentUploadOverlayView attachmentUploadOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        attachmentUploadOverlayView.binding.uploadCompleteBackground.setScaleX(fFloatValue);
        attachmentUploadOverlayView.binding.uploadCompleteBackground.setScaleY(fFloatValue);
    }

    private final AnimatorSet uploadCompleteCheckmarkFadeOutAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.transitionOutDuration);
        animatorSet.setStartDelay(this.transitionDelay);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.9f, 0.8f);
        valueAnimator.addUpdateListener(new h(this, 4));
        Unit unit = Unit.f14616a;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setFloatValues(1.0f, 0.0f);
        valueAnimator2.addUpdateListener(new h(this, 5));
        animatorSet.playTogether(valueAnimator, valueAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.message.view.AttachmentUploadOverlayView$uploadCompleteCheckmarkFadeOutAnim$lambda$17$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ConstraintLayout uploadProgressLayout = this.this$0.binding.uploadProgressLayout;
                Intrinsics.checkNotNullExpressionValue(uploadProgressLayout, "uploadProgressLayout");
                uploadProgressLayout.setVisibility(8);
                ConstraintLayout uploadCompleteLayout = this.this$0.binding.uploadCompleteLayout;
                Intrinsics.checkNotNullExpressionValue(uploadCompleteLayout, "uploadCompleteLayout");
                uploadCompleteLayout.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeOutAnim$lambda$17$lambda$13$lambda$12(AttachmentUploadOverlayView attachmentUploadOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        attachmentUploadOverlayView.binding.uploadCompleteLayout.setScaleX(fFloatValue);
        attachmentUploadOverlayView.binding.uploadCompleteLayout.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadCompleteCheckmarkFadeOutAnim$lambda$17$lambda$15$lambda$14(AttachmentUploadOverlayView attachmentUploadOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        attachmentUploadOverlayView.binding.uploadCompleteLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public final void configureCompleteView(Integer backgroundSize, Integer checkmarkButtonSize) {
        CompleteViewConfig completeViewConfig = new CompleteViewConfig(backgroundSize, checkmarkButtonSize);
        if (Intrinsics.areEqual(this.completeViewConfig, completeViewConfig)) {
            return;
        }
        if (backgroundSize != null) {
            MaterialCardView uploadCompleteBackground = this.binding.uploadCompleteBackground;
            Intrinsics.checkNotNullExpressionValue(uploadCompleteBackground, "uploadCompleteBackground");
            setSquareLayoutParam(uploadCompleteBackground, backgroundSize.intValue());
        }
        if (checkmarkButtonSize != null) {
            SimpleDraweeView uploadComplete = this.binding.uploadComplete;
            Intrinsics.checkNotNullExpressionValue(uploadComplete, "uploadComplete");
            setSquareLayoutParam(uploadComplete, checkmarkButtonSize.intValue());
        }
        this.completeViewConfig = completeViewConfig;
    }

    public final void configureProgressView(Integer backgroundSize, Drawable backgroundDrawable, Integer cancelButtonSize, Integer primaryColor, Integer progressIndicatorSize, Integer trackColor) {
        ProgressViewConfig progressViewConfig = new ProgressViewConfig(backgroundSize, backgroundDrawable, cancelButtonSize, primaryColor, progressIndicatorSize, trackColor);
        if (Intrinsics.areEqual(this.progressViewConfig, progressViewConfig)) {
            return;
        }
        if (backgroundSize != null) {
            View uploadProgressBackground = this.binding.uploadProgressBackground;
            Intrinsics.checkNotNullExpressionValue(uploadProgressBackground, "uploadProgressBackground");
            setSquareLayoutParam(uploadProgressBackground, backgroundSize.intValue());
        }
        if (backgroundDrawable != null) {
            this.binding.uploadProgressBackground.setBackground(backgroundDrawable);
        }
        if (cancelButtonSize != null) {
            SimpleDraweeView uploadCancel = this.binding.uploadCancel;
            Intrinsics.checkNotNullExpressionValue(uploadCancel, "uploadCancel");
            setSquareLayoutParam(uploadCancel, cancelButtonSize.intValue());
        }
        if (primaryColor != null) {
            SimpleDraweeView uploadCancel2 = this.binding.uploadCancel;
            Intrinsics.checkNotNullExpressionValue(uploadCancel2, "uploadCancel");
            ColorUtilsKt.setTintColor(uploadCancel2, primaryColor);
            this.binding.uploadProgress.setIndicatorColor(primaryColor.intValue());
        }
        if (progressIndicatorSize != null) {
            this.binding.uploadProgress.setIndicatorSize(progressIndicatorSize.intValue());
        }
        if (trackColor != null) {
            this.binding.uploadProgress.setTrackColor(trackColor.intValue());
        }
        this.progressViewConfig = progressViewConfig;
    }

    public final void setOnProgressAnimationComplete(@NotNull Function0<Unit> onAnimationComplete) {
        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
        this.onAnimationComplete = onAnimationComplete;
    }

    public final void setProgress(UploadItemProps uploadItemProps) {
        if (!Intrinsics.areEqual(this.uploadContext, uploadItemProps != null ? uploadItemProps.getUploadContext() : null)) {
            UploadContext uploadContext = uploadItemProps != null ? uploadItemProps.getUploadContext() : null;
            this.uploadContext = uploadContext;
            if (uploadContext != null) {
                resetUploadOverlay();
            }
        }
        boolean z5 = uploadItemProps != null && uploadItemProps.getUploadProgress() == this.binding.uploadProgress.getProgress();
        if (uploadItemProps == null || z5) {
            return;
        }
        ConstraintLayout uploadProgressLayout = this.binding.uploadProgressLayout;
        Intrinsics.checkNotNullExpressionValue(uploadProgressLayout, "uploadProgressLayout");
        uploadProgressLayout.setVisibility(0);
        this.binding.uploadProgress.a(uploadItemProps.getUploadProgress(), true);
        if (uploadItemProps.getUploadProgress() >= 100) {
            ConstraintLayout uploadCompleteLayout = this.binding.uploadCompleteLayout;
            Intrinsics.checkNotNullExpressionValue(uploadCompleteLayout, "uploadCompleteLayout");
            uploadCompleteLayout.setVisibility(0);
            uploadCompleteAnimationSequence().start();
        }
    }

    public final void setUploadCancel(UploadItemProps uploadItemProps) {
        if (uploadItemProps == null) {
            ConstraintLayout uploadProgressLayout = this.binding.uploadProgressLayout;
            Intrinsics.checkNotNullExpressionValue(uploadProgressLayout, "uploadProgressLayout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(uploadProgressLayout, false, null, 1, null);
        } else if (this.binding.uploadProgress.getProgress() != 100) {
            ConstraintLayout uploadProgressLayout2 = this.binding.uploadProgressLayout;
            Intrinsics.checkNotNullExpressionValue(uploadProgressLayout2, "uploadProgressLayout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(uploadProgressLayout2, false, new com.discord.chat.presentation.list.delegate.b(1, uploadItemProps), 1, null);
        } else {
            ConstraintLayout uploadProgressLayout3 = this.binding.uploadProgressLayout;
            Intrinsics.checkNotNullExpressionValue(uploadProgressLayout3, "uploadProgressLayout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(uploadProgressLayout3, false, new com.discord.chat.presentation.message.system.b(1), 1, null);
        }
    }

    public /* synthetic */ AttachmentUploadOverlayView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentUploadOverlayView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.transitionInDuration = 250L;
        this.transitionOutDuration = 175L;
        this.transitionDelay = 400L;
        this.animationStartDelay = 1000L;
        AttachmentUploadOverlayViewBinding attachmentUploadOverlayViewBindingInflate = AttachmentUploadOverlayViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(attachmentUploadOverlayViewBindingInflate, "inflate(...)");
        this.binding = attachmentUploadOverlayViewBindingInflate;
        this.onAnimationComplete = new com.discord.chat.presentation.list.f(14);
        SimpleDraweeView simpleDraweeView = attachmentUploadOverlayViewBindingInflate.uploadCancel;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.XSmallIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(Color.argb(255, 255, 255, 255)));
        I18nUtilsKt.i18nContentDescription$default(simpleDraweeView, I18nMessage.CANCEL, (Function1) null, 2, (Object) null);
        SimpleDraweeView simpleDraweeView2 = attachmentUploadOverlayViewBindingInflate.uploadComplete;
        Intrinsics.checkNotNull(simpleDraweeView2);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.CheckmarkLargeIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(Color.argb(255, 88, 101, 242)));
        I18nUtilsKt.i18nContentDescription$default(simpleDraweeView2, I18nMessage.UPLOAD_COMPLETE, (Function1) null, 2, (Object) null);
    }
}
