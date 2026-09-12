package rc;

import com.google.android.exoplayer2.Format;
import ei.c0;
import gc.g0;
import gc.h1;
import gc.l;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import je.e0;
import je.o;
import je.w;
import pc.k;
import pc.m;
import pc.n;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19222c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f19224e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f19228i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19231n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f19220a = new w(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19221b = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f19223d = new i8.c(14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e[] f19226g = new e[0];
    public long k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19229l = -1;
    public int j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19225f = -9223372036854775807L;

    /* JADX WARN: Code duplicated, block: B:159:0x0379  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    @Override // pc.k
    public final int d(pc.l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        boolean z5;
        e eVar;
        int i7;
        e eVar2;
        long j = this.f19227h;
        int i10 = 0;
        if (j != -1) {
            long j5 = ((pc.h) lVar).f17895v;
            if (j < j5 || j > 262144 + j5) {
                nVar.f17905a = j;
                z5 = true;
            } else {
                ((pc.h) lVar).u((int) (j - j5));
                z5 = false;
            }
        } else {
            z5 = false;
        }
        this.f19227h = -1L;
        if (z5) {
            return 1;
        }
        int i11 = this.f19222c;
        e eVar3 = null;
        l lVar2 = this.f19221b;
        int i12 = 2;
        w wVar = this.f19220a;
        switch (i11) {
            case 0:
                if (!f(lVar)) {
                    throw h1.a("AVI Header List not found", null);
                }
                ((pc.h) lVar).u(12);
                this.f19222c = 1;
                return 0;
            case 1:
                ((pc.h) lVar).a(wVar.f13860a, 0, 12, false);
                wVar.F(0);
                lVar2.getClass();
                lVar2.f9744a = wVar.i();
                lVar2.f9745b = wVar.i();
                lVar2.f9746c = 0;
                if (lVar2.f9744a != 1414744396) {
                    throw h1.a("LIST expected, found: " + lVar2.f9744a, null);
                }
                int i13 = wVar.i();
                lVar2.f9746c = i13;
                if (i13 == 1819436136) {
                    this.j = lVar2.f9745b;
                    this.f19222c = 2;
                    return 0;
                }
                throw h1.a("hdrl expected, found: " + lVar2.f9746c, null);
            case 2:
                int i14 = this.j - 4;
                w wVar2 = new w(i14);
                ((pc.h) lVar).a(wVar2.f13860a, 0, i14, false);
                f fVarB = f.b(1819436136, wVar2);
                int i15 = fVarB.f19251b;
                if (i15 != 1819436136) {
                    throw h1.a("Unexpected header list type " + i15, null);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw h1.a("AviHeader not found", null);
                }
                this.f19224e = cVar;
                this.f19225f = ((long) cVar.f19234c) * ((long) cVar.f19232a);
                ArrayList arrayList = new ArrayList();
                c0 c0VarListIterator = fVarB.f19250a.listIterator(0);
                int i16 = 0;
                while (c0VarListIterator.hasNext()) {
                    a aVar = (a) c0VarListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i17 = i16 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            je.b.N("AviExtractor", "Missing Stream Header");
                        } else if (gVar == null) {
                            je.b.N("AviExtractor", "Missing Stream Format");
                        } else {
                            long jP = e0.P(dVar.f19238d, ((long) dVar.f19236b) * 1000000, dVar.f19237c);
                            Format format = gVar.f19252a;
                            g0 g0VarA = format.a();
                            g0VarA.f9635a = Integer.toString(i16);
                            int i18 = dVar.f19239e;
                            if (i18 != 0) {
                                g0VarA.f9644l = i18;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                g0VarA.f9636b = hVar.f19253a;
                            }
                            int iH = o.h(format.I);
                            if (iH == 1 || iH == i12) {
                                x xVarX = this.f19223d.x(i16, iH);
                                xVarX.e(new Format(g0VarA));
                                eVar = new e(i16, iH, jP, dVar.f19238d, xVarX);
                                this.f19225f = jP;
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i16 = i17;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i16 = i17;
                    }
                    i12 = 2;
                }
                this.f19226g = (e[]) arrayList.toArray(new e[0]);
                this.f19223d.q();
                this.f19222c = 3;
                return 0;
            case 3:
                long j7 = this.k;
                if (j7 != -1 && ((pc.h) lVar).f17895v != j7) {
                    this.f19227h = j7;
                    return 0;
                }
                ((pc.h) lVar).g(wVar.f13860a, 0, 12, false);
                pc.h hVar2 = (pc.h) lVar;
                hVar2.f17897x = 0;
                wVar.F(0);
                lVar2.getClass();
                lVar2.f9744a = wVar.i();
                lVar2.f9745b = wVar.i();
                lVar2.f9746c = 0;
                int i19 = wVar.i();
                int i20 = lVar2.f9744a;
                if (i20 == 1179011410) {
                    hVar2.u(12);
                    return 0;
                }
                if (i20 != 1414744396 || i19 != 1769369453) {
                    this.f19227h = hVar2.f17895v + ((long) lVar2.f9745b) + 8;
                    return 0;
                }
                long j10 = hVar2.f17895v;
                this.k = j10;
                this.f19229l = j10 + ((long) lVar2.f9745b) + 8;
                if (!this.f19231n) {
                    c cVar2 = this.f19224e;
                    cVar2.getClass();
                    if ((cVar2.f19233b & 16) == 16) {
                        this.f19222c = 4;
                        this.f19227h = this.f19229l;
                        return 0;
                    }
                    this.f19223d.c(new pc.o(this.f19225f));
                    this.f19231n = true;
                }
                this.f19227h = hVar2.f17895v + 12;
                this.f19222c = 6;
                return 0;
            case 4:
                ((pc.h) lVar).a(wVar.f13860a, 0, 8, false);
                wVar.F(0);
                int i21 = wVar.i();
                int i22 = wVar.i();
                if (i21 != 829973609) {
                    this.f19227h = ((pc.h) lVar).f17895v + ((long) i22);
                    return 0;
                }
                this.f19222c = 5;
                this.f19230m = i22;
                return 0;
            case 5:
                w wVar3 = new w(this.f19230m);
                ((pc.h) lVar).a(wVar3.f13860a, 0, this.f19230m, false);
                long j11 = 0;
                if (wVar3.a() >= 16) {
                    int i23 = wVar3.f13861b;
                    wVar3.G(8);
                    long jI = wVar3.i();
                    long j12 = this.k;
                    j11 = jI <= j12 ? j12 + 8 : 0L;
                    wVar3.F(i23);
                }
                while (wVar3.a() >= 16) {
                    int i24 = wVar3.i();
                    int i25 = wVar3.i();
                    long jI2 = ((long) wVar3.i()) + j11;
                    wVar3.i();
                    e[] eVarArr = this.f19226g;
                    int length = eVarArr.length;
                    int i26 = i10;
                    while (true) {
                        if (i26 < length) {
                            eVar2 = eVarArr[i26];
                            i7 = i10;
                            if (eVar2.f19241b != i24 && eVar2.f19242c != i24) {
                                i26++;
                                i10 = i7;
                            }
                        } else {
                            i7 = i10;
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        if ((i25 & 16) == 16) {
                            if (eVar2.j == eVar2.f19249l.length) {
                                long[] jArr = eVar2.k;
                                eVar2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f19249l;
                                eVar2.f19249l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.k;
                            int i27 = eVar2.j;
                            jArr2[i27] = jI2;
                            eVar2.f19249l[i27] = eVar2.f19248i;
                            eVar2.j = i27 + 1;
                        }
                        eVar2.f19248i++;
                    }
                    i10 = i7;
                }
                int i28 = i10;
                e[] eVarArr2 = this.f19226g;
                int length2 = eVarArr2.length;
                for (int i29 = i28; i29 < length2; i29++) {
                    e eVar4 = eVarArr2[i29];
                    eVar4.k = Arrays.copyOf(eVar4.k, eVar4.j);
                    eVar4.f19249l = Arrays.copyOf(eVar4.f19249l, eVar4.j);
                }
                this.f19231n = true;
                this.f19223d.c(new pc.o(this, this.f19225f, 2));
                this.f19222c = 6;
                this.f19227h = this.k;
                return i28;
            case 6:
                if (((pc.h) lVar).f17895v >= this.f19229l) {
                    return -1;
                }
                e eVar5 = this.f19228i;
                if (eVar5 != null) {
                    int i30 = eVar5.f19246g;
                    int iA = i30 - eVar5.f19240a.a(lVar, i30, false);
                    eVar5.f19246g = iA;
                    boolean z6 = iA == 0;
                    if (z6) {
                        if (eVar5.f19245f > 0) {
                            x xVar = eVar5.f19240a;
                            int i31 = eVar5.f19247h;
                            xVar.c((eVar5.f19243d * ((long) i31)) / ((long) eVar5.f19244e), Arrays.binarySearch(eVar5.f19249l, i31) >= 0 ? 1 : 0, eVar5.f19245f, 0, null);
                        }
                        eVar5.f19247h++;
                    }
                    if (z6) {
                        this.f19228i = null;
                    }
                    return 0;
                }
                pc.h hVar3 = (pc.h) lVar;
                if ((hVar3.f17895v & 1) == 1) {
                    hVar3.u(1);
                }
                hVar3.g(wVar.f13860a, 0, 12, false);
                wVar.F(0);
                int i32 = wVar.i();
                if (i32 == 1414744396) {
                    wVar.F(8);
                    hVar3.u(wVar.i() == 1769369453 ? 12 : 8);
                    hVar3.f17897x = 0;
                    return 0;
                }
                int i33 = wVar.i();
                if (i32 == 1263424842) {
                    this.f19227h = hVar3.f17895v + ((long) i33) + 8;
                    return 0;
                }
                hVar3.u(8);
                hVar3.f17897x = 0;
                for (e eVar6 : this.f19226g) {
                    if (eVar6.f19241b == i32 || eVar6.f19242c == i32) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.f19227h = hVar3.f17895v + ((long) i33);
                            return 0;
                        }
                        eVar3.f19245f = i33;
                        eVar3.f19246g = i33;
                        this.f19228i = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.f19227h = hVar3.f17895v + ((long) i33);
                    return 0;
                }
                eVar3.f19245f = i33;
                eVar3.f19246g = i33;
                this.f19228i = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f19222c = 0;
        this.f19223d = mVar;
        this.f19227h = -1L;
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) {
        w wVar = this.f19220a;
        lVar.C(wVar.f13860a, 0, 12);
        wVar.F(0);
        if (wVar.i() == 1179011410) {
            wVar.G(4);
            if (wVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f19227h = -1L;
        this.f19228i = null;
        for (e eVar : this.f19226g) {
            if (eVar.j == 0) {
                eVar.f19247h = 0;
            } else {
                eVar.f19247h = eVar.f19249l[e0.e(eVar.k, j, true)];
            }
        }
        if (j != 0) {
            this.f19222c = 6;
        } else if (this.f19226g.length == 0) {
            this.f19222c = 0;
        } else {
            this.f19222c = 3;
        }
    }

    @Override // pc.k
    public final void release() {
    }
}
