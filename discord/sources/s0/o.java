package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {
    public h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f19685l;

    @Override // s0.e
    public final void a(e eVar) {
        float f2;
        float f7;
        float f10;
        int i7;
        if (f0.e.b(this.j) == 3) {
            ConstraintWidget constraintWidget = this.f19693b;
            l(constraintWidget.I, constraintWidget.K, 1);
            return;
        }
        i iVar = this.f19696e;
        if (iVar.f19673c && !iVar.j && this.f19695d == 3) {
            ConstraintWidget constraintWidget2 = this.f19693b;
            int i10 = constraintWidget2.f1265r;
            if (i10 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.S;
                if (constraintWidget3 != null) {
                    i iVar2 = constraintWidget3.f1244e.f19696e;
                    if (iVar2.j) {
                        iVar.d((int) ((iVar2.f19677g * constraintWidget2.f1272y) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                i iVar3 = constraintWidget2.f1242d.f19696e;
                if (iVar3.j) {
                    int i11 = constraintWidget2.W;
                    if (i11 != -1) {
                        if (i11 == 0) {
                            f10 = iVar3.f19677g * constraintWidget2.V;
                            i7 = (int) (f10 + 0.5f);
                        } else if (i11 != 1) {
                            i7 = 0;
                        } else {
                            f2 = iVar3.f19677g;
                            f7 = constraintWidget2.V;
                        }
                        iVar.d(i7);
                    } else {
                        f2 = iVar3.f19677g;
                        f7 = constraintWidget2.V;
                    }
                    f10 = f2 / f7;
                    i7 = (int) (f10 + 0.5f);
                    iVar.d(i7);
                }
            }
        }
        h hVar = this.f19699h;
        boolean z5 = hVar.f19673c;
        ArrayList arrayList = hVar.f19680l;
        if (z5) {
            h hVar2 = this.f19700i;
            boolean z6 = hVar2.f19673c;
            ArrayList arrayList2 = hVar2.f19680l;
            if (z6) {
                if (hVar.j && hVar2.j && iVar.j) {
                    return;
                }
                if (!iVar.j && this.f19695d == 3) {
                    ConstraintWidget constraintWidget4 = this.f19693b;
                    if (constraintWidget4.f1264q == 0 && !constraintWidget4.v()) {
                        h hVar3 = (h) arrayList.get(0);
                        h hVar4 = (h) arrayList2.get(0);
                        int i12 = hVar3.f19677g + hVar.f19676f;
                        int i13 = hVar4.f19677g + hVar2.f19676f;
                        hVar.d(i12);
                        hVar2.d(i13);
                        iVar.d(i13 - i12);
                        return;
                    }
                }
                if (!iVar.j && this.f19695d == 3 && this.f19692a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    h hVar5 = (h) arrayList.get(0);
                    int i14 = (((h) arrayList2.get(0)).f19677g + hVar2.f19676f) - (hVar5.f19677g + hVar.f19676f);
                    int i15 = iVar.f19681m;
                    if (i14 < i15) {
                        iVar.d(i14);
                    } else {
                        iVar.d(i15);
                    }
                }
                if (iVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    h hVar6 = (h) arrayList.get(0);
                    h hVar7 = (h) arrayList2.get(0);
                    int i16 = hVar6.f19677g;
                    int i17 = hVar.f19676f + i16;
                    int i18 = hVar7.f19677g;
                    int i19 = hVar2.f19676f + i18;
                    float f11 = this.f19693b.f1243d0;
                    if (hVar6 == hVar7) {
                        f11 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    hVar.d((int) ((((i18 - i16) - iVar.f19677g) * f11) + i16 + 0.5f));
                    hVar2.d(hVar.f19677g + iVar.f19677g);
                }
            }
        }
    }

    @Override // s0.q
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        h hVar = this.k;
        ConstraintWidget constraintWidget5 = this.f19693b;
        boolean z5 = constraintWidget5.f1237a;
        i iVar = this.f19696e;
        if (z5) {
            iVar.d(constraintWidget5.k());
        }
        boolean z6 = iVar.j;
        ArrayList arrayList = iVar.k;
        ArrayList arrayList2 = iVar.f19680l;
        h hVar2 = this.f19700i;
        h hVar3 = this.f19699h;
        if (!z6) {
            ConstraintWidget constraintWidget6 = this.f19693b;
            this.f19695d = constraintWidget6.f1262o0[1];
            if (constraintWidget6.D) {
                this.f19685l = new a(this);
            }
            int i7 = this.f19695d;
            if (i7 != 3) {
                if (i7 == 4 && (constraintWidget4 = this.f19693b.S) != null && constraintWidget4.f1262o0[1] == 1) {
                    int iK = (constraintWidget4.k() - this.f19693b.I.e()) - this.f19693b.K.e();
                    q.b(hVar3, constraintWidget4.f1244e.f19699h, this.f19693b.I.e());
                    q.b(hVar2, constraintWidget4.f1244e.f19700i, -this.f19693b.K.e());
                    iVar.d(iK);
                    return;
                }
                if (i7 == 1) {
                    iVar.d(this.f19693b.k());
                }
            }
        } else if (this.f19695d == 4 && (constraintWidget2 = (constraintWidget = this.f19693b).S) != null && constraintWidget2.f1262o0[1] == 1) {
            q.b(hVar3, constraintWidget2.f1244e.f19699h, constraintWidget.I.e());
            q.b(hVar2, constraintWidget2.f1244e.f19700i, -this.f19693b.K.e());
            return;
        }
        boolean z7 = iVar.j;
        if (z7) {
            ConstraintWidget constraintWidget7 = this.f19693b;
            if (constraintWidget7.f1237a) {
                r0.c[] cVarArr = constraintWidget7.P;
                r0.c cVar = cVarArr[2];
                r0.c cVar2 = cVar.f19148f;
                if (cVar2 != null && cVarArr[3].f19148f != null) {
                    if (constraintWidget7.v()) {
                        hVar3.f19676f = this.f19693b.P[2].e();
                        hVar2.f19676f = -this.f19693b.P[3].e();
                    } else {
                        h hVarH = q.h(this.f19693b.P[2]);
                        if (hVarH != null) {
                            q.b(hVar3, hVarH, this.f19693b.P[2].e());
                        }
                        h hVarH2 = q.h(this.f19693b.P[3]);
                        if (hVarH2 != null) {
                            q.b(hVar2, hVarH2, -this.f19693b.P[3].e());
                        }
                        hVar3.f19672b = true;
                        hVar2.f19672b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f19693b;
                    if (constraintWidget8.D) {
                        q.b(hVar, hVar3, constraintWidget8.Z);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    h hVarH3 = q.h(cVar);
                    if (hVarH3 != null) {
                        q.b(hVar3, hVarH3, this.f19693b.P[2].e());
                        q.b(hVar2, hVar3, iVar.f19677g);
                        ConstraintWidget constraintWidget9 = this.f19693b;
                        if (constraintWidget9.D) {
                            q.b(hVar, hVar3, constraintWidget9.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r0.c cVar3 = cVarArr[3];
                if (cVar3.f19148f != null) {
                    h hVarH4 = q.h(cVar3);
                    if (hVarH4 != null) {
                        q.b(hVar2, hVarH4, -this.f19693b.P[3].e());
                        q.b(hVar3, hVar2, -iVar.f19677g);
                    }
                    ConstraintWidget constraintWidget10 = this.f19693b;
                    if (constraintWidget10.D) {
                        q.b(hVar, hVar3, constraintWidget10.Z);
                        return;
                    }
                    return;
                }
                r0.c cVar4 = cVarArr[4];
                if (cVar4.f19148f != null) {
                    h hVarH5 = q.h(cVar4);
                    if (hVarH5 != null) {
                        q.b(hVar, hVarH5, 0);
                        q.b(hVar3, hVar, -this.f19693b.Z);
                        q.b(hVar2, hVar3, iVar.f19677g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof r0.g) || constraintWidget7.S == null || constraintWidget7.i(7).f19148f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f19693b;
                q.b(hVar3, constraintWidget11.S.f1244e.f19699h, constraintWidget11.p());
                q.b(hVar2, hVar3, iVar.f19677g);
                ConstraintWidget constraintWidget12 = this.f19693b;
                if (constraintWidget12.D) {
                    q.b(hVar, hVar3, constraintWidget12.Z);
                    return;
                }
                return;
            }
        }
        if (z7 || this.f19695d != 3) {
            iVar.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f19693b;
            int i10 = constraintWidget13.f1265r;
            if (i10 == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.S;
                if (constraintWidget14 != null) {
                    i iVar2 = constraintWidget14.f1244e.f19696e;
                    arrayList2.add(iVar2);
                    iVar2.k.add(iVar);
                    iVar.f19672b = true;
                    arrayList.add(hVar3);
                    arrayList.add(hVar2);
                }
            } else if (i10 == 3 && !constraintWidget13.v()) {
                ConstraintWidget constraintWidget15 = this.f19693b;
                if (constraintWidget15.f1264q != 3) {
                    i iVar3 = constraintWidget15.f1242d.f19696e;
                    arrayList2.add(iVar3);
                    iVar3.k.add(iVar);
                    iVar.f19672b = true;
                    arrayList.add(hVar3);
                    arrayList.add(hVar2);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f19693b;
        r0.c[] cVarArr2 = constraintWidget16.P;
        r0.c cVar5 = cVarArr2[2];
        r0.c cVar6 = cVar5.f19148f;
        if (cVar6 != null && cVarArr2[3].f19148f != null) {
            if (constraintWidget16.v()) {
                hVar3.f19676f = this.f19693b.P[2].e();
                hVar2.f19676f = -this.f19693b.P[3].e();
            } else {
                h hVarH6 = q.h(this.f19693b.P[2]);
                h hVarH7 = q.h(this.f19693b.P[3]);
                if (hVarH6 != null) {
                    hVarH6.b(this);
                }
                if (hVarH7 != null) {
                    hVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.f19693b.D) {
                c(hVar, hVar3, 1, this.f19685l);
            }
        } else if (cVar6 != null) {
            h hVarH8 = q.h(cVar5);
            if (hVarH8 != null) {
                q.b(hVar3, hVarH8, this.f19693b.P[2].e());
                c(hVar2, hVar3, 1, iVar);
                if (this.f19693b.D) {
                    c(hVar, hVar3, 1, this.f19685l);
                }
                if (this.f19695d == 3) {
                    ConstraintWidget constraintWidget17 = this.f19693b;
                    if (constraintWidget17.V > 0.0f) {
                        m mVar = constraintWidget17.f1242d;
                        if (mVar.f19695d == 3) {
                            mVar.f19696e.k.add(iVar);
                            arrayList2.add(this.f19693b.f1242d.f19696e);
                            iVar.f19671a = this;
                        }
                    }
                }
            }
        } else {
            r0.c cVar7 = cVarArr2[3];
            if (cVar7.f19148f != null) {
                h hVarH9 = q.h(cVar7);
                if (hVarH9 != null) {
                    q.b(hVar2, hVarH9, -this.f19693b.P[3].e());
                    c(hVar3, hVar2, -1, iVar);
                    if (this.f19693b.D) {
                        c(hVar, hVar3, 1, this.f19685l);
                    }
                }
            } else {
                r0.c cVar8 = cVarArr2[4];
                if (cVar8.f19148f != null) {
                    h hVarH10 = q.h(cVar8);
                    if (hVarH10 != null) {
                        q.b(hVar, hVarH10, 0);
                        c(hVar3, hVar, -1, this.f19685l);
                        c(hVar2, hVar3, 1, iVar);
                    }
                } else if (!(constraintWidget16 instanceof r0.g) && (constraintWidget3 = constraintWidget16.S) != null) {
                    q.b(hVar3, constraintWidget3.f1244e.f19699h, constraintWidget16.p());
                    c(hVar2, hVar3, 1, iVar);
                    if (this.f19693b.D) {
                        c(hVar, hVar3, 1, this.f19685l);
                    }
                    if (this.f19695d == 3) {
                        ConstraintWidget constraintWidget18 = this.f19693b;
                        if (constraintWidget18.V > 0.0f) {
                            m mVar2 = constraintWidget18.f1242d;
                            if (mVar2.f19695d == 3) {
                                mVar2.f19696e.k.add(iVar);
                                arrayList2.add(this.f19693b.f1242d.f19696e);
                                iVar.f19671a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            iVar.f19673c = true;
        }
    }

    @Override // s0.q
    public final void e() {
        h hVar = this.f19699h;
        if (hVar.j) {
            this.f19693b.Y = hVar.f19677g;
        }
    }

    @Override // s0.q
    public final void f() {
        this.f19694c = null;
        this.f19699h.c();
        this.f19700i.c();
        this.k.c();
        this.f19696e.c();
        this.f19698g = false;
    }

    @Override // s0.q
    public final boolean k() {
        return this.f19695d != 3 || this.f19693b.f1265r == 0;
    }

    public final void m() {
        this.f19698g = false;
        h hVar = this.f19699h;
        hVar.c();
        hVar.j = false;
        h hVar2 = this.f19700i;
        hVar2.c();
        hVar2.j = false;
        h hVar3 = this.k;
        hVar3.c();
        hVar3.j = false;
        this.f19696e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f19693b.f1249g0;
    }
}
