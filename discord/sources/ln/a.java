package ln;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f15137b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15140e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f15136a = new Paint(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15138c = 255;

    public a(Bitmap bitmap) {
        this.f15137b = bitmap;
        if (bitmap != null) {
            this.f15139d = bitmap.getWidth();
            this.f15140e = this.f15137b.getHeight();
        } else {
            this.f15140e = 0;
            this.f15139d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f15137b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f15137b, (Rect) null, getBounds(), this.f15136a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15138c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15140e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15139d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f15140e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f15139d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f15138c = i7;
        this.f15136a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15136a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z5) {
        this.f15136a.setFilterBitmap(z5);
    }
}
