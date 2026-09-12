package od;

import e4.r;
import md.n0;
import md.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f17228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f17229e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17230i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f17232w;

    public f(h hVar, h hVar2, n0 n0Var, int i7) {
        this.f17232w = hVar;
        this.f17228d = hVar2;
        this.f17229e = n0Var;
        this.f17230i = i7;
    }

    public final void a() {
        if (this.f17231v) {
            return;
        }
        h hVar = this.f17232w;
        a1.d dVar = hVar.f17239y;
        int[] iArr = hVar.f17234e;
        int i7 = this.f17230i;
        dVar.f(iArr[i7], hVar.f17235i[i7], 0, null, hVar.Q);
        this.f17231v = true;
    }

    @Override // md.o0
    public final int c(r rVar, lc.f fVar, int i7) {
        h hVar = this.f17232w;
        if (hVar.j()) {
            return -3;
        }
        a aVar = hVar.S;
        n0 n0Var = this.f17229e;
        if (aVar != null && aVar.c(this.f17230i + 1) <= n0Var.n()) {
            return -3;
        }
        a();
        return n0Var.w(rVar, fVar, i7, hVar.T);
    }

    @Override // md.o0
    public final int f(long j) throws Throwable {
        h hVar = this.f17232w;
        if (hVar.j()) {
            return 0;
        }
        boolean z5 = hVar.T;
        n0 n0Var = this.f17229e;
        int iP = n0Var.p(j, z5);
        a aVar = hVar.S;
        if (aVar != null) {
            iP = Math.min(iP, aVar.c(this.f17230i + 1) - n0Var.n());
        }
        n0Var.z(iP);
        if (iP > 0) {
            a();
        }
        return iP;
    }

    @Override // md.o0
    public final boolean isReady() {
        h hVar = this.f17232w;
        return !hVar.j() && this.f17229e.r(hVar.T);
    }

    @Override // md.o0
    public final void b() {
    }
}
