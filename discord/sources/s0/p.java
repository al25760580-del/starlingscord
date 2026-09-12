package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f19686f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f19687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f19690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19691e;

    public final void a(ArrayList arrayList) {
        int size = this.f19687a.size();
        if (this.f19691e != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                p pVar = (p) arrayList.get(i7);
                if (this.f19691e == pVar.f19688b) {
                    c(this.f19689c, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(p0.c cVar, int i7) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f19687a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).S;
        cVar.t();
        constraintWidgetContainer.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ConstraintWidget) arrayList.get(i10)).b(cVar, false);
        }
        if (i7 == 0 && constraintWidgetContainer.f1283y0 > 0) {
            r0.h.a(constraintWidgetContainer, cVar, arrayList, 0);
        }
        if (i7 == 1 && constraintWidgetContainer.f1284z0 > 0) {
            r0.h.a(constraintWidgetContainer, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f19690d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i11);
            k8.a aVar = new k8.a();
            new WeakReference(constraintWidget);
            p0.c.n(constraintWidget.H);
            p0.c.n(constraintWidget.I);
            p0.c.n(constraintWidget.J);
            p0.c.n(constraintWidget.K);
            p0.c.n(constraintWidget.L);
            this.f19690d.add(aVar);
        }
        if (i7 == 0) {
            iN = p0.c.n(constraintWidgetContainer.H);
            iN2 = p0.c.n(constraintWidgetContainer.J);
            cVar.t();
        } else {
            iN = p0.c.n(constraintWidgetContainer.I);
            iN2 = p0.c.n(constraintWidgetContainer.K);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i7, p pVar) {
        int i10 = pVar.f19688b;
        for (ConstraintWidget constraintWidget : this.f19687a) {
            ArrayList arrayList = pVar.f19687a;
            if (!arrayList.contains(constraintWidget)) {
                arrayList.add(constraintWidget);
            }
            if (i7 == 0) {
                constraintWidget.f1258m0 = i10;
            } else {
                constraintWidget.f1260n0 = i10;
            }
        }
        this.f19691e = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.f19689c;
        if (i7 == 0) {
            str = "Horizontal";
        } else if (i7 == 1) {
            str = "Vertical";
        } else {
            str = i7 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strL = kk.b.l(sb2, this.f19688b, "] <");
        for (ConstraintWidget constraintWidget : this.f19687a) {
            StringBuilder sbO = kk.b.o(strL, " ");
            sbO.append(constraintWidget.f1249g0);
            strL = sbO.toString();
        }
        return kk.b.j(strL, " >");
    }
}
