package zc;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.e f23803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23805c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23809g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f23811i;
    public pc.x j;
    public o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23812l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23814n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f23810h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f23806d = new u(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f23807e = new u(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f23808f = new u(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23813m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final je.w f23815o = new je.w();

    public p(e4.e eVar, boolean z5, boolean z6) {
        this.f23803a = eVar;
        this.f23804b = z5;
        this.f23805c = z6;
    }

    @Override // zc.h
    public final void a() {
        this.f23809g = 0L;
        this.f23814n = false;
        this.f23813m = -9223372036854775807L;
        je.b.o(this.f23810h);
        this.f23806d.c();
        this.f23807e.c();
        this.f23808f.c();
        o oVar = this.k;
        if (oVar != null) {
            oVar.k = false;
            oVar.f23799o = false;
            n nVar = oVar.f23798n;
            nVar.f23774b = false;
            nVar.f23773a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    public final void b(byte[] bArr, int i7, int i10) {
        boolean zH;
        boolean zH2;
        boolean z5;
        boolean z6;
        int iL;
        int i11;
        int iM;
        int iM2;
        int i12;
        int iM3;
        if (!this.f23812l || this.k.f23789c) {
            this.f23806d.a(bArr, i7, i10);
            this.f23807e.a(bArr, i7, i10);
        }
        this.f23808f.a(bArr, i7, i10);
        o oVar = this.k;
        SparseArray sparseArray = oVar.f23791e;
        je.v vVar = oVar.f23792f;
        if (oVar.k) {
            int i13 = i10 - i7;
            byte[] bArr2 = oVar.f23793g;
            int length = bArr2.length;
            int i14 = oVar.f23794h + i13;
            if (length < i14) {
                oVar.f23793g = Arrays.copyOf(bArr2, i14 * 2);
            }
            System.arraycopy(bArr, i7, oVar.f23793g, oVar.f23794h, i13);
            int i15 = oVar.f23794h + i13;
            oVar.f23794h = i15;
            vVar.f13853b = oVar.f23793g;
            vVar.f13855d = 0;
            vVar.f13854c = i15;
            vVar.f13856e = 0;
            vVar.a();
            if (vVar.d(8)) {
                vVar.r();
                int i16 = vVar.i(2);
                vVar.s(5);
                if (vVar.e()) {
                    vVar.l();
                    if (vVar.e()) {
                        int iL2 = vVar.l();
                        if (!oVar.f23789c) {
                            oVar.k = false;
                            n nVar = oVar.f23798n;
                            nVar.f23777e = iL2;
                            nVar.f23774b = true;
                            return;
                        }
                        if (vVar.e()) {
                            int iL3 = vVar.l();
                            if (sparseArray.indexOfKey(iL3) < 0) {
                                oVar.k = false;
                                return;
                            }
                            je.q qVar = (je.q) sparseArray.get(iL3);
                            SparseArray sparseArray2 = oVar.f23790d;
                            int i17 = qVar.f13828a;
                            boolean z7 = qVar.f13829b;
                            je.r rVar = (je.r) sparseArray2.get(i17);
                            boolean z10 = rVar.f13837h;
                            int i18 = rVar.f13839l;
                            int i19 = rVar.j;
                            if (z10) {
                                if (!vVar.d(2)) {
                                    return;
                                } else {
                                    vVar.s(2);
                                }
                            }
                            if (vVar.d(i19)) {
                                int i20 = vVar.i(i19);
                                if (!rVar.f13838i) {
                                    if (vVar.d(1)) {
                                        zH = vVar.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!vVar.d(1)) {
                                                return;
                                            }
                                            zH2 = vVar.h();
                                            z5 = true;
                                        }
                                        if (oVar.f23795i == 5) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                            iL = 0;
                                        } else if (!vVar.e()) {
                                            return;
                                        } else {
                                            iL = vVar.l();
                                        }
                                        i11 = rVar.k;
                                        if (i11 == 0) {
                                            if (i11 == 1 || rVar.f13840m) {
                                                iM = 0;
                                                iM2 = 0;
                                                i12 = 0;
                                            } else {
                                                if (!vVar.e()) {
                                                    return;
                                                }
                                                iM3 = vVar.m();
                                                if (!z7 || zH) {
                                                    iM = 0;
                                                    iM2 = 0;
                                                } else {
                                                    if (!vVar.e()) {
                                                        return;
                                                    }
                                                    iM2 = vVar.m();
                                                    iM = 0;
                                                }
                                                i12 = 0;
                                            }
                                            n nVar2 = oVar.f23798n;
                                            nVar2.f23775c = rVar;
                                            nVar2.f23776d = i16;
                                            nVar2.f23777e = iL2;
                                            nVar2.f23778f = i20;
                                            nVar2.f23779g = iL3;
                                            nVar2.f23780h = zH;
                                            nVar2.f23781i = z5;
                                            nVar2.j = zH2;
                                            nVar2.k = z6;
                                            nVar2.f23782l = iL;
                                            nVar2.f23783m = i12;
                                            nVar2.f23784n = iM;
                                            nVar2.f23785o = iM3;
                                            nVar2.f23786p = iM2;
                                            nVar2.f23773a = true;
                                            nVar2.f23774b = true;
                                            oVar.k = false;
                                        }
                                        if (!vVar.d(i18)) {
                                            return;
                                        }
                                        i12 = vVar.i(i18);
                                        if (z7 || zH) {
                                            iM = 0;
                                        } else if (!vVar.e()) {
                                            return;
                                        } else {
                                            iM = vVar.m();
                                        }
                                        iM2 = 0;
                                        iM3 = 0;
                                        n nVar3 = oVar.f23798n;
                                        nVar3.f23775c = rVar;
                                        nVar3.f23776d = i16;
                                        nVar3.f23777e = iL2;
                                        nVar3.f23778f = i20;
                                        nVar3.f23779g = iL3;
                                        nVar3.f23780h = zH;
                                        nVar3.f23781i = z5;
                                        nVar3.j = zH2;
                                        nVar3.k = z6;
                                        nVar3.f23782l = iL;
                                        nVar3.f23783m = i12;
                                        nVar3.f23784n = iM;
                                        nVar3.f23785o = iM3;
                                        nVar3.f23786p = iM2;
                                        nVar3.f23773a = true;
                                        nVar3.f23774b = true;
                                        oVar.k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z5 = zH2;
                                if (oVar.f23795i == 5) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    iL = 0;
                                } else if (!vVar.e()) {
                                    return;
                                } else {
                                    iL = vVar.l();
                                }
                                i11 = rVar.k;
                                if (i11 == 0) {
                                    if (i11 == 1) {
                                    }
                                    iM = 0;
                                    iM2 = 0;
                                    i12 = 0;
                                } else {
                                    if (!vVar.d(i18)) {
                                        return;
                                    }
                                    i12 = vVar.i(i18);
                                    if (z7) {
                                        iM = 0;
                                    } else {
                                        iM = 0;
                                    }
                                    iM2 = 0;
                                }
                                iM3 = 0;
                                n nVar4 = oVar.f23798n;
                                nVar4.f23775c = rVar;
                                nVar4.f23776d = i16;
                                nVar4.f23777e = iL2;
                                nVar4.f23778f = i20;
                                nVar4.f23779g = iL3;
                                nVar4.f23780h = zH;
                                nVar4.f23781i = z5;
                                nVar4.j = zH2;
                                nVar4.k = z6;
                                nVar4.f23782l = iL;
                                nVar4.f23783m = i12;
                                nVar4.f23784n = iM;
                                nVar4.f23785o = iM3;
                                nVar4.f23786p = iM2;
                                nVar4.f23773a = true;
                                nVar4.f23774b = true;
                                oVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:81:0x021e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0220  */
    /* JADX WARN: Code duplicated, block: B:87:0x0237  */
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
    @Override // zc.h
    public final void c(je.w wVar) {
        int i7;
        int i10;
        byte[] bArr;
        int i11;
        long j;
        long j5;
        int i12;
        long j7;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z5;
        je.b.l(this.j);
        int i17 = je.e0.f13788a;
        int i18 = wVar.f13861b;
        int i19 = wVar.f13862c;
        byte[] bArr2 = wVar.f13860a;
        this.f23809g += (long) wVar.a();
        this.j.d(wVar.a(), wVar);
        while (true) {
            int iU = je.b.u(bArr2, i18, i19, this.f23810h);
            if (iU == i19) {
                b(bArr2, i18, i19);
                return;
            }
            int i20 = iU + 3;
            int i21 = bArr2[i20] & 31;
            int i22 = iU - i18;
            if (i22 > 0) {
                b(bArr2, i18, iU);
            }
            int i23 = i19 - iU;
            long j10 = this.f23809g - ((long) i23);
            int i24 = i22 < 0 ? -i22 : 0;
            long j11 = this.f23813m;
            boolean z6 = this.f23812l;
            u uVar = this.f23806d;
            u uVar2 = this.f23807e;
            if (!z6 || this.k.f23789c) {
                uVar.b(i24);
                uVar2.b(i24);
                if (this.f23812l) {
                    i7 = i23;
                    i10 = i19;
                    bArr = bArr2;
                    i11 = i20;
                    j = j10;
                    if (uVar.f23870c) {
                        je.r rVarF = je.b.F(uVar.f23871d, 3, uVar.f23872e);
                        this.k.f23790d.append(rVarF.f13833d, rVarF);
                        uVar.c();
                    } else if (uVar2.f23870c) {
                        je.v vVar = new je.v(uVar2.f23871d, 4, uVar2.f23872e);
                        int iL = vVar.l();
                        int iL2 = vVar.l();
                        vVar.r();
                        this.k.f23791e.append(iL, new je.q(iL, iL2, vVar.h()));
                        uVar2.c();
                    }
                } else if (uVar.f23870c && uVar2.f23870c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(uVar.f23871d, uVar.f23872e));
                    arrayList.add(Arrays.copyOf(uVar2.f23871d, uVar2.f23872e));
                    i7 = i23;
                    je.r rVarF2 = je.b.F(uVar.f23871d, 3, uVar.f23872e);
                    i10 = i19;
                    bArr = bArr2;
                    je.v vVar2 = new je.v(uVar2.f23871d, 4, uVar2.f23872e);
                    int iL3 = vVar2.l();
                    int iL4 = vVar2.l();
                    vVar2.r();
                    je.q qVar = new je.q(iL3, iL4, vVar2.h());
                    i11 = i20;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(rVarF2.f13830a), Integer.valueOf(rVarF2.f13831b), Integer.valueOf(rVarF2.f13832c));
                    pc.x xVar = this.j;
                    g0 g0Var = new g0();
                    j = j10;
                    g0Var.f9635a = this.f23811i;
                    g0Var.k = "video/avc";
                    g0Var.f9642h = str;
                    g0Var.f9648p = rVarF2.f13834e;
                    g0Var.f9649q = rVarF2.f13835f;
                    g0Var.f9652t = rVarF2.f13836g;
                    g0Var.f9645m = arrayList;
                    xVar.e(new Format(g0Var));
                    this.f23812l = true;
                    this.k.f23790d.append(rVarF2.f13833d, rVarF2);
                    this.k.f23791e.append(iL3, qVar);
                    uVar.c();
                    uVar2.c();
                } else {
                    i7 = i23;
                    i10 = i19;
                    bArr = bArr2;
                    i11 = i20;
                    j = j10;
                }
            } else {
                i7 = i23;
                i10 = i19;
                bArr = bArr2;
                i11 = i20;
                j = j10;
            }
            u uVar3 = this.f23808f;
            if (uVar3.b(i24)) {
                int iM = je.b.M(uVar3.f23871d, uVar3.f23872e);
                byte[] bArr3 = uVar3.f23871d;
                je.w wVar2 = this.f23815o;
                wVar2.D(bArr3, iM);
                wVar2.F(4);
                xr.m.f(j11, wVar2, (pc.x[]) this.f23803a.f7972i);
            }
            o oVar = this.k;
            boolean z7 = this.f23812l;
            boolean z10 = this.f23814n;
            if (oVar.f23795i == 9) {
                if (z7 && oVar.f23799o) {
                    j5 = oVar.j;
                    i12 = i7 + ((int) (j - j5));
                    j7 = oVar.f23801q;
                    if (j7 != -9223372036854775807L) {
                        oVar.f23787a.c(j7, oVar.f23802r ? 1 : 0, (int) (j5 - oVar.f23800p), i12, null);
                    }
                }
                oVar.f23800p = oVar.j;
                oVar.f23801q = oVar.f23796l;
                oVar.f23802r = false;
                oVar.f23799o = true;
            } else if (oVar.f23789c) {
                n nVar = oVar.f23798n;
                n nVar2 = oVar.f23797m;
                if (nVar.f23773a) {
                    if (nVar2.f23773a) {
                        je.r rVar = nVar.f23775c;
                        je.b.l(rVar);
                        je.r rVar2 = nVar2.f23775c;
                        je.b.l(rVar2);
                        int i25 = rVar2.k;
                        if (nVar.f23778f != nVar2.f23778f || nVar.f23779g != nVar2.f23779g || nVar.f23780h != nVar2.f23780h || ((nVar.f23781i && nVar2.f23781i && nVar.j != nVar2.j) || (((i14 = nVar.f23776d) != (i15 = nVar2.f23776d) && (i14 == 0 || i15 == 0)) || (((i16 = rVar.k) == 0 && i25 == 0 && (nVar.f23783m != nVar2.f23783m || nVar.f23784n != nVar2.f23784n)) || ((i16 == 1 && i25 == 1 && (nVar.f23785o != nVar2.f23785o || nVar.f23786p != nVar2.f23786p)) || (z5 = nVar.k) != nVar2.k || (z5 && nVar.f23782l != nVar2.f23782l)))))) {
                            if (z7) {
                                j5 = oVar.j;
                                i12 = i7 + ((int) (j - j5));
                                j7 = oVar.f23801q;
                                if (j7 != -9223372036854775807L) {
                                    oVar.f23787a.c(j7, oVar.f23802r ? 1 : 0, (int) (j5 - oVar.f23800p), i12, null);
                                }
                            }
                            oVar.f23800p = oVar.j;
                            oVar.f23801q = oVar.f23796l;
                            oVar.f23802r = false;
                            oVar.f23799o = true;
                        }
                    } else {
                        if (z7) {
                            j5 = oVar.j;
                            i12 = i7 + ((int) (j - j5));
                            j7 = oVar.f23801q;
                            if (j7 != -9223372036854775807L) {
                                oVar.f23787a.c(j7, oVar.f23802r ? 1 : 0, (int) (j5 - oVar.f23800p), i12, null);
                            }
                        }
                        oVar.f23800p = oVar.j;
                        oVar.f23801q = oVar.f23796l;
                        oVar.f23802r = false;
                        oVar.f23799o = true;
                    }
                }
            }
            if (oVar.f23788b) {
                n nVar3 = oVar.f23798n;
                z10 = nVar3.f23774b && ((i13 = nVar3.f23777e) == 7 || i13 == 2);
            }
            boolean z11 = oVar.f23802r;
            int i26 = oVar.f23795i;
            boolean z12 = z11 | (i26 == 5 || (z10 && i26 == 1));
            oVar.f23802r = z12;
            if (z12) {
                this.f23814n = false;
            }
            long j12 = this.f23813m;
            if (!this.f23812l || this.k.f23789c) {
                uVar.d(i21);
                uVar2.d(i21);
            }
            uVar3.d(i21);
            o oVar2 = this.k;
            oVar2.f23795i = i21;
            oVar2.f23796l = j12;
            oVar2.j = j;
            if ((oVar2.f23788b && i21 == 1) || (oVar2.f23789c && (i21 == 5 || i21 == 1 || i21 == 2))) {
                n nVar4 = oVar2.f23797m;
                oVar2.f23797m = oVar2.f23798n;
                oVar2.f23798n = nVar4;
                nVar4.f23774b = false;
                nVar4.f23773a = false;
                oVar2.f23794h = 0;
                oVar2.k = true;
            }
            i19 = i10;
            bArr2 = bArr;
            i18 = i11;
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23811i = d0Var.f23692e;
        d0Var.b();
        pc.x xVarX = mVar.x(d0Var.f23691d, 2);
        this.j = xVarX;
        this.k = new o(xVarX, this.f23804b, this.f23805c);
        this.f23803a.z(mVar, d0Var);
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f23813m = j;
        }
        this.f23814n = ((i7 & 2) != 0) | this.f23814n;
    }

    @Override // zc.h
    public final void d() {
    }
}
