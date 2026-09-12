package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class GapWorker implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f2456w = new ThreadLocal();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f2457x = new s(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2459e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2460i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2458d = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f2461v = new ArrayList();

    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f2464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2465d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public final void a(int i7, int i10) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i11 = this.f2465d;
            int i12 = i11 * 2;
            int[] iArr = this.f2464c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2464c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i11 * 4];
                this.f2464c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2464c;
            iArr4[i12] = i7;
            iArr4[i12 + 1] = i10;
            this.f2465d++;
        }

        public final void b(boolean z5, RecyclerView recyclerView) {
            this.f2465d = 0;
            int[] iArr = this.f2464c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z5) {
                if (!recyclerView.mAdapterHelper.g()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f2462a, this.f2463b, recyclerView.mState, this);
            }
            int i7 = this.f2465d;
            if (i7 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i7;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z5;
                recyclerView.mRecycler.o();
            }
        }
    }

    public static RecyclerView.ViewHolder c(RecyclerView recyclerView, int i7, long j) {
        int iH = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.mPosition == i7 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        if (j == LongCompanionObject.MAX_VALUE) {
            try {
                if (f1.e.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        RecyclerView.ViewHolder viewHolderM = recycler.m(i7, j);
        if (viewHolderM != null) {
            if (!viewHolderM.isBound() || viewHolderM.isInvalid()) {
                recycler.a(viewHolderM, false);
            } else {
                recycler.j(viewHolderM.itemView);
            }
        }
        return viewHolderM;
    }

    public final void a(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f2458d.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2459e == 0) {
                this.f2459e = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.f2462a = i7;
        layoutPrefetchRegistryImpl.f2463b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    public final void b(long j) {
        d0 d0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        d0 d0Var2;
        ArrayList arrayList = this.f2458d;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(false, recyclerView3);
                i10 += recyclerView3.mPrefetchRegistry.f2465d;
            }
        }
        ArrayList arrayList2 = this.f2461v;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(layoutPrefetchRegistryImpl.f2463b) + Math.abs(layoutPrefetchRegistryImpl.f2462a);
                for (int i14 = i7; i14 < layoutPrefetchRegistryImpl.f2465d * 2; i14 += 2) {
                    if (i13 >= arrayList2.size()) {
                        d0Var2 = new d0();
                        arrayList2.add(d0Var2);
                    } else {
                        d0Var2 = (d0) arrayList2.get(i13);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f2464c;
                    int i15 = iArr[i14 + 1];
                    d0Var2.f2592a = i15 <= iAbs;
                    d0Var2.f2593b = iAbs;
                    d0Var2.f2594c = i15;
                    d0Var2.f2595d = recyclerView4;
                    d0Var2.f2596e = iArr[i14];
                    i13++;
                }
            }
            i12++;
            i7 = 0;
        }
        Collections.sort(arrayList2, f2457x);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (d0Var = (d0) arrayList2.get(i16)).f2595d) != null; i16++) {
            RecyclerView.ViewHolder viewHolderC = c(recyclerView, d0Var.f2596e, d0Var.f2592a ? Long.MAX_VALUE : j);
            if (viewHolderC != null && viewHolderC.mNestedRecyclerView != null && viewHolderC.isBound() && !viewHolderC.isInvalid() && (recyclerView2 = viewHolderC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView2.mPrefetchRegistry;
                layoutPrefetchRegistryImpl2.b(true, recyclerView2);
                if (layoutPrefetchRegistryImpl2.f2465d != 0) {
                    try {
                        Trace.beginSection(j == LongCompanionObject.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        RecyclerView.State state = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        state.f2524d = 1;
                        state.f2525e = adapter.getItemCount();
                        state.f2527g = false;
                        state.f2528h = false;
                        state.f2529i = false;
                        for (int i17 = 0; i17 < layoutPrefetchRegistryImpl2.f2465d * 2; i17 += 2) {
                            c(recyclerView2, layoutPrefetchRegistryImpl2.f2464c[i17], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            d0Var.f2592a = false;
            d0Var.f2593b = 0;
            d0Var.f2594c = 0;
            d0Var.f2595d = null;
            d0Var.f2596e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2458d;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2460i);
                }
            }
        } finally {
            this.f2459e = 0L;
            Trace.endSection();
        }
    }
}
