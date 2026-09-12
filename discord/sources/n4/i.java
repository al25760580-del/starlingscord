package n4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public final o4.j A;
    public o4.r B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f16424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s.k f16426t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s.k f16427u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f16428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f16429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o4.j f16431y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o4.j f16432z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(v vVar, t4.b bVar, s4.e eVar) {
        int iB = f0.e.b(eVar.f19738h);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = f0.e.b(eVar.f19739i);
        super(vVar, bVar, cap, iB2 != 0 ? iB2 != 1 ? iB2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, eVar.j, eVar.f19734d, eVar.f19737g, eVar.k, eVar.f19740l);
        this.f16426t = new s.k();
        this.f16427u = new s.k();
        this.f16428v = new RectF();
        this.f16424r = eVar.f19731a;
        this.f16429w = eVar.f19732b;
        this.f16425s = eVar.f19741m;
        this.f16430x = (int) (vVar.f14917d.b() / 32.0f);
        o4.e eVarL0 = eVar.f19733c.l0();
        this.f16431y = (o4.j) eVarL0;
        eVarL0.a(this);
        bVar.e(eVarL0);
        o4.e eVarL1 = eVar.f19735e.l0();
        this.f16432z = (o4.j) eVarL1;
        eVarL1.a(this);
        bVar.e(eVarL1);
        o4.e eVarL2 = eVar.f19736f.l0();
        this.A = (o4.j) eVarL2;
        eVarL2.a(this);
        bVar.e(eVarL2);
    }

    public final int[] e(int[] iArr) {
        o4.r rVar = this.B;
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

    @Override // n4.b, n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        Shader shader;
        Shader radialGradient;
        if (this.f16425s) {
            return;
        }
        d(this.f16428v, matrix, false);
        int i10 = this.f16429w;
        o4.j jVar = this.f16431y;
        o4.j jVar2 = this.A;
        o4.j jVar3 = this.f16432z;
        if (i10 == 1) {
            long jI = i();
            s.k kVar = this.f16426t;
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
            s.k kVar2 = this.f16427u;
            shader = (RadialGradient) kVar2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                s4.c cVar2 = (s4.c) jVar.e();
                int[] iArrE = e(cVar2.f19722b);
                float[] fArr = cVar2.f19721a;
                float f2 = pointF3.x;
                float f7 = pointF3.y;
                radialGradient = new RadialGradient(f2, f7, (float) Math.hypot(pointF4.x - f2, pointF4.y - f7), iArrE, fArr, Shader.TileMode.CLAMP);
                kVar2.e(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.f16370i.setShader(shader);
        super.f(canvas, matrix, i7);
    }

    @Override // n4.c
    public final String getName() {
        return this.f16424r;
    }

    @Override // n4.b, q4.f
    public final void h(e4.c cVar, Object obj) {
        super.h(cVar, obj);
        if (obj == z.G) {
            o4.r rVar = this.B;
            t4.b bVar = this.f16367f;
            if (rVar != null) {
                bVar.p(rVar);
            }
            o4.r rVar2 = new o4.r(cVar, null);
            this.B = rVar2;
            rVar2.a(this);
            bVar.e(this.B);
        }
    }

    public final int i() {
        float f2 = this.f16432z.f17123d;
        float f7 = this.f16430x;
        int iRound = Math.round(f2 * f7);
        int iRound2 = Math.round(this.A.f17123d * f7);
        int iRound3 = Math.round(this.f16431y.f17123d * f7);
        int i7 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i7 = i7 * 31 * iRound2;
        }
        return iRound3 != 0 ? i7 * 31 * iRound3 : i7;
    }
}
