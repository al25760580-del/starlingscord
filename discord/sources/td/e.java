package td;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.discord.jank_stats.JankRecordStore;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import gc.h1;
import gc.p0;
import hc.c0;
import he.a0;
import he.f0;
import he.h0;
import he.j0;
import he.k0;
import he.l0;
import he.m;
import he.m0;
import he.n0;
import he.s0;
import he.u0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;
import mc.n;
import mc.s;
import md.q;
import od.h;
import sm.f;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends md.a implements f0 {
    public final boolean E;
    public final Uri F;
    public final MediaItem G;
    public final DataSource.Factory H;
    public final a I;
    public final i8.c J;
    public final s K;
    public final o9.d L;
    public final long M;
    public final a1.d N;
    public final m0 O;
    public final ArrayList P;
    public DataSource Q;
    public k0 R;
    public l0 S;
    public u0 T;
    public long U;
    public ud.c V;
    public Handler W;

    static {
        gc.f0.a("goog.exo.smoothstreaming");
    }

    public e(MediaItem mediaItem, DataSource.Factory factory, m0 m0Var, a aVar, i8.c cVar, s sVar, o9.d dVar, long j) {
        this.G = mediaItem;
        p0 p0Var = mediaItem.f5534e;
        p0Var.getClass();
        Uri uriWithAppendedPath = p0Var.f9811d;
        this.V = null;
        if (uriWithAppendedPath.equals(Uri.EMPTY)) {
            uriWithAppendedPath = null;
        } else {
            int i7 = e0.f13788a;
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = e0.j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.F = uriWithAppendedPath;
        this.H = factory;
        this.O = m0Var;
        this.I = aVar;
        this.J = cVar;
        this.K = sVar;
        this.L = dVar;
        this.M = j;
        this.N = a(null);
        this.E = false;
        this.P = new ArrayList();
    }

    @Override // md.a
    public final q b(md.s sVar, he.q qVar, long j) {
        a1.d dVarA = a(sVar);
        n nVar = new n(this.f15582v.f15570c, 0, sVar);
        d dVar = new d(this.V, this.I, this.T, this.J, this.K, nVar, this.L, dVarA, this.S, qVar);
        this.P.add(dVar);
        return dVar;
    }

    @Override // he.f0
    public final void e(h0 h0Var, long j, long j5) {
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.L.getClass();
        this.N.m(loadEventInfo, n0Var.f10636i);
        this.V = (ud.c) n0Var.f10639x;
        this.U = j - j5;
        v();
        if (this.V.f21060d) {
            this.W.postDelayed(new f(1, this), Math.max(0L, (this.U + JankRecordStore.FIRST_FLUSH_DELAY_MS) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // md.a
    public final MediaItem i() {
        return this.G;
    }

    @Override // md.a
    public final void k() {
        this.S.b();
    }

    @Override // md.a
    public final void m(u0 u0Var) {
        this.T = u0Var;
        Looper looperMyLooper = Looper.myLooper();
        c0 c0Var = this.f15585y;
        je.b.l(c0Var);
        s sVar = this.K;
        sVar.e(looperMyLooper, c0Var);
        sVar.a();
        if (this.E) {
            this.S = new i8.b(8);
            v();
            return;
        }
        this.Q = this.H.createDataSource();
        k0 k0Var = new k0("SsMediaSource");
        this.R = k0Var;
        this.S = k0Var;
        this.W = e0.m(null);
        w();
    }

    @Override // he.f0
    public final ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        long jMin;
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        int i10 = n0Var.f10636i;
        this.L.getClass();
        if (!(iOException instanceof h1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof a0) && !(iOException instanceof j0)) {
            int i11 = m.f10627e;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i7 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof m) && ((m) cause).f10628d == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        ad.f fVar = jMin == -9223372036854775807L ? k0.f10620x : new ad.f(0, jMin, false);
        this.N.q(loadEventInfo, i10, iOException, !fVar.a());
        return fVar;
    }

    @Override // he.f0
    public final void p(h0 h0Var, long j, long j5, boolean z5) {
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.L.getClass();
        this.N.k(loadEventInfo, n0Var.f10636i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // md.a
    public final void q(q qVar) {
        d dVar = (d) qVar;
        for (h hVar : dVar.J) {
            hVar.q(null);
        }
        dVar.H = null;
        this.P.remove(qVar);
    }

    @Override // md.a
    public final void s() {
        this.V = this.E ? this.V : null;
        this.Q = null;
        this.U = 0L;
        k0 k0Var = this.R;
        if (k0Var != null) {
            k0Var.e(null);
            this.R = null;
        }
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.W = null;
        }
        this.K.release();
    }

    public final void v() {
        md.s0 s0Var;
        char c8;
        char c10 = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i7);
            ud.c cVar = this.V;
            dVar.I = cVar;
            for (h hVar : dVar.J) {
                b bVar = (b) hVar.f17237w;
                ud.b[] bVarArr = bVar.f20716f.f21062f;
                int i10 = bVar.f20712b;
                ud.b bVar2 = bVarArr[i10];
                int i11 = bVar2.k;
                long[] jArr = bVar2.f21055o;
                ud.b bVar3 = cVar.f21062f[i10];
                if (i11 == 0 || bVar3.k == 0) {
                    bVar.f20717g += i11;
                } else {
                    int i12 = i11 - 1;
                    long jB = bVar2.b(i12) + jArr[i12];
                    long j = bVar3.f21055o[0];
                    if (jB <= j) {
                        bVar.f20717g += i11;
                    } else {
                        bVar.f20717g = e0.e(jArr, j, true) + bVar.f20717g;
                    }
                }
                bVar.f20716f = cVar;
            }
            dVar.H.c(dVar);
            i7++;
        }
        ud.b[] bVarArr2 = this.V.f21062f;
        int length = bVarArr2.length;
        long jMax = Long.MIN_VALUE;
        int i13 = 0;
        long jMax2 = Long.MAX_VALUE;
        while (i13 < length) {
            ud.b bVar4 = bVarArr2[i13];
            int i14 = bVar4.k;
            long[] jArr2 = bVar4.f21055o;
            if (i14 > 0) {
                c8 = c10;
                jMax2 = Math.min(jMax2, jArr2[c8]);
                int i15 = bVar4.k - 1;
                jMax = Math.max(jMax, bVar4.b(i15) + jArr2[i15]);
            } else {
                c8 = c10;
            }
            i13++;
            c10 = c8;
            bVarArr2 = bVarArr2;
        }
        if (jMax2 == LongCompanionObject.MAX_VALUE) {
            long j5 = this.V.f21060d ? -9223372036854775807L : 0L;
            ud.c cVar2 = this.V;
            boolean z5 = cVar2.f21060d;
            s0Var = new md.s0(j5, 0L, 0L, 0L, true, z5, z5, cVar2, this.G);
        } else {
            ud.c cVar3 = this.V;
            if (cVar3.f21060d) {
                long j7 = cVar3.f21064h;
                if (j7 != -9223372036854775807L && j7 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j7);
                }
                long j10 = jMax2;
                long j11 = jMax - j10;
                long jI = j11 - e0.I(this.M);
                if (jI < 5000000) {
                    jI = Math.min(5000000L, j11 / 2);
                }
                s0Var = new md.s0(-9223372036854775807L, j11, j10, jI, true, true, true, this.V, this.G);
            } else {
                long j12 = cVar3.f21063g;
                if (j12 == -9223372036854775807L) {
                    j12 = jMax - jMax2;
                }
                long j13 = j12;
                long j14 = jMax2;
                s0Var = new md.s0(-9223372036854775807L, -9223372036854775807L, j14 + j13, j13, j14, 0L, true, false, false, this.V, this.G, null);
            }
        }
        o(s0Var);
    }

    public final void w() {
        if (this.R.c()) {
            return;
        }
        n0 n0Var = new n0(this.Q, this.F, 4, this.O);
        k0 k0Var = this.R;
        o9.d dVar = this.L;
        int i7 = n0Var.f10636i;
        k0Var.f(n0Var, this, dVar.k(i7));
        this.N.s(new LoadEventInfo(n0Var.f10635e), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
