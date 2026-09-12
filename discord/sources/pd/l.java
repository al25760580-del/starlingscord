package pd;

import a5.b0;
import a5.i0;
import android.os.SystemClock;
import bh.t;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import gc.q1;
import he.d0;
import he.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import je.e0;
import pa.s;
import pc.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements od.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f17986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.i f17987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f17988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataSource f17990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f17992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j[] f17993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fe.p f17994i;
    public qd.c j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public md.b f17995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17996m;

    public l(l0 l0Var, qd.c cVar, e4.i iVar, int i7, int[] iArr, fe.p pVar, int i10, DataSource dataSource, long j, boolean z5, ArrayList arrayList, o oVar) {
        pc.k iVar2;
        Format format;
        j[] jVarArr;
        od.d dVar;
        this.f17986a = l0Var;
        this.j = cVar;
        this.f17987b = iVar;
        this.f17988c = iArr;
        this.f17994i = pVar;
        this.f17989d = i10;
        this.f17990e = dataSource;
        this.k = i7;
        this.f17991f = j;
        o oVar2 = oVar;
        this.f17992g = oVar2;
        long jD = cVar.d(i7);
        ArrayList arrayListH = h();
        this.f17993h = new j[pVar.length()];
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f17993h.length) {
            qd.m mVar = (qd.m) arrayListH.get(pVar.g(i12));
            qd.b bVarE = iVar.E(mVar.f18760e);
            j[] jVarArr2 = this.f17993h;
            qd.b bVar = bVarE == null ? (qd.b) mVar.f18760e.get(i11) : bVarE;
            Format format2 = mVar.f18759d;
            String str = format2.H;
            if (je.o.k(str)) {
                dVar = null;
                jVarArr = jVarArr2;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    format = format2;
                    jVarArr = jVarArr2;
                    iVar2 = new vc.d(1);
                } else {
                    int i13 = z5 ? 4 : i11;
                    format = format2;
                    jVarArr = jVarArr2;
                    iVar2 = new xc.i(i13, null, null, arrayList, oVar2);
                }
                dVar = new od.d(iVar2, i10, format);
            }
            long j5 = jD;
            jVarArr[i12] = new j(j5, mVar, bVar, dVar, 0L, mVar.c());
            i12++;
            oVar2 = oVar;
            jD = j5;
            i11 = 0;
        }
    }

    @Override // od.i
    public final long a(long j, q1 q1Var) {
        for (j jVar : this.f17993h) {
            h hVar = jVar.f17981d;
            long j5 = jVar.f17983f;
            h hVar2 = jVar.f17981d;
            long j7 = jVar.f17982e;
            if (hVar != null) {
                long jZ = hVar.z(j7);
                if (jZ != 0) {
                    long jP = hVar2.p(j, j7) + j5;
                    long jD = jVar.d(jP);
                    return q1Var.a(j, jD, (jD >= j || (jZ != -1 && jP >= ((hVar2.w() + j5) + jZ) - 1)) ? jD : jVar.d(jP + 1));
                }
            }
        }
        return j;
    }

    @Override // od.i
    public final void b() throws md.b {
        md.b bVar = this.f17995l;
        if (bVar != null) {
            throw bVar;
        }
        this.f17986a.b();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0227  */
    /* JADX WARN: Code duplicated, block: B:106:0x0231  */
    /* JADX WARN: Code duplicated, block: B:108:0x0234  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Code duplicated, block: B:112:0x0250  */
    /* JADX WARN: Code duplicated, block: B:113:0x0253  */
    /* JADX WARN: Code duplicated, block: B:116:0x0257  */
    /* JADX WARN: Code duplicated, block: B:118:0x0260  */
    /* JADX WARN: Code duplicated, block: B:121:0x0271  */
    /* JADX WARN: Code duplicated, block: B:123:0x0279  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x0205  */
    /* JADX WARN: Code duplicated, block: B:97:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // od.i
    public final void c(long j, long j5, List list, i0 i0Var) {
        long j7;
        List list2;
        od.l lVar;
        j[] jVarArr;
        long j10;
        long jMax;
        long j11;
        j jVarI;
        long j12;
        long j13;
        h hVar;
        qd.b bVar;
        od.d dVar;
        qd.m mVar;
        qd.c cVar;
        int i7;
        boolean z5;
        long jI;
        long jB;
        boolean z6;
        long j14;
        long j15;
        long j16;
        j jVar;
        Object jVar2;
        long jC;
        int i10;
        qd.j jVar3;
        qd.j jVarD;
        qd.j jVarA;
        boolean z7;
        if (this.f17995l != null) {
            return;
        }
        long j17 = j5 - j;
        long jI2 = e0.I(this.j.b(this.k).f18747b) + e0.I(this.j.f18715a) + j5;
        int i11 = 0;
        o oVar = this.f17992g;
        if (oVar != null) {
            p pVar = oVar.f18010e;
            qd.c cVar2 = pVar.f18016x;
            op.c cVar3 = pVar.f18012e;
            if (cVar2.f18718d) {
                if (pVar.E) {
                    z7 = true;
                } else {
                    j7 = -9223372036854775807L;
                    Map.Entry entryCeilingEntry = pVar.f18015w.ceilingEntry(Long.valueOf(cVar2.f18722h));
                    if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jI2) {
                        z7 = false;
                    } else {
                        long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                        g gVar = (g) cVar3.f17490e;
                        long j18 = gVar.f17975l0;
                        if (j18 == -9223372036854775807L || j18 < jLongValue) {
                            gVar.f17975l0 = jLongValue;
                        }
                        z7 = true;
                    }
                    if (z7 && pVar.f18017y) {
                        pVar.E = true;
                        pVar.f18017y = false;
                        g gVar2 = (g) cVar3.f17490e;
                        gVar2.f17966b0.removeCallbacks(gVar2.U);
                        gVar2.z();
                    }
                }
                if (z7) {
                    return;
                }
            } else {
                z7 = false;
            }
            j7 = -9223372036854775807L;
            if (z7) {
                return;
            }
        } else {
            j7 = -9223372036854775807L;
        }
        long jI3 = e0.I(e0.v(this.f17991f));
        qd.c cVar4 = this.j;
        long j19 = cVar4.f18715a;
        long jI4 = j19 == j7 ? j7 : jI3 - e0.I(j19 + cVar4.b(this.k).f18747b);
        if (list.isEmpty()) {
            list2 = list;
            lVar = null;
        } else {
            list2 = list;
            lVar = (od.l) kk.b.f(1, list2);
        }
        int length = this.f17994i.length();
        od.m[] mVarArr = new od.m[length];
        int i12 = 0;
        while (true) {
            jVarArr = this.f17993h;
            if (i12 >= length) {
                break;
            }
            j jVar4 = jVarArr[i12];
            h hVar2 = jVar4.f17981d;
            int i13 = length;
            long j20 = jVar4.f17983f;
            int i14 = i11;
            long j21 = jVar4.f17982e;
            s sVar = od.m.f17240s;
            if (hVar2 == null) {
                mVarArr[i12] = sVar;
            } else {
                long jI5 = hVar2.i(j21, jI3) + j20;
                long jB2 = jVar4.b(jI3);
                long jA = lVar != null ? lVar.a() : e0.j(jVar4.f17981d.p(j5, j21) + j20, jI5, jB2);
                if (jA < jI5) {
                    mVarArr[i12] = sVar;
                } else {
                    mVarArr[i12] = new k(i(i12), jA, jB2);
                }
            }
            i12++;
            length = i13;
            i11 = i14;
        }
        int i15 = i11;
        if (this.j.f18718d) {
            j jVar5 = jVarArr[i15];
            if (jVar5.f17981d.z(jVar5.f17982e) == 0) {
                j10 = 0;
            } else {
                long jC2 = jVarArr[i15].c(jVarArr[i15].b(jI3));
                qd.c cVar5 = this.j;
                long j22 = cVar5.f18715a;
                long jMin = Math.min(j22 == j7 ? j7 : jI3 - e0.I(j22 + cVar5.b(this.k).f18747b), jC2) - j;
                j10 = 0;
                jMax = Math.max(0L, jMin);
            }
            j11 = j10;
            this.f17994i.b(j, j17, jMax, list2, mVarArr);
            jVarI = i(this.f17994i.d());
            j12 = jVarI.f17983f;
            j13 = jVarI.f17982e;
            hVar = jVarI.f17981d;
            bVar = jVarI.f17980c;
            dVar = jVarI.f17978a;
            mVar = jVarI.f17979b;
            if (dVar == null) {
                if (dVar.F == null) {
                    jVar3 = mVar.f18765y;
                } else {
                    jVar3 = null;
                }
                jVarD = hVar == null ? mVar.d() : null;
                if (jVar3 == null || jVarD != null) {
                    Format formatL = this.f17994i.l();
                    int iM = this.f17994i.m();
                    Object objP = this.f17994i.p();
                    if (jVar3 != null) {
                        jVarA = jVar3.a(jVarD, bVar.f18711a);
                        if (jVarA != null) {
                            jVar3 = jVarA;
                        }
                    } else {
                        jVar3 = jVarD;
                    }
                    i0Var.f215i = new od.k(this.f17990e, android.support.v4.media.session.b.b(mVar, bVar.f18711a, jVar3, i15), formatL, iM, objP, jVarI.f17978a);
                    return;
                }
            }
            cVar = this.j;
            if (cVar.f18718d || this.k != cVar.f18725m.size() - 1) {
                i7 = i15;
            } else {
                i7 = 1;
            }
            if (i7 == 0 && j13 == j7) {
                z5 = i15;
            } else {
                z5 = 1;
            }
            if (hVar.z(j13) == j11) {
                i0Var.f214e = z5;
                return;
            }
            jI = hVar.i(j13, jI3) + j12;
            jB = jVarI.b(jI3);
            if (i7 != 0) {
                jC = jVarI.c(jB);
                if ((jC - jVarI.d(jB)) + jC >= j13) {
                    z6 = z5;
                    i10 = 1;
                } else {
                    z6 = z5;
                    i10 = i15;
                }
                z6 = (z5 ? 1 : 0) & i10;
            }
            if (lVar != null) {
                j15 = lVar.a();
                j14 = jB;
            } else {
                j14 = jB;
                j15 = e0.j(hVar.p(j5, j13) + j12, jI, j14);
            }
            j16 = j15;
            if (j16 < jI) {
                this.f17995l = new md.b();
            }
            if (j16 <= j14 || (this.f17996m && j16 >= j14)) {
                i0Var.f214e = z6;
            }
            if (z6 != 0 && jVarI.d(j16) >= j13) {
                i0Var.f214e = true;
                return;
            }
            j jVar6 = jVarI;
            int iMin = (int) Math.min(1, (j14 - j16) + 1);
            if (j13 == j7) {
                jVar = jVar6;
                break;
            }
            while (true) {
                if (iMin <= 1) {
                    jVar = jVar6;
                    break;
                }
                jVar = jVar6;
                if (jVar.d((((long) iMin) + j16) - 1) < j13) {
                    break;
                }
                iMin--;
                jVar6 = jVar;
            }
            long j23 = list.isEmpty() ? j5 : j7;
            Format formatL2 = this.f17994i.l();
            int iM2 = this.f17994i.m();
            Object objP2 = this.f17994i.p();
            long jD = jVar.d(j16);
            qd.j jVarK = hVar.k(j16 - j12);
            DataSource dataSource = this.f17990e;
            if (dVar == null) {
                jVar2 = new od.n(dataSource, android.support.v4.media.session.b.b(mVar, bVar.f18711a, jVarK, hVar.v() || (jI4 > j7 ? 1 : (jI4 == j7 ? 0 : -1)) == 0 || (jVar.c(j16) > jI4 ? 1 : (jVar.c(j16) == jI4 ? 0 : -1)) <= 0 ? 0 : 8), formatL2, iM2, objP2, jD, jVar.c(j16), j16, this.f17989d, formatL2);
            } else {
                int i16 = 1;
                int i17 = 1;
                while (i16 < iMin) {
                    qd.j jVarA2 = jVarK.a(hVar.k((j16 + ((long) i16)) - j12), bVar.f18711a);
                    if (jVarA2 == null) {
                        break;
                    }
                    i17++;
                    i16++;
                    jVarK = jVarA2;
                }
                long j24 = (j16 + ((long) i17)) - 1;
                long jC3 = jVar.c(j24);
                jVar2 = new od.j(dataSource, android.support.v4.media.session.b.b(mVar, bVar.f18711a, jVarK, hVar.v() || (jI4 > j7 ? 1 : (jI4 == j7 ? 0 : -1)) == 0 || (jVar.c(j24) > jI4 ? 1 : (jVar.c(j24) == jI4 ? 0 : -1)) <= 0 ? 0 : 8), formatL2, iM2, objP2, jD, jC3, j23, (j13 == j7 || j13 > jC3) ? j7 : j13, j16, i17, -mVar.f18761i, jVar.f17978a);
            }
            i0Var.f215i = jVar2;
            return;
        }
        j10 = 0;
        jMax = j7;
        j11 = j10;
        this.f17994i.b(j, j17, jMax, list2, mVarArr);
        jVarI = i(this.f17994i.d());
        j12 = jVarI.f17983f;
        j13 = jVarI.f17982e;
        hVar = jVarI.f17981d;
        bVar = jVarI.f17980c;
        dVar = jVarI.f17978a;
        mVar = jVarI.f17979b;
        if (dVar == null) {
            if (dVar.F == null) {
                jVar3 = mVar.f18765y;
            } else {
                jVar3 = null;
            }
            jVarD = hVar == null ? mVar.d() : null;
            if (jVar3 == null) {
            }
            Format formatL3 = this.f17994i.l();
            int iM3 = this.f17994i.m();
            Object objP3 = this.f17994i.p();
            if (jVar3 != null) {
                jVarA = jVar3.a(jVarD, bVar.f18711a);
                if (jVarA != null) {
                    jVar3 = jVarA;
                }
            } else {
                jVar3 = jVarD;
            }
            i0Var.f215i = new od.k(this.f17990e, android.support.v4.media.session.b.b(mVar, bVar.f18711a, jVar3, i15), formatL3, iM3, objP3, jVarI.f17978a);
            return;
        }
        cVar = this.j;
        if (cVar.f18718d) {
            i7 = i15;
        } else {
            i7 = i15;
        }
        if (i7 == 0) {
            z5 = 1;
        } else {
            z5 = 1;
        }
        if (hVar.z(j13) == j11) {
            i0Var.f214e = z5;
            return;
        }
        jI = hVar.i(j13, jI3) + j12;
        jB = jVarI.b(jI3);
        if (i7 != 0) {
            jC = jVarI.c(jB);
            if ((jC - jVarI.d(jB)) + jC >= j13) {
                z6 = z5;
                i10 = 1;
            } else {
                z6 = z5;
                i10 = i15;
            }
            z6 = (z5 ? 1 : 0) & i10;
        }
        if (lVar != null) {
            j15 = lVar.a();
            j14 = jB;
        } else {
            j14 = jB;
            j15 = e0.j(hVar.p(j5, j13) + j12, jI, j14);
        }
        j16 = j15;
        if (j16 < jI) {
            this.f17995l = new md.b();
        } else {
            if (j16 <= j14) {
            }
            i0Var.f214e = z6;
        }
    }

    @Override // od.i
    public final boolean d(od.e eVar, boolean z5, b0 b0Var, o9.d dVar) {
        long jMax;
        if (z5) {
            o oVar = this.f17992g;
            if (oVar != null) {
                long j = oVar.f18009d;
                boolean z6 = j != -9223372036854775807L && j < eVar.f17227y;
                p pVar = oVar.f18010e;
                if (pVar.f18016x.f18718d) {
                    if (!pVar.E) {
                        if (z6) {
                            if (pVar.f18017y) {
                                pVar.E = true;
                                pVar.f18017y = false;
                                g gVar = (g) pVar.f18012e.f17490e;
                                gVar.f17966b0.removeCallbacks(gVar.U);
                                gVar.z();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z7 = this.j.f18718d;
            j[] jVarArr = this.f17993h;
            if (!z7 && (eVar instanceof od.l)) {
                IOException iOException = (IOException) b0Var.f174i;
                if ((iOException instanceof d0) && ((d0) iOException).f10597v == 404) {
                    j jVar = jVarArr[this.f17994i.i(eVar.f17224v)];
                    long jZ = jVar.f17981d.z(jVar.f17982e);
                    if (jZ != -1 && jZ != 0) {
                        if (((od.l) eVar).a() > ((jVar.f17981d.w() + jVar.f17983f) + jZ) - 1) {
                            this.f17996m = true;
                            return true;
                        }
                    }
                }
            }
            j jVar2 = jVarArr[this.f17994i.i(eVar.f17224v)];
            qd.m mVar = jVar2.f17979b;
            qd.b bVar = jVar2.f17980c;
            ei.e0 e0Var = mVar.f18760e;
            e4.i iVar = this.f17987b;
            qd.b bVarE = iVar.E(e0Var);
            if (bVarE == null || bVar.equals(bVarE)) {
                fe.p pVar2 = this.f17994i;
                ei.e0 e0Var2 = jVar2.f17979b.f18760e;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int length = pVar2.length();
                int i7 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (pVar2.a(i10, jElapsedRealtime)) {
                        i7++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < e0Var2.size(); i11++) {
                    hashSet.add(Integer.valueOf(((qd.b) e0Var2.get(i11)).f18713c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayListF = iVar.f(e0Var2);
                for (int i12 = 0; i12 < arrayListF.size(); i12++) {
                    hashSet2.add(Integer.valueOf(((qd.b) arrayListF.get(i12)).f18713c));
                }
                t tVar = new t(size, size - hashSet2.size(), length, i7);
                if (tVar.a(2) || tVar.a(1)) {
                    dVar.getClass();
                    ad.f fVarJ = o9.d.j(tVar, b0Var);
                    if (fVarJ != null) {
                        long j5 = fVarJ.f348b;
                        int i13 = fVarJ.f347a;
                        if (tVar.a(i13)) {
                            if (i13 == 2) {
                                fe.p pVar3 = this.f17994i;
                                return pVar3.n(pVar3.i(eVar.f17224v), j5);
                            }
                            if (i13 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j5;
                                String str = bVar.f18712b;
                                HashMap map = (HashMap) iVar.f7980e;
                                if (map.containsKey(str)) {
                                    Long l6 = (Long) map.get(str);
                                    int i14 = e0.f13788a;
                                    jMax = Math.max(jElapsedRealtime2, l6.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                int i15 = bVar.f18713c;
                                if (i15 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i15);
                                    HashMap map2 = (HashMap) iVar.f7981i;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l7 = (Long) map2.get(numValueOf);
                                        int i16 = e0.f13788a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l7.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // od.i
    public final boolean e(long j, od.e eVar, List list) {
        if (this.f17995l != null) {
            return false;
        }
        return this.f17994i.j(j, eVar, list);
    }

    @Override // od.i
    public final int f(long j, List list) {
        return (this.f17995l != null || this.f17994i.length() < 2) ? list.size() : this.f17994i.h(j, list);
    }

    @Override // od.i
    public final void g(od.e eVar) {
        if (eVar instanceof od.k) {
            int i7 = this.f17994i.i(((od.k) eVar).f17224v);
            j[] jVarArr = this.f17993h;
            j jVar = jVarArr[i7];
            if (jVar.f17981d == null) {
                od.d dVar = jVar.f17978a;
                u uVar = dVar.E;
                pc.g gVar = uVar instanceof pc.g ? (pc.g) uVar : null;
                if (gVar != null) {
                    qd.m mVar = jVar.f17979b;
                    jVarArr[i7] = new j(jVar.f17982e, mVar, jVar.f17980c, dVar, jVar.f17983f, new androidx.recyclerview.widget.h(gVar, mVar.f18761i, 3));
                }
            }
        }
        o oVar = this.f17992g;
        if (oVar != null) {
            long j = oVar.f18009d;
            if (j == -9223372036854775807L || eVar.E > j) {
                oVar.f18009d = eVar.E;
            }
            oVar.f18010e.f18017y = true;
        }
    }

    public final ArrayList h() {
        List list = this.j.b(this.k).f18748c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f17988c) {
            arrayList.addAll(((qd.a) list.get(i7)).f18707c);
        }
        return arrayList;
    }

    public final j i(int i7) {
        j[] jVarArr = this.f17993h;
        j jVar = jVarArr[i7];
        qd.b bVarE = this.f17987b.E(jVar.f17979b.f18760e);
        if (bVarE == null || bVarE.equals(jVar.f17980c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.f17982e, jVar.f17979b, bVarE, jVar.f17978a, jVar.f17983f, jVar.f17981d);
        jVarArr[i7] = jVar2;
        return jVar2;
    }

    @Override // od.i
    public final void release() {
        for (j jVar : this.f17993h) {
            od.d dVar = jVar.f17978a;
            if (dVar != null) {
                dVar.f17214d.release();
            }
        }
    }
}
