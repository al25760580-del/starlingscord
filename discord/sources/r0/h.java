package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f19186a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:188:0x0292  */
    /* JADX WARN: Code duplicated, block: B:205:0x02db  */
    /* JADX WARN: Code duplicated, block: B:207:0x02de  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0376  */
    /* JADX WARN: Code duplicated, block: B:234:0x0392  */
    /* JADX WARN: Code duplicated, block: B:236:0x0397  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:251:0x042b  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:414:0x06be  */
    /* JADX WARN: Code duplicated, block: B:416:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:418:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void a(ConstraintWidgetContainer constraintWidgetContainer, p0.c cVar, ArrayList arrayList, int i7) {
        int i10;
        b[] bVarArr;
        int i11;
        int i12;
        boolean z5;
        boolean z6;
        boolean z7;
        int i13;
        ConstraintWidget constraintWidget;
        p0.c cVar2;
        p0.e eVar;
        c cVar3;
        p0.e eVar2;
        ConstraintWidget constraintWidget2;
        int i14;
        c cVar4;
        p0.e eVar3;
        ConstraintWidget constraintWidget3;
        int i15;
        c[] cVarArr;
        int i16;
        c cVar5;
        c cVar6;
        p0.e eVar4;
        c cVar7;
        p0.e eVar5;
        int size;
        ArrayList arrayList2;
        int i17;
        float f2;
        p0.e eVar6;
        p0.e eVar7;
        p0.e eVar8;
        p0.e eVar9;
        p0.b bVarL;
        float f7;
        c cVar8;
        ConstraintWidget constraintWidget4;
        int i18;
        int i19;
        ConstraintWidget constraintWidget5;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        if (i7 == 0) {
            i10 = constraintWidgetContainer2.f1283y0;
            bVarArr = constraintWidgetContainer2.B0;
            i11 = 0;
        } else {
            i10 = constraintWidgetContainer2.f1284z0;
            bVarArr = constraintWidgetContainer2.A0;
            i11 = 2;
        }
        int i20 = i10;
        b[] bVarArr2 = bVarArr;
        int i21 = 0;
        while (i21 < i20) {
            b bVar = bVarArr2[i21];
            boolean z10 = bVar.f19142q;
            ConstraintWidget constraintWidget6 = bVar.f19128a;
            c[] cVarArr2 = constraintWidget6.P;
            int i22 = 3;
            int i23 = 8;
            float f10 = 0.0f;
            if (z10) {
                i12 = i21;
            } else {
                int i24 = bVar.f19137l;
                int i25 = i24 * 2;
                ConstraintWidget constraintWidget7 = constraintWidget6;
                ConstraintWidget constraintWidget8 = constraintWidget7;
                boolean z11 = false;
                while (!z11) {
                    bVar.f19136i++;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget7.f1256l0;
                    c[] cVarArr3 = constraintWidget7.P;
                    constraintWidgetArr[i24] = null;
                    constraintWidget7.f1254k0[i24] = null;
                    if (constraintWidget7.f1247f0 != i23) {
                        constraintWidget7.j(i24);
                        cVarArr3[i25].e();
                        int i26 = i25 + 1;
                        cVarArr3[i26].e();
                        cVarArr3[i25].e();
                        cVarArr3[i26].e();
                        if (bVar.f19129b == null) {
                            bVar.f19129b = constraintWidget7;
                        }
                        bVar.f19131d = constraintWidget7;
                        int i27 = constraintWidget7.f1262o0[i24];
                        if (i27 == i22) {
                            int i28 = constraintWidget7.f1266s[i24];
                            if (i28 == 0 || i28 == i22 || i28 == 2) {
                                bVar.j++;
                                float f11 = constraintWidget7.f1253j0[i24];
                                if (f11 > 0.0f) {
                                    bVar.k += f11;
                                }
                                i19 = i24;
                                if (constraintWidget7.f1247f0 != 8 && i27 == 3 && (i28 == 0 || i28 == 3)) {
                                    if (f11 < 0.0f) {
                                        bVar.f19139n = true;
                                    } else {
                                        bVar.f19140o = true;
                                    }
                                    if (bVar.f19135h == null) {
                                        bVar.f19135h = new ArrayList();
                                    }
                                    bVar.f19135h.add(constraintWidget7);
                                }
                                if (bVar.f19133f == null) {
                                    bVar.f19133f = constraintWidget7;
                                }
                                ConstraintWidget constraintWidget9 = bVar.f19134g;
                                if (constraintWidget9 != null) {
                                    constraintWidget9.f1254k0[i19] = constraintWidget7;
                                }
                                bVar.f19134g = constraintWidget7;
                            } else {
                                i21 = i21;
                                i19 = i24;
                            }
                            if (i19 == 0) {
                                if (constraintWidget7.f1264q == 0 && constraintWidget7.f1267t == 0) {
                                    int i29 = constraintWidget7.f1268u;
                                }
                            } else if (constraintWidget7.f1265r == 0 && constraintWidget7.f1270w == 0) {
                                int i30 = constraintWidget7.f1271x;
                            }
                        } else {
                            i21 = i21;
                            i19 = i24;
                        }
                    } else {
                        i21 = i21;
                        i19 = i24;
                    }
                    ConstraintWidget constraintWidget10 = constraintWidget8;
                    if (constraintWidget10 != constraintWidget7) {
                        constraintWidget10.f1256l0[i19] = constraintWidget7;
                    }
                    c cVar9 = cVarArr3[i25 + 1].f19148f;
                    if (cVar9 != null) {
                        constraintWidget5 = cVar9.f19146d;
                        c cVar10 = constraintWidget5.P[i25].f19148f;
                        if (cVar10 == null || cVar10.f19146d != constraintWidget7) {
                            constraintWidget5 = null;
                        }
                    } else {
                        constraintWidget5 = null;
                    }
                    if (constraintWidget5 == null) {
                        constraintWidget5 = constraintWidget7;
                        z11 = true;
                    }
                    constraintWidget8 = constraintWidget7;
                    i24 = i19;
                    i22 = 3;
                    i23 = 8;
                    constraintWidget7 = constraintWidget5;
                    i21 = i21;
                }
                i12 = i21;
                int i31 = i24;
                ConstraintWidget constraintWidget11 = bVar.f19129b;
                if (constraintWidget11 != null) {
                    constraintWidget11.P[i25].e();
                }
                ConstraintWidget constraintWidget12 = bVar.f19131d;
                if (constraintWidget12 != null) {
                    constraintWidget12.P[i25 + 1].e();
                }
                bVar.f19130c = constraintWidget7;
                if (i31 == 0 && bVar.f19138m) {
                    bVar.f19132e = constraintWidget7;
                } else {
                    bVar.f19132e = constraintWidget6;
                }
                bVar.f19141p = bVar.f19140o && bVar.f19139n;
            }
            bVar.f19142q = true;
            if (arrayList == 0 || arrayList.contains(constraintWidget6)) {
                ConstraintWidget constraintWidget13 = bVar.f19130c;
                ConstraintWidget constraintWidget14 = bVar.f19129b;
                ConstraintWidget constraintWidget15 = bVar.f19131d;
                ConstraintWidget constraintWidget16 = bVar.f19132e;
                float f12 = bVar.k;
                int[] iArr = constraintWidgetContainer2.f1262o0;
                c[] cVarArr4 = constraintWidgetContainer2.P;
                boolean z12 = iArr[i7] == 2;
                if (i7 == 0) {
                    int i32 = constraintWidget16.h0;
                    boolean z13 = i32 == 0;
                    boolean z14 = i32 == 1;
                    z5 = i32 == 2;
                    z7 = z14;
                    z6 = z13;
                } else {
                    int i33 = constraintWidget16.f1252i0;
                    boolean z15 = i33 == 0;
                    boolean z16 = i33 == 1;
                    z5 = i33 == 2;
                    z6 = z15;
                    z7 = z16;
                }
                boolean z17 = false;
                while (!z17) {
                    c[] cVarArr5 = constraintWidget6.P;
                    int[] iArr2 = constraintWidget6.f1262o0;
                    c cVar11 = cVarArr5[i11];
                    int i34 = z5 ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z18 = z12;
                    boolean z19 = z5;
                    boolean z20 = iArr2[i7] == 3 && constraintWidget6.f1266s[i7] == 0;
                    c cVar12 = cVar11.f19148f;
                    if (cVar12 != null && constraintWidget6 != constraintWidget6) {
                        iE = cVar12.e() + iE;
                    }
                    int i35 = iE;
                    if (z19 && constraintWidget6 != constraintWidget6 && constraintWidget6 != constraintWidget14) {
                        i34 = 8;
                    }
                    ConstraintWidget constraintWidget17 = constraintWidget6;
                    c cVar13 = cVar11.f19148f;
                    if (cVar13 != null) {
                        if (constraintWidget6 == constraintWidget14) {
                            cVar.f(cVar11.f19151i, cVar13.f19151i, i35, 6);
                        } else {
                            cVar.f(cVar11.f19151i, cVar13.f19151i, i35, 8);
                        }
                        if (z20 && !z19) {
                            i34 = 5;
                        }
                        cVar.e(cVar11.f19151i, cVar11.f19148f.f19151i, i35, (constraintWidget6 == constraintWidget14 && z19 && constraintWidget6.R[i7]) ? 5 : i34);
                    }
                    if (z18) {
                        if (constraintWidget6.f1247f0 == 8 || iArr2[i7] != 3) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                            cVar.f(cVarArr5[i11 + 1].f19151i, cVarArr5[i11].f19151i, 0, 5);
                        }
                        cVar.f(cVarArr5[i11].f19151i, cVarArr4[i11].f19151i, i18, 8);
                    }
                    c cVar14 = cVarArr5[i11 + 1].f19148f;
                    if (cVar14 != null) {
                        constraintWidget4 = cVar14.f19146d;
                        c cVar15 = constraintWidget4.P[i11].f19148f;
                        if (cVar15 == null || cVar15.f19146d != constraintWidget6) {
                            constraintWidget4 = null;
                        }
                    } else {
                        constraintWidget4 = null;
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget6 = constraintWidget4;
                    } else {
                        z17 = true;
                    }
                    constraintWidget6 = constraintWidget17;
                    z12 = z18;
                    z5 = z19;
                }
                boolean z21 = z12;
                boolean z22 = z5;
                if (constraintWidget15 != null) {
                    int i36 = i11 + 1;
                    if (constraintWidget13.P[i36].f19148f != null) {
                        c cVar16 = constraintWidget15.P[i36];
                        if (constraintWidget15.f1262o0[i7] == 3 && constraintWidget15.f1266s[i7] == 0 && !z22) {
                            c cVar17 = cVar16.f19148f;
                            if (cVar17.f19146d == constraintWidgetContainer2) {
                                cVar.e(cVar16.f19151i, cVar17.f19151i, -cVar16.e(), 5);
                            } else if (z22) {
                                cVar8 = cVar16.f19148f;
                                if (cVar8.f19146d == constraintWidgetContainer2) {
                                    cVar.e(cVar16.f19151i, cVar8.f19151i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z22) {
                            cVar8 = cVar16.f19148f;
                            if (cVar8.f19146d == constraintWidgetContainer2) {
                                cVar.e(cVar16.f19151i, cVar8.f19151i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.f19151i, constraintWidget13.P[i36].f19148f.f19151i, -cVar16.e(), 6);
                    }
                }
                if (z21) {
                    int i37 = i11 + 1;
                    p0.e eVar10 = cVarArr4[i37].f19151i;
                    c cVar18 = constraintWidget13.P[i37];
                    cVar.f(eVar10, cVar18.f19151i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.f19135h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.f19139n && !bVar.f19141p) {
                        f12 = bVar.j;
                    }
                    ConstraintWidget constraintWidget18 = null;
                    float f13 = 0.0f;
                    int i38 = 0;
                    while (i38 < size) {
                        ConstraintWidget constraintWidget19 = (ConstraintWidget) arrayList3.get(i38);
                        float[] fArr = constraintWidget19.f1253j0;
                        c[] cVarArr6 = constraintWidget19.P;
                        float f14 = fArr[i7];
                        if (f14 >= f10) {
                            arrayList2 = arrayList3;
                            i17 = size;
                            if (f14 == f10) {
                                cVar.e(cVarArr6[i11 + 1].f19151i, cVarArr6[i11].f19151i, 0, 8);
                                i38 = i38;
                                f2 = f10;
                                f13 = f13;
                                i20 = i20;
                            } else {
                                float f15 = f13;
                                if (constraintWidget18 != null) {
                                    c[] cVarArr7 = constraintWidget18.P;
                                    eVar6 = cVarArr7[i11].f19151i;
                                    int i39 = i11 + 1;
                                    eVar7 = cVarArr7[i39].f19151i;
                                    eVar8 = cVarArr6[i11].f19151i;
                                    eVar9 = cVarArr6[i39].f19151i;
                                    bVarL = cVar.l();
                                    f7 = f10;
                                    bVarL.f17734b = f7;
                                    f2 = f7;
                                    if (f12 != f7 || f15 == f14) {
                                        bVarL.f17736d.g(eVar6, 1.0f);
                                        bVarL.f17736d.g(eVar7, -1.0f);
                                        bVarL.f17736d.g(eVar9, 1.0f);
                                        bVarL.f17736d.g(eVar8, -1.0f);
                                    } else if (f15 == f2) {
                                        bVarL.f17736d.g(eVar6, 1.0f);
                                        bVarL.f17736d.g(eVar7, -1.0f);
                                    } else if (f14 == f10) {
                                        bVarL.f17736d.g(eVar8, 1.0f);
                                        bVarL.f17736d.g(eVar9, -1.0f);
                                    } else {
                                        float f16 = (f15 / f12) / (f14 / f12);
                                        bVarL.f17736d.g(eVar6, 1.0f);
                                        bVarL.f17736d.g(eVar7, -1.0f);
                                        bVarL.f17736d.g(eVar9, f16);
                                        bVarL.f17736d.g(eVar8, -f16);
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i38 = i38;
                                    f2 = f10;
                                    i20 = i20;
                                }
                                f13 = f14;
                                constraintWidget18 = constraintWidget19;
                            }
                        } else {
                            if (bVar.f19141p) {
                                arrayList2 = arrayList3;
                                i17 = size;
                                cVar.e(cVarArr6[i11 + 1].f19151i, cVarArr6[i11].f19151i, 0, 4);
                            } else {
                                f14 = 1.0f;
                                arrayList2 = arrayList3;
                                i17 = size;
                                if (f14 == f10) {
                                    cVar.e(cVarArr6[i11 + 1].f19151i, cVarArr6[i11].f19151i, 0, 8);
                                } else {
                                    float f17 = f13;
                                    if (constraintWidget18 != null) {
                                        c[] cVarArr8 = constraintWidget18.P;
                                        eVar6 = cVarArr8[i11].f19151i;
                                        int i310 = i11 + 1;
                                        eVar7 = cVarArr8[i310].f19151i;
                                        eVar8 = cVarArr6[i11].f19151i;
                                        eVar9 = cVarArr6[i310].f19151i;
                                        bVarL = cVar.l();
                                        f7 = f10;
                                        bVarL.f17734b = f7;
                                        f2 = f7;
                                        if (f12 != f7) {
                                            bVarL.f17736d.g(eVar6, 1.0f);
                                            bVarL.f17736d.g(eVar7, -1.0f);
                                            bVarL.f17736d.g(eVar9, 1.0f);
                                            bVarL.f17736d.g(eVar8, -1.0f);
                                        } else {
                                            bVarL.f17736d.g(eVar6, 1.0f);
                                            bVarL.f17736d.g(eVar7, -1.0f);
                                            bVarL.f17736d.g(eVar9, 1.0f);
                                            bVarL.f17736d.g(eVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i38 = i38;
                                        f2 = f10;
                                        i20 = i20;
                                    }
                                    f13 = f14;
                                    constraintWidget18 = constraintWidget19;
                                }
                            }
                            i38 = i38;
                            f2 = f10;
                            f13 = f13;
                            i20 = i20;
                        }
                        i38++;
                        i20 = i20;
                        arrayList3 = arrayList2;
                        size = i17;
                        f10 = f2;
                    }
                }
                i13 = i20;
                if (constraintWidget14 == null || !(constraintWidget14 == constraintWidget15 || z22)) {
                    constraintWidget = constraintWidget15;
                    if (!z6 || constraintWidget14 == null) {
                        int i40 = 8;
                        if (z7 && constraintWidget14 != null) {
                            int i41 = bVar.j;
                            boolean z23 = i41 > 0 && bVar.f19136i == i41;
                            ConstraintWidget constraintWidget20 = constraintWidget14;
                            ConstraintWidget constraintWidget21 = constraintWidget20;
                            while (constraintWidget21 != null) {
                                c[] cVarArr9 = constraintWidget21.P;
                                ConstraintWidget constraintWidget22 = constraintWidget21.f1256l0[i7];
                                while (constraintWidget22 != null && constraintWidget22.f1247f0 == i40) {
                                    constraintWidget22 = constraintWidget22.f1256l0[i7];
                                }
                                if (constraintWidget21 == constraintWidget14 || constraintWidget21 == constraintWidget || constraintWidget22 == null) {
                                    constraintWidget20 = constraintWidget20;
                                } else {
                                    if (constraintWidget22 == constraintWidget) {
                                        constraintWidget22 = null;
                                    }
                                    c cVar19 = cVarArr9[i11];
                                    p0.e eVar11 = cVar19.f19151i;
                                    int i42 = i11 + 1;
                                    p0.e eVar12 = constraintWidget20.P[i42].f19151i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr9[i42].e();
                                    if (constraintWidget22 != null) {
                                        cVar3 = constraintWidget22.P[i11];
                                        eVar2 = cVar3.f19151i;
                                        c cVar20 = cVar3.f19148f;
                                        eVar = cVar20 != null ? cVar20.f19151i : null;
                                    } else {
                                        c cVar21 = constraintWidget.P[i11];
                                        p0.e eVar13 = cVar21 != null ? cVar21.f19151i : null;
                                        eVar = cVarArr9[i42].f19151i;
                                        cVar3 = cVar21;
                                        eVar2 = eVar13;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = iE2 + constraintWidget20.P[i42].e();
                                    ConstraintWidget constraintWidget23 = constraintWidget22;
                                    p0.e eVar14 = eVar2;
                                    int i43 = z23 ? 8 : 4;
                                    if (eVar11 == null || eVar12 == null || eVar14 == null || eVar == null) {
                                        constraintWidget2 = constraintWidget23;
                                    } else {
                                        constraintWidget2 = constraintWidget23;
                                        cVar.b(eVar11, eVar12, iE4, 0.5f, eVar14, eVar, iE3, i43);
                                    }
                                    constraintWidget22 = constraintWidget2;
                                }
                                if (constraintWidget21.f1247f0 != 8) {
                                    constraintWidget20 = constraintWidget21;
                                }
                                constraintWidget21 = constraintWidget22;
                                constraintWidget20 = constraintWidget20;
                                i40 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = constraintWidget14.P[i11];
                            c cVar23 = cVarArr2[i11].f19148f;
                            int i44 = i11 + 1;
                            c cVar24 = constraintWidget.P[i44];
                            c cVar25 = constraintWidget13.P[i44].f19148f;
                            if (cVar23 != null) {
                                if (constraintWidget14 != constraintWidget) {
                                    cVar2.e(cVar22.f19151i, cVar23.f19151i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.f19151i, cVar23.f19151i, cVar22.e(), 0.5f, cVar24.f19151i, cVar25.f19151i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && constraintWidget14 != constraintWidget) {
                                cVar2.e(cVar24.f19151i, cVar25.f19151i, -cVar24.e(), 5);
                            }
                        }
                        if ((z6 || z7) && constraintWidget14 != null && constraintWidget14 != constraintWidget) {
                            cVarArr = constraintWidget14.P;
                            c cVar26 = cVarArr[i11];
                            if (constraintWidget == null) {
                                constraintWidget = constraintWidget14;
                            }
                            c[] cVarArr10 = constraintWidget.P;
                            i16 = i11 + 1;
                            cVar5 = cVarArr10[i16];
                            cVar6 = cVar26.f19148f;
                            if (cVar6 != null) {
                                eVar4 = cVar6.f19151i;
                            } else {
                                eVar4 = null;
                            }
                            cVar7 = cVar5.f19148f;
                            if (cVar7 != null) {
                                eVar5 = cVar7.f19151i;
                            } else {
                                eVar5 = null;
                            }
                            if (constraintWidget13 != constraintWidget) {
                                c cVar27 = constraintWidget13.P[i16].f19148f;
                                eVar5 = cVar27 != null ? cVar27.f19151i : null;
                            }
                            if (constraintWidget14 == constraintWidget) {
                                cVar5 = cVarArr[i16];
                            }
                            if (eVar4 == null && eVar5 != null) {
                                cVar2.b(cVar26.f19151i, eVar4, cVar26.e(), 0.5f, eVar5, cVar5.f19151i, cVarArr10[i16].e(), 5);
                            }
                        }
                    } else {
                        int i45 = bVar.j;
                        boolean z24 = i45 > 0 && bVar.f19136i == i45;
                        ConstraintWidget constraintWidget24 = constraintWidget14;
                        ConstraintWidget constraintWidget25 = constraintWidget24;
                        while (constraintWidget24 != null) {
                            c[] cVarArr11 = constraintWidget24.P;
                            ConstraintWidget constraintWidget26 = constraintWidget24.f1256l0[i7];
                            while (true) {
                                if (constraintWidget26 == null) {
                                    i14 = 8;
                                    break;
                                }
                                i14 = 8;
                                if (constraintWidget26.f1247f0 != 8) {
                                    break;
                                } else {
                                    constraintWidget26 = constraintWidget26.f1256l0[i7];
                                }
                            }
                            if (constraintWidget26 != null || constraintWidget24 == constraintWidget) {
                                c cVar28 = cVarArr11[i11];
                                p0.e eVar15 = cVar28.f19151i;
                                c cVar29 = cVar28.f19148f;
                                p0.e eVar16 = cVar29 != null ? cVar29.f19151i : null;
                                if (constraintWidget25 != constraintWidget24) {
                                    eVar16 = constraintWidget25.P[i11 + 1].f19151i;
                                } else if (constraintWidget24 == constraintWidget14) {
                                    c cVar30 = cVarArr2[i11].f19148f;
                                    eVar16 = cVar30 != null ? cVar30.f19151i : null;
                                }
                                int iE5 = cVar28.e();
                                int i46 = i11 + 1;
                                int iE6 = cVarArr11[i46].e();
                                if (constraintWidget26 != null) {
                                    cVar4 = constraintWidget26.P[i11];
                                    eVar3 = cVar4.f19151i;
                                } else {
                                    cVar4 = constraintWidget13.P[i46].f19148f;
                                    eVar3 = cVar4 != null ? cVar4.f19151i : null;
                                }
                                p0.e eVar17 = cVarArr11[i46].f19151i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = constraintWidget25.P[i46].e() + iE5;
                                if (eVar15 == null || eVar16 == null || eVar3 == null || eVar17 == null) {
                                    constraintWidget3 = constraintWidget26;
                                    i15 = 8;
                                } else {
                                    if (constraintWidget24 == constraintWidget14) {
                                        iE7 = constraintWidget14.P[i11].e();
                                    }
                                    if (constraintWidget24 == constraintWidget) {
                                        iE6 = constraintWidget.P[i46].e();
                                    }
                                    constraintWidget3 = constraintWidget26;
                                    i15 = 8;
                                    cVar.b(eVar15, eVar16, iE7, 0.5f, eVar3, eVar17, iE6, z24 ? 8 : 5);
                                }
                            } else {
                                constraintWidget3 = constraintWidget26;
                                i15 = i14;
                            }
                            if (constraintWidget24.f1247f0 != i15) {
                                constraintWidget25 = constraintWidget24;
                            }
                            constraintWidget24 = constraintWidget3;
                            constraintWidget25 = constraintWidget25;
                            cVarArr2 = cVarArr2;
                        }
                    }
                } else {
                    c cVar31 = cVarArr2[i11];
                    int i47 = i11 + 1;
                    c cVar32 = constraintWidget13.P[i47];
                    c cVar33 = cVar31.f19148f;
                    p0.e eVar18 = cVar33 != null ? cVar33.f19151i : null;
                    c cVar34 = cVar32.f19148f;
                    p0.e eVar19 = cVar34 != null ? cVar34.f19151i : null;
                    c cVar35 = constraintWidget14.P[i11];
                    if (constraintWidget15 != null) {
                        cVar32 = constraintWidget15.P[i47];
                    }
                    if (eVar18 == null || eVar19 == null) {
                        constraintWidget = constraintWidget15;
                    } else {
                        float f18 = i7 == 0 ? constraintWidget16.f1241c0 : constraintWidget16.f1243d0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        p0.e eVar20 = cVar35.f19151i;
                        p0.e eVar21 = cVar32.f19151i;
                        p0.e eVar22 = eVar18;
                        constraintWidget = constraintWidget15;
                        cVar.b(eVar20, eVar22, iE8, f18, eVar19, eVar21, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z6) {
                    cVarArr = constraintWidget14.P;
                    c cVar210 = cVarArr[i11];
                    if (constraintWidget == null) {
                        constraintWidget = constraintWidget14;
                    }
                    c[] cVarArr12 = constraintWidget.P;
                    i16 = i11 + 1;
                    cVar5 = cVarArr12[i16];
                    cVar6 = cVar210.f19148f;
                    if (cVar6 != null) {
                        eVar4 = cVar6.f19151i;
                    } else {
                        eVar4 = null;
                    }
                    cVar7 = cVar5.f19148f;
                    if (cVar7 != null) {
                        eVar5 = cVar7.f19151i;
                    } else {
                        eVar5 = null;
                    }
                    if (constraintWidget13 != constraintWidget) {
                        c cVar211 = constraintWidget13.P[i16].f19148f;
                        eVar5 = cVar211 != null ? cVar211.f19151i : null;
                    }
                    if (constraintWidget14 == constraintWidget) {
                        cVar5 = cVarArr[i16];
                    }
                    if (eVar4 == null) {
                    }
                } else {
                    cVarArr = constraintWidget14.P;
                    c cVar212 = cVarArr[i11];
                    if (constraintWidget == null) {
                        constraintWidget = constraintWidget14;
                    }
                    c[] cVarArr13 = constraintWidget.P;
                    i16 = i11 + 1;
                    cVar5 = cVarArr13[i16];
                    cVar6 = cVar212.f19148f;
                    if (cVar6 != null) {
                        eVar4 = cVar6.f19151i;
                    } else {
                        eVar4 = null;
                    }
                    cVar7 = cVar5.f19148f;
                    if (cVar7 != null) {
                        eVar5 = cVar7.f19151i;
                    } else {
                        eVar5 = null;
                    }
                    if (constraintWidget13 != constraintWidget) {
                        c cVar213 = constraintWidget13.P[i16].f19148f;
                        eVar5 = cVar213 != null ? cVar213.f19151i : null;
                    }
                    if (constraintWidget14 == constraintWidget) {
                        cVar5 = cVarArr[i16];
                    }
                    if (eVar4 == null) {
                    }
                }
            } else {
                i13 = i20;
            }
            i21 = i12 + 1;
            constraintWidgetContainer2 = constraintWidgetContainer;
            i20 = i13;
        }
    }

    public static void b(ConstraintWidgetContainer constraintWidgetContainer, p0.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f1259n = -1;
        c cVar2 = constraintWidget.L;
        int[] iArr = constraintWidget.f1262o0;
        c cVar3 = constraintWidget.K;
        c cVar4 = constraintWidget.I;
        c cVar5 = constraintWidget.J;
        c cVar6 = constraintWidget.H;
        constraintWidget.f1261o = -1;
        int[] iArr2 = constraintWidgetContainer.f1262o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i7 = cVar6.f19149g;
            int iN = constraintWidgetContainer.n() - cVar5.f19149g;
            cVar6.f19151i = cVar.k(cVar6);
            cVar5.f19151i = cVar.k(cVar5);
            cVar.d(cVar6.f19151i, i7);
            cVar.d(cVar5.f19151i, iN);
            constraintWidget.f1259n = 2;
            constraintWidget.X = i7;
            int i10 = iN - i7;
            constraintWidget.T = i10;
            int i11 = constraintWidget.a0;
            if (i10 < i11) {
                constraintWidget.T = i11;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i12 = cVar4.f19149g;
        int iK = constraintWidgetContainer.k() - cVar3.f19149g;
        cVar4.f19151i = cVar.k(cVar4);
        cVar3.f19151i = cVar.k(cVar3);
        cVar.d(cVar4.f19151i, i12);
        cVar.d(cVar3.f19151i, iK);
        if (constraintWidget.Z > 0 || constraintWidget.f1247f0 == 8) {
            p0.e eVarK = cVar.k(cVar2);
            cVar2.f19151i = eVarK;
            cVar.d(eVarK, constraintWidget.Z + i12);
        }
        constraintWidget.f1261o = 2;
        constraintWidget.Y = i12;
        int i13 = iK - i12;
        constraintWidget.U = i13;
        int i14 = constraintWidget.f1239b0;
        if (i13 < i14) {
            constraintWidget.U = i14;
        }
    }

    public static final boolean c(int i7, int i10) {
        return (i7 & i10) == i10;
    }
}
