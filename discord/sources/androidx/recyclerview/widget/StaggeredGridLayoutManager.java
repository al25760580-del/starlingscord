package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements i1 {
    public boolean E;
    public final BitSet G;
    public final d J;
    public final int K;
    public boolean L;
    public boolean M;
    public s1 N;
    public final Rect O;
    public final o1 P;
    public final boolean Q;
    public int[] R;
    public final v0 S;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t1[] f2543e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OrientationHelper f2544i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final OrientationHelper f2545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2547x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k0 f2548y;
    public boolean F = false;
    public int H = -1;
    public int I = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f2542d = -1;
        this.E = false;
        d dVar = new d();
        this.J = dVar;
        this.K = 2;
        this.O = new Rect();
        this.P = new o1(this);
        this.Q = true;
        this.S = new v0(2, this);
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i7, i10);
        int i11 = properties.f2495a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f2546w) {
            this.f2546w = i11;
            OrientationHelper orientationHelper = this.f2544i;
            this.f2544i = this.f2545v;
            this.f2545v = orientationHelper;
            requestLayout();
        }
        int i12 = properties.f2496b;
        assertNotInLayoutOrScroll(null);
        if (i12 != this.f2542d) {
            dVar.a();
            requestLayout();
            this.f2542d = i12;
            this.G = new BitSet(this.f2542d);
            this.f2543e = new t1[this.f2542d];
            for (int i13 = 0; i13 < this.f2542d; i13++) {
                this.f2543e[i13] = new t1(this, i13);
            }
            requestLayout();
        }
        boolean z5 = properties.f2497c;
        assertNotInLayoutOrScroll(null);
        s1 s1Var = this.N;
        if (s1Var != null && s1Var.E != z5) {
            s1Var.E = z5;
        }
        this.E = z5;
        requestLayout();
        k0 k0Var = new k0();
        k0Var.f2626a = true;
        k0Var.f2631f = 0;
        k0Var.f2632g = 0;
        this.f2548y = k0Var;
        this.f2544i = OrientationHelper.a(this, this.f2546w);
        this.f2545v = OrientationHelper.a(this, 1 - this.f2546w);
    }

    public static int B(int i7, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i7)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i10) - i11), mode) : i7;
    }

    public final void A(t1 t1Var, int i7, int i10) {
        int i11 = t1Var.f2696d;
        int i12 = t1Var.f2697e;
        if (i7 != -1) {
            int i13 = t1Var.f2695c;
            if (i13 == Integer.MIN_VALUE) {
                t1Var.a();
                i13 = t1Var.f2695c;
            }
            if (i13 - i11 >= i10) {
                this.G.set(i12, false);
                return;
            }
            return;
        }
        int i14 = t1Var.f2694b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) t1Var.f2693a.get(0);
            p1 p1Var = (p1) view.getLayoutParams();
            t1Var.f2694b = t1Var.f2698f.f2544i.e(view);
            p1Var.getClass();
            i14 = t1Var.f2694b;
        }
        if (i14 + i11 <= i10) {
            this.G.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.N == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.f2546w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.f2546w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof p1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void collectAdjacentPrefetchPositions(int i7, int i10, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        k0 k0Var;
        int iF;
        int iH;
        if (this.f2546w != 0) {
            i7 = i10;
        }
        if (getChildCount() == 0 || i7 == 0) {
            return;
        }
        t(i7, state);
        int[] iArr = this.R;
        if (iArr == null || iArr.length < this.f2542d) {
            this.R = new int[this.f2542d];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f2542d;
            k0Var = this.f2548y;
            if (i11 >= i13) {
                break;
            }
            if (k0Var.f2629d == -1) {
                iF = k0Var.f2631f;
                iH = this.f2543e[i11].h(iF);
            } else {
                iF = this.f2543e[i11].f(k0Var.f2632g);
                iH = k0Var.f2632g;
            }
            int i14 = iF - iH;
            if (i14 >= 0) {
                this.R[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.R, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = k0Var.f2628c;
            if (i16 < 0 || i16 >= state.b()) {
                return;
            }
            layoutPrefetchRegistry.a(k0Var.f2628c, this.R[i15]);
            k0Var.f2628c += k0Var.f2629d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.Q;
        return k1.a(state, this.f2544i, h(z5), g(z5), this, this.Q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.Q;
        return k1.c(state, this.f2544i, h(z5), g(z5), this, this.Q);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.i1
    public final PointF computeScrollVectorForPosition(int i7) {
        int i10 = -1;
        if (getChildCount() != 0) {
            if ((i7 < k()) == this.F) {
                i10 = 1;
            }
        } else if (this.F) {
            i10 = 1;
        }
        PointF pointF = new PointF();
        if (i10 == 0) {
            return null;
        }
        if (this.f2546w == 0) {
            pointF.x = i10;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i10;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.Q;
        return k1.a(state, this.f2544i, h(z5), g(z5), this, this.Q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.Q;
        return k1.c(state, this.f2544i, h(z5), g(z5), this, this.Q);
    }

    public final boolean d() {
        int iK;
        if (getChildCount() != 0 && this.K != 0 && isAttachedToWindow()) {
            if (this.F) {
                iK = l();
                k();
            } else {
                iK = k();
                l();
            }
            if (iK == 0 && p() != null) {
                this.J.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.Q;
        return k1.b(state, this.f2544i, h(z5), g(z5), this, this.Q, this.F);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int f(RecyclerView.Recycler recycler, k0 k0Var, RecyclerView.State state) {
        t1 t1Var;
        ?? r5;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i7;
        int i10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i11 = 0;
        int i12 = 1;
        staggeredGridLayoutManager.G.set(0, staggeredGridLayoutManager.f2542d, true);
        k0 k0Var2 = staggeredGridLayoutManager.f2548y;
        int i13 = k0Var2.f2634i ? k0Var.f2630e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : k0Var.f2630e == 1 ? k0Var.f2632g + k0Var.f2627b : k0Var.f2631f - k0Var.f2627b;
        int i14 = k0Var.f2630e;
        for (int i15 = 0; i15 < staggeredGridLayoutManager.f2542d; i15++) {
            if (!staggeredGridLayoutManager.f2543e[i15].f2693a.isEmpty()) {
                staggeredGridLayoutManager.A(staggeredGridLayoutManager.f2543e[i15], i14, i13);
            }
        }
        int iG = staggeredGridLayoutManager.F ? staggeredGridLayoutManager.f2544i.g() : staggeredGridLayoutManager.f2544i.k();
        boolean z5 = false;
        while (true) {
            int i16 = k0Var.f2628c;
            int i17 = -1;
            if (i16 < 0 || i16 >= state.b() || (!k0Var2.f2634i && staggeredGridLayoutManager.G.isEmpty())) {
                break;
            }
            View viewE = recycler.e(k0Var.f2628c);
            k0Var.f2628c += k0Var.f2629d;
            p1 p1Var = (p1) viewE.getLayoutParams();
            int layoutPosition = p1Var.f2499d.getLayoutPosition();
            d dVar = staggeredGridLayoutManager.J;
            int[] iArr = (int[]) dVar.f2590a;
            int i18 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i18 == -1) {
                if (staggeredGridLayoutManager.s(k0Var.f2630e)) {
                    i7 = staggeredGridLayoutManager.f2542d - i12;
                    i10 = -1;
                } else {
                    i17 = staggeredGridLayoutManager.f2542d;
                    i7 = i11;
                    i10 = i12;
                }
                t1 t1Var2 = null;
                if (k0Var.f2630e == i12) {
                    int iK2 = staggeredGridLayoutManager.f2544i.k();
                    int i19 = Integer.MAX_VALUE;
                    while (i7 != i17) {
                        t1 t1Var3 = staggeredGridLayoutManager.f2543e[i7];
                        int i20 = i10;
                        int iF = t1Var3.f(iK2);
                        if (iF < i19) {
                            t1Var2 = t1Var3;
                            i19 = iF;
                        }
                        i7 += i20;
                        i10 = i20;
                    }
                } else {
                    int i21 = i10;
                    int iG2 = staggeredGridLayoutManager.f2544i.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i7 != i17) {
                        t1 t1Var4 = staggeredGridLayoutManager.f2543e[i7];
                        int iH2 = t1Var4.h(iG2);
                        if (iH2 > i22) {
                            t1Var2 = t1Var4;
                            i22 = iH2;
                        }
                        i7 += i21;
                    }
                }
                t1Var = t1Var2;
                dVar.b(layoutPosition);
                ((int[]) dVar.f2590a)[layoutPosition] = t1Var.f2697e;
            } else {
                t1Var = staggeredGridLayoutManager.f2543e[i18];
            }
            t1 t1Var5 = t1Var;
            p1Var.f2669w = t1Var5;
            if (k0Var.f2630e == 1) {
                staggeredGridLayoutManager.addView(viewE);
                r5 = 0;
            } else {
                r5 = 0;
                staggeredGridLayoutManager.addView(viewE, 0);
            }
            if (staggeredGridLayoutManager.f2546w == 1) {
                staggeredGridLayoutManager.q(viewE, RecyclerView.LayoutManager.getChildMeasureSpec(staggeredGridLayoutManager.f2547x, staggeredGridLayoutManager.getWidthMode(), r5, ((ViewGroup.MarginLayoutParams) p1Var).width, r5), RecyclerView.LayoutManager.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) p1Var).height, true));
            } else {
                staggeredGridLayoutManager.q(viewE, RecyclerView.LayoutManager.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) p1Var).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(staggeredGridLayoutManager.f2547x, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) p1Var).height, false));
            }
            if (k0Var.f2630e == 1) {
                iC = t1Var5.f(iG);
                iH = staggeredGridLayoutManager.f2544i.c(viewE) + iC;
            } else {
                iH = t1Var5.h(iG);
                iC = iH - staggeredGridLayoutManager.f2544i.c(viewE);
            }
            if (k0Var.f2630e == 1) {
                t1 t1Var6 = p1Var.f2669w;
                t1Var6.getClass();
                p1 p1Var2 = (p1) viewE.getLayoutParams();
                p1Var2.f2669w = t1Var6;
                ArrayList arrayList = t1Var6.f2693a;
                arrayList.add(viewE);
                t1Var6.f2695c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    t1Var6.f2694b = Integer.MIN_VALUE;
                }
                if (p1Var2.f2499d.isRemoved() || p1Var2.f2499d.isUpdated()) {
                    t1Var6.f2696d = t1Var6.f2698f.f2544i.c(viewE) + t1Var6.f2696d;
                }
            } else {
                t1 t1Var7 = p1Var.f2669w;
                t1Var7.getClass();
                p1 p1Var3 = (p1) viewE.getLayoutParams();
                p1Var3.f2669w = t1Var7;
                ArrayList arrayList2 = t1Var7.f2693a;
                arrayList2.add(0, viewE);
                t1Var7.f2694b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    t1Var7.f2695c = Integer.MIN_VALUE;
                }
                if (p1Var3.f2499d.isRemoved() || p1Var3.f2499d.isUpdated()) {
                    t1Var7.f2696d = t1Var7.f2698f.f2544i.c(viewE) + t1Var7.f2696d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f2546w == 1) {
                iC2 = staggeredGridLayoutManager.f2545v.g() - (((staggeredGridLayoutManager.f2542d - 1) - t1Var5.f2697e) * staggeredGridLayoutManager.f2547x);
                iK = iC2 - staggeredGridLayoutManager.f2545v.c(viewE);
            } else {
                iK = staggeredGridLayoutManager.f2545v.k() + (t1Var5.f2697e * staggeredGridLayoutManager.f2547x);
                iC2 = staggeredGridLayoutManager.f2545v.c(viewE) + iK;
            }
            int i23 = iK;
            int i24 = iC2;
            if (staggeredGridLayoutManager.f2546w == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewE, i23, iC, i24, iH);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewE, iC, i23, iH, i24);
            }
            staggeredGridLayoutManager.A(t1Var5, k0Var2.f2630e, i13);
            staggeredGridLayoutManager.u(recycler, k0Var2);
            if (k0Var2.f2633h && viewE.hasFocusable()) {
                staggeredGridLayoutManager.G.set(t1Var5.f2697e, false);
            }
            z5 = true;
            i12 = 1;
            i11 = 0;
        }
        if (!z5) {
            staggeredGridLayoutManager.u(recycler, k0Var2);
        }
        int iK3 = k0Var2.f2630e == -1 ? staggeredGridLayoutManager.f2544i.k() - staggeredGridLayoutManager.n(staggeredGridLayoutManager.f2544i.k()) : staggeredGridLayoutManager.m(staggeredGridLayoutManager.f2544i.g()) - staggeredGridLayoutManager.f2544i.g();
        if (iK3 > 0) {
            return Math.min(k0Var.f2627b, iK3);
        }
        return 0;
    }

    public final View g(boolean z5) {
        int iK = this.f2544i.k();
        int iG = this.f2544i.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f2544i.e(childAt);
            int iB = this.f2544i.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f2546w == 0 ? new p1(-2, -1) : new p1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new p1(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f2546w == 1) {
            return Math.min(this.f2542d, state.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f2546w == 0) {
            return Math.min(this.f2542d, state.b());
        }
        return -1;
    }

    public final View h(boolean z5) {
        int iK = this.f2544i.k();
        int iG = this.f2544i.g();
        int childCount = getChildCount();
        View view = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int iE = this.f2544i.e(childAt);
            if (this.f2544i.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        int iG;
        int iM = m(Integer.MIN_VALUE);
        if (iM != Integer.MIN_VALUE && (iG = this.f2544i.g() - iM) > 0) {
            int i7 = iG - (-scrollBy(-iG, recycler, state));
            if (!z5 || i7 <= 0) {
                return;
            }
            this.f2544i.p(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return this.K != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isLayoutReversed() {
        return this.E;
    }

    public final void j(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        int iK;
        int iN = n(Integer.MAX_VALUE);
        if (iN != Integer.MAX_VALUE && (iK = iN - this.f2544i.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, recycler, state);
            if (!z5 || iScrollBy <= 0) {
                return;
            }
            this.f2544i.p(-iScrollBy);
        }
    }

    public final int k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int m(int i7) {
        int iF = this.f2543e[0].f(i7);
        for (int i10 = 1; i10 < this.f2542d; i10++) {
            int iF2 = this.f2543e[i10].f(i7);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int n(int i7) {
        int iH = this.f2543e[0].h(i7);
        for (int i10 = 1; i10 < this.f2542d; i10++) {
            int iH2 = this.f2543e[i10].h(i7);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void o(int i7, int i10, int i11) {
        int i12;
        int i13;
        d dVar;
        int[] iArr;
        int iL;
        ArrayList arrayList;
        r1 r1Var;
        int size;
        int i14;
        int i15;
        int size2;
        int iL2 = this.F ? l() : k();
        if (i11 == 8) {
            if (i7 < i10) {
                i12 = i10 + 1;
            } else {
                i12 = i7 + 1;
                i13 = i10;
            }
            dVar = this.J;
            iArr = (int[]) dVar.f2590a;
            if (iArr != null && i13 < iArr.length) {
                arrayList = (ArrayList) dVar.f2591b;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                r1Var = null;
                                break;
                            }
                            r1Var = (r1) ((ArrayList) dVar.f2591b).get(size2);
                            if (r1Var.f2677d == i13) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        r1Var = null;
                        break;
                    }
                    if (r1Var != null) {
                        ((ArrayList) dVar.f2591b).remove(r1Var);
                    }
                    size = ((ArrayList) dVar.f2591b).size();
                    i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            i14 = -1;
                            break;
                        } else if (((r1) ((ArrayList) dVar.f2591b).get(i14)).f2677d >= i13) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i14 != -1) {
                        r1 r1Var2 = (r1) ((ArrayList) dVar.f2591b).get(i14);
                        ((ArrayList) dVar.f2591b).remove(i14);
                        i15 = r1Var2.f2677d;
                    } else {
                        i15 = -1;
                    }
                } else {
                    i15 = -1;
                }
                if (i15 == -1) {
                    int[] iArr2 = (int[]) dVar.f2590a;
                    Arrays.fill(iArr2, i13, iArr2.length, -1);
                    int length = ((int[]) dVar.f2590a).length;
                } else {
                    Arrays.fill((int[]) dVar.f2590a, i13, Math.min(i15 + 1, ((int[]) dVar.f2590a).length), -1);
                }
            }
            if (i11 != 1) {
                dVar.c(i7, i10);
            } else if (i11 != 2) {
                dVar.d(i7, i10);
            } else if (i11 == 8) {
                dVar.d(i7, 1);
                dVar.c(i10, 1);
            }
            if (i12 <= iL2) {
                return;
            }
            if (this.F) {
                iL = k();
            } else {
                iL = l();
            }
            if (i13 <= iL) {
                requestLayout();
            }
        }
        i12 = i7 + i10;
        i13 = i7;
        dVar = this.J;
        iArr = (int[]) dVar.f2590a;
        if (iArr != null) {
            arrayList = (ArrayList) dVar.f2591b;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            r1Var = null;
                            break;
                        }
                        r1Var = (r1) ((ArrayList) dVar.f2591b).get(size2);
                        if (r1Var.f2677d == i13) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    r1Var = null;
                    break;
                }
                if (r1Var != null) {
                    ((ArrayList) dVar.f2591b).remove(r1Var);
                }
                size = ((ArrayList) dVar.f2591b).size();
                i14 = 0;
                while (true) {
                    if (i14 < size) {
                        i14 = -1;
                        break;
                    } else {
                        if (((r1) ((ArrayList) dVar.f2591b).get(i14)).f2677d >= i13) {
                            break;
                            break;
                        }
                        i14++;
                    }
                }
                if (i14 != -1) {
                    r1 r1Var3 = (r1) ((ArrayList) dVar.f2591b).get(i14);
                    ((ArrayList) dVar.f2591b).remove(i14);
                    i15 = r1Var3.f2677d;
                } else {
                    i15 = -1;
                }
            } else {
                i15 = -1;
            }
            if (i15 == -1) {
                int[] iArr3 = (int[]) dVar.f2590a;
                Arrays.fill(iArr3, i13, iArr3.length, -1);
                int length2 = ((int[]) dVar.f2590a).length;
            } else {
                Arrays.fill((int[]) dVar.f2590a, i13, Math.min(i15 + 1, ((int[]) dVar.f2590a).length), -1);
            }
        }
        if (i11 != 1) {
            dVar.c(i7, i10);
        } else if (i11 != 2) {
            dVar.d(i7, i10);
        } else if (i11 == 8) {
            dVar.d(i7, 1);
            dVar.c(i10, 1);
        }
        if (i12 <= iL2) {
            return;
        }
        if (this.F) {
            iL = k();
        } else {
            iL = l();
        }
        if (i13 <= iL) {
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i7) {
        super.offsetChildrenHorizontal(i7);
        for (int i10 = 0; i10 < this.f2542d; i10++) {
            t1 t1Var = this.f2543e[i10];
            int i11 = t1Var.f2694b;
            if (i11 != Integer.MIN_VALUE) {
                t1Var.f2694b = i11 + i7;
            }
            int i12 = t1Var.f2695c;
            if (i12 != Integer.MIN_VALUE) {
                t1Var.f2695c = i12 + i7;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i7) {
        super.offsetChildrenVertical(i7);
        for (int i10 = 0; i10 < this.f2542d; i10++) {
            t1 t1Var = this.f2543e[i10];
            int i11 = t1Var.f2694b;
            if (i11 != Integer.MIN_VALUE) {
                t1Var.f2694b = i11 + i7;
            }
            int i12 = t1Var.f2695c;
            if (i12 != Integer.MIN_VALUE) {
                t1Var.f2695c = i12 + i7;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.J.a();
        for (int i7 = 0; i7 < this.f2542d; i7++) {
            this.f2543e[i7].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.S);
        for (int i7 = 0; i7 < this.f2542d; i7++) {
            this.f2543e[i7].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewFindContainingItemView;
        int i10;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        x();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 17) {
                    if (i7 != 33) {
                        if (i7 == 66 ? this.f2546w == 0 : !(i7 != 130 || this.f2546w != 1)) {
                            i10 = 1;
                        }
                    } else if (this.f2546w == 1) {
                        i10 = -1;
                    }
                    i10 = Integer.MIN_VALUE;
                } else if (this.f2546w == 0) {
                    i10 = -1;
                } else {
                    i10 = Integer.MIN_VALUE;
                }
            } else if (this.f2546w != 1 && isLayoutRTL()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
        } else if (this.f2546w != 1 && isLayoutRTL()) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        p1 p1Var = (p1) viewFindContainingItemView.getLayoutParams();
        p1Var.getClass();
        t1 t1Var = p1Var.f2669w;
        int iL = i10 == 1 ? l() : k();
        z(iL, state);
        y(i10);
        k0 k0Var = this.f2548y;
        k0Var.f2628c = k0Var.f2629d + iL;
        k0Var.f2627b = (int) (this.f2544i.l() * 0.33333334f);
        k0Var.f2633h = true;
        k0Var.f2626a = false;
        f(recycler, k0Var, state);
        this.L = this.F;
        View viewG = t1Var.g(iL, i10);
        if (viewG != null && viewG != viewFindContainingItemView) {
            return viewG;
        }
        if (s(i10)) {
            for (int i11 = this.f2542d - 1; i11 >= 0; i11--) {
                View viewG2 = this.f2543e[i11].g(iL, i10);
                if (viewG2 != null && viewG2 != viewFindContainingItemView) {
                    return viewG2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f2542d; i12++) {
                View viewG3 = this.f2543e[i12].g(iL, i10);
                if (viewG3 != null && viewG3 != viewFindContainingItemView) {
                    return viewG3;
                }
            }
        }
        boolean z5 = (this.E ^ true) == (i10 == -1);
        View viewFindViewByPosition = findViewByPosition(z5 ? t1Var.c() : t1Var.d());
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (s(i10)) {
            for (int i13 = this.f2542d - 1; i13 >= 0; i13--) {
                if (i13 != t1Var.f2697e) {
                    View viewFindViewByPosition2 = findViewByPosition(z5 ? this.f2543e[i13].c() : this.f2543e[i13].d());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f2542d; i14++) {
                View viewFindViewByPosition3 = findViewByPosition(z5 ? this.f2543e[i14].c() : this.f2543e[i14].d());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewH = h(false);
            View viewG = g(false);
            if (viewH == null || viewG == null) {
                return;
            }
            int position = getPosition(viewH);
            int position2 = getPosition(viewG);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.o("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof p1)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        p1 p1Var = (p1) layoutParams;
        if (this.f2546w == 0) {
            t1 t1Var = p1Var.f2669w;
            accessibilityNodeInfoCompat.r(g.a.a(t1Var == null ? -1 : t1Var.f2697e, 1, -1, -1, false));
        } else {
            t1 t1Var2 = p1Var.f2669w;
            accessibilityNodeInfoCompat.r(g.a.a(-1, -1, t1Var2 == null ? -1 : t1Var2.f2697e, 1, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i7, int i10) {
        o(i7, i10, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.J.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i7, int i10, int i11) {
        o(i7, i10, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i7, int i10) {
        o(i7, i10, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i7, int i10, Object obj) {
        o(i7, i10, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        r(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.H = -1;
        this.I = Integer.MIN_VALUE;
        this.N = null;
        this.P.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof s1) {
            s1 s1Var = (s1) parcelable;
            this.N = s1Var;
            if (this.H != -1) {
                s1Var.f2682d = -1;
                s1Var.f2683e = -1;
                s1Var.f2685v = null;
                s1Var.f2684i = 0;
                s1Var.f2686w = 0;
                s1Var.f2687x = null;
                s1Var.f2688y = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        int iH;
        int iK;
        int[] iArr;
        s1 s1Var = this.N;
        if (s1Var != null) {
            s1 s1Var2 = new s1();
            s1Var2.f2684i = s1Var.f2684i;
            s1Var2.f2682d = s1Var.f2682d;
            s1Var2.f2683e = s1Var.f2683e;
            s1Var2.f2685v = s1Var.f2685v;
            s1Var2.f2686w = s1Var.f2686w;
            s1Var2.f2687x = s1Var.f2687x;
            s1Var2.E = s1Var.E;
            s1Var2.F = s1Var.F;
            s1Var2.G = s1Var.G;
            s1Var2.f2688y = s1Var.f2688y;
            return s1Var2;
        }
        s1 s1Var3 = new s1();
        s1Var3.E = this.E;
        s1Var3.F = this.L;
        s1Var3.G = this.M;
        d dVar = this.J;
        if (dVar == null || (iArr = (int[]) dVar.f2590a) == null) {
            s1Var3.f2686w = 0;
        } else {
            s1Var3.f2687x = iArr;
            s1Var3.f2686w = iArr.length;
            s1Var3.f2688y = (ArrayList) dVar.f2591b;
        }
        if (getChildCount() <= 0) {
            s1Var3.f2682d = -1;
            s1Var3.f2683e = -1;
            s1Var3.f2684i = 0;
            return s1Var3;
        }
        s1Var3.f2682d = this.L ? l() : k();
        View viewG = this.F ? g(true) : h(true);
        s1Var3.f2683e = viewG != null ? getPosition(viewG) : -1;
        int i7 = this.f2542d;
        s1Var3.f2684i = i7;
        s1Var3.f2685v = new int[i7];
        for (int i10 = 0; i10 < this.f2542d; i10++) {
            if (this.L) {
                iH = this.f2543e[i10].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f2544i.g();
                    iH -= iK;
                }
            } else {
                iH = this.f2543e[i10].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f2544i.k();
                    iH -= iK;
                }
            }
            s1Var3.f2685v[i10] = iH;
        }
        return s1Var3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i7) {
        if (i7 == 0) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View p() {
        boolean z5;
        boolean z6;
        int childCount = getChildCount();
        int i7 = childCount - 1;
        BitSet bitSet = new BitSet(this.f2542d);
        bitSet.set(0, this.f2542d, true);
        byte b10 = (this.f2546w == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.F) {
            childCount = -1;
        } else {
            i7 = 0;
        }
        int i10 = i7 < childCount ? 1 : -1;
        while (i7 != childCount) {
            View childAt = getChildAt(i7);
            p1 p1Var = (p1) childAt.getLayoutParams();
            if (bitSet.get(p1Var.f2669w.f2697e)) {
                t1 t1Var = p1Var.f2669w;
                if (this.F) {
                    int i11 = t1Var.f2695c;
                    if (i11 == Integer.MIN_VALUE) {
                        t1Var.a();
                        i11 = t1Var.f2695c;
                    }
                    if (i11 < this.f2544i.g()) {
                        ((p1) ((View) kk.b.e(1, t1Var.f2693a)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i12 = t1Var.f2694b;
                    ArrayList arrayList = t1Var.f2693a;
                    if (i12 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        p1 p1Var2 = (p1) view.getLayoutParams();
                        t1Var.f2694b = t1Var.f2698f.f2544i.e(view);
                        p1Var2.getClass();
                        i12 = t1Var.f2694b;
                    }
                    if (i12 > this.f2544i.k()) {
                        ((p1) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(p1Var.f2669w.f2697e);
            }
            i7 += i10;
            if (i7 != childCount) {
                View childAt2 = getChildAt(i7);
                if (this.F) {
                    int iB = this.f2544i.b(childAt);
                    int iB2 = this.f2544i.b(childAt2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (p1Var.f2669w.f2697e - ((p1) childAt2.getLayoutParams()).f2669w.f2697e < 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (b10 < 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5 != z6) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return childAt;
                }
                int iE = this.f2544i.e(childAt);
                int iE2 = this.f2544i.e(childAt2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (p1Var.f2669w.f2697e - ((p1) childAt2.getLayoutParams()).f2669w.f2697e < 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (b10 < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5 != z6) {
                        }
                    } else {
                        continue;
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    public final void q(View view, int i7, int i10) {
        Rect rect = this.O;
        calculateItemDecorationsForChild(view, rect);
        p1 p1Var = (p1) view.getLayoutParams();
        int iB = B(i7, ((ViewGroup.MarginLayoutParams) p1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) p1Var).rightMargin + rect.right);
        int iB2 = B(i10, ((ViewGroup.MarginLayoutParams) p1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) p1Var).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iB, iB2, p1Var)) {
            view.measure(iB, iB2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:251:0x0413  */
    /* JADX WARN: Code duplicated, block: B:262:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01fc A[SYNTHETIC] */
    public final void r(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        boolean z6;
        s1 s1Var;
        int childCount;
        int i7;
        int position;
        int position2;
        int childCount2;
        int i10;
        boolean z7;
        s1 s1Var2 = this.N;
        o1 o1Var = this.P;
        if (!(s1Var2 == null && this.H == -1) && state.b() == 0) {
            removeAndRecycleAllViews(recycler);
            o1Var.a();
            return;
        }
        boolean z10 = o1Var.f2662e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = o1Var.f2664g;
        boolean z11 = (z10 && this.H == -1 && this.N == null) ? false : true;
        d dVar = this.J;
        if (z11) {
            o1Var.a();
            s1 s1Var3 = this.N;
            if (s1Var3 != null) {
                int i11 = s1Var3.f2684i;
                if (i11 > 0) {
                    if (i11 == this.f2542d) {
                        for (int i12 = 0; i12 < this.f2542d; i12++) {
                            this.f2543e[i12].b();
                            s1 s1Var4 = this.N;
                            int iG = s1Var4.f2685v[i12];
                            if (iG != Integer.MIN_VALUE) {
                                iG += s1Var4.F ? this.f2544i.g() : this.f2544i.k();
                            }
                            t1 t1Var = this.f2543e[i12];
                            t1Var.f2694b = iG;
                            t1Var.f2695c = iG;
                        }
                    } else {
                        s1Var3.f2685v = null;
                        s1Var3.f2684i = 0;
                        s1Var3.f2686w = 0;
                        s1Var3.f2687x = null;
                        s1Var3.f2688y = null;
                        s1Var3.f2682d = s1Var3.f2683e;
                    }
                }
                s1 s1Var5 = this.N;
                this.M = s1Var5.G;
                boolean z12 = s1Var5.E;
                assertNotInLayoutOrScroll(null);
                s1 s1Var6 = this.N;
                if (s1Var6 != null && s1Var6.E != z12) {
                    s1Var6.E = z12;
                }
                this.E = z12;
                requestLayout();
                x();
                s1 s1Var7 = this.N;
                int i13 = s1Var7.f2682d;
                if (i13 != -1) {
                    this.H = i13;
                    o1Var.f2660c = s1Var7.F;
                } else {
                    o1Var.f2660c = this.F;
                }
                if (s1Var7.f2686w > 1) {
                    dVar.f2590a = s1Var7.f2687x;
                    dVar.f2591b = s1Var7.f2688y;
                }
            } else {
                x();
                o1Var.f2660c = this.F;
            }
            if (state.f2527g || (i10 = this.H) == -1) {
                if (this.L) {
                    int iB = state.b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iB) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iB2 = state.b();
                    childCount = getChildCount();
                    i7 = 0;
                    while (true) {
                        if (i7 >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i7));
                        if (position < 0 && position < iB2) {
                            position2 = position;
                            break;
                        }
                        i7++;
                    }
                }
                o1Var.f2658a = position2;
                o1Var.f2659b = Integer.MIN_VALUE;
            } else if (i10 < 0 || i10 >= state.b()) {
                this.H = -1;
                this.I = Integer.MIN_VALUE;
                if (this.L) {
                    int iB3 = state.b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iB4 = state.b();
                    childCount = getChildCount();
                    i7 = 0;
                    while (true) {
                        if (i7 >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i7));
                            if (position < 0) {
                            }
                            i7++;
                        }
                    }
                }
                o1Var.f2658a = position2;
                o1Var.f2659b = Integer.MIN_VALUE;
            } else {
                s1 s1Var8 = this.N;
                if (s1Var8 == null || s1Var8.f2682d == -1 || s1Var8.f2684i < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.H);
                    if (viewFindViewByPosition != null) {
                        o1Var.f2658a = this.F ? l() : k();
                        if (this.I != Integer.MIN_VALUE) {
                            if (o1Var.f2660c) {
                                o1Var.f2659b = (this.f2544i.g() - this.I) - this.f2544i.b(viewFindViewByPosition);
                            } else {
                                o1Var.f2659b = (this.f2544i.k() + this.I) - this.f2544i.e(viewFindViewByPosition);
                            }
                        } else if (this.f2544i.c(viewFindViewByPosition) > this.f2544i.l()) {
                            o1Var.f2659b = o1Var.f2660c ? this.f2544i.g() : this.f2544i.k();
                        } else {
                            int iE = this.f2544i.e(viewFindViewByPosition) - this.f2544i.k();
                            if (iE < 0) {
                                o1Var.f2659b = -iE;
                            } else {
                                int iG2 = this.f2544i.g() - this.f2544i.b(viewFindViewByPosition);
                                if (iG2 < 0) {
                                    o1Var.f2659b = iG2;
                                } else {
                                    o1Var.f2659b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i14 = this.H;
                        o1Var.f2658a = i14;
                        int i15 = this.I;
                        if (i15 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i14 < k()) != this.F) {
                                    z7 = false;
                                } else {
                                    z7 = true;
                                }
                            } else if (this.F) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            o1Var.f2660c = z7;
                            o1Var.f2659b = z7 ? staggeredGridLayoutManager.f2544i.g() : staggeredGridLayoutManager.f2544i.k();
                        } else if (o1Var.f2660c) {
                            o1Var.f2659b = staggeredGridLayoutManager.f2544i.g() - i15;
                        } else {
                            o1Var.f2659b = staggeredGridLayoutManager.f2544i.k() + i15;
                        }
                        o1Var.f2661d = true;
                    }
                } else {
                    o1Var.f2659b = Integer.MIN_VALUE;
                    o1Var.f2658a = this.H;
                }
            }
            o1Var.f2662e = true;
        }
        if (this.N == null && this.H == -1 && (o1Var.f2660c != this.L || isLayoutRTL() != this.M)) {
            dVar.a();
            o1Var.f2661d = true;
        }
        if (getChildCount() > 0 && ((s1Var = this.N) == null || s1Var.f2684i < 1)) {
            if (o1Var.f2661d) {
                for (int i16 = 0; i16 < this.f2542d; i16++) {
                    this.f2543e[i16].b();
                    int i17 = o1Var.f2659b;
                    if (i17 != Integer.MIN_VALUE) {
                        t1 t1Var2 = this.f2543e[i16];
                        t1Var2.f2694b = i17;
                        t1Var2.f2695c = i17;
                    }
                }
            } else if (z11 || o1Var.f2663f == null) {
                for (int i18 = 0; i18 < this.f2542d; i18++) {
                    t1 t1Var3 = this.f2543e[i18];
                    boolean z13 = this.F;
                    int i19 = o1Var.f2659b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = t1Var3.f2698f;
                    int iF = z13 ? t1Var3.f(Integer.MIN_VALUE) : t1Var3.h(Integer.MIN_VALUE);
                    t1Var3.b();
                    if (iF != Integer.MIN_VALUE && ((!z13 || iF >= staggeredGridLayoutManager2.f2544i.g()) && (z13 || iF <= staggeredGridLayoutManager2.f2544i.k()))) {
                        if (i19 != Integer.MIN_VALUE) {
                            iF += i19;
                        }
                        t1Var3.f2695c = iF;
                        t1Var3.f2694b = iF;
                    }
                }
                t1[] t1VarArr = this.f2543e;
                int length = t1VarArr.length;
                int[] iArr = o1Var.f2663f;
                if (iArr == null || iArr.length < length) {
                    o1Var.f2663f = new int[staggeredGridLayoutManager.f2543e.length];
                }
                for (int i20 = 0; i20 < length; i20++) {
                    o1Var.f2663f[i20] = t1VarArr[i20].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i21 = 0; i21 < this.f2542d; i21++) {
                    t1 t1Var4 = this.f2543e[i21];
                    t1Var4.b();
                    int i22 = o1Var.f2663f[i21];
                    t1Var4.f2694b = i22;
                    t1Var4.f2695c = i22;
                }
            }
        }
        detachAndScrapAttachedViews(recycler);
        k0 k0Var = this.f2548y;
        k0Var.f2626a = false;
        int iL = this.f2545v.l();
        this.f2547x = iL / this.f2542d;
        View.MeasureSpec.makeMeasureSpec(iL, this.f2545v.i());
        z(o1Var.f2658a, state);
        if (o1Var.f2660c) {
            y(-1);
            f(recycler, k0Var, state);
            y(1);
            k0Var.f2628c = o1Var.f2658a + k0Var.f2629d;
            f(recycler, k0Var, state);
        } else {
            y(1);
            f(recycler, k0Var, state);
            y(-1);
            k0Var.f2628c = o1Var.f2658a + k0Var.f2629d;
            f(recycler, k0Var, state);
        }
        if (this.f2545v.i() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i23 = 0; i23 < childCount3; i23++) {
                View childAt = getChildAt(i23);
                float fC = this.f2545v.c(childAt);
                if (fC >= fMax) {
                    ((p1) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i24 = this.f2547x;
            int iRound = Math.round(fMax * this.f2542d);
            if (this.f2545v.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2545v.l());
            }
            this.f2547x = iRound / this.f2542d;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f2545v.i());
            if (this.f2547x != i24) {
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = getChildAt(i25);
                    p1 p1Var = (p1) childAt2.getLayoutParams();
                    p1Var.getClass();
                    if (isLayoutRTL() && this.f2546w == 1) {
                        int i26 = -((this.f2542d - 1) - p1Var.f2669w.f2697e);
                        childAt2.offsetLeftAndRight((this.f2547x * i26) - (i26 * i24));
                    } else {
                        int i27 = p1Var.f2669w.f2697e;
                        int i28 = this.f2547x * i27;
                        int i29 = i27 * i24;
                        if (this.f2546w == 1) {
                            childAt2.offsetLeftAndRight(i28 - i29);
                        } else {
                            childAt2.offsetTopAndBottom(i28 - i29);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.F) {
                i(recycler, state, true);
                j(recycler, state, false);
            } else {
                j(recycler, state, true);
                i(recycler, state, false);
            }
        }
        if (z5 && !state.f2527g && this.K != 0 && getChildCount() > 0 && p() != null) {
            removeCallbacks(this.S);
            z6 = d();
        }
        if (state.f2527g) {
            o1Var.a();
        }
        this.L = o1Var.f2660c;
        this.M = isLayoutRTL();
        if (z6) {
            o1Var.a();
            r(recycler, state, false);
        }
    }

    public final boolean s(int i7) {
        if (this.f2546w == 0) {
            return (i7 == -1) != this.F;
        }
        return ((i7 == -1) == this.F) == isLayoutRTL();
    }

    public final int scrollBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        t(i7, state);
        k0 k0Var = this.f2548y;
        int iF = f(recycler, k0Var, state);
        if (k0Var.f2627b >= iF) {
            i7 = i7 < 0 ? -iF : iF;
        }
        this.f2544i.p(-i7);
        this.L = this.F;
        k0Var.f2627b = 0;
        u(recycler, k0Var);
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i7, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
        s1 s1Var = this.N;
        if (s1Var != null && s1Var.f2682d != i7) {
            s1Var.f2685v = null;
            s1Var.f2684i = 0;
            s1Var.f2682d = -1;
            s1Var.f2683e = -1;
        }
        this.H = i7;
        this.I = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i7, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i7, int i10) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f2546w == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i7, (this.f2547x * this.f2542d) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i7, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i10, (this.f2547x * this.f2542d) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        m0 m0Var = new m0(recyclerView.getContext());
        m0Var.setTargetPosition(i7);
        startSmoothScroll(m0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.N == null;
    }

    public final void t(int i7, RecyclerView.State state) {
        int iK;
        int i10;
        if (i7 > 0) {
            iK = l();
            i10 = 1;
        } else {
            iK = k();
            i10 = -1;
        }
        k0 k0Var = this.f2548y;
        k0Var.f2626a = true;
        z(iK, state);
        y(i10);
        k0Var.f2628c = iK + k0Var.f2629d;
        k0Var.f2627b = Math.abs(i7);
    }

    public final void u(RecyclerView.Recycler recycler, k0 k0Var) {
        int iMin;
        if (!k0Var.f2626a || k0Var.f2634i) {
            return;
        }
        if (k0Var.f2627b == 0) {
            if (k0Var.f2630e == -1) {
                v(k0Var.f2632g, recycler);
                return;
            } else {
                w(k0Var.f2631f, recycler);
                return;
            }
        }
        int i7 = 1;
        if (k0Var.f2630e == -1) {
            int i10 = k0Var.f2631f;
            int iH = this.f2543e[0].h(i10);
            while (i7 < this.f2542d) {
                int iH2 = this.f2543e[i7].h(i10);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i7++;
            }
            int i11 = i10 - iH;
            v(i11 < 0 ? k0Var.f2632g : k0Var.f2632g - Math.min(i11, k0Var.f2627b), recycler);
            return;
        }
        int i12 = k0Var.f2632g;
        int iF = this.f2543e[0].f(i12);
        while (i7 < this.f2542d) {
            int iF2 = this.f2543e[i7].f(i12);
            if (iF2 < iF) {
                iF = iF2;
            }
            i7++;
        }
        int i13 = iF - k0Var.f2632g;
        if (i13 < 0) {
            iMin = k0Var.f2631f;
        } else {
            iMin = Math.min(i13, k0Var.f2627b) + k0Var.f2631f;
        }
        w(iMin, recycler);
    }

    public final void v(int i7, RecyclerView.Recycler recycler) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2544i.e(childAt) < i7 || this.f2544i.o(childAt) < i7) {
                return;
            }
            p1 p1Var = (p1) childAt.getLayoutParams();
            p1Var.getClass();
            if (p1Var.f2669w.f2693a.size() == 1) {
                return;
            }
            t1 t1Var = p1Var.f2669w;
            ArrayList arrayList = t1Var.f2693a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            p1 p1Var2 = (p1) view.getLayoutParams();
            p1Var2.f2669w = null;
            if (p1Var2.f2499d.isRemoved() || p1Var2.f2499d.isUpdated()) {
                t1Var.f2696d -= t1Var.f2698f.f2544i.c(view);
            }
            if (size == 1) {
                t1Var.f2694b = Integer.MIN_VALUE;
            }
            t1Var.f2695c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void w(int i7, RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2544i.b(childAt) > i7 || this.f2544i.n(childAt) > i7) {
                return;
            }
            p1 p1Var = (p1) childAt.getLayoutParams();
            p1Var.getClass();
            if (p1Var.f2669w.f2693a.size() == 1) {
                return;
            }
            t1 t1Var = p1Var.f2669w;
            ArrayList arrayList = t1Var.f2693a;
            View view = (View) arrayList.remove(0);
            p1 p1Var2 = (p1) view.getLayoutParams();
            p1Var2.f2669w = null;
            if (arrayList.size() == 0) {
                t1Var.f2695c = Integer.MIN_VALUE;
            }
            if (p1Var2.f2499d.isRemoved() || p1Var2.f2499d.isUpdated()) {
                t1Var.f2696d -= t1Var.f2698f.f2544i.c(view);
            }
            t1Var.f2694b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void x() {
        if (this.f2546w == 1 || !isLayoutRTL()) {
            this.F = this.E;
        } else {
            this.F = !this.E;
        }
    }

    public final void y(int i7) {
        k0 k0Var = this.f2548y;
        k0Var.f2630e = i7;
        k0Var.f2629d = this.F != (i7 == -1) ? -1 : 1;
    }

    public final void z(int i7, RecyclerView.State state) {
        int iL;
        int iL2;
        int i10;
        k0 k0Var = this.f2548y;
        boolean z5 = false;
        k0Var.f2627b = 0;
        k0Var.f2628c = i7;
        if (!isSmoothScrolling() || (i10 = state.f2521a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.F == (i10 < i7)) {
                iL = this.f2544i.l();
                iL2 = 0;
            } else {
                iL2 = this.f2544i.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            k0Var.f2631f = this.f2544i.k() - iL2;
            k0Var.f2632g = this.f2544i.g() + iL;
        } else {
            k0Var.f2632g = this.f2544i.f() + iL;
            k0Var.f2631f = -iL2;
        }
        k0Var.f2633h = false;
        k0Var.f2626a = true;
        if (this.f2544i.i() == 0 && this.f2544i.f() == 0) {
            z5 = true;
        }
        k0Var.f2634i = z5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new p1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new p1(layoutParams);
    }
}
