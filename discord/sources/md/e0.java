package md;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f15613e;

    public e0(g0 g0Var, int i7) {
        this.f15613e = g0Var;
        this.f15612d = i7;
    }

    @Override // md.o0
    public final void b() throws IOException {
        int i7 = this.f15612d;
        g0 g0Var = this.f15613e;
        g0Var.P[i7].t();
        he.k0 k0Var = g0Var.H;
        int iK = g0Var.f15631v.k(g0Var.Y);
        IOException iOException = k0Var.f10623i;
        if (iOException != null) {
            throw iOException;
        }
        he.g0 g0Var2 = k0Var.f10622e;
        if (g0Var2 != null) {
            if (iK == Integer.MIN_VALUE) {
                iK = g0Var2.f10604d;
            }
            IOException iOException2 = g0Var2.f10608w;
            if (iOException2 != null && g0Var2.f10609x > iK) {
                throw iOException2;
            }
        }
    }

    @Override // md.o0
    public final int c(e4.r rVar, lc.f fVar, int i7) {
        g0 g0Var = this.f15613e;
        if (g0Var.u()) {
            return -3;
        }
        int i10 = this.f15612d;
        g0Var.m(i10);
        int iW = g0Var.P[i10].w(rVar, fVar, i7, g0Var.h0);
        if (iW == -3) {
            g0Var.o(i10);
        }
        return iW;
    }

    @Override // md.o0
    public final int f(long j) throws Throwable {
        g0 g0Var = this.f15613e;
        if (g0Var.u()) {
            return 0;
        }
        int i7 = this.f15612d;
        g0Var.m(i7);
        n0 n0Var = g0Var.P[i7];
        int iP = n0Var.p(j, g0Var.h0);
        n0Var.z(iP);
        if (iP == 0) {
            g0Var.o(i7);
        }
        return iP;
    }

    @Override // md.o0
    public final boolean isReady() {
        g0 g0Var = this.f15613e;
        return !g0Var.u() && g0Var.P[this.f15612d].r(g0Var.h0);
    }
}
