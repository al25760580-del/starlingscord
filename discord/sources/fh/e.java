package fh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9180i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f9182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f9184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f9185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Pair f9186q;

    public e(k kVar) {
        super(kVar);
        this.f9185p = new RectF();
        this.f9186q = new Pair(new q(), new q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh.r
    public final void a() {
        int i7;
        Path path = this.f9252b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = 2;
            if (i11 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i11++;
        }
        Matrix matrix = this.f9255e;
        matrix.reset();
        float f2 = this.f9180i;
        matrix.setScale(f2, f2);
        path.transform(matrix);
        k kVar = this.f9251a;
        boolean zA = kVar.a(this.f9183n);
        PathMeasure pathMeasure = this.f9254d;
        if (zA) {
            pathMeasure.setPath(path, false);
            float f7 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f10 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.f9183n ? kVar.j : kVar.k)) / 2.0f)) * 2;
            this.j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < iMax; i12++) {
                q qVar = new q();
                float f11 = i12;
                pathMeasure.getPosTan(this.j * f11, qVar.f9248a, qVar.f9249b);
                q qVar2 = new q();
                float f12 = this.j;
                pathMeasure.getPosTan((f12 / 2.0f) + (f11 * f12), qVar2.f9248a, qVar2.f9249b);
                arrayList.add(qVar);
                qVar2.a(f7 * 2.0f);
                arrayList.add(qVar2);
            }
            arrayList.add((q) arrayList.get(0));
            q qVar3 = (q) arrayList.get(0);
            float[] fArr = qVar3.f9248a;
            char c8 = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i13 = 1;
            while (i13 < arrayList.size()) {
                q qVar4 = (q) arrayList.get(i13);
                float f13 = (this.j / f10) * 0.48f;
                float[] fArr2 = qVar3.f9248a;
                float[] fArr3 = qVar3.f9249b;
                float[] fArr4 = new float[i7];
                float[] fArr5 = new float[i7];
                System.arraycopy(fArr2, i10, fArr4, i10, i7);
                System.arraycopy(fArr3, i10, fArr5, i10, i7);
                new Matrix();
                float[] fArr6 = qVar4.f9248a;
                float[] fArr7 = qVar4.f9249b;
                float[] fArr8 = new float[i7];
                float[] fArr9 = new float[i7];
                System.arraycopy(fArr6, i10, fArr8, i10, i7);
                System.arraycopy(fArr7, i10, fArr9, i10, i7);
                new Matrix();
                char c10 = c8;
                float fAtan2 = (float) Math.atan2(fArr5[c8], fArr5[i10]);
                double d6 = fArr4[i10];
                double d7 = f13;
                int i14 = i10;
                double d8 = fAtan2;
                fArr4[i14] = (float) ((Math.cos(d8) * d7) + d6);
                fArr4[c10] = (float) ((Math.sin(d8) * d7) + ((double) fArr4[c10]));
                double d9 = -f13;
                double dAtan2 = (float) Math.atan2(fArr9[c10], fArr9[i14]);
                fArr8[i14] = (float) ((Math.cos(dAtan2) * d9) + ((double) fArr8[i14]));
                float fSin = (float) ((Math.sin(dAtan2) * d9) + ((double) fArr8[c10]));
                fArr8[c10] = fSin;
                float f14 = fArr4[i14];
                float f15 = fArr4[c10];
                float f16 = fArr8[i14];
                float[] fArr10 = qVar4.f9248a;
                path.cubicTo(f14, f15, f16, fSin, fArr10[i14], fArr10[c10]);
                i13++;
                qVar3 = qVar4;
                c8 = c10;
                i10 = i14;
                pathMeasure = pathMeasure;
                i7 = 2;
                f10 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i10);
    }

    public final void c(Canvas canvas, Paint paint, float f2, float f7, int i7, int i10, int i11, float f10, float f11, boolean z5) {
        float f12;
        Canvas canvas2;
        float f13 = f7 >= f2 ? f7 - f2 : (f7 + 1.0f) - f2;
        float f14 = f2 % 1.0f;
        if (f14 < 0.0f) {
            f14 += 1.0f;
        }
        if (this.f9184o < 1.0f) {
            float f15 = f14 + f13;
            if (f15 > 1.0f) {
                c(canvas, paint, f14, 1.0f, i7, i10, 0, f10, f11, z5);
                c(canvas, paint, 1.0f, f15, i7, 0, i11, f10, f11, z5);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f9178g / this.f9180i);
        float f16 = f13 - 0.99f;
        if (f16 >= 0.0f) {
            float f17 = ((f16 * degrees) / 180.0f) / 0.01f;
            f13 += f17;
            if (!z5) {
                f14 -= f17 / 2.0f;
            }
        }
        float fG0 = e4.f.g0(1.0f - this.f9184o, 1.0f, f14);
        float fG1 = e4.f.g0(0.0f, this.f9184o, f13);
        float degrees2 = (float) Math.toDegrees(i10 / this.f9180i);
        float degrees3 = ((fG1 * 360.0f) - degrees2) - ((float) Math.toDegrees(i11 / this.f9180i));
        float f18 = (fG0 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        k kVar = this.f9251a;
        boolean z6 = kVar.a(this.f9183n) && z5 && f10 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i7);
        paint.setStrokeWidth(this.f9177f);
        float f19 = this.f9178g * 2.0f;
        float f20 = degrees * 2.0f;
        PathMeasure pathMeasure = this.f9254d;
        if (degrees3 < f20) {
            float f21 = degrees3 / f20;
            float f22 = (degrees * f21) + f18;
            q qVar = new q();
            if (z6) {
                float length = (pathMeasure.getLength() * (f22 / 360.0f)) / 2.0f;
                float f23 = this.f9179h * f10;
                float f24 = this.f9180i;
                if (f24 != this.f9182m || f23 != this.k) {
                    this.k = f23;
                    this.f9182m = f24;
                    a();
                }
                pathMeasure.getPosTan(length, qVar.f9248a, qVar.f9249b);
            } else {
                qVar.c(f22 + 90.0f);
                qVar.a(-this.f9180i);
            }
            paint.setStyle(Paint.Style.FILL);
            d(canvas, paint, qVar, f19, this.f9177f, f21);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap((kVar.f9217d && kVar.f9216c == 0.5f) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f25 = f18 + degrees;
        float f26 = degrees3 - f20;
        Pair pair = this.f9186q;
        ((q) pair.first).b();
        ((q) pair.second).b();
        if (z6) {
            float f27 = f25 / 360.0f;
            float f28 = f26 / 360.0f;
            float f29 = this.f9179h * f10;
            int i12 = this.f9183n ? kVar.j : kVar.k;
            float f30 = this.f9180i;
            if (f30 != this.f9182m || f29 != this.k || i12 != this.f9181l) {
                this.k = f29;
                this.f9181l = i12;
                this.f9182m = f30;
                a();
            }
            Path path = this.f9253c;
            path.rewind();
            float fE = yk.a.e(f28, 0.0f, 1.0f);
            if (kVar.a(this.f9183n)) {
                float f31 = f11 / ((float) ((((double) this.f9180i) * 6.283185307179586d) / ((double) this.j)));
                f27 += f31;
                f12 = 0.0f - (f31 * 360.0f);
            } else {
                f12 = 0.0f;
            }
            float f32 = f27 % 1.0f;
            float length2 = (pathMeasure.getLength() * f32) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f32 + fE)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            q qVar2 = (q) pair.first;
            qVar2.b();
            pathMeasure.getPosTan(length2, qVar2.f9248a, qVar2.f9249b);
            q qVar3 = (q) pair.second;
            qVar3.b();
            pathMeasure.getPosTan(length3, qVar3.f9248a, qVar3.f9249b);
            Matrix matrix = this.f9255e;
            matrix.reset();
            matrix.setRotate(f12);
            qVar2.c(f12);
            qVar3.c(f12);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((q) pair.first).c(f25 + 90.0f);
            ((q) pair.first).a(-this.f9180i);
            ((q) pair.second).c(f25 + f26 + 90.0f);
            ((q) pair.second).a(-this.f9180i);
            float f33 = this.f9180i;
            float f34 = -f33;
            RectF rectF = this.f9185p;
            rectF.set(f34, f34, f33, f33);
            canvas.drawArc(rectF, f25, f26, false, paint);
            canvas2 = canvas;
        }
        if (!(kVar.f9217d && kVar.f9216c == 0.5f) && this.f9178g > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            d(canvas2, paint, (q) pair.first, f19, this.f9177f, 1.0f);
            d(canvas, paint, (q) pair.second, f19, this.f9177f, 1.0f);
        }
    }

    public final void d(Canvas canvas, Paint paint, q qVar, float f2, float f7, float f10) {
        float fMin = Math.min(f7, this.f9177f);
        float f11 = f2 / 2.0f;
        float fMin2 = Math.min(f11, (this.f9178g * fMin) / this.f9177f);
        RectF rectF = new RectF((-f2) / 2.0f, (-fMin) / 2.0f, f11, fMin / 2.0f);
        canvas.save();
        float[] fArr = qVar.f9248a;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = qVar.f9249b;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f10, f10);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final void e(Canvas canvas, Paint paint, p pVar, int i7) {
        int iJ = io.sentry.config.a.j(pVar.f9243c, i7);
        canvas.save();
        canvas.rotate(pVar.f9246f);
        this.f9183n = pVar.f9247g;
        c(canvas, paint, pVar.f9241a, pVar.f9242b, iJ, 0, 0, pVar.f9244d, pVar.f9245e, true);
        canvas.restore();
    }

    public final void f(Canvas canvas, Paint paint, float f2, float f7, int i7, int i10, int i11) {
        int iJ = io.sentry.config.a.j(i7, i10);
        this.f9183n = false;
        c(canvas, paint, f2, f7, iJ, i11, i11, 0.0f, 0.0f, false);
    }

    public final int g() {
        k kVar = this.f9251a;
        return (kVar.f9228q * 2) + kVar.f9227p;
    }
}
