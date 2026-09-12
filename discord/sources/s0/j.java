package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f19682a = new b();

    public static boolean a(ConstraintWidget constraintWidget) {
        int[] iArr = constraintWidget.f1262o0;
        int i7 = iArr[0];
        int i10 = iArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.S;
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget2 != null ? (ConstraintWidgetContainer) constraintWidget2 : null;
        if (constraintWidgetContainer != null) {
            int i11 = constraintWidgetContainer.f1262o0[0];
        }
        if (constraintWidgetContainer != null) {
            int i12 = constraintWidgetContainer.f1262o0[1];
        }
        boolean z5 = i7 == 1 || constraintWidget.x() || i7 == 2 || (i7 == 3 && constraintWidget.f1264q == 0 && constraintWidget.V == 0.0f && constraintWidget.q(0)) || (i7 == 3 && constraintWidget.f1264q == 1 && constraintWidget.r(0, constraintWidget.n()));
        boolean z6 = i10 == 1 || constraintWidget.y() || i10 == 2 || (i10 == 3 && constraintWidget.f1265r == 0 && constraintWidget.V == 0.0f && constraintWidget.q(1)) || (i7 == 3 && constraintWidget.f1265r == 1 && constraintWidget.r(1, constraintWidget.k()));
        return (constraintWidget.V > 0.0f && (z5 || z6)) || (z5 && z6);
    }

    public static p b(ConstraintWidget constraintWidget, int i7, ArrayList arrayList, p pVar) {
        int i10;
        int i11 = i7 == 0 ? constraintWidget.f1258m0 : constraintWidget.f1260n0;
        if (i11 != -1 && (pVar == null || i11 != pVar.f19688b)) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                p pVar2 = (p) arrayList.get(i12);
                if (pVar2.f19688b == i11) {
                    if (pVar != null) {
                        pVar.c(i7, pVar2);
                        arrayList.remove(pVar);
                    }
                    pVar = pVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return pVar;
        }
        if (pVar == null) {
            if (constraintWidget instanceof r0.g) {
                r0.g gVar = (r0.g) constraintWidget;
                int i13 = 0;
                while (true) {
                    if (i13 >= gVar.f19185q0) {
                        i10 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = gVar.f19184p0[i13];
                    if ((i7 == 0 && (i10 = constraintWidget2.f1258m0) != -1) || (i7 == 1 && (i10 = constraintWidget2.f1260n0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        p pVar3 = (p) arrayList.get(i14);
                        if (pVar3.f19688b == i10) {
                            pVar = pVar3;
                            break;
                        }
                    }
                }
            }
            if (pVar == null) {
                pVar = new p();
                pVar.f19687a = new ArrayList();
                pVar.f19690d = null;
                pVar.f19691e = -1;
                int i15 = p.f19686f;
                p.f19686f = i15 + 1;
                pVar.f19688b = i15;
                pVar.f19689c = i7;
            }
            arrayList.add(pVar);
        }
        int i16 = pVar.f19688b;
        ArrayList arrayList2 = pVar.f19687a;
        if (arrayList2.contains(constraintWidget)) {
            return pVar;
        }
        arrayList2.add(constraintWidget);
        if (constraintWidget instanceof r0.f) {
            r0.f fVar = (r0.f) constraintWidget;
            fVar.f19181s0.c(fVar.f19182t0 == 0 ? 1 : 0, arrayList, pVar);
        }
        if (i7 == 0) {
            constraintWidget.f1258m0 = i16;
            constraintWidget.H.c(i7, arrayList, pVar);
            constraintWidget.J.c(i7, arrayList, pVar);
        } else {
            constraintWidget.f1260n0 = i16;
            constraintWidget.I.c(i7, arrayList, pVar);
            constraintWidget.L.c(i7, arrayList, pVar);
            constraintWidget.K.c(i7, arrayList, pVar);
        }
        constraintWidget.O.c(i7, arrayList, pVar);
        return pVar;
    }

    public static void c(int i7, ConstraintWidget constraintWidget, c cVar, boolean z5) {
        r0.c cVar2;
        r0.c cVar3;
        char c8;
        r0.c cVar4;
        r0.c cVar5;
        r0.c cVar6;
        if (constraintWidget.f1255l) {
            return;
        }
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.w() && a(constraintWidget)) {
            ConstraintWidgetContainer.Q(constraintWidget, cVar, new b());
        }
        r0.c cVarI = constraintWidget.i(2);
        r0.c cVarI2 = constraintWidget.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<r0.c> hashSet = cVarI.f19143a;
        if (hashSet != null && cVarI.f19145c) {
            for (r0.c cVar7 : hashSet) {
                ConstraintWidget constraintWidget2 = cVar7.f19146d;
                int i10 = i7 + 1;
                boolean zA = a(constraintWidget2);
                r0.c cVar8 = constraintWidget2.H;
                r0.c cVar9 = constraintWidget2.J;
                if (constraintWidget2.w() && zA) {
                    c8 = 0;
                    ConstraintWidgetContainer.Q(constraintWidget2, cVar, new b());
                } else {
                    c8 = 0;
                }
                int i11 = constraintWidget2.f1262o0[c8];
                if (i11 != 3 || zA) {
                    if (!constraintWidget2.w()) {
                        if (cVar7 == cVar8 && cVar9.f19148f == null) {
                            int iE = cVar8.e() + iD;
                            constraintWidget2.E(iE, constraintWidget2.n() + iE);
                            c(i10, constraintWidget2, cVar, z5);
                        } else if (cVar7 == cVar9 && cVar8.f19148f == null) {
                            int iE2 = iD - cVar9.e();
                            constraintWidget2.E(iE2 - constraintWidget2.n(), iE2);
                            c(i10, constraintWidget2, cVar, z5);
                        } else if (cVar7 == cVar8 && (cVar4 = cVar9.f19148f) != null && cVar4.f19145c && !constraintWidget2.u()) {
                            d(i10, constraintWidget2, cVar, z5);
                        }
                    }
                } else if (i11 == 3 && constraintWidget2.f1268u >= 0 && constraintWidget2.f1267t >= 0 && (constraintWidget2.f1247f0 == 8 || (constraintWidget2.f1264q == 0 && constraintWidget2.V == 0.0f))) {
                    if (!constraintWidget2.u() && !constraintWidget2.E && ((cVar7 == cVar8 && (cVar6 = cVar9.f19148f) != null && cVar6.f19145c) || (cVar7 == cVar9 && (cVar5 = cVar8.f19148f) != null && cVar5.f19145c))) {
                        if (!constraintWidget2.u()) {
                            e(i10, constraintWidget, cVar, constraintWidget2, z5);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof r0.f) {
            return;
        }
        HashSet<r0.c> hashSet2 = cVarI2.f19143a;
        if (hashSet2 != null && cVarI2.f19145c) {
            for (r0.c cVar10 : hashSet2) {
                ConstraintWidget constraintWidget3 = cVar10.f19146d;
                int i12 = i7 + 1;
                boolean zA2 = a(constraintWidget3);
                r0.c cVar11 = constraintWidget3.H;
                r0.c cVar12 = constraintWidget3.J;
                if (constraintWidget3.w() && zA2) {
                    ConstraintWidgetContainer.Q(constraintWidget3, cVar, new b());
                }
                boolean z6 = (cVar10 == cVar11 && (cVar3 = cVar12.f19148f) != null && cVar3.f19145c) || (cVar10 == cVar12 && (cVar2 = cVar11.f19148f) != null && cVar2.f19145c);
                int i13 = constraintWidget3.f1262o0[0];
                if (i13 != 3 || zA2) {
                    if (!constraintWidget3.w()) {
                        if (cVar10 == cVar11 && cVar12.f19148f == null) {
                            int iE3 = cVar11.e() + iD2;
                            constraintWidget3.E(iE3, constraintWidget3.n() + iE3);
                            c(i12, constraintWidget3, cVar, z5);
                        } else if (cVar10 == cVar12 && cVar11.f19148f == null) {
                            int iE4 = iD2 - cVar12.e();
                            constraintWidget3.E(iE4 - constraintWidget3.n(), iE4);
                            c(i12, constraintWidget3, cVar, z5);
                        } else if (z6 && !constraintWidget3.u()) {
                            d(i12, constraintWidget3, cVar, z5);
                        }
                    }
                } else if (i13 == 3 && constraintWidget3.f1268u >= 0 && constraintWidget3.f1267t >= 0 && (constraintWidget3.f1247f0 == 8 || (constraintWidget3.f1264q == 0 && constraintWidget3.V == 0.0f))) {
                    if (!constraintWidget3.u() && !constraintWidget3.E && z6 && !constraintWidget3.u()) {
                        e(i12, constraintWidget, cVar, constraintWidget3, z5);
                    }
                }
            }
        }
        constraintWidget.f1255l = true;
    }

    public static void d(int i7, ConstraintWidget constraintWidget, c cVar, boolean z5) {
        float f2 = constraintWidget.f1241c0;
        r0.c cVar2 = constraintWidget.H;
        int iD = cVar2.f19148f.d();
        r0.c cVar3 = constraintWidget.J;
        int iD2 = cVar3.f19148f.d();
        int iE = cVar2.e() + iD;
        int iE2 = iD2 - cVar3.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = constraintWidget.n();
        int i10 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i10 = (iD - iD2) - iN;
        }
        int i11 = ((int) (i10 > 0 ? (f2 * i10) + 0.5f : f2 * i10)) + iD;
        int i12 = i11 + iN;
        if (iD > iD2) {
            i12 = i11 - iN;
        }
        constraintWidget.E(i11, i12);
        c(i7 + 1, constraintWidget, cVar, z5);
    }

    public static void e(int i7, ConstraintWidget constraintWidget, c cVar, ConstraintWidget constraintWidget2, boolean z5) {
        float f2 = constraintWidget2.f1241c0;
        r0.c cVar2 = constraintWidget2.H;
        int iE = cVar2.e() + cVar2.f19148f.d();
        r0.c cVar3 = constraintWidget2.J;
        int iD = cVar3.f19148f.d() - cVar3.e();
        if (iD >= iE) {
            int iN = constraintWidget2.n();
            if (constraintWidget2.f1247f0 != 8) {
                int i10 = constraintWidget2.f1264q;
                if (i10 == 2) {
                    iN = (int) (constraintWidget2.f1241c0 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.n() : constraintWidget.S.n()));
                } else if (i10 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(constraintWidget2.f1267t, iN);
                int i11 = constraintWidget2.f1268u;
                if (i11 > 0) {
                    iN = Math.min(i11, iN);
                }
            }
            int i12 = iE + ((int) ((f2 * ((iD - iE) - iN)) + 0.5f));
            constraintWidget2.E(i12, iN + i12);
            c(i7 + 1, constraintWidget2, cVar, z5);
        }
    }

    public static void f(int i7, ConstraintWidget constraintWidget, c cVar) {
        float f2 = constraintWidget.f1243d0;
        r0.c cVar2 = constraintWidget.I;
        int iD = cVar2.f19148f.d();
        r0.c cVar3 = constraintWidget.K;
        int iD2 = cVar3.f19148f.d();
        int iE = cVar2.e() + iD;
        int iE2 = iD2 - cVar3.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = constraintWidget.k();
        int i10 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i10 = (iD - iD2) - iK;
        }
        int i11 = (int) (i10 > 0 ? (f2 * i10) + 0.5f : f2 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iK;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iK;
        }
        constraintWidget.F(i12, i13);
        i(i7 + 1, constraintWidget, cVar);
    }

    public static void g(int i7, ConstraintWidget constraintWidget, c cVar, ConstraintWidget constraintWidget2) {
        float f2 = constraintWidget2.f1243d0;
        r0.c cVar2 = constraintWidget2.I;
        int iE = cVar2.e() + cVar2.f19148f.d();
        r0.c cVar3 = constraintWidget2.K;
        int iD = cVar3.f19148f.d() - cVar3.e();
        if (iD >= iE) {
            int iK = constraintWidget2.k();
            if (constraintWidget2.f1247f0 != 8) {
                int i10 = constraintWidget2.f1265r;
                if (i10 == 2) {
                    iK = (int) (f2 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.k() : constraintWidget.S.k()));
                } else if (i10 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(constraintWidget2.f1270w, iK);
                int i11 = constraintWidget2.f1271x;
                if (i11 > 0) {
                    iK = Math.min(i11, iK);
                }
            }
            int i12 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            constraintWidget2.F(i12, iK + i12);
            i(i7 + 1, constraintWidget2, cVar);
        }
    }

    public static boolean h(int i7, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i7 != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    public static void i(int i7, ConstraintWidget constraintWidget, c cVar) {
        r0.c cVar2;
        r0.c cVar3;
        float f2;
        r0.c cVar4;
        r0.c cVar5;
        r0.c cVar6;
        if (constraintWidget.f1257m) {
            return;
        }
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.w() && a(constraintWidget)) {
            ConstraintWidgetContainer.Q(constraintWidget, cVar, new b());
        }
        r0.c cVarI = constraintWidget.i(3);
        r0.c cVarI2 = constraintWidget.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<r0.c> hashSet = cVarI.f19143a;
        if (hashSet != null && cVarI.f19145c) {
            for (r0.c cVar7 : hashSet) {
                ConstraintWidget constraintWidget2 = cVar7.f19146d;
                int i10 = i7 + 1;
                boolean zA = a(constraintWidget2);
                r0.c cVar8 = constraintWidget2.I;
                r0.c cVar9 = constraintWidget2.K;
                if (constraintWidget2.w() && zA) {
                    f2 = 0.0f;
                    ConstraintWidgetContainer.Q(constraintWidget2, cVar, new b());
                } else {
                    f2 = 0.0f;
                }
                int i11 = constraintWidget2.f1262o0[1];
                if (i11 != 3 || zA) {
                    if (!constraintWidget2.w()) {
                        if (cVar7 == cVar8 && cVar9.f19148f == null) {
                            int iE = cVar8.e() + iD;
                            constraintWidget2.F(iE, constraintWidget2.k() + iE);
                            i(i10, constraintWidget2, cVar);
                        } else if (cVar7 == cVar9 && cVar9.f19148f == null) {
                            int iE2 = iD - cVar9.e();
                            constraintWidget2.F(iE2 - constraintWidget2.k(), iE2);
                            i(i10, constraintWidget2, cVar);
                        } else if (cVar7 == cVar8 && (cVar4 = cVar9.f19148f) != null && cVar4.f19145c) {
                            f(i10, constraintWidget2, cVar);
                        }
                    }
                } else if (i11 == 3 && constraintWidget2.f1271x >= 0 && constraintWidget2.f1270w >= 0 && (constraintWidget2.f1247f0 == 8 || (constraintWidget2.f1265r == 0 && constraintWidget2.V == f2))) {
                    if (!constraintWidget2.v() && !constraintWidget2.E && ((cVar7 == cVar8 && (cVar6 = cVar9.f19148f) != null && cVar6.f19145c) || (cVar7 == cVar9 && (cVar5 = cVar8.f19148f) != null && cVar5.f19145c))) {
                        if (!constraintWidget2.v()) {
                            g(i10, constraintWidget, cVar, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof r0.f) {
            return;
        }
        HashSet<r0.c> hashSet2 = cVarI2.f19143a;
        if (hashSet2 != null && cVarI2.f19145c) {
            for (r0.c cVar10 : hashSet2) {
                ConstraintWidget constraintWidget3 = cVar10.f19146d;
                int i12 = i7 + 1;
                boolean zA2 = a(constraintWidget3);
                r0.c cVar11 = constraintWidget3.I;
                r0.c cVar12 = constraintWidget3.K;
                if (constraintWidget3.w() && zA2) {
                    ConstraintWidgetContainer.Q(constraintWidget3, cVar, new b());
                }
                boolean z5 = (cVar10 == cVar11 && (cVar3 = cVar12.f19148f) != null && cVar3.f19145c) || (cVar10 == cVar12 && (cVar2 = cVar11.f19148f) != null && cVar2.f19145c);
                int i13 = constraintWidget3.f1262o0[1];
                if (i13 != 3 || zA2) {
                    if (!constraintWidget3.w()) {
                        if (cVar10 == cVar11 && cVar12.f19148f == null) {
                            int iE3 = cVar11.e() + iD2;
                            constraintWidget3.F(iE3, constraintWidget3.k() + iE3);
                            i(i12, constraintWidget3, cVar);
                        } else if (cVar10 == cVar12 && cVar11.f19148f == null) {
                            int iE4 = iD2 - cVar12.e();
                            constraintWidget3.F(iE4 - constraintWidget3.k(), iE4);
                            i(i12, constraintWidget3, cVar);
                        } else if (z5 && !constraintWidget3.v()) {
                            f(i12, constraintWidget3, cVar);
                        }
                    }
                } else if (i13 == 3 && constraintWidget3.f1271x >= 0 && constraintWidget3.f1270w >= 0 && (constraintWidget3.f1247f0 == 8 || (constraintWidget3.f1265r == 0 && constraintWidget3.V == 0.0f))) {
                    if (!constraintWidget3.v() && !constraintWidget3.E && z5 && !constraintWidget3.v()) {
                        g(i12, constraintWidget, cVar, constraintWidget3);
                    }
                }
            }
        }
        r0.c cVarI3 = constraintWidget.i(6);
        if (cVarI3.f19143a != null && cVarI3.f19145c) {
            int iD3 = cVarI3.d();
            for (r0.c cVar13 : cVarI3.f19143a) {
                ConstraintWidget constraintWidget4 = cVar13.f19146d;
                int i14 = i7 + 1;
                boolean zA3 = a(constraintWidget4);
                r0.c cVar14 = constraintWidget4.L;
                if (constraintWidget4.w() && zA3) {
                    ConstraintWidgetContainer.Q(constraintWidget4, cVar, new b());
                }
                if (constraintWidget4.f1262o0[1] != 3 || zA3) {
                    if (!constraintWidget4.w() && cVar13 == cVar14) {
                        int iE5 = cVar13.e() + iD3;
                        if (constraintWidget4.D) {
                            int i15 = iE5 - constraintWidget4.Z;
                            int i16 = constraintWidget4.U + i15;
                            constraintWidget4.Y = i15;
                            constraintWidget4.I.l(i15);
                            constraintWidget4.K.l(i16);
                            cVar14.l(iE5);
                            constraintWidget4.k = true;
                        }
                        i(i14, constraintWidget4, cVar);
                    }
                }
            }
        }
        constraintWidget.f1257m = true;
    }
}
