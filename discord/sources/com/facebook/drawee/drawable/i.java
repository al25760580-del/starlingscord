package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Drawable implements g {
    public final int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f4662d = new float[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f4663e = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f4664i = new Paint(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4665v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f4666w = 0.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f4667x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4668y = 0;
    public boolean E = false;
    public final Path F = new Path();
    public final Path G = new Path();
    public final RectF I = new RectF();
    public int J = 255;

    public i(int i7) {
        this.H = 0;
        if (this.H != i7) {
            this.H = i7;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.g
    public final void a(boolean z5) {
        this.f4665v = z5;
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void b() {
        Arrays.fill(this.f4662d, 0.0f);
        h();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g
    public final void c(boolean z5) {
        if (this.E != z5) {
            this.E = z5;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iB = mf.f.B(this.H, this.J);
        Paint paint = this.f4664i;
        paint.setColor(iB);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.E);
        canvas.drawPath(this.F, paint);
        if (this.f4666w != 0.0f) {
            paint.setColor(mf.f.B(this.f4668y, this.J));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f4666w);
            canvas.drawPath(this.G, paint);
        }
    }

    @Override // com.facebook.drawee.drawable.g
    public final void e(float f2) {
        if (this.f4667x != f2) {
            this.f4667x = f2;
            h();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.g
    public final void g(float[] fArr) {
        float[] fArr2 = this.f4662d;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            n8.i.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iB = mf.f.B(this.H, this.J) >>> 24;
        if (iB != 0) {
            return iB != 255 ? -3 : -1;
        }
        return -2;
    }

    public final void h() {
        float[] fArr;
        Path path = this.F;
        path.reset();
        Path path2 = this.G;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.I;
        rectF.set(bounds);
        float f2 = this.f4666w / 2.0f;
        rectF.inset(f2, f2);
        boolean z5 = this.f4665v;
        float[] fArr2 = this.f4662d;
        if (z5) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i7 = 0;
            while (true) {
                fArr = this.f4663e;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = (fArr2[i7] + this.f4667x) - (this.f4666w / 2.0f);
                i7++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f7 = (-this.f4666w) / 2.0f;
        rectF.inset(f7, f7);
        float f10 = this.f4667x + 0.0f;
        rectF.inset(f10, f10);
        if (this.f4665v) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f11 = -f10;
        rectF.inset(f11, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (i7 != this.J) {
            this.J = i7;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.g
    public final void setBorder(int i7, float f2) {
        if (this.f4668y != i7) {
            this.f4668y = i7;
            invalidateSelf();
        }
        if (this.f4666w != f2) {
            this.f4666w = f2;
            h();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // com.facebook.drawee.drawable.g
    public final void d() {
    }

    @Override // com.facebook.drawee.drawable.g
    public final void f() {
    }
}
