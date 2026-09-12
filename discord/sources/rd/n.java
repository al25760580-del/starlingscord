package rd;

import a5.b0;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gc.g0;
import gc.h1;
import gc.q1;
import hc.c0;
import he.k0;
import he.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import je.e0;
import md.o0;
import md.q0;
import md.x0;
import md.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements md.q, sd.q {
    public final a1.d E;
    public final he.q F;
    public final IdentityHashMap G;
    public final po.d H;
    public final i8.c I;
    public final boolean J;
    public final int K;
    public final c0 L;
    public final pc.r M = new pc.r(this);
    public md.p N;
    public int O;
    public y0 P;
    public t[] Q;
    public t[] R;
    public int S;
    public u4.b T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f19296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd.c f19297e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f19298i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u0 f19299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final mc.s f19300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mc.n f19301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o9.d f19302y;

    public n(l lVar, sd.c cVar, c cVar2, u0 u0Var, mc.s sVar, mc.n nVar, o9.d dVar, a1.d dVar2, he.q qVar, i8.c cVar3, boolean z5, int i7, c0 c0Var) {
        this.f19296d = lVar;
        this.f19297e = cVar;
        this.f19298i = cVar2;
        this.f19299v = u0Var;
        this.f19300w = sVar;
        this.f19301x = nVar;
        this.f19302y = dVar;
        this.E = dVar2;
        this.F = qVar;
        this.I = cVar3;
        this.J = z5;
        this.K = i7;
        this.L = c0Var;
        cVar3.getClass();
        this.T = new u4.b(24, new q0[0]);
        this.G = new IdentityHashMap();
        this.H = new po.d(1);
        this.Q = new t[0];
        this.R = new t[0];
    }

    public static Format e(Format format, Format format2, boolean z5) {
        String strQ;
        Metadata metadata;
        int i7;
        String str;
        int i10;
        int i11;
        String str2;
        if (format2 != null) {
            strQ = format2.F;
            metadata = format2.G;
            i10 = format2.V;
            i7 = format2.f5529v;
            i11 = format2.f5530w;
            str = format2.f5528i;
            str2 = format2.f5526e;
        } else {
            strQ = e0.q(1, format.F);
            metadata = format.G;
            if (z5) {
                i10 = format.V;
                i7 = format.f5529v;
                i11 = format.f5530w;
                str = format.f5528i;
                str2 = format.f5526e;
            } else {
                i7 = 0;
                str = null;
                i10 = -1;
                i11 = 0;
                str2 = null;
            }
        }
        String strD = je.o.d(strQ);
        int i12 = z5 ? format.f5531x : -1;
        int i13 = z5 ? format.f5532y : -1;
        g0 g0Var = new g0();
        g0Var.f9635a = format.f5524d;
        g0Var.f9636b = str2;
        g0Var.j = format.H;
        g0Var.k = strD;
        g0Var.f9642h = strQ;
        g0Var.f9643i = metadata;
        g0Var.f9640f = i12;
        g0Var.f9641g = i13;
        g0Var.f9656x = i10;
        g0Var.f9638d = i7;
        g0Var.f9639e = i11;
        g0Var.f9637c = str;
        return new Format(g0Var);
    }

    @Override // md.q0
    public final boolean C() {
        return this.T.C();
    }

    @Override // md.q
    public final long I() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0259  */
    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0266  */
    /* JADX WARN: Code duplicated, block: B:119:0x026c  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:191:0x0268 A[SYNTHETIC] */
    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        o0[] o0VarArr2;
        j jVar;
        j jVar2;
        boolean z5;
        int[] iArr;
        t[] tVarArr;
        int i7;
        int i10;
        o0[] o0VarArr3;
        int i11;
        j jVar3;
        int[] iArr2;
        t tVar;
        boolean z6;
        boolean z7;
        int i12;
        int i13;
        o0[] o0VarArr4;
        int i14;
        fe.p[] pVarArr2;
        int i15;
        int[] iArr3 = new int[pVarArr.length];
        int[] iArr4 = new int[pVarArr.length];
        int i16 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.G;
            if (i16 >= length) {
                break;
            }
            o0 o0Var = o0VarArr[i16];
            iArr3[i16] = o0Var == null ? -1 : ((Integer) identityHashMap.get(o0Var)).intValue();
            iArr4[i16] = -1;
            fe.p pVar = pVarArr[i16];
            if (pVar != null) {
                x0 x0VarC = pVar.c();
                int i17 = 0;
                while (true) {
                    t[] tVarArr2 = this.Q;
                    if (i17 >= tVarArr2.length) {
                        break;
                    }
                    t tVar2 = tVarArr2[i17];
                    tVar2.f();
                    if (tVar2.f19322f0.b(x0VarC) != -1) {
                        iArr4[i16] = i17;
                        break;
                    }
                    i17++;
                }
            }
            i16++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        o0[] o0VarArr5 = new o0[length2];
        int length3 = pVarArr.length;
        o0[] o0VarArr6 = new o0[length3];
        int length4 = pVarArr.length;
        fe.p[] pVarArr3 = new fe.p[length4];
        t[] tVarArr3 = new t[this.Q.length];
        int i18 = length3;
        int i19 = 0;
        int i20 = 0;
        boolean z10 = false;
        while (i19 < this.Q.length) {
            int i21 = length2;
            int i22 = 0;
            while (true) {
                o0VarArr2 = o0VarArr5;
                if (i22 >= pVarArr.length) {
                    break;
                }
                o0VarArr6[i22] = iArr3[i22] == i19 ? o0VarArr[i22] : null;
                pVarArr3[i22] = iArr4[i22] == i19 ? pVarArr[i22] : null;
                i22++;
                o0VarArr5 = o0VarArr2;
            }
            t tVar3 = this.Q[i19];
            k0 k0Var = tVar3.G;
            int i23 = i19;
            j jVar4 = tVar3.f19338v;
            ArrayList arrayList = tVar3.K;
            tVar3.f();
            int i24 = tVar3.f19316b0;
            o0[] o0VarArr7 = o0VarArr6;
            int i25 = 0;
            while (i25 < length4) {
                p pVar2 = (p) o0VarArr7[i25];
                if (pVar2 == null || (pVarArr3[i25] != null && zArr[i25])) {
                    i15 = i25;
                } else {
                    i15 = i25;
                    tVar3.f19316b0--;
                    if (pVar2.f19305i != -1) {
                        t tVar4 = pVar2.f19304e;
                        int i26 = pVar2.f19303d;
                        tVar4.f();
                        tVar4.h0.getClass();
                        int i27 = tVar4.h0[i26];
                        je.b.k(tVar4.f19327k0[i27]);
                        tVar4.f19327k0[i27] = false;
                        pVar2.f19305i = -1;
                    }
                    o0VarArr7[i15] = null;
                }
                i25 = i15 + 1;
                k0Var = k0Var;
            }
            k0 k0Var2 = k0Var;
            boolean z11 = true;
            if (z10) {
                jVar = jVar4;
                jVar2 = jVar;
                z5 = true;
            } else {
                if (tVar3.f19332p0) {
                    if (i24 != 0) {
                        jVar = jVar4;
                    }
                    jVar = jVar4;
                    jVar2 = jVar;
                    z5 = true;
                } else {
                    jVar = jVar4;
                    if (j != tVar3.f19329m0) {
                        jVar2 = jVar;
                        z5 = true;
                    }
                }
                jVar2 = jVar;
                z5 = false;
            }
            fe.p pVar3 = jVar2.f19285q;
            boolean z12 = z5;
            fe.p pVar4 = pVar3;
            int i28 = 0;
            while (i28 < length4) {
                int i29 = i28;
                fe.p pVar5 = pVarArr3[i29];
                if (pVar5 == null) {
                    i14 = length4;
                    pVarArr2 = pVarArr3;
                } else {
                    i14 = length4;
                    pVarArr2 = pVarArr3;
                    int iB = tVar3.f19322f0.b(pVar5.c());
                    if (iB == tVar3.f19325i0) {
                        jVar2.f19285q = pVar5;
                        pVar4 = pVar5;
                    }
                    if (o0VarArr7[i29] == null) {
                        tVar3.f19316b0++;
                        p pVar6 = new p(tVar3, iB);
                        o0VarArr7[i29] = pVar6;
                        zArr2[i29] = z11;
                        if (tVar3.h0 != null) {
                            pVar6.a();
                            if (!z12) {
                                s sVar = tVar3.S[tVar3.h0[iB]];
                                z12 = (sVar.y(j, z11) || sVar.n() == 0) ? false : true;
                            }
                        }
                    }
                }
                i28 = i29 + 1;
                length4 = i14;
                pVarArr3 = pVarArr2;
                z11 = true;
            }
            int i30 = length4;
            fe.p[] pVarArr4 = pVarArr3;
            if (tVar3.f19316b0 == 0) {
                jVar2.f19282n = null;
                tVar3.f19319d0 = null;
                tVar3.f19331o0 = true;
                arrayList.clear();
                if (k0Var2.d()) {
                    if (tVar3.Z) {
                        for (s sVar2 : tVar3.S) {
                            sVar2.h();
                        }
                    }
                    k0Var2.a();
                } else {
                    tVar3.A();
                }
                int[] iArr5 = iArr4;
                tVar = tVar3;
                i12 = i18;
                iArr2 = iArr5;
                iArr = iArr3;
                tVarArr = tVarArr3;
                i10 = i21;
                o0VarArr3 = o0VarArr2;
                i11 = i23;
                jVar3 = jVar2;
            } else {
                boolean z13 = true;
                if (arrayList.isEmpty() || e0.a(pVar4, pVar3)) {
                    iArr = iArr3;
                    tVarArr = tVarArr3;
                    i7 = i18;
                    i10 = i21;
                    o0VarArr3 = o0VarArr2;
                    i11 = i23;
                    jVar3 = jVar2;
                    iArr2 = iArr4;
                    tVar = tVar3;
                } else {
                    if (tVar3.f19332p0) {
                        iArr = iArr3;
                        tVarArr = tVarArr3;
                        i7 = i18;
                        i10 = i21;
                        o0VarArr3 = o0VarArr2;
                        i11 = i23;
                        jVar3 = jVar2;
                        iArr2 = iArr4;
                        tVar = tVar3;
                    } else {
                        long j5 = j < 0 ? -j : 0L;
                        m mVarM = tVar3.m();
                        fe.p pVar7 = pVar4;
                        iArr = iArr3;
                        tVarArr = tVarArr3;
                        i7 = i18;
                        i10 = i21;
                        o0VarArr3 = o0VarArr2;
                        i11 = i23;
                        jVar3 = jVar2;
                        iArr2 = iArr4;
                        tVar = tVar3;
                        pVar7.b(j, j5, -9223372036854775807L, tVar3.L, jVar2.a(mVarM, j));
                        if (pVar7.k() != jVar3.f19278h.a(mVarM.f17224v)) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                    }
                    tVar.f19331o0 = z13;
                    z6 = z13;
                    z7 = z6;
                    if (z7) {
                        tVar.B(j, z6);
                        i13 = 0;
                        i12 = i7;
                        while (i13 < i12) {
                            if (o0VarArr7[i13] != null) {
                                zArr2[i13] = z13;
                            }
                            i13++;
                            z13 = true;
                        }
                    } else {
                        i12 = i7;
                    }
                    z12 = z7;
                }
                z6 = z10;
                z7 = z12;
                if (z7) {
                    tVar.B(j, z6);
                    i13 = 0;
                    i12 = i7;
                    while (i13 < i12) {
                        if (o0VarArr7[i13] != null) {
                            zArr2[i13] = z13;
                        }
                        i13++;
                        z13 = true;
                    }
                } else {
                    i12 = i7;
                }
                z12 = z7;
            }
            ArrayList arrayList2 = tVar.P;
            arrayList2.clear();
            for (int i31 = 0; i31 < i12; i31++) {
                o0 o0Var2 = o0VarArr7[i31];
                if (o0Var2 != null) {
                    arrayList2.add((p) o0Var2);
                }
            }
            tVar.f19332p0 = true;
            int i32 = 0;
            boolean z14 = false;
            while (i32 < pVarArr.length) {
                o0 o0Var3 = o0VarArr7[i32];
                int i33 = i11;
                if (iArr2[i32] == i33) {
                    o0Var3.getClass();
                    o0VarArr4 = o0VarArr3;
                    o0VarArr4[i32] = o0Var3;
                    identityHashMap.put(o0Var3, Integer.valueOf(i33));
                    z14 = true;
                } else {
                    o0VarArr4 = o0VarArr3;
                    if (iArr[i32] == i33) {
                        je.b.k(o0Var3 == null);
                    }
                }
                i32++;
                o0VarArr3 = o0VarArr4;
                i11 = i33;
            }
            o0[] o0VarArr8 = o0VarArr3;
            int i34 = i11;
            int i35 = i20;
            if (z14) {
                tVarArr[i35] = tVar;
                i20 = i35 + 1;
                if (i35 == 0) {
                    jVar3.f19280l = true;
                    if (z12) {
                        ((SparseArray) this.H.f18079e).clear();
                        z10 = true;
                    } else {
                        t[] tVarArr4 = this.R;
                        if (tVarArr4.length == 0 || tVar != tVarArr4[0]) {
                            ((SparseArray) this.H.f18079e).clear();
                            z10 = true;
                        }
                    }
                } else {
                    jVar3.f19280l = i34 < this.S;
                }
            }
            i19 = i34 + 1;
            o0VarArr5 = o0VarArr8;
            iArr4 = iArr2;
            tVarArr3 = tVarArr;
            o0VarArr6 = o0VarArr7;
            iArr3 = iArr;
            length4 = i30;
            pVarArr3 = pVarArr4;
            i18 = i12;
            length2 = i10;
        }
        System.arraycopy(o0VarArr5, 0, o0VarArr, 0, length2);
        t[] tVarArr5 = (t[]) e0.K(i20, tVarArr3);
        this.R = tVarArr5;
        this.I.getClass();
        this.T = new u4.b(24, tVarArr5);
        return j;
    }

    @Override // md.q
    public final y0 Q() {
        y0 y0Var = this.P;
        y0Var.getClass();
        return y0Var;
    }

    @Override // md.q0
    public final long S() {
        return this.T.S();
    }

    @Override // md.q0
    public final void W(long j) {
        this.T.W(j);
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        for (t tVar : this.R) {
            if (tVar.X == 2) {
                j jVar = tVar.f19338v;
                sd.c cVar = jVar.f19277g;
                int iD = jVar.f19285q.d();
                Uri[] uriArr = jVar.f19275e;
                sd.i iVarA = (iD >= uriArr.length || iD == -1) ? null : cVar.a(true, uriArr[jVar.f19285q.k()]);
                if (iVarA == null) {
                    break;
                }
                ei.e0 e0Var = iVarA.f19884r;
                if (e0Var.isEmpty() || !iVarA.f19909c) {
                    break;
                    break;
                }
                long j5 = iVarA.f19876h - cVar.K;
                long j7 = j - j5;
                int iC = e0.c(Long.valueOf(j7), true, e0Var);
                long j10 = ((sd.f) e0Var.get(iC)).f19864w;
                return q1Var.a(j7, j10, iC != e0Var.size() - 1 ? ((sd.f) e0Var.get(iC + 1)).f19864w : j10) + j5;
            }
        }
        return j;
    }

    @Override // sd.q
    public final void b() {
        for (t tVar : this.Q) {
            k0 k0Var = tVar.G;
            ArrayList arrayList = tVar.K;
            if (!arrayList.isEmpty()) {
                m mVar = (m) ei.p.i(arrayList);
                int iB = tVar.f19338v.b(mVar);
                if (iB == 1) {
                    mVar.h0 = true;
                } else if (iB == 2 && !tVar.f19333q0 && k0Var.d()) {
                    k0Var.a();
                }
            }
        }
        this.N.c(this);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[LOOP:1: B:17:0x0046->B:22:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0057 A[EDGE_INSN: B:53:0x0057->B:24:0x0057 BREAK  A[LOOP:1: B:17:0x0046->B:22:0x0053], SYNTHETIC] */
    @Override // sd.q
    public final boolean c(Uri uri, b0 b0Var, boolean z5) {
        long j;
        int i7;
        int iS;
        sd.b bVar;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11 = true;
        for (t tVar : this.Q) {
            j jVar = tVar.f19338v;
            Uri[] uriArr = jVar.f19275e;
            if (e0.k(uriArr, uri)) {
                if (!z5) {
                    o9.d dVar = tVar.F;
                    bh.t tVarK = c9.a.k(jVar.f19285q);
                    dVar.getClass();
                    ad.f fVarJ = o9.d.j(tVarK, b0Var);
                    if (fVarJ != null && fVarJ.f347a == 2) {
                        j = fVarJ.f348b;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < uriArr.length) {
                            i7 = -1;
                            break;
                        }
                        if (uriArr[i7].equals(uri)) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 != -1 && (iS = jVar.f19285q.s(i7)) != -1) {
                        jVar.f19287s |= uri.equals(jVar.f19283o);
                        if (j == -9223372036854775807L) {
                            if (jVar.f19285q.n(iS, j)) {
                                bVar = (sd.b) jVar.f19277g.f19853v.get(uri);
                                if (bVar != null) {
                                    z6 = !sd.b.a(bVar, j);
                                } else {
                                    z6 = false;
                                }
                                z7 = z6;
                            }
                        }
                    }
                    if (z7 || j == -9223372036854775807L) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                j = -9223372036854775807L;
                i7 = 0;
                while (true) {
                    if (i7 < uriArr.length) {
                        i7 = -1;
                        break;
                    }
                    if (uriArr[i7].equals(uri)) {
                        break;
                        break;
                    }
                    i7++;
                }
                if (i7 != -1) {
                    jVar.f19287s |= uri.equals(jVar.f19283o);
                    if (j == -9223372036854775807L) {
                        if (jVar.f19285q.n(iS, j)) {
                            bVar = (sd.b) jVar.f19277g.f19853v.get(uri);
                            if (bVar != null) {
                                z6 = !sd.b.a(bVar, j);
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                            }
                        }
                    }
                }
                if (z7) {
                    z10 = false;
                } else {
                    z10 = false;
                }
            } else {
                z10 = true;
            }
            z11 &= z10;
        }
        this.N.c(this);
        return z11;
    }

    public final t d(String str, int i7, Uri[] uriArr, Format[] formatArr, Format format, List list, Map map, long j) {
        return new t(str, i7, this.M, new j(this.f19296d, this.f19297e, uriArr, formatArr, this.f19298i, this.f19299v, this.H, list, this.L), map, this.F, j, format, this.f19300w, this.f19301x, this.f19302y, this.E, this.K);
    }

    @Override // md.q0
    public final long k() {
        return this.T.k();
    }

    @Override // md.q
    public final void l(md.p pVar, long j) {
        boolean z5;
        List list;
        List list2;
        int i7;
        boolean z6;
        int i10;
        boolean z7;
        Uri[] uriArr;
        this.N = pVar;
        sd.c cVar = this.f19297e;
        cVar.getClass();
        cVar.f19854w.add(this);
        sd.l lVar = cVar.G;
        lVar.getClass();
        List list3 = lVar.f19902g;
        List list4 = lVar.f19900e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = lVar.f19903h;
        int i11 = 0;
        this.O = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.J;
        if (zIsEmpty) {
            z5 = z10;
            list = list3;
            list2 = list5;
        } else {
            Format format = lVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                list2 = list5;
                if (i12 >= list4.size()) {
                    break;
                }
                Format format2 = ((sd.k) list4.get(i12)).f19893b;
                int i14 = format2.O;
                String str = format2.F;
                if (i14 > 0 || e0.q(2, str) != null) {
                    iArr[i12] = 2;
                    i13++;
                } else if (e0.q(1, str) != null) {
                    iArr[i12] = 1;
                    i11++;
                } else {
                    iArr[i12] = -1;
                }
                i12++;
                list5 = list2;
            }
            if (i13 > 0) {
                z7 = false;
                i10 = i13;
                z6 = true;
            } else if (i11 < size) {
                z6 = false;
                i10 = size - i11;
                z7 = true;
            } else {
                z6 = false;
                i10 = size;
                z7 = false;
            }
            Uri[] uriArr2 = new Uri[i10];
            boolean z11 = z6;
            Format[] formatArr = new Format[i10];
            int[] iArr2 = new int[i10];
            int i15 = 0;
            int i16 = 0;
            while (i15 < list4.size()) {
                if (z11) {
                    uriArr = uriArr2;
                    if (iArr[i15] == 2) {
                    }
                    i15++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z7 || iArr[i15] != 1) {
                    sd.k kVar = (sd.k) list4.get(i15);
                    uriArr[i16] = kVar.f19892a;
                    formatArr[i16] = kVar.f19893b;
                    iArr2[i16] = i15;
                    i16++;
                }
                i15++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = formatArr[0].F;
            int iP = e0.p(2, str2);
            int iP2 = e0.p(1, str2);
            boolean z12 = (iP2 == 1 || (iP2 == 0 && list3.isEmpty())) && iP <= 1 && iP2 + iP > 0;
            z5 = z10;
            list = list3;
            t tVarD = d("main", (z11 || iP2 <= 0) ? 0 : 1, uriArr3, formatArr, lVar.j, lVar.k, map, j);
            arrayList.add(tVarD);
            arrayList2.add(iArr2);
            if (z5 && z12) {
                ArrayList arrayList3 = new ArrayList();
                if (iP > 0) {
                    Format[] formatArr2 = new Format[i10];
                    int i17 = 0;
                    while (i17 < i10) {
                        Format format3 = formatArr[i17];
                        String strQ = e0.q(2, format3.F);
                        String strD = je.o.d(strQ);
                        g0 g0Var = new g0();
                        g0Var.f9635a = format3.f5524d;
                        g0Var.f9636b = format3.f5526e;
                        g0Var.j = format3.H;
                        g0Var.k = strD;
                        g0Var.f9642h = strQ;
                        g0Var.f9643i = format3.G;
                        g0Var.f9640f = format3.f5531x;
                        g0Var.f9641g = format3.f5532y;
                        g0Var.f9648p = format3.N;
                        g0Var.f9649q = format3.O;
                        g0Var.f9650r = format3.P;
                        g0Var.f9638d = format3.f5529v;
                        g0Var.f9639e = format3.f5530w;
                        formatArr2[i17] = new Format(g0Var);
                        i17++;
                        formatArr = formatArr;
                    }
                    Format[] formatArr3 = formatArr;
                    arrayList3.add(new x0("main", formatArr2));
                    if (iP2 > 0 && (format != null || list.isEmpty())) {
                        arrayList3.add(new x0("main:audio", e(formatArr3[0], format, false)));
                    }
                    List list6 = lVar.k;
                    if (list6 != null) {
                        for (int i18 = 0; i18 < list6.size(); i18++) {
                            arrayList3.add(new x0(kk.b.h(i18, "main:cc:"), (Format) list6.get(i18)));
                        }
                    }
                } else {
                    Format[] formatArr4 = new Format[i10];
                    for (int i19 = 0; i19 < i10; i19++) {
                        formatArr4[i19] = e(formatArr[i19], format, true);
                    }
                    arrayList3.add(new x0("main", formatArr4));
                }
                g0 g0Var2 = new g0();
                g0Var2.f9635a = "ID3";
                g0Var2.k = "application/id3";
                x0 x0Var = new x0("main:id3", new Format(g0Var2));
                arrayList3.add(x0Var);
                tVarD.y((x0[]) arrayList3.toArray(new x0[0]), arrayList3.indexOf(x0Var));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i20 = 0;
        while (i20 < list.size()) {
            List list7 = list;
            String str3 = ((sd.j) list7.get(i20)).f19891c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z13 = true;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    String str4 = ((sd.j) list7.get(i21)).f19891c;
                    int i22 = e0.f13788a;
                    if (str3.equals(str4)) {
                        sd.j jVar = (sd.j) list7.get(i21);
                        arrayList6.add(Integer.valueOf(i21));
                        Uri uri = jVar.f19889a;
                        Format format4 = jVar.f19890b;
                        arrayList4.add(uri);
                        arrayList5.add(format4);
                        z13 &= e0.p(1, format4.F) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                int i23 = e0.f13788a;
                list = list7;
                i7 = i20;
                t tVarD2 = d(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (Format[]) arrayList5.toArray(new Format[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(mo.c0.P(arrayList6));
                arrayList.add(tVarD2);
                if (z5 && z13) {
                    tVarD2.y(new x0[]{new x0(strConcat, (Format[]) arrayList5.toArray(new Format[0]))}, new int[0]);
                }
            } else {
                i7 = i20;
                list = list7;
            }
            i20 = i7 + 1;
        }
        this.S = arrayList.size();
        for (int i24 = 0; i24 < list2.size(); i24++) {
            sd.j jVar2 = (sd.j) list2.get(i24);
            StringBuilder sbS = a3.e.s(i24, "subtitle:", ":");
            String str5 = jVar2.f19891c;
            Format format5 = jVar2.f19890b;
            sbS.append(str5);
            String string = sbS.toString();
            t tVarD3 = d(string, 3, new Uri[]{jVar2.f19889a}, new Format[]{format5}, null, Collections.EMPTY_LIST, map, j);
            arrayList2.add(new int[]{i24});
            arrayList.add(tVarD3);
            tVarD3.y(new x0[]{new x0(string, format5)}, new int[0]);
        }
        this.Q = (t[]) arrayList.toArray(new t[0]);
        this.O = this.Q.length;
        for (int i25 = 0; i25 < this.S; i25++) {
            this.Q[i25].f19338v.f19280l = true;
        }
        for (t tVar : this.Q) {
            if (!tVar.a0) {
                tVar.z(tVar.f19329m0);
            }
        }
        this.R = this.Q;
    }

    @Override // md.q
    public final void r() throws IOException {
        for (t tVar : this.Q) {
            tVar.u();
            if (tVar.f19333q0 && !tVar.a0) {
                throw h1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // md.q
    public final long v(long j) {
        t[] tVarArr = this.R;
        if (tVarArr.length > 0) {
            boolean zB = tVarArr[0].B(j, false);
            int i7 = 1;
            while (true) {
                t[] tVarArr2 = this.R;
                if (i7 >= tVarArr2.length) {
                    break;
                }
                tVarArr2[i7].B(j, zB);
                i7++;
            }
            if (zB) {
                ((SparseArray) this.H.f18079e).clear();
            }
        }
        return j;
    }

    @Override // md.q
    public final void w(long j) throws Throwable {
        for (t tVar : this.R) {
            if (tVar.Z && !tVar.s()) {
                int length = tVar.S.length;
                for (int i7 = 0; i7 < length; i7++) {
                    tVar.S[i7].g(j, tVar.f19327k0[i7]);
                }
            }
        }
    }

    @Override // md.q0
    public final boolean z(long j) {
        if (this.P != null) {
            return this.T.z(j);
        }
        for (t tVar : this.Q) {
            if (!tVar.a0) {
                tVar.z(tVar.f19329m0);
            }
        }
        return false;
    }
}
