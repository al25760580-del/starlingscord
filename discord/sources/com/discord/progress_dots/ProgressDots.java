package com.discord.progress_dots;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r0;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.progress_dots.databinding.ProgressDotsViewBinding;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/progress_dots/ProgressDots;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/progress_dots/databinding/ProgressDotsViewBinding;", "dotsAnimationTimeMs", "dotsAnimationStaggerTimeMs", "", "isRunning", "", "setupColors", "", ViewProps.START, "isReplay", "stop", "onAttachedToWindow", "onDetachedFromWindow", "setVisibility", "visibility", "syncPlayingState", "isAttached", "progress_dots_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressDots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressDots.kt\ncom/discord/progress_dots/ProgressDots\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,98:1\n1869#2,2:99\n255#3:101\n255#3:102\n*S KotlinDebug\n*F\n+ 1 ProgressDots.kt\ncom/discord/progress_dots/ProgressDots\n*L\n68#1:99,2\n91#1:101\n36#1:102\n*E\n"})
public final class ProgressDots extends ConstraintLayout {

    @NotNull
    private final ProgressDotsViewBinding binding;
    private final long dotsAnimationStaggerTimeMs;
    private final int dotsAnimationTimeMs;
    private boolean isRunning;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDots(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ProgressDots progressDots) {
        if (progressDots.isAttachedToWindow() && progressDots.getVisibility() == 0) {
            progressDots.start(true);
        }
        return Unit.f14616a;
    }

    private final void start(boolean isReplay) {
        if (!this.isRunning || isReplay) {
            long j = isReplay ? this.dotsAnimationStaggerTimeMs : 0L;
            this.binding.viewProgressDots1.start(j);
            this.binding.viewProgressDots2.start(this.dotsAnimationStaggerTimeMs + j);
            ProgressDot progressDot = this.binding.viewProgressDots3;
            long j5 = this.dotsAnimationStaggerTimeMs;
            progressDot.start(j + j5 + j5);
            this.isRunning = true;
        }
    }

    public static /* synthetic */ void start$default(ProgressDots progressDots, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        progressDots.start(z5);
    }

    private final void stop() {
        ProgressDotsViewBinding progressDotsViewBinding = this.binding;
        Iterator it = d0.g(progressDotsViewBinding.viewProgressDots1, progressDotsViewBinding.viewProgressDots2, progressDotsViewBinding.viewProgressDots3).iterator();
        while (it.hasNext()) {
            ((ProgressDot) it.next()).stop();
        }
        this.isRunning = false;
    }

    private final void syncPlayingState(boolean isAttached) {
        if (isAttached && getVisibility() == 0) {
            start$default(this, false, 1, null);
        } else {
            stop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        syncPlayingState(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        syncPlayingState(false);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        syncPlayingState(isAttachedToWindow());
    }

    public final void setupColors() {
        ProgressDot viewProgressDots1 = this.binding.viewProgressDots1;
        Intrinsics.checkNotNullExpressionValue(viewProgressDots1, "viewProgressDots1");
        ViewBackgroundUtilsKt.setBackgroundOval$default(viewProgressDots1, ThemeManagerKt.getTheme().getTextDefault(), 0, 2, null);
        ProgressDot viewProgressDots2 = this.binding.viewProgressDots2;
        Intrinsics.checkNotNullExpressionValue(viewProgressDots2, "viewProgressDots2");
        ViewBackgroundUtilsKt.setBackgroundOval$default(viewProgressDots2, ThemeManagerKt.getTheme().getTextDefault(), 0, 2, null);
        ProgressDot viewProgressDots3 = this.binding.viewProgressDots3;
        Intrinsics.checkNotNullExpressionValue(viewProgressDots3, "viewProgressDots3");
        ViewBackgroundUtilsKt.setBackgroundOval$default(viewProgressDots3, ThemeManagerKt.getTheme().getTextDefault(), 0, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDots(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ProgressDots(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDots(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressDotsViewBinding progressDotsViewBindingInflate = ProgressDotsViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(progressDotsViewBindingInflate, "inflate(...)");
        this.binding = progressDotsViewBindingInflate;
        int integer = getResources().getInteger(R.integer.progress_dots_animation_time);
        this.dotsAnimationTimeMs = integer;
        this.dotsAnimationStaggerTimeMs = (long) (((double) integer) / 1.5d);
        setupColors();
        progressDotsViewBindingInflate.viewProgressDots3.setOnScaleDownCompleteListener(new r0(24, this));
    }
}
