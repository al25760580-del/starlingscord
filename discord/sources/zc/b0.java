package zc;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements pc.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f23660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f23661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.g f23662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f23663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f23664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f23665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f23666i;
    public sc.b j;
    public pc.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e0 f23671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23673r;

    public b0(int i7, je.b0 b0Var, i1.g gVar) {
        this.f23662e = gVar;
        this.f23658a = i7;
        if (i7 == 1 || i7 == 2) {
            this.f23659b = Collections.singletonList(b0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f23659b = arrayList;
            arrayList.add(b0Var);
        }
        this.f23660c = new je.w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f23664g = sparseBooleanArray;
        this.f23665h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f23663f = sparseArray;
        this.f23661d = new SparseIntArray();
        this.f23666i = new w(1);
        this.k = pc.m.f17904u;
        this.f23673r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (e0) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new a0(new e4.l(this)));
        this.f23671p = null;
    }

    /* JADX WARN: Failed to calculate best type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: zc.b0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: zc.b0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: zc.b0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: zc.b0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: zc.b0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: zc.b0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [zc.b0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [zc.e0] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws h1, EOFException, InterruptedIOException {
        pc.l lVar2;
        int i7;
        int i10;
        ?? r5;
        int i11;
        e0 e0Var;
        boolean z5;
        long j = ((pc.h) lVar).f17894i;
        boolean z6 = this.f23668m;
        int i12 = this.f23658a;
        if (z6) {
            long j5 = -9223372036854775807L;
            w wVar = this.f23666i;
            if (j != -1 && i12 != 2 && !wVar.f23886d) {
                int i13 = this.f23673r;
                je.b0 b0Var = wVar.f23884b;
                je.w wVar2 = wVar.f23885c;
                if (i13 <= 0) {
                    wVar.a(lVar);
                    return 0;
                }
                if (!wVar.f23888f) {
                    pc.h hVar = (pc.h) lVar;
                    long j7 = hVar.f17894i;
                    int iMin = (int) Math.min(112800, j7);
                    long j10 = j7 - ((long) iMin);
                    if (hVar.f17895v != j10) {
                        nVar.f17905a = j10;
                        return 1;
                    }
                    wVar2.C(iMin);
                    hVar.f17897x = 0;
                    hVar.g(wVar2.f13860a, 0, iMin, false);
                    int i14 = wVar2.f13861b;
                    int i15 = wVar2.f13862c;
                    for (int i16 = i15 - 188; i16 >= i14; i16--) {
                        byte[] bArr = wVar2.f13860a;
                        int i17 = 0;
                        for (int i18 = -4; i18 <= 4; i18++) {
                            int i19 = (i18 * 188) + i16;
                            if (i19 >= i14 && i19 < i15 && bArr[i19] == 71) {
                                i17++;
                                if (i17 == 5) {
                                    long jO = m3.m.O(wVar2, i16, i13);
                                    if (jO == -9223372036854775807L) {
                                        break;
                                    }
                                    j5 = jO;
                                    break;
                                }
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    wVar.f23890h = j5;
                    wVar.f23888f = true;
                    return 0;
                }
                if (wVar.f23890h == -9223372036854775807L) {
                    wVar.a(lVar);
                    return 0;
                }
                if (wVar.f23887e) {
                    long j11 = wVar.f23889g;
                    if (j11 == -9223372036854775807L) {
                        wVar.a(lVar);
                        return 0;
                    }
                    long jB = b0Var.b(wVar.f23890h) - b0Var.b(j11);
                    wVar.f23891i = jB;
                    if (jB < 0) {
                        je.b.N("TsDurationReader", "Invalid duration: " + wVar.f23891i + ". Using TIME_UNSET instead.");
                        wVar.f23891i = -9223372036854775807L;
                    }
                    wVar.a(lVar);
                    return 0;
                }
                pc.h hVar2 = (pc.h) lVar;
                int iMin2 = (int) Math.min(112800, hVar2.f17894i);
                long j12 = 0;
                if (hVar2.f17895v != j12) {
                    nVar.f17905a = j12;
                    return 1;
                }
                wVar2.C(iMin2);
                hVar2.f17897x = 0;
                hVar2.g(wVar2.f13860a, 0, iMin2, false);
                int i20 = wVar2.f13862c;
                for (int i21 = wVar2.f13861b; i21 < i20; i21++) {
                    if (wVar2.f13860a[i21] == 71) {
                        long jO2 = m3.m.O(wVar2, i21, i13);
                        if (jO2 != -9223372036854775807L) {
                            j5 = jO2;
                            break;
                        }
                    }
                }
                wVar.f23889g = j5;
                wVar.f23887e = true;
                return 0;
            }
            if (this.f23669n) {
                i7 = i12;
                z5 = false;
                j = j;
                i10 = 1;
            } else {
                this.f23669n = true;
                long j13 = wVar.f23891i;
                if (j13 != -9223372036854775807L) {
                    j = j;
                    i7 = i12;
                    i10 = 1;
                    z5 = false;
                    sc.b bVar = new sc.b(new i8.b(14), new a1.d(this.f23673r, wVar.f23884b), j13, 1 + j13, 0L, j, 188L, 940);
                    this.j = bVar;
                    this.k.c((pc.a) bVar.f17883c);
                } else {
                    i7 = i12;
                    j = j;
                    i10 = 1;
                    z5 = false;
                    this.k.c(new pc.o(j13));
                }
            }
            if (this.f23670o) {
                this.f23670o = z5;
                g(r20, r20);
                if (((pc.h) lVar).f17895v != r20) {
                    nVar.f17905a = 0;
                    return i10;
                }
            }
            sc.b bVar2 = this.j;
            if (bVar2 != null && ((pc.b) bVar2.f17885e) != null) {
                return bVar2.v(lVar, nVar);
            }
            lVar2 = lVar;
            r5 = z5;
        } else {
            lVar2 = lVar;
            i7 = i12;
            i10 = 1;
            r5 = 0;
        }
        je.w wVar3 = this.f23660c;
        byte[] bArr2 = wVar3.f13860a;
        if (9400 - wVar3.f13861b < 188) {
            int iA = wVar3.a();
            if (iA > 0) {
                System.arraycopy(bArr2, wVar3.f13861b, bArr2, r5, iA);
            }
            wVar3.D(bArr2, iA);
        }
        while (wVar3.a() < 188) {
            int i22 = wVar3.f13862c;
            int i23 = ((pc.h) lVar2).read(bArr2, i22, 9400 - i22);
            if (i23 == -1) {
                return -1;
            }
            wVar3.E(i22 + i23);
        }
        int i24 = wVar3.f13861b;
        int i25 = wVar3.f13862c;
        byte[] bArr3 = wVar3.f13860a;
        int i26 = i24;
        while (i26 < i25 && bArr3[i26] != 71) {
            i26++;
        }
        wVar3.F(i26);
        int i27 = i26 + 188;
        ?? r7 = 0;
        if (i27 > i25) {
            int i28 = (i26 - i24) + this.f23672q;
            this.f23672q = i28;
            i11 = i7;
            if (i11 == 2 && i28 > 376) {
                throw h1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i7;
            this.f23672q = r5;
        }
        int i29 = wVar3.f13862c;
        if (i27 > i29) {
            return r5;
        }
        int iG = wVar3.g();
        if ((8388608 & iG) != 0) {
            wVar3.F(i27);
            return r5;
        }
        ?? r10 = (4194304 & iG) != 0 ? i10 : r5;
        int i30 = (2096896 & iG) >> 8;
        ?? r11 = (iG & 32) != 0 ? i10 : r5;
        if ((iG & 16) != 0) {
            e0Var = (e0) this.f23663f.get(i30);
        }
        if (r7 == 0) {
            r7 = e0Var;
            wVar3.F(i27);
            return r5;
        }
        if (i11 != 2) {
            int i31 = iG & 15;
            SparseIntArray sparseIntArray = this.f23661d;
            int i32 = sparseIntArray.get(i30, i31 - 1);
            sparseIntArray.put(i30, i31);
            if (i32 == i31) {
                r7 = e0Var;
                wVar3.F(i27);
                return r5;
            }
            if (i31 != ((i32 + 1) & 15)) {
                r7 = e0Var;
                r7.a();
            }
        }
        if (r11 != 0) {
            int iU = wVar3.u();
            r10 = (r10 == true ? 1 : 0) | ((wVar3.u() & 64) != 0 ? 2 : r5);
            wVar3.G(iU - 1);
        }
        boolean z7 = this.f23668m;
        if (i11 == 2 || z7 || !this.f23665h.get(i30, r5)) {
            wVar3.E(i27);
            r7.c(r10, wVar3);
            wVar3.E(i29);
        }
        if (i11 != 2 && !z7 && this.f23668m && j != -1) {
            this.f23670o = i10;
        }
        wVar3.F(i27);
        return r5;
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.k = mVar;
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f23660c.f13860a;
        pc.h hVar = (pc.h) lVar;
        hVar.g(bArr, 0, 940, false);
        for (int i7 = 0; i7 < 188; i7++) {
            int i10 = 0;
            while (true) {
                if (i10 >= 5) {
                    hVar.u(i7);
                    return true;
                }
                if (bArr[(i10 * 188) + i7] != 71) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        sc.b bVar;
        long j7;
        SparseArray sparseArray = this.f23663f;
        List list = this.f23659b;
        je.b.k(this.f23658a != 2);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            je.b0 b0Var = (je.b0) list.get(i7);
            synchronized (b0Var) {
                j7 = b0Var.f13768b;
            }
            boolean z5 = j7 == -9223372036854775807L;
            if (!z5) {
                long jC = b0Var.c();
                z5 = (jC == -9223372036854775807L || jC == 0 || jC == j5) ? false : true;
            }
            if (z5) {
                b0Var.e(j5);
            }
        }
        if (j5 != 0 && (bVar = this.j) != null) {
            bVar.C(j5);
        }
        this.f23660c.C(0);
        this.f23661d.clear();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((e0) sparseArray.valueAt(i10)).a();
        }
        this.f23672q = 0;
    }

    @Override // pc.k
    public final void release() {
    }
}
