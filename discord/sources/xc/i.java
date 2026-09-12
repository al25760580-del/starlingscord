package xc;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import je.b0;
import je.e0;
import je.w;
import kotlin.jvm.internal.LongCompanionObject;
import pc.u;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements pc.k {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format J;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f22773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22774c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f22779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f22780i;
    public final b0 j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f22784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f22787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w f22789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f22790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22791v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f22795z;
    public final e4.e k = new e4.e(6, (byte) 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f22781l = new w(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f22776e = new w(je.b.f13761d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f22777f = new w(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f22778g = new w();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f22782m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f22783n = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f22775d = new SparseArray();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f22793x = -9223372036854775807L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f22792w = -9223372036854775807L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f22794y = -9223372036854775807L;
    public pc.m E = pc.m.f17904u;
    public x[] F = new x[0];
    public x[] G = new x[0];

    static {
        g0 g0Var = new g0();
        g0Var.k = "application/x-emsg";
        J = new Format(g0Var);
    }

    public i(int i7, b0 b0Var, o oVar, List list, pd.o oVar2) {
        this.f22772a = i7;
        this.j = b0Var;
        this.f22773b = oVar;
        this.f22774c = Collections.unmodifiableList(list);
        this.f22784o = oVar2;
        byte[] bArr = new byte[16];
        this.f22779h = bArr;
        this.f22780i = new w(bArr);
    }

    public static mc.i a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) list.get(i7);
            if (bVar.f14999e == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f22744i.f13860a;
                a1.d dVarE = j.e(bArr);
                UUID uuid = dVarE == null ? null : (UUID) dVarE.f18i;
                if (uuid == null) {
                    je.b.N("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new mc.h(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new mc.i(null, false, (mc.h[]) arrayList.toArray(new mc.h[0]));
    }

    public static void b(w wVar, int i7, q qVar) throws h1 {
        wVar.F(i7 + 8);
        int iG = wVar.g();
        if ((iG & 1) != 0) {
            throw h1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z5 = (iG & 2) != 0;
        int iX = wVar.x();
        if (iX == 0) {
            Arrays.fill(qVar.f22853l, 0, qVar.f22848e, false);
            return;
        }
        int i10 = qVar.f22848e;
        w wVar2 = qVar.f22855n;
        if (iX != i10) {
            StringBuilder sbS = a3.e.s(iX, "Senc sample count ", " is different from fragment sample count");
            sbS.append(qVar.f22848e);
            throw h1.a(sbS.toString(), null);
        }
        Arrays.fill(qVar.f22853l, 0, iX, z5);
        wVar2.C(wVar.a());
        qVar.k = true;
        qVar.f22856o = true;
        wVar.e(wVar2.f13860a, 0, wVar2.f13862c);
        wVar2.F(0);
        qVar.f22856o = false;
    }

    /* JADX WARN: Code duplicated, block: B:273:0x05de  */
    public final void c(long j) throws h1 {
        f fVar;
        f fVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i7;
        int i10;
        byte[] bArr;
        int i11;
        boolean z5;
        while (true) {
            ArrayDeque arrayDeque = this.f22782m;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).f22741i != j) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i12 = aVar.f14999e;
            ArrayList arrayList4 = aVar.f22743w;
            ArrayList arrayList5 = aVar.f22742v;
            int i13 = this.f22772a;
            int i14 = 12;
            o oVar = this.f22773b;
            SparseArray sparseArray = this.f22775d;
            if (i12 == 1836019574) {
                if (!(oVar == null)) {
                    throw new IllegalStateException("Unexpected moov box.");
                }
                mc.i iVarA = a(arrayList5);
                a aVarE = aVar.e(1836475768);
                aVarE.getClass();
                ArrayList arrayList6 = aVarE.f22742v;
                SparseArray sparseArray2 = new SparseArray();
                int size = arrayList6.size();
                int i15 = 0;
                long jV = -9223372036854775807L;
                while (i15 < size) {
                    b bVar = (b) arrayList6.get(i15);
                    int i16 = bVar.f14999e;
                    w wVar = bVar.f22744i;
                    if (i16 == 1953654136) {
                        wVar.F(i14);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(wVar.g()), new f(wVar.g() - 1, wVar.g(), wVar.g(), wVar.g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (f) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i16 == 1835362404) {
                            wVar.F(8);
                            jV = lc.a.d(wVar.g()) == 0 ? wVar.v() : wVar.y();
                        }
                    }
                    i15++;
                    arrayList6 = arrayList;
                    i14 = 12;
                }
                int i17 = 1;
                ArrayList arrayListF = e.f(aVar, new pc.q(), jV, iVarA, (i13 & 16) != 0, false, new mi.a(13, this));
                int size2 = arrayListF.size();
                if (sparseArray.size() == 0) {
                    int i18 = 0;
                    while (i18 < size2) {
                        r rVar = (r) arrayListF.get(i18);
                        o oVar2 = rVar.f22859a;
                        pc.m mVar = this.E;
                        int i19 = oVar2.f22831b;
                        int i20 = oVar2.f22830a;
                        x xVarX = mVar.x(i18, i19);
                        if (sparseArray2.size() == i17) {
                            fVar = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar = (f) sparseArray2.get(i20);
                            fVar.getClass();
                        }
                        sparseArray.put(i20, new h(xVarX, rVar, fVar));
                        this.f22793x = Math.max(this.f22793x, oVar2.f22834e);
                        i18++;
                        i17 = 1;
                    }
                    this.E.q();
                } else {
                    je.b.k(sparseArray.size() == size2);
                    for (int i21 = 0; i21 < size2; i21++) {
                        r rVar2 = (r) arrayListF.get(i21);
                        o oVar3 = rVar2.f22859a;
                        h hVar = (h) sparseArray.get(oVar3.f22830a);
                        int i22 = oVar3.f22830a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i22);
                            fVar2.getClass();
                        }
                        hVar.f22765d = rVar2;
                        hVar.f22766e = fVar2;
                        hVar.f22762a.e(rVar2.f22859a.f22835f);
                        hVar.d();
                    }
                }
            } else {
                int i23 = i13;
                if (i12 == 1836019558) {
                    boolean z6 = oVar != null;
                    int size3 = arrayList4.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        a aVar2 = (a) arrayList4.get(i24);
                        if (aVar2.f14999e == 1953653094) {
                            b bVarG = aVar2.g(1952868452);
                            ArrayList arrayList7 = aVar2.f22742v;
                            bVarG.getClass();
                            w wVar2 = bVarG.f22744i;
                            wVar2.F(8);
                            int iG = wVar2.g();
                            h hVar2 = (h) (z6 ? sparseArray.valueAt(0) : sparseArray.get(wVar2.g()));
                            if (hVar2 == null) {
                                size3 = size3;
                                hVar2 = null;
                            } else {
                                q qVar = hVar2.f22763b;
                                if ((iG & 1) != 0) {
                                    long jY = wVar2.y();
                                    qVar.f22845b = jY;
                                    qVar.f22846c = jY;
                                }
                                f fVar3 = hVar2.f22766e;
                                qVar.f22844a = new f((iG & 2) != 0 ? wVar2.g() - 1 : fVar3.f22755a, (iG & 8) != 0 ? wVar2.g() : fVar3.f22756b, (iG & 16) != 0 ? wVar2.g() : fVar3.f22757c, (iG & 32) != 0 ? wVar2.g() : fVar3.f22758d);
                            }
                            if (hVar2 != null) {
                                q qVar2 = hVar2.f22763b;
                                long j5 = qVar2.f22857p;
                                boolean z7 = qVar2.f22858q;
                                hVar2.d();
                                hVar2.f22771l = true;
                                a aVar3 = aVar2;
                                b bVarG2 = aVar3.g(1952867444);
                                if (bVarG2 == null || (i23 & 2) != 0) {
                                    qVar2.f22857p = j5;
                                    qVar2.f22858q = z7;
                                } else {
                                    w wVar3 = bVarG2.f22744i;
                                    wVar3.F(8);
                                    qVar2.f22857p = lc.a.d(wVar3.g()) == 1 ? wVar3.y() : wVar3.v();
                                    qVar2.f22858q = true;
                                }
                                int size4 = arrayList7.size();
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    i10 = 1953658222;
                                    if (i25 >= size4) {
                                        break;
                                    }
                                    int i28 = i25;
                                    b bVar2 = (b) arrayList7.get(i25);
                                    ArrayList arrayList8 = arrayList4;
                                    if (bVar2.f14999e == 1953658222) {
                                        w wVar4 = bVar2.f22744i;
                                        wVar4.F(12);
                                        int iX = wVar4.x();
                                        if (iX > 0) {
                                            i27 += iX;
                                            i26++;
                                        }
                                    }
                                    i25 = i28 + 1;
                                    arrayList4 = arrayList8;
                                }
                                arrayList2 = arrayList4;
                                hVar2.f22769h = 0;
                                hVar2.f22768g = 0;
                                hVar2.f22767f = 0;
                                qVar2.f22847d = i26;
                                qVar2.f22848e = i27;
                                if (qVar2.f22850g.length < i26) {
                                    qVar2.f22849f = new long[i26];
                                    qVar2.f22850g = new int[i26];
                                }
                                if (qVar2.f22851h.length < i27) {
                                    int i29 = (i27 * 125) / 100;
                                    qVar2.f22851h = new int[i29];
                                    qVar2.f22852i = new long[i29];
                                    qVar2.j = new boolean[i29];
                                    qVar2.f22853l = new boolean[i29];
                                }
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    long j7 = 0;
                                    if (i30 >= size4) {
                                        arrayList3 = arrayList5;
                                        i7 = i23;
                                        a aVar4 = aVar3;
                                        o oVar4 = hVar2.f22765d.f22859a;
                                        f fVar4 = qVar2.f22844a;
                                        fVar4.getClass();
                                        int i33 = fVar4.f22755a;
                                        p[] pVarArr = oVar4.k;
                                        p pVar = pVarArr == null ? null : pVarArr[i33];
                                        b bVarG3 = aVar4.g(1935763834);
                                        if (bVarG3 != null) {
                                            pVar.getClass();
                                            w wVar5 = bVarG3.f22744i;
                                            int i34 = pVar.f22842d;
                                            wVar5.F(8);
                                            if ((wVar5.g() & 1) == 1) {
                                                wVar5.G(8);
                                            }
                                            int iU = wVar5.u();
                                            int iX2 = wVar5.x();
                                            if (iX2 > qVar2.f22848e) {
                                                StringBuilder sbS = a3.e.s(iX2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbS.append(qVar2.f22848e);
                                                throw h1.a(sbS.toString(), null);
                                            }
                                            if (iU == 0) {
                                                boolean[] zArr = qVar2.f22853l;
                                                i11 = 0;
                                                for (int i35 = 0; i35 < iX2; i35++) {
                                                    int iU2 = wVar5.u();
                                                    i11 += iU2;
                                                    zArr[i35] = iU2 > i34;
                                                }
                                                z5 = false;
                                            } else {
                                                i11 = iU * iX2;
                                                z5 = false;
                                                Arrays.fill(qVar2.f22853l, 0, iX2, iU > i34);
                                            }
                                            Arrays.fill(qVar2.f22853l, iX2, qVar2.f22848e, z5);
                                            if (i11 > 0) {
                                                qVar2.f22855n.C(i11);
                                                qVar2.k = true;
                                                qVar2.f22856o = true;
                                            }
                                        }
                                        b bVarG4 = aVar4.g(1935763823);
                                        if (bVarG4 != null) {
                                            w wVar6 = bVarG4.f22744i;
                                            wVar6.F(8);
                                            int iG2 = wVar6.g();
                                            if ((iG2 & 1) == 1) {
                                                wVar6.G(8);
                                            }
                                            int iX3 = wVar6.x();
                                            if (iX3 != 1) {
                                                throw h1.a("Unexpected saio entry count: " + iX3, null);
                                            }
                                            qVar2.f22846c += lc.a.d(iG2) == 0 ? wVar6.v() : wVar6.y();
                                        }
                                        b bVarG5 = aVar4.g(1936027235);
                                        if (bVarG5 != null) {
                                            b(bVarG5.f22744i, 0, qVar2);
                                        }
                                        String str = pVar != null ? pVar.f22840b : null;
                                        w wVar7 = null;
                                        w wVar8 = null;
                                        for (int i36 = 0; i36 < arrayList7.size(); i36++) {
                                            b bVar3 = (b) arrayList7.get(i36);
                                            w wVar9 = bVar3.f22744i;
                                            int i37 = bVar3.f14999e;
                                            if (i37 == 1935828848) {
                                                wVar9.F(12);
                                                if (wVar9.g() == 1936025959) {
                                                    wVar7 = wVar9;
                                                }
                                            } else if (i37 == 1936158820) {
                                                wVar9.F(12);
                                                if (wVar9.g() == 1936025959) {
                                                    wVar8 = wVar9;
                                                }
                                            }
                                        }
                                        if (wVar7 != null && wVar8 != null) {
                                            wVar7.F(8);
                                            int iD = lc.a.d(wVar7.g());
                                            wVar7.G(4);
                                            if (iD == 1) {
                                                wVar7.G(4);
                                            }
                                            if (wVar7.g() != 1) {
                                                throw h1.c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            wVar8.F(8);
                                            int iD2 = lc.a.d(wVar8.g());
                                            wVar8.G(4);
                                            if (iD2 == 1) {
                                                if (wVar8.v() == 0) {
                                                    throw h1.c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iD2 >= 2) {
                                                wVar8.G(4);
                                            }
                                            if (wVar8.v() != 1) {
                                                throw h1.c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            wVar8.G(1);
                                            int iU3 = wVar8.u();
                                            int i38 = (iU3 & 240) >> 4;
                                            int i39 = iU3 & 15;
                                            boolean z10 = wVar8.u() == 1;
                                            if (z10) {
                                                int iU4 = wVar8.u();
                                                byte[] bArr2 = new byte[16];
                                                wVar8.e(bArr2, 0, 16);
                                                if (iU4 == 0) {
                                                    int iU5 = wVar8.u();
                                                    byte[] bArr3 = new byte[iU5];
                                                    wVar8.e(bArr3, 0, iU5);
                                                    bArr = bArr3;
                                                } else {
                                                    bArr = null;
                                                }
                                                qVar2.k = true;
                                                qVar2.f22854m = new p(z10, str, iU4, bArr2, i38, i39, bArr);
                                            }
                                        }
                                        int size5 = arrayList7.size();
                                        for (int i40 = 0; i40 < size5; i40++) {
                                            b bVar4 = (b) arrayList7.get(i40);
                                            if (bVar4.f14999e == 1970628964) {
                                                w wVar10 = bVar4.f22744i;
                                                wVar10.F(8);
                                                byte[] bArr4 = this.f22779h;
                                                wVar10.e(bArr4, 0, 16);
                                                if (Arrays.equals(bArr4, I)) {
                                                    b(wVar10, 16, qVar2);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    b bVar5 = (b) arrayList7.get(i30);
                                    int i41 = size4;
                                    if (bVar5.f14999e == i10) {
                                        int i42 = i31 + 1;
                                        w wVar11 = bVar5.f22744i;
                                        wVar11.F(8);
                                        int iG3 = wVar11.g();
                                        o oVar5 = hVar2.f22765d.f22859a;
                                        f fVar5 = qVar2.f22844a;
                                        int i43 = e0.f13788a;
                                        int i44 = i31;
                                        qVar2.f22850g[i44] = wVar11.x();
                                        long[] jArr = qVar2.f22849f;
                                        int i45 = i32;
                                        long j10 = qVar2.f22845b;
                                        jArr[i44] = j10;
                                        if ((iG3 & 1) != 0) {
                                            jArr[i44] = j10 + ((long) wVar11.g());
                                        }
                                        boolean z11 = (iG3 & 4) != 0;
                                        int iG4 = fVar5.f22758d;
                                        if (z11) {
                                            iG4 = wVar11.g();
                                        }
                                        boolean z12 = z11;
                                        boolean z13 = (iG3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
                                        boolean z14 = (iG3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
                                        boolean z15 = (iG3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
                                        boolean z16 = (iG3 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0;
                                        boolean z17 = z15;
                                        long[] jArr2 = oVar5.f22837h;
                                        int i46 = iG4;
                                        long[] jArr3 = oVar5.f22838i;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j11 = jArr2[0];
                                            if (j11 == 0 || e0.P(j11 + jArr3[0], 1000000L, oVar5.f22833d) >= oVar5.f22834e) {
                                                j7 = jArr3[0];
                                            }
                                        }
                                        int[] iArr = qVar2.f22851h;
                                        long[] jArr4 = qVar2.f22852i;
                                        boolean[] zArr2 = qVar2.j;
                                        boolean z18 = oVar5.f22831b == 2 && (i23 & 1) != 0;
                                        i32 = i45 + qVar2.f22850g[i44];
                                        long j12 = oVar5.f22832c;
                                        long j13 = qVar2.f22857p;
                                        int i47 = i45;
                                        while (i47 < i32) {
                                            int iG5 = z13 ? wVar11.g() : fVar5.f22756b;
                                            boolean z19 = z18;
                                            if (iG5 < 0) {
                                                throw h1.a("Unexpected negative value: " + iG5, null);
                                            }
                                            int iG6 = z14 ? wVar11.g() : fVar5.f22757c;
                                            if (iG6 < 0) {
                                                throw h1.a("Unexpected negative value: " + iG6, null);
                                            }
                                            int iG7 = z17 ? wVar11.g() : (i47 == 0 && z12) ? i46 : fVar5.f22758d;
                                            long jP = e0.P((((long) (z16 ? wVar11.g() : 0)) + j13) - j7, 1000000L, j12);
                                            jArr4[i47] = jP;
                                            if (!qVar2.f22858q) {
                                                jArr4[i47] = jP + hVar2.f22765d.f22866h;
                                            }
                                            iArr[i47] = iG6;
                                            zArr2[i47] = ((iG7 >> 16) & 1) == 0 && (!z19 || i47 == 0);
                                            j13 += (long) iG5;
                                            i47++;
                                            i32 = i32;
                                            z18 = z19;
                                            fVar5 = fVar5;
                                        }
                                        qVar2.f22857p = j13;
                                        i31 = i42;
                                    }
                                    aVar3 = aVar3;
                                    arrayList5 = arrayList5;
                                    i23 = i23;
                                    i10 = 1953658222;
                                    i30++;
                                    size4 = i41;
                                }
                            } else {
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                                i7 = i23;
                            }
                        } else {
                            size3 = size3;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i7 = i23;
                        }
                        i24++;
                        arrayList4 = arrayList2;
                        size3 = size3;
                        arrayList5 = arrayList3;
                        i23 = i7;
                    }
                    mc.i iVarA2 = a(arrayList5);
                    if (iVarA2 != null) {
                        int size6 = sparseArray.size();
                        for (int i48 = 0; i48 < size6; i48++) {
                            h hVar3 = (h) sparseArray.valueAt(i48);
                            o oVar6 = hVar3.f22765d.f22859a;
                            f fVar6 = hVar3.f22763b.f22844a;
                            int i49 = e0.f13788a;
                            int i50 = fVar6.f22755a;
                            p[] pVarArr2 = oVar6.k;
                            p pVar2 = pVarArr2 == null ? null : pVarArr2[i50];
                            mc.i iVarX = iVarA2.x(pVar2 != null ? pVar2.f22840b : null);
                            g0 g0VarA = hVar3.f22765d.f22859a.f22835f.a();
                            g0VarA.f9646n = iVarX;
                            hVar3.f22762a.e(new Format(g0VarA));
                        }
                    }
                    if (this.f22792w != -9223372036854775807L) {
                        int size7 = sparseArray.size();
                        for (int i51 = 0; i51 < size7; i51++) {
                            h hVar4 = (h) sparseArray.valueAt(i51);
                            long j14 = this.f22792w;
                            int i52 = hVar4.f22767f;
                            while (true) {
                                q qVar3 = hVar4.f22763b;
                                if (i52 >= qVar3.f22848e || qVar3.f22852i[i52] > j14) {
                                    break;
                                }
                                if (qVar3.j[i52]) {
                                    hVar4.f22770i = i52;
                                }
                                i52++;
                            }
                        }
                        this.f22792w = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((a) arrayDeque.peek()).f22743w.add(aVar);
                }
            }
        }
        this.f22785p = 0;
        this.f22788s = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws h1, EOFException, InterruptedIOException {
        ArrayDeque arrayDeque;
        b0 b0Var;
        String strP;
        String strP2;
        long j;
        long jA;
        long jP;
        long jV;
        long jY;
        long jY2;
        h hVar;
        char c8;
        int i7;
        ArrayDeque arrayDeque2;
        int iA;
        int i10;
        boolean z5;
        loop0: while (true) {
            while (true) {
                int i11 = this.f22785p;
                ArrayDeque arrayDeque3 = this.f22782m;
                SparseArray sparseArray = this.f22775d;
                char c10 = 2;
                if (i11 == 0) {
                    int i12 = this.f22788s;
                    w wVar = this.f22781l;
                    if (i12 == 0) {
                        if (!((pc.h) lVar).a(wVar.f13860a, 0, 8, true)) {
                            return -1;
                        }
                        this.f22788s = 8;
                        wVar.F(0);
                        this.f22787r = wVar.v();
                        this.f22786q = wVar.g();
                    }
                    long j5 = this.f22787r;
                    if (j5 == 1) {
                        ((pc.h) lVar).a(wVar.f13860a, 8, 8, false);
                        this.f22788s += 8;
                        this.f22787r = wVar.y();
                    } else if (j5 == 0) {
                        long j7 = ((pc.h) lVar).f17894i;
                        if (j7 == -1 && !arrayDeque3.isEmpty()) {
                            j7 = ((a) arrayDeque3.peek()).f22741i;
                        }
                        if (j7 != -1) {
                            this.f22787r = (j7 - ((pc.h) lVar).f17895v) + ((long) this.f22788s);
                        }
                    }
                    long j10 = this.f22787r;
                    int i13 = this.f22788s;
                    if (j10 < i13) {
                        throw h1.c("Atom size less than header length (unsupported).");
                    }
                    long j11 = ((pc.h) lVar).f17895v - ((long) i13);
                    int i14 = this.f22786q;
                    if ((i14 == 1836019558 || i14 == 1835295092) && !this.H) {
                        this.E.c(new pc.o(this.f22793x, j11));
                        this.H = true;
                    }
                    if (this.f22786q == 1836019558) {
                        int size = sparseArray.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            q qVar = ((h) sparseArray.valueAt(i15)).f22763b;
                            qVar.getClass();
                            qVar.f22846c = j11;
                            qVar.f22845b = j11;
                        }
                    }
                    int i16 = this.f22786q;
                    if (i16 == 1835295092) {
                        this.f22795z = null;
                        this.f22790u = j11 + this.f22787r;
                        this.f22785p = 2;
                        break;
                    }
                    if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1836019558 || i16 == 1953653094 || i16 == 1836475768 || i16 == 1701082227) {
                        long j12 = (((pc.h) lVar).f17895v + this.f22787r) - 8;
                        arrayDeque3.push(new a(i16, j12));
                        if (this.f22787r != this.f22788s) {
                            this.f22785p = 0;
                            this.f22788s = 0;
                            break;
                        }
                        c(j12);
                        break;
                    }
                    if (i16 != 1751411826 && i16 != 1835296868 && i16 != 1836476516 && i16 != 1936286840 && i16 != 1937011556 && i16 != 1937011827 && i16 != 1668576371 && i16 != 1937011555 && i16 != 1937011578 && i16 != 1937013298 && i16 != 1937007471 && i16 != 1668232756 && i16 != 1937011571 && i16 != 1952867444 && i16 != 1952868452 && i16 != 1953196132 && i16 != 1953654136 && i16 != 1953658222 && i16 != 1886614376 && i16 != 1935763834 && i16 != 1935763823 && i16 != 1936027235 && i16 != 1970628964 && i16 != 1935828848 && i16 != 1936158820 && i16 != 1701606260 && i16 != 1835362404 && i16 != 1701671783) {
                        if (this.f22787r > 2147483647L) {
                            throw h1.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f22789t = null;
                        this.f22785p = 1;
                        break;
                    }
                    if (this.f22788s != 8) {
                        throw h1.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f22787r > 2147483647L) {
                        throw h1.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    w wVar2 = new w((int) this.f22787r);
                    System.arraycopy(wVar.f13860a, 0, wVar2.f13860a, 0, 8);
                    this.f22789t = wVar2;
                    this.f22785p = 1;
                    break;
                }
                arrayDeque = this.f22783n;
                b0Var = this.j;
                if (i11 == 1) {
                    int i17 = ((int) this.f22787r) - this.f22788s;
                    w wVar3 = this.f22789t;
                    if (wVar3 != null) {
                        ((pc.h) lVar).a(wVar3.f13860a, 8, i17, false);
                        int i18 = this.f22786q;
                        b bVar = new b(i18, wVar3);
                        long j13 = ((pc.h) lVar).f17895v;
                        if (!arrayDeque3.isEmpty()) {
                            ((a) arrayDeque3.peek()).f22742v.add(bVar);
                        } else if (i18 == 1936286840) {
                            wVar3.F(8);
                            int iD = lc.a.d(wVar3.g());
                            wVar3.G(4);
                            long jV2 = wVar3.v();
                            if (iD == 0) {
                                jY = wVar3.v();
                                jY2 = wVar3.v();
                            } else {
                                jY = wVar3.y();
                                jY2 = wVar3.y();
                            }
                            long j14 = jY2 + j13;
                            long j15 = jY;
                            long jP2 = e0.P(j15, 1000000L, jV2);
                            wVar3.G(2);
                            int iZ = wVar3.z();
                            int[] iArr = new int[iZ];
                            long[] jArr = new long[iZ];
                            long[] jArr2 = new long[iZ];
                            long[] jArr3 = new long[iZ];
                            long jP3 = jP2;
                            long j16 = j15;
                            int i19 = 0;
                            while (i19 < iZ) {
                                int iG = wVar3.g();
                                if ((iG & Integer.MIN_VALUE) != 0) {
                                    throw h1.a("Unhandled indirect reference", null);
                                }
                                long jV3 = wVar3.v();
                                iArr[i19] = iG & Integer.MAX_VALUE;
                                jArr[i19] = j14;
                                jArr3[i19] = jP3;
                                long j17 = j16 + jV3;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int i20 = i19;
                                jP3 = e0.P(j17, 1000000L, jV2);
                                jArr4[i20] = jP3 - jArr5[i20];
                                wVar3.G(4);
                                j14 += (long) iArr[i20];
                                jArr2 = jArr4;
                                jArr3 = jArr5;
                                i19 = i20 + 1;
                                jP2 = jP2;
                                j16 = j17;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jP2), new pc.g(iArr, jArr, jArr2, jArr3));
                            this.f22794y = ((Long) pairCreate.first).longValue();
                            this.E.c((u) pairCreate.second);
                            this.H = true;
                        } else if (i18 == 1701671783 && this.F.length != 0) {
                            wVar3.F(8);
                            int iD2 = lc.a.d(wVar3.g());
                            if (iD2 == 0) {
                                strP = wVar3.p();
                                strP.getClass();
                                strP2 = wVar3.p();
                                strP2.getClass();
                                long jV4 = wVar3.v();
                                long jP4 = e0.P(wVar3.v(), 1000000L, jV4);
                                long j18 = this.f22794y;
                                long j19 = j18 != -9223372036854775807L ? j18 + jP4 : -9223372036854775807L;
                                j = jP4;
                                jA = j19;
                                jP = e0.P(wVar3.v(), 1000L, jV4);
                                jV = wVar3.v();
                            } else if (iD2 != 1) {
                                com.discord.chat.presentation.list.a.q(iD2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jV5 = wVar3.v();
                                jA = e0.P(wVar3.y(), 1000000L, jV5);
                                long jP5 = e0.P(wVar3.v(), 1000L, jV5);
                                long jV6 = wVar3.v();
                                strP = wVar3.p();
                                strP.getClass();
                                strP2 = wVar3.p();
                                strP2.getClass();
                                jP = jP5;
                                jV = jV6;
                                j = -9223372036854775807L;
                            }
                            String str = strP;
                            String str2 = strP2;
                            byte[] bArr = new byte[wVar3.a()];
                            wVar3.e(bArr, 0, wVar3.a());
                            w wVar4 = new w(this.k.A(new ed.a(str, str2, jP, jV, bArr)));
                            int iA2 = wVar4.a();
                            for (x xVar : this.F) {
                                wVar4.F(0);
                                xVar.d(iA2, wVar4);
                            }
                            if (jA == -9223372036854775807L) {
                                arrayDeque.addLast(new g(iA2, j, true));
                                this.f22791v += iA2;
                            } else if (!arrayDeque.isEmpty()) {
                                arrayDeque.addLast(new g(iA2, jA, false));
                                this.f22791v += iA2;
                            } else if (b0Var == null || b0Var.d()) {
                                if (b0Var != null) {
                                    jA = b0Var.a(jA);
                                }
                                long j20 = jA;
                                for (x xVar2 : this.F) {
                                    xVar2.c(j20, 1, iA2, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new g(iA2, jA, false));
                                this.f22791v += iA2;
                            }
                        }
                    } else {
                        ((pc.h) lVar).u(i17);
                    }
                    c(((pc.h) lVar).f17895v);
                    break;
                }
                long j21 = LongCompanionObject.MAX_VALUE;
                if (i11 != 2) {
                    hVar = this.f22795z;
                    if (hVar != null) {
                        c8 = 2;
                        i7 = 8;
                        break loop0;
                    }
                    int size2 = sparseArray.size();
                    long j22 = Long.MAX_VALUE;
                    h hVar2 = null;
                    int i21 = 0;
                    while (i21 < size2) {
                        char c11 = c10;
                        h hVar3 = (h) sparseArray.valueAt(i21);
                        boolean z6 = hVar3.f22771l;
                        q qVar2 = hVar3.f22763b;
                        if ((z6 || hVar3.f22767f != hVar3.f22765d.f22860b) && (!z6 || hVar3.f22769h != qVar2.f22847d)) {
                            long j23 = !z6 ? hVar3.f22765d.f22861c[hVar3.f22767f] : qVar2.f22849f[hVar3.f22769h];
                            if (j23 < j22) {
                                hVar2 = hVar3;
                                j22 = j23;
                            }
                        }
                        i21++;
                        c10 = c11;
                    }
                    c8 = c10;
                    i7 = 8;
                    if (hVar2 != null) {
                        int i22 = (int) ((!hVar2.f22771l ? hVar2.f22765d.f22861c[hVar2.f22767f] : hVar2.f22763b.f22849f[hVar2.f22769h]) - ((pc.h) lVar).f17895v);
                        if (i22 < 0) {
                            je.b.N("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i22 = 0;
                        }
                        ((pc.h) lVar).u(i22);
                        this.f22795z = hVar2;
                        hVar = hVar2;
                        break loop0;
                    }
                    int i23 = (int) (this.f22790u - ((pc.h) lVar).f17895v);
                    if (i23 < 0) {
                        throw h1.a("Offset to end of mdat was negative.", null);
                    }
                    ((pc.h) lVar).u(i23);
                    this.f22785p = 0;
                    this.f22788s = 0;
                } else {
                    int size3 = sparseArray.size();
                    h hVar4 = null;
                    for (int i24 = 0; i24 < size3; i24++) {
                        q qVar3 = ((h) sparseArray.valueAt(i24)).f22763b;
                        if (qVar3.f22856o) {
                            long j24 = qVar3.f22846c;
                            if (j24 < j21) {
                                hVar4 = (h) sparseArray.valueAt(i24);
                                j21 = j24;
                            }
                        }
                    }
                    if (hVar4 == null) {
                        this.f22785p = 3;
                    } else {
                        int i25 = (int) (j21 - ((pc.h) lVar).f17895v);
                        if (i25 < 0) {
                            throw h1.a("Offset to encryption data was negative.", null);
                        }
                        pc.h hVar5 = (pc.h) lVar;
                        hVar5.u(i25);
                        q qVar4 = hVar4.f22763b;
                        w wVar5 = qVar4.f22855n;
                        hVar5.a(wVar5.f13860a, 0, wVar5.f13862c, false);
                        wVar5.F(0);
                        qVar4.f22856o = false;
                    }
                }
            }
        }
        q qVar5 = hVar.f22763b;
        if (this.f22785p == 3) {
            int i26 = !hVar.f22771l ? hVar.f22765d.f22862d[hVar.f22767f] : qVar5.f22851h[hVar.f22767f];
            this.A = i26;
            if (hVar.f22767f < hVar.f22770i) {
                ((pc.h) lVar).u(i26);
                p pVarA = hVar.a();
                if (pVarA != null) {
                    w wVar6 = qVar5.f22855n;
                    int i27 = pVarA.f22842d;
                    if (i27 != 0) {
                        wVar6.G(i27);
                    }
                    int i28 = hVar.f22767f;
                    if (qVar5.k && qVar5.f22853l[i28]) {
                        wVar6.G(wVar6.z() * 6);
                    }
                }
                if (!hVar.b()) {
                    this.f22795z = null;
                }
                this.f22785p = 3;
                return 0;
            }
            if (hVar.f22765d.f22859a.f22836g == 1) {
                this.A = i26 - 8;
                ((pc.h) lVar).u(i7);
            }
            if ("audio/ac4".equals(hVar.f22765d.f22859a.f22835f.I)) {
                this.B = hVar.c(this.A, 7);
                int i29 = this.A;
                w wVar7 = this.f22780i;
                ic.a.d(i29, wVar7);
                hVar.f22762a.d(7, wVar7);
                this.B += 7;
            } else {
                this.B = hVar.c(this.A, 0);
            }
            this.A += this.B;
            this.f22785p = 4;
            this.C = 0;
        }
        r rVar = hVar.f22765d;
        o oVar = rVar.f22859a;
        x xVar3 = hVar.f22762a;
        long jA2 = hVar.f22771l ? qVar5.f22852i[hVar.f22767f] : rVar.f22864f[hVar.f22767f];
        if (b0Var != null) {
            jA2 = b0Var.a(jA2);
        }
        int i30 = oVar.j;
        Format format = oVar.f22835f;
        if (i30 == 0) {
            arrayDeque2 = arrayDeque;
            while (true) {
                int i31 = this.B;
                int i32 = this.A;
                if (i31 >= i32) {
                    break;
                }
                this.B += xVar3.a(lVar, i32 - i31, false);
            }
        } else {
            w wVar8 = this.f22777f;
            byte[] bArr2 = wVar8.f13860a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[c8] = 0;
            int i33 = i30 + 1;
            int i34 = 4 - i30;
            while (this.B < this.A) {
                int i35 = this.C;
                if (i35 == 0) {
                    ((pc.h) lVar).a(bArr2, i34, i33, false);
                    wVar8.F(0);
                    int iG2 = wVar8.g();
                    if (iG2 < 1) {
                        throw h1.a("Invalid NAL length", null);
                    }
                    this.C = iG2 - 1;
                    w wVar9 = this.f22776e;
                    wVar9.F(0);
                    xVar3.d(4, wVar9);
                    xVar3.d(1, wVar8);
                    if (this.G.length > 0) {
                        String str3 = format.I;
                        byte b10 = bArr2[4];
                        if ("video/avc".equals(str3)) {
                            i10 = i34;
                            if ((b10 & 31) != 6) {
                            }
                            z5 = true;
                            this.D = z5;
                            this.B += 5;
                            this.A += i10;
                            i34 = i10;
                        } else {
                            i10 = i34;
                        }
                        if ("video/hevc".equals(str3) && ((b10 & 126) >> 1) == 39) {
                            z5 = true;
                        }
                        this.D = z5;
                        this.B += 5;
                        this.A += i10;
                        i34 = i10;
                    } else {
                        i10 = i34;
                    }
                    z5 = false;
                    this.D = z5;
                    this.B += 5;
                    this.A += i10;
                    i34 = i10;
                } else {
                    int i36 = i34;
                    if (this.D) {
                        w wVar10 = this.f22778g;
                        wVar10.C(i35);
                        ((pc.h) lVar).a(wVar10.f13860a, 0, this.C, false);
                        xVar3.d(this.C, wVar10);
                        iA = this.C;
                        int iM = je.b.M(wVar10.f13860a, wVar10.f13862c);
                        wVar10.F("video/hevc".equals(format.I) ? 1 : 0);
                        wVar10.E(iM);
                        xr.m.f(jA2, wVar10, this.G);
                    } else {
                        iA = xVar3.a(lVar, i35, false);
                    }
                    this.B += iA;
                    this.C -= iA;
                    i34 = i36;
                    i33 = i33;
                    wVar8 = wVar8;
                }
                arrayDeque = arrayDeque;
            }
            arrayDeque2 = arrayDeque;
        }
        int i37 = hVar.f22771l ? qVar5.j[hVar.f22767f] ? 1 : 0 : hVar.f22765d.f22865g[hVar.f22767f];
        if (hVar.a() != null) {
            i37 |= 1073741824;
        }
        int i38 = i37;
        p pVarA2 = hVar.a();
        long j25 = jA2;
        xVar3.c(j25, i38, this.A, 0, pVarA2 != null ? pVarA2.f22841c : null);
        while (!arrayDeque2.isEmpty()) {
            g gVar = (g) arrayDeque2.removeFirst();
            this.f22791v -= gVar.f22761c;
            long jA3 = gVar.f22759a;
            if (gVar.f22760b) {
                jA3 += j25;
            }
            if (b0Var != null) {
                jA3 = b0Var.a(jA3);
            }
            long j26 = jA3;
            for (x xVar4 : this.F) {
                xVar4.c(j26, 1, gVar.f22761c, this.f22791v, null);
            }
        }
        if (!hVar.b()) {
            this.f22795z = null;
        }
        this.f22785p = 3;
        return 0;
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        int i7;
        this.E = mVar;
        this.f22785p = 0;
        this.f22788s = 0;
        x[] xVarArr = new x[2];
        this.F = xVarArr;
        x xVar = this.f22784o;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i10 = 100;
        if ((this.f22772a & 4) != 0) {
            xVarArr[i7] = mVar.x(100, 5);
            i10 = 101;
            i7++;
        }
        x[] xVarArr2 = (x[]) e0.K(i7, this.F);
        this.F = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.e(J);
        }
        List list = this.f22774c;
        this.G = new x[list.size()];
        int i11 = 0;
        while (i11 < this.G.length) {
            x xVarX = this.E.x(i10, 3);
            xVarX.e((Format) list.get(i11));
            this.G[i11] = xVarX;
            i11++;
            i10++;
        }
        o oVar = this.f22773b;
        if (oVar != null) {
            this.f22775d.put(0, new h(mVar.x(0, oVar.f22831b), new r(this.f22773b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new f(0, 0, 0, 0)));
            this.E.q();
        }
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) {
        return j.j(lVar, true, false);
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        SparseArray sparseArray = this.f22775d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((h) sparseArray.valueAt(i7)).d();
        }
        this.f22783n.clear();
        this.f22791v = 0;
        this.f22792w = j5;
        this.f22782m.clear();
        this.f22785p = 0;
        this.f22788s = 0;
    }

    @Override // pc.k
    public final void release() {
    }
}
