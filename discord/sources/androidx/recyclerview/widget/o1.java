package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2664g;

    public o1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2664g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2658a = -1;
        this.f2659b = Integer.MIN_VALUE;
        this.f2660c = false;
        this.f2661d = false;
        this.f2662e = false;
        int[] iArr = this.f2663f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
