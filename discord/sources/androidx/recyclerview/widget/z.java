package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class z extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f2729a;

    public z(c0 c0Var) {
        this.f2729a = c0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        c0 c0Var = this.f2729a;
        int i11 = c0Var.f2565a;
        int iComputeVerticalScrollRange = c0Var.f2581s.computeVerticalScrollRange();
        int i12 = c0Var.f2580r;
        c0Var.f2582t = iComputeVerticalScrollRange - i12 > 0 && i12 >= i11;
        int iComputeHorizontalScrollRange = c0Var.f2581s.computeHorizontalScrollRange();
        int i13 = c0Var.f2579q;
        boolean z5 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= i11;
        c0Var.f2583u = z5;
        boolean z6 = c0Var.f2582t;
        if (!z6 && !z5) {
            if (c0Var.f2584v != 0) {
                c0Var.d(0);
                return;
            }
            return;
        }
        if (z6) {
            float f2 = i12;
            c0Var.f2574l = (int) ((((f2 / 2.0f) + iComputeVerticalScrollOffset) * f2) / iComputeVerticalScrollRange);
            c0Var.k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (c0Var.f2583u) {
            float f7 = iComputeHorizontalScrollOffset;
            float f10 = i13;
            c0Var.f2577o = (int) ((((f10 / 2.0f) + f7) * f10) / iComputeHorizontalScrollRange);
            c0Var.f2576n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = c0Var.f2584v;
        if (i14 == 0 || i14 == 1) {
            c0Var.d(1);
        }
    }
}
