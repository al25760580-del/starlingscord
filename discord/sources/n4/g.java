package n4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e, o4.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.a f16395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t4.b f16396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o4.f f16400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o4.f f16401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o4.r f16402i;
    public final v j;
    public o4.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o4.h f16404m;

    public g(v vVar, t4.b bVar, s4.l lVar) {
        Path path = new Path();
        this.f16394a = path;
        this.f16395b = new m4.a(1, 0);
        this.f16399f = new ArrayList();
        this.f16396c = bVar;
        String str = lVar.f19769c;
        r4.a aVar = lVar.f19771e;
        r4.a aVar2 = lVar.f19770d;
        this.f16397d = str;
        this.f16398e = lVar.f19772f;
        this.j = vVar;
        if (bVar.l() != null) {
            o4.i iVarL0 = ((r4.b) bVar.l().f17490e).l0();
            this.k = iVarL0;
            iVarL0.a(this);
            bVar.e(this.k);
        }
        if (bVar.m() != null) {
            this.f16404m = new o4.h(this, bVar, bVar.m());
        }
        if (aVar2 == null) {
            this.f16400g = null;
            this.f16401h = null;
            return;
        }
        path.setFillType(lVar.f19768b);
        o4.e eVarL0 = aVar2.l0();
        this.f16400g = (o4.f) eVarL0;
        eVarL0.a(this);
        bVar.e(eVarL0);
        o4.e eVarL1 = aVar.l0();
        this.f16401h = (o4.f) eVarL1;
        eVarL1.a(this);
        bVar.e(eVarL1);
    }

    @Override // o4.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // n4.c
    public final void b(List list, List list2) {
        for (int i7 = 0; i7 < list2.size(); i7++) {
            c cVar = (c) list2.get(i7);
            if (cVar instanceof m) {
                this.f16399f.add((m) cVar);
            }
        }
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        x4.g.f(eVar, i7, arrayList, eVar2, this);
    }

    @Override // n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        Path path = this.f16394a;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16399f;
            if (i7 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i7)).g(), matrix);
                i7++;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        BlurMaskFilter blurMaskFilter;
        if (this.f16398e) {
            return;
        }
        o4.f fVar = this.f16400g;
        int iK = fVar.k(fVar.f17122c.f(), fVar.c());
        float f2 = i7 / 255.0f;
        int iIntValue = (int) (((((Integer) this.f16401h.e()).intValue() * f2) / 100.0f) * 255.0f);
        PointF pointF = x4.g.f22635a;
        int i10 = 0;
        int iMax = (iK & 16777215) | (Math.max(0, Math.min(255, iIntValue)) << 24);
        m4.a aVar = this.f16395b;
        aVar.setColor(iMax);
        o4.r rVar = this.f16402i;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.e());
        }
        o4.e eVar = this.k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f16403l) {
                t4.b bVar = this.f16396c;
                if (bVar.A == fFloatValue) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f16403l = fFloatValue;
        }
        o4.h hVar = this.f16404m;
        if (hVar != null) {
            hs.c cVar = x4.h.f22636a;
            hVar.b(aVar, matrix, (int) (((f2 * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.f16394a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f16399f;
            if (i10 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                return;
            } else {
                path.addPath(((m) arrayList.get(i10)).g(), matrix);
                i10++;
            }
        }
    }

    @Override // n4.c
    public final String getName() {
        return this.f16397d;
    }

    @Override // q4.f
    public final void h(e4.c cVar, Object obj) {
        PointF pointF = z.f14943a;
        if (obj == 1) {
            this.f16400g.j(cVar);
            return;
        }
        if (obj == 4) {
            this.f16401h.j(cVar);
            return;
        }
        ColorFilter colorFilter = z.F;
        t4.b bVar = this.f16396c;
        if (obj == colorFilter) {
            o4.r rVar = this.f16402i;
            if (rVar != null) {
                bVar.p(rVar);
            }
            o4.r rVar2 = new o4.r(cVar, null);
            this.f16402i = rVar2;
            rVar2.a(this);
            bVar.e(this.f16402i);
            return;
        }
        if (obj == z.f14947e) {
            o4.e eVar = this.k;
            if (eVar != null) {
                eVar.j(cVar);
                return;
            }
            o4.r rVar3 = new o4.r(cVar, null);
            this.k = rVar3;
            rVar3.a(this);
            bVar.e(this.k);
            return;
        }
        o4.h hVar = this.f16404m;
        if (obj == 5 && hVar != null) {
            hVar.f17132c.j(cVar);
            return;
        }
        if (obj == z.B && hVar != null) {
            hVar.c(cVar);
            return;
        }
        if (obj == z.C && hVar != null) {
            hVar.f17134e.j(cVar);
            return;
        }
        if (obj == z.D && hVar != null) {
            hVar.f17135f.j(cVar);
        } else {
            if (obj != z.E || hVar == null) {
                return;
            }
            hVar.f17136g.j(cVar);
        }
    }
}
