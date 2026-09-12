package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f19693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f19694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f19696e = new i(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19697f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19698g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f19699h = new h(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f19700i = new h(this);
    public int j = 1;

    public q(ConstraintWidget constraintWidget) {
        this.f19693b = constraintWidget;
    }

    public static void b(h hVar, h hVar2, int i7) {
        hVar.f19680l.add(hVar2);
        hVar.f19676f = i7;
        hVar2.k.add(hVar);
    }

    public static h h(r0.c cVar) {
        r0.c cVar2 = cVar.f19148f;
        if (cVar2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = cVar2.f19146d;
        int iB = f0.e.b(cVar2.f19147e);
        if (iB == 1) {
            return constraintWidget.f1242d.f19699h;
        }
        if (iB == 2) {
            return constraintWidget.f1244e.f19699h;
        }
        if (iB == 3) {
            return constraintWidget.f1242d.f19700i;
        }
        if (iB == 4) {
            return constraintWidget.f1244e.f19700i;
        }
        if (iB != 5) {
            return null;
        }
        return constraintWidget.f1244e.k;
    }

    public static h i(r0.c cVar, int i7) {
        r0.c cVar2 = cVar.f19148f;
        if (cVar2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = cVar2.f19146d;
        q qVar = i7 == 0 ? constraintWidget.f1242d : constraintWidget.f1244e;
        int iB = f0.e.b(cVar2.f19147e);
        if (iB == 1 || iB == 2) {
            return qVar.f19699h;
        }
        if (iB == 3 || iB == 4) {
            return qVar.f19700i;
        }
        return null;
    }

    public final void c(h hVar, h hVar2, int i7, i iVar) {
        hVar.f19680l.add(hVar2);
        hVar.f19680l.add(this.f19696e);
        hVar.f19678h = i7;
        hVar.f19679i = iVar;
        hVar2.k.add(hVar);
        iVar.k.add(hVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i7, int i10) {
        if (i10 == 0) {
            ConstraintWidget constraintWidget = this.f19693b;
            int i11 = constraintWidget.f1268u;
            int iMax = Math.max(constraintWidget.f1267t, i7);
            if (i11 > 0) {
                iMax = Math.min(i11, i7);
            }
            if (iMax != i7) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f19693b;
            int i12 = constraintWidget2.f1271x;
            int iMax2 = Math.max(constraintWidget2.f1270w, i7);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i7);
            }
            if (iMax2 != i7) {
                return iMax2;
            }
        }
        return i7;
    }

    public long j() {
        i iVar = this.f19696e;
        if (iVar.j) {
            return iVar.f19677g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(r0.c cVar, r0.c cVar2, int i7) {
        i iVar;
        float f2;
        int i10;
        h hVarH = h(cVar);
        h hVarH2 = h(cVar2);
        if (hVarH.j && hVarH2.j) {
            int iE = cVar.e() + hVarH.f19677g;
            int iE2 = hVarH2.f19677g - cVar2.e();
            int i11 = iE2 - iE;
            i iVar2 = this.f19696e;
            if (!iVar2.j && this.f19695d == 3) {
                int i12 = this.f19692a;
                if (i12 == 0) {
                    iVar2.d(g(i11, i7));
                } else if (i12 == 1) {
                    iVar2.d(Math.min(g(iVar2.f19681m, i7), i11));
                } else if (i12 == 2) {
                    ConstraintWidget constraintWidget = this.f19693b;
                    ConstraintWidget constraintWidget2 = constraintWidget.S;
                    if (constraintWidget2 != null) {
                        i iVar3 = (i7 == 0 ? constraintWidget2.f1242d : constraintWidget2.f1244e).f19696e;
                        if (iVar3.j) {
                            iVar2.d(g((int) ((iVar3.f19677g * (i7 == 0 ? constraintWidget.f1269v : constraintWidget.f1272y)) + 0.5f), i7));
                        }
                    }
                } else if (i12 == 3) {
                    ConstraintWidget constraintWidget3 = this.f19693b;
                    q qVar = constraintWidget3.f1242d;
                    if (qVar.f19695d == 3 && qVar.f19692a == 3) {
                        o oVar = constraintWidget3.f1244e;
                        if (oVar.f19695d != 3 || oVar.f19692a != 3) {
                            if (i7 == 0) {
                                qVar = constraintWidget3.f1244e;
                            }
                            iVar = qVar.f19696e;
                            if (iVar.j) {
                                f2 = constraintWidget3.V;
                                if (i7 == 1) {
                                    i10 = (int) ((iVar.f19677g / f2) + 0.5f);
                                } else {
                                    i10 = (int) ((f2 * iVar.f19677g) + 0.5f);
                                }
                                iVar2.d(i10);
                            }
                        }
                    } else {
                        if (i7 == 0) {
                            qVar = constraintWidget3.f1244e;
                        }
                        iVar = qVar.f19696e;
                        if (iVar.j) {
                            f2 = constraintWidget3.V;
                            if (i7 == 1) {
                                i10 = (int) ((iVar.f19677g / f2) + 0.5f);
                            } else {
                                i10 = (int) ((f2 * iVar.f19677g) + 0.5f);
                            }
                            iVar2.d(i10);
                        }
                    }
                }
            }
            if (iVar2.j) {
                int i13 = iVar2.f19677g;
                h hVar = this.f19700i;
                h hVar2 = this.f19699h;
                if (i13 == i11) {
                    hVar2.d(iE);
                    hVar.d(iE2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f19693b;
                float f7 = i7 == 0 ? constraintWidget4.f1241c0 : constraintWidget4.f1243d0;
                if (hVarH == hVarH2) {
                    iE = hVarH.f19677g;
                    iE2 = hVarH2.f19677g;
                    f7 = 0.5f;
                }
                hVar2.d((int) ((((iE2 - iE) - i13) * f7) + iE + 0.5f));
                hVar.d(hVar2.f19677g + iVar2.f19677g);
            }
        }
    }
}
