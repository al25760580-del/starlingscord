package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19152a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f19155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f19156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f19157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f19158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19160i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f19167r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f19153b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19154c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19161l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19162m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19163n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19164o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19165p = 0;

    public d(e eVar, int i7, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f19167r = eVar;
        this.f19159h = 0;
        this.f19160i = 0;
        this.j = 0;
        this.k = 0;
        this.f19166q = 0;
        this.f19152a = i7;
        this.f19155d = cVar;
        this.f19156e = cVar2;
        this.f19157f = cVar3;
        this.f19158g = cVar4;
        this.f19159h = eVar.f19173v0;
        this.f19160i = eVar.f19169r0;
        this.j = eVar.f19174w0;
        this.k = eVar.f19170s0;
        this.f19166q = i10;
    }

    public final void a(ConstraintWidget constraintWidget) {
        int i7 = this.f19152a;
        e eVar = this.f19167r;
        if (i7 == 0) {
            int iP = eVar.P(constraintWidget, this.f19166q);
            if (constraintWidget.f1262o0[0] == 3) {
                this.f19165p++;
                iP = 0;
            }
            this.f19161l = iP + (constraintWidget.f1247f0 != 8 ? eVar.O0 : 0) + this.f19161l;
            int iO = eVar.O(constraintWidget, this.f19166q);
            if (this.f19153b == null || this.f19154c < iO) {
                this.f19153b = constraintWidget;
                this.f19154c = iO;
                this.f19162m = iO;
            }
        } else {
            int iP2 = eVar.P(constraintWidget, this.f19166q);
            int iO2 = eVar.O(constraintWidget, this.f19166q);
            if (constraintWidget.f1262o0[1] == 3) {
                this.f19165p++;
                iO2 = 0;
            }
            this.f19162m = iO2 + (constraintWidget.f1247f0 != 8 ? eVar.P0 : 0) + this.f19162m;
            if (this.f19153b == null || this.f19154c < iP2) {
                this.f19153b = constraintWidget;
                this.f19154c = iP2;
                this.f19161l = iP2;
            }
        }
        this.f19164o++;
    }

    public final void b(int i7, boolean z5, boolean z6) {
        e eVar;
        int i10;
        ConstraintWidget constraintWidget;
        char c8;
        int i11;
        int i12;
        int i13;
        int i14 = this.f19164o;
        int i15 = 0;
        while (true) {
            eVar = this.f19167r;
            if (i15 >= i14 || (i13 = this.f19163n + i15) >= eVar.f19168a1) {
                break;
            }
            ConstraintWidget constraintWidget2 = eVar.Z0[i13];
            if (constraintWidget2 != null) {
                constraintWidget2.A();
            }
            i15++;
        }
        if (i14 == 0 || this.f19153b == null) {
            return;
        }
        boolean z7 = z6 && i7 == 0;
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = this.f19163n + (z5 ? (i14 - 1) - i18 : i18);
            if (i19 >= eVar.f19168a1) {
                break;
            }
            if (eVar.Z0[i19].f1247f0 == 0) {
                if (i16 == -1) {
                    i16 = i18;
                }
                i17 = i18;
            }
        }
        if (this.f19152a != 0) {
            ConstraintWidget constraintWidget3 = this.f19153b;
            constraintWidget3.h0 = eVar.C0;
            c cVar = constraintWidget3.H;
            c cVar2 = constraintWidget3.J;
            int i20 = this.f19159h;
            if (i7 > 0) {
                i20 += eVar.O0;
            }
            if (z5) {
                cVar2.a(this.f19157f, i20);
                if (z6) {
                    cVar.a(this.f19155d, this.j);
                }
                if (i7 > 0) {
                    this.f19157f.f19146d.H.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f19155d, i20);
                if (z6) {
                    cVar2.a(this.f19157f, this.j);
                }
                if (i7 > 0) {
                    this.f19155d.f19146d.J.a(cVar, 0);
                }
            }
            ConstraintWidget constraintWidget4 = null;
            int i21 = 0;
            while (i21 < i14) {
                int i22 = this.f19163n + i21;
                if (i22 >= eVar.f19168a1) {
                    return;
                }
                ConstraintWidget constraintWidget5 = eVar.Z0[i22];
                if (i21 == 0) {
                    constraintWidget5.f(constraintWidget5.I, this.f19156e, this.f19160i);
                    int i23 = eVar.D0;
                    float f2 = eVar.J0;
                    if (this.f19163n == 0) {
                        int i24 = eVar.F0;
                        i10 = -1;
                        if (i24 != -1) {
                            f2 = eVar.L0;
                        }
                        i23 = i24;
                        constraintWidget5.f1252i0 = i23;
                        constraintWidget5.f1243d0 = f2;
                    } else {
                        i10 = -1;
                    }
                    if (z6 && (i24 = eVar.H0) != i10) {
                        f2 = eVar.N0;
                        i23 = i24;
                    }
                    constraintWidget5.f1252i0 = i23;
                    constraintWidget5.f1243d0 = f2;
                }
                if (i21 == i14 - 1) {
                    constraintWidget5.f(constraintWidget5.K, this.f19158g, this.k);
                }
                if (constraintWidget4 != null) {
                    c cVar3 = constraintWidget4.K;
                    c cVar4 = constraintWidget5.I;
                    cVar4.a(cVar3, eVar.P0);
                    if (i21 == i16) {
                        int i25 = this.f19160i;
                        if (cVar4.h()) {
                            cVar4.f19150h = i25;
                        }
                    }
                    cVar3.a(cVar4, 0);
                    if (i21 == i17 + 1) {
                        int i26 = this.k;
                        if (cVar3.h()) {
                            cVar3.f19150h = i26;
                        }
                    }
                }
                if (constraintWidget5 != constraintWidget3) {
                    if (z5) {
                        int i27 = eVar.Q0;
                        if (i27 == 0) {
                            constraintWidget5.J.a(cVar2, 0);
                        } else if (i27 == 1) {
                            constraintWidget5.H.a(cVar, 0);
                        } else if (i27 == 2) {
                            constraintWidget5.H.a(cVar, 0);
                            constraintWidget5.J.a(cVar2, 0);
                        }
                    } else {
                        int i28 = eVar.Q0;
                        if (i28 == 0) {
                            constraintWidget5.H.a(cVar, 0);
                        } else if (i28 == 1) {
                            constraintWidget5.J.a(cVar2, 0);
                        } else if (i28 == 2) {
                            if (z7) {
                                constraintWidget5.H.a(this.f19155d, this.f19159h);
                                constraintWidget5.J.a(this.f19157f, this.j);
                            } else {
                                constraintWidget5.H.a(cVar, 0);
                                constraintWidget5.J.a(cVar2, 0);
                            }
                        }
                    }
                }
                i21++;
                constraintWidget4 = constraintWidget5;
            }
            return;
        }
        ConstraintWidget constraintWidget6 = this.f19153b;
        constraintWidget6.f1252i0 = eVar.D0;
        c cVar5 = constraintWidget6.K;
        c cVar6 = constraintWidget6.I;
        int i29 = this.f19160i;
        if (i7 > 0) {
            i29 += eVar.P0;
        }
        cVar6.a(this.f19156e, i29);
        if (z6) {
            cVar5.a(this.f19158g, this.k);
        }
        if (i7 > 0) {
            this.f19156e.f19146d.K.a(cVar6, 0);
        }
        if (eVar.R0 != 3 || constraintWidget6.D) {
            constraintWidget = constraintWidget6;
            break;
        }
        int i30 = 0;
        while (true) {
            if (i30 < i14) {
                int i31 = this.f19163n + (z5 ? (i14 - 1) - i30 : i30);
                if (i31 < eVar.f19168a1) {
                    constraintWidget = eVar.Z0[i31];
                    if (constraintWidget.D) {
                        break;
                    } else {
                        i30++;
                    }
                }
            }
            constraintWidget = constraintWidget6;
            break;
        }
        int i32 = 0;
        ConstraintWidget constraintWidget7 = null;
        while (i32 < i14) {
            int i33 = z5 ? (i14 - 1) - i32 : i32;
            int i34 = this.f19163n + i33;
            if (i34 >= eVar.f19168a1) {
                return;
            }
            ConstraintWidget constraintWidget8 = eVar.Z0[i34];
            if (i32 == 0) {
                constraintWidget8.f(constraintWidget8.H, this.f19155d, this.f19159h);
            }
            if (i33 == 0) {
                int i35 = eVar.C0;
                float f7 = z5 ? 1.0f - eVar.I0 : eVar.I0;
                if (this.f19163n == 0 && (i12 = eVar.E0) != -1) {
                    f7 = z5 ? 1.0f - eVar.K0 : eVar.K0;
                    i11 = i12;
                } else if (!z6 || (i11 = eVar.G0) == -1) {
                    i11 = i35;
                } else {
                    f7 = z5 ? 1.0f - eVar.M0 : eVar.M0;
                }
                constraintWidget8.h0 = i11;
                constraintWidget8.f1241c0 = f7;
            }
            if (i32 == i14 - 1) {
                constraintWidget8.f(constraintWidget8.J, this.f19157f, this.j);
            }
            if (constraintWidget7 != null) {
                c cVar7 = constraintWidget7.J;
                c cVar8 = constraintWidget8.H;
                cVar8.a(cVar7, eVar.O0);
                if (i32 == i16) {
                    int i36 = this.f19159h;
                    if (cVar8.h()) {
                        cVar8.f19150h = i36;
                    }
                }
                cVar7.a(cVar8, 0);
                if (i32 == i17 + 1) {
                    int i37 = this.j;
                    if (cVar7.h()) {
                        cVar7.f19150h = i37;
                    }
                }
            }
            if (constraintWidget8 != constraintWidget6) {
                int i38 = eVar.R0;
                c8 = 3;
                if (i38 == 3 && constraintWidget.D && constraintWidget8 != constraintWidget && constraintWidget8.D) {
                    constraintWidget8.L.a(constraintWidget.L, 0);
                } else if (i38 == 0) {
                    constraintWidget8.I.a(cVar6, 0);
                } else if (i38 == 1) {
                    constraintWidget8.K.a(cVar5, 0);
                } else if (z7) {
                    constraintWidget8.I.a(this.f19156e, this.f19160i);
                    constraintWidget8.K.a(this.f19158g, this.k);
                } else {
                    constraintWidget8.I.a(cVar6, 0);
                    constraintWidget8.K.a(cVar5, 0);
                }
            } else {
                c8 = 3;
            }
            i32++;
            constraintWidget7 = constraintWidget8;
        }
    }

    public final int c() {
        return this.f19152a == 1 ? this.f19162m - this.f19167r.P0 : this.f19162m;
    }

    public final int d() {
        return this.f19152a == 0 ? this.f19161l - this.f19167r.O0 : this.f19161l;
    }

    public final void e(int i7) {
        e eVar;
        int i10;
        int i11 = this.f19165p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f19164o;
        int i13 = i7 / i11;
        int i14 = 0;
        while (true) {
            eVar = this.f19167r;
            if (i14 >= i12 || (i10 = this.f19163n + i14) >= eVar.f19168a1) {
                break;
            }
            ConstraintWidget constraintWidget = eVar.Z0[i10];
            if (this.f19152a == 0) {
                if (constraintWidget != null) {
                    int[] iArr = constraintWidget.f1262o0;
                    if (iArr[0] == 3 && constraintWidget.f1264q == 0) {
                        eVar.Q(1, i13, iArr[1], constraintWidget.k(), constraintWidget);
                    }
                }
            } else if (constraintWidget != null) {
                int[] iArr2 = constraintWidget.f1262o0;
                if (iArr2[1] == 3 && constraintWidget.f1265r == 0) {
                    int i15 = i13;
                    eVar.Q(iArr2[0], constraintWidget.n(), 1, i15, constraintWidget);
                    i13 = i15;
                }
            }
            i14++;
        }
        this.f19161l = 0;
        this.f19162m = 0;
        this.f19153b = null;
        this.f19154c = 0;
        int i16 = this.f19164o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f19163n + i17;
            if (i18 >= eVar.f19168a1) {
                return;
            }
            ConstraintWidget constraintWidget2 = eVar.Z0[i18];
            if (this.f19152a == 0) {
                int iN = constraintWidget2.n();
                int i19 = eVar.O0;
                if (constraintWidget2.f1247f0 == 8) {
                    i19 = 0;
                }
                this.f19161l = iN + i19 + this.f19161l;
                int iO = eVar.O(constraintWidget2, this.f19166q);
                if (this.f19153b == null || this.f19154c < iO) {
                    this.f19153b = constraintWidget2;
                    this.f19154c = iO;
                    this.f19162m = iO;
                }
            } else {
                int iP = eVar.P(constraintWidget2, this.f19166q);
                int iO2 = eVar.O(constraintWidget2, this.f19166q);
                int i20 = eVar.P0;
                if (constraintWidget2.f1247f0 == 8) {
                    i20 = 0;
                }
                this.f19162m = iO2 + i20 + this.f19162m;
                if (this.f19153b == null || this.f19154c < iP) {
                    this.f19153b = constraintWidget2;
                    this.f19154c = iP;
                    this.f19161l = iP;
                }
            }
        }
    }

    public final void f(int i7, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f19152a = i7;
        this.f19155d = cVar;
        this.f19156e = cVar2;
        this.f19157f = cVar3;
        this.f19158g = cVar4;
        this.f19159h = i10;
        this.f19160i = i11;
        this.j = i12;
        this.k = i13;
        this.f19166q = i14;
    }
}
