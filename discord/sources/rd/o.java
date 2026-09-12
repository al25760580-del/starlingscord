package rd;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.LoadEventInfo;
import gc.f0;
import gc.o0;
import gc.p0;
import hc.c0;
import he.k0;
import he.n0;
import he.u0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import je.e0;
import md.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends md.a {
    public final l E;
    public final p0 F;
    public final c G;
    public final i8.c H;
    public final mc.s I;
    public final o9.d J;
    public final boolean K;
    public final int L;
    public final sd.c M;
    public final long N;
    public final MediaItem O;
    public o0 P;
    public u0 Q;

    static {
        f0.a("goog.exo.hls");
    }

    public o(MediaItem mediaItem, c cVar, l lVar, i8.c cVar2, mc.s sVar, o9.d dVar, sd.c cVar3, long j, boolean z5, int i7) {
        p0 p0Var = mediaItem.f5534e;
        p0Var.getClass();
        this.F = p0Var;
        this.O = mediaItem;
        this.P = mediaItem.f5536v;
        this.G = cVar;
        this.E = lVar;
        this.H = cVar2;
        this.I = sVar;
        this.J = dVar;
        this.M = cVar3;
        this.N = j;
        this.K = z5;
        this.L = i7;
    }

    public static sd.d v(long j, List list) {
        sd.d dVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            sd.d dVar2 = (sd.d) list.get(i7);
            long j5 = dVar2.f19864w;
            if (j5 > j || !dVar2.I) {
                if (j5 > j) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // md.a
    public final md.q b(md.s sVar, he.q qVar, long j) {
        a1.d dVarA = a(sVar);
        mc.n nVar = new mc.n(this.f15582v.f15570c, 0, sVar);
        u0 u0Var = this.Q;
        c0 c0Var = this.f15585y;
        je.b.l(c0Var);
        return new n(this.E, this.M, this.G, u0Var, this.I, nVar, this.J, dVarA, qVar, this.H, this.K, this.L, c0Var);
    }

    @Override // md.a
    public final MediaItem i() {
        return this.O;
    }

    @Override // md.a
    public final void k() throws IOException {
        sd.c cVar = this.M;
        k0 k0Var = cVar.f19856y;
        if (k0Var != null) {
            k0Var.b();
        }
        Uri uri = cVar.H;
        if (uri != null) {
            sd.b bVar = (sd.b) cVar.f19853v.get(uri);
            bVar.f19844e.b();
            IOException iOException = bVar.G;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // md.a
    public final void m(u0 u0Var) {
        this.Q = u0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        c0 c0Var = this.f15585y;
        je.b.l(c0Var);
        mc.s sVar = this.I;
        sVar.e(looperMyLooper, c0Var);
        sVar.a();
        a1.d dVarA = a(null);
        Uri uri = this.F.f9811d;
        sd.c cVar = this.M;
        cVar.getClass();
        cVar.E = e0.m(null);
        cVar.f19855x = dVarA;
        cVar.F = this;
        n0 n0Var = new n0(cVar.f19850d.f19262a.createDataSource(), uri, 4, cVar.f19851e.u());
        je.b.k(cVar.f19856y == null);
        k0 k0Var = new k0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f19856y = k0Var;
        o9.d dVar = cVar.f19852i;
        int i7 = n0Var.f10636i;
        k0Var.f(n0Var, cVar, dVar.k(i7));
        dVarA.s(new LoadEventInfo(n0Var.f10635e), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // md.a
    public final void q(md.q qVar) {
        n nVar = (n) qVar;
        nVar.f19297e.f19854w.remove(nVar);
        for (t tVar : nVar.Q) {
            if (tVar.a0) {
                for (s sVar : tVar.S) {
                    sVar.h();
                    mc.k kVar = sVar.f15672h;
                    if (kVar != null) {
                        kVar.d(sVar.f15669e);
                        sVar.f15672h = null;
                        sVar.f15671g = null;
                    }
                }
            }
            tVar.G.e(tVar);
            tVar.O.removeCallbacksAndMessages(null);
            tVar.f19321e0 = true;
            tVar.P.clear();
        }
        nVar.N = null;
    }

    @Override // md.a
    public final void s() {
        sd.c cVar = this.M;
        cVar.H = null;
        cVar.I = null;
        cVar.G = null;
        cVar.K = -9223372036854775807L;
        cVar.f19856y.e(null);
        cVar.f19856y = null;
        HashMap map = cVar.f19853v;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((sd.b) it.next()).f19844e.e(null);
        }
        cVar.E.removeCallbacksAndMessages(null);
        cVar.E = null;
        map.clear();
        this.I.release();
    }

    public final void w(sd.i iVar) {
        long j;
        s0 s0Var;
        long j5;
        long jI;
        long j7;
        boolean z5 = iVar.f19882p;
        boolean z6 = iVar.f19875g;
        ei.e0 e0Var = iVar.f19884r;
        long j10 = iVar.f19887u;
        long jI2 = iVar.f19873e;
        int i7 = iVar.f19872d;
        long j11 = iVar.f19876h;
        long jU = z5 ? e0.U(j11) : -9223372036854775807L;
        long j12 = (i7 == 2 || i7 == 1) ? jU : -9223372036854775807L;
        sd.c cVar = this.M;
        cVar.G.getClass();
        d dVar = new d();
        long j13 = 0;
        if (cVar.J) {
            sd.h hVar = iVar.f19888v;
            long j14 = j11 - cVar.K;
            boolean z7 = iVar.f19881o;
            long j15 = z7 ? j14 + j10 : -9223372036854775807L;
            long jI3 = iVar.f19882p ? e0.I(e0.v(this.N)) - (j11 + j10) : 0L;
            long j16 = this.P.f9802d;
            if (j16 != -9223372036854775807L) {
                jI = e0.I(j16);
            } else {
                if (jI2 != -9223372036854775807L) {
                    j5 = j10 - jI2;
                } else {
                    j5 = hVar.f19870d;
                    if (j5 == -9223372036854775807L || iVar.f19880n == -9223372036854775807L) {
                        j5 = hVar.f19869c;
                        if (j5 == -9223372036854775807L) {
                            j5 = 3 * iVar.f19879m;
                        }
                    }
                }
                jI = j5 + jI3;
            }
            long j17 = j10 + jI3;
            long j18 = e0.j(jI, jI3, j17);
            o0 o0Var = this.O.f5536v;
            boolean z10 = o0Var.f9805v == -3.4028235E38f && o0Var.f9806w == -3.4028235E38f && hVar.f19869c == -9223372036854775807L && hVar.f19870d == -9223372036854775807L;
            long jU2 = e0.U(j18);
            this.P = new o0(jU2, -9223372036854775807L, -9223372036854775807L, z10 ? 1.0f : this.P.f9805v, z10 ? 1.0f : this.P.f9806w);
            if (jI2 == -9223372036854775807L) {
                jI2 = j17 - e0.I(jU2);
            }
            if (z6) {
                j13 = jI2;
            } else {
                sd.d dVarV = v(jI2, iVar.f19885s);
                if (dVarV != null) {
                    j7 = dVarV.f19864w;
                } else if (!e0Var.isEmpty()) {
                    sd.f fVar = (sd.f) e0Var.get(e0.c(Long.valueOf(jI2), true, e0Var));
                    sd.d dVarV2 = v(jI2, fVar.J);
                    j7 = dVarV2 != null ? dVarV2.f19864w : fVar.f19864w;
                }
                j13 = j7;
            }
            s0Var = new s0(j12, jU, j15, iVar.f19887u, j14, j13, true, !z7, i7 == 2 && iVar.f19874f, dVar, this.O, this.P);
        } else {
            if (jI2 == -9223372036854775807L || e0Var.isEmpty()) {
                j = 0;
            } else {
                if (!z6 && jI2 != j10) {
                    jI2 = ((sd.f) e0Var.get(e0.c(Long.valueOf(jI2), true, e0Var))).f19864w;
                }
                j = jI2;
            }
            long j19 = iVar.f19887u;
            s0Var = new s0(j12, jU, j19, j19, 0L, j, true, false, true, dVar, this.O, null);
        }
        o(s0Var);
    }
}
