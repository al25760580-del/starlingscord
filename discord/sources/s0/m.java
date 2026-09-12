package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i7, int i10, int i11, int i12, float f2, int i13) {
        int i14 = i10 - i7;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f2) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f2) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f2) + 0.5f);
        int i17 = (int) ((i14 / f2) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // s0.e
    public final void a(e eVar) {
        float f2;
        int iG;
        int i7;
        int iG2;
        float f7;
        float f10;
        float f11;
        int i10;
        if (f0.e.b(this.j) == 3) {
            ConstraintWidget constraintWidget = this.f19693b;
            l(constraintWidget.H, constraintWidget.J, 0);
            return;
        }
        i iVar = this.f19696e;
        boolean z5 = iVar.j;
        h hVar = this.f19699h;
        h hVar2 = this.f19700i;
        if (z5 || this.f19695d != 3) {
            f2 = 0.5f;
        } else {
            ConstraintWidget constraintWidget2 = this.f19693b;
            int i11 = constraintWidget2.f1264q;
            if (i11 == 2) {
                f2 = 0.5f;
                ConstraintWidget constraintWidget3 = constraintWidget2.S;
                if (constraintWidget3 != null) {
                    i iVar2 = constraintWidget3.f1242d.f19696e;
                    if (iVar2.j) {
                        iVar.d((int) ((iVar2.f19677g * constraintWidget2.f1269v) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                int i12 = constraintWidget2.f1265r;
                if (i12 == 0 || i12 == 3) {
                    o oVar = constraintWidget2.f1244e;
                    h hVar3 = oVar.f19699h;
                    h hVar4 = oVar.f19700i;
                    boolean z6 = constraintWidget2.H.f19148f != null;
                    boolean z7 = constraintWidget2.I.f19148f != null;
                    boolean z10 = constraintWidget2.J.f19148f != null;
                    boolean z11 = constraintWidget2.K.f19148f != null;
                    f2 = 0.5f;
                    int i13 = constraintWidget2.W;
                    if (z6 && z7 && z10 && z11) {
                        float f12 = constraintWidget2.V;
                        boolean z12 = hVar3.j;
                        ArrayList arrayList = hVar3.f19680l;
                        int[] iArr = k;
                        if (z12 && hVar4.j) {
                            if (hVar.f19673c && hVar2.f19673c) {
                                m(iArr, ((h) hVar.f19680l.get(0)).f19677g + hVar.f19676f, ((h) hVar2.f19680l.get(0)).f19677g - hVar2.f19676f, hVar3.f19677g + hVar3.f19676f, hVar4.f19677g - hVar4.f19676f, f12, i13);
                                iVar.d(iArr[0]);
                                this.f19693b.f1244e.f19696e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (hVar.j && hVar2.j) {
                            if (!hVar3.f19673c || !hVar4.f19673c) {
                                return;
                            }
                            m(iArr, hVar.f19677g + hVar.f19676f, hVar2.f19677g - hVar2.f19676f, ((h) arrayList.get(0)).f19677g + hVar3.f19676f, ((h) hVar4.f19680l.get(0)).f19677g - hVar4.f19676f, f12, i13);
                            iVar.d(iArr[0]);
                            this.f19693b.f1244e.f19696e.d(iArr[1]);
                        }
                        if (!hVar.f19673c || !hVar2.f19673c || !hVar3.f19673c || !hVar4.f19673c) {
                            return;
                        }
                        m(iArr, ((h) hVar.f19680l.get(0)).f19677g + hVar.f19676f, ((h) hVar2.f19680l.get(0)).f19677g - hVar2.f19676f, ((h) arrayList.get(0)).f19677g + hVar3.f19676f, ((h) hVar4.f19680l.get(0)).f19677g - hVar4.f19676f, f12, i13);
                        iVar.d(iArr[0]);
                        this.f19693b.f1244e.f19696e.d(iArr[1]);
                    } else if (z6 && z10) {
                        if (!hVar.f19673c || !hVar2.f19673c) {
                            return;
                        }
                        float f13 = constraintWidget2.V;
                        int i14 = ((h) hVar.f19680l.get(0)).f19677g + hVar.f19676f;
                        int i15 = ((h) hVar2.f19680l.get(0)).f19677g - hVar2.f19676f;
                        if (i13 == -1 || i13 == 0) {
                            int iG3 = g(i15 - i14, 0);
                            int i16 = (int) ((iG3 * f13) + 0.5f);
                            int iG4 = g(i16, 1);
                            if (i16 != iG4) {
                                iG3 = (int) ((iG4 / f13) + 0.5f);
                            }
                            iVar.d(iG3);
                            this.f19693b.f1244e.f19696e.d(iG4);
                        } else if (i13 == 1) {
                            int iG5 = g(i15 - i14, 0);
                            int i17 = (int) ((iG5 / f13) + 0.5f);
                            int iG6 = g(i17, 1);
                            if (i17 != iG6) {
                                iG5 = (int) ((iG6 * f13) + 0.5f);
                            }
                            iVar.d(iG5);
                            this.f19693b.f1244e.f19696e.d(iG6);
                        }
                    } else if (z7 && z11) {
                        if (!hVar3.f19673c || !hVar4.f19673c) {
                            return;
                        }
                        float f14 = constraintWidget2.V;
                        int i18 = ((h) hVar3.f19680l.get(0)).f19677g + hVar3.f19676f;
                        int i19 = ((h) hVar4.f19680l.get(0)).f19677g - hVar4.f19676f;
                        if (i13 == -1) {
                            iG = g(i19 - i18, 1);
                            i7 = (int) ((iG / f14) + 0.5f);
                            iG2 = g(i7, 0);
                            if (i7 != iG2) {
                                iG = (int) ((iG2 * f14) + 0.5f);
                            }
                            iVar.d(iG2);
                            this.f19693b.f1244e.f19696e.d(iG);
                        } else if (i13 == 0) {
                            int iG7 = g(i19 - i18, 1);
                            int i20 = (int) ((iG7 * f14) + 0.5f);
                            int iG8 = g(i20, 0);
                            if (i20 != iG8) {
                                iG7 = (int) ((iG8 / f14) + 0.5f);
                            }
                            iVar.d(iG8);
                            this.f19693b.f1244e.f19696e.d(iG7);
                        } else if (i13 == 1) {
                            iG = g(i19 - i18, 1);
                            i7 = (int) ((iG / f14) + 0.5f);
                            iG2 = g(i7, 0);
                            if (i7 != iG2) {
                                iG = (int) ((iG2 * f14) + 0.5f);
                            }
                            iVar.d(iG2);
                            this.f19693b.f1244e.f19696e.d(iG);
                        }
                    }
                } else {
                    int i21 = constraintWidget2.W;
                    if (i21 != -1) {
                        if (i21 == 0) {
                            f11 = constraintWidget2.f1244e.f19696e.f19677g / constraintWidget2.V;
                            i10 = (int) (f11 + 0.5f);
                        } else if (i21 != 1) {
                            i10 = 0;
                        } else {
                            f7 = constraintWidget2.f1244e.f19696e.f19677g;
                            f10 = constraintWidget2.V;
                        }
                        iVar.d(i10);
                        f2 = 0.5f;
                    } else {
                        f7 = constraintWidget2.f1244e.f19696e.f19677g;
                        f10 = constraintWidget2.V;
                    }
                    f11 = f7 * f10;
                    i10 = (int) (f11 + 0.5f);
                    iVar.d(i10);
                    f2 = 0.5f;
                }
            } else {
                f2 = 0.5f;
            }
        }
        boolean z13 = hVar.f19673c;
        ArrayList arrayList2 = hVar.f19680l;
        if (z13) {
            boolean z14 = hVar2.f19673c;
            ArrayList arrayList3 = hVar2.f19680l;
            if (z14) {
                if (hVar.j && hVar2.j && iVar.j) {
                    return;
                }
                if (!iVar.j && this.f19695d == 3) {
                    ConstraintWidget constraintWidget4 = this.f19693b;
                    if (constraintWidget4.f1264q == 0 && !constraintWidget4.u()) {
                        h hVar5 = (h) arrayList2.get(0);
                        h hVar6 = (h) arrayList3.get(0);
                        int i22 = hVar5.f19677g + hVar.f19676f;
                        int i23 = hVar6.f19677g + hVar2.f19676f;
                        hVar.d(i22);
                        hVar2.d(i23);
                        iVar.d(i23 - i22);
                        return;
                    }
                }
                if (!iVar.j && this.f19695d == 3 && this.f19692a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((h) arrayList3.get(0)).f19677g + hVar2.f19676f) - (((h) arrayList2.get(0)).f19677g + hVar.f19676f), iVar.f19681m);
                    ConstraintWidget constraintWidget5 = this.f19693b;
                    int i24 = constraintWidget5.f1268u;
                    int iMax = Math.max(constraintWidget5.f1267t, iMin);
                    if (i24 > 0) {
                        iMax = Math.min(i24, iMax);
                    }
                    iVar.d(iMax);
                }
                if (iVar.j) {
                    h hVar7 = (h) arrayList2.get(0);
                    h hVar8 = (h) arrayList3.get(0);
                    int i25 = hVar7.f19677g;
                    int i26 = hVar.f19676f + i25;
                    int i27 = hVar8.f19677g;
                    int i28 = hVar2.f19676f + i27;
                    float f15 = this.f19693b.f1241c0;
                    if (hVar7 == hVar8) {
                        f15 = f2;
                    } else {
                        i25 = i26;
                        i27 = i28;
                    }
                    hVar.d((int) ((((i27 - i25) - iVar.f19677g) * f15) + i25 + f2));
                    hVar2.d(hVar.f19677g + iVar.f19677g);
                }
            }
        }
    }

    @Override // s0.q
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        int i7;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        int i10;
        ConstraintWidget constraintWidget5 = this.f19693b;
        boolean z5 = constraintWidget5.f1237a;
        i iVar = this.f19696e;
        if (z5) {
            iVar.d(constraintWidget5.n());
        }
        boolean z6 = iVar.j;
        ArrayList arrayList = iVar.k;
        ArrayList arrayList2 = iVar.f19680l;
        h hVar = this.f19700i;
        h hVar2 = this.f19699h;
        if (!z6) {
            ConstraintWidget constraintWidget6 = this.f19693b;
            int i11 = constraintWidget6.f1262o0[0];
            this.f19695d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (constraintWidget4 = constraintWidget6.S) != null && ((i10 = constraintWidget4.f1262o0[0]) == 1 || i10 == 4)) {
                    int iN = (constraintWidget4.n() - this.f19693b.H.e()) - this.f19693b.J.e();
                    q.b(hVar2, constraintWidget4.f1242d.f19699h, this.f19693b.H.e());
                    q.b(hVar, constraintWidget4.f1242d.f19700i, -this.f19693b.J.e());
                    iVar.d(iN);
                    return;
                }
                if (i11 == 1) {
                    iVar.d(constraintWidget6.n());
                }
            }
        } else if (this.f19695d == 4 && (constraintWidget2 = (constraintWidget = this.f19693b).S) != null && ((i7 = constraintWidget2.f1262o0[0]) == 1 || i7 == 4)) {
            q.b(hVar2, constraintWidget2.f1242d.f19699h, constraintWidget.H.e());
            q.b(hVar, constraintWidget2.f1242d.f19700i, -this.f19693b.J.e());
            return;
        }
        if (iVar.j) {
            ConstraintWidget constraintWidget7 = this.f19693b;
            if (constraintWidget7.f1237a) {
                r0.c[] cVarArr = constraintWidget7.P;
                r0.c cVar = cVarArr[0];
                r0.c cVar2 = cVar.f19148f;
                if (cVar2 != null && cVarArr[1].f19148f != null) {
                    if (constraintWidget7.u()) {
                        hVar2.f19676f = this.f19693b.P[0].e();
                        hVar.f19676f = -this.f19693b.P[1].e();
                        return;
                    }
                    h hVarH = q.h(this.f19693b.P[0]);
                    if (hVarH != null) {
                        q.b(hVar2, hVarH, this.f19693b.P[0].e());
                    }
                    h hVarH2 = q.h(this.f19693b.P[1]);
                    if (hVarH2 != null) {
                        q.b(hVar, hVarH2, -this.f19693b.P[1].e());
                    }
                    hVar2.f19672b = true;
                    hVar.f19672b = true;
                    return;
                }
                if (cVar2 != null) {
                    h hVarH3 = q.h(cVar);
                    if (hVarH3 != null) {
                        q.b(hVar2, hVarH3, this.f19693b.P[0].e());
                        q.b(hVar, hVar2, iVar.f19677g);
                        return;
                    }
                    return;
                }
                r0.c cVar3 = cVarArr[1];
                if (cVar3.f19148f != null) {
                    h hVarH4 = q.h(cVar3);
                    if (hVarH4 != null) {
                        q.b(hVar, hVarH4, -this.f19693b.P[1].e());
                        q.b(hVar2, hVar, -iVar.f19677g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof r0.g) || constraintWidget7.S == null || constraintWidget7.i(7).f19148f != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f19693b;
                q.b(hVar2, constraintWidget8.S.f1242d.f19699h, constraintWidget8.o());
                q.b(hVar, hVar2, iVar.f19677g);
                return;
            }
        }
        if (this.f19695d == 3) {
            ConstraintWidget constraintWidget9 = this.f19693b;
            int i12 = constraintWidget9.f1264q;
            if (i12 == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.S;
                if (constraintWidget10 != null) {
                    i iVar2 = constraintWidget10.f1244e.f19696e;
                    arrayList2.add(iVar2);
                    iVar2.k.add(iVar);
                    iVar.f19672b = true;
                    arrayList.add(hVar2);
                    arrayList.add(hVar);
                }
            } else if (i12 == 3) {
                if (constraintWidget9.f1265r == 3) {
                    hVar2.f19671a = this;
                    hVar.f19671a = this;
                    o oVar = constraintWidget9.f1244e;
                    oVar.f19699h.f19671a = this;
                    oVar.f19700i.f19671a = this;
                    iVar.f19671a = this;
                    if (constraintWidget9.v()) {
                        arrayList2.add(this.f19693b.f1244e.f19696e);
                        this.f19693b.f1244e.f19696e.k.add(iVar);
                        o oVar2 = this.f19693b.f1244e;
                        oVar2.f19696e.f19671a = this;
                        arrayList2.add(oVar2.f19699h);
                        arrayList2.add(this.f19693b.f1244e.f19700i);
                        this.f19693b.f1244e.f19699h.k.add(iVar);
                        this.f19693b.f1244e.f19700i.k.add(iVar);
                    } else if (this.f19693b.u()) {
                        this.f19693b.f1244e.f19696e.f19680l.add(iVar);
                        arrayList.add(this.f19693b.f1244e.f19696e);
                    } else {
                        this.f19693b.f1244e.f19696e.f19680l.add(iVar);
                    }
                } else {
                    i iVar3 = constraintWidget9.f1244e.f19696e;
                    arrayList2.add(iVar3);
                    iVar3.k.add(iVar);
                    this.f19693b.f1244e.f19699h.k.add(iVar);
                    this.f19693b.f1244e.f19700i.k.add(iVar);
                    iVar.f19672b = true;
                    arrayList.add(hVar2);
                    arrayList.add(hVar);
                    hVar2.f19680l.add(iVar);
                    hVar.f19680l.add(iVar);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f19693b;
        r0.c[] cVarArr2 = constraintWidget11.P;
        r0.c cVar4 = cVarArr2[0];
        r0.c cVar5 = cVar4.f19148f;
        if (cVar5 != null && cVarArr2[1].f19148f != null) {
            if (constraintWidget11.u()) {
                hVar2.f19676f = this.f19693b.P[0].e();
                hVar.f19676f = -this.f19693b.P[1].e();
                return;
            }
            h hVarH5 = q.h(this.f19693b.P[0]);
            h hVarH6 = q.h(this.f19693b.P[1]);
            if (hVarH5 != null) {
                hVarH5.b(this);
            }
            if (hVarH6 != null) {
                hVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            h hVarH7 = q.h(cVar4);
            if (hVarH7 != null) {
                q.b(hVar2, hVarH7, this.f19693b.P[0].e());
                c(hVar, hVar2, 1, iVar);
                return;
            }
            return;
        }
        r0.c cVar6 = cVarArr2[1];
        if (cVar6.f19148f != null) {
            h hVarH8 = q.h(cVar6);
            if (hVarH8 != null) {
                q.b(hVar, hVarH8, -this.f19693b.P[1].e());
                c(hVar2, hVar, -1, iVar);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof r0.g) || (constraintWidget3 = constraintWidget11.S) == null) {
            return;
        }
        q.b(hVar2, constraintWidget3.f1242d.f19699h, constraintWidget11.o());
        c(hVar, hVar2, 1, iVar);
    }

    @Override // s0.q
    public final void e() {
        h hVar = this.f19699h;
        if (hVar.j) {
            this.f19693b.X = hVar.f19677g;
        }
    }

    @Override // s0.q
    public final void f() {
        this.f19694c = null;
        this.f19699h.c();
        this.f19700i.c();
        this.f19696e.c();
        this.f19698g = false;
    }

    @Override // s0.q
    public final boolean k() {
        return this.f19695d != 3 || this.f19693b.f1264q == 0;
    }

    public final void n() {
        this.f19698g = false;
        h hVar = this.f19699h;
        hVar.c();
        hVar.j = false;
        h hVar2 = this.f19700i;
        hVar2.c();
        hVar2.j = false;
        this.f19696e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f19693b.f1249g0;
    }
}
