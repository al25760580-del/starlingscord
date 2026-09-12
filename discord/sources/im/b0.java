package im;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f11872d = new b0(-1.0d, 0.0d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f11873e = new b0(1.0d, 0.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f11874f = new b0(0.0d, -1.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f11875g = new b0(0.0d, 1.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f11876h = new b0(1.0d, -1.0d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f11877i = new b0(1.0d, 1.0d);
    public static final b0 j = new b0(-1.0d, -1.0d);
    public static final b0 k = new b0(-1.0d, 1.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f11878l = new b0(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f11880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f11881c;

    public b0(double d6, double d7) {
        double dHypot = Math.hypot(d6, d7);
        this.f11881c = dHypot;
        boolean z5 = dHypot > 0.1d;
        this.f11879a = z5 ? d6 / dHypot : 0.0d;
        this.f11880b = z5 ? d7 / dHypot : 0.0d;
    }
}
