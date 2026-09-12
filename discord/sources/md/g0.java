package md;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import gc.h1;
import gc.q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements q, pc.m, he.f0, he.i0, m0 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Map f15619j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Format f15620k0;
    public final he.q E;
    public final String F;
    public final long G;
    public final e4.m I;
    public p N;
    public gd.b O;
    public boolean R;
    public boolean S;
    public boolean T;
    public com.google.firebase.messaging.r U;
    public pc.u V;
    public boolean X;
    public boolean Z;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f15621b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f15622c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f15623d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f15624d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataSource f15625e;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f15627f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f15628g0;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mc.s f15629i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f15630i0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o9.d f15631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a1.d f15632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mc.n f15633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0 f15634y;
    public final he.k0 H = new he.k0("ProgressiveMediaPeriod");
    public final a5.i0 J = new a5.i0(0);
    public final c0 K = new c0(this, 0);
    public final c0 L = new c0(this, 1);
    public final Handler M = je.e0.m(null);
    public f0[] Q = new f0[0];
    public n0[] P = new n0[0];

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f15626e0 = -9223372036854775807L;
    public long W = -9223372036854775807L;
    public int Y = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f15619j0 = Collections.unmodifiableMap(map);
        gc.g0 g0Var = new gc.g0();
        g0Var.f9635a = "icy";
        g0Var.k = "application/x-icy";
        f15620k0 = new Format(g0Var);
    }

    public g0(Uri uri, DataSource dataSource, e4.m mVar, mc.s sVar, mc.n nVar, o9.d dVar, a1.d dVar2, i0 i0Var, he.q qVar, String str, int i7) {
        this.f15623d = uri;
        this.f15625e = dataSource;
        this.f15629i = sVar;
        this.f15633x = nVar;
        this.f15631v = dVar;
        this.f15632w = dVar2;
        this.f15634y = i0Var;
        this.E = qVar;
        this.F = str;
        this.G = i7;
        this.I = mVar;
    }

    @Override // md.q0
    public final boolean C() {
        boolean z5;
        if (!this.H.d()) {
            return false;
        }
        a5.i0 i0Var = this.J;
        synchronized (i0Var) {
            z5 = i0Var.f214e;
        }
        return z5;
    }

    @Override // md.q
    public final long I() {
        if (!this.a0) {
            return -9223372036854775807L;
        }
        if (!this.h0 && g() <= this.f15628g0) {
            return -9223372036854775807L;
        }
        this.a0 = false;
        return this.f15624d0;
    }

    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        fe.p pVar;
        f();
        com.google.firebase.messaging.r rVar = this.U;
        y0 y0Var = (y0) rVar.f6610d;
        boolean[] zArr3 = (boolean[]) rVar.f6612i;
        int i7 = this.f15621b0;
        int i10 = 0;
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            o0 o0Var = o0VarArr[i11];
            if (o0Var != null && (pVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((e0) o0Var).f15612d;
                je.b.k(zArr3[i12]);
                this.f15621b0--;
                zArr3[i12] = false;
                o0VarArr[i11] = null;
            }
        }
        boolean z5 = !this.Z ? j == 0 : i7 != 0;
        for (int i13 = 0; i13 < pVarArr.length; i13++) {
            if (o0VarArr[i13] == null && (pVar = pVarArr[i13]) != null) {
                je.b.k(pVar.length() == 1);
                je.b.k(pVar.g(0) == 0);
                int iB = y0Var.b(pVar.c());
                je.b.k(!zArr3[iB]);
                this.f15621b0++;
                zArr3[iB] = true;
                o0VarArr[i13] = new e0(this, iB);
                zArr2[i13] = true;
                if (!z5) {
                    n0 n0Var = this.P[iB];
                    z5 = (n0Var.y(j, true) || n0Var.n() == 0) ? false : true;
                }
            }
        }
        if (this.f15621b0 == 0) {
            this.f15627f0 = false;
            this.a0 = false;
            he.k0 k0Var = this.H;
            if (k0Var.d()) {
                n0[] n0VarArr = this.P;
                int length = n0VarArr.length;
                while (i10 < length) {
                    n0VarArr[i10].h();
                    i10++;
                }
                k0Var.a();
            } else {
                for (n0 n0Var2 : this.P) {
                    n0Var2.x(false);
                }
            }
        } else if (z5) {
            j = v(j);
            while (i10 < o0VarArr.length) {
                if (o0VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Z = true;
        return j;
    }

    @Override // md.q
    public final y0 Q() {
        f();
        return (y0) this.U.f6610d;
    }

    @Override // md.q0
    public final long S() {
        long jH;
        boolean z5;
        long j;
        f();
        if (this.h0 || this.f15621b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.f15626e0;
        }
        if (this.T) {
            int length = this.P.length;
            jH = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                com.google.firebase.messaging.r rVar = this.U;
                if (((boolean[]) rVar.f6611e)[i7] && ((boolean[]) rVar.f6612i)[i7]) {
                    n0 n0Var = this.P[i7];
                    synchronized (n0Var) {
                        z5 = n0Var.f15685w;
                    }
                    if (z5) {
                        continue;
                    } else {
                        n0 n0Var2 = this.P[i7];
                        synchronized (n0Var2) {
                            j = n0Var2.f15684v;
                        }
                        jH = Math.min(jH, j);
                    }
                }
            }
        } else {
            jH = Long.MAX_VALUE;
        }
        if (jH == LongCompanionObject.MAX_VALUE) {
            jH = h(false);
        }
        return jH == Long.MIN_VALUE ? this.f15624d0 : jH;
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        f();
        if (!this.V.c()) {
            return 0L;
        }
        pc.t tVarH = this.V.h(j);
        return q1Var.a(j, tVarH.f17927a.f17930a, tVarH.f17928b.f17930a);
    }

    @Override // md.m0
    public final void b() {
        this.M.post(this.K);
    }

    @Override // pc.m
    public final void c(pc.u uVar) {
        this.M.post(new io.sentry.react.d(8, this, uVar));
    }

    @Override // he.i0
    public final void d() {
        for (n0 n0Var : this.P) {
            n0Var.x(true);
            mc.k kVar = n0Var.f15672h;
            if (kVar != null) {
                kVar.d(n0Var.f15669e);
                n0Var.f15672h = null;
                n0Var.f15671g = null;
            }
        }
        e4.m mVar = this.I;
        pc.k kVar2 = (pc.k) mVar.f7994i;
        if (kVar2 != null) {
            kVar2.release();
            mVar.f7994i = null;
        }
        mVar.f7995v = null;
    }

    @Override // he.f0
    public final void e(he.h0 h0Var, long j, long j5) {
        pc.u uVar;
        d0 d0Var = (d0) h0Var;
        if (this.W == -9223372036854775807L && (uVar = this.V) != null) {
            boolean zC = uVar.c();
            long jH = h(true);
            long j7 = jH == Long.MIN_VALUE ? 0L : jH + 10000;
            this.W = j7;
            this.f15634y.w(j7, zC, this.X);
        }
        he.s0 s0Var = d0Var.f15604e;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.f15631v.getClass();
        this.f15632w.n(loadEventInfo, 1, -1, null, 0, null, d0Var.F, this.W);
        this.h0 = true;
        p pVar = this.N;
        pVar.getClass();
        pVar.c(this);
    }

    public final void f() {
        je.b.k(this.S);
        this.U.getClass();
        this.V.getClass();
    }

    public final int g() {
        int i7 = 0;
        for (n0 n0Var : this.P) {
            i7 += n0Var.f15679q + n0Var.f15678p;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long h(boolean z5) {
        n0 n0Var;
        long jMax = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.P.length; i7++) {
            if (z5) {
                n0Var = this.P[i7];
                synchronized (n0Var) {
                    jMax = Math.max(jMax, n0Var.f15684v);
                }
            } else {
                com.google.firebase.messaging.r rVar = this.U;
                rVar.getClass();
                if (((boolean[]) rVar.f6612i)[i7]) {
                    n0Var = this.P[i7];
                    synchronized (n0Var) {
                    }
                    jMax = Math.max(jMax, n0Var.f15684v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean i() {
        return this.f15626e0 != -9223372036854775807L;
    }

    public final void j() {
        if (this.f15630i0 || this.S || !this.R || this.V == null) {
            return;
        }
        for (n0 n0Var : this.P) {
            if (n0Var.q() == null) {
                return;
            }
        }
        this.J.l();
        int length = this.P.length;
        x0[] x0VarArr = new x0[length];
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            Format formatQ = this.P[i7].q();
            formatQ.getClass();
            String str = formatQ.I;
            boolean zJ = je.o.j(str);
            boolean z5 = zJ || je.o.l(str);
            zArr[i7] = z5;
            this.T = z5 | this.T;
            gd.b bVar = this.O;
            if (bVar != null) {
                int i10 = bVar.f9955d;
                if (zJ || this.Q[i7].f15618b) {
                    Metadata metadata = formatQ.G;
                    Metadata metadata2 = metadata == null ? new Metadata(bVar) : metadata.a(bVar);
                    gc.g0 g0VarA = formatQ.a();
                    g0VarA.f9643i = metadata2;
                    formatQ = new Format(g0VarA);
                }
                if (zJ && formatQ.f5531x == -1 && formatQ.f5532y == -1 && i10 != -1) {
                    gc.g0 g0VarA2 = formatQ.a();
                    g0VarA2.f9640f = i10;
                    formatQ = new Format(g0VarA2);
                }
            }
            int iB = this.f15629i.b(formatQ);
            gc.g0 g0VarA3 = formatQ.a();
            g0VarA3.F = iB;
            x0VarArr[i7] = new x0(Integer.toString(i7), new Format(g0VarA3));
        }
        y0 y0Var = new y0(x0VarArr);
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r();
        rVar.f6610d = y0Var;
        rVar.f6611e = zArr;
        int i11 = y0Var.f15737d;
        rVar.f6612i = new boolean[i11];
        rVar.f6613v = new boolean[i11];
        this.U = rVar;
        this.S = true;
        p pVar = this.N;
        pVar.getClass();
        pVar.d(this);
    }

    @Override // md.q0
    public final long k() {
        return S();
    }

    @Override // md.q
    public final void l(p pVar, long j) {
        this.N = pVar;
        this.J.p();
        t();
    }

    public final void m(int i7) {
        f();
        com.google.firebase.messaging.r rVar = this.U;
        boolean[] zArr = (boolean[]) rVar.f6613v;
        if (zArr[i7]) {
            return;
        }
        Format format = ((y0) rVar.f6610d).a(i7).f15730v[0];
        this.f15632w.f(je.o.h(format.I), format, 0, null, this.f15624d0);
        zArr[i7] = true;
    }

    @Override // he.f0
    public final ad.f n(he.h0 h0Var, long j, long j5, IOException iOException, int i7) {
        long jMin;
        ad.f fVar;
        pc.u uVar;
        d0 d0Var = (d0) h0Var;
        he.s0 s0Var = d0Var.f15604e;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        int i10 = je.e0.f13788a;
        this.f15631v.getClass();
        if ((iOException instanceof h1) || (iOException instanceof FileNotFoundException) || (iOException instanceof he.a0) || (iOException instanceof he.j0)) {
            jMin = -9223372036854775807L;
            break;
        }
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
        if (jMin == -9223372036854775807L) {
            fVar = he.k0.f10620x;
        } else {
            int iG = g();
            int i12 = iG > this.f15628g0 ? 1 : 0;
            if (this.f15622c0 || !((uVar = this.V) == null || uVar.i() == -9223372036854775807L)) {
                this.f15628g0 = iG;
            } else if (!this.S || u()) {
                this.a0 = this.S;
                this.f15624d0 = 0L;
                this.f15628g0 = 0;
                for (n0 n0Var : this.P) {
                    n0Var.x(false);
                }
                d0Var.f15608x.f17905a = 0L;
                d0Var.F = 0L;
                d0Var.E = true;
                d0Var.I = false;
            } else {
                this.f15627f0 = true;
                fVar = he.k0.f10619w;
            }
            fVar = new ad.f(i12, jMin, false);
        }
        ad.f fVar2 = fVar;
        this.f15632w.p(loadEventInfo, 1, -1, null, 0, null, d0Var.F, this.W, iOException, !fVar2.a());
        return fVar2;
    }

    public final void o(int i7) {
        f();
        boolean[] zArr = (boolean[]) this.U.f6611e;
        if (this.f15627f0 && zArr[i7] && !this.P[i7].r(false)) {
            this.f15626e0 = 0L;
            this.f15627f0 = false;
            this.a0 = true;
            this.f15624d0 = 0L;
            this.f15628g0 = 0;
            for (n0 n0Var : this.P) {
                n0Var.x(false);
            }
            p pVar = this.N;
            pVar.getClass();
            pVar.c(this);
        }
    }

    @Override // he.f0
    public final void p(he.h0 h0Var, long j, long j5, boolean z5) {
        d0 d0Var = (d0) h0Var;
        he.s0 s0Var = d0Var.f15604e;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.f15631v.getClass();
        this.f15632w.k(loadEventInfo, 1, -1, null, 0, null, d0Var.F, this.W);
        if (z5) {
            return;
        }
        for (n0 n0Var : this.P) {
            n0Var.x(false);
        }
        if (this.f15621b0 > 0) {
            p pVar = this.N;
            pVar.getClass();
            pVar.c(this);
        }
    }

    @Override // pc.m
    public final void q() {
        this.R = true;
        this.M.post(this.K);
    }

    @Override // md.q
    public final void r() throws IOException {
        int iK = this.f15631v.k(this.Y);
        he.k0 k0Var = this.H;
        IOException iOException = k0Var.f10623i;
        if (iOException != null) {
            throw iOException;
        }
        he.g0 g0Var = k0Var.f10622e;
        if (g0Var != null) {
            if (iK == Integer.MIN_VALUE) {
                iK = g0Var.f10604d;
            }
            IOException iOException2 = g0Var.f10608w;
            if (iOException2 != null && g0Var.f10609x > iK) {
                throw iOException2;
            }
        }
        if (this.h0 && !this.S) {
            throw h1.a("Loading finished before preparation is complete.", null);
        }
    }

    public final n0 s(f0 f0Var) {
        int length = this.P.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (f0Var.equals(this.Q[i7])) {
                return this.P[i7];
            }
        }
        mc.s sVar = this.f15629i;
        sVar.getClass();
        n0 n0Var = new n0(this.E, sVar, this.f15633x);
        n0Var.f15670f = this;
        int i10 = length + 1;
        f0[] f0VarArr = (f0[]) Arrays.copyOf(this.Q, i10);
        f0VarArr[length] = f0Var;
        this.Q = f0VarArr;
        n0[] n0VarArr = (n0[]) Arrays.copyOf(this.P, i10);
        n0VarArr[length] = n0Var;
        this.P = n0VarArr;
        return n0Var;
    }

    public final void t() {
        d0 d0Var = new d0(this, this.f15623d, this.f15625e, this.I, this, this.J);
        if (this.S) {
            je.b.k(i());
            long j = this.W;
            if (j != -9223372036854775807L && this.f15626e0 > j) {
                this.h0 = true;
                this.f15626e0 = -9223372036854775807L;
                return;
            }
            pc.u uVar = this.V;
            uVar.getClass();
            long j5 = uVar.h(this.f15626e0).f17927a.f17931b;
            long j7 = this.f15626e0;
            d0Var.f15608x.f17905a = j5;
            d0Var.F = j7;
            d0Var.E = true;
            d0Var.I = false;
            for (n0 n0Var : this.P) {
                n0Var.f15682t = this.f15626e0;
            }
            this.f15626e0 = -9223372036854775807L;
        }
        this.f15628g0 = g();
        this.H.f(d0Var, this, this.f15631v.k(this.Y));
        this.f15632w.s(new LoadEventInfo(d0Var.G), 1, -1, null, 0, null, d0Var.F, this.W);
    }

    public final boolean u() {
        return this.a0 || i();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:1: B:25:0x0054->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[LOOP:2: B:30:0x0069->B:31:0x006b, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0051, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0062, please report this as an issue */
    @Override // md.q
    public final long v(long j) {
        he.k0 k0Var;
        int i7;
        f();
        boolean[] zArr = (boolean[]) this.U.f6611e;
        if (!this.V.c()) {
            j = 0;
        }
        this.a0 = false;
        this.f15624d0 = j;
        if (i()) {
            this.f15626e0 = j;
            return j;
        }
        if (this.Y == 7) {
            this.f15627f0 = false;
            this.f15626e0 = j;
            this.h0 = false;
            k0Var = this.H;
            if (k0Var.d()) {
                k0Var.f10623i = null;
                for (n0 n0Var : this.P) {
                    n0Var.x(false);
                }
                break;
                break;
            }
            for (n0 n0Var2 : this.P) {
                n0Var2.h();
            }
            k0Var.a();
            return j;
        }
        int length = this.P.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.P[i10].y(j, false) && (zArr[i10] || !this.T)) {
                this.f15627f0 = false;
                this.f15626e0 = j;
                this.h0 = false;
                k0Var = this.H;
                if (k0Var.d()) {
                    k0Var.f10623i = null;
                    while (i7 < r2) {
                        n0Var.x(false);
                    }
                    break;
                }
                while (i < r3) {
                    n0Var2.h();
                }
                k0Var.a();
                return j;
            }
        }
        return j;
    }

    @Override // md.q
    public final void w(long j) throws Throwable {
        f();
        if (i()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.U.f6612i;
        int length = this.P.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.P[i7].g(j, zArr[i7]);
        }
    }

    @Override // pc.m
    public final pc.x x(int i7, int i10) {
        return s(new f0(i7, false));
    }

    @Override // md.q0
    public final boolean z(long j) {
        if (this.h0) {
            return false;
        }
        he.k0 k0Var = this.H;
        if (k0Var.c() || this.f15627f0) {
            return false;
        }
        if (this.S && this.f15621b0 == 0) {
            return false;
        }
        boolean zP = this.J.p();
        if (k0Var.d()) {
            return zP;
        }
        t();
        return true;
    }

    @Override // md.q0
    public final void W(long j) {
    }
}
