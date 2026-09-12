package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f2692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context) {
        super(context);
        this.f2692a = u0Var;
    }

    @Override // androidx.recyclerview.widget.m0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int calculateTimeForScrolling(int i7) {
        return Math.min(100, super.calculateTimeForScrolling(i7));
    }

    @Override // androidx.recyclerview.widget.m0, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        u0 u0Var = this.f2692a;
        int[] iArrA = u0Var.a(u0Var.f2652a.getLayoutManager(), view);
        int i7 = iArrA[0];
        int i10 = iArrA[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i7), Math.abs(i10)));
        if (iCalculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            action.f2514a = i7;
            action.f2515b = i10;
            action.f2516c = iCalculateTimeForDeceleration;
            action.f2518e = decelerateInterpolator;
            action.f2519f = true;
        }
    }
}
