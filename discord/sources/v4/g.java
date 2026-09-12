package v4;

import ag.a1;
import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21462a = io.sentry.internal.debugmeta.c.D0("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:445:0x0779 A[LOOP:1: B:443:0x0773->B:445:0x0779, LOOP_END] */
    public static s4.b a(w4.b bVar, l4.i iVar) throws EOFException, a1 {
        String strZ;
        s4.b aVar;
        s4.b lVar;
        s4.b mVar;
        s4.b eVar;
        int i7;
        int i10;
        bVar.f();
        int iY = 2;
        while (true) {
            if (!bVar.n()) {
                strZ = null;
                break;
            }
            int iP = bVar.P(f21462a);
            if (iP == 0) {
                strZ = bVar.z();
                break;
            }
            if (iP != 1) {
                bVar.Q();
                bVar.T();
            } else {
                iY = bVar.y();
            }
        }
        if (strZ == null) {
            return null;
        }
        boolean zQ = false;
        boolean zQ2 = false;
        int i11 = 0;
        int i12 = 3;
        switch (strZ) {
            case "el":
                io.sentry.internal.debugmeta.c cVar = e.f21454a;
                boolean z5 = iY == 3;
                boolean zQ3 = false;
                String strZ2 = null;
                r4.e eVarB = null;
                r4.a aVarO = null;
                while (bVar.n()) {
                    int iP2 = bVar.P(e.f21454a);
                    if (iP2 == 0) {
                        strZ2 = bVar.z();
                    } else if (iP2 == 1) {
                        eVarB = a.b(bVar, iVar);
                    } else if (iP2 == 2) {
                        aVarO = gn.h.O(bVar, iVar);
                    } else if (iP2 == 3) {
                        zQ3 = bVar.q();
                    } else if (iP2 != 4) {
                        bVar.Q();
                        bVar.T();
                    } else {
                        z5 = bVar.y() == 3;
                    }
                }
                aVar = new s4.a(strZ2, eVarB, aVarO, z5, zQ3);
                lVar = aVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "fl":
                io.sentry.internal.debugmeta.c cVar2 = y.f21499a;
                int iY2 = 1;
                boolean zQ4 = false;
                boolean zQ5 = false;
                r4.a aVar2 = null;
                String strZ3 = null;
                r4.a aVarK = null;
                while (bVar.n()) {
                    int iP3 = bVar.P(y.f21499a);
                    if (iP3 == 0) {
                        strZ3 = bVar.z();
                    } else if (iP3 == 1) {
                        aVarK = gn.h.K(bVar, iVar);
                    } else if (iP3 == 2) {
                        aVar2 = gn.h.N(bVar, iVar);
                    } else if (iP3 == 3) {
                        zQ4 = bVar.q();
                    } else if (iP3 == 4) {
                        iY2 = bVar.y();
                    } else if (iP3 != 5) {
                        bVar.Q();
                        bVar.T();
                    } else {
                        zQ5 = bVar.q();
                    }
                }
                if (aVar2 == null) {
                    aVar2 = new r4.a(2, Collections.singletonList(new y4.a(100)));
                }
                lVar = new s4.l(strZ3, zQ4, iY2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarK, aVar2, zQ5);
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "gf":
                io.sentry.internal.debugmeta.c cVar3 = l.f21475a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i13 = 0;
                boolean zQ6 = false;
                r4.a aVar3 = null;
                String strZ4 = null;
                r4.a aVarM = null;
                r4.a aVarO2 = null;
                r4.a aVarO3 = null;
                while (bVar.n()) {
                    switch (bVar.P(l.f21475a)) {
                        case 0:
                            strZ4 = bVar.z();
                            break;
                        case 1:
                            bVar.f();
                            int iY3 = -1;
                            while (bVar.n()) {
                                int iP4 = bVar.P(l.f21476b);
                                if (iP4 == 0) {
                                    iY3 = bVar.y();
                                } else if (iP4 != 1) {
                                    bVar.Q();
                                    bVar.T();
                                } else {
                                    aVarM = gn.h.M(bVar, iVar, iY3);
                                }
                            }
                            bVar.i();
                            break;
                        case 2:
                            aVar3 = gn.h.N(bVar, iVar);
                            break;
                        case 3:
                            i13 = bVar.y() != 1 ? 2 : 1;
                            break;
                        case 4:
                            aVarO2 = gn.h.O(bVar, iVar);
                            break;
                        case 5:
                            aVarO3 = gn.h.O(bVar, iVar);
                            break;
                        case 6:
                            fillType = bVar.y() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zQ6 = bVar.q();
                            break;
                        default:
                            bVar.Q();
                            bVar.T();
                            break;
                    }
                }
                if (aVar3 == null) {
                    aVar3 = new r4.a(2, Collections.singletonList(new y4.a(100)));
                }
                lVar = new s4.d(strZ4, i13, fillType, aVarM, aVar3, aVarO2, aVarO3, zQ6);
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "gr":
                io.sentry.internal.debugmeta.c cVar4 = z.f21500a;
                ArrayList arrayList = new ArrayList();
                String strZ5 = null;
                while (bVar.n()) {
                    int iP5 = bVar.P(z.f21500a);
                    if (iP5 == 0) {
                        strZ5 = bVar.z();
                    } else if (iP5 == 1) {
                        zQ = bVar.q();
                    } else if (iP5 != 2) {
                        bVar.T();
                    } else {
                        bVar.c();
                        while (bVar.n()) {
                            s4.b bVarA = a(bVar, iVar);
                            if (bVarA != null) {
                                arrayList.add(bVarA);
                            }
                        }
                        bVar.g();
                    }
                }
                mVar = new s4.m(strZ5, arrayList, zQ);
                lVar = mVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "gs":
                io.sentry.internal.debugmeta.c cVar5 = m.f21477a;
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean zQ7 = false;
                r4.a aVar4 = null;
                String strZ6 = null;
                r4.a aVarM2 = null;
                r4.a aVarO4 = null;
                r4.a aVarO5 = null;
                r4.b bVarL = null;
                r4.b bVar2 = null;
                float fU = 0.0f;
                while (bVar.n()) {
                    switch (bVar.P(m.f21477a)) {
                        case 0:
                            strZ6 = bVar.z();
                            break;
                        case 1:
                            bVar.f();
                            int iY4 = -1;
                            while (bVar.n()) {
                                int iP6 = bVar.P(m.f21478b);
                                if (iP6 == 0) {
                                    iY4 = bVar.y();
                                } else if (iP6 != 1) {
                                    bVar.Q();
                                    bVar.T();
                                } else {
                                    aVarM2 = gn.h.M(bVar, iVar, iY4);
                                }
                            }
                            bVar.i();
                            break;
                        case 2:
                            aVar4 = gn.h.N(bVar, iVar);
                            break;
                        case 3:
                            i14 = bVar.y() != 1 ? 2 : 1;
                            break;
                        case 4:
                            aVarO4 = gn.h.O(bVar, iVar);
                            break;
                        case 5:
                            aVarO5 = gn.h.O(bVar, iVar);
                            break;
                        case 6:
                            bVarL = gn.h.L(bVar, iVar, true);
                            break;
                        case 7:
                            i15 = f0.e.c(3)[bVar.y() - 1];
                            break;
                        case 8:
                            i16 = f0.e.c(3)[bVar.y() - 1];
                            break;
                        case 9:
                            fU = (float) bVar.u();
                            break;
                        case 10:
                            zQ7 = bVar.q();
                            break;
                        case 11:
                            bVar.c();
                            while (bVar.n()) {
                                bVar.f();
                                String strZ7 = null;
                                r4.b bVarL2 = null;
                                while (bVar.n()) {
                                    int iP7 = bVar.P(m.f21479c);
                                    if (iP7 == 0) {
                                        strZ7 = bVar.z();
                                    } else if (iP7 != 1) {
                                        bVar.Q();
                                        bVar.T();
                                    } else {
                                        bVarL2 = gn.h.L(bVar, iVar, true);
                                    }
                                }
                                bVar.i();
                                if (strZ7.equals("o")) {
                                    bVar2 = bVarL2;
                                } else if (strZ7.equals("d") || strZ7.equals("g")) {
                                    iVar.f14875o = true;
                                    arrayList2.add(bVarL2);
                                }
                            }
                            bVar.g();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((r4.b) arrayList2.get(0));
                            }
                            break;
                        default:
                            bVar.Q();
                            bVar.T();
                            break;
                    }
                }
                if (aVar4 == null) {
                    aVar4 = new r4.a(2, Collections.singletonList(new y4.a(100)));
                }
                eVar = new s4.e(strZ6, i14, aVarM2, aVar4, aVarO4, aVarO5, bVarL, i15, i16, fU, arrayList2, bVar2, zQ7);
                lVar = eVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "mm":
                io.sentry.internal.debugmeta.c cVar6 = s.f21492a;
                boolean zQ8 = false;
                String strZ8 = null;
                while (bVar.n()) {
                    int iP8 = bVar.P(s.f21492a);
                    if (iP8 == 0) {
                        strZ8 = bVar.z();
                    } else if (iP8 == 1) {
                        int iY5 = bVar.y();
                        if (iY5 != 1) {
                            if (iY5 == 2) {
                                i11 = 2;
                            } else if (iY5 == 3) {
                                i11 = 3;
                            } else if (iY5 == 4) {
                                i11 = 4;
                            } else if (iY5 == 5) {
                                i11 = 5;
                            }
                        }
                        i11 = 1;
                    } else if (iP8 != 2) {
                        bVar.Q();
                        bVar.T();
                    } else {
                        zQ8 = bVar.q();
                    }
                }
                s4.g gVar = new s4.g(strZ8, i11, zQ8);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                lVar = gVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "rc":
                io.sentry.internal.debugmeta.c cVar7 = u.f21494a;
                boolean zQ9 = false;
                String strZ9 = null;
                r4.e eVarB2 = null;
                r4.a aVarO6 = null;
                r4.b bVarL3 = null;
                while (bVar.n()) {
                    int iP9 = bVar.P(u.f21494a);
                    if (iP9 == 0) {
                        strZ9 = bVar.z();
                    } else if (iP9 == 1) {
                        eVarB2 = a.b(bVar, iVar);
                    } else if (iP9 == 2) {
                        aVarO6 = gn.h.O(bVar, iVar);
                    } else if (iP9 == 3) {
                        bVarL3 = gn.h.L(bVar, iVar, true);
                    } else if (iP9 != 4) {
                        bVar.T();
                    } else {
                        zQ9 = bVar.q();
                    }
                }
                eVar = new s4.i(strZ9, eVarB2, aVarO6, bVarL3, zQ9);
                lVar = eVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "rd":
                io.sentry.internal.debugmeta.c cVar8 = w.f21496a;
                String strZ10 = null;
                r4.b bVarL4 = null;
                while (bVar.n()) {
                    int iP10 = bVar.P(w.f21496a);
                    if (iP10 == 0) {
                        strZ10 = bVar.z();
                    } else if (iP10 == 1) {
                        bVarL4 = gn.h.L(bVar, iVar, true);
                    } else if (iP10 != 2) {
                        bVar.T();
                    } else {
                        zQ2 = bVar.q();
                    }
                }
                lVar = zQ2 ? null : new s4.j(strZ10, bVarL4);
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "rp":
                io.sentry.internal.debugmeta.c cVar9 = v.f21495a;
                boolean zQ10 = false;
                String strZ11 = null;
                r4.b bVarL5 = null;
                r4.b bVarL6 = null;
                r4.d dVarA = null;
                while (bVar.n()) {
                    int iP11 = bVar.P(v.f21495a);
                    if (iP11 == 0) {
                        strZ11 = bVar.z();
                    } else if (iP11 == 1) {
                        bVarL5 = gn.h.L(bVar, iVar, false);
                    } else if (iP11 == 2) {
                        bVarL6 = gn.h.L(bVar, iVar, false);
                    } else if (iP11 == 3) {
                        dVarA = c.a(bVar, iVar);
                    } else if (iP11 != 4) {
                        bVar.T();
                    } else {
                        zQ10 = bVar.q();
                    }
                }
                eVar = new s4.i(strZ11, bVarL5, bVarL6, dVarA, zQ10);
                lVar = eVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "sh":
                io.sentry.internal.debugmeta.c cVar10 = a0.f21443a;
                int iY6 = 0;
                boolean zQ11 = false;
                r4.a aVar5 = null;
                String strZ12 = null;
                while (bVar.n()) {
                    int iP12 = bVar.P(a0.f21443a);
                    if (iP12 == 0) {
                        strZ12 = bVar.z();
                    } else if (iP12 == 1) {
                        iY6 = bVar.y();
                    } else if (iP12 == 2) {
                        aVar5 = new r4.a(5, p.a(bVar, iVar, x4.h.c(), x.f21497d, false));
                    } else if (iP12 != 3) {
                        bVar.T();
                    } else {
                        zQ11 = bVar.q();
                    }
                }
                mVar = new s4.n(strZ12, iY6, aVar5, zQ11);
                lVar = mVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "sr":
                io.sentry.internal.debugmeta.c cVar11 = t.f21493a;
                boolean z6 = iY == 3;
                int i17 = 0;
                boolean zQ12 = false;
                String strZ13 = null;
                r4.b bVarL7 = null;
                r4.e eVarB3 = null;
                r4.b bVarL8 = null;
                r4.b bVarL9 = null;
                r4.b bVarL10 = null;
                r4.b bVarL11 = null;
                r4.b bVarL12 = null;
                while (bVar.n()) {
                    switch (bVar.P(t.f21493a)) {
                        case 0:
                            strZ13 = bVar.z();
                            break;
                        case 1:
                            int iY7 = bVar.y();
                            int[] iArrC = f0.e.c(2);
                            int length = iArrC.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= length) {
                                    i17 = 0;
                                }
                                int i19 = iArrC[i18];
                                if (i19 == 1) {
                                    i7 = 1;
                                } else {
                                    if (i19 != 2) {
                                        throw null;
                                    }
                                    i7 = 2;
                                }
                                if (i7 == iY7) {
                                    i17 = i19;
                                }
                                i18++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            bVarL7 = gn.h.L(bVar, iVar, false);
                            break;
                        case 3:
                            eVarB3 = a.b(bVar, iVar);
                            break;
                        case 4:
                            bVarL8 = gn.h.L(bVar, iVar, false);
                            break;
                        case 5:
                            bVarL10 = gn.h.L(bVar, iVar, true);
                            break;
                        case 6:
                            bVarL12 = gn.h.L(bVar, iVar, false);
                            break;
                        case 7:
                            bVarL9 = gn.h.L(bVar, iVar, true);
                            break;
                        case 8:
                            bVarL11 = gn.h.L(bVar, iVar, false);
                            break;
                        case 9:
                            zQ12 = bVar.q();
                            break;
                        case 10:
                            z6 = bVar.y() == 3;
                            break;
                        default:
                            bVar.Q();
                            bVar.T();
                            break;
                    }
                }
                eVar = new s4.h(strZ13, i17, bVarL7, eVarB3, bVarL8, bVarL9, bVarL10, bVarL11, bVarL12, zQ12, z6);
                lVar = eVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "st":
                io.sentry.internal.debugmeta.c cVar12 = b0.f21447a;
                ArrayList arrayList3 = new ArrayList();
                int i20 = 0;
                int i21 = 0;
                boolean zQ13 = false;
                r4.a aVar6 = null;
                String strZ14 = null;
                r4.b bVar3 = null;
                r4.a aVarK2 = null;
                r4.b bVarL13 = null;
                float fU2 = 0.0f;
                while (bVar.n()) {
                    switch (bVar.P(b0.f21447a)) {
                        case 0:
                            strZ14 = bVar.z();
                            continue;
                        case 1:
                            aVarK2 = gn.h.K(bVar, iVar);
                            continue;
                        case 2:
                            bVarL13 = gn.h.L(bVar, iVar, true);
                            continue;
                        case 3:
                            aVar6 = gn.h.N(bVar, iVar);
                            continue;
                        case 4:
                            i20 = f0.e.c(i12)[bVar.y() - 1];
                            continue;
                        case 5:
                            i21 = f0.e.c(i12)[bVar.y() - 1];
                            continue;
                        case 6:
                            i10 = i12;
                            fU2 = (float) bVar.u();
                            break;
                        case 7:
                            zQ13 = bVar.q();
                            continue;
                        case 8:
                            bVar.c();
                            while (bVar.n()) {
                                bVar.f();
                                r4.b bVarL14 = null;
                                String strZ15 = null;
                                while (bVar.n()) {
                                    int i22 = i12;
                                    int iP13 = bVar.P(b0.f21448b);
                                    if (iP13 == 0) {
                                        strZ15 = bVar.z();
                                    } else if (iP13 != 1) {
                                        bVar.Q();
                                        bVar.T();
                                    } else {
                                        bVarL14 = gn.h.L(bVar, iVar, true);
                                    }
                                    i12 = i22;
                                }
                                int i23 = i12;
                                bVar.i();
                                strZ15.getClass();
                                switch (strZ15) {
                                    case "d":
                                    case "g":
                                        iVar.f14875o = true;
                                        arrayList3.add(bVarL14);
                                        break;
                                    case "o":
                                        bVar3 = bVarL14;
                                        break;
                                }
                                i12 = i23;
                            }
                            i10 = i12;
                            bVar.g();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((r4.b) arrayList3.get(0));
                            }
                            break;
                        default:
                            bVar.T();
                            continue;
                    }
                    i12 = i10;
                }
                if (aVar6 == null) {
                    aVar6 = new r4.a(2, Collections.singletonList(new y4.a(100)));
                }
                lVar = new s4.o(strZ14, bVar3, arrayList3, aVarK2, aVar6, bVarL13, i20 == 0 ? 1 : i20, i21 == 0 ? 1 : i21, fU2, zQ13);
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "tm":
                io.sentry.internal.debugmeta.c cVar13 = c0.f21451a;
                int i24 = 0;
                boolean zQ14 = false;
                String strZ16 = null;
                r4.b bVarL15 = null;
                r4.b bVarL16 = null;
                r4.b bVarL17 = null;
                while (bVar.n()) {
                    int iP14 = bVar.P(c0.f21451a);
                    if (iP14 == 0) {
                        bVarL15 = gn.h.L(bVar, iVar, false);
                    } else if (iP14 == 1) {
                        bVarL16 = gn.h.L(bVar, iVar, false);
                    } else if (iP14 == 2) {
                        bVarL17 = gn.h.L(bVar, iVar, false);
                    } else if (iP14 == 3) {
                        strZ16 = bVar.z();
                    } else if (iP14 == 4) {
                        int iY8 = bVar.y();
                        if (iY8 == 1) {
                            i24 = 1;
                        } else {
                            if (iY8 != 2) {
                                throw new IllegalArgumentException(kk.b.h(iY8, "Unknown trim path type "));
                            }
                            i24 = 2;
                        }
                    } else if (iP14 != 5) {
                        bVar.T();
                    } else {
                        zQ14 = bVar.q();
                    }
                }
                aVar = new s4.p(strZ16, i24, bVarL15, bVarL16, bVarL17, zQ14);
                lVar = aVar;
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            case "tr":
                lVar = c.a(bVar, iVar);
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
            default:
                x4.c.b("Unknown shape type ".concat(strZ));
                while (bVar.n()) {
                    bVar.T();
                }
                bVar.i();
                return lVar;
        }
    }
}
