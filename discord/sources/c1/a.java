package c1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f3411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3412b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapShader f3415e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3417g;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3420l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3413c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f3414d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f3416f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f3418h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f3419i = new RectF();
    public boolean j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f3412b = 160;
        if (resources != null) {
            this.f3412b = resources.getDisplayMetrics().densityDpi;
        }
        this.f3411a = bitmap;
        if (bitmap == null) {
            this.f3420l = -1;
            this.k = -1;
            this.f3415e = null;
        } else {
            int i7 = this.f3412b;
            this.k = bitmap.getScaledWidth(i7);
            this.f3420l = bitmap.getScaledHeight(i7);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f3415e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a() {
        if (this.j) {
            Gravity.apply(this.f3413c, this.k, this.f3420l, getBounds(), this.f3418h, 0);
            Rect rect = this.f3418h;
            RectF rectF = this.f3419i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f3415e;
            if (bitmapShader != null) {
                float f2 = rectF.left;
                float f7 = rectF.top;
                Matrix matrix = this.f3416f;
                matrix.setTranslate(f2, f7);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f3411a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f3414d.setShader(bitmapShader);
            }
            this.j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f3411a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.f3414d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f3418h, paint);
            return;
        }
        RectF rectF = this.f3419i;
        float f2 = this.f3417g;
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3414d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f3414d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3420l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f3413c != 119 || (bitmap = this.f3411a) == null || bitmap.hasAlpha() || this.f3414d.getAlpha() < 255 || this.f3417g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.f3418h, this.f3417g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Paint paint = this.f3414d;
        if (i7 != paint.getAlpha()) {
            paint.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3414d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z5) {
        this.f3414d.setDither(z5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z5) {
        this.f3414d.setFilterBitmap(z5);
        invalidateSelf();
    }
}
