package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9222i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9230s;

    public final boolean a(boolean z5) {
        if (this.f9223l <= 0) {
            return false;
        }
        if (z5 || this.k <= 0) {
            return z5 && this.j > 0;
        }
        return true;
    }

    public final void b() {
        if (this.f9222i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
