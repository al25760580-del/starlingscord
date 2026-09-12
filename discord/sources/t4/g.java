package t4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.v;
import s4.m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public final n4.d D;
    public final c E;

    public g(v vVar, e eVar, c cVar, l4.i iVar) {
        super(vVar, eVar);
        this.E = cVar;
        n4.d dVar = new n4.d(vVar, this, new m("__container", eVar.f20617a, false), iVar);
        this.D = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
    }

    @Override // t4.b, n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        super.d(rectF, matrix, z5);
        this.D.d(rectF, this.f20604n, z5);
    }

    @Override // t4.b
    public final void k(Canvas canvas, Matrix matrix, int i7) {
        this.D.f(canvas, matrix, i7);
    }

    @Override // t4.b
    public final op.c l() {
        op.c cVar = this.f20606p.f20637w;
        return cVar != null ? cVar : this.E.f20606p.f20637w;
    }

    @Override // t4.b
    public final e9.b m() {
        e9.b bVar = this.f20606p.f20638x;
        return bVar != null ? bVar : this.E.f20606p.f20638x;
    }

    @Override // t4.b
    public final void q(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        this.D.c(eVar, i7, arrayList, eVar2);
    }
}
