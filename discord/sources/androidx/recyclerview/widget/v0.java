package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2713e;

    public /* synthetic */ v0(int i7, Object obj) {
        this.f2712d = i7;
        this.f2713e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f2712d;
        Object obj = this.f2713e;
        switch (i7) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.mLayoutSuppressed) {
                        recyclerView.consumePendingUpdateOperations();
                    } else {
                        recyclerView.mLayoutWasDefered = true;
                    }
                    break;
                }
                break;
            case 1:
                c0 c0Var = (c0) obj;
                ValueAnimator valueAnimator = c0Var.f2588z;
                int i10 = c0Var.A;
                if (i10 == 1) {
                    valueAnimator.cancel();
                } else if (i10 != 2) {
                }
                c0Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).d();
                break;
        }
    }
}
