package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2743e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Resources f2744i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ValueAnimator f2745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f2746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final LinearInterpolator f2741y = new LinearInterpolator();
    public static final q2.a E = new q2.a(1);
    public static final int[] F = {-16777216};

    public CircularProgressDrawable(Context context) {
        context.getClass();
        this.f2744i = context.getResources();
        c cVar = new c();
        this.f2742d = cVar;
        cVar.f2760i = F;
        cVar.a(0);
        cVar.f2759h = 2.5f;
        cVar.f2753b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f2741y);
        valueAnimatorOfFloat.addListener(new b(this, cVar));
        this.f2745v = valueAnimatorOfFloat;
    }

    public static void d(float f2, c cVar) {
        if (f2 <= 0.75f) {
            cVar.f2770u = cVar.f2760i[cVar.j];
            return;
        }
        float f7 = (f2 - 0.75f) / 0.25f;
        int[] iArr = cVar.f2760i;
        int i7 = cVar.j;
        int i10 = iArr[i7];
        int i11 = iArr[(i7 + 1) % iArr.length];
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        cVar.f2770u = ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f7))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f7))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f7))) << 8) | (i15 + ((int) (f7 * ((i11 & 255) - i15))));
    }

    public final void a(float f2, c cVar, boolean z5) {
        float interpolation;
        float interpolation2;
        if (this.f2747x) {
            d(f2, cVar);
            float fFloor = (float) (Math.floor(cVar.f2762m / 0.8f) + 1.0d);
            float f7 = cVar.k;
            float f10 = cVar.f2761l;
            cVar.f2756e = (((f10 - 0.01f) - f7) * f2) + f7;
            cVar.f2757f = f10;
            float f11 = cVar.f2762m;
            cVar.f2758g = kk.b.c(fFloor, f11, f2, f11);
            return;
        }
        if (f2 != 1.0f || z5) {
            float f12 = cVar.f2762m;
            q2.a aVar = E;
            if (f2 < 0.5f) {
                interpolation = cVar.k;
                interpolation2 = (aVar.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f13 = cVar.k + 0.79f;
                interpolation = f13 - (((1.0f - aVar.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f13;
            }
            float f14 = (0.20999998f * f2) + f12;
            float f15 = (f2 + this.f2746w) * 216.0f;
            cVar.f2756e = interpolation;
            cVar.f2757f = interpolation2;
            cVar.f2758g = f14;
            this.f2743e = f15;
        }
    }

    public final void b(float f2, float f7, float f10, float f11) {
        float f12 = this.f2744i.getDisplayMetrics().density;
        float f13 = f7 * f12;
        c cVar = this.f2742d;
        cVar.f2759h = f13;
        cVar.f2753b.setStrokeWidth(f13);
        cVar.f2766q = f2 * f12;
        cVar.a(0);
        cVar.f2767r = (int) (f10 * f12);
        cVar.f2768s = (int) (f11 * f12);
    }

    public final void c(int i7) {
        if (i7 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2743e, bounds.exactCenterX(), bounds.exactCenterY());
        c cVar = this.f2742d;
        Paint paint = cVar.f2753b;
        RectF rectF = cVar.f2752a;
        float f2 = cVar.f2766q;
        float fMin = (cVar.f2759h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((cVar.f2767r * cVar.f2765p) / 2.0f, cVar.f2759h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f7 = cVar.f2756e;
        float f10 = cVar.f2758g;
        float f11 = (f7 + f10) * 360.0f;
        float f12 = ((cVar.f2757f + f10) * 360.0f) - f11;
        paint.setColor(cVar.f2770u);
        paint.setAlpha(cVar.f2769t);
        float f13 = cVar.f2759h / 2.0f;
        rectF.inset(f13, f13);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cVar.f2755d);
        float f14 = -f13;
        rectF.inset(f14, f14);
        canvas.drawArc(rectF, f11, f12, false, paint);
        Paint paint2 = cVar.f2754c;
        if (cVar.f2763n) {
            Path path = cVar.f2764o;
            if (path == null) {
                Path path2 = new Path();
                cVar.f2764o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f15 = (cVar.f2767r * cVar.f2765p) / 2.0f;
            cVar.f2764o.moveTo(0.0f, 0.0f);
            cVar.f2764o.lineTo(cVar.f2767r * cVar.f2765p, 0.0f);
            Path path3 = cVar.f2764o;
            float f16 = cVar.f2767r;
            float f17 = cVar.f2765p;
            path3.lineTo((f16 * f17) / 2.0f, cVar.f2768s * f17);
            cVar.f2764o.offset((rectF.centerX() + fMin2) - f15, (cVar.f2759h / 2.0f) + rectF.centerY());
            cVar.f2764o.close();
            paint2.setColor(cVar.f2770u);
            paint2.setAlpha(cVar.f2769t);
            canvas.save();
            canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
            canvas.drawPath(cVar.f2764o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2742d.f2769t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f2745v.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f2742d.f2769t = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2742d.f2753b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f2745v.cancel();
        c cVar = this.f2742d;
        float f2 = cVar.f2756e;
        cVar.k = f2;
        float f7 = cVar.f2757f;
        cVar.f2761l = f7;
        cVar.f2762m = cVar.f2758g;
        if (f7 != f2) {
            this.f2747x = true;
            this.f2745v.setDuration(666L);
            this.f2745v.start();
            return;
        }
        cVar.a(0);
        cVar.k = 0.0f;
        cVar.f2761l = 0.0f;
        cVar.f2762m = 0.0f;
        cVar.f2756e = 0.0f;
        cVar.f2757f = 0.0f;
        cVar.f2758g = 0.0f;
        this.f2745v.setDuration(1332L);
        this.f2745v.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f2745v.cancel();
        this.f2743e = 0.0f;
        c cVar = this.f2742d;
        if (cVar.f2763n) {
            cVar.f2763n = false;
        }
        cVar.a(0);
        cVar.k = 0.0f;
        cVar.f2761l = 0.0f;
        cVar.f2762m = 0.0f;
        cVar.f2756e = 0.0f;
        cVar.f2757f = 0.0f;
        cVar.f2758g = 0.0f;
        invalidateSelf();
    }
}
