package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 extends RecyclerView.OnFlingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f2652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f2653b = new m1(this);

    public abstract int[] a(RecyclerView.LayoutManager layoutManager, View view);

    public final void b() {
        RecyclerView.LayoutManager layoutManager;
        View viewD;
        RecyclerView recyclerView = this.f2652a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        u0 u0Var = (u0) this;
        if (layoutManager.canScrollVertically()) {
            viewD = u0.d(layoutManager, u0Var.f(layoutManager));
        } else {
            viewD = layoutManager.canScrollHorizontally() ? u0.d(layoutManager, u0Var.e(layoutManager)) : null;
        }
        if (viewD == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewD);
        int i7 = iArrA[0];
        if (i7 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f2652a.smoothScrollBy(i7, iArrA[1]);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public final boolean onFling(int i7, int i10) {
        int minFlingVelocity;
        boolean z5;
        boolean z6;
        int position;
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView.LayoutManager layoutManager = this.f2652a.getLayoutManager();
        if (layoutManager != 0 && this.f2652a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = this.f2652a.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && ((z5 = layoutManager instanceof i1)))) {
            u0 u0Var = (u0) this;
            View view = null;
            t0 t0Var = !z5 ? null : new t0(u0Var, u0Var.f2652a.getContext());
            if (t0Var != null) {
                int itemCount = layoutManager.getItemCount();
                if (itemCount != 0) {
                    OrientationHelper orientationHelperF = layoutManager.canScrollVertically() ? u0Var.f(layoutManager) : layoutManager.canScrollHorizontally() ? u0Var.e(layoutManager) : null;
                    if (orientationHelperF == null) {
                        position = -1;
                        z6 = false;
                    } else {
                        int childCount = layoutManager.getChildCount();
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        View view2 = null;
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = layoutManager.getChildAt(i13);
                            if (childAt != null) {
                                int iC = u0.c(childAt, orientationHelperF);
                                if (iC <= 0 && iC > i12) {
                                    i12 = iC;
                                    view2 = childAt;
                                }
                                if (iC >= 0 && iC < i11) {
                                    i11 = iC;
                                    view = childAt;
                                }
                            }
                        }
                        z6 = false;
                        boolean z7 = !layoutManager.canScrollHorizontally() ? i10 <= 0 : i7 <= 0;
                        if (z7 && view != null) {
                            position = layoutManager.getPosition(view);
                        } else if (z7 || view2 == null) {
                            if (z7) {
                                view = view2;
                            }
                            if (view == null) {
                                position = -1;
                            } else {
                                position = ((z5 && (pointFComputeScrollVectorForPosition = ((i1) layoutManager).computeScrollVectorForPosition(layoutManager.getItemCount() - 1)) != null && ((pointFComputeScrollVectorForPosition.x > 0.0f ? 1 : (pointFComputeScrollVectorForPosition.x == 0.0f ? 0 : -1)) < 0 || (pointFComputeScrollVectorForPosition.y > 0.0f ? 1 : (pointFComputeScrollVectorForPosition.y == 0.0f ? 0 : -1)) < 0)) == z7 ? -1 : 1) + layoutManager.getPosition(view);
                                if (position < 0 || position >= itemCount) {
                                    position = -1;
                                }
                            }
                        } else {
                            position = layoutManager.getPosition(view2);
                        }
                    }
                } else {
                    position = -1;
                    z6 = false;
                }
                if (position == -1) {
                    return z6;
                }
                t0Var.setTargetPosition(position);
                layoutManager.startSmoothScroll(t0Var);
                return true;
            }
        }
        return false;
    }
}
