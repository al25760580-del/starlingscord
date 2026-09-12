package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public s0.b A0;
    public s0.c B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public ConstraintWidget[] W0;
    public ConstraintWidget[] X0;
    public int[] Y0;
    public ConstraintWidget[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f19168a1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19169r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f19170s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f19171t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f19172u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f19173v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19174w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f19175x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f19176y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f19177z0;

    @Override // r0.g
    public final void N() {
        for (int i7 = 0; i7 < this.f19185q0; i7++) {
            ConstraintWidget constraintWidget = this.f19184p0[i7];
            if (constraintWidget != null) {
                constraintWidget.E = true;
            }
        }
    }

    public final int O(ConstraintWidget constraintWidget, int i7) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget != null) {
            int[] iArr = constraintWidget.f1262o0;
            if (iArr[1] == 3) {
                int i10 = constraintWidget.f1265r;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (constraintWidget.f1272y * i7);
                        if (i11 != constraintWidget.k()) {
                            constraintWidget.f1248g = true;
                            Q(iArr[0], constraintWidget.n(), 1, i11, constraintWidget);
                        }
                        return i11;
                    }
                    constraintWidget2 = constraintWidget;
                    if (i10 == 1) {
                        return constraintWidget2.k();
                    }
                    if (i10 == 3) {
                        return (int) ((constraintWidget2.n() * constraintWidget2.V) + 0.5f);
                    }
                }
            } else {
                constraintWidget2 = constraintWidget;
            }
            return constraintWidget2.k();
        }
        return 0;
    }

    public final int P(ConstraintWidget constraintWidget, int i7) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget != null) {
            int[] iArr = constraintWidget.f1262o0;
            if (iArr[0] == 3) {
                int i10 = constraintWidget.f1264q;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (constraintWidget.f1269v * i7);
                        if (i11 != constraintWidget.n()) {
                            constraintWidget.f1248g = true;
                            Q(1, i11, iArr[1], constraintWidget.k(), constraintWidget);
                        }
                        return i11;
                    }
                    constraintWidget2 = constraintWidget;
                    if (i10 == 1) {
                        return constraintWidget2.n();
                    }
                    if (i10 == 3) {
                        return (int) ((constraintWidget2.k() * constraintWidget2.V) + 0.5f);
                    }
                }
            } else {
                constraintWidget2 = constraintWidget;
            }
            return constraintWidget2.n();
        }
        return 0;
    }

    public final void Q(int i7, int i10, int i11, int i12, ConstraintWidget constraintWidget) {
        s0.c cVar;
        ConstraintWidget constraintWidget2;
        s0.b bVar = this.A0;
        while (true) {
            cVar = this.B0;
            if (cVar != null || (constraintWidget2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((ConstraintWidgetContainer) constraintWidget2).f1278t0;
            }
        }
        bVar.f19653a = i7;
        bVar.f19654b = i11;
        bVar.f19655c = i10;
        bVar.f19656d = i12;
        ((ConstraintLayout.Measurer) cVar).b(constraintWidget, bVar);
        constraintWidget.J(bVar.f19657e);
        constraintWidget.G(bVar.f19658f);
        constraintWidget.D = bVar.f19660h;
        constraintWidget.D(bVar.f19659g);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void b(p0.c cVar, boolean z5) {
        ConstraintWidget constraintWidget;
        float f2;
        int i7;
        ArrayList arrayList = this.V0;
        super.b(cVar, z5);
        ConstraintWidget constraintWidget2 = this.S;
        boolean z6 = constraintWidget2 != null && ((ConstraintWidgetContainer) constraintWidget2).f1279u0;
        int i10 = this.S0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    ((d) arrayList.get(i11)).b(i11, z6, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i12 = 0; i12 < this.f19168a1; i12++) {
                    this.Z0[i12].A();
                }
                int[] iArr = this.Y0;
                int i13 = iArr[0];
                int i14 = iArr[1];
                float f7 = this.I0;
                ConstraintWidget constraintWidget3 = null;
                int i15 = 0;
                while (i15 < i13) {
                    if (z6) {
                        i7 = (i13 - i15) - 1;
                        f2 = 1.0f - this.I0;
                    } else {
                        f2 = f7;
                        i7 = i15;
                    }
                    ConstraintWidget constraintWidget4 = this.X0[i7];
                    if (constraintWidget4 != null) {
                        c cVar2 = constraintWidget4.H;
                        if (constraintWidget4.f1247f0 != 8) {
                            if (i15 == 0) {
                                constraintWidget4.f(cVar2, this.H, this.f19173v0);
                                constraintWidget4.h0 = this.C0;
                                constraintWidget4.f1241c0 = f2;
                            }
                            if (i15 == i13 - 1) {
                                constraintWidget4.f(constraintWidget4.J, this.J, this.f19174w0);
                            }
                            if (i15 > 0 && constraintWidget3 != null) {
                                c cVar3 = constraintWidget3.J;
                                constraintWidget4.f(cVar2, cVar3, this.O0);
                                constraintWidget3.f(cVar3, cVar2, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                    }
                    i15++;
                    f7 = f2;
                }
                for (int i16 = 0; i16 < i14; i16++) {
                    ConstraintWidget constraintWidget5 = this.W0[i16];
                    if (constraintWidget5 != null) {
                        c cVar4 = constraintWidget5.I;
                        if (constraintWidget5.f1247f0 != 8) {
                            if (i16 == 0) {
                                constraintWidget5.f(cVar4, this.I, this.f19169r0);
                                constraintWidget5.f1252i0 = this.D0;
                                constraintWidget5.f1243d0 = this.J0;
                            }
                            if (i16 == i14 - 1) {
                                constraintWidget5.f(constraintWidget5.K, this.K, this.f19170s0);
                            }
                            if (i16 > 0 && constraintWidget3 != null) {
                                c cVar5 = constraintWidget3.K;
                                constraintWidget5.f(cVar4, cVar5, this.P0);
                                constraintWidget3.f(cVar5, cVar4, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                }
                for (int i17 = 0; i17 < i13; i17++) {
                    for (int i18 = 0; i18 < i14; i18++) {
                        int i19 = (i18 * i13) + i17;
                        if (this.U0 == 1) {
                            i19 = (i17 * i14) + i18;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.Z0;
                        if (i19 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i19]) != null && constraintWidget.f1247f0 != 8) {
                            ConstraintWidget constraintWidget6 = this.X0[i17];
                            ConstraintWidget constraintWidget7 = this.W0[i18];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.f(constraintWidget.H, constraintWidget6.H, 0);
                                constraintWidget.f(constraintWidget.J, constraintWidget6.J, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.f(constraintWidget.I, constraintWidget7.I, 0);
                                constraintWidget.f(constraintWidget.K, constraintWidget7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).b(0, z6, true);
        }
        this.f19175x0 = false;
    }
}
