package fh;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.core.view.a1;
import androidx.dynamicanimation.animation.SpringAnimation;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends o {
    public static final l V = new l(0);
    public final e K;
    public final j2.i L;
    public final SpringAnimation M;
    public final p N;
    public float O;
    public boolean P;
    public final ValueAnimator Q;
    public ValueAnimator R;
    public TimeInterpolator S;
    public TimeInterpolator T;
    public TimeInterpolator U;

    public m(Context context, k kVar, e eVar) {
        super(context, kVar);
        this.P = false;
        this.K = eVar;
        p pVar = new p();
        this.N = pVar;
        pVar.f9247g = true;
        j2.i iVar = new j2.i();
        this.L = iVar;
        iVar.a(1.0f);
        iVar.b(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, V);
        this.M = springAnimation;
        springAnimation.f2009m = iVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.Q = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new a1(2, this, kVar));
        if (kVar.a(true) && kVar.f9224m != 0) {
            valueAnimator.start();
        }
        if (this.F != 1.0f) {
            this.F = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.I)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f9237v;
            boolean z5 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f9238w;
            this.K.b(canvas, bounds, fB, z5, objectAnimator2 != null && objectAnimator2.isRunning());
            float fC = c();
            p pVar = this.N;
            pVar.f9245e = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.G;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            k kVar = this.f9235e;
            pVar.f9243c = kVar.f9218e[0];
            int i7 = kVar.f9222i;
            if (i7 > 0) {
                this.K.f(canvas, paint, pVar.f9242b, 1.0f, kVar.f9219f, this.H, (int) ((yk.a.e(pVar.f9242b, 0.0f, 0.01f) * i7) / 0.01f));
            } else {
                this.K.f(canvas, paint, 0.0f, 1.0f, kVar.f9219f, this.H, 0);
            }
            this.K.e(canvas, paint, pVar, this.H);
            int i10 = kVar.f9218e[0];
            this.K.getClass();
            canvas.restore();
        }
    }

    @Override // fh.o
    public final boolean e(boolean z5, boolean z6, boolean z7) {
        boolean zE = super.e(z5, z6, z7);
        a aVar = this.f9236i;
        ContentResolver contentResolver = this.f9234d.getContentResolver();
        aVar.getClass();
        float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f2 == 0.0f) {
            this.P = true;
            return zE;
        }
        this.P = false;
        this.L.b(50.0f / f2);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.K.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.K.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.M.f();
        this.N.f9242b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        float f2 = i7;
        float f7 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
        boolean z5 = this.P;
        p pVar = this.N;
        SpringAnimation springAnimation = this.M;
        if (z5) {
            springAnimation.f();
            pVar.f9242b = f2 / 10000.0f;
            invalidateSelf();
            pVar.f9244d = f7;
            invalidateSelf();
        } else {
            springAnimation.f2000b = pVar.f9242b * 10000.0f;
            springAnimation.f2001c = true;
            springAnimation.a(f2);
        }
        return true;
    }
}
