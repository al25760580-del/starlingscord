package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19124r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f19125s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f19126t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f19127u0;

    public final boolean O() {
        int i7;
        int i10;
        int i11;
        boolean z5 = true;
        int i12 = 0;
        while (true) {
            i7 = this.f19185q0;
            if (i12 >= i7) {
                break;
            }
            ConstraintWidget constraintWidget = this.f19184p0[i12];
            if ((this.f19125s0 || constraintWidget.c()) && ((((i10 = this.f19124r0) == 0 || i10 == 1) && !constraintWidget.x()) || (((i11 = this.f19124r0) == 2 || i11 == 3) && !constraintWidget.y()))) {
                z5 = false;
            }
            i12++;
        }
        if (!z5 || i7 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z6 = false;
        for (int i13 = 0; i13 < this.f19185q0; i13++) {
            ConstraintWidget constraintWidget2 = this.f19184p0[i13];
            if (this.f19125s0 || constraintWidget2.c()) {
                if (!z6) {
                    int i14 = this.f19124r0;
                    if (i14 == 0) {
                        iMax = constraintWidget2.i(2).d();
                    } else if (i14 == 1) {
                        iMax = constraintWidget2.i(4).d();
                    } else if (i14 == 2) {
                        iMax = constraintWidget2.i(3).d();
                    } else if (i14 == 3) {
                        iMax = constraintWidget2.i(5).d();
                    }
                    z6 = true;
                }
                int i15 = this.f19124r0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.i(2).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.i(4).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.i(3).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.i(5).d());
                }
            }
        }
        int i16 = iMax + this.f19126t0;
        int i17 = this.f19124r0;
        if (i17 == 0 || i17 == 1) {
            E(i16, i16);
        } else {
            F(i16, i16);
        }
        this.f19127u0 = true;
        return true;
    }

    public final int P() {
        int i7 = this.f19124r0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void b(p0.c cVar, boolean z5) {
        boolean z6;
        int i7;
        int i10;
        c[] cVarArr = this.P;
        c cVar2 = this.H;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.I;
        cVarArr[2] = cVar3;
        c cVar4 = this.J;
        cVarArr[1] = cVar4;
        c cVar5 = this.K;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f19151i = cVar.k(cVar6);
        }
        int i12 = this.f19124r0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i12];
        if (!this.f19127u0) {
            O();
        }
        if (this.f19127u0) {
            this.f19127u0 = false;
            int i13 = this.f19124r0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(cVar2.f19151i, this.X);
                cVar.d(cVar4.f19151i, this.X);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(cVar3.f19151i, this.Y);
                    cVar.d(cVar5.f19151i, this.Y);
                    return;
                }
                return;
            }
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.f19185q0) {
                z6 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f19184p0[i14];
            if ((this.f19125s0 || constraintWidget.c()) && ((((i10 = this.f19124r0) == 0 || i10 == 1) && constraintWidget.f1262o0[0] == 3 && constraintWidget.H.f19148f != null && constraintWidget.J.f19148f != null) || ((i10 == 2 || i10 == 3) && constraintWidget.f1262o0[1] == 3 && constraintWidget.I.f19148f != null && constraintWidget.K.f19148f != null))) {
                z6 = true;
                break;
            }
            i14++;
        }
        boolean z7 = cVar2.g() || cVar4.g();
        boolean z10 = cVar3.g() || cVar5.g();
        int i15 = !(!z6 && (((i7 = this.f19124r0) == 0 && z7) || ((i7 == 2 && z10) || ((i7 == 1 && z7) || (i7 == 3 && z10))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f19185q0) {
            ConstraintWidget constraintWidget2 = this.f19184p0[i16];
            if (this.f19125s0 || constraintWidget2.c()) {
                p0.e eVarK = cVar.k(constraintWidget2.P[this.f19124r0]);
                c[] cVarArr2 = constraintWidget2.P;
                int i17 = this.f19124r0;
                c cVar8 = cVarArr2[i17];
                cVar8.f19151i = eVarK;
                c cVar9 = cVar8.f19148f;
                int i18 = (cVar9 == null || cVar9.f19146d != this) ? 0 : cVar8.f19149g;
                if (i17 == 0 || i17 == i11) {
                    p0.e eVar = cVar7.f19151i;
                    int i19 = this.f19126t0 - i18;
                    p0.b bVarL = cVar.l();
                    p0.e eVarM = cVar.m();
                    eVarM.f17761v = 0;
                    bVarL.c(eVar, eVarK, eVarM, i19);
                    cVar.c(bVarL);
                } else {
                    p0.e eVar2 = cVar7.f19151i;
                    int i20 = this.f19126t0 + i18;
                    p0.b bVarL2 = cVar.l();
                    p0.e eVarM2 = cVar.m();
                    eVarM2.f17761v = 0;
                    bVarL2.b(eVar2, eVarK, eVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f19151i, eVarK, this.f19126t0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f19124r0;
        if (i21 == 0) {
            cVar.e(cVar4.f19151i, cVar2.f19151i, 0, 8);
            cVar.e(cVar2.f19151i, this.S.J.f19151i, 0, 4);
            cVar.e(cVar2.f19151i, this.S.H.f19151i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.f19151i, cVar4.f19151i, 0, 8);
            cVar.e(cVar2.f19151i, this.S.H.f19151i, 0, 4);
            cVar.e(cVar2.f19151i, this.S.J.f19151i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.f19151i, cVar3.f19151i, 0, 8);
            cVar.e(cVar3.f19151i, this.S.K.f19151i, 0, 4);
            cVar.e(cVar3.f19151i, this.S.I.f19151i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.f19151i, cVar5.f19151i, 0, 8);
            cVar.e(cVar3.f19151i, this.S.I.f19151i, 0, 4);
            cVar.e(cVar3.f19151i, this.S.K.f19151i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strK = com.discord.chat.presentation.list.a.k(new StringBuilder("[Barrier] "), this.f1249g0, " {");
        for (int i7 = 0; i7 < this.f19185q0; i7++) {
            ConstraintWidget constraintWidget = this.f19184p0[i7];
            if (i7 > 0) {
                strK = kk.b.j(strK, ", ");
            }
            StringBuilder sbN = kk.b.n(strK);
            sbN.append(constraintWidget.f1249g0);
            strK = sbN.toString();
        }
        return kk.b.j(strK, "}");
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean x() {
        return this.f19127u0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean y() {
        return this.f19127u0;
    }
}
