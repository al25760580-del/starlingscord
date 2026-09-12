package od;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import he.p;
import he.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends e {
    public final d G;
    public e4.c H;
    public long I;
    public volatile boolean J;

    public k(DataSource dataSource, p pVar, Format format, int i7, Object obj, d dVar) {
        super(dataSource, pVar, 2, format, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.G = dVar;
    }

    @Override // he.h0
    public final void l() {
        if (this.I == 0) {
            this.G.a(this.H, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p pVarC = this.f17222e.c(this.I);
            s0 s0Var = this.F;
            pc.h hVar = new pc.h(s0Var, pVarC.f10654f, s0Var.d(pVarC));
            while (!this.J) {
                try {
                    int iD = this.G.f17214d.d(hVar, d.G);
                    boolean z5 = false;
                    je.b.k(iD != 1);
                    if (iD == 0) {
                        z5 = true;
                    }
                    if (!z5) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.I = hVar.f17895v - this.f17222e.f10654f;
                    throw th2;
                }
            }
            this.I = hVar.f17895v - this.f17222e.f10654f;
            c9.a.f(this.F);
        } catch (Throwable th3) {
            c9.a.f(this.F);
            throw th3;
        }
    }

    @Override // he.h0
    public final void t() {
        this.J = true;
    }
}
