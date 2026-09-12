package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends Drawable implements g, p {
    public TransformCallback U;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f4676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4677e = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4678i = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f4679v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Path f4680w = new Path();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4681x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4682y = 0;
    public final Path E = new Path();
    public final float[] F = new float[8];
    public final float[] G = new float[8];
    public final RectF H = new RectF();
    public final RectF I = new RectF();
    public final RectF J = new RectF();
    public final RectF K = new RectF();
    public final Matrix L = new Matrix();
    public final Matrix M = new Matrix();
    public final Matrix N = new Matrix();
    public final Matrix O = new Matrix();
    public final Matrix P = new Matrix();
    public final Matrix Q = new Matrix();
    public float R = 0.0f;
    public boolean S = false;
    public boolean T = true;

    public k(Drawable drawable) {
        this.f4676d = drawable;
    }

    @Override // com.facebook.drawee.drawable.g
    public final void a(boolean z5) {
        this.f4677e = z5;
        this.T = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void b() {
        Arrays.fill(this.F, 0.0f);
        this.f4678i = false;
        this.T = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void c(boolean z5) {
        if (this.S != z5) {
            this.S = z5;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f4676d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        sa.a.w();
        this.f4676d.draw(canvas);
        sa.a.w();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void e(float f2) {
        if (this.R != f2) {
            this.R = f2;
            this.T = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.g
    public final void g(float[] fArr) {
        float[] fArr2 = this.F;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.f4678i = false;
        } else {
            n8.i.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.f4678i = false;
            for (int i7 = 0; i7 < 8; i7++) {
                this.f4678i |= fArr[i7] > 0.0f;
            }
        }
        this.T = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4676d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4676d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4676d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4676d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f4676d.getOpacity();
    }

    public final void h() {
        float[] fArr;
        if (this.T) {
            Path path = this.E;
            path.reset();
            float f2 = this.f4679v / 2.0f;
            RectF rectF = this.H;
            rectF.inset(f2, f2);
            boolean z5 = this.f4677e;
            float[] fArr2 = this.F;
            if (z5) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i7 = 0;
                while (true) {
                    fArr = this.G;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    fArr[i7] = (fArr2[i7] + this.R) - (this.f4679v / 2.0f);
                    i7++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f7 = (-this.f4679v) / 2.0f;
            rectF.inset(f7, f7);
            Path path2 = this.f4680w;
            path2.reset();
            float f10 = this.R + 0.0f;
            rectF.inset(f10, f10);
            if (this.f4677e) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f11 = -f10;
            rectF.inset(f11, f11);
            path2.setFillType(Path.FillType.WINDING);
            this.T = false;
        }
    }

    public void i() {
        TransformCallback transformCallback = this.U;
        Matrix matrix = this.N;
        RectF rectF = this.H;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
            this.U.getRootBounds(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        Drawable drawable = this.f4676d;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF2 = this.J;
        rectF2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        Rect bounds = drawable.getBounds();
        RectF rectF3 = this.K;
        rectF3.set(bounds);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix2 = this.L;
        matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
        Matrix matrix3 = this.O;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.M;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.f4681x = true;
            matrix.invert(this.P);
            Matrix matrix5 = this.Q;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.I;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.T = true;
        rectF4.set(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f4676d.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f4676d.setAlpha(i7);
    }

    @Override // com.facebook.drawee.drawable.g
    public final void setBorder(int i7, float f2) {
        if (this.f4682y == i7 && this.f4679v == f2) {
            return;
        }
        this.f4682y = i7;
        this.f4679v = f2;
        this.T = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i7, PorterDuff.Mode mode) {
        this.f4676d.setColorFilter(i7, mode);
    }

    @Override // com.facebook.drawee.drawable.p
    public final void setTransformCallback(TransformCallback transformCallback) {
        this.U = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4676d.setColorFilter(colorFilter);
    }

    public void d() {
    }

    @Override // com.facebook.drawee.drawable.g
    public final void f() {
    }
}
