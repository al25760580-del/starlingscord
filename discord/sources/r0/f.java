package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ConstraintWidget {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f19178p0 = -1.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f19179q0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19180r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f19181s0 = this.I;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f19182t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f19183u0;

    public f() {
        this.Q.clear();
        this.Q.add(this.f19181s0);
        int length = this.P.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.P[i7] = this.f19181s0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void L(p0.c cVar, boolean z5) {
        if (this.S == null) {
            return;
        }
        c cVar2 = this.f19181s0;
        cVar.getClass();
        int iN = p0.c.n(cVar2);
        if (this.f19182t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i7) {
        this.f19181s0.l(i7);
        this.f19183u0 = true;
    }

    public final void N(int i7) {
        if (this.f19182t0 == i7) {
            return;
        }
        this.f19182t0 = i7;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.f19182t0 == 1) {
            this.f19181s0 = this.H;
        } else {
            this.f19181s0 = this.I;
        }
        arrayList.add(this.f19181s0);
        c[] cVarArr = this.P;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f19181s0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void b(p0.c cVar, boolean z5) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.S;
        if (constraintWidgetContainer == null) {
            return;
        }
        Object objI = constraintWidgetContainer.i(2);
        Object objI2 = constraintWidgetContainer.i(4);
        ConstraintWidget constraintWidget = this.S;
        boolean z6 = constraintWidget != null && constraintWidget.f1262o0[0] == 2;
        if (this.f19182t0 == 0) {
            objI = constraintWidgetContainer.i(3);
            objI2 = constraintWidgetContainer.i(5);
            ConstraintWidget constraintWidget2 = this.S;
            z6 = constraintWidget2 != null && constraintWidget2.f1262o0[1] == 2;
        }
        if (this.f19183u0) {
            c cVar2 = this.f19181s0;
            if (cVar2.f19145c) {
                p0.e eVarK = cVar.k(cVar2);
                cVar.d(eVarK, this.f19181s0.d());
                if (this.f19179q0 != -1) {
                    if (z6) {
                        cVar.f(cVar.k(objI2), eVarK, 0, 5);
                    }
                } else if (this.f19180r0 != -1 && z6) {
                    p0.e eVarK2 = cVar.k(objI2);
                    cVar.f(eVarK, cVar.k(objI), 0, 5);
                    cVar.f(eVarK2, eVarK, 0, 5);
                }
                this.f19183u0 = false;
                return;
            }
        }
        if (this.f19179q0 != -1) {
            p0.e eVarK3 = cVar.k(this.f19181s0);
            cVar.e(eVarK3, cVar.k(objI), this.f19179q0, 8);
            if (z6) {
                cVar.f(cVar.k(objI2), eVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f19180r0 != -1) {
            p0.e eVarK4 = cVar.k(this.f19181s0);
            p0.e eVarK5 = cVar.k(objI2);
            cVar.e(eVarK4, eVarK5, -this.f19180r0, 8);
            if (z6) {
                cVar.f(eVarK4, cVar.k(objI), 0, 5);
                cVar.f(eVarK5, eVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f19178p0 != -1.0f) {
            p0.e eVarK6 = cVar.k(this.f19181s0);
            p0.e eVarK7 = cVar.k(objI2);
            float f2 = this.f19178p0;
            p0.b bVarL = cVar.l();
            bVarL.f17736d.g(eVarK6, -1.0f);
            bVarL.f17736d.g(eVarK7, f2);
            cVar.c(bVarL);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final c i(int i7) {
        int iB = f0.e.b(i7);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.f19182t0 == 0) {
                return this.f19181s0;
            }
            return null;
        }
        if (this.f19182t0 == 1) {
            return this.f19181s0;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean x() {
        return this.f19183u0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean y() {
        return this.f19183u0;
    }
}
