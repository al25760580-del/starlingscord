package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import s0.j;
import s0.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends ConstraintWidget {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ConstraintWidget[] f19184p0 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f19185q0 = 0;

    public final void M(int i7, ArrayList arrayList, p pVar) {
        for (int i10 = 0; i10 < this.f19185q0; i10++) {
            ConstraintWidget constraintWidget = this.f19184p0[i10];
            ArrayList arrayList2 = pVar.f19687a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i11 = 0; i11 < this.f19185q0; i11++) {
            j.b(this.f19184p0[i11], i7, arrayList, pVar);
        }
    }

    public void N() {
    }
}
