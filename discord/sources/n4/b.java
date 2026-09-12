package n4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements o4.a, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f16366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t4.b f16367f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f16369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m4.a f16370i;
    public final o4.i j;
    public final o4.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f16371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o4.i f16372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o4.r f16373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o4.e f16374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f16375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o4.h f16376q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f16362a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16363b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f16364c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f16365d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16368g = new ArrayList();

    public b(v vVar, t4.b bVar, Paint.Cap cap, Paint.Join join, float f2, r4.a aVar, r4.b bVar2, ArrayList arrayList, r4.b bVar3) {
        m4.a aVar2 = new m4.a(1, 0);
        this.f16370i = aVar2;
        this.f16375p = 0.0f;
        this.f16366e = vVar;
        this.f16367f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f2);
        this.k = (o4.f) aVar.l0();
        this.j = bVar2.l0();
        if (bVar3 == null) {
            this.f16372m = null;
        } else {
            this.f16372m = bVar3.l0();
        }
        this.f16371l = new ArrayList(arrayList.size());
        this.f16369h = new float[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.f16371l.add(((r4.b) arrayList.get(i7)).l0());
        }
        bVar.e(this.k);
        bVar.e(this.j);
        for (int i10 = 0; i10 < this.f16371l.size(); i10++) {
            bVar.e((o4.e) this.f16371l.get(i10));
        }
        o4.i iVar = this.f16372m;
        if (iVar != null) {
            bVar.e(iVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((o4.e) this.f16371l.get(i11)).a(this);
        }
        o4.i iVar2 = this.f16372m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (bVar.l() != null) {
            o4.i iVarL0 = ((r4.b) bVar.l().f17490e).l0();
            this.f16374o = iVarL0;
            iVarL0.a(this);
            bVar.e(this.f16374o);
        }
        if (bVar.m() != null) {
            this.f16376q = new o4.h(this, bVar, bVar.m());
        }
    }

    @Override // o4.a
    public final void a() {
        this.f16366e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // n4.c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        t tVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof t) {
                t tVar2 = (t) cVar;
                if (tVar2.f16489c == 2) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f16368g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.f16489c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(tVar3);
                    tVar3.c(this);
                    aVar = aVar2;
                } else if (!(cVar2 instanceof m)) {
                    if (aVar == null) {
                        aVar = new a(tVar);
                    }
                    aVar.f16360a.add((m) cVar2);
                }
            } else if (!(cVar2 instanceof m)) {
                if (aVar == null) {
                    aVar = new a(tVar);
                }
                aVar.f16360a.add((m) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        x4.g.f(eVar, i7, arrayList, eVar2, this);
    }

    @Override // n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        Path path = this.f16363b;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16368g;
            if (i7 >= arrayList.size()) {
                RectF rectF2 = this.f16365d;
                path.computeBounds(rectF2, false);
                float fK = this.j.k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i7);
            for (int i10 = 0; i10 < aVar.f16360a.size(); i10++) {
                path.addPath(((m) aVar.f16360a.get(i10)).g(), matrix);
            }
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0208  */
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
    public void f(Canvas canvas, Matrix matrix, int i7) {
        float f2;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        b bVar = this;
        float[] fArr2 = (float[]) x4.h.f22639d.get();
        boolean z5 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f7 = i7 / 255.0f;
        o4.f fVar = bVar.k;
        float f10 = 100.0f;
        int iK = (int) (((fVar.k(fVar.f17122c.f(), fVar.c()) * f7) / 100.0f) * 255.0f);
        PointF pointF = x4.g.f22635a;
        int iMax = Math.max(0, Math.min(255, iK));
        m4.a aVar = bVar.f16370i;
        aVar.setAlpha(iMax);
        aVar.setStrokeWidth(bVar.j.k());
        if (aVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = bVar.f16371l;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar.f16369h;
                if (i10 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((o4.e) arrayList.get(i10)).e()).floatValue();
                fArr[i10] = fFloatValue;
                if (i10 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i10] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i10] = 0.1f;
                }
                i10++;
            }
            o4.i iVar = bVar.f16372m;
            aVar.setPathEffect(new DashPathEffect(fArr, iVar == null ? 0.0f : ((Float) iVar.e()).floatValue()));
        }
        o4.r rVar = bVar.f16373n;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.e());
        }
        o4.e eVar = bVar.f16374o;
        if (eVar != null) {
            float fFloatValue2 = ((Float) eVar.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                aVar.setMaskFilter(null);
            } else {
                if (fFloatValue2 != bVar.f16375p) {
                    t4.b bVar2 = bVar.f16367f;
                    if (bVar2.A == fFloatValue2) {
                        blurMaskFilter = bVar2.B;
                    } else {
                        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        bVar2.B = blurMaskFilter2;
                        bVar2.A = fFloatValue2;
                        blurMaskFilter = blurMaskFilter2;
                    }
                    aVar.setMaskFilter(blurMaskFilter);
                }
                bVar.f16375p = fFloatValue2;
            }
            bVar.f16375p = fFloatValue2;
        }
        o4.h hVar = bVar.f16376q;
        if (hVar != null) {
            hVar.b(aVar, matrix, (int) (((f7 * iK) / 255.0f) * 255.0f));
        }
        canvas.save();
        canvas.concat(matrix);
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f16368g;
            if (i11 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            a aVar2 = (a) arrayList2.get(i11);
            t tVar = aVar2.f16361b;
            ArrayList arrayList3 = aVar2.f16360a;
            Path path = bVar.f16363b;
            if (tVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    path.addPath(((m) arrayList3.get(size2)).g());
                }
                float fFloatValue3 = ((Float) tVar.f16490d.e()).floatValue() / f10;
                float fFloatValue4 = ((Float) tVar.f16491e.e()).floatValue() / f10;
                float fFloatValue5 = ((Float) tVar.f16492f.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = bVar.f16362a;
                    pathMeasure.setPath(path, z5);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f11 = fFloatValue5 * length;
                    float f12 = (fFloatValue3 * length) + f11;
                    float fMin = Math.min((fFloatValue4 * length) + f11, (f12 + length) - 1.0f);
                    int size3 = arrayList3.size() - 1;
                    float f13 = 0.0f;
                    while (size3 >= 0) {
                        Path pathG = ((m) arrayList3.get(size3)).g();
                        Path path2 = bVar.f16364c;
                        path2.set(pathG);
                        pathMeasure.setPath(path2, z5);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f14 = fMin - length;
                            if (f14 >= f13 + length2 || f13 >= f14) {
                                f2 = f13 + length2;
                                if (f2 < f12 && f13 <= fMin) {
                                    if (f2 > fMin || f12 >= f13) {
                                        x4.h.a(path2, f12 < f13 ? 0.0f : (f12 - f13) / length2, fMin > f2 ? 1.0f : (fMin - f13) / length2, 0.0f);
                                        canvas.drawPath(path2, aVar);
                                    } else {
                                        canvas.drawPath(path2, aVar);
                                    }
                                }
                            } else {
                                x4.h.a(path2, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, aVar);
                            }
                        } else {
                            f2 = f13 + length2;
                            if (f2 < f12) {
                            }
                        }
                        f13 += length2;
                        size3--;
                        bVar = this;
                        z5 = false;
                    }
                } else {
                    canvas.drawPath(path, aVar);
                }
            } else {
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((m) arrayList3.get(size4)).g());
                }
                canvas.drawPath(path, aVar);
            }
            i11++;
            bVar = this;
            z5 = false;
            f10 = 100.0f;
        }
    }

    @Override // q4.f
    public void h(e4.c cVar, Object obj) {
        PointF pointF = z.f14943a;
        if (obj == 4) {
            this.k.j(cVar);
            return;
        }
        if (obj == z.f14954n) {
            this.j.j(cVar);
            return;
        }
        ColorFilter colorFilter = z.F;
        t4.b bVar = this.f16367f;
        if (obj == colorFilter) {
            o4.r rVar = this.f16373n;
            if (rVar != null) {
                bVar.p(rVar);
            }
            o4.r rVar2 = new o4.r(cVar, null);
            this.f16373n = rVar2;
            rVar2.a(this);
            bVar.e(this.f16373n);
            return;
        }
        if (obj == z.f14947e) {
            o4.e eVar = this.f16374o;
            if (eVar != null) {
                eVar.j(cVar);
                return;
            }
            o4.r rVar3 = new o4.r(cVar, null);
            this.f16374o = rVar3;
            rVar3.a(this);
            bVar.e(this.f16374o);
            return;
        }
        o4.h hVar = this.f16376q;
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
