package n4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e, o4.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t4.b f16407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.k f16408d = new s.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s.k f16409e = new s.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f16410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m4.a f16411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f16412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f16413i;
    public final int j;
    public final o4.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o4.f f16414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o4.j f16415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o4.j f16416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o4.r f16417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o4.r f16418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f16419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o4.e f16421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f16422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o4.h f16423u;

    public h(v vVar, l4.i iVar, t4.b bVar, s4.d dVar) {
        Path path = new Path();
        this.f16410f = path;
        this.f16411g = new m4.a(1, 0);
        this.f16412h = new RectF();
        this.f16413i = new ArrayList();
        this.f16422t = 0.0f;
        this.f16407c = bVar;
        this.f16405a = dVar.f19729g;
        this.f16406b = dVar.f19730h;
        this.f16419q = vVar;
        this.j = dVar.f19723a;
        path.setFillType(dVar.f19724b);
        this.f16420r = (int) (iVar.b() / 32.0f);
        o4.e eVarL0 = dVar.f19725c.l0();
        this.k = (o4.j) eVarL0;
        eVarL0.a(this);
        bVar.e(eVarL0);
        o4.e eVarL1 = dVar.f19726d.l0();
        this.f16414l = (o4.f) eVarL1;
        eVarL1.a(this);
        bVar.e(eVarL1);
        o4.e eVarL2 = dVar.f19727e.l0();
        this.f16415m = (o4.j) eVarL2;
        eVarL2.a(this);
        bVar.e(eVarL2);
        o4.e eVarL3 = dVar.f19728f.l0();
        this.f16416n = (o4.j) eVarL3;
        eVarL3.a(this);
        bVar.e(eVarL3);
        if (bVar.l() != null) {
            o4.i iVarL0 = ((r4.b) bVar.l().f17490e).l0();
            this.f16421s = iVarL0;
            iVarL0.a(this);
            bVar.e(this.f16421s);
        }
        if (bVar.m() != null) {
            this.f16423u = new o4.h(this, bVar, bVar.m());
        }
    }

    @Override // o4.a
    public final void a() {
        this.f16419q.invalidateSelf();
    }

    @Override // n4.c
    public final void b(List list, List list2) {
        for (int i7 = 0; i7 < list2.size(); i7++) {
            c cVar = (c) list2.get(i7);
            if (cVar instanceof m) {
                this.f16413i.add((m) cVar);
            }
        }
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        x4.g.f(eVar, i7, arrayList, eVar2, this);
    }

    @Override // n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        Path path = this.f16410f;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16413i;
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

    public final int[] e(int[] iArr) {
        o4.r rVar = this.f16418p;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i7 = 0;
            if (iArr.length == numArr.length) {
                while (i7 < iArr.length) {
                    iArr[i7] = numArr[i7].intValue();
                    i7++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i7 < numArr.length) {
                    iArr[i7] = numArr[i7].intValue();
                    i7++;
                }
            }
        }
        return iArr;
    }

    @Override // n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        Shader shader;
        Shader radialGradient;
        if (this.f16406b) {
            return;
        }
        Path path = this.f16410f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16413i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i10)).g(), matrix);
            i10++;
        }
        path.computeBounds(this.f16412h, false);
        int i11 = this.j;
        o4.j jVar = this.k;
        o4.j jVar2 = this.f16416n;
        o4.j jVar3 = this.f16415m;
        if (i11 == 1) {
            long jI = i();
            s.k kVar = this.f16408d;
            shader = (LinearGradient) kVar.b(jI);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                s4.c cVar = (s4.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(cVar.f19722b), cVar.f19721a, Shader.TileMode.CLAMP);
                kVar.e(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            s.k kVar2 = this.f16409e;
            shader = (RadialGradient) kVar2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                s4.c cVar2 = (s4.c) jVar.e();
                int[] iArrE = e(cVar2.f19722b);
                float[] fArr = cVar2.f19721a;
                float f2 = pointF3.x;
                float f7 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f2, pointF4.y - f7);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f2, f7, fHypot, iArrE, fArr, Shader.TileMode.CLAMP);
                kVar2.e(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        m4.a aVar = this.f16411g;
        aVar.setShader(shader);
        o4.r rVar = this.f16417o;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.e());
        }
        o4.e eVar = this.f16421s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f16422t) {
                aVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f16422t = fFloatValue;
        }
        float f10 = i7 / 255.0f;
        int iIntValue = (int) (((((Integer) this.f16414l.e()).intValue() * f10) / 100.0f) * 255.0f);
        PointF pointF5 = x4.g.f22635a;
        aVar.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        o4.h hVar = this.f16423u;
        if (hVar != null) {
            hs.c cVar3 = x4.h.f22636a;
            hVar.b(aVar, matrix, (int) (((f10 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, aVar);
    }

    @Override // n4.c
    public final String getName() {
        return this.f16405a;
    }

    @Override // q4.f
    public final void h(e4.c cVar, Object obj) {
        PointF pointF = z.f14943a;
        if (obj == 4) {
            this.f16414l.j(cVar);
            return;
        }
        ColorFilter colorFilter = z.F;
        t4.b bVar = this.f16407c;
        if (obj == colorFilter) {
            o4.r rVar = this.f16417o;
            if (rVar != null) {
                bVar.p(rVar);
            }
            o4.r rVar2 = new o4.r(cVar, null);
            this.f16417o = rVar2;
            rVar2.a(this);
            bVar.e(this.f16417o);
            return;
        }
        if (obj == z.G) {
            o4.r rVar3 = this.f16418p;
            if (rVar3 != null) {
                bVar.p(rVar3);
            }
            this.f16408d.a();
            this.f16409e.a();
            o4.r rVar4 = new o4.r(cVar, null);
            this.f16418p = rVar4;
            rVar4.a(this);
            bVar.e(this.f16418p);
            return;
        }
        if (obj == z.f14947e) {
            o4.e eVar = this.f16421s;
            if (eVar != null) {
                eVar.j(cVar);
                return;
            }
            o4.r rVar5 = new o4.r(cVar, null);
            this.f16421s = rVar5;
            rVar5.a(this);
            bVar.e(this.f16421s);
            return;
        }
        o4.h hVar = this.f16423u;
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

    public final int i() {
        float f2 = this.f16415m.f17123d;
        float f7 = this.f16420r;
        int iRound = Math.round(f2 * f7);
        int iRound2 = Math.round(this.f16416n.f17123d * f7);
        int iRound3 = Math.round(this.k.f17123d * f7);
        int i7 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i7 = i7 * 31 * iRound2;
        }
        return iRound3 != 0 ? i7 * 31 * iRound3 : i7;
    }
}
