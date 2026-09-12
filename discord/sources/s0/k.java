package s0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q {
    @Override // s0.e
    public final void a(e eVar) {
        h hVar = this.f19699h;
        if (hVar.f19673c && !hVar.j) {
            hVar.d((int) ((((h) hVar.f19680l.get(0)).f19677g * ((r0.f) this.f19693b).f19178p0) + 0.5f));
        }
    }

    @Override // s0.q
    public final void d() {
        ConstraintWidget constraintWidget = this.f19693b;
        r0.f fVar = (r0.f) constraintWidget;
        int i7 = fVar.f19179q0;
        int i10 = fVar.f19180r0;
        int i11 = fVar.f19182t0;
        h hVar = this.f19699h;
        if (i11 == 1) {
            if (i7 != -1) {
                hVar.f19680l.add(constraintWidget.S.f1242d.f19699h);
                this.f19693b.S.f1242d.f19699h.k.add(hVar);
                hVar.f19676f = i7;
            } else if (i10 != -1) {
                hVar.f19680l.add(constraintWidget.S.f1242d.f19700i);
                this.f19693b.S.f1242d.f19700i.k.add(hVar);
                hVar.f19676f = -i10;
            } else {
                hVar.f19672b = true;
                hVar.f19680l.add(constraintWidget.S.f1242d.f19700i);
                this.f19693b.S.f1242d.f19700i.k.add(hVar);
            }
            m(this.f19693b.f1242d.f19699h);
            m(this.f19693b.f1242d.f19700i);
            return;
        }
        if (i7 != -1) {
            hVar.f19680l.add(constraintWidget.S.f1244e.f19699h);
            this.f19693b.S.f1244e.f19699h.k.add(hVar);
            hVar.f19676f = i7;
        } else if (i10 != -1) {
            hVar.f19680l.add(constraintWidget.S.f1244e.f19700i);
            this.f19693b.S.f1244e.f19700i.k.add(hVar);
            hVar.f19676f = -i10;
        } else {
            hVar.f19672b = true;
            hVar.f19680l.add(constraintWidget.S.f1244e.f19700i);
            this.f19693b.S.f1244e.f19700i.k.add(hVar);
        }
        m(this.f19693b.f1244e.f19699h);
        m(this.f19693b.f1244e.f19700i);
    }

    @Override // s0.q
    public final void e() {
        ConstraintWidget constraintWidget = this.f19693b;
        int i7 = ((r0.f) constraintWidget).f19182t0;
        h hVar = this.f19699h;
        if (i7 == 1) {
            constraintWidget.X = hVar.f19677g;
        } else {
            constraintWidget.Y = hVar.f19677g;
        }
    }

    @Override // s0.q
    public final void f() {
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
