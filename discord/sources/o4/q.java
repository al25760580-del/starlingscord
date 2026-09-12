package o4;

import android.graphics.Matrix;
import android.graphics.PointF;
import io.sentry.w1;
import java.util.Collections;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f17156a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f17157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f17158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f17159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f17160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f17161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f17162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f17163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f17164i;
    public e j;
    public i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f17165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f17166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f17167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17168o;

    public q(r4.d dVar) {
        w1 w1Var = dVar.f19201a;
        this.f17161f = w1Var == null ? null : w1Var.l0();
        r4.e eVar = dVar.f19202b;
        this.f17162g = eVar == null ? null : eVar.l0();
        r4.a aVar = dVar.f19203c;
        this.f17163h = aVar == null ? null : aVar.l0();
        r4.b bVar = dVar.f19204d;
        this.f17164i = bVar == null ? null : bVar.l0();
        r4.b bVar2 = dVar.f19206f;
        i iVarL0 = bVar2 == null ? null : bVar2.l0();
        this.k = iVarL0;
        this.f17168o = dVar.j;
        if (iVarL0 != null) {
            this.f17157b = new Matrix();
            this.f17158c = new Matrix();
            this.f17159d = new Matrix();
            this.f17160e = new float[9];
        } else {
            this.f17157b = null;
            this.f17158c = null;
            this.f17159d = null;
            this.f17160e = null;
        }
        r4.b bVar3 = dVar.f19207g;
        this.f17165l = bVar3 == null ? null : bVar3.l0();
        r4.a aVar2 = dVar.f19205e;
        if (aVar2 != null) {
            this.j = aVar2.l0();
        }
        r4.b bVar4 = dVar.f19208h;
        if (bVar4 != null) {
            this.f17166m = bVar4.l0();
        } else {
            this.f17166m = null;
        }
        r4.b bVar5 = dVar.f19209i;
        if (bVar5 != null) {
            this.f17167n = bVar5.l0();
        } else {
            this.f17167n = null;
        }
    }

    public final void a(t4.b bVar) {
        bVar.e(this.j);
        bVar.e(this.f17166m);
        bVar.e(this.f17167n);
        bVar.e(this.f17161f);
        bVar.e(this.f17162g);
        bVar.e(this.f17163h);
        bVar.e(this.f17164i);
        bVar.e(this.k);
        bVar.e(this.f17165l);
    }

    public final void b(a aVar) {
        e eVar = this.j;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f17166m;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f17167n;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f17161f;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f17162g;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f17163h;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f17164i;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.k;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f17165l;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
    }

    public final boolean c(e4.c cVar, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == z.f14943a) {
            e eVar = this.f17161f;
            if (eVar == null) {
                this.f17161f = new r(cVar, new PointF());
                return true;
            }
            eVar.j(cVar);
            return true;
        }
        if (obj == z.f14944b) {
            e eVar2 = this.f17162g;
            if (eVar2 == null) {
                this.f17162g = new r(cVar, new PointF());
                return true;
            }
            eVar2.j(cVar);
            return true;
        }
        if (obj == z.f14945c) {
            e eVar3 = this.f17162g;
            if (eVar3 instanceof o) {
                ((o) eVar3).f17151m = cVar;
                return true;
            }
        }
        if (obj == z.f14946d) {
            e eVar4 = this.f17162g;
            if (eVar4 instanceof o) {
                ((o) eVar4).f17152n = cVar;
                return true;
            }
        }
        if (obj == z.j) {
            e eVar5 = this.f17163h;
            if (eVar5 == null) {
                this.f17163h = new r(cVar, new y4.b());
                return true;
            }
            eVar5.j(cVar);
            return true;
        }
        if (obj == z.k) {
            e eVar6 = this.f17164i;
            if (eVar6 == null) {
                this.f17164i = new r(cVar, fValueOf2);
                return true;
            }
            eVar6.j(cVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.j;
            if (eVar7 == null) {
                this.j = new r(cVar, 100);
                return true;
            }
            eVar7.j(cVar);
            return true;
        }
        if (obj == z.f14964x) {
            e eVar8 = this.f17166m;
            if (eVar8 == null) {
                this.f17166m = new r(cVar, fValueOf);
                return true;
            }
            eVar8.j(cVar);
            return true;
        }
        if (obj == z.f14965y) {
            e eVar9 = this.f17167n;
            if (eVar9 == null) {
                this.f17167n = new r(cVar, fValueOf);
                return true;
            }
            eVar9.j(cVar);
            return true;
        }
        if (obj == z.f14952l) {
            if (this.k == null) {
                this.k = new i(Collections.singletonList(new y4.a(fValueOf2)));
            }
            this.k.j(cVar);
            return true;
        }
        if (obj != z.f14953m) {
            return false;
        }
        if (this.f17165l == null) {
            this.f17165l = new i(Collections.singletonList(new y4.a(fValueOf2)));
        }
        this.f17165l.j(cVar);
        return true;
    }

    public final void d() {
        for (int i7 = 0; i7 < 9; i7++) {
            this.f17160e[i7] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        y4.b bVar;
        PointF pointF2;
        Matrix matrix = this.f17156a;
        matrix.reset();
        e eVar = this.f17162g;
        if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f2, pointF2.y);
            }
        }
        if (!this.f17168o) {
            e eVar2 = this.f17164i;
            if (eVar2 != null) {
                float fFloatValue = eVar2 instanceof r ? ((Float) eVar2.e()).floatValue() : ((i) eVar2).k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (eVar != null) {
            float f7 = eVar.f17123d;
            PointF pointF3 = (PointF) eVar.e();
            float f10 = pointF3.x;
            float f11 = pointF3.y;
            eVar.i(1.0E-4f + f7);
            PointF pointF4 = (PointF) eVar.e();
            eVar.i(f7);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
        }
        i iVar = this.k;
        if (iVar != null) {
            i iVar2 = this.f17165l;
            float fCos = iVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-iVar2.k()) + 90.0f));
            i iVar3 = this.f17165l;
            float fSin = iVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-iVar3.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(iVar.k()));
            d();
            float[] fArr = this.f17160e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f12 = -fSin;
            fArr[3] = f12;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f17157b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f17158c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f12;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f17159d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar3 = this.f17163h;
        if (eVar3 != null && (bVar = (y4.b) eVar3.e()) != null) {
            float f13 = bVar.f23207a;
            if (f13 != 1.0f || bVar.f23208b != 1.0f) {
                matrix.preScale(f13, bVar.f23208b);
            }
        }
        e eVar4 = this.f17161f;
        if (eVar4 != null && (pointF = (PointF) eVar4.e()) != null) {
            float f14 = pointF.x;
            if (f14 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f14, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f2) {
        e eVar = this.f17162g;
        PointF pointF = eVar == null ? null : (PointF) eVar.e();
        e eVar2 = this.f17163h;
        y4.b bVar = eVar2 == null ? null : (y4.b) eVar2.e();
        Matrix matrix = this.f17156a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f2, pointF.y * f2);
        }
        if (bVar != null) {
            double d6 = f2;
            matrix.preScale((float) Math.pow(bVar.f23207a, d6), (float) Math.pow(bVar.f23208b, d6));
        }
        e eVar3 = this.f17164i;
        if (eVar3 != null) {
            float fFloatValue = ((Float) eVar3.e()).floatValue();
            e eVar4 = this.f17161f;
            PointF pointF2 = eVar4 != null ? (PointF) eVar4.e() : null;
            matrix.preRotate(fFloatValue * f2, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
