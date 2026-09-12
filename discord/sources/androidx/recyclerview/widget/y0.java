package androidx.recyclerview.widget;

import androidx.core.view.DifferentialMotionFlingTarget;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements DifferentialMotionFlingTarget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2728a;

    public y0(RecyclerView recyclerView) {
        this.f2728a = recyclerView;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public final boolean a(float f2) {
        int i7;
        int i10;
        RecyclerView recyclerView = this.f2728a;
        if (recyclerView.mLayout.canScrollVertically()) {
            i10 = (int) f2;
            i7 = 0;
        } else if (recyclerView.mLayout.canScrollHorizontally()) {
            i7 = (int) f2;
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(i7, i10);
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public final float b() {
        float f2;
        RecyclerView recyclerView = this.f2728a;
        if (recyclerView.mLayout.canScrollVertically()) {
            f2 = recyclerView.mScaledVerticalScrollFactor;
        } else {
            if (!recyclerView.mLayout.canScrollHorizontally()) {
                return 0.0f;
            }
            f2 = recyclerView.mScaledHorizontalScrollFactor;
        }
        return -f2;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public final void c() {
        this.f2728a.stopScroll();
    }
}
