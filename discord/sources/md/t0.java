package md;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15704e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v0 f15705i;

    public t0(v0 v0Var) {
        this.f15705i = v0Var;
    }

    public final void a() {
        if (this.f15704e) {
            return;
        }
        v0 v0Var = this.f15705i;
        v0Var.f15720w.f(je.o.h(v0Var.G.I), v0Var.G, 0, null, 0L);
        this.f15704e = true;
    }

    @Override // md.o0
    public final void b() {
        v0 v0Var = this.f15705i;
        if (v0Var.H) {
            return;
        }
        v0Var.F.b();
    }

    @Override // md.o0
    public final int c(e4.r rVar, lc.f fVar, int i7) {
        a();
        v0 v0Var = this.f15705i;
        boolean z5 = v0Var.I;
        if (z5 && v0Var.J == null) {
            this.f15703d = 2;
        }
        int i10 = this.f15703d;
        if (i10 == 2) {
            fVar.a(4);
            return -4;
        }
        if ((i7 & 2) != 0 || i10 == 0) {
            rVar.f8035i = v0Var.G;
            this.f15703d = 1;
            return -5;
        }
        if (!z5) {
            return -3;
        }
        v0Var.J.getClass();
        fVar.a(1);
        fVar.f15012x = 0L;
        if ((i7 & 4) == 0) {
            fVar.i(v0Var.K);
            fVar.f15010v.put(v0Var.J, 0, v0Var.K);
        }
        if ((i7 & 1) == 0) {
            this.f15703d = 2;
        }
        return -4;
    }

    @Override // md.o0
    public final int f(long j) {
        a();
        if (j <= 0 || this.f15703d == 2) {
            return 0;
        }
        this.f15703d = 2;
        return 1;
    }

    @Override // md.o0
    public final boolean isReady() {
        return this.f15705i.I;
    }
}
