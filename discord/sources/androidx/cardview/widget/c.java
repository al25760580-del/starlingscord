package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f1204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f1205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1207e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f1210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f1211i;
    public ColorStateList j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1208f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1209g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public c(ColorStateList colorStateList, float f2) {
        this.f1203a = f2;
        Paint paint = new Paint(5);
        this.f1204b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f1210h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f1210h.getDefaultColor()));
        this.f1205c = new RectF();
        this.f1206d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f2 = rect.left;
        float f7 = rect.top;
        float f10 = rect.right;
        float f11 = rect.bottom;
        RectF rectF = this.f1205c;
        rectF.set(f2, f7, f10, f11);
        Rect rect2 = this.f1206d;
        rect2.set(rect);
        if (this.f1208f) {
            rect2.inset((int) Math.ceil(d.a(this.f1207e, this.f1203a, this.f1209g)), (int) Math.ceil(d.b(this.f1207e, this.f1203a, this.f1209g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z5;
        PorterDuffColorFilter porterDuffColorFilter = this.f1211i;
        Paint paint = this.f1204b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z5 = false;
        } else {
            paint.setColorFilter(this.f1211i);
            z5 = true;
        }
        RectF rectF = this.f1205c;
        float f2 = this.f1203a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z5) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1206d, this.f1203a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1210h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1210h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f1204b;
        boolean z5 = colorForState != paint.getColor();
        if (z5) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z5;
        }
        this.f1211i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f1204b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1204b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f1211i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f1211i = a(this.j, mode);
        invalidateSelf();
    }
}
