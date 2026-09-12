package md;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.DataSource;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends a {
    public final MediaItem E;
    public final gc.p0 F;
    public final DataSource.Factory G;
    public final gc.o H;
    public final mc.s I;
    public final o9.d J;
    public final int K;
    public boolean L;
    public long M;
    public boolean N;
    public boolean O;
    public he.u0 P;

    public i0(MediaItem mediaItem, DataSource.Factory factory, gc.o oVar, mc.s sVar, o9.d dVar) {
        gc.p0 p0Var = mediaItem.f5534e;
        p0Var.getClass();
        this.F = p0Var;
        this.E = mediaItem;
        this.G = factory;
        this.H = oVar;
        this.I = sVar;
        this.J = dVar;
        this.K = 1048576;
        this.L = true;
        this.M = -9223372036854775807L;
    }

    @Override // md.a
    public final q b(s sVar, he.q qVar, long j) {
        DataSource dataSourceCreateDataSource = this.G.createDataSource();
        he.u0 u0Var = this.P;
        if (u0Var != null) {
            dataSourceCreateDataSource.B(u0Var);
        }
        gc.p0 p0Var = this.F;
        Uri uri = p0Var.f9811d;
        je.b.l(this.f15585y);
        return new g0(uri, dataSourceCreateDataSource, new e4.m((pc.i) this.H.f9799e), this.I, new mc.n(this.f15582v.f15570c, 0, sVar), this.J, a(sVar), this, qVar, p0Var.f9816x, this.K);
    }

    @Override // md.a
    public final MediaItem i() {
        return this.E;
    }

    @Override // md.a
    public final void m(he.u0 u0Var) {
        this.P = u0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        hc.c0 c0Var = this.f15585y;
        je.b.l(c0Var);
        mc.s sVar = this.I;
        sVar.e(looperMyLooper, c0Var);
        sVar.a();
        v();
    }

    @Override // md.a
    public final void q(q qVar) {
        g0 g0Var = (g0) qVar;
        if (g0Var.S) {
            for (n0 n0Var : g0Var.P) {
                n0Var.h();
                mc.k kVar = n0Var.f15672h;
                if (kVar != null) {
                    kVar.d(n0Var.f15669e);
                    n0Var.f15672h = null;
                    n0Var.f15671g = null;
                }
            }
        }
        g0Var.H.e(g0Var);
        g0Var.M.removeCallbacksAndMessages(null);
        g0Var.N = null;
        g0Var.f15630i0 = true;
    }

    @Override // md.a
    public final void s() {
        this.I.release();
    }

    public final void v() {
        Timeline s0Var = new s0(this.M, this.N, this.O, this.E);
        if (this.L) {
            s0Var = new h0(s0Var);
        }
        o(s0Var);
    }

    public final void w(long j, boolean z5, boolean z6) {
        if (j == -9223372036854775807L) {
            j = this.M;
        }
        if (!this.L && this.M == j && this.N == z5 && this.O == z6) {
            return;
        }
        this.M = j;
        this.N = z5;
        this.O = z6;
        this.L = false;
        v();
    }

    @Override // md.a
    public final void k() {
    }
}
