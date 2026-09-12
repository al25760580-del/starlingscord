package g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9452e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9453i = ib.a.b(0, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9454v = u.f9456a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9455w;

    public t() {
        int i7 = m0.d.f15346b;
        this.f9455w = m0.d.f15345a;
    }

    public final void o() {
        this.f9451d = lo.j.d((int) (this.f9453i >> 32), m0.a.d(this.f9454v), m0.a.b(this.f9454v));
        int iD = lo.j.d((int) (this.f9453i & 4294967295L), m0.a.c(this.f9454v), m0.a.a(this.f9454v));
        this.f9452e = iD;
        int i7 = this.f9451d;
        long j = this.f9453i;
        this.f9455w = gn.h.e((i7 - ((int) (j >> 32))) / 2, (iD - ((int) (j & 4294967295L))) / 2);
    }

    public abstract void p(long j);

    public final void q(long j) {
        if (this.f9453i == j) {
            return;
        }
        this.f9453i = j;
        o();
    }

    public final void r(long j) {
        if (this.f9454v == j) {
            return;
        }
        this.f9454v = j;
        o();
    }
}
