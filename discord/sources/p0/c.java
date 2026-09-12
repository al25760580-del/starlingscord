package p0;

import a5.b0;
import androidx.constraintlayout.core.Metrics;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import n8.f;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f17738p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f17739q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Metrics f17740r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17743c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f17746f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f17750l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f17753o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17741a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17742b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17744d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17745e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17747g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f17748h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17749i = 1;
    public int j = 0;
    public int k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e[] f17751m = new e[f17739q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17752n = 0;

    public c() {
        this.f17746f = null;
        this.f17746f = new b[32];
        s();
        f fVar = new f(4, false);
        fVar.f16510e = new b0((char) 0, 14);
        fVar.f16512v = new b0((char) 0, 14);
        fVar.f16511i = new e[32];
        this.f17750l = fVar;
        d dVar = new d(fVar);
        dVar.f17754f = new e[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        dVar.f17755g = new e[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        dVar.f17756h = 0;
        dVar.f17757i = new io.sentry.internal.debugmeta.c(dVar);
        this.f17743c = dVar;
        this.f17753o = new b(fVar);
    }

    public static int n(Object obj) {
        e eVar = ((r0.c) obj).f19151i;
        if (eVar != null) {
            return (int) (eVar.f17762w + 0.5f);
        }
        return 0;
    }

    public final e a(int i7) {
        b0 b0Var = (b0) this.f17750l.f16512v;
        int i10 = b0Var.f173e;
        Object obj = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = (Object[]) b0Var.f174i;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            b0Var.f173e = i11;
            obj = obj2;
        }
        e eVar = (e) obj;
        if (eVar == null) {
            eVar = new e(i7);
            eVar.I = i7;
        } else {
            eVar.c();
            eVar.I = i7;
        }
        int i12 = this.f17752n;
        int i13 = f17739q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f17739q = i14;
            this.f17751m = (e[]) Arrays.copyOf(this.f17751m, i14);
        }
        e[] eVarArr = this.f17751m;
        int i15 = this.f17752n;
        this.f17752n = i15 + 1;
        eVarArr[i15] = eVar;
        return eVar;
    }

    public final void b(e eVar, e eVar2, int i7, float f2, e eVar3, e eVar4, int i10, int i11) {
        b bVarL = l();
        if (eVar2 == eVar3) {
            bVarL.f17736d.g(eVar, 1.0f);
            bVarL.f17736d.g(eVar4, 1.0f);
            bVarL.f17736d.g(eVar2, -2.0f);
        } else if (f2 == 0.5f) {
            bVarL.f17736d.g(eVar, 1.0f);
            bVarL.f17736d.g(eVar2, -1.0f);
            bVarL.f17736d.g(eVar3, -1.0f);
            bVarL.f17736d.g(eVar4, 1.0f);
            if (i7 > 0 || i10 > 0) {
                bVarL.f17734b = (-i7) + i10;
            }
        } else if (f2 <= 0.0f) {
            bVarL.f17736d.g(eVar, -1.0f);
            bVarL.f17736d.g(eVar2, 1.0f);
            bVarL.f17734b = i7;
        } else if (f2 >= 1.0f) {
            bVarL.f17736d.g(eVar4, -1.0f);
            bVarL.f17736d.g(eVar3, 1.0f);
            bVarL.f17734b = -i10;
        } else {
            float f7 = 1.0f - f2;
            bVarL.f17736d.g(eVar, f7 * 1.0f);
            bVarL.f17736d.g(eVar2, f7 * (-1.0f));
            bVarL.f17736d.g(eVar3, (-1.0f) * f2);
            bVarL.f17736d.g(eVar4, 1.0f * f2);
            if (i7 > 0 || i10 > 0) {
                bVarL.f17734b = (i10 * f2) + ((-i7) * f7);
            }
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    public final void c(b bVar) {
        boolean z5;
        boolean z6;
        e eVarF;
        if (this.j + 1 >= this.k || this.f17749i + 1 >= this.f17745e) {
            o();
        }
        if (bVar.f17737e) {
            z5 = false;
        } else {
            ArrayList arrayList = bVar.f17735c;
            if (this.f17746f.length != 0) {
                boolean z7 = false;
                while (!z7) {
                    int iD = bVar.f17736d.d();
                    for (int i7 = 0; i7 < iD; i7++) {
                        e eVarE = bVar.f17736d.e(i7);
                        if (eVarE.f17760i != -1 || eVarE.f17763x) {
                            arrayList.add(eVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            e eVar = (e) arrayList.get(i10);
                            if (eVar.f17763x) {
                                bVar.h(this, eVar, true);
                            } else {
                                bVar.i(this, this.f17746f[eVar.f17760i], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z7 = true;
                    }
                }
                if (bVar.f17733a != null && bVar.f17736d.d() == 0) {
                    bVar.f17737e = true;
                    this.f17741a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f2 = bVar.f17734b;
            float f7 = 0.0f;
            if (f2 < 0.0f) {
                bVar.f17734b = f2 * (-1.0f);
                a aVar = bVar.f17736d;
                int i11 = aVar.f17731h;
                for (int i12 = 0; i11 != -1 && i12 < aVar.f17724a; i12++) {
                    float[] fArr = aVar.f17730g;
                    fArr[i11] = fArr[i11] * (-1.0f);
                    i11 = aVar.f17729f[i11];
                }
            }
            int iD2 = bVar.f17736d.d();
            float f10 = 0.0f;
            float f11 = 0.0f;
            e eVar2 = null;
            e eVar3 = null;
            int i13 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i13 < iD2) {
                float f12 = bVar.f17736d.f(i13);
                e eVarE2 = bVar.f17736d.e(i13);
                float f13 = f7;
                if (eVarE2.I == 1) {
                    if (eVar2 == null) {
                        if (eVarE2.H <= 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        eVar2 = eVarE2;
                        f10 = f12;
                    } else {
                        if (f10 > f12) {
                            if (eVarE2.H > 1) {
                                z10 = false;
                            }
                            eVar2 = eVarE2;
                            f10 = f12;
                        } else if (z10 || eVarE2.H > 1) {
                        }
                        z10 = true;
                        eVar2 = eVarE2;
                        f10 = f12;
                    }
                } else if (eVar2 == null && f12 < f13) {
                    if (eVar3 == null) {
                        if (eVarE2.H <= 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        eVar3 = eVarE2;
                        f11 = f12;
                    } else {
                        if (f11 > f12) {
                            if (eVarE2.H > 1) {
                                z11 = false;
                            }
                            eVar3 = eVarE2;
                            f11 = f12;
                        } else if (z11 || eVarE2.H > 1) {
                        }
                        z11 = true;
                        eVar3 = eVarE2;
                        f11 = f12;
                    }
                }
                i13++;
                f7 = f13;
            }
            float f14 = f7;
            if (eVar2 == null) {
                eVar2 = eVar3;
            }
            if (eVar2 == null) {
                z6 = true;
            } else {
                bVar.g(eVar2);
                z6 = false;
            }
            if (bVar.f17736d.d() == 0) {
                bVar.f17737e = true;
            }
            if (z6) {
                if (this.f17749i + 1 >= this.f17745e) {
                    o();
                }
                e eVarA = a(3);
                int i14 = this.f17742b + 1;
                this.f17742b = i14;
                this.f17749i++;
                eVarA.f17759e = i14;
                f fVar = this.f17750l;
                ((e[]) fVar.f16511i)[i14] = eVarA;
                bVar.f17733a = eVarA;
                int i15 = this.j;
                h(bVar);
                if (this.j == i15 + 1) {
                    b bVar2 = this.f17753o;
                    bVar2.f17733a = null;
                    bVar2.f17736d.b();
                    for (int i16 = 0; i16 < bVar.f17736d.d(); i16++) {
                        bVar2.f17736d.a(bVar.f17736d.e(i16), bVar.f17736d.f(i16), true);
                    }
                    r(this.f17753o);
                    if (eVarA.f17760i == -1) {
                        if (bVar.f17733a == eVarA && (eVarF = bVar.f(null, eVarA)) != null) {
                            bVar.g(eVarF);
                        }
                        if (!bVar.f17737e) {
                            bVar.f17733a.e(this, bVar);
                        }
                        ((b0) fVar.f16510e).C(bVar);
                        this.j--;
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            e eVar4 = bVar.f17733a;
            if (eVar4 == null) {
                return;
            }
            if (eVar4.I != 1 && bVar.f17734b < f14) {
                return;
            }
        }
        if (z5) {
            return;
        }
        h(bVar);
    }

    public final void d(e eVar, int i7) {
        int i10 = eVar.f17760i;
        if (i10 == -1) {
            eVar.d(this, i7);
            for (int i11 = 0; i11 < this.f17742b + 1; i11++) {
                e eVar2 = ((e[]) this.f17750l.f16511i)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f17733a = eVar;
            float f2 = i7;
            eVar.f17762w = f2;
            bVarL.f17734b = f2;
            bVarL.f17737e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f17746f[i10];
        if (bVar.f17737e) {
            bVar.f17734b = i7;
            return;
        }
        if (bVar.f17736d.d() == 0) {
            bVar.f17737e = true;
            bVar.f17734b = i7;
            return;
        }
        b bVarL2 = l();
        if (i7 < 0) {
            bVarL2.f17734b = i7 * (-1);
            bVarL2.f17736d.g(eVar, 1.0f);
        } else {
            bVarL2.f17734b = i7;
            bVarL2.f17736d.g(eVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(e eVar, e eVar2, int i7, int i10) {
        if (i10 == 8 && eVar2.f17763x && eVar.f17760i == -1) {
            eVar.d(this, eVar2.f17762w + i7);
            return;
        }
        b bVarL = l();
        boolean z5 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z5 = true;
            }
            bVarL.f17734b = i7;
        }
        if (z5) {
            bVarL.f17736d.g(eVar, 1.0f);
            bVarL.f17736d.g(eVar2, -1.0f);
        } else {
            bVarL.f17736d.g(eVar, -1.0f);
            bVarL.f17736d.g(eVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.a(this, i10);
        }
        c(bVarL);
    }

    public final void f(e eVar, e eVar2, int i7, int i10) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f17761v = 0;
        bVarL.b(eVar, eVar2, eVarM, i7);
        if (i10 != 8) {
            bVarL.f17736d.g(j(i10), (int) (bVarL.f17736d.c(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(e eVar, e eVar2, int i7, int i10) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f17761v = 0;
        bVarL.c(eVar, eVar2, eVarM, i7);
        if (i10 != 8) {
            bVarL.f17736d.g(j(i10), (int) (bVarL.f17736d.c(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i7;
        if (bVar.f17737e) {
            bVar.f17733a.d(this, bVar.f17734b);
        } else {
            b[] bVarArr = this.f17746f;
            int i10 = this.j;
            bVarArr[i10] = bVar;
            e eVar = bVar.f17733a;
            eVar.f17760i = i10;
            this.j = i10 + 1;
            eVar.e(this, bVar);
        }
        if (this.f17741a) {
            int i11 = 0;
            while (i11 < this.j) {
                if (this.f17746f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f17746f[i11];
                if (bVar2 != null && bVar2.f17737e) {
                    bVar2.f17733a.d(this, bVar2.f17734b);
                    ((b0) this.f17750l.f16510e).C(bVar2);
                    this.f17746f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i7 = this.j;
                        if (i12 >= i7) {
                            break;
                        }
                        b[] bVarArr2 = this.f17746f;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        e eVar2 = bVar3.f17733a;
                        if (eVar2.f17760i == i12) {
                            eVar2.f17760i = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i7) {
                        this.f17746f[i13] = null;
                    }
                    this.j = i7 - 1;
                    i11--;
                }
                i11++;
            }
            this.f17741a = false;
        }
    }

    public final void i() {
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f17746f[i7];
            bVar.f17733a.f17762w = bVar.f17734b;
        }
    }

    public final e j(int i7) {
        if (this.f17749i + 1 >= this.f17745e) {
            o();
        }
        e eVarA = a(4);
        float[] fArr = eVarA.E;
        int i10 = this.f17742b + 1;
        this.f17742b = i10;
        this.f17749i++;
        eVarA.f17759e = i10;
        eVarA.f17761v = i7;
        ((e[]) this.f17750l.f16511i)[i10] = eVarA;
        d dVar = this.f17743c;
        dVar.f17757i.f12759e = eVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[eVarA.f17761v] = 1.0f;
        dVar.j(eVarA);
        return eVarA;
    }

    public final e k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f17749i + 1 >= this.f17745e) {
            o();
        }
        if (!(obj instanceof r0.c)) {
            return null;
        }
        r0.c cVar = (r0.c) obj;
        e eVar = cVar.f19151i;
        if (eVar == null) {
            cVar.k();
            eVar = cVar.f19151i;
        }
        int i7 = eVar.f17759e;
        f fVar = this.f17750l;
        if (i7 != -1 && i7 <= this.f17742b && ((e[]) fVar.f16511i)[i7] != null) {
            return eVar;
        }
        if (i7 != -1) {
            eVar.c();
        }
        int i10 = this.f17742b + 1;
        this.f17742b = i10;
        this.f17749i++;
        eVar.f17759e = i10;
        eVar.I = 1;
        ((e[]) fVar.f16511i)[i10] = eVar;
        return eVar;
    }

    public final b l() {
        Object obj;
        f fVar = this.f17750l;
        b0 b0Var = (b0) fVar.f16510e;
        int i7 = b0Var.f173e;
        if (i7 > 0) {
            int i10 = i7 - 1;
            Object[] objArr = (Object[]) b0Var.f174i;
            obj = objArr[i10];
            objArr[i10] = null;
            b0Var.f173e = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(fVar);
        }
        bVar.f17733a = null;
        bVar.f17736d.b();
        bVar.f17734b = 0.0f;
        bVar.f17737e = false;
        return bVar;
    }

    public final e m() {
        if (this.f17749i + 1 >= this.f17745e) {
            o();
        }
        e eVarA = a(3);
        int i7 = this.f17742b + 1;
        this.f17742b = i7;
        this.f17749i++;
        eVarA.f17759e = i7;
        ((e[]) this.f17750l.f16511i)[i7] = eVarA;
        return eVarA;
    }

    public final void o() {
        int i7 = this.f17744d * 2;
        this.f17744d = i7;
        this.f17746f = (b[]) Arrays.copyOf(this.f17746f, i7);
        f fVar = this.f17750l;
        fVar.f16511i = (e[]) Arrays.copyOf((e[]) fVar.f16511i, this.f17744d);
        int i10 = this.f17744d;
        this.f17748h = new boolean[i10];
        this.f17745e = i10;
        this.k = i10;
        Metrics metrics = f17740r;
        if (metrics != null) {
            metrics.f1230b = Math.max(metrics.f1230b, i10);
            long j = f17740r.f1230b;
        }
    }

    public final void p() {
        d dVar = this.f17743c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f17747g) {
            q(dVar);
            return;
        }
        Metrics metrics = f17740r;
        if (metrics != null) {
            metrics.f1231c++;
        }
        for (int i7 = 0; i7 < this.j; i7++) {
            if (!this.f17746f[i7].f17737e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        Metrics metrics = f17740r;
        if (metrics != null) {
            metrics.f1234f = Math.max(metrics.f1234f, this.f17749i);
            Metrics metrics2 = f17740r;
            metrics2.f1235g = Math.max(metrics2.f1235g, this.j);
        }
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f17746f[i7];
            int i10 = 1;
            if (bVar.f17733a.I != 1) {
                float f2 = 0.0f;
                if (bVar.f17734b < 0.0f) {
                    boolean z5 = false;
                    int i11 = 0;
                    while (!z5) {
                        i11 += i10;
                        float f7 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.j) {
                            b bVar2 = this.f17746f[i14];
                            if (bVar2.f17733a.I != i10 && !bVar2.f17737e && bVar2.f17734b < f2) {
                                int iD = bVar2.f17736d.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    e eVarE = bVar2.f17736d.e(i16);
                                    float fC = bVar2.f17736d.c(eVarE);
                                    if (fC > f2) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f10 = eVarE.f17764y[i17] / fC;
                                            if ((f10 < f7 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = eVarE.f17759e;
                                                i12 = i14;
                                                f7 = f10;
                                            }
                                        }
                                    }
                                    i16++;
                                    f2 = 0.0f;
                                }
                            }
                            i14++;
                            f2 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f17746f[i12];
                            bVar3.f17733a.f17760i = -1;
                            bVar3.g(((e[]) this.f17750l.f16511i)[i13]);
                            e eVar = bVar3.f17733a;
                            eVar.f17760i = i12;
                            eVar.e(this, bVar3);
                        } else {
                            z5 = true;
                        }
                        if (i11 > this.f17749i / 2) {
                            z5 = true;
                        }
                        f2 = 0.0f;
                        i10 = 1;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z5;
        int i7 = 0;
        for (int i10 = 0; i10 < this.f17749i; i10++) {
            this.f17748h[i10] = false;
        }
        boolean z6 = false;
        int i11 = 0;
        while (!z6) {
            int i12 = 1;
            i11++;
            if (i11 >= this.f17749i * 2) {
                return;
            }
            e eVar = bVar.f17733a;
            if (eVar != null) {
                this.f17748h[eVar.f17759e] = true;
            }
            e eVarD = bVar.d(this.f17748h);
            if (eVarD != null) {
                boolean[] zArr = this.f17748h;
                int i13 = eVarD.f17759e;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (eVarD != null) {
                float f2 = Float.MAX_VALUE;
                int i14 = i7;
                int i15 = -1;
                while (i14 < this.j) {
                    b bVar2 = this.f17746f[i14];
                    if (bVar2.f17733a.I != i12 && !bVar2.f17737e) {
                        a aVar = bVar2.f17736d;
                        int i16 = aVar.f17731h;
                        if (i16 == -1) {
                            z5 = false;
                            break;
                        }
                        int i17 = 0;
                        while (true) {
                            if (i16 == -1 || i17 >= aVar.f17724a) {
                                z5 = false;
                                break;
                            } else if (aVar.f17728e[i16] == eVarD.f17759e) {
                                z5 = true;
                                break;
                            } else {
                                i16 = aVar.f17729f[i16];
                                i17++;
                            }
                        }
                        if (z5) {
                            float fC = bVar2.f17736d.c(eVarD);
                            if (fC < 0.0f) {
                                float f7 = (-bVar2.f17734b) / fC;
                                if (f7 < f2) {
                                    f2 = f7;
                                    i15 = i14;
                                }
                            }
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 > -1) {
                    b bVar3 = this.f17746f[i15];
                    bVar3.f17733a.f17760i = -1;
                    bVar3.g(eVarD);
                    e eVar2 = bVar3.f17733a;
                    eVar2.f17760i = i15;
                    eVar2.e(this, bVar3);
                }
            } else {
                z6 = true;
            }
            i7 = 0;
        }
    }

    public final void s() {
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f17746f[i7];
            if (bVar != null) {
                ((b0) this.f17750l.f16510e).C(bVar);
            }
            this.f17746f[i7] = null;
        }
    }

    public final void t() {
        f fVar;
        int i7 = 0;
        while (true) {
            fVar = this.f17750l;
            e[] eVarArr = (e[]) fVar.f16511i;
            if (i7 >= eVarArr.length) {
                break;
            }
            e eVar = eVarArr[i7];
            if (eVar != null) {
                eVar.c();
            }
            i7++;
        }
        b0 b0Var = (b0) fVar.f16512v;
        e[] eVarArr2 = this.f17751m;
        int length = this.f17752n;
        b0Var.getClass();
        if (length > eVarArr2.length) {
            length = eVarArr2.length;
        }
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = eVarArr2[i10];
            int i11 = b0Var.f173e;
            Object[] objArr = (Object[]) b0Var.f174i;
            if (i11 < objArr.length) {
                objArr[i11] = eVar2;
                b0Var.f173e = i11 + 1;
            }
        }
        this.f17752n = 0;
        Arrays.fill((e[]) fVar.f16511i, (Object) null);
        this.f17742b = 0;
        d dVar = this.f17743c;
        dVar.f17756h = 0;
        dVar.f17734b = 0.0f;
        this.f17749i = 1;
        for (int i12 = 0; i12 < this.j; i12++) {
            b bVar = this.f17746f[i12];
        }
        s();
        this.j = 0;
        this.f17753o = new b(fVar);
    }
}
