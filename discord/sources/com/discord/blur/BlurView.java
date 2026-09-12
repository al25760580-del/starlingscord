package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import b1.c;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u0012\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\bH\u0016J\u0012\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/discord/blur/BlurView;", "Leightbitlab/com/blurview/BlurView;", "Lcom/discord/blur/BlurViewAPI;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "blurTint", "", "blurTintIOSParityCompensation", "blurAmount", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;IIF)V", "blurEnabled", "", "blurViewPropertiesDirty", "blurTarget", "Ljava/lang/ref/WeakReference;", "Lcom/discord/blur/BlurViewAPI$Target;", "blurTargetChangeListener", "Lkotlin/Function0;", "", "onAttachedToWindow", "onDetachedFromWindow", "setBlurTint", ViewProps.COLOR, "setBlurTintIOSParityCompensation", "setBlurAmount", "rectId", "setBlurTargetNativeId", "nativeId", "maybeUpdate", "maybeUpdateBlurEnabled", "Companion", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class BlurView extends eightbitlab.com.blurview.BlurView implements BlurViewAPI {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private float blurAmount;
    private boolean blurEnabled;

    @NotNull
    private WeakReference<BlurViewAPI.Target> blurTarget;

    @NotNull
    private final Function0<Unit> blurTargetChangeListener;

    @NotNull
    private String blurTargetNativeId;
    private int blurTint;
    private int blurTintIOSParityCompensation;
    private boolean blurViewPropertiesDirty;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0002\b\u000bJ)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0011J%\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/blur/BlurView$Companion;", "", "<init>", "()V", "updateListener", "", "blurTargetChangeListener", "Lkotlin/Function0;", "attached", "", "maybeUpdate", "updateListener$blur_release", "mapRadius", "", "radius", "maxRadius", "minRadius", "mapRadius$blur_release", "mapBlurTint", "", "blurAmountTint", "blurTint", "blurAmount", "mapBlurTint$blur_release", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ float mapRadius$blur_release$default(Companion companion, float f2, float f7, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f7 = 24.0f;
            }
            if ((i7 & 4) != 0) {
                f10 = 0.0f;
            }
            return companion.mapRadius$blur_release(f2, f7, f10);
        }

        public final int mapBlurTint$blur_release(int blurAmountTint, int blurTint, float blurAmount) {
            return c.c(blurTint, ColorUtilsKt.argbWithAdjustedAlpha(blurAmountTint, blurAmount));
        }

        public final float mapRadius$blur_release(float radius, float maxRadius, float minRadius) {
            return Math.max(minRadius, Math.min(1.0f, radius)) * maxRadius;
        }

        public final void updateListener$blur_release(@NotNull Function0<Unit> blurTargetChangeListener, boolean attached, @NotNull Function0<Unit> maybeUpdate) {
            Intrinsics.checkNotNullParameter(blurTargetChangeListener, "blurTargetChangeListener");
            Intrinsics.checkNotNullParameter(maybeUpdate, "maybeUpdate");
            if (attached) {
                BlurViewTargetRegistry.INSTANCE.addChangeListener(blurTargetChangeListener);
            } else {
                BlurViewTargetRegistry.INSTANCE.removeChangeListener(blurTargetChangeListener);
            }
            if (attached) {
                maybeUpdate.invoke();
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ BlurView(Context context, String str, int i7, int i10, float f2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? 0 : i7, (i11 & 8) != 0 ? 0 : i10, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(BlurView blurView) {
        blurView.maybeUpdate();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit blurTargetChangeListener$lambda$0(BlurView blurView) {
        blurView.maybeUpdate();
        return Unit.f14616a;
    }

    private final void maybeUpdate() {
        ViewGroup viewRef;
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target == null || !this.blurViewPropertiesDirty) {
            return;
        }
        if (!Intrinsics.areEqual(this.blurTarget.get(), target)) {
            this.blurTarget = new WeakReference<>(target);
            setupWith(target.getViewRef()).l(target.getViewRef().getBackground());
        }
        maybeUpdateBlurEnabled();
        Companion companion = INSTANCE;
        setOverlayColor(companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
        setBlurRadius(Companion.mapRadius$blur_release$default(companion, this.blurAmount, 0.0f, 0.0f, 6, null));
        BlurViewAPI.Target target2 = this.blurTarget.get();
        if (target2 != null && (viewRef = target2.getViewRef()) != null) {
            viewRef.invalidate();
        }
        invalidate();
        this.blurViewPropertiesDirty = false;
    }

    private final void maybeUpdateBlurEnabled() {
        boolean z5 = this.blurEnabled;
        if (z5 && this.blurAmount <= 0.0f) {
            this.blurEnabled = false;
            setBlurEnabled(false);
        } else {
            if (z5 || this.blurAmount <= 0.0f) {
                return;
            }
            this.blurEnabled = true;
            setBlurEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(BlurView blurView) {
        blurView.maybeUpdate();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDetachedFromWindow$lambda$3(BlurView blurView) {
        blurView.maybeUpdate();
        return Unit.f14616a;
    }

    @Override // eightbitlab.com.blurview.BlurView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        INSTANCE.updateListener$blur_release(this.blurTargetChangeListener, true, new a(this, 1));
    }

    @Override // eightbitlab.com.blurview.BlurView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        INSTANCE.updateListener$blur_release(this.blurTargetChangeListener, false, new a(this, 0));
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurAmount(int rectId, float blurAmount) {
        if (this.blurAmount != blurAmount) {
            this.blurAmount = blurAmount;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurTargetNativeId(@NotNull String nativeId) {
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        if (!Intrinsics.areEqual(this.blurTargetNativeId, nativeId)) {
            this.blurTargetNativeId = nativeId;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override // com.discord.blur.BlurViewAPI
    public void setBlurTint(int color) {
        if (this.blurTint != color) {
            this.blurTint = color;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override // com.discord.blur.BlurViewAPI
    public void setBlurTintIOSParityCompensation(int color) {
        if (this.blurTintIOSParityCompensation != color) {
            this.blurTintIOSParityCompensation = color;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurView(@NotNull Context context, @NotNull String blurTargetNativeId, int i7, int i10, float f2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        this.blurTint = i7;
        this.blurTintIOSParityCompensation = i10;
        this.blurAmount = f2;
        this.blurEnabled = true;
        this.blurViewPropertiesDirty = true;
        this.blurTarget = new WeakReference<>(null);
        a aVar = new a(this, 2);
        this.blurTargetChangeListener = aVar;
        INSTANCE.updateListener$blur_release(aVar, true, new a(this, 3));
    }
}
