package od;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import he.p;
import he.s0;
import md.n0;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends a {
    public final int L;
    public final Format M;
    public long N;
    public boolean O;

    public n(DataSource dataSource, p pVar, Format format, int i7, Object obj, long j, long j5, long j7, int i10, Format format2) {
        super(dataSource, pVar, format, i7, obj, j, j5, -9223372036854775807L, -9223372036854775807L, j7);
        this.L = i10;
        this.M = format2;
    }

    @Override // od.l
    public final boolean b() {
        return this.O;
    }

    @Override // he.h0
    public final void l() {
        s0 s0Var = this.F;
        e4.c cVar = this.J;
        je.b.l(cVar);
        for (n0 n0Var : (n0[]) cVar.f7967i) {
            if (n0Var.F != 0) {
                n0Var.F = 0L;
                n0Var.f15688z = true;
            }
        }
        x xVarU = cVar.U(this.L);
        xVarU.e(this.M);
        try {
            long jD = s0Var.d(this.f17222e.c(this.N));
            if (jD != -1) {
                jD += this.N;
            }
            pc.h hVar = new pc.h(this.F, this.N, jD);
            for (int iA = 0; iA != -1; iA = xVarU.a(hVar, Integer.MAX_VALUE, true)) {
                this.N += (long) iA;
            }
            xVarU.c(this.f17227y, 1, (int) this.N, 0, null);
            c9.a.f(s0Var);
            this.O = true;
        } catch (Throwable th2) {
            c9.a.f(s0Var);
            throw th2;
        }
    }

    @Override // he.h0
    public final void t() {
    }
}
