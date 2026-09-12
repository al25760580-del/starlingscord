package vp;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f21908e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21909i;

    public l(int i7, i0 i0Var, boolean z5) {
        this.f21907d = i7;
        this.f21908e = i0Var;
        this.f21909i = z5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21907d - ((l) obj).f21907d;
    }
}
