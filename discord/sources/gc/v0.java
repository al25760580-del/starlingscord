package gc;

import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final md.o0[] f9895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f9898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f9900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e[] f9901i;
    public final fe.r j;
    public final g1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v0 f9902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public md.y0 f9903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fe.u f9904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9905o;

    public v0(e[] eVarArr, long j, fe.r rVar, he.q qVar, g1 g1Var, w0 w0Var, fe.u uVar) {
        this.f9901i = eVarArr;
        this.f9905o = j;
        this.j = rVar;
        this.k = g1Var;
        md.s sVar = w0Var.f9917a;
        this.f9894b = sVar.f15689a;
        this.f9898f = w0Var;
        this.f9903m = md.y0.f15735v;
        this.f9904n = uVar;
        this.f9895c = new md.o0[eVarArr.length];
        this.f9900h = new boolean[eVarArr.length];
        long j5 = w0Var.f9918b;
        long j7 = w0Var.f9920d;
        g1Var.getClass();
        Object obj = sVar.f15689a;
        int i7 = n1.H;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        md.s sVarB = sVar.b(pair.second);
        f1 f1Var = (f1) ((HashMap) g1Var.f9663e).get(obj2);
        f1Var.getClass();
        ((HashSet) g1Var.f9666h).add(f1Var);
        e1 e1Var = (e1) ((HashMap) g1Var.f9664f).get(f1Var);
        if (e1Var != null) {
            e1Var.f9625a.f(e1Var.f9626b);
        }
        f1Var.f9632c.add(sVarB);
        md.q qVarB = f1Var.f9630a.b(sVarB, qVar, j5);
        ((IdentityHashMap) g1Var.f9662d).put(qVarB, f1Var);
        g1Var.d();
        this.f9893a = j7 != -9223372036854775807L ? new md.d(qVarB, j7) : qVarB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, md.q] */
    public final long a(fe.u uVar, long j, boolean z5, boolean[] zArr) {
        e[] eVarArr;
        md.o0[] o0VarArr;
        int i7 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 >= uVar.f9145a) {
                break;
            }
            if (z5 || !uVar.a(this.f9904n, i7)) {
                z6 = false;
            }
            this.f9900h[i7] = z6;
            i7++;
        }
        int i10 = 0;
        while (true) {
            eVarArr = this.f9901i;
            int length = eVarArr.length;
            o0VarArr = this.f9895c;
            if (i10 >= length) {
                break;
            }
            if (eVarArr[i10].f9602e == -2) {
                o0VarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f9904n = uVar;
        c();
        long jP = this.f9893a.P(uVar.f9147c, this.f9900h, this.f9895c, zArr, j);
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            if (eVarArr[i11].f9602e == -2 && this.f9904n.b(i11)) {
                o0VarArr[i11] = new md.i();
            }
        }
        this.f9897e = false;
        for (int i12 = 0; i12 < o0VarArr.length; i12++) {
            if (o0VarArr[i12] != null) {
                je.b.k(uVar.b(i12));
                if (eVarArr[i12].f9602e != -2) {
                    this.f9897e = true;
                }
            } else {
                je.b.k(uVar.f9147c[i12] == null);
            }
        }
        return jP;
    }

    public final void b() {
        if (this.f9902l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            fe.u uVar = this.f9904n;
            if (i7 >= uVar.f9145a) {
                return;
            }
            boolean zB = uVar.b(i7);
            fe.p pVar = this.f9904n.f9147c[i7];
            if (zB && pVar != null) {
                pVar.disable();
            }
            i7++;
        }
    }

    public final void c() {
        if (this.f9902l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            fe.u uVar = this.f9904n;
            if (i7 >= uVar.f9145a) {
                return;
            }
            boolean zB = uVar.b(i7);
            fe.p pVar = this.f9904n.f9147c[i7];
            if (zB && pVar != null) {
                pVar.enable();
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, md.q0] */
    public final long d() {
        if (!this.f9896d) {
            return this.f9898f.f9918b;
        }
        long jS = this.f9897e ? this.f9893a.S() : Long.MIN_VALUE;
        return jS == Long.MIN_VALUE ? this.f9898f.f9921e : jS;
    }

    public final long e() {
        return this.f9898f.f9918b + this.f9905o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, md.q] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f() {
        b();
        ?? r5 = this.f9893a;
        try {
            boolean z5 = r5 instanceof md.d;
            g1 g1Var = this.k;
            if (z5) {
                g1Var.h(((md.d) r5).f15598d);
            } else {
                g1Var.h(r5);
            }
        } catch (RuntimeException e10) {
            je.b.s("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x032d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final fe.u g(float f2, Timeline timeline) {
        com.google.android.exoplayer2.trackselection.a aVar;
        int i7;
        boolean z5;
        String str;
        long j;
        boolean z6;
        ei.r0 r0VarR;
        int i10;
        boolean z7;
        int i11;
        fe.p bVar;
        Object[] objArrCopyOf;
        long j5;
        he.g gVar;
        int[] iArr;
        int i12;
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo;
        Object obj;
        fe.o oVar;
        int i13;
        md.x0 x0Var;
        md.y0 y0Var;
        fe.j jVar;
        int[] iArr2;
        fe.r rVar = this.j;
        e[] eVarArr = this.f9901i;
        md.y0 y0Var2 = this.f9903m;
        rVar.getClass();
        int i14 = 1;
        int[] iArr3 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        md.x0[][] x0VarArr = new md.x0[length][];
        int[][][] iArr4 = new int[eVarArr.length + 1][][];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = y0Var2.f15737d;
            x0VarArr[i15] = new md.x0[i16];
            iArr4[i15] = new int[i16][];
        }
        int length2 = eVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            iArr5[i17] = eVarArr[i17].z();
        }
        int i18 = 0;
        while (i18 < y0Var2.f15737d) {
            md.x0 x0VarA = y0Var2.a(i18);
            int i19 = x0VarA.f15729i == 5 ? i14 : 0;
            int length3 = eVarArr.length;
            int i20 = i14;
            int i21 = 0;
            int i22 = 0;
            while (i21 < eVarArr.length) {
                e eVar = eVarArr[i21];
                fe.r rVar2 = rVar;
                int i23 = i14;
                int iMax = 0;
                for (int i24 = 0; i24 < x0VarA.f15727d; i24++) {
                    iMax = Math.max(iMax, eVar.y(x0VarA.f15730v[i24]) & 7);
                }
                int i25 = iArr3[i21] == 0 ? i23 : 0;
                if (iMax > i22 || (iMax == i22 && i19 != 0 && i20 == 0 && i25 != 0)) {
                    i22 = iMax;
                    i20 = i25;
                    length3 = i21;
                }
                i21++;
                i14 = i23;
                rVar = rVar2;
            }
            fe.r rVar3 = rVar;
            int i26 = i14;
            if (length3 == eVarArr.length) {
                iArr2 = new int[x0VarA.f15727d];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr6 = new int[x0VarA.f15727d];
                for (int i27 = 0; i27 < x0VarA.f15727d; i27++) {
                    iArr6[i27] = eVar2.y(x0VarA.f15730v[i27]);
                }
                iArr2 = iArr6;
            }
            int i28 = iArr3[length3];
            x0VarArr[length3][i28] = x0VarA;
            iArr4[length3][i28] = iArr2;
            iArr3[length3] = i28 + 1;
            i18++;
            i14 = i26;
            rVar = rVar3;
        }
        fe.r rVar4 = rVar;
        int i29 = i14;
        int i30 = 0;
        md.y0[] y0VarArr = new md.y0[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr7 = new int[eVarArr.length];
        for (int i31 = 0; i31 < eVarArr.length; i31++) {
            int i32 = iArr3[i31];
            y0VarArr[i31] = new md.y0((md.x0[]) je.e0.K(i32, x0VarArr[i31]));
            iArr4[i31] = (int[][]) je.e0.K(i32, iArr4[i31]);
            strArr[i31] = eVarArr[i31].h();
            iArr7[i31] = eVarArr[i31].f9602e;
        }
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo2 = new MappingTrackSelector$MappedTrackInfo(iArr7, y0VarArr, iArr5, iArr4, new md.y0((md.x0[]) je.e0.K(iArr3[eVarArr.length], x0VarArr[eVarArr.length])));
        DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) rVar4;
        synchronized (defaultTrackSelector.f5728d) {
            try {
                aVar = defaultTrackSelector.f5732h;
                i7 = 32;
                if (aVar.f5754g0 && je.e0.f13788a >= 32 && (jVar = defaultTrackSelector.f5733i) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    je.b.l(looperMyLooper);
                    jVar.b(defaultTrackSelector, looperMyLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i33 = mappingTrackSelector$MappedTrackInfo2.f5734a;
        fe.o[] oVarArr = new fe.o[i33];
        int i34 = 2;
        Pair pairG = DefaultTrackSelector.g(2, mappingTrackSelector$MappedTrackInfo2, iArr4, new bc.i(11, aVar, iArr5), new cl.b(8));
        if (pairG != null) {
            oVarArr[((Integer) pairG.second).intValue()] = (fe.o) pairG.first;
        }
        int i35 = 0;
        while (true) {
            if (i35 >= mappingTrackSelector$MappedTrackInfo2.f5734a) {
                z5 = 0;
                break;
            }
            if (2 == iArr7[i35] && y0VarArr[i35].f15737d > 0) {
                z5 = i29;
                break;
            }
            i35++;
        }
        Pair pairG2 = DefaultTrackSelector.g(i29, mappingTrackSelector$MappedTrackInfo2, iArr4, new com.google.firebase.messaging.g(defaultTrackSelector, aVar, z5), new cl.b(9));
        if (pairG2 != null) {
            oVarArr[((Integer) pairG2.second).intValue()] = (fe.o) pairG2.first;
        }
        if (pairG2 == null) {
            str = null;
        } else {
            fe.o oVar2 = (fe.o) pairG2.first;
            str = oVar2.f9112a.f15730v[oVar2.f9113b[0]].f5528i;
        }
        int i36 = 3;
        Pair pairG3 = DefaultTrackSelector.g(3, mappingTrackSelector$MappedTrackInfo2, iArr4, new bc.i(12, aVar, str), new cl.b(10));
        if (pairG3 != null) {
            oVarArr[((Integer) pairG3.second).intValue()] = (fe.o) pairG3.first;
        }
        int i37 = 0;
        while (i37 < i33) {
            int i38 = iArr7[i37];
            if (i38 == i34 || i38 == 1 || i38 == i36) {
                i13 = i37;
            } else {
                md.y0 y0Var3 = y0VarArr[i37];
                int[][] iArr8 = iArr4[i37];
                int i39 = i30;
                int i40 = i39;
                md.x0 x0Var2 = null;
                fe.f fVar = null;
                while (i39 < y0Var3.f15737d) {
                    md.x0 x0VarA2 = y0Var3.a(i39);
                    int[] iArr9 = iArr8[i39];
                    fe.f fVar2 = fVar;
                    int i41 = i40;
                    md.x0 x0Var3 = x0Var2;
                    int i42 = i30;
                    while (i42 < x0VarA2.f15727d) {
                        int i43 = i37;
                        if (DefaultTrackSelector.d(iArr9[i42], aVar.h0)) {
                            x0Var = x0VarA2;
                            fe.f fVar3 = new fe.f(x0VarA2.f15730v[i42], iArr9[i42]);
                            if (fVar2 != null) {
                                y0Var = y0Var3;
                                if (ei.x.f8383a.c(fVar3.f9090e, fVar2.f9090e).c(fVar3.f9089d, fVar2.f9089d).e() > 0) {
                                }
                            } else {
                                y0Var = y0Var3;
                            }
                            fVar2 = fVar3;
                            i41 = i42;
                            x0Var3 = x0Var;
                        } else {
                            x0Var = x0VarA2;
                            y0Var = y0Var3;
                        }
                        i42++;
                        i37 = i43;
                        x0VarA2 = x0Var;
                        y0Var3 = y0Var;
                    }
                    i39++;
                    x0Var2 = x0Var3;
                    i40 = i41;
                    fVar = fVar2;
                }
                i13 = i37;
                oVarArr[i13] = x0Var2 == null ? null : new fe.o(i30, x0Var2, new int[]{i40});
            }
            i37 = i13 + 1;
            i7 = i7;
            i30 = 0;
            i34 = 2;
            i36 = 3;
        }
        int i44 = i7;
        Object obj2 = null;
        int i45 = mappingTrackSelector$MappedTrackInfo2.f5734a;
        md.y0[] y0VarArr2 = mappingTrackSelector$MappedTrackInfo2.f5736c;
        HashMap map = new HashMap();
        for (int i46 = 0; i46 < i45; i46++) {
            DefaultTrackSelector.a(y0VarArr2[i46], aVar, map);
        }
        DefaultTrackSelector.a(mappingTrackSelector$MappedTrackInfo2.f5739f, aVar, map);
        for (int i47 = 0; i47 < i45; i47++) {
            fe.s sVar = (fe.s) map.get(Integer.valueOf(mappingTrackSelector$MappedTrackInfo2.f5735b[i47]));
            if (sVar != null) {
                md.x0 x0Var4 = sVar.f9119d;
                ei.e0 e0Var = sVar.f9120e;
                oVarArr[i47] = (e0Var.isEmpty() || y0VarArr2[i47].b(x0Var4) == -1) ? null : new fe.o(0, x0Var4, mo.c0.P(e0Var));
            }
        }
        int i48 = mappingTrackSelector$MappedTrackInfo2.f5734a;
        for (int i49 = 0; i49 < i48; i49++) {
            md.y0 y0Var4 = mappingTrackSelector$MappedTrackInfo2.f5736c[i49];
            Map map2 = (Map) aVar.f5758l0.get(i49);
            if (map2 != null && map2.containsKey(y0Var4)) {
                Map map3 = (Map) aVar.f5758l0.get(i49);
                fe.h hVar = map3 != null ? (fe.h) map3.get(y0Var4) : null;
                if (hVar != null) {
                    int[] iArr10 = hVar.f9095e;
                    if (iArr10.length != 0) {
                        oVar = new fe.o(hVar.f9096i, y0Var4.a(hVar.f9094d), iArr10);
                    } else {
                        oVar = null;
                    }
                } else {
                    oVar = null;
                }
                oVarArr[i49] = oVar;
            }
        }
        for (int i50 = 0; i50 < i33; i50++) {
            int i51 = mappingTrackSelector$MappedTrackInfo2.f5735b[i50];
            if (aVar.f5759m0.get(i50) || aVar.W.contains(Integer.valueOf(i51))) {
                oVarArr[i50] = null;
            }
        }
        k8.a aVar2 = defaultTrackSelector.f5730f;
        he.g gVar2 = defaultTrackSelector.f9115b;
        je.b.l(gVar2);
        aVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i52 = 0;
        while (i52 < oVarArr.length) {
            fe.o oVar3 = oVarArr[i52];
            if (oVar3 == null || oVar3.f9113b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                ei.c0 c0Var = ei.e0.f8303e;
                ei.b0 b0Var = new ei.b0();
                b0Var.a(new fe.a(0L, 0L));
                arrayList.add(b0Var);
                obj = obj2;
            }
            i52++;
            obj2 = obj;
        }
        int length4 = oVarArr.length;
        long[][] jArr = new long[length4][];
        int i53 = 0;
        while (true) {
            j = -1;
            if (i53 >= oVarArr.length) {
                break;
            }
            fe.o oVar4 = oVarArr[i53];
            if (oVar4 == null) {
                jArr[i53] = new long[0];
                mappingTrackSelector$MappedTrackInfo = mappingTrackSelector$MappedTrackInfo2;
            } else {
                int[] iArr11 = oVar4.f9113b;
                jArr[i53] = new long[iArr11.length];
                int i54 = 0;
                while (i54 < iArr11.length) {
                    MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo3 = mappingTrackSelector$MappedTrackInfo2;
                    long j7 = oVar4.f9112a.f15730v[iArr11[i54]].E;
                    long[] jArr2 = jArr[i53];
                    if (j7 == -1) {
                        j7 = 0;
                    }
                    jArr2[i54] = j7;
                    i54++;
                    mappingTrackSelector$MappedTrackInfo2 = mappingTrackSelector$MappedTrackInfo3;
                }
                mappingTrackSelector$MappedTrackInfo = mappingTrackSelector$MappedTrackInfo2;
                Arrays.sort(jArr[i53]);
            }
            i53++;
            mappingTrackSelector$MappedTrackInfo2 = mappingTrackSelector$MappedTrackInfo;
        }
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo4 = mappingTrackSelector$MappedTrackInfo2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i55 = 0; i55 < length4; i55++) {
            long[] jArr4 = jArr[i55];
            jArr3[i55] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        fe.b.t(arrayList, jArr3);
        ei.p.c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(ei.p0.f8341e);
        ei.m0 m0Var = new ei.m0();
        ei.n0 n0Var = new ei.n0();
        if (!treeMap.isEmpty()) {
            throw new IllegalArgumentException();
        }
        n0Var.f8335v = treeMap;
        n0Var.f8337x = m0Var;
        int i56 = 0;
        while (i56 < length4) {
            long[] jArr5 = jArr[i56];
            if (jArr5.length <= 1) {
                gVar = gVar2;
                i12 = length4;
                j5 = j;
                iArr = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j5 = j;
                int i57 = 0;
                while (true) {
                    long[] jArr6 = jArr[i56];
                    gVar = gVar2;
                    double dLog = 0.0d;
                    if (i57 >= jArr6.length) {
                        break;
                    }
                    int i58 = length4;
                    int[] iArr13 = iArr12;
                    long j10 = jArr6[i57];
                    if (j10 != j5) {
                        dLog = Math.log(j10);
                    }
                    dArr[i57] = dLog;
                    i57++;
                    length4 = i58;
                    iArr12 = iArr13;
                    gVar2 = gVar;
                }
                int i59 = length4;
                iArr = iArr12;
                int i60 = length5 - 1;
                double d6 = dArr[i60] - dArr[0];
                int i61 = 0;
                while (i61 < i60) {
                    double d7 = dArr[i61];
                    i61++;
                    Double dValueOf = Double.valueOf(d6 == 0.0d ? 1.0d : (((d7 + dArr[i61]) * 0.5d) - dArr[0]) / d6);
                    int i62 = i59;
                    Integer numValueOf = Integer.valueOf(i56);
                    double d8 = d6;
                    Map map4 = n0Var.f8335v;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        List list = (List) n0Var.f8337x.get();
                        if (!list.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        n0Var.f8336w++;
                        map4.put(dValueOf, list);
                    } else if (collection.add(numValueOf)) {
                        n0Var.f8336w++;
                    }
                    i59 = i62;
                    d6 = d8;
                }
                i12 = i59;
            }
            i56++;
            iArr12 = iArr;
            j = j5;
            length4 = i12;
            gVar2 = gVar;
        }
        he.g gVar3 = gVar2;
        int[] iArr14 = iArr12;
        ei.n nVar = n0Var.f8339e;
        if (nVar == null) {
            nVar = new ei.n(0, n0Var);
            n0Var.f8339e = nVar;
        }
        ei.e0 e0VarK = ei.e0.k(nVar);
        for (int i63 = 0; i63 < e0VarK.size(); i63++) {
            int iIntValue = ((Integer) e0VarK.get(i63)).intValue();
            int i64 = iArr14[iIntValue] + 1;
            iArr14[iIntValue] = i64;
            jArr3[iIntValue] = jArr[iIntValue][i64];
            fe.b.t(arrayList, jArr3);
        }
        for (int i65 = 0; i65 < oVarArr.length; i65++) {
            if (arrayList.get(i65) != null) {
                jArr3[i65] = jArr3[i65] * 2;
            }
        }
        fe.b.t(arrayList, jArr3);
        int i66 = 4;
        ei.p.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i67 = 0;
        int i68 = 0;
        boolean z10 = false;
        while (i67 < arrayList.size()) {
            ei.b0 b0Var2 = (ei.b0) arrayList.get(i67);
            ei.r0 r0VarF = b0Var2 == null ? ei.r0.f8352w : b0Var2.f();
            r0VarF.getClass();
            int i69 = i68 + 1;
            if (objArr.length < i69) {
                objArrCopyOf = Arrays.copyOf(objArr, ei.y.d(objArr.length, i69));
            } else {
                if (z10) {
                    objArrCopyOf = (Object[]) objArr.clone();
                }
                objArr[i68] = r0VarF;
                i67++;
                i68++;
            }
            objArr = objArrCopyOf;
            z10 = false;
            objArr[i68] = r0VarF;
            i67++;
            i68++;
        }
        ei.r0 r0VarJ = ei.e0.j(i68, objArr);
        fe.p[] pVarArr = new fe.p[oVarArr.length];
        for (int i70 = 0; i70 < oVarArr.length; i70++) {
            fe.o oVar5 = oVarArr[i70];
            if (oVar5 != null) {
                int[] iArr15 = oVar5.f9113b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new fe.q(oVar5.f9112a, new int[]{iArr15[0]});
                    } else {
                        long j11 = 25000;
                        bVar = new fe.b(oVar5.f9112a, iArr15, gVar3, 10000, j11, j11, (ei.e0) r0VarJ.get(i70));
                    }
                    pVarArr[i70] = bVar;
                }
            }
        }
        p1[] p1VarArr = new p1[i33];
        int i71 = 0;
        while (i71 < i33) {
            MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo5 = mappingTrackSelector$MappedTrackInfo4;
            p1VarArr[i71] = (aVar.f5759m0.get(i71) || aVar.W.contains(Integer.valueOf(mappingTrackSelector$MappedTrackInfo5.f5735b[i71])) || (mappingTrackSelector$MappedTrackInfo5.f5735b[i71] != -2 && pVarArr[i71] == null)) ? null : p1.f9818b;
            i71++;
            mappingTrackSelector$MappedTrackInfo4 = mappingTrackSelector$MappedTrackInfo5;
        }
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo6 = mappingTrackSelector$MappedTrackInfo4;
        if (aVar.f5755i0) {
            int i72 = -1;
            int i73 = -1;
            int i74 = 0;
            while (true) {
                if (i74 >= mappingTrackSelector$MappedTrackInfo6.f5734a) {
                    i10 = -1;
                    z7 = true;
                    break;
                }
                int i75 = mappingTrackSelector$MappedTrackInfo6.f5735b[i74];
                fe.p pVar = pVarArr[i74];
                if ((i75 == 1 || i75 == 2) && pVar != null) {
                    int[][] iArr16 = iArr4[i74];
                    int iB = mappingTrackSelector$MappedTrackInfo6.f5736c[i74].b(pVar.c());
                    int i76 = 0;
                    while (true) {
                        if (i76 >= pVar.length()) {
                            i11 = i44;
                            if (i75 != 1) {
                                i10 = -1;
                                if (i72 == -1) {
                                    i72 = i74;
                                    break;
                                }
                                z7 = false;
                                break;
                            }
                            i10 = -1;
                            if (i73 == -1) {
                                i73 = i74;
                                break;
                            }
                            z7 = false;
                            break;
                        }
                        i11 = i44;
                        if ((iArr16[iB][pVar.g(i76)] & 32) == i11) {
                            i76++;
                            i44 = i11;
                        }
                    }
                    i74++;
                    i44 = i11;
                } else {
                    i11 = i44;
                }
                i74++;
                i44 = i11;
            }
            if (((i73 == i10 || i72 == i10) ? false : true) & z7) {
                p1 p1Var = new p1(true);
                p1VarArr[i73] = p1Var;
                p1VarArr[i72] = p1Var;
            }
        }
        Pair pairCreate = Pair.create(p1VarArr, pVarArr);
        fe.p[] pVarArr2 = (fe.p[]) pairCreate.second;
        List[] listArr = new List[pVarArr2.length];
        for (int i77 = 0; i77 < pVarArr2.length; i77++) {
            fe.p pVar2 = pVarArr2[i77];
            if (pVar2 != null) {
                r0VarR = ei.e0.r(pVar2);
            } else {
                ei.c0 c0Var2 = ei.e0.f8303e;
                r0VarR = ei.r0.f8352w;
            }
            listArr[i77] = r0VarR;
        }
        ei.b0 b0Var3 = new ei.b0();
        int i78 = 0;
        while (true) {
            int i79 = mappingTrackSelector$MappedTrackInfo6.f5734a;
            md.y0[] y0VarArr3 = mappingTrackSelector$MappedTrackInfo6.f5736c;
            if (i78 >= i79) {
                break;
            }
            md.y0 y0Var5 = y0VarArr3[i78];
            List list2 = listArr[i78];
            int i80 = 0;
            while (i80 < y0Var5.f15737d) {
                md.x0 x0VarA3 = y0Var5.a(i80);
                int i81 = y0VarArr3[i78].a(i80).f15727d;
                int[] iArr17 = new int[i81];
                int i82 = 0;
                for (int i83 = 0; i83 < i81; i83++) {
                    if ((mappingTrackSelector$MappedTrackInfo6.f5738e[i78][i80][i83] & 7) == i66) {
                        iArr17[i82] = i83;
                        i82++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr17, i82);
                List[] listArr2 = listArr;
                int iMin = 16;
                String str2 = null;
                int i84 = 0;
                boolean z11 = false;
                int i85 = 0;
                while (i84 < iArrCopyOf.length) {
                    String str3 = y0VarArr3[i78].a(i80).f15730v[iArrCopyOf[i84]].I;
                    int i86 = i85 + 1;
                    if (i85 == 0) {
                        str2 = str3;
                    } else {
                        z11 = (!je.e0.a(str2, str3)) | z11;
                    }
                    iMin = Math.min(iMin, mappingTrackSelector$MappedTrackInfo6.f5738e[i78][i80][i84] & 24);
                    i84++;
                    i85 = i86;
                }
                if (z11) {
                    iMin = Math.min(iMin, mappingTrackSelector$MappedTrackInfo6.f5737d[i78]);
                }
                boolean z12 = iMin != 0;
                int i87 = x0VarA3.f15727d;
                int[] iArr18 = new int[i87];
                boolean[] zArr = new boolean[i87];
                for (int i88 = 0; i88 < x0VarA3.f15727d; i88++) {
                    iArr18[i88] = mappingTrackSelector$MappedTrackInfo6.f5738e[i78][i80][i88] & 7;
                    int i89 = 0;
                    while (true) {
                        if (i89 >= list2.size()) {
                            z6 = false;
                            break;
                        }
                        fe.p pVar3 = (fe.p) list2.get(i89);
                        if (pVar3.c().equals(x0VarA3) && pVar3.s(i88) != -1) {
                            z6 = true;
                            break;
                        }
                        i89++;
                    }
                    zArr[i88] = z6;
                }
                b0Var3.a(new w1(x0VarA3, z12, iArr18, zArr));
                i80++;
                listArr = listArr2;
                i66 = 4;
            }
            i78++;
            i66 = 4;
        }
        md.y0 y0Var6 = mappingTrackSelector$MappedTrackInfo6.f5739f;
        for (int i90 = 0; i90 < y0Var6.f15737d; i90++) {
            md.x0 x0VarA4 = y0Var6.a(i90);
            int[] iArr19 = new int[x0VarA4.f15727d];
            Arrays.fill(iArr19, 0);
            b0Var3.a(new w1(x0VarA4, false, iArr19, new boolean[x0VarA4.f15727d]));
        }
        fe.u uVar = new fe.u((p1[]) pairCreate.first, (fe.p[]) pairCreate.second, new Tracks(b0Var3.f()), mappingTrackSelector$MappedTrackInfo6);
        for (fe.p pVar4 : uVar.f9147c) {
            if (pVar4 != null) {
                pVar4.o(f2);
            }
        }
        return uVar;
    }

    public final void h() {
        Object obj = this.f9893a;
        if (obj instanceof md.d) {
            long j = this.f9898f.f9920d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((md.d) obj).f15602w = j;
        }
    }
}
