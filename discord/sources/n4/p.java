package n4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class p implements e, m, j, o4.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f16463a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16464b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t4.b f16466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o4.i f16469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o4.i f16470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o4.q f16471i;
    public d j;

    public p(v vVar, t4.b bVar, s4.i iVar) {
        this.f16465c = vVar;
        this.f16466d = bVar;
        this.f16467e = iVar.f19758b;
        this.f16468f = iVar.f19760d;
        o4.i iVarL0 = iVar.f19759c.l0();
        this.f16469g = iVarL0;
        bVar.e(iVarL0);
        iVarL0.a(this);
        o4.i iVarL1 = ((r4.b) iVar.f19761e).l0();
        this.f16470h = iVarL1;
        bVar.e(iVarL1);
        iVarL1.a(this);
        r4.d dVar = (r4.d) iVar.f19762f;
        dVar.getClass();
        o4.q qVar = new o4.q(dVar);
        this.f16471i = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    @Override // o4.a
    public final void a() {
        this.f16465c.invalidateSelf();
    }

    @Override // n4.c
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        x4.g.f(eVar, i7, arrayList, eVar2, this);
        for (int i10 = 0; i10 < this.j.f16384h.size(); i10++) {
            c cVar = (c) this.j.f16384h.get(i10);
            if (cVar instanceof k) {
                x4.g.f(eVar, i7, arrayList, eVar2, (k) cVar);
            }
        }
    }

    @Override // n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        this.j.d(rectF, matrix, z5);
    }

    @Override // n4.j
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new d(this.f16465c, this.f16466d, "Repeater", this.f16468f, arrayList, null);
    }

    @Override // n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        float fFloatValue = ((Float) this.f16469g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f16470h.e()).floatValue();
        o4.q qVar = this.f16471i;
        float fFloatValue3 = ((Float) qVar.f17166m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) qVar.f17167n.e()).floatValue() / 100.0f;
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f16463a;
            matrix2.set(matrix);
            float f2 = i10;
            matrix2.preConcat(qVar.f(f2 + fFloatValue2));
            this.j.f(canvas, matrix2, (int) (x4.g.e(fFloatValue3, fFloatValue4, f2 / fFloatValue) * i7));
        }
    }

    @Override // n4.m
    public final Path g() {
        Path pathG = this.j.g();
        Path path = this.f16464b;
        path.reset();
        float fFloatValue = ((Float) this.f16469g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f16470h.e()).floatValue();
        for (int i7 = ((int) fFloatValue) - 1; i7 >= 0; i7--) {
            Matrix matrixF = this.f16471i.f(i7 + fFloatValue2);
            Matrix matrix = this.f16463a;
            matrix.set(matrixF);
            path.addPath(pathG, matrix);
        }
        return path;
    }

    @Override // n4.c
    public final String getName() {
        return this.f16467e;
    }

    @Override // q4.f
    public final void h(e4.c cVar, Object obj) {
        if (this.f16471i.c(cVar, obj)) {
            return;
        }
        if (obj == z.f14956p) {
            this.f16469g.j(cVar);
        } else if (obj == z.f14957q) {
            this.f16470h.j(cVar);
        }
    }
}
