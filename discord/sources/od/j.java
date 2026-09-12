package od;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import he.p;
import he.s0;
import md.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {
    public final int L;
    public final long M;
    public final d N;
    public long O;
    public volatile boolean P;
    public boolean Q;

    public j(DataSource dataSource, p pVar, Format format, int i7, Object obj, long j, long j5, long j7, long j10, long j11, int i10, long j12, d dVar) {
        super(dataSource, pVar, format, i7, obj, j, j5, j7, j10, j11);
        this.L = i10;
        this.M = j12;
        this.N = dVar;
    }

    @Override // od.l
    public final long a() {
        return this.G + ((long) this.L);
    }

    @Override // od.l
    public final boolean b() {
        return this.Q;
    }

    @Override // he.h0
    public final void l() {
        if (this.O == 0) {
            e4.c cVar = this.J;
            je.b.l(cVar);
            long j = this.M;
            for (n0 n0Var : (n0[]) cVar.f7967i) {
                if (n0Var.F != j) {
                    n0Var.F = j;
                    n0Var.f15688z = true;
                }
            }
            d dVar = this.N;
            long j5 = this.H;
            long j7 = j5 == -9223372036854775807L ? -9223372036854775807L : j5 - this.M;
            long j10 = this.I;
            dVar.a(cVar, j7, j10 != -9223372036854775807L ? j10 - this.M : -9223372036854775807L);
        }
        try {
            p pVarC = this.f17222e.c(this.O);
            s0 s0Var = this.F;
            pc.h hVar = new pc.h(s0Var, pVarC.f10654f, s0Var.d(pVarC));
            while (!this.P) {
                try {
                    int iD = this.N.f17214d.d(hVar, d.G);
                    je.b.k(iD != 1);
                    if (!(iD == 0)) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.O = hVar.f17895v - this.f17222e.f10654f;
                    throw th2;
                }
            }
            this.O = hVar.f17895v - this.f17222e.f10654f;
            c9.a.f(this.F);
            this.Q = !this.P;
        } catch (Throwable th3) {
            c9.a.f(this.F);
            throw th3;
        }
    }

    @Override // he.h0
    public final void t() {
        this.P = true;
    }
}
