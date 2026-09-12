package rd;

import a5.b0;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.DataSource;
import ei.r0;
import ei.w0;
import ei.y;
import gc.g0;
import hc.c0;
import he.d0;
import he.f0;
import he.h0;
import he.i0;
import he.k0;
import he.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import je.e0;
import md.m0;
import md.q0;
import md.x0;
import md.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements f0, i0, q0, pc.m, m0 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Set f19315v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final mc.n E;
    public final o9.d F;
    public final k0 G = new k0("Loader:HlsSampleStreamWrapper");
    public final a1.d H;
    public final int I;
    public final gc.b J;
    public final ArrayList K;
    public final List L;
    public final q M;
    public final q N;
    public final Handler O;
    public final ArrayList P;
    public final Map Q;
    public od.e R;
    public s[] S;
    public int[] T;
    public final HashSet U;
    public final SparseIntArray V;
    public r W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f19316b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Format f19317c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19318d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Format f19319d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19320e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f19321e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public y0 f19322f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Set f19323g0;
    public int[] h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pc.r f19324i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f19325i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f19326j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean[] f19327k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean[] f19328l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f19329m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f19330n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f19331o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f19332p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f19333q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f19334r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f19335s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public mc.i f19336t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public m f19337u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f19338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final he.q f19339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Format f19340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mc.s f19341y;

    /* JADX WARN: Type inference failed for: r1v12, types: [rd.q] */
    /* JADX WARN: Type inference failed for: r1v13, types: [rd.q] */
    public t(String str, int i7, pc.r rVar, j jVar, Map map, he.q qVar, long j, Format format, mc.s sVar, mc.n nVar, o9.d dVar, a1.d dVar2, int i10) {
        this.f19318d = str;
        this.f19320e = i7;
        this.f19324i = rVar;
        this.f19338v = jVar;
        this.Q = map;
        this.f19339w = qVar;
        this.f19340x = format;
        this.f19341y = sVar;
        this.E = nVar;
        this.F = dVar;
        this.H = dVar2;
        this.I = i10;
        gc.b bVar = new gc.b();
        bVar.f9561a = null;
        final int i11 = 0;
        bVar.f9562b = false;
        bVar.f9563c = null;
        this.J = bVar;
        this.T = new int[0];
        Set set = f19315v0;
        this.U = new HashSet(set.size());
        this.V = new SparseIntArray(set.size());
        this.S = new s[0];
        this.f19328l0 = new boolean[0];
        this.f19327k0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        this.L = Collections.unmodifiableList(arrayList);
        this.P = new ArrayList();
        this.M = new Runnable(this) { // from class: rd.q

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f19307e;

            {
                this.f19307e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f19307e.t();
                        break;
                    default:
                        t tVar = this.f19307e;
                        tVar.Z = true;
                        tVar.t();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.N = new Runnable(this) { // from class: rd.q

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f19307e;

            {
                this.f19307e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f19307e.t();
                        break;
                    default:
                        t tVar = this.f19307e;
                        tVar.Z = true;
                        tVar.t();
                        break;
                }
            }
        };
        this.O = e0.m(null);
        this.f19329m0 = j;
        this.f19330n0 = j;
    }

    public static pc.j g(int i7, int i10) {
        je.b.N("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i10);
        return new pc.j();
    }

    public static Format i(Format format, Format format2, boolean z5) {
        String strB;
        if (format == null) {
            return format2;
        }
        String str = format.F;
        String strD = format2.I;
        int iH = je.o.h(strD);
        if (e0.p(iH, str) == 1) {
            strB = e0.q(iH, str);
            strD = je.o.d(strB);
        } else {
            strB = je.o.b(str, strD);
        }
        g0 g0VarA = format2.a();
        g0VarA.f9635a = format.f5524d;
        g0VarA.f9636b = format.f5526e;
        g0VarA.f9637c = format.f5528i;
        g0VarA.f9638d = format.f5529v;
        g0VarA.f9639e = format.f5530w;
        g0VarA.f9640f = z5 ? format.f5531x : -1;
        g0VarA.f9641g = z5 ? format.f5532y : -1;
        g0VarA.f9642h = strB;
        if (iH == 2) {
            g0VarA.f9648p = format.N;
            g0VarA.f9649q = format.O;
            g0VarA.f9650r = format.P;
        }
        if (strD != null) {
            g0VarA.k = strD;
        }
        int i7 = format.V;
        if (i7 != -1 && iH == 1) {
            g0VarA.f9656x = i7;
        }
        Metadata metadataA = format.G;
        if (metadataA != null) {
            Metadata metadata = format2.G;
            if (metadata != null) {
                metadataA = metadata.a(metadataA.f5693d);
            }
            g0VarA.f9643i = metadataA;
        }
        return new Format(g0VarA);
    }

    public static int o(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        for (s sVar : this.S) {
            sVar.x(this.f19331o0);
        }
        this.f19331o0 = false;
    }

    public final boolean B(long j, boolean z5) {
        this.f19329m0 = j;
        if (s()) {
            this.f19330n0 = j;
            return true;
        }
        if (this.Z && !z5) {
            int length = this.S.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.S[i7].y(j, false) || (!this.f19328l0[i7] && this.f19326j0)) {
                }
            }
            return false;
        }
        this.f19330n0 = j;
        this.f19333q0 = false;
        this.K.clear();
        k0 k0Var = this.G;
        if (!k0Var.d()) {
            k0Var.f10623i = null;
            A();
            return true;
        }
        if (this.Z) {
            for (s sVar : this.S) {
                sVar.h();
            }
        }
        k0Var.a();
        return true;
    }

    @Override // md.q0
    public final boolean C() {
        return this.G.d();
    }

    @Override // md.q0
    public final long S() {
        long j;
        ArrayList arrayList = this.K;
        if (this.f19333q0) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.f19330n0;
        }
        long jMax = this.f19329m0;
        m mVarM = m();
        if (!mVarM.f19293e0) {
            mVarM = arrayList.size() > 1 ? (m) kk.b.e(2, arrayList) : null;
        }
        if (mVarM != null) {
            jMax = Math.max(jMax, mVarM.E);
        }
        if (this.Z) {
            for (s sVar : this.S) {
                synchronized (sVar) {
                    j = sVar.f15684v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // md.q0
    public final void W(long j) {
        k0 k0Var = this.G;
        if (k0Var.c() || s()) {
            return;
        }
        boolean zD = k0Var.d();
        j jVar = this.f19338v;
        List list = this.L;
        if (zD) {
            this.R.getClass();
            if (jVar.f19282n != null ? false : jVar.f19285q.j(j, this.R, list)) {
                k0Var.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && jVar.b((m) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            j(size);
        }
        int size2 = (jVar.f19282n != null || jVar.f19285q.length() < 2) ? list.size() : jVar.f19285q.h(j, list);
        if (size2 < this.K.size()) {
            j(size2);
        }
    }

    @Override // md.m0
    public final void b() {
        this.O.post(this.M);
    }

    @Override // he.i0
    public final void d() {
        for (s sVar : this.S) {
            sVar.x(true);
            mc.k kVar = sVar.f15672h;
            if (kVar != null) {
                kVar.d(sVar.f15669e);
                sVar.f15672h = null;
                sVar.f15671g = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // he.f0
    public final void e(h0 h0Var, long j, long j5) {
        od.e eVar = (od.e) h0Var;
        this.R = null;
        if (eVar instanceof f) {
            f fVar = (f) eVar;
            byte[] bArr = fVar.G;
            j jVar = this.f19338v;
            jVar.f19281m = bArr;
            ph.c cVar = jVar.j;
            Uri uri = fVar.f17222e.f10649a;
            byte[] bArr2 = fVar.I;
            bArr2.getClass();
            e eVar2 = (e) cVar.f18031d;
            uri.getClass();
        }
        long j7 = eVar.f17221d;
        s0 s0Var = eVar.F;
        Uri uri2 = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.F.getClass();
        this.H.n(loadEventInfo, eVar.f17223i, this.f19320e, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
        if (this.a0) {
            this.f19324i.c(this);
        } else {
            z(this.f19329m0);
        }
    }

    public final void f() {
        je.b.k(this.a0);
        this.f19322f0.getClass();
        this.f19323g0.getClass();
    }

    public final y0 h(x0[] x0VarArr) {
        for (int i7 = 0; i7 < x0VarArr.length; i7++) {
            x0 x0Var = x0VarArr[i7];
            Format[] formatArr = new Format[x0Var.f15727d];
            for (int i10 = 0; i10 < x0Var.f15727d; i10++) {
                Format format = x0Var.f15730v[i10];
                int iB = this.f19341y.b(format);
                g0 g0VarA = format.a();
                g0VarA.F = iB;
                formatArr[i10] = new Format(g0VarA);
            }
            x0VarArr[i7] = new x0(x0Var.f15728e, formatArr);
        }
        return new y0(x0VarArr);
    }

    public final void j(int i7) {
        ArrayList arrayList;
        je.b.k(!this.G.d());
        int i10 = i7;
        loop0: while (true) {
            arrayList = this.K;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            int i11 = i10;
            while (true) {
                if (i11 >= arrayList.size()) {
                    m mVar = (m) arrayList.get(i10);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.S.length) {
                            break loop0;
                        }
                        if (this.S[i12].n() > mVar.e(i12)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                } else if (((m) arrayList.get(i11)).K) {
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j = m().E;
        m mVar2 = (m) arrayList.get(i10);
        e0.N(arrayList, i10, arrayList.size());
        for (int i13 = 0; i13 < this.S.length; i13++) {
            this.S[i13].j(mVar2.e(i13));
        }
        if (arrayList.isEmpty()) {
            this.f19330n0 = this.f19329m0;
        } else {
            ((m) ei.p.i(arrayList)).f19295g0 = true;
        }
        this.f19333q0 = false;
        this.H.B(new MediaLoadData(1, this.X, null, 3, null, e0.U(mVar2.f17227y), e0.U(j)));
    }

    @Override // md.q0
    public final long k() {
        if (s()) {
            return this.f19330n0;
        }
        if (this.f19333q0) {
            return Long.MIN_VALUE;
        }
        return m().E;
    }

    public final m m() {
        return (m) kk.b.e(1, this.K);
    }

    @Override // he.f0
    public final ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        boolean zN;
        ad.f fVar;
        int i10;
        od.e eVar = (od.e) h0Var;
        boolean z5 = eVar instanceof m;
        if (z5 && !((m) eVar).h0 && (iOException instanceof d0) && ((i10 = ((d0) iOException).f10597v) == 410 || i10 == 404)) {
            return k0.f10618v;
        }
        long j7 = eVar.F.f10699e;
        s0 s0Var = eVar.F;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j7, s0Var.f10701v);
        e0.U(eVar.f17227y);
        e0.U(eVar.E);
        b0 b0Var = new b0(i7, 5, iOException);
        j jVar = this.f19338v;
        bh.t tVarK = c9.a.k(jVar.f19285q);
        this.F.getClass();
        ad.f fVarJ = o9.d.j(tVarK, b0Var);
        if (fVarJ == null || fVarJ.f347a != 2) {
            zN = false;
        } else {
            long j10 = fVarJ.f348b;
            fe.p pVar = jVar.f19285q;
            zN = pVar.n(pVar.s(jVar.f19278h.a(eVar.f17224v)), j10);
        }
        if (zN) {
            if (z5 && j7 == 0) {
                ArrayList arrayList = this.K;
                je.b.k(((m) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (arrayList.isEmpty()) {
                    this.f19330n0 = this.f19329m0;
                } else {
                    ((m) ei.p.i(arrayList)).f19295g0 = true;
                }
            }
            fVar = k0.f10619w;
        } else {
            long jN = o9.d.n(b0Var);
            fVar = jN != -9223372036854775807L ? new ad.f(0, jN, false) : k0.f10620x;
        }
        ad.f fVar2 = fVar;
        boolean zA = fVar2.a();
        this.H.p(loadEventInfo, eVar.f17223i, this.f19320e, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E, iOException, !zA);
        if (!zA) {
            this.R = null;
        }
        if (zN) {
            if (!this.a0) {
                z(this.f19329m0);
                return fVar2;
            }
            this.f19324i.c(this);
        }
        return fVar2;
    }

    @Override // he.f0
    public final void p(h0 h0Var, long j, long j5, boolean z5) {
        od.e eVar = (od.e) h0Var;
        this.R = null;
        long j7 = eVar.f17221d;
        s0 s0Var = eVar.F;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.F.getClass();
        this.H.k(loadEventInfo, eVar.f17223i, this.f19320e, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
        if (z5) {
            return;
        }
        if (s() || this.f19316b0 == 0) {
            A();
        }
        if (this.f19316b0 > 0) {
            this.f19324i.c(this);
        }
    }

    @Override // pc.m
    public final void q() {
        this.f19334r0 = true;
        this.O.post(this.N);
    }

    public final boolean s() {
        return this.f19330n0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        int i7;
        if (!this.f19321e0 && this.h0 == null && this.Z) {
            int i10 = 0;
            for (s sVar : this.S) {
                if (sVar.q() == null) {
                    return;
                }
            }
            y0 y0Var = this.f19322f0;
            if (y0Var != null) {
                int i11 = y0Var.f15737d;
                int[] iArr = new int[i11];
                this.h0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        s[] sVarArr = this.S;
                        if (i13 >= sVarArr.length) {
                            break;
                        }
                        Format formatQ = sVarArr[i13].q();
                        je.b.l(formatQ);
                        Format format = this.f19322f0.a(i12).f15730v[0];
                        String str = formatQ.I;
                        String str2 = format.I;
                        int iH = je.o.h(str);
                        if (iH != 3) {
                            if (iH == je.o.h(str2)) {
                                this.h0[i12] = i13;
                                break;
                            }
                            i13++;
                        } else {
                            if (e0.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || formatQ.a0 == format.a0)) {
                                this.h0[i12] = i13;
                                break;
                                break;
                            }
                            i13++;
                        }
                    }
                }
                Iterator it = this.P.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a();
                }
                return;
            }
            int length = this.S.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                Format formatQ2 = this.S[i14].q();
                je.b.l(formatQ2);
                String str3 = formatQ2.I;
                if (je.o.l(str3)) {
                    i17 = 2;
                } else if (!je.o.j(str3)) {
                    i17 = je.o.k(str3) ? 3 : -2;
                }
                if (o(i17) > o(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            x0 x0Var = this.f19338v.f19278h;
            int i18 = x0Var.f15727d;
            this.f19325i0 = -1;
            this.h0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.h0[i19] = i19;
            }
            x0[] x0VarArr = new x0[length];
            int i20 = 0;
            while (i20 < length) {
                Format formatQ3 = this.S[i20].q();
                je.b.l(formatQ3);
                String str4 = this.f19318d;
                Format format2 = this.f19340x;
                if (i20 == i15) {
                    Format[] formatArr = new Format[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        Format formatC = x0Var.f15730v[i21];
                        if (i16 == 1 && format2 != null) {
                            formatC = formatC.c(format2);
                        }
                        formatArr[i21] = i18 == 1 ? formatQ3.c(formatC) : i(formatC, formatQ3, true);
                    }
                    x0VarArr[i20] = new x0(str4, formatArr);
                    this.f19325i0 = i20;
                    i7 = 0;
                } else {
                    if (i16 != 2 || !je.o.j(formatQ3.I)) {
                        format2 = null;
                    }
                    StringBuilder sbO = kk.b.o(str4, ":muxed:");
                    sbO.append(i20 < i15 ? i20 : i20 - 1);
                    i7 = 0;
                    x0VarArr[i20] = new x0(sbO.toString(), i(format2, formatQ3, false));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.f19322f0 = h(x0VarArr);
            je.b.k(this.f19323g0 == null ? 1 : i22);
            this.f19323g0 = Collections.EMPTY_SET;
            this.a0 = true;
            this.f19324i.i();
        }
    }

    public final void u() throws IOException {
        this.G.b();
        j jVar = this.f19338v;
        md.b bVar = jVar.f19282n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = jVar.f19283o;
        if (uri == null || !jVar.f19287s) {
            return;
        }
        sd.b bVar2 = (sd.b) jVar.f19277g.f19853v.get(uri);
        bVar2.f19844e.b();
        IOException iOException = bVar2.G;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [rd.s[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rd.s[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [pc.x] */
    /* JADX WARN: Type inference failed for: r5v4, types: [md.n0, rd.s] */
    /* JADX WARN: Type inference failed for: r5v6, types: [pc.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // pc.m
    public final pc.x x(int i7, int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        Set set = f19315v0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.U;
        SparseIntArray sparseIntArray = this.V;
        ?? sVar = 0;
        sVar = 0;
        if (zContains) {
            je.b.g(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.T[i11] = i7;
                }
                sVar = this.T[i11] == i7 ? this.S[i11] : g(i7, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r5 = this.S;
                if (i12 >= r5.length) {
                    break;
                }
                if (this.T[i12] == i7) {
                    sVar = r5[i12];
                    break;
                }
                i12++;
            }
        }
        if (sVar == 0) {
            if (this.f19334r0) {
                return g(i7, i10);
            }
            int length = this.S.length;
            boolean z5 = i10 == 1 || i10 == 2;
            sVar = new s(this.f19339w, this.f19341y, this.E, this.Q);
            sVar.f15682t = this.f19329m0;
            if (z5) {
                sVar.I = this.f19336t0;
                sVar.f15688z = true;
            }
            long j = this.f19335s0;
            if (sVar.F != j) {
                sVar.F = j;
                sVar.f15688z = true;
            }
            m mVar = this.f19337u0;
            if (mVar != null) {
                sVar.C = mVar.H;
            }
            sVar.f15670f = this;
            int i13 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.T, i13);
            this.T = iArrCopyOf;
            iArrCopyOf[length] = i7;
            s[] sVarArr = this.S;
            int i14 = e0.f13788a;
            ?? CopyOf = Arrays.copyOf(sVarArr, sVarArr.length + 1);
            CopyOf[sVarArr.length] = sVar;
            this.S = (s[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f19328l0, i13);
            this.f19328l0 = zArrCopyOf;
            zArrCopyOf[length] = z5;
            this.f19326j0 |= z5;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (o(i10) > o(this.X)) {
                this.Y = length;
                this.X = i10;
            }
            this.f19327k0 = Arrays.copyOf(this.f19327k0, i13);
        }
        if (i10 != 5) {
            return sVar;
        }
        if (this.W == null) {
            this.W = new r(sVar, this.I);
        }
        return this.W;
    }

    public final void y(x0[] x0VarArr, int... iArr) {
        this.f19322f0 = h(x0VarArr);
        this.f19323g0 = new HashSet();
        for (int i7 : iArr) {
            this.f19323g0.add(this.f19322f0.a(i7));
        }
        this.f19325i0 = 0;
        this.O.post(new io.sentry.android.core.p(28, this.f19324i));
        this.a0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x028d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0298  */
    /* JADX WARN: Code duplicated, block: B:117:0x029c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:142:0x02de  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x030c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0317  */
    /* JADX WARN: Code duplicated, block: B:153:0x0329  */
    /* JADX WARN: Code duplicated, block: B:154:0x032b  */
    /* JADX WARN: Code duplicated, block: B:157:0x034a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0351  */
    /* JADX WARN: Code duplicated, block: B:162:0x036e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0371  */
    /* JADX WARN: Code duplicated, block: B:165:0x0375  */
    /* JADX WARN: Code duplicated, block: B:166:0x037f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0382  */
    /* JADX WARN: Code duplicated, block: B:169:0x038d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0393 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0395  */
    /* JADX WARN: Code duplicated, block: B:174:0x0397  */
    /* JADX WARN: Code duplicated, block: B:176:0x039a  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:182:0x03db  */
    /* JADX WARN: Code duplicated, block: B:184:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x0417  */
    /* JADX WARN: Code duplicated, block: B:200:0x0422  */
    /* JADX WARN: Code duplicated, block: B:203:0x0428  */
    /* JADX WARN: Code duplicated, block: B:206:0x042f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x043c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0444  */
    /* JADX WARN: Code duplicated, block: B:218:0x0470  */
    /* JADX WARN: Code duplicated, block: B:222:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:226:0x04b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:229:0x04cf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:232:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:236:0x050e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0519 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x051b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0538  */
    /* JADX WARN: Code duplicated, block: B:245:0x0546  */
    /* JADX WARN: Code duplicated, block: B:253:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0549 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01de  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // md.q0
    public final boolean z(long j) {
        long jMax;
        List list;
        long j5;
        gc.b bVar;
        int i7;
        gc.b bVar2;
        j jVar;
        int i10;
        int iIntValue;
        Uri uri;
        i iVar;
        boolean z5;
        sd.g gVar;
        sd.f fVar;
        long j7;
        Uri uriK;
        f fVarD;
        String str;
        Uri uriK2;
        f fVarD2;
        boolean z6;
        DataSource dataSource;
        ph.c cVar;
        byte[] bArr;
        byte[] bArr2;
        int i11;
        w0 w0Var;
        boolean z7;
        byte[] bArrD;
        DataSource aVar;
        sd.f fVar2;
        he.p pVar;
        DataSource dataSource2;
        boolean z10;
        int i12;
        Uri uri2;
        hd.i iVar2;
        je.w wVar;
        b bVar3;
        SparseArray sparseArray;
        je.b0 b0Var;
        he.p pVar2;
        boolean z11;
        boolean z12;
        b bVar4;
        boolean z13;
        byte[] bArrD2;
        DataSource aVar2;
        String str2;
        boolean z14;
        od.e eVar;
        Uri uri3;
        m mVar;
        Object[] objArrCopyOf;
        s[] sVarArr;
        int length;
        int i13;
        boolean z15;
        int i14;
        int i15;
        int i16;
        if (!this.f19333q0) {
            k0 k0Var = this.G;
            if (!k0Var.d() && !k0Var.c()) {
                if (s()) {
                    list = Collections.EMPTY_LIST;
                    jMax = this.f19330n0;
                    for (s sVar : this.S) {
                        sVar.f15682t = this.f19330n0;
                    }
                } else {
                    m mVarM = m();
                    jMax = mVarM.f19293e0 ? mVarM.E : Math.max(this.f19329m0, mVarM.f17227y);
                    list = this.L;
                }
                List list2 = list;
                gc.b bVar5 = this.J;
                bVar5.f9561a = null;
                bVar5.f9562b = false;
                bVar5.f9563c = null;
                boolean z16 = this.a0 || !list2.isEmpty();
                j jVar2 = this.f19338v;
                ph.c cVar2 = jVar2.j;
                Uri[] uriArr = jVar2.f19275e;
                sd.c cVar3 = jVar2.f19277g;
                m mVar2 = list2.isEmpty() ? null : (m) ei.p.i(list2);
                int iA = mVar2 == null ? -1 : jVar2.f19278h.a(mVar2.f17224v);
                long jMax2 = jMax - j;
                long j10 = jVar2.f19286r;
                long jMax3 = j10 != -9223372036854775807L ? j10 - j : -9223372036854775807L;
                if (mVar2 == null) {
                    j5 = jMax;
                    bVar = bVar5;
                    i7 = iA;
                } else if (jVar2.f19284p) {
                    j5 = jMax;
                    i7 = iA;
                    bVar = bVar5;
                } else {
                    i7 = iA;
                    bVar = bVar5;
                    long j11 = mVar2.E - mVar2.f17227y;
                    j5 = jMax;
                    jMax2 = Math.max(0L, jMax2 - j11);
                    if (jMax3 != -9223372036854775807L) {
                        jMax3 = Math.max(0L, jMax3 - j11);
                    }
                }
                long j12 = j5;
                m mVar3 = mVar2;
                int i17 = i7;
                jVar2.f19285q.b(j, jMax2, jMax3, list2, jVar2.a(mVar2, j12));
                int iK = jVar2.f19285q.k();
                boolean z17 = i17 != iK;
                Uri uri4 = uriArr[iK];
                if (cVar3.c(uri4)) {
                    bVar2 = bVar;
                    sd.i iVarA = cVar3.a(true, uri4);
                    iVarA.getClass();
                    long j13 = iVarA.f19876h;
                    jVar2.f19284p = iVarA.f19909c;
                    jVar2.f19286r = iVarA.f19881o ? -9223372036854775807L : (iVarA.f19887u + j13) - cVar3.K;
                    boolean z18 = z17;
                    long j14 = j13 - cVar3.K;
                    Pair pairC = jVar2.c(mVar3, z18, iVarA, j14, j12);
                    long jLongValue = ((Long) pairC.first).longValue();
                    int iIntValue2 = ((Integer) pairC.second).intValue();
                    if (jLongValue >= iVarA.k || mVar3 == null || !z18) {
                        jVar = jVar2;
                        i10 = iK;
                        iIntValue = iIntValue2;
                        uri = uri4;
                    } else {
                        uri = uriArr[i17];
                        iVarA = cVar3.a(true, uri);
                        iVarA.getClass();
                        j14 = iVarA.f19876h - cVar3.K;
                        jVar = jVar2;
                        Pair pairC2 = jVar.c(mVar3, false, iVarA, j14, j12);
                        jLongValue = ((Long) pairC2.first).longValue();
                        iIntValue = ((Integer) pairC2.second).intValue();
                        i10 = i17;
                    }
                    long j15 = j14;
                    long j16 = jLongValue;
                    String str3 = iVarA.f19907a;
                    boolean z19 = iVarA.f19909c;
                    long j17 = iVarA.k;
                    ei.e0 e0Var = iVarA.f19884r;
                    if (j16 >= j17) {
                        ei.e0 e0Var2 = iVarA.f19885s;
                        boolean z20 = z19;
                        int i18 = (int) (j16 - j17);
                        if (i18 == e0Var.size()) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            if (iIntValue < e0Var2.size()) {
                                iVar = new i((sd.g) e0Var2.get(iIntValue), j16, iIntValue);
                            } else {
                                iVar = null;
                            }
                        } else {
                            sd.f fVar3 = (sd.f) e0Var.get(i18);
                            if (iIntValue == -1) {
                                iVar = new i(fVar3, j16, -1);
                            } else if (iIntValue < fVar3.J.size()) {
                                iVar = new i((sd.g) fVar3.J.get(iIntValue), j16, iIntValue);
                            } else {
                                int i19 = i18 + 1;
                                if (i19 < e0Var.size()) {
                                    iVar = new i((sd.g) e0Var.get(i19), j16 + 1, -1);
                                } else if (e0Var2.isEmpty()) {
                                    iVar = null;
                                } else {
                                    iVar = new i((sd.g) e0Var2.get(0), j16 + 1, 0);
                                }
                            }
                        }
                        if (iVar != null) {
                            z5 = iVar.f19270d;
                            gVar = iVar.f19267a;
                            jVar.f19287s = false;
                            jVar.f19283o = null;
                            fVar = gVar.f19861e;
                            j7 = gVar.f19864w;
                            if (fVar != null || (str2 = fVar.f19866y) == null) {
                                uriK = null;
                            } else {
                                uriK = je.b.K(str3, str2);
                            }
                            fVarD = jVar.d(uriK, i10, true);
                            bVar2.f9561a = fVarD;
                            if (fVarD == null) {
                                str = gVar.f19866y;
                                if (str == null) {
                                    uriK2 = null;
                                } else {
                                    uriK2 = je.b.K(str3, str);
                                }
                                fVarD2 = jVar.d(uriK2, i10, false);
                                bVar2.f9561a = fVarD2;
                                if (fVarD2 == null) {
                                    if (mVar3 == null) {
                                        AtomicInteger atomicInteger = m.f19289i0;
                                    } else {
                                        if (uri.equals(mVar3.J) || !mVar3.f19293e0) {
                                            long j18 = j15 + j7;
                                            if (gVar instanceof sd.d) {
                                                if (!((sd.d) gVar).I || (iVar.f19269c == 0 && z20)) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                            }
                                            z6 = z20 || j18 < mVar3.E;
                                        }
                                        if (z6 || !z5) {
                                            l lVar = jVar.f19271a;
                                            dataSource = jVar.f19272b;
                                            Format format = jVar.f19276f[i10];
                                            List list3 = jVar.f19279i;
                                            int iM = jVar.f19285q.m();
                                            Object objP = jVar.f19285q.p();
                                            boolean z21 = jVar.f19280l;
                                            po.d dVar = jVar.f19274d;
                                            if (uriK2 == null) {
                                                cVar2.getClass();
                                                cVar = cVar2;
                                                bArr = null;
                                            } else {
                                                cVar = cVar2;
                                                bArr = (byte[]) ((e) cVar.f18031d).get(uriK2);
                                            }
                                            if (uriK == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((e) cVar.f18031d).get(uriK);
                                            }
                                            c0 c0Var = jVar.k;
                                            AtomicInteger atomicInteger2 = m.f19289i0;
                                            Map map = Collections.EMPTY_MAP;
                                            Uri uriK3 = je.b.K(str3, gVar.f19860d);
                                            long j19 = gVar.F;
                                            long j20 = gVar.G;
                                            if (z5) {
                                                i11 = 8;
                                            } else {
                                                i11 = 0;
                                            }
                                            je.b.m(uriK3, "The uri must be set.");
                                            w0Var = w0.f8376y;
                                            he.p pVar3 = new he.p(uriK3, 0L, 1, null, w0Var, j19, j20, null, i11);
                                            if (bArr != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7) {
                                                String str4 = gVar.E;
                                                str4.getClass();
                                                bArrD = m.d(str4);
                                            } else {
                                                bArrD = null;
                                            }
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                aVar = new a(dataSource, bArr, bArrD);
                                            } else {
                                                aVar = dataSource;
                                            }
                                            fVar2 = gVar.f19861e;
                                            if (fVar2 != null) {
                                                if (bArr2 != null) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    String str5 = fVar2.E;
                                                    str5.getClass();
                                                    bArrD2 = m.d(str5);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                Uri uriK4 = je.b.K(str3, fVar2.f19860d);
                                                long j21 = fVar2.F;
                                                long j22 = fVar2.G;
                                                je.b.m(uriK4, "The uri must be set.");
                                                he.p pVar4 = new he.p(uriK4, 0L, 1, null, w0Var, j21, j22, null, 0);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    aVar2 = new a(dataSource, bArr2, bArrD2);
                                                } else {
                                                    aVar2 = dataSource;
                                                }
                                                dataSource2 = aVar2;
                                                z10 = z13;
                                                pVar = pVar4;
                                            } else {
                                                pVar = null;
                                                dataSource2 = null;
                                                z10 = false;
                                            }
                                            long j23 = j15 + j7;
                                            long j24 = j23 + gVar.f19862i;
                                            i12 = iVarA.j + gVar.f19863v;
                                            if (mVar3 != null) {
                                                pVar2 = mVar3.N;
                                                if (pVar != pVar2 || (pVar != null && pVar2 != null && pVar.f10649a.equals(pVar2.f10649a) && pVar.f10654f == pVar2.f10654f)) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                uri2 = uri;
                                                if (uri2.equals(mVar3.J) || !mVar3.f19293e0) {
                                                    z12 = false;
                                                } else {
                                                    z12 = true;
                                                }
                                                iVar2 = mVar3.V;
                                                je.w wVar2 = mVar3.W;
                                                if (z11 || !z12 || mVar3.f19295g0 || mVar3.I != i12) {
                                                    bVar4 = null;
                                                } else {
                                                    bVar4 = mVar3.Z;
                                                }
                                                bVar3 = bVar4;
                                                wVar = wVar2;
                                            } else {
                                                uri2 = uri;
                                                iVar2 = new hd.i(null);
                                                wVar = new je.w(10);
                                                bVar3 = null;
                                            }
                                            hd.i iVar3 = iVar2;
                                            long j25 = iVar.f19268b;
                                            int i20 = iVar.f19269c;
                                            boolean z22 = !z5;
                                            boolean z23 = gVar.H;
                                            sparseArray = (SparseArray) dVar.f18079e;
                                            b0Var = (je.b0) sparseArray.get(i12);
                                            if (b0Var == null) {
                                                b0Var = new je.b0(9223372036854775806L);
                                                sparseArray.put(i12, b0Var);
                                            }
                                            bVar2.f9561a = new m(lVar, aVar, pVar3, format, z7, dataSource2, pVar, z10, uri2, list3, iM, objP, j23, j24, j25, i20, z22, i12, z23, z21, b0Var, gVar.f19865x, bVar3, iVar3, wVar, z6, c0Var);
                                        }
                                    }
                                    if (z6) {
                                    }
                                    l lVar2 = jVar.f19271a;
                                    dataSource = jVar.f19272b;
                                    Format format2 = jVar.f19276f[i10];
                                    List list4 = jVar.f19279i;
                                    int iM2 = jVar.f19285q.m();
                                    Object objP2 = jVar.f19285q.p();
                                    boolean z24 = jVar.f19280l;
                                    po.d dVar2 = jVar.f19274d;
                                    if (uriK2 == null) {
                                        cVar2.getClass();
                                        cVar = cVar2;
                                        bArr = null;
                                    } else {
                                        cVar = cVar2;
                                        bArr = (byte[]) ((e) cVar.f18031d).get(uriK2);
                                    }
                                    if (uriK == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((e) cVar.f18031d).get(uriK);
                                    }
                                    c0 c0Var2 = jVar.k;
                                    AtomicInteger atomicInteger3 = m.f19289i0;
                                    Map map2 = Collections.EMPTY_MAP;
                                    Uri uriK5 = je.b.K(str3, gVar.f19860d);
                                    long j110 = gVar.F;
                                    long j26 = gVar.G;
                                    if (z5) {
                                        i11 = 8;
                                    } else {
                                        i11 = 0;
                                    }
                                    je.b.m(uriK5, "The uri must be set.");
                                    w0Var = w0.f8376y;
                                    he.p pVar5 = new he.p(uriK5, 0L, 1, null, w0Var, j110, j26, null, i11);
                                    if (bArr != null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        String str6 = gVar.E;
                                        str6.getClass();
                                        bArrD = m.d(str6);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        aVar = new a(dataSource, bArr, bArrD);
                                    } else {
                                        aVar = dataSource;
                                    }
                                    fVar2 = gVar.f19861e;
                                    if (fVar2 != null) {
                                        if (bArr2 != null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            String str7 = fVar2.E;
                                            str7.getClass();
                                            bArrD2 = m.d(str7);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriK6 = je.b.K(str3, fVar2.f19860d);
                                        long j27 = fVar2.F;
                                        long j28 = fVar2.G;
                                        je.b.m(uriK6, "The uri must be set.");
                                        he.p pVar6 = new he.p(uriK6, 0L, 1, null, w0Var, j27, j28, null, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            aVar2 = new a(dataSource, bArr2, bArrD2);
                                        } else {
                                            aVar2 = dataSource;
                                        }
                                        dataSource2 = aVar2;
                                        z10 = z13;
                                        pVar = pVar6;
                                    } else {
                                        pVar = null;
                                        dataSource2 = null;
                                        z10 = false;
                                    }
                                    long j29 = j15 + j7;
                                    long j210 = j29 + gVar.f19862i;
                                    i12 = iVarA.j + gVar.f19863v;
                                    if (mVar3 != null) {
                                        pVar2 = mVar3.N;
                                        if (pVar != pVar2) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        uri2 = uri;
                                        if (uri2.equals(mVar3.J)) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        iVar2 = mVar3.V;
                                        je.w wVar3 = mVar3.W;
                                        if (z11) {
                                            bVar4 = null;
                                        } else {
                                            bVar4 = null;
                                        }
                                        bVar3 = bVar4;
                                        wVar = wVar3;
                                    } else {
                                        uri2 = uri;
                                        iVar2 = new hd.i(null);
                                        wVar = new je.w(10);
                                        bVar3 = null;
                                    }
                                    hd.i iVar4 = iVar2;
                                    long j211 = iVar.f19268b;
                                    int i21 = iVar.f19269c;
                                    boolean z25 = !z5;
                                    boolean z26 = gVar.H;
                                    sparseArray = (SparseArray) dVar2.f18079e;
                                    b0Var = (je.b0) sparseArray.get(i12);
                                    if (b0Var == null) {
                                        b0Var = new je.b0(9223372036854775806L);
                                        sparseArray.put(i12, b0Var);
                                    }
                                    bVar2.f9561a = new m(lVar2, aVar, pVar5, format2, z7, dataSource2, pVar, z10, uri2, list4, iM2, objP2, j29, j210, j211, i21, z25, i12, z26, z24, b0Var, gVar.f19865x, bVar3, iVar4, wVar, z6, c0Var2);
                                }
                            }
                        } else if (!iVarA.f19881o) {
                            bVar2.f9563c = uri;
                            jVar.f19287s &= uri.equals(jVar.f19283o);
                            jVar.f19283o = uri;
                        } else if (z16 || e0Var.isEmpty()) {
                            bVar2.f9562b = true;
                        } else {
                            iVar = new i((sd.g) ei.p.i(e0Var), (j17 + ((long) e0Var.size())) - 1, -1);
                            z5 = iVar.f19270d;
                            gVar = iVar.f19267a;
                            jVar.f19287s = false;
                            jVar.f19283o = null;
                            fVar = gVar.f19861e;
                            j7 = gVar.f19864w;
                            if (fVar != null) {
                                uriK = null;
                            } else {
                                uriK = null;
                            }
                            fVarD = jVar.d(uriK, i10, true);
                            bVar2.f9561a = fVarD;
                            if (fVarD == null) {
                                str = gVar.f19866y;
                                if (str == null) {
                                    uriK2 = null;
                                } else {
                                    uriK2 = je.b.K(str3, str);
                                }
                                fVarD2 = jVar.d(uriK2, i10, false);
                                bVar2.f9561a = fVarD2;
                                if (fVarD2 == null) {
                                    if (mVar3 == null) {
                                        AtomicInteger atomicInteger4 = m.f19289i0;
                                    } else {
                                        if (uri.equals(mVar3.J)) {
                                            long j111 = j15 + j7;
                                            if (gVar instanceof sd.d) {
                                                if (((sd.d) gVar).I) {
                                                    z20 = true;
                                                } else {
                                                    z20 = true;
                                                }
                                            }
                                            if (z20) {
                                            }
                                        } else {
                                            long j112 = j15 + j7;
                                            if (gVar instanceof sd.d) {
                                                if (((sd.d) gVar).I) {
                                                    z20 = true;
                                                } else {
                                                    z20 = true;
                                                }
                                            }
                                            if (z20) {
                                            }
                                        }
                                        if (z6) {
                                        }
                                        l lVar3 = jVar.f19271a;
                                        dataSource = jVar.f19272b;
                                        Format format3 = jVar.f19276f[i10];
                                        List list5 = jVar.f19279i;
                                        int iM3 = jVar.f19285q.m();
                                        Object objP3 = jVar.f19285q.p();
                                        boolean z27 = jVar.f19280l;
                                        po.d dVar3 = jVar.f19274d;
                                        if (uriK2 == null) {
                                            cVar2.getClass();
                                            cVar = cVar2;
                                            bArr = null;
                                        } else {
                                            cVar = cVar2;
                                            bArr = (byte[]) ((e) cVar.f18031d).get(uriK2);
                                        }
                                        if (uriK == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((e) cVar.f18031d).get(uriK);
                                        }
                                        c0 c0Var3 = jVar.k;
                                        AtomicInteger atomicInteger5 = m.f19289i0;
                                        Map map3 = Collections.EMPTY_MAP;
                                        Uri uriK7 = je.b.K(str3, gVar.f19860d);
                                        long j113 = gVar.F;
                                        long j212 = gVar.G;
                                        if (z5) {
                                            i11 = 8;
                                        } else {
                                            i11 = 0;
                                        }
                                        je.b.m(uriK7, "The uri must be set.");
                                        w0Var = w0.f8376y;
                                        he.p pVar7 = new he.p(uriK7, 0L, 1, null, w0Var, j113, j212, null, i11);
                                        if (bArr != null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            String str8 = gVar.E;
                                            str8.getClass();
                                            bArrD = m.d(str8);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            aVar = new a(dataSource, bArr, bArrD);
                                        } else {
                                            aVar = dataSource;
                                        }
                                        fVar2 = gVar.f19861e;
                                        if (fVar2 != null) {
                                            if (bArr2 != null) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                String str9 = fVar2.E;
                                                str9.getClass();
                                                bArrD2 = m.d(str9);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            Uri uriK8 = je.b.K(str3, fVar2.f19860d);
                                            long j213 = fVar2.F;
                                            long j214 = fVar2.G;
                                            je.b.m(uriK8, "The uri must be set.");
                                            he.p pVar8 = new he.p(uriK8, 0L, 1, null, w0Var, j213, j214, null, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                aVar2 = new a(dataSource, bArr2, bArrD2);
                                            } else {
                                                aVar2 = dataSource;
                                            }
                                            dataSource2 = aVar2;
                                            z10 = z13;
                                            pVar = pVar8;
                                        } else {
                                            pVar = null;
                                            dataSource2 = null;
                                            z10 = false;
                                        }
                                        long j215 = j15 + j7;
                                        long j216 = j215 + gVar.f19862i;
                                        i12 = iVarA.j + gVar.f19863v;
                                        if (mVar3 != null) {
                                            pVar2 = mVar3.N;
                                            if (pVar != pVar2) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            uri2 = uri;
                                            if (uri2.equals(mVar3.J)) {
                                                z12 = false;
                                            } else {
                                                z12 = false;
                                            }
                                            iVar2 = mVar3.V;
                                            je.w wVar4 = mVar3.W;
                                            if (z11) {
                                                bVar4 = null;
                                            } else {
                                                bVar4 = null;
                                            }
                                            bVar3 = bVar4;
                                            wVar = wVar4;
                                        } else {
                                            uri2 = uri;
                                            iVar2 = new hd.i(null);
                                            wVar = new je.w(10);
                                            bVar3 = null;
                                        }
                                        hd.i iVar5 = iVar2;
                                        long j217 = iVar.f19268b;
                                        int i22 = iVar.f19269c;
                                        boolean z28 = !z5;
                                        boolean z29 = gVar.H;
                                        sparseArray = (SparseArray) dVar3.f18079e;
                                        b0Var = (je.b0) sparseArray.get(i12);
                                        if (b0Var == null) {
                                            b0Var = new je.b0(9223372036854775806L);
                                            sparseArray.put(i12, b0Var);
                                        }
                                        bVar2.f9561a = new m(lVar3, aVar, pVar7, format3, z7, dataSource2, pVar, z10, uri2, list5, iM3, objP3, j215, j216, j217, i22, z28, i12, z29, z27, b0Var, gVar.f19865x, bVar3, iVar5, wVar, z6, c0Var3);
                                    }
                                    if (z6) {
                                    }
                                    l lVar4 = jVar.f19271a;
                                    dataSource = jVar.f19272b;
                                    Format format4 = jVar.f19276f[i10];
                                    List list6 = jVar.f19279i;
                                    int iM4 = jVar.f19285q.m();
                                    Object objP4 = jVar.f19285q.p();
                                    boolean z210 = jVar.f19280l;
                                    po.d dVar4 = jVar.f19274d;
                                    if (uriK2 == null) {
                                        cVar2.getClass();
                                        cVar = cVar2;
                                        bArr = null;
                                    } else {
                                        cVar = cVar2;
                                        bArr = (byte[]) ((e) cVar.f18031d).get(uriK2);
                                    }
                                    if (uriK == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((e) cVar.f18031d).get(uriK);
                                    }
                                    c0 c0Var4 = jVar.k;
                                    AtomicInteger atomicInteger6 = m.f19289i0;
                                    Map map4 = Collections.EMPTY_MAP;
                                    Uri uriK9 = je.b.K(str3, gVar.f19860d);
                                    long j114 = gVar.F;
                                    long j218 = gVar.G;
                                    if (z5) {
                                        i11 = 8;
                                    } else {
                                        i11 = 0;
                                    }
                                    je.b.m(uriK9, "The uri must be set.");
                                    w0Var = w0.f8376y;
                                    he.p pVar9 = new he.p(uriK9, 0L, 1, null, w0Var, j114, j218, null, i11);
                                    if (bArr != null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        String str10 = gVar.E;
                                        str10.getClass();
                                        bArrD = m.d(str10);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        aVar = new a(dataSource, bArr, bArrD);
                                    } else {
                                        aVar = dataSource;
                                    }
                                    fVar2 = gVar.f19861e;
                                    if (fVar2 != null) {
                                        if (bArr2 != null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            String str11 = fVar2.E;
                                            str11.getClass();
                                            bArrD2 = m.d(str11);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriK10 = je.b.K(str3, fVar2.f19860d);
                                        long j219 = fVar2.F;
                                        long j2110 = fVar2.G;
                                        je.b.m(uriK10, "The uri must be set.");
                                        he.p pVar10 = new he.p(uriK10, 0L, 1, null, w0Var, j219, j2110, null, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            aVar2 = new a(dataSource, bArr2, bArrD2);
                                        } else {
                                            aVar2 = dataSource;
                                        }
                                        dataSource2 = aVar2;
                                        z10 = z13;
                                        pVar = pVar10;
                                    } else {
                                        pVar = null;
                                        dataSource2 = null;
                                        z10 = false;
                                    }
                                    long j2111 = j15 + j7;
                                    long j2112 = j2111 + gVar.f19862i;
                                    i12 = iVarA.j + gVar.f19863v;
                                    if (mVar3 != null) {
                                        pVar2 = mVar3.N;
                                        if (pVar != pVar2) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        uri2 = uri;
                                        if (uri2.equals(mVar3.J)) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        iVar2 = mVar3.V;
                                        je.w wVar5 = mVar3.W;
                                        if (z11) {
                                            bVar4 = null;
                                        } else {
                                            bVar4 = null;
                                        }
                                        bVar3 = bVar4;
                                        wVar = wVar5;
                                    } else {
                                        uri2 = uri;
                                        iVar2 = new hd.i(null);
                                        wVar = new je.w(10);
                                        bVar3 = null;
                                    }
                                    hd.i iVar6 = iVar2;
                                    long j2113 = iVar.f19268b;
                                    int i23 = iVar.f19269c;
                                    boolean z211 = !z5;
                                    boolean z212 = gVar.H;
                                    sparseArray = (SparseArray) dVar4.f18079e;
                                    b0Var = (je.b0) sparseArray.get(i12);
                                    if (b0Var == null) {
                                        b0Var = new je.b0(9223372036854775806L);
                                        sparseArray.put(i12, b0Var);
                                    }
                                    bVar2.f9561a = new m(lVar4, aVar, pVar9, format4, z7, dataSource2, pVar, z10, uri2, list6, iM4, objP4, j2111, j2112, j2113, i23, z211, i12, z212, z210, b0Var, gVar.f19865x, bVar3, iVar6, wVar, z6, c0Var4);
                                }
                            }
                        }
                        z14 = bVar2.f9562b;
                        eVar = (od.e) bVar2.f9561a;
                        uri3 = (Uri) bVar2.f9563c;
                        if (z14) {
                            this.f19330n0 = -9223372036854775807L;
                            this.f19333q0 = true;
                            return true;
                        }
                        if (eVar == null) {
                            if (uri3 != null) {
                                return false;
                            }
                            sd.b bVar6 = (sd.b) ((n) this.f19324i.f17922d).f19297e.f19853v.get(uri3);
                            bVar6.c(bVar6.f19843d);
                            return false;
                        }
                        if (eVar instanceof m) {
                            mVar = (m) eVar;
                            this.f19337u0 = mVar;
                            this.f19317c0 = mVar.f17224v;
                            this.f19330n0 = -9223372036854775807L;
                            this.K.add(mVar);
                            ei.c0 c0Var5 = ei.e0.f8303e;
                            ei.p.c(4, "initialCapacity");
                            objArrCopyOf = new Object[4];
                            sVarArr = this.S;
                            length = sVarArr.length;
                            i13 = 0;
                            z15 = false;
                            i14 = 0;
                            while (i14 < length) {
                                s sVar2 = sVarArr[i14];
                                Integer numValueOf = Integer.valueOf(sVar2.f15679q + sVar2.f15678p);
                                i16 = i13 + 1;
                                if (objArrCopyOf.length < i16) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, y.d(objArrCopyOf.length, i16));
                                } else {
                                    if (z15) {
                                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                                    }
                                    objArrCopyOf[i13] = numValueOf;
                                    i14++;
                                    i13++;
                                }
                                z15 = false;
                                objArrCopyOf[i13] = numValueOf;
                                i14++;
                                i13++;
                            }
                            r0 r0VarJ = ei.e0.j(i13, objArrCopyOf);
                            mVar.a0 = this;
                            mVar.f19294f0 = r0VarJ;
                            for (s sVar3 : this.S) {
                                sVar3.getClass();
                                sVar3.C = mVar.H;
                                if (mVar.K) {
                                    sVar3.G = true;
                                }
                            }
                        }
                        this.R = eVar;
                        k0Var.f(eVar, this, this.F.k(eVar.f17223i));
                        this.H.s(new LoadEventInfo(eVar.f17222e), eVar.f17223i, this.f19320e, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
                        return true;
                    }
                    jVar.f19282n = new md.b();
                } else {
                    bVar2 = bVar;
                    bVar2.f9563c = uri4;
                    jVar2.f19287s &= uri4.equals(jVar2.f19283o);
                    jVar2.f19283o = uri4;
                }
                z14 = bVar2.f9562b;
                eVar = (od.e) bVar2.f9561a;
                uri3 = (Uri) bVar2.f9563c;
                if (z14) {
                    this.f19330n0 = -9223372036854775807L;
                    this.f19333q0 = true;
                    return true;
                }
                if (eVar == null) {
                    if (uri3 != null) {
                        return false;
                    }
                    sd.b bVar7 = (sd.b) ((n) this.f19324i.f17922d).f19297e.f19853v.get(uri3);
                    bVar7.c(bVar7.f19843d);
                    return false;
                }
                if (eVar instanceof m) {
                    mVar = (m) eVar;
                    this.f19337u0 = mVar;
                    this.f19317c0 = mVar.f17224v;
                    this.f19330n0 = -9223372036854775807L;
                    this.K.add(mVar);
                    ei.c0 c0Var6 = ei.e0.f8303e;
                    ei.p.c(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    sVarArr = this.S;
                    length = sVarArr.length;
                    i13 = 0;
                    z15 = false;
                    i14 = 0;
                    while (i14 < length) {
                        s sVar4 = sVarArr[i14];
                        Integer numValueOf2 = Integer.valueOf(sVar4.f15679q + sVar4.f15678p);
                        i16 = i13 + 1;
                        if (objArrCopyOf.length < i16) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, y.d(objArrCopyOf.length, i16));
                        } else {
                            if (z15) {
                                objArrCopyOf = (Object[]) objArrCopyOf.clone();
                            }
                            objArrCopyOf[i13] = numValueOf2;
                            i14++;
                            i13++;
                        }
                        z15 = false;
                        objArrCopyOf[i13] = numValueOf2;
                        i14++;
                        i13++;
                    }
                    r0 r0VarJ2 = ei.e0.j(i13, objArrCopyOf);
                    mVar.a0 = this;
                    mVar.f19294f0 = r0VarJ2;
                    while (i15 < r4) {
                        sVar3.getClass();
                        sVar3.C = mVar.H;
                        if (mVar.K) {
                            sVar3.G = true;
                        }
                    }
                }
                this.R = eVar;
                k0Var.f(eVar, this, this.F.k(eVar.f17223i));
                this.H.s(new LoadEventInfo(eVar.f17222e), eVar.f17223i, this.f19320e, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
                return true;
            }
        }
        return false;
    }

    @Override // pc.m
    public final void c(pc.u uVar) {
    }
}
