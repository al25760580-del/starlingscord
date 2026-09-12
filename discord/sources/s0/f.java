package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidgetContainer f19663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintWidgetContainer f19666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f19667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f19668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f19669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f19670h;

    public final void a(h hVar, int i7, ArrayList arrayList, n nVar) {
        q qVar = hVar.f19674d;
        n nVar2 = qVar.f19694c;
        h hVar2 = qVar.f19700i;
        h hVar3 = qVar.f19699h;
        if (nVar2 == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f19663a;
            if (qVar == constraintWidgetContainer.f1242d || qVar == constraintWidgetContainer.f1244e) {
                return;
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f19683a = null;
                nVar.f19684b = new ArrayList();
                nVar.f19683a = qVar;
                arrayList.add(nVar);
            }
            qVar.f19694c = nVar;
            nVar.f19684b.add(qVar);
            for (e eVar : hVar3.k) {
                if (eVar instanceof h) {
                    a((h) eVar, i7, arrayList, nVar);
                }
            }
            for (e eVar2 : hVar2.k) {
                if (eVar2 instanceof h) {
                    a((h) eVar2, i7, arrayList, nVar);
                }
            }
            if (i7 == 1 && (qVar instanceof o)) {
                for (e eVar3 : ((o) qVar).k.k) {
                    if (eVar3 instanceof h) {
                        a((h) eVar3, i7, arrayList, nVar);
                    }
                }
            }
            Iterator it = hVar3.f19680l.iterator();
            while (it.hasNext()) {
                a((h) it.next(), i7, arrayList, nVar);
            }
            Iterator it2 = hVar2.f19680l.iterator();
            while (it2.hasNext()) {
                a((h) it2.next(), i7, arrayList, nVar);
            }
            if (i7 == 1 && (qVar instanceof o)) {
                Iterator it3 = ((o) qVar).k.f19680l.iterator();
                while (it3.hasNext()) {
                    a((h) it3.next(), i7, arrayList, nVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0303  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:150:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0226 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[ADDED_TO_REGION] */
    public final void b(ConstraintWidgetContainer constraintWidgetContainer) {
        int i7;
        int iN;
        int iK;
        int iK2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f2;
        int i22;
        int i23;
        ArrayList<ConstraintWidget> arrayList = constraintWidgetContainer.f1274p0;
        int[] iArr = constraintWidgetContainer.f1262o0;
        for (ConstraintWidget constraintWidget : arrayList) {
            int[] iArr2 = constraintWidget.f1262o0;
            r0.c[] cVarArr = constraintWidget.P;
            r0.c cVar = constraintWidget.K;
            r0.c cVar2 = constraintWidget.I;
            r0.c cVar3 = constraintWidget.J;
            r0.c cVar4 = constraintWidget.H;
            int i24 = iArr2[0];
            int i25 = iArr2[1];
            if (constraintWidget.f1247f0 == 8) {
                constraintWidget.f1237a = true;
            } else {
                float f7 = constraintWidget.f1269v;
                if (f7 < 1.0f && i24 == 3) {
                    constraintWidget.f1264q = 2;
                }
                float f10 = constraintWidget.f1272y;
                if (f10 < 1.0f && i25 == 3) {
                    constraintWidget.f1265r = 2;
                }
                if (constraintWidget.V > 0.0f) {
                    if (i24 == 3 && (i25 == 2 || i25 == 1)) {
                        constraintWidget.f1264q = 3;
                    } else if (i25 == 3 && (i24 == 2 || i24 == 1)) {
                        constraintWidget.f1265r = 3;
                    } else if (i24 == 3 && i25 == 3) {
                        if (constraintWidget.f1264q == 0) {
                            constraintWidget.f1264q = 3;
                        }
                        if (constraintWidget.f1265r == 0) {
                            constraintWidget.f1265r = 3;
                        }
                    }
                }
                if (i24 == 3 && constraintWidget.f1264q == 1 && (cVar4.f19148f == null || cVar3.f19148f == null)) {
                    i24 = 2;
                }
                if (i25 == 3 && constraintWidget.f1265r == 1 && (cVar2.f19148f == null || cVar.f19148f == null)) {
                    i25 = 2;
                }
                m mVar = constraintWidget.f1242d;
                mVar.f19695d = i24;
                int i26 = constraintWidget.f1264q;
                mVar.f19692a = i26;
                o oVar = constraintWidget.f1244e;
                oVar.f19695d = i25;
                int i27 = constraintWidget.f1265r;
                oVar.f19692a = i27;
                if (i24 == 4 || i24 == 1) {
                    if (i25 == 4) {
                        if (i25 != 1) {
                            i11 = 2;
                            if (i25 != 2) {
                                if (i24 != 3) {
                                    i12 = i25;
                                    i13 = 1;
                                } else if (i25 == i11 && i25 != 1) {
                                    i12 = i25;
                                    i14 = 3;
                                    i13 = 1;
                                    if (i12 != i14) {
                                        i15 = i12;
                                        i16 = i11;
                                        i17 = 1;
                                        i18 = i24;
                                    } else if (i24 == i11 && i24 != i13) {
                                        i19 = i14;
                                        i15 = i12;
                                        i16 = i11;
                                        i17 = 1;
                                        i18 = i24;
                                        if (i18 != i19 && i15 == i19) {
                                            if (i26 == i17 || i27 == i17) {
                                                f(i16, 0, i16, 0, constraintWidget);
                                                constraintWidget.f1242d.f19696e.f19681m = constraintWidget.n();
                                                constraintWidget.f1244e.f19696e.f19681m = constraintWidget.k();
                                            } else if (i27 == 2 && i26 == 2 && iArr[0] == i13 && iArr[i17] == i13) {
                                                f(i13, (int) ((f7 * constraintWidgetContainer.n()) + 0.5f), i13, (int) ((f10 * constraintWidgetContainer.k()) + 0.5f), constraintWidget);
                                                constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                constraintWidget.f1237a = true;
                                            }
                                        }
                                    } else if (i27 == i14) {
                                        if (i24 == i11) {
                                            f(i11, 0, i11, 0, constraintWidget);
                                        }
                                        int iN2 = constraintWidget.n();
                                        f2 = constraintWidget.V;
                                        if (constraintWidget.W == -1) {
                                            f2 = 1.0f / f2;
                                        }
                                        f(i13, iN2, i13, (int) ((iN2 * f2) + 0.5f), constraintWidget);
                                        constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                        constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                        constraintWidget.f1237a = true;
                                    } else {
                                        i15 = i12;
                                        i13 = i13;
                                        i20 = i11;
                                        if (i27 == 1) {
                                            f(i24, 0, i20, 0, constraintWidget);
                                            constraintWidget.f1244e.f19696e.f19681m = constraintWidget.k();
                                        } else {
                                            i18 = i24;
                                            if (i27 == 2) {
                                                i21 = iArr[1];
                                                if (i21 != i13 || i21 == 4) {
                                                    f(i18, constraintWidget.n(), i13, (int) ((f10 * constraintWidgetContainer.k()) + 0.5f), constraintWidget);
                                                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                    constraintWidget.f1237a = true;
                                                } else {
                                                    i16 = i20;
                                                    i17 = 1;
                                                }
                                            } else if (cVarArr[2].f19148f != null || cVarArr[3].f19148f == null) {
                                                f(i20, 0, i15, 0, constraintWidget);
                                                constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                constraintWidget.f1237a = true;
                                            } else {
                                                i16 = i20;
                                                i17 = 1;
                                            }
                                        }
                                    }
                                    i19 = 3;
                                    if (i18 != i19) {
                                    }
                                } else if (i26 == 3) {
                                    if (i25 == i11) {
                                        f(i11, 0, i11, 0, constraintWidget);
                                    }
                                    int iK3 = constraintWidget.k();
                                    f(1, (int) ((iK3 * constraintWidget.V) + 0.5f), 1, iK3, constraintWidget);
                                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                    constraintWidget.f1237a = true;
                                } else {
                                    i22 = i11;
                                    if (i26 == 1) {
                                        f(i22, 0, i25, 0, constraintWidget);
                                        constraintWidget.f1242d.f19696e.f19681m = constraintWidget.n();
                                    } else {
                                        i11 = i22;
                                        if (i26 == 2) {
                                            i23 = iArr[0];
                                            if (i23 != 1 || i23 == 4) {
                                                f(1, (int) ((f7 * constraintWidgetContainer.n()) + 0.5f), i25, constraintWidget.k(), constraintWidget);
                                                constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                constraintWidget.f1237a = true;
                                            } else {
                                                i13 = 1;
                                                i12 = i25;
                                            }
                                        } else {
                                            i13 = 1;
                                            i12 = i25;
                                            if (cVarArr[0].f19148f != null || cVarArr[1].f19148f == null) {
                                                f(i11, 0, i12, 0, constraintWidget);
                                                constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                constraintWidget.f1237a = true;
                                            }
                                        }
                                    }
                                }
                                i14 = 3;
                                if (i12 != i14) {
                                    if (i24 == i11) {
                                    }
                                    if (i27 == i14) {
                                        if (i24 == i11) {
                                            f(i11, 0, i11, 0, constraintWidget);
                                        }
                                        int iN3 = constraintWidget.n();
                                        f2 = constraintWidget.V;
                                        if (constraintWidget.W == -1) {
                                            f2 = 1.0f / f2;
                                        }
                                        f(i13, iN3, i13, (int) ((iN3 * f2) + 0.5f), constraintWidget);
                                        constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                        constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                        constraintWidget.f1237a = true;
                                    } else {
                                        i15 = i12;
                                        i13 = i13;
                                        i20 = i11;
                                        if (i27 == 1) {
                                            f(i24, 0, i20, 0, constraintWidget);
                                            constraintWidget.f1244e.f19696e.f19681m = constraintWidget.k();
                                        } else {
                                            i18 = i24;
                                            if (i27 == 2) {
                                                i21 = iArr[1];
                                                if (i21 != i13) {
                                                }
                                                f(i18, constraintWidget.n(), i13, (int) ((f10 * constraintWidgetContainer.k()) + 0.5f), constraintWidget);
                                                constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                constraintWidget.f1237a = true;
                                            } else {
                                                if (cVarArr[2].f19148f != null) {
                                                }
                                                f(i20, 0, i15, 0, constraintWidget);
                                                constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                                constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                                constraintWidget.f1237a = true;
                                            }
                                        }
                                    }
                                } else {
                                    i15 = i12;
                                    i16 = i11;
                                    i17 = 1;
                                    i18 = i24;
                                }
                                i19 = 3;
                                if (i18 != i19) {
                                }
                            }
                        } else {
                            i7 = 1;
                        }
                        iN = constraintWidget.n();
                        if (i24 == 4) {
                            iN = (constraintWidgetContainer.n() - cVar4.f19149g) - cVar3.f19149g;
                            i24 = i7;
                        }
                        iK = constraintWidget.k();
                        if (i25 == 4) {
                            iK2 = (constraintWidgetContainer.k() - cVar2.f19149g) - cVar.f19149g;
                            i10 = i7;
                        } else {
                            iK2 = iK;
                            i10 = i25;
                        }
                        f(i24, iN, i10, iK2, constraintWidget);
                        constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                        constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                        constraintWidget.f1237a = true;
                    }
                    i7 = 1;
                    iN = constraintWidget.n();
                    if (i24 == 4) {
                        iN = (constraintWidgetContainer.n() - cVar4.f19149g) - cVar3.f19149g;
                        i24 = i7;
                    }
                    iK = constraintWidget.k();
                    if (i25 == 4) {
                        iK2 = (constraintWidgetContainer.k() - cVar2.f19149g) - cVar.f19149g;
                        i10 = i7;
                    } else {
                        iK2 = iK;
                        i10 = i25;
                    }
                    f(i24, iN, i10, iK2, constraintWidget);
                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                    constraintWidget.f1237a = true;
                } else {
                    i11 = 2;
                    if (i24 == 2) {
                        if (i25 == 4) {
                            if (i25 != 1) {
                                i11 = 2;
                                if (i25 != 2) {
                                }
                            } else {
                                i7 = 1;
                            }
                            iN = constraintWidget.n();
                            if (i24 == 4) {
                                iN = (constraintWidgetContainer.n() - cVar4.f19149g) - cVar3.f19149g;
                                i24 = i7;
                            }
                            iK = constraintWidget.k();
                            if (i25 == 4) {
                                iK2 = (constraintWidgetContainer.k() - cVar2.f19149g) - cVar.f19149g;
                                i10 = i7;
                            } else {
                                iK2 = iK;
                                i10 = i25;
                            }
                            f(i24, iN, i10, iK2, constraintWidget);
                            constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                            constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                            constraintWidget.f1237a = true;
                        }
                        i7 = 1;
                        iN = constraintWidget.n();
                        if (i24 == 4) {
                            iN = (constraintWidgetContainer.n() - cVar4.f19149g) - cVar3.f19149g;
                            i24 = i7;
                        }
                        iK = constraintWidget.k();
                        if (i25 == 4) {
                            iK2 = (constraintWidgetContainer.k() - cVar2.f19149g) - cVar.f19149g;
                            i10 = i7;
                        } else {
                            iK2 = iK;
                            i10 = i25;
                        }
                        f(i24, iN, i10, iK2, constraintWidget);
                        constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                        constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                        constraintWidget.f1237a = true;
                    }
                    if (i24 != 3) {
                        if (i25 == i11) {
                        }
                        if (i26 == 3) {
                            if (i25 == i11) {
                                f(i11, 0, i11, 0, constraintWidget);
                            }
                            int iK4 = constraintWidget.k();
                            f(1, (int) ((iK4 * constraintWidget.V) + 0.5f), 1, iK4, constraintWidget);
                            constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                            constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                            constraintWidget.f1237a = true;
                        } else {
                            i22 = i11;
                            if (i26 == 1) {
                                f(i22, 0, i25, 0, constraintWidget);
                                constraintWidget.f1242d.f19696e.f19681m = constraintWidget.n();
                            } else {
                                i11 = i22;
                                if (i26 == 2) {
                                    i23 = iArr[0];
                                    if (i23 != 1) {
                                    }
                                    f(1, (int) ((f7 * constraintWidgetContainer.n()) + 0.5f), i25, constraintWidget.k(), constraintWidget);
                                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                    constraintWidget.f1237a = true;
                                } else {
                                    i13 = 1;
                                    i12 = i25;
                                    if (cVarArr[0].f19148f != null) {
                                    }
                                    f(i11, 0, i12, 0, constraintWidget);
                                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                    constraintWidget.f1237a = true;
                                }
                            }
                        }
                    } else {
                        i12 = i25;
                        i13 = 1;
                    }
                    i14 = 3;
                    if (i12 != i14) {
                        if (i24 == i11) {
                        }
                        if (i27 == i14) {
                            if (i24 == i11) {
                                f(i11, 0, i11, 0, constraintWidget);
                            }
                            int iN4 = constraintWidget.n();
                            f2 = constraintWidget.V;
                            if (constraintWidget.W == -1) {
                                f2 = 1.0f / f2;
                            }
                            f(i13, iN4, i13, (int) ((iN4 * f2) + 0.5f), constraintWidget);
                            constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                            constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                            constraintWidget.f1237a = true;
                        } else {
                            i15 = i12;
                            i13 = i13;
                            i20 = i11;
                            if (i27 == 1) {
                                f(i24, 0, i20, 0, constraintWidget);
                                constraintWidget.f1244e.f19696e.f19681m = constraintWidget.k();
                            } else {
                                i18 = i24;
                                if (i27 == 2) {
                                    i21 = iArr[1];
                                    if (i21 != i13) {
                                    }
                                    f(i18, constraintWidget.n(), i13, (int) ((f10 * constraintWidgetContainer.k()) + 0.5f), constraintWidget);
                                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                    constraintWidget.f1237a = true;
                                } else {
                                    if (cVarArr[2].f19148f != null) {
                                    }
                                    f(i20, 0, i15, 0, constraintWidget);
                                    constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                                    constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                                    constraintWidget.f1237a = true;
                                }
                            }
                        }
                    } else {
                        i15 = i12;
                        i16 = i11;
                        i17 = 1;
                        i18 = i24;
                    }
                    i19 = 3;
                    if (i18 != i19) {
                    }
                }
            }
        }
    }

    public final void c() {
        ConstraintWidgetContainer constraintWidgetContainer = this.f19663a;
        ArrayList arrayList = this.f19670h;
        ArrayList<q> arrayList2 = this.f19667e;
        arrayList2.clear();
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f19666d;
        constraintWidgetContainer2.f1242d.f();
        constraintWidgetContainer2.f1244e.f();
        arrayList2.add(constraintWidgetContainer2.f1242d);
        arrayList2.add(constraintWidgetContainer2.f1244e);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer2.f1274p0) {
            if (constraintWidget instanceof r0.f) {
                k kVar = new k(constraintWidget);
                constraintWidget.f1242d.f();
                constraintWidget.f1244e.f();
                kVar.f19697f = ((r0.f) constraintWidget).f19182t0;
                arrayList2.add(kVar);
            } else {
                if (constraintWidget.u()) {
                    if (constraintWidget.f1238b == null) {
                        constraintWidget.f1238b = new d(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f1238b);
                } else {
                    arrayList2.add(constraintWidget.f1242d);
                }
                if (constraintWidget.v()) {
                    if (constraintWidget.f1240c == null) {
                        constraintWidget.f1240c = new d(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f1240c);
                } else {
                    arrayList2.add(constraintWidget.f1244e);
                }
                if (constraintWidget instanceof r0.g) {
                    arrayList2.add(new l(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((q) it.next()).f();
        }
        for (q qVar : arrayList2) {
            if (qVar.f19693b != constraintWidgetContainer2) {
                qVar.d();
            }
        }
        arrayList.clear();
        e(constraintWidgetContainer.f1242d, 0, arrayList);
        e(constraintWidgetContainer.f1244e, 1, arrayList);
        this.f19664b = false;
    }

    public final int d(ConstraintWidgetContainer constraintWidgetContainer, int i7) {
        ArrayList arrayList;
        int i10;
        long j;
        float f2;
        long j5;
        ArrayList arrayList2 = this.f19670h;
        int size = arrayList2.size();
        long j7 = 0;
        int i11 = 0;
        long jMax = 0;
        while (i11 < size) {
            q qVar = ((n) arrayList2.get(i11)).f19683a;
            if (!(qVar instanceof d) ? !(i7 != 0 ? (qVar instanceof o) : (qVar instanceof m)) : ((d) qVar).f19697f != i7) {
                h hVar = (i7 == 0 ? constraintWidgetContainer.f1242d : constraintWidgetContainer.f1244e).f19699h;
                h hVar2 = (i7 == 0 ? constraintWidgetContainer.f1242d : constraintWidgetContainer.f1244e).f19700i;
                h hVar3 = qVar.f19699h;
                h hVar4 = qVar.f19700i;
                boolean zContains = hVar3.f19680l.contains(hVar);
                boolean zContains2 = hVar4.f19680l.contains(hVar2);
                long j10 = qVar.j();
                if (zContains && zContains2) {
                    long jB = n.b(hVar3, j7);
                    long jA = n.a(hVar4, j7);
                    long j11 = jB - j10;
                    int i12 = hVar4.f19676f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j11 >= (-i12)) {
                        j11 += (long) i12;
                    }
                    long j12 = hVar3.f19676f;
                    long j13 = ((-jA) - j10) - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    ConstraintWidget constraintWidget = qVar.f19693b;
                    if (i7 == 0) {
                        f2 = constraintWidget.f1241c0;
                    } else if (i7 == 1) {
                        f2 = constraintWidget.f1243d0;
                    } else {
                        constraintWidget.getClass();
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f) {
                        j5 = (long) ((j11 / (1.0f - f2)) + (j13 / f2));
                    } else {
                        j5 = 0;
                    }
                    float f7 = j5;
                    j = (((long) hVar3.f19676f) + ((((long) ((f7 * f2) + 0.5f)) + j10) + ((long) kk.b.c(1.0f, f2, f7, 0.5f)))) - ((long) hVar4.f19676f);
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    if (zContains) {
                        j = Math.max(n.b(hVar3, hVar3.f19676f), ((long) hVar3.f19676f) + j10);
                    } else if (zContains2) {
                        j = Math.max(-n.a(hVar4, hVar4.f19676f), ((long) (-hVar4.f19676f)) + j10);
                    } else {
                        j = (qVar.j() + ((long) hVar3.f19676f)) - ((long) hVar4.f19676f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                j = j7;
            }
            jMax = Math.max(jMax, j);
            i11++;
            arrayList2 = arrayList;
            size = i10;
            j7 = 0;
        }
        return (int) jMax;
    }

    public final void e(q qVar, int i7, ArrayList arrayList) {
        h hVar = qVar.f19699h;
        h hVar2 = qVar.f19700i;
        for (e eVar : hVar.k) {
            if (eVar instanceof h) {
                a((h) eVar, i7, arrayList, null);
            } else if (eVar instanceof q) {
                a(((q) eVar).f19699h, i7, arrayList, null);
            }
        }
        for (e eVar2 : hVar2.k) {
            if (eVar2 instanceof h) {
                a((h) eVar2, i7, arrayList, null);
            } else if (eVar2 instanceof q) {
                a(((q) eVar2).f19700i, i7, arrayList, null);
            }
        }
        if (i7 == 1) {
            for (e eVar3 : ((o) qVar).k.k) {
                if (eVar3 instanceof h) {
                    a((h) eVar3, i7, arrayList, null);
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12, ConstraintWidget constraintWidget) {
        b bVar = this.f19669g;
        bVar.f19653a = i7;
        bVar.f19654b = i11;
        bVar.f19655c = i10;
        bVar.f19656d = i12;
        ((ConstraintLayout.Measurer) this.f19668f).b(constraintWidget, bVar);
        constraintWidget.J(bVar.f19657e);
        constraintWidget.G(bVar.f19658f);
        constraintWidget.D = bVar.f19660h;
        constraintWidget.D(bVar.f19659g);
    }

    public final void g() {
        a aVar;
        for (ConstraintWidget constraintWidget : this.f19663a.f1274p0) {
            if (!constraintWidget.f1237a) {
                int[] iArr = constraintWidget.f1262o0;
                boolean z5 = false;
                int i7 = iArr[0];
                int i10 = iArr[1];
                int i11 = constraintWidget.f1264q;
                int i12 = constraintWidget.f1265r;
                boolean z6 = i7 == 2 || (i7 == 3 && i11 == 1);
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z5 = true;
                }
                i iVar = constraintWidget.f1242d.f19696e;
                boolean z7 = iVar.j;
                i iVar2 = constraintWidget.f1244e.f19696e;
                boolean z10 = iVar2.j;
                boolean z11 = z6;
                if (z7 && z10) {
                    f(1, iVar.f19677g, 1, iVar2.f19677g, constraintWidget);
                    constraintWidget.f1237a = true;
                } else if (z7 && z5) {
                    f(1, iVar.f19677g, 2, iVar2.f19677g, constraintWidget);
                    if (i10 == 3) {
                        constraintWidget.f1244e.f19696e.f19681m = constraintWidget.k();
                    } else {
                        constraintWidget.f1244e.f19696e.d(constraintWidget.k());
                        constraintWidget.f1237a = true;
                    }
                } else if (z10 && z11) {
                    f(2, iVar.f19677g, 1, iVar2.f19677g, constraintWidget);
                    if (i7 == 3) {
                        constraintWidget.f1242d.f19696e.f19681m = constraintWidget.n();
                    } else {
                        constraintWidget.f1242d.f19696e.d(constraintWidget.n());
                        constraintWidget.f1237a = true;
                    }
                }
                if (constraintWidget.f1237a && (aVar = constraintWidget.f1244e.f19685l) != null) {
                    aVar.d(constraintWidget.Z);
                }
            }
        }
    }
}
