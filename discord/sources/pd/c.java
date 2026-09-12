package pd;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import gc.g0;
import gc.q1;
import hc.c0;
import he.l0;
import he.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import mc.s;
import md.n0;
import md.o0;
import md.p0;
import md.q;
import md.q0;
import md.x0;
import md.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements q, p0, od.g {
    public static final Pattern U = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern V = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final l0 E;
    public final he.q F;
    public final y0 G;
    public final b[] H;
    public final i8.c I;
    public final p J;
    public final a1.d L;
    public final mc.n M;
    public md.p N;
    public u4.b Q;
    public qd.c R;
    public int S;
    public List T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17951e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u0 f17952i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f17953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o9.d f17954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4.i f17955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f17956y;
    public od.h[] O = new od.h[0];
    public m[] P = new m[0];
    public final IdentityHashMap K = new IdentityHashMap();

    public c(int i7, qd.c cVar, e4.i iVar, int i10, i iVar2, u0 u0Var, s sVar, mc.n nVar, o9.d dVar, a1.d dVar2, long j, l0 l0Var, he.q qVar, i8.c cVar2, op.c cVar3, c0 c0Var) {
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        Format[] formatArrF;
        qd.f fVarB;
        Integer num;
        this.f17950d = i7;
        this.R = cVar;
        this.f17955x = iVar;
        this.S = i10;
        this.f17951e = iVar2;
        this.f17952i = u0Var;
        this.f17953v = sVar;
        this.M = nVar;
        this.f17954w = dVar;
        this.L = dVar2;
        this.f17956y = j;
        this.E = l0Var;
        this.F = qVar;
        this.I = cVar2;
        this.J = new p(cVar, cVar3, qVar);
        int i13 = 0;
        od.h[] hVarArr = this.O;
        cVar2.getClass();
        this.Q = new u4.b(24, hVarArr);
        qd.h hVarB = cVar.b(i10);
        List list = hVarB.f18749d;
        this.T = list;
        List list2 = hVarB.f18748c;
        int size = list2.size();
        HashMap map = new HashMap(ei.p.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            map.put(Long.valueOf(((qd.a) list2.get(i14)).f18705a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            qd.a aVar = (qd.a) list2.get(i15);
            List list3 = aVar.f18709e;
            List list4 = aVar.f18710f;
            qd.f fVarB2 = b("http://dashif.org/guidelines/trickmode", list3);
            fVarB2 = fVarB2 == null ? b("http://dashif.org/guidelines/trickmode", list4) : fVarB2;
            int iIntValue = (fVarB2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarB2.f18740b)))) == null) ? i15 : num.intValue();
            if (iIntValue == i15 && (fVarB = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarB.f18740b;
                int i16 = e0.f13788a;
                for (String str2 : str.split(",", -1)) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str2)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArrP = mo.c0.P((Collection) arrayList.get(i17));
            iArr2[i17] = iArrP;
            Arrays.sort(iArrP);
        }
        boolean[] zArr2 = new boolean[size2];
        Format[][] formatArr = new Format[size2][];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length = iArr3.length;
            int i20 = i13;
            while (i20 < length) {
                List list7 = ((qd.a) list2.get(iArr3[i20])).f18707c;
                for (int i21 = i13; i21 < list7.size(); i21++) {
                    if (!((qd.m) list7.get(i21)).f18762v.isEmpty()) {
                        zArr2[i18] = true;
                        i19++;
                        break;
                    }
                }
                i20++;
                i13 = 0;
            }
            int[] iArr4 = iArr2[i18];
            int length2 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    iArr = iArr2;
                    zArr = zArr2;
                    formatArrF = new Format[0];
                    break;
                }
                int i23 = iArr4[i22];
                qd.a aVar2 = (qd.a) list2.get(i23);
                List list8 = ((qd.a) list2.get(i23)).f18708d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    qd.f fVar = (qd.f) list8.get(i24);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f18739a)) {
                        g0 g0Var = new g0();
                        g0Var.k = "application/cea-608";
                        g0Var.f9635a = a3.e.n(new StringBuilder(), aVar2.f18705a, ":cea608");
                        formatArrF = f(fVar, U, new Format(g0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f18739a)) {
                        g0 g0Var2 = new g0();
                        g0Var2.k = "application/cea-708";
                        g0Var2.f9635a = a3.e.n(new StringBuilder(), aVar2.f18705a, ":cea708");
                        formatArrF = f(fVar, V, new Format(g0Var2));
                        break;
                    }
                    i24++;
                    iArr2 = iArr;
                    zArr2 = zArr;
                }
                i22++;
                iArr4 = iArr5;
            }
            formatArr[i18] = formatArrF;
            if (formatArrF.length != 0) {
                i19++;
            }
            i18++;
            iArr2 = iArr;
            zArr2 = zArr;
            i13 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i19 + size2;
        x0[] x0VarArr = new x0[size3];
        b[] bVarArr = new b[size3];
        int i25 = 0;
        int i26 = 0;
        while (i25 < size2) {
            int[] iArr7 = iArr6[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((qd.a) list2.get(i27)).f18707c);
            }
            int size4 = arrayList3.size();
            Format[] formatArr2 = new Format[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                Format format = ((qd.m) arrayList3.get(i28)).f18759d;
                Format[][] formatArr3 = formatArr;
                int iB = sVar.b(format);
                g0 g0VarA = format.a();
                g0VarA.F = iB;
                formatArr2[i28] = new Format(g0VarA);
                i28++;
                size2 = i29;
                formatArr = formatArr3;
            }
            int i30 = size2;
            Format[][] formatArr4 = formatArr;
            qd.a aVar3 = (qd.a) list2.get(iArr7[0]);
            long j5 = aVar3.f18705a;
            String string = j5 != -1 ? Long.toString(j5) : kk.b.h(i25, "unset:");
            int i31 = i26 + 1;
            if (zArr3[i25]) {
                i11 = i26 + 2;
            } else {
                i11 = i31;
                i31 = -1;
            }
            if (formatArr4[i25].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            List list9 = list2;
            x0VarArr[i26] = new x0(string, formatArr2);
            int i32 = i26;
            bVarArr[i32] = new b(aVar3.f18706b, 0, iArr7, i32, i31, i11, -1);
            int i33 = -1;
            if (i31 != -1) {
                String strJ = kk.b.j(string, ":emsg");
                g0 g0Var3 = new g0();
                g0Var3.f9635a = strJ;
                g0Var3.k = "application/x-emsg";
                x0VarArr[i31] = new x0(strJ, new Format(g0Var3));
                bVarArr[i31] = new b(5, 1, iArr7, i32, -1, -1, -1);
                i33 = -1;
            }
            if (i11 != i33) {
                x0VarArr[i11] = new x0(kk.b.j(string, ":cc"), formatArr4[i25]);
                bVarArr[i11] = new b(3, 1, iArr7, i32, -1, -1, -1);
            }
            i25++;
            size2 = i30;
            i26 = i12;
            formatArr = formatArr4;
            list2 = list9;
        }
        int i34 = 0;
        while (i34 < list.size()) {
            qd.g gVar = (qd.g) list.get(i34);
            g0 g0Var4 = new g0();
            g0Var4.f9635a = gVar.a();
            g0Var4.k = "application/x-emsg";
            x0VarArr[i26] = new x0(gVar.a() + ":" + i34, new Format(g0Var4));
            bVarArr[i26] = new b(5, 2, new int[0], -1, -1, -1, i34);
            i34++;
            i26++;
        }
        Pair pairCreate = Pair.create(new y0(x0VarArr), bVarArr);
        this.G = (y0) pairCreate.first;
        this.H = (b[]) pairCreate.second;
    }

    public static qd.f b(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            qd.f fVar = (qd.f) list.get(i7);
            if (str.equals(fVar.f18739a)) {
                return fVar;
            }
        }
        return null;
    }

    public static Format[] f(qd.f fVar, Pattern pattern, Format format) {
        String str = fVar.f18740b;
        if (str == null) {
            return new Format[]{format};
        }
        int i7 = e0.f13788a;
        String[] strArrSplit = str.split(";", -1);
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            g0 g0VarA = format.a();
            g0VarA.f9635a = format.f5524d + ":" + i11;
            g0VarA.C = i11;
            g0VarA.f9637c = matcher.group(2);
            formatArr[i10] = new Format(g0VarA);
        }
        return formatArr;
    }

    @Override // md.q0
    public final boolean C() {
        return this.Q.C();
    }

    @Override // md.q
    public final long I() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0249  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) throws Throwable {
        int i7;
        boolean z5;
        int[] iArr;
        int i10;
        int[] iArr2;
        boolean z6;
        ?? r6;
        x0 x0VarA;
        x0 x0VarA2;
        int i11;
        int i12;
        o oVar;
        boolean z7;
        int[] iArr3 = new int[pVarArr.length];
        int i13 = 0;
        while (true) {
            i7 = -1;
            if (i13 >= pVarArr.length) {
                break;
            }
            fe.p pVar = pVarArr[i13];
            if (pVar != null) {
                iArr3[i13] = this.G.b(pVar.c());
            } else {
                iArr3[i13] = -1;
            }
            i13++;
        }
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            if (pVarArr[i14] == null || !zArr[i14]) {
                o0 o0Var = o0VarArr[i14];
                if (o0Var instanceof od.h) {
                    ((od.h) o0Var).q(this);
                } else if (o0Var instanceof od.f) {
                    od.f fVar = (od.f) o0Var;
                    od.h hVar = fVar.f17232w;
                    boolean[] zArr3 = hVar.f17236v;
                    int i15 = fVar.f17230i;
                    je.b.k(zArr3[i15]);
                    hVar.f17236v[i15] = false;
                }
                o0VarArr[i14] = null;
            }
        }
        int i16 = 0;
        while (true) {
            z5 = true;
            if (i16 >= pVarArr.length) {
                break;
            }
            o0 o0Var2 = o0VarArr[i16];
            if ((o0Var2 instanceof md.i) || (o0Var2 instanceof od.f)) {
                int iE = e(i16, iArr3);
                if (iE == -1) {
                    z7 = o0VarArr[i16] instanceof md.i;
                } else {
                    o0 o0Var3 = o0VarArr[i16];
                    z7 = (o0Var3 instanceof od.f) && ((od.f) o0Var3).f17228d == o0VarArr[iE];
                }
                if (!z7) {
                    o0 o0Var4 = o0VarArr[i16];
                    if (o0Var4 instanceof od.f) {
                        od.f fVar2 = (od.f) o0Var4;
                        od.h hVar2 = fVar2.f17232w;
                        boolean[] zArr4 = hVar2.f17236v;
                        int i17 = fVar2.f17230i;
                        je.b.k(zArr4[i17]);
                        hVar2.f17236v[i17] = false;
                    }
                    o0VarArr[i16] = null;
                }
            }
            i16++;
        }
        int i18 = 0;
        while (i18 < pVarArr.length) {
            fe.p pVar2 = pVarArr[i18];
            if (pVar2 == null) {
                i10 = i18;
                iArr2 = iArr3;
                z6 = z5;
            } else {
                o0 o0Var5 = o0VarArr[i18];
                if (o0Var5 == null) {
                    zArr2[i18] = z5;
                    b bVar = this.H[iArr3[i18]];
                    int i19 = bVar.f17945c;
                    if (i19 == 0) {
                        int i20 = bVar.f17948f;
                        boolean z10 = i20 != i7 ? z5 : false;
                        if (z10) {
                            x0VarA = this.G.a(i20);
                            r6 = z5;
                        } else {
                            r6 = 0;
                            x0VarA = null;
                        }
                        int i21 = bVar.f17949g;
                        boolean z11 = i21 != i7 ? z5 : false;
                        if (z11) {
                            x0VarA2 = this.G.a(i21);
                            i11 = r6 + x0VarA2.f15727d;
                        } else {
                            x0VarA2 = null;
                            i11 = r6;
                        }
                        boolean z12 = z5;
                        Format[] formatArr = new Format[i11];
                        int[] iArr4 = new int[i11];
                        if (z10) {
                            formatArr[0] = x0VarA.f15730v[0];
                            iArr4[0] = 5;
                            i12 = z12 ? 1 : 0;
                        } else {
                            i12 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z11) {
                            for (int i22 = 0; i22 < x0VarA2.f15727d; i22++) {
                                Format format = x0VarA2.f15730v[i22];
                                formatArr[i12] = format;
                                iArr4[i12] = 3;
                                arrayList.add(format);
                                i12 += z12 ? 1 : 0;
                            }
                        }
                        if (this.R.f18718d && z10) {
                            p pVar3 = this.J;
                            oVar = new o(pVar3, pVar3.f18011d);
                        } else {
                            oVar = null;
                        }
                        a aVar = this.f17951e;
                        l0 l0Var = this.E;
                        qd.c cVar = this.R;
                        e4.i iVar = this.f17955x;
                        int i23 = this.S;
                        int[] iArr5 = bVar.f17943a;
                        int i24 = bVar.f17944b;
                        long j5 = this.f17956y;
                        i10 = i18;
                        u0 u0Var = this.f17952i;
                        DataSource dataSourceCreateDataSource = ((i) aVar).f17977a.createDataSource();
                        if (u0Var != null) {
                            dataSourceCreateDataSource.B(u0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr3;
                        z6 = true;
                        od.h hVar3 = new od.h(bVar.f17944b, iArr4, formatArr, new l(l0Var, cVar, iVar, i23, iArr5, pVar2, i24, dataSourceCreateDataSource, j5, z10, arrayList, oVar), this, this.F, j, this.f17953v, this.M, this.f17954w, this.L);
                        synchronized (this) {
                            this.K.put(hVar3, oVar2);
                        }
                        o0VarArr[i10] = hVar3;
                    } else {
                        i10 = i18;
                        iArr2 = iArr3;
                        z6 = z5;
                        if (i19 == 2) {
                            o0VarArr[i10] = new m((qd.g) this.T.get(bVar.f17946d), pVar2.c().f15730v[0], this.R.f18718d);
                        }
                    }
                } else {
                    i10 = i18;
                    iArr2 = iArr3;
                    z6 = z5;
                    if (o0Var5 instanceof od.h) {
                        ((l) ((od.h) o0Var5).f17237w).f17994i = pVar2;
                    }
                }
            }
            i18 = i10 + 1;
            z5 = z6;
            iArr3 = iArr2;
            i7 = -1;
        }
        int[] iArr6 = iArr3;
        boolean z13 = z5;
        int i25 = 0;
        while (i25 < pVarArr.length) {
            if (o0VarArr[i25] != null || pVarArr[i25] == null) {
                iArr = iArr6;
            } else {
                b bVar2 = this.H[iArr6[i25]];
                if (bVar2.f17945c == z13) {
                    iArr = iArr6;
                    int iE2 = e(i25, iArr);
                    if (iE2 == -1) {
                        o0VarArr[i25] = new md.i();
                    } else {
                        od.h hVar4 = (od.h) o0VarArr[iE2];
                        int i26 = bVar2.f17944b;
                        boolean[] zArr5 = hVar4.f17236v;
                        n0[] n0VarArr = hVar4.K;
                        int i27 = 0;
                        while (true) {
                            if (i27 >= n0VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (hVar4.f17234e[i27] == i26) {
                                je.b.k(zArr5[i27] ^ z13);
                                zArr5[i27] = z13;
                                n0VarArr[i27].y(j, z13);
                                o0VarArr[i25] = new od.f(hVar4, hVar4, n0VarArr[i27], i27);
                                break;
                            }
                            i27++;
                        }
                    }
                } else {
                    iArr = iArr6;
                }
            }
            i25++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (o0 o0Var6 : o0VarArr) {
            if (o0Var6 instanceof od.h) {
                arrayList2.add((od.h) o0Var6);
            } else if (o0Var6 instanceof m) {
                arrayList3.add((m) o0Var6);
            }
        }
        od.h[] hVarArr = new od.h[arrayList2.size()];
        this.O = hVarArr;
        arrayList2.toArray(hVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.P = mVarArr;
        arrayList3.toArray(mVarArr);
        i8.c cVar2 = this.I;
        od.h[] hVarArr2 = this.O;
        cVar2.getClass();
        this.Q = new u4.b(24, hVarArr2);
        return j;
    }

    @Override // md.q
    public final y0 Q() {
        return this.G;
    }

    @Override // md.q0
    public final long S() {
        return this.Q.S();
    }

    @Override // md.q0
    public final void W(long j) {
        this.Q.W(j);
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        for (od.h hVar : this.O) {
            if (hVar.f17233d == 2) {
                return hVar.f17237w.a(j, q1Var);
            }
        }
        return j;
    }

    @Override // md.p0
    public final void c(q0 q0Var) {
        this.N.c(this);
    }

    public final int e(int i7, int[] iArr) {
        int i10 = iArr[i7];
        if (i10 != -1) {
            b[] bVarArr = this.H;
            int i11 = bVarArr[i10].f17947e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && bVarArr[i13].f17945c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // md.q0
    public final long k() {
        return this.Q.k();
    }

    @Override // md.q
    public final void l(md.p pVar, long j) {
        this.N = pVar;
        pVar.d(this);
    }

    @Override // md.q
    public final void r() {
        this.E.b();
    }

    @Override // md.q
    public final long v(long j) {
        for (od.h hVar : this.O) {
            hVar.s(j);
        }
        for (m mVar : this.P) {
            int iB = e0.b(mVar.f17999i, j, true);
            mVar.f18003y = iB;
            mVar.E = (mVar.f18000v && iB == mVar.f17999i.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // md.q
    public final void w(long j) {
        for (od.h hVar : this.O) {
            hVar.w(j);
        }
    }

    @Override // md.q0
    public final boolean z(long j) {
        return this.Q.z(j);
    }
}
