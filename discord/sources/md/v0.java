package md;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import gc.h1;
import gc.q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements q, he.f0 {
    public final long E;
    public final Format G;
    public final boolean H;
    public boolean I;
    public byte[] J;
    public int K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final he.p f15716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataSource.Factory f15717e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final he.u0 f15718i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o9.d f15719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a1.d f15720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0 f15721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f15722y = new ArrayList();
    public final he.k0 F = new he.k0("SingleSampleMediaPeriod");

    public v0(he.p pVar, DataSource.Factory factory, he.u0 u0Var, Format format, long j, o9.d dVar, a1.d dVar2, boolean z5) {
        this.f15716d = pVar;
        this.f15717e = factory;
        this.f15718i = u0Var;
        this.G = format;
        this.E = j;
        this.f15719v = dVar;
        this.f15720w = dVar2;
        this.H = z5;
        this.f15721x = new y0(new x0("", format));
    }

    @Override // md.q0
    public final boolean C() {
        return this.F.d();
    }

    @Override // md.q
    public final long I() {
        return -9223372036854775807L;
    }

    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        for (int i7 = 0; i7 < pVarArr.length; i7++) {
            o0 o0Var = o0VarArr[i7];
            ArrayList arrayList = this.f15722y;
            if (o0Var != null && (pVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(o0Var);
                o0VarArr[i7] = null;
            }
            if (o0VarArr[i7] == null && pVarArr[i7] != null) {
                t0 t0Var = new t0(this);
                arrayList.add(t0Var);
                o0VarArr[i7] = t0Var;
                zArr2[i7] = true;
            }
        }
        return j;
    }

    @Override // md.q
    public final y0 Q() {
        return this.f15721x;
    }

    @Override // md.q0
    public final long S() {
        return this.I ? Long.MIN_VALUE : 0L;
    }

    @Override // he.f0
    public final void e(he.h0 h0Var, long j, long j5) {
        u0 u0Var = (u0) h0Var;
        this.K = (int) u0Var.f15712e.f10699e;
        byte[] bArr = u0Var.f15713i;
        bArr.getClass();
        this.J = bArr;
        this.I = true;
        he.s0 s0Var = u0Var.f15712e;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(this.K, s0Var.f10701v);
        this.f15719v.getClass();
        this.f15720w.n(loadEventInfo, 1, -1, this.G, 0, null, 0L, this.E);
    }

    @Override // md.q0
    public final long k() {
        return (this.I || this.F.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // md.q
    public final void l(p pVar, long j) {
        pVar.d(this);
    }

    @Override // he.f0
    public final ad.f n(he.h0 h0Var, long j, long j5, IOException iOException, int i7) {
        long jMin;
        ad.f fVar;
        he.s0 s0Var = ((u0) h0Var).f15712e;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        int i10 = je.e0.f13788a;
        o9.d dVar = this.f15719v;
        dVar.getClass();
        if (!(iOException instanceof h1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof he.a0) && !(iOException instanceof he.j0)) {
            int i11 = he.m.f10627e;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i7 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof he.m) && ((he.m) cause).f10628d == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z5 = jMin == -9223372036854775807L || i7 >= dVar.k(1);
        if (this.H && z5) {
            je.b.O("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.I = true;
            fVar = he.k0.f10619w;
        } else {
            fVar = jMin != -9223372036854775807L ? new ad.f(0, jMin, false) : he.k0.f10620x;
        }
        this.f15720w.p(loadEventInfo, 1, -1, this.G, 0, null, 0L, this.E, iOException, !fVar.a());
        return fVar;
    }

    @Override // he.f0
    public final void p(he.h0 h0Var, long j, long j5, boolean z5) {
        he.s0 s0Var = ((u0) h0Var).f15712e;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.f15719v.getClass();
        this.f15720w.k(loadEventInfo, 1, -1, null, 0, null, 0L, this.E);
    }

    @Override // md.q
    public final long v(long j) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f15722y;
            if (i7 >= arrayList.size()) {
                return j;
            }
            t0 t0Var = (t0) arrayList.get(i7);
            if (t0Var.f15703d == 2) {
                t0Var.f15703d = 1;
            }
            i7++;
        }
    }

    @Override // md.q0
    public final boolean z(long j) {
        if (this.I) {
            return false;
        }
        he.k0 k0Var = this.F;
        if (k0Var.d() || k0Var.c()) {
            return false;
        }
        DataSource dataSourceCreateDataSource = this.f15717e.createDataSource();
        he.u0 u0Var = this.f15718i;
        if (u0Var != null) {
            dataSourceCreateDataSource.B(u0Var);
        }
        he.p pVar = this.f15716d;
        k0Var.f(new u0(dataSourceCreateDataSource, pVar), this, this.f15719v.k(1));
        this.f15720w.s(new LoadEventInfo(pVar), 1, -1, this.G, 0, null, 0L, this.E);
        return true;
    }

    @Override // md.q
    public final void r() {
    }

    @Override // md.q0
    public final void W(long j) {
    }

    @Override // md.q
    public final void w(long j) {
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        return j;
    }
}
