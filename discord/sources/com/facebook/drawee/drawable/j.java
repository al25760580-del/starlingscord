package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends e implements g {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public final Path I;
    public final Path J;
    public final RectF K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f4670e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f4671i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f4672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f4673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f4675y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.f4669d = 1;
        this.f4670e = new RectF();
        this.f4671i = new float[8];
        this.f4672v = new float[8];
        this.f4673w = new Paint(1);
        this.f4674x = false;
        this.f4675y = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = false;
        this.I = new Path();
        this.J = new Path();
        this.K = new RectF();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void a(boolean z5) {
        this.f4674x = z5;
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void b() {
        Arrays.fill(this.f4671i, 0.0f);
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void c(boolean z5) {
        if (this.H != z5) {
            this.H = z5;
            invalidateSelf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Rect bounds = getBounds();
        RectF rectF = this.f4670e;
        rectF.set(bounds);
        int iB = f0.e.b(this.f4669d);
        Path path = this.I;
        Paint paint = this.f4673w;
        if (iB == 0) {
            super.draw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.F);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(this.H);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.f4674x) {
                float fWidth = ((rectF.width() - rectF.height()) + this.f4675y) / 2.0f;
                float fHeight = ((rectF.height() - rectF.width()) + this.f4675y) / 2.0f;
                if (fWidth > 0.0f) {
                    float f2 = rectF.left;
                    canvas2 = canvas;
                    canvas2.drawRect(f2, rectF.top, f2 + fWidth, rectF.bottom, paint);
                    float f7 = rectF.right;
                    canvas2.drawRect(f7 - fWidth, rectF.top, f7, rectF.bottom, paint);
                } else {
                    canvas2 = canvas;
                }
                if (fHeight > 0.0f) {
                    float f10 = rectF.left;
                    float f11 = rectF.top;
                    canvas2.drawRect(f10, f11, rectF.right, f11 + fHeight, paint);
                    float f12 = rectF.left;
                    float f13 = rectF.bottom;
                    canvas2.drawRect(f12, f13 - fHeight, rectF.right, f13, paint);
                }
            }
            if (this.E != 0) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.E);
                paint.setStrokeWidth(this.f4675y);
                path.setFillType(Path.FillType.EVEN_ODD);
                canvas2.drawPath(this.J, paint);
            }
        }
        if (iB == 1) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        canvas2 = canvas;
        if (this.E != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.E);
            paint.setStrokeWidth(this.f4675y);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas2.drawPath(this.J, paint);
        }
    }

    @Override // com.facebook.drawee.drawable.g
    public final void e(float f2) {
        this.G = f2;
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void f() {
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void g(float[] fArr) {
        float[] fArr2 = this.f4671i;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            n8.i.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        h();
        invalidateSelf();
    }

    public final void h() {
        float[] fArr;
        Path path = this.I;
        path.reset();
        Path path2 = this.J;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.K;
        rectF.set(bounds);
        float f2 = this.G;
        rectF.inset(f2, f2);
        if (this.f4669d == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z5 = this.f4674x;
        float[] fArr2 = this.f4671i;
        if (z5) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f7 = -this.G;
        rectF.inset(f7, f7);
        float f10 = this.f4675y / 2.0f;
        rectF.inset(f10, f10);
        if (this.f4674x) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i7 = 0;
            while (true) {
                fArr = this.f4672v;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = (fArr2[i7] + this.G) - (this.f4675y / 2.0f);
                i7++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f11 = (-this.f4675y) / 2.0f;
        rectF.inset(f11, f11);
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void setBorder(int i7, float f2) {
        this.E = i7;
        this.f4675y = f2;
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void d() {
    }
}
