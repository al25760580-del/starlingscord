package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Drawable implements Drawable.Callback, TransformCallback, p {
    public final Drawable[] F;
    public final int G;
    public int H;
    public int I;
    public long J;
    public final int[] K;
    public final int[] L;
    public int M;
    public final boolean[] N;
    public int O;
    public boolean P;
    public final boolean Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TransformCallback f4650d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Drawable[] f4652i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c[] f4653v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DrawableProperties f4651e = new DrawableProperties();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f4654w = new Rect();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4655x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4656y = false;
    public boolean E = false;

    public d(Drawable[] drawableArr) {
        Drawable[] drawableArr2;
        this.f4652i = drawableArr;
        int i7 = 0;
        while (true) {
            drawableArr2 = this.f4652i;
            if (i7 >= drawableArr2.length) {
                break;
            }
            mf.f.J(drawableArr2[i7], this, this);
            i7++;
        }
        this.f4653v = new c[drawableArr2.length];
        this.Q = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.F = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.K = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.L = iArr2;
        this.M = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.N = zArr;
        this.O = 0;
        this.G = 2;
        this.H = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void a() {
        this.O--;
        invalidateSelf();
    }

    public final void b() {
        this.H = 2;
        for (int i7 = 0; i7 < this.F.length; i7++) {
            this.L[i7] = this.N[i7] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final Drawable c(int i7) {
        n8.i.a(Boolean.valueOf(i7 >= 0));
        Drawable[] drawableArr = this.f4652i;
        n8.i.a(Boolean.valueOf(i7 < drawableArr.length));
        return drawableArr[i7];
    }

    public final Drawable d(Drawable drawable, int i7) {
        DrawableProperties drawableProperties;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        Drawable[] drawableArr = this.f4652i;
        if (!(i7 < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[i7];
        if (drawable != drawable2) {
            if (drawable != null && this.E) {
                drawable.mutate();
            }
            mf.f.J(drawableArr[i7], null, null);
            mf.f.J(drawable, null, null);
            if (drawable != null && (drawableProperties = this.f4651e) != null) {
                drawableProperties.a(drawable);
            }
            mf.f.e(drawable, this);
            mf.f.J(drawable, this, this);
            this.f4656y = false;
            drawableArr[i7] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zE;
        int i7;
        int i10 = this.H;
        Drawable[] drawableArr = this.F;
        int[] iArr = this.L;
        if (i10 == 0) {
            System.arraycopy(iArr, 0, this.K, 0, drawableArr.length);
            this.J = SystemClock.uptimeMillis();
            zE = e(this.I == 0 ? 1.0f : 0.0f);
            if (!this.P && (i7 = this.G) >= 0) {
                boolean[] zArr = this.N;
                if (i7 < zArr.length && zArr[i7]) {
                    this.P = true;
                }
            }
            this.H = zE ? 2 : 1;
        } else if (i10 != 1) {
            zE = true;
        } else {
            n8.i.e(this.I > 0);
            zE = e((SystemClock.uptimeMillis() - this.J) / this.I);
            this.H = zE ? 2 : 1;
        }
        for (int i11 = 0; i11 < drawableArr.length; i11++) {
            Drawable drawable = drawableArr[i11];
            int iCeil = (int) Math.ceil(((double) (iArr[i11] * this.M)) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.O++;
                if (this.Q) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.O--;
                drawable.draw(canvas);
            }
        }
        if (!zE) {
            invalidateSelf();
        } else if (this.P) {
            this.P = false;
        }
    }

    public final boolean e(float f2) {
        boolean z5 = true;
        for (int i7 = 0; i7 < this.F.length; i7++) {
            boolean z6 = this.N[i7];
            int i10 = (int) (((z6 ? 1 : -1) * 255 * f2) + this.K[i7]);
            int[] iArr = this.L;
            iArr[i7] = i10;
            if (i10 < 0) {
                iArr[i7] = 0;
            }
            if (iArr[i7] > 255) {
                iArr[i7] = 255;
            }
            if (z6 && iArr[i7] < 255) {
                z5 = false;
            }
            if (!z6 && iArr[i7] > 0) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i7 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i7++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i7 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i7++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.f4652i;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i7 = 1; i7 < drawableArr.length; i7++) {
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i7 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                Rect rect2 = this.f4654w;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i7++;
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public final void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.f4650d;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public final void getTransform(Matrix matrix) {
        TransformCallback transformCallback = this.f4650d;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.O == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.f4656y) {
            this.f4655x = false;
            int i7 = 0;
            while (true) {
                Drawable[] drawableArr = this.f4652i;
                boolean z5 = true;
                if (i7 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i7];
                boolean z6 = this.f4655x;
                if (drawable == null || !drawable.isStateful()) {
                    z5 = false;
                }
                this.f4655x = z6 | z5;
                i7++;
            }
            this.f4656y = true;
        }
        return this.f4655x;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                this.E = true;
                return this;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.mutate();
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        int i10 = 0;
        boolean z5 = false;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i10 >= drawableArr.length) {
                return z5;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setLevel(i7)) {
                z5 = true;
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i7 = 0;
        boolean z5 = false;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return z5;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null && drawable.setState(iArr)) {
                z5 = true;
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.M != i7) {
            this.M = i7;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        DrawableProperties drawableProperties = this.f4651e;
        drawableProperties.f4641c = colorFilter;
        int i7 = 0;
        drawableProperties.f4640b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z5) {
        this.f4651e.f4642d = z5 ? 1 : 0;
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setDither(z5);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z5) {
        this.f4651e.f4643e = z5 ? 1 : 0;
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setFilterBitmap(z5);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f7) {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setHotspot(f2, f7);
            }
            i7++;
        }
    }

    @Override // com.facebook.drawee.drawable.p
    public final void setTransformCallback(TransformCallback transformCallback) {
        this.f4650d = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f4652i;
            if (i7 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setVisible(z5, z6);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
