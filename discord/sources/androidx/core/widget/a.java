package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1771i;

    public final float a(long j) {
        long j5 = this.f1767e;
        if (j < j5) {
            return 0.0f;
        }
        long j7 = this.f1769g;
        if (j7 < 0 || j < j7) {
            return d.b((j - j5) / this.f1763a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f1770h;
        return (d.b((j - j7) / this.f1771i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
