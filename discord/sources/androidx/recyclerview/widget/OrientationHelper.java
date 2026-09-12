package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class OrientationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.LayoutManager f2488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2489b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2490c = new Rect();

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.f2488a = layoutManager;
    }

    public static OrientationHelper a(RecyclerView.LayoutManager layoutManager, int i7) {
        if (i7 == 0) {
            return new r0(layoutManager);
        }
        if (i7 == 1) {
            return new s0(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f2489b) {
            return 0;
        }
        return l() - this.f2489b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i7);
}
