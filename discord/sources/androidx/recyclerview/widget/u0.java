package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f2706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f2707d;

    public static int c(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.c(view) / 2) + orientationHelper.e(view)) - ((orientationHelper.l() / 2) + orientationHelper.k());
    }

    public static View d(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (orientationHelper.l() / 2) + orientationHelper.k();
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layoutManager.getChildAt(i10);
            int iAbs = Math.abs(((orientationHelper.c(childAt) / 2) + orientationHelper.e(childAt)) - iL);
            if (iAbs < i7) {
                view = childAt;
                i7 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.n1
    public final int[] a(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = c(view, e(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = c(view, f(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final OrientationHelper e(RecyclerView.LayoutManager layoutManager) {
        r0 r0Var = this.f2707d;
        if (r0Var == null || r0Var.f2488a != layoutManager) {
            this.f2707d = new r0(layoutManager);
        }
        return this.f2707d;
    }

    public final OrientationHelper f(RecyclerView.LayoutManager layoutManager) {
        s0 s0Var = this.f2706c;
        if (s0Var == null || s0Var.f2488a != layoutManager) {
            this.f2706c = new s0(layoutManager);
        }
        return this.f2706c;
    }
}
