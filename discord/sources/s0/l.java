package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends q {
    @Override // s0.e
    public final void a(e eVar) {
        r0.a aVar = (r0.a) this.f19693b;
        int i7 = aVar.f19124r0;
        h hVar = this.f19699h;
        Iterator it = hVar.f19680l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((h) it.next()).f19677g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i7 == 0 || i7 == 2) {
            hVar.d(i11 + aVar.f19126t0);
        } else {
            hVar.d(i10 + aVar.f19126t0);
        }
    }

    @Override // s0.q
    public final void d() {
        ConstraintWidget constraintWidget = this.f19693b;
        if (constraintWidget instanceof r0.a) {
            h hVar = this.f19699h;
            hVar.f19672b = true;
            ArrayList arrayList = hVar.f19680l;
            r0.a aVar = (r0.a) constraintWidget;
            int i7 = aVar.f19124r0;
            boolean z5 = aVar.f19125s0;
            int i10 = 0;
            if (i7 == 0) {
                hVar.f19675e = 4;
                while (i10 < aVar.f19185q0) {
                    ConstraintWidget constraintWidget2 = aVar.f19184p0[i10];
                    if (z5 || constraintWidget2.f1247f0 != 8) {
                        h hVar2 = constraintWidget2.f1242d.f19699h;
                        hVar2.k.add(hVar);
                        arrayList.add(hVar2);
                    }
                    i10++;
                }
                m(this.f19693b.f1242d.f19699h);
                m(this.f19693b.f1242d.f19700i);
                return;
            }
            if (i7 == 1) {
                hVar.f19675e = 5;
                while (i10 < aVar.f19185q0) {
                    ConstraintWidget constraintWidget3 = aVar.f19184p0[i10];
                    if (z5 || constraintWidget3.f1247f0 != 8) {
                        h hVar3 = constraintWidget3.f1242d.f19700i;
                        hVar3.k.add(hVar);
                        arrayList.add(hVar3);
                    }
                    i10++;
                }
                m(this.f19693b.f1242d.f19699h);
                m(this.f19693b.f1242d.f19700i);
                return;
            }
            if (i7 == 2) {
                hVar.f19675e = 6;
                while (i10 < aVar.f19185q0) {
                    ConstraintWidget constraintWidget4 = aVar.f19184p0[i10];
                    if (z5 || constraintWidget4.f1247f0 != 8) {
                        h hVar4 = constraintWidget4.f1244e.f19699h;
                        hVar4.k.add(hVar);
                        arrayList.add(hVar4);
                    }
                    i10++;
                }
                m(this.f19693b.f1244e.f19699h);
                m(this.f19693b.f1244e.f19700i);
                return;
            }
            if (i7 != 3) {
                return;
            }
            hVar.f19675e = 7;
            while (i10 < aVar.f19185q0) {
                ConstraintWidget constraintWidget5 = aVar.f19184p0[i10];
                if (z5 || constraintWidget5.f1247f0 != 8) {
                    h hVar5 = constraintWidget5.f1244e.f19700i;
                    hVar5.k.add(hVar);
                    arrayList.add(hVar5);
                }
                i10++;
            }
            m(this.f19693b.f1244e.f19699h);
            m(this.f19693b.f1244e.f19700i);
        }
    }

    @Override // s0.q
    public final void e() {
        ConstraintWidget constraintWidget = this.f19693b;
        if (constraintWidget instanceof r0.a) {
            int i7 = ((r0.a) constraintWidget).f19124r0;
            h hVar = this.f19699h;
            if (i7 == 0 || i7 == 1) {
                constraintWidget.X = hVar.f19677g;
            } else {
                constraintWidget.Y = hVar.f19677g;
            }
        }
    }

    @Override // s0.q
    public final void f() {
        this.f19694c = null;
        this.f19699h.c();
    }

    @Override // s0.q
    public final boolean k() {
        return false;
    }

    public final void m(h hVar) {
        h hVar2 = this.f19699h;
        hVar2.k.add(hVar);
        hVar.f19680l.add(hVar2);
    }
}
