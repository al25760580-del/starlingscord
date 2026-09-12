package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenFooter extends ReactViewGroup {
    public static final /* synthetic */ int E = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReactContext f7149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7150e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7151i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mm.f f7155y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenFooter(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f7149d = reactContext;
        u uVar = new u(this);
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        androidx.core.view.u0.r(decorView, uVar);
        this.f7155y = new mm.f(2, this);
    }

    public static final int d(ScreenFooter screenFooter, float f2) {
        Screen screenParent = screenFooter.getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) e4.f.g0(screenFooter.h(4), screenFooter.h(3), f2);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f7150e > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final Screen getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        Screen screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent.getSheetBehavior();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void e(int i7, int i10, int i11, int i12) {
        int iMax = ((i7 - i10) - i11) - Math.max(i12, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void f(int i7) {
        this.f7150e = i7;
        int reactHeight = getReactHeight();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        e(i7, reactHeight, h(sheetBehavior.N), 0);
    }

    public final void g(BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.f7154x) {
            return;
        }
        behavior.s(this.f7155y);
        this.f7154x = true;
    }

    @NotNull
    public final ReactContext getReactContext() {
        return this.f7149d;
    }

    public final int h(int i7) {
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i7 == 3) {
            return sheetBehavior.z();
        }
        if (i7 == 4) {
            return this.f7150e - (sheetBehavior.f6280f ? -1 : sheetBehavior.f6278e);
        }
        if (i7 == 5) {
            return this.f7150e;
        }
        if (i7 == 6) {
            return (int) ((1 - sheetBehavior.F) * this.f7150e);
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            g(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<Screen> behavior = getSheetBehavior();
        if (behavior != null) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            if (this.f7154x) {
                behavior.Y.remove(this.f7155y);
                this.f7154x = false;
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (getHasReceivedInitialLayoutFromParent()) {
            int i13 = this.f7150e;
            int i14 = i12 - i10;
            BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
            if (sheetBehavior == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            e(i13, i14, h(sheetBehavior.N), this.f7153w);
        }
    }
}
