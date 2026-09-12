package n4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t4.b f16482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f16483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o4.f f16485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o4.r f16486v;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(v vVar, t4.b bVar, s4.o oVar) {
        int iB = f0.e.b(oVar.f19786g);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = f0.e.b(oVar.f19787h);
        super(vVar, bVar, cap, iB2 != 0 ? iB2 != 1 ? iB2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.f19788i, oVar.f19784e, oVar.f19785f, oVar.f19782c, oVar.f19781b);
        this.f16482r = bVar;
        this.f16483s = oVar.f19780a;
        this.f16484t = oVar.j;
        o4.e eVarL0 = oVar.f19783d.l0();
        this.f16485u = (o4.f) eVarL0;
        eVarL0.a(this);
        bVar.e(eVarL0);
    }

    @Override // n4.b, n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        if (this.f16484t) {
            return;
        }
        o4.f fVar = this.f16485u;
        int iK = fVar.k(fVar.f17122c.f(), fVar.c());
        m4.a aVar = this.f16370i;
        aVar.setColor(iK);
        o4.r rVar = this.f16486v;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.e());
        }
        super.f(canvas, matrix, i7);
    }

    @Override // n4.c
    public final String getName() {
        return this.f16483s;
    }

    @Override // n4.b, q4.f
    public final void h(e4.c cVar, Object obj) {
        super.h(cVar, obj);
        PointF pointF = z.f14943a;
        o4.f fVar = this.f16485u;
        if (obj == 2) {
            fVar.j(cVar);
            return;
        }
        if (obj == z.F) {
            o4.r rVar = this.f16486v;
            t4.b bVar = this.f16482r;
            if (rVar != null) {
                bVar.p(rVar);
            }
            o4.r rVar2 = new o4.r(cVar, null);
            this.f16486v = rVar2;
            rVar2.a(this);
            bVar.e(fVar);
        }
    }
}
