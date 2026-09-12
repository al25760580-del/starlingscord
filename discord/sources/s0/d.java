package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q {
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19662l;

    public d(ConstraintWidget constraintWidget, int i7) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        ArrayList<q> arrayList = new ArrayList();
        this.k = arrayList;
        this.f19697f = i7;
        ConstraintWidget constraintWidget3 = this.f19693b;
        ConstraintWidget constraintWidgetM = constraintWidget3.m(i7);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidgetM;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetM = constraintWidget3.m(this.f19697f);
            }
        }
        this.f19693b = constraintWidget2;
        int i10 = this.f19697f;
        arrayList.add(i10 == 0 ? constraintWidget2.f1242d : i10 == 1 ? constraintWidget2.f1244e : null);
        ConstraintWidget constraintWidgetL = constraintWidget2.l(this.f19697f);
        while (constraintWidgetL != null) {
            int i11 = this.f19697f;
            arrayList.add(i11 == 0 ? constraintWidgetL.f1242d : i11 == 1 ? constraintWidgetL.f1244e : null);
            constraintWidgetL = constraintWidgetL.l(this.f19697f);
        }
        for (q qVar : arrayList) {
            int i12 = this.f19697f;
            if (i12 == 0) {
                qVar.f19693b.f1238b = this;
            } else if (i12 == 1) {
                qVar.f19693b.f1240c = this;
            }
        }
        if (this.f19697f == 0 && ((ConstraintWidgetContainer) this.f19693b.S).f1279u0 && arrayList.size() > 1) {
            this.f19693b = ((q) kk.b.e(1, arrayList)).f19693b;
        }
        this.f19662l = this.f19697f == 0 ? this.f19693b.h0 : this.f19693b.f1252i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // s0.e
    public final void a(e eVar) {
        int i7;
        int i10;
        boolean z5;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f10;
        h hVar = this.f19699h;
        if (hVar.j) {
            h hVar2 = this.f19700i;
            if (hVar2.j) {
                ConstraintWidget constraintWidget = this.f19693b.S;
                boolean z6 = constraintWidget instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) constraintWidget).f1279u0 : false;
                int i21 = hVar2.f19677g - hVar.f19677g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i22 = 0;
                while (true) {
                    i7 = -1;
                    i10 = 8;
                    if (i22 >= size) {
                        i22 = -1;
                        break;
                    } else if (((q) arrayList.get(i22)).f19693b.f1247f0 != 8) {
                        break;
                    } else {
                        i22++;
                    }
                }
                int i23 = size - 1;
                for (int i24 = i23; i24 >= 0; i24--) {
                    if (((q) arrayList.get(i24)).f19693b.f1247f0 != 8) {
                        i7 = i24;
                        break;
                    }
                }
                int i25 = 0;
                while (true) {
                    if (i25 >= 2) {
                        z5 = z6;
                        f2 = 0.0f;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                        break;
                    }
                    f2 = 0.0f;
                    int i26 = 0;
                    i13 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i26 < size) {
                        q qVar = (q) arrayList.get(i26);
                        ConstraintWidget constraintWidget2 = qVar.f19693b;
                        boolean z7 = z6;
                        if (constraintWidget2.f1247f0 == i10) {
                            i19 = i25;
                        } else {
                            i28++;
                            if (i26 > 0 && i26 >= i22) {
                                i13 += qVar.f19699h.f19676f;
                            }
                            i iVar = qVar.f19696e;
                            int i29 = iVar.f19677g;
                            i19 = i25;
                            boolean z10 = qVar.f19695d != 3;
                            if (z10) {
                                int i30 = this.f19697f;
                                if (i30 == 0 && !constraintWidget2.f1242d.f19696e.j) {
                                    return;
                                }
                                if (i30 == 1 && !constraintWidget2.f1244e.f19696e.j) {
                                    return;
                                }
                            } else {
                                if (qVar.f19692a == 1 && i19 == 0) {
                                    i20 = iVar.f19681m;
                                    i27++;
                                } else {
                                    if (iVar.j) {
                                        i20 = i29;
                                    }
                                    if (z10) {
                                        i13 += i20;
                                    } else {
                                        i27++;
                                        f10 = constraintWidget2.f1253j0[this.f19697f];
                                        if (f10 >= 0.0f) {
                                            f2 += f10;
                                        }
                                    }
                                    if (i26 >= i23 && i26 < i7) {
                                        i13 += -qVar.f19700i.f19676f;
                                    }
                                }
                                z10 = true;
                                if (z10) {
                                    i27++;
                                    f10 = constraintWidget2.f1253j0[this.f19697f];
                                    if (f10 >= 0.0f) {
                                        f2 += f10;
                                    }
                                } else {
                                    i13 += i20;
                                }
                                if (i26 >= i23) {
                                }
                            }
                            i20 = i29;
                            if (z10) {
                                i27++;
                                f10 = constraintWidget2.f1253j0[this.f19697f];
                                if (f10 >= 0.0f) {
                                    f2 += f10;
                                }
                            } else {
                                i13 += i20;
                            }
                            if (i26 >= i23) {
                            }
                        }
                        i26++;
                        z6 = z7;
                        i25 = i19;
                        i10 = 8;
                    }
                    z5 = z6;
                    int i31 = i25;
                    if (i13 < i21 || i27 == 0) {
                        i11 = i27;
                        i12 = i28;
                        break;
                    } else {
                        i25 = i31 + 1;
                        z6 = z5;
                        i10 = 8;
                    }
                }
                int i32 = hVar.f19677g;
                if (z5) {
                    i32 = hVar2.f19677g;
                }
                float f11 = 0.5f;
                if (i13 > i21) {
                    i32 = z5 ? i32 + ((int) (((i13 - i21) / 2.0f) + 0.5f)) : i32 - ((int) (((i13 - i21) / 2.0f) + 0.5f));
                }
                if (i11 > 0) {
                    float f12 = i21 - i13;
                    int i33 = (int) ((f12 / i11) + 0.5f);
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < size) {
                        float f13 = f11;
                        q qVar2 = (q) arrayList.get(i34);
                        int i36 = i32;
                        ConstraintWidget constraintWidget3 = qVar2.f19693b;
                        int i37 = i11;
                        i iVar2 = qVar2.f19696e;
                        float f14 = f12;
                        int i38 = i33;
                        if (constraintWidget3.f1247f0 != 8 && qVar2.f19695d == 3 && !iVar2.j) {
                            int i39 = f2 > 0.0f ? (int) (((constraintWidget3.f1253j0[this.f19697f] * f14) / f2) + f13) : i38;
                            if (this.f19697f == 0) {
                                i17 = constraintWidget3.f1268u;
                                i18 = constraintWidget3.f1267t;
                            } else {
                                i17 = constraintWidget3.f1271x;
                                i18 = constraintWidget3.f1270w;
                            }
                            int iMax = Math.max(i18, qVar2.f19692a == 1 ? Math.min(i39, iVar2.f19681m) : i39);
                            if (i17 > 0) {
                                iMax = Math.min(i17, iMax);
                            }
                            if (iMax != i39) {
                                i35++;
                                i39 = iMax;
                            }
                            iVar2.d(i39);
                        }
                        i34++;
                        i32 = i36;
                        f11 = f13;
                        i11 = i37;
                        f12 = f14;
                        i33 = i38;
                    }
                    i14 = i32;
                    f7 = f11;
                    int i40 = i11;
                    if (i35 > 0) {
                        i11 = i40 - i35;
                        i13 = 0;
                        for (int i41 = 0; i41 < size; i41++) {
                            q qVar3 = (q) arrayList.get(i41);
                            if (qVar3.f19693b.f1247f0 != 8) {
                                if (i41 > 0 && i41 >= i22) {
                                    i13 += qVar3.f19699h.f19676f;
                                }
                                i13 += qVar3.f19696e.f19677g;
                                if (i41 < i23 && i41 < i7) {
                                    i13 += -qVar3.f19700i.f19676f;
                                }
                            }
                        }
                    } else {
                        i11 = i40;
                    }
                    i16 = 2;
                    if (this.f19662l == 2 && i35 == 0) {
                        i15 = 0;
                        this.f19662l = 0;
                    } else {
                        i15 = 0;
                    }
                } else {
                    i14 = i32;
                    f7 = 0.5f;
                    i15 = 0;
                    i16 = 2;
                }
                if (i13 > i21) {
                    this.f19662l = i16;
                }
                if (i12 > 0 && i11 == 0 && i22 == i7) {
                    this.f19662l = i16;
                }
                int i42 = this.f19662l;
                if (i42 == 1) {
                    int i43 = i12 > 1 ? (i21 - i13) / (i12 - 1) : i12 == 1 ? (i21 - i13) / 2 : i15;
                    if (i11 > 0) {
                        i43 = i15;
                    }
                    int i44 = i14;
                    for (int i45 = i15; i45 < size; i45++) {
                        q qVar4 = (q) arrayList.get(z5 ? size - (i45 + 1) : i45);
                        ConstraintWidget constraintWidget4 = qVar4.f19693b;
                        h hVar3 = qVar4.f19700i;
                        h hVar4 = qVar4.f19699h;
                        if (constraintWidget4.f1247f0 == 8) {
                            hVar4.d(i44);
                            hVar3.d(i44);
                        } else {
                            if (i45 > 0) {
                                i44 = z5 ? i44 - i43 : i44 + i43;
                            }
                            if (i45 > 0 && i45 >= i22) {
                                i44 = z5 ? i44 - hVar4.f19676f : i44 + hVar4.f19676f;
                            }
                            if (z5) {
                                hVar3.d(i44);
                            } else {
                                hVar4.d(i44);
                            }
                            i iVar3 = qVar4.f19696e;
                            int i46 = iVar3.f19677g;
                            if (qVar4.f19695d == 3 && qVar4.f19692a == 1) {
                                i46 = iVar3.f19681m;
                            }
                            i44 = z5 ? i44 - i46 : i44 + i46;
                            if (z5) {
                                hVar4.d(i44);
                            } else {
                                hVar3.d(i44);
                            }
                            qVar4.f19698g = true;
                            if (i45 < i23 && i45 < i7) {
                                i44 = z5 ? i44 - (-hVar3.f19676f) : i44 + (-hVar3.f19676f);
                            }
                        }
                    }
                    return;
                }
                if (i42 == 0) {
                    int i47 = (i21 - i13) / (i12 + 1);
                    if (i11 > 0) {
                        i47 = i15;
                    }
                    int i48 = i14;
                    for (int i49 = i15; i49 < size; i49++) {
                        q qVar5 = (q) arrayList.get(z5 ? size - (i49 + 1) : i49);
                        ConstraintWidget constraintWidget5 = qVar5.f19693b;
                        h hVar5 = qVar5.f19700i;
                        h hVar6 = qVar5.f19699h;
                        if (constraintWidget5.f1247f0 == 8) {
                            hVar6.d(i48);
                            hVar5.d(i48);
                        } else {
                            int i50 = z5 ? i48 - i47 : i48 + i47;
                            if (i49 > 0 && i49 >= i22) {
                                i50 = z5 ? i50 - hVar6.f19676f : i50 + hVar6.f19676f;
                            }
                            if (z5) {
                                hVar5.d(i50);
                            } else {
                                hVar6.d(i50);
                            }
                            i iVar4 = qVar5.f19696e;
                            int iMin = iVar4.f19677g;
                            if (qVar5.f19695d == 3 && qVar5.f19692a == 1) {
                                iMin = Math.min(iMin, iVar4.f19681m);
                            }
                            i48 = z5 ? i50 - iMin : i50 + iMin;
                            if (z5) {
                                hVar6.d(i48);
                            } else {
                                hVar5.d(i48);
                            }
                            if (i49 < i23 && i49 < i7) {
                                i48 = z5 ? i48 - (-hVar5.f19676f) : i48 + (-hVar5.f19676f);
                            }
                        }
                    }
                    return;
                }
                if (i42 == 2) {
                    float f15 = this.f19697f == 0 ? this.f19693b.f1241c0 : this.f19693b.f1243d0;
                    if (z5) {
                        f15 = 1.0f - f15;
                    }
                    int i51 = (int) (((i21 - i13) * f15) + f7);
                    if (i51 < 0 || i11 > 0) {
                        i51 = i15;
                    }
                    int i52 = z5 ? i14 - i51 : i14 + i51;
                    for (int i53 = i15; i53 < size; i53++) {
                        q qVar6 = (q) arrayList.get(z5 ? size - (i53 + 1) : i53);
                        ConstraintWidget constraintWidget6 = qVar6.f19693b;
                        h hVar7 = qVar6.f19700i;
                        h hVar8 = qVar6.f19699h;
                        if (constraintWidget6.f1247f0 == 8) {
                            hVar8.d(i52);
                            hVar7.d(i52);
                        } else {
                            if (i53 > 0 && i53 >= i22) {
                                i52 = z5 ? i52 - hVar8.f19676f : i52 + hVar8.f19676f;
                            }
                            if (z5) {
                                hVar7.d(i52);
                            } else {
                                hVar8.d(i52);
                            }
                            i iVar5 = qVar6.f19696e;
                            int i54 = iVar5.f19677g;
                            if (qVar6.f19695d == 3 && qVar6.f19692a == 1) {
                                i54 = iVar5.f19681m;
                            }
                            i52 = z5 ? i52 - i54 : i52 + i54;
                            if (z5) {
                                hVar8.d(i52);
                            } else {
                                hVar7.d(i52);
                            }
                            if (i53 < i23 && i53 < i7) {
                                i52 = z5 ? i52 - (-hVar7.f19676f) : i52 + (-hVar7.f19676f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // s0.q
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((q) arrayList.get(0)).f19693b;
        ConstraintWidget constraintWidget2 = ((q) arrayList.get(size - 1)).f19693b;
        int i7 = this.f19697f;
        h hVar = this.f19700i;
        h hVar2 = this.f19699h;
        if (i7 == 0) {
            r0.c cVar = constraintWidget.H;
            r0.c cVar2 = constraintWidget2.J;
            h hVarI = q.i(cVar, 0);
            int iE = cVar.e();
            ConstraintWidget constraintWidgetM = m();
            if (constraintWidgetM != null) {
                iE = constraintWidgetM.H.e();
            }
            if (hVarI != null) {
                q.b(hVar2, hVarI, iE);
            }
            h hVarI2 = q.i(cVar2, 0);
            int iE2 = cVar2.e();
            ConstraintWidget constraintWidgetN = n();
            if (constraintWidgetN != null) {
                iE2 = constraintWidgetN.J.e();
            }
            if (hVarI2 != null) {
                q.b(hVar, hVarI2, -iE2);
            }
        } else {
            r0.c cVar3 = constraintWidget.I;
            r0.c cVar4 = constraintWidget2.K;
            h hVarI3 = q.i(cVar3, 1);
            int iE3 = cVar3.e();
            ConstraintWidget constraintWidgetM2 = m();
            if (constraintWidgetM2 != null) {
                iE3 = constraintWidgetM2.I.e();
            }
            if (hVarI3 != null) {
                q.b(hVar2, hVarI3, iE3);
            }
            h hVarI4 = q.i(cVar4, 1);
            int iE4 = cVar4.e();
            ConstraintWidget constraintWidgetN2 = n();
            if (constraintWidgetN2 != null) {
                iE4 = constraintWidgetN2.K.e();
            }
            if (hVarI4 != null) {
                q.b(hVar, hVarI4, -iE4);
            }
        }
        hVar2.f19671a = this;
        hVar.f19671a = this;
    }

    @Override // s0.q
    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i7)).e();
            i7++;
        }
    }

    @Override // s0.q
    public final void f() {
        this.f19694c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((q) it.next()).f();
        }
    }

    @Override // s0.q
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            j = ((long) qVar.f19700i.f19676f) + qVar.j() + j + ((long) qVar.f19699h.f19676f);
        }
        return j;
    }

    @Override // s0.q
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((q) arrayList.get(i7)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i7 >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = ((q) arrayList.get(i7)).f19693b;
            if (constraintWidget.f1247f0 != 8) {
                return constraintWidget;
            }
            i7++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = ((q) arrayList.get(size)).f19693b;
            if (constraintWidget.f1247f0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f19697f == 0 ? "horizontal : " : "vertical : ");
        for (q qVar : this.k) {
            sb2.append("<");
            sb2.append(qVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
