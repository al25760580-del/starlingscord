package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2693a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2694b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2695c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2696d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2698f;

    public t1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i7) {
        this.f2698f = staggeredGridLayoutManager;
        this.f2697e = i7;
    }

    public final void a() {
        View view = (View) kk.b.e(1, this.f2693a);
        p1 p1Var = (p1) view.getLayoutParams();
        this.f2695c = this.f2698f.f2544i.b(view);
        p1Var.getClass();
    }

    public final void b() {
        this.f2693a.clear();
        this.f2694b = Integer.MIN_VALUE;
        this.f2695c = Integer.MIN_VALUE;
        this.f2696d = 0;
    }

    public final int c() {
        boolean z5 = this.f2698f.E;
        ArrayList arrayList = this.f2693a;
        return z5 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z5 = this.f2698f.E;
        ArrayList arrayList = this.f2693a;
        return z5 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i7, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2698f;
        int iK = staggeredGridLayoutManager.f2544i.k();
        int iG = staggeredGridLayoutManager.f2544i.g();
        int i11 = i10 > i7 ? 1 : -1;
        while (i7 != i10) {
            View view = (View) this.f2693a.get(i7);
            int iE = staggeredGridLayoutManager.f2544i.e(view);
            int iB = staggeredGridLayoutManager.f2544i.b(view);
            boolean z5 = iE <= iG;
            boolean z6 = iB >= iK;
            if (z5 && z6 && (iE < iK || iB > iG)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i7 += i11;
        }
        return -1;
    }

    public final int f(int i7) {
        int i10 = this.f2695c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f2693a.size() == 0) {
            return i7;
        }
        a();
        return this.f2695c;
    }

    public final View g(int i7, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2698f;
        ArrayList arrayList = this.f2693a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.E && staggeredGridLayoutManager.getPosition(view2) >= i7) || ((!staggeredGridLayoutManager.E && staggeredGridLayoutManager.getPosition(view2) <= i7) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.E && staggeredGridLayoutManager.getPosition(view3) <= i7) || ((!staggeredGridLayoutManager.E && staggeredGridLayoutManager.getPosition(view3) >= i7) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public final int h(int i7) {
        int i10 = this.f2694b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        ArrayList arrayList = this.f2693a;
        if (arrayList.size() == 0) {
            return i7;
        }
        View view = (View) arrayList.get(0);
        p1 p1Var = (p1) view.getLayoutParams();
        this.f2694b = this.f2698f.f2544i.e(view);
        p1Var.getClass();
        return this.f2694b;
    }
}
