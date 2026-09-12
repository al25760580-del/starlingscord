package fh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends Drawable implements Animatable {
    public static final g J = new g(Float.class, "growFraction", 4);
    public boolean E;
    public float F;
    public int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f9234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f9235e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObjectAnimator f9237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ObjectAnimator f9238w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f9240y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f9239x = -1.0f;
    public final Paint G = new Paint();
    public final Rect I = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f9236i = new a();

    public o(Context context, k kVar) {
        this.f9234d = context;
        this.f9235e = kVar;
        setAlpha(255);
    }

    public final float b() {
        k kVar = this.f9235e;
        if (kVar.f9220g == 0 && kVar.f9221h == 0) {
            return 1.0f;
        }
        return this.F;
    }

    public final float c() {
        float f2 = this.f9239x;
        if (f2 > 0.0f) {
            return f2;
        }
        boolean z5 = this instanceof m;
        k kVar = this.f9235e;
        if (kVar.a(z5) && kVar.f9224m != 0) {
            a aVar = this.f9236i;
            ContentResolver contentResolver = this.f9234d.getContentResolver();
            aVar.getClass();
            float f7 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f7 > 0.0f) {
                int i7 = (int) ((((z5 ? kVar.j : kVar.k) * 1000.0f) / kVar.f9224m) * f7);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i7)) / i7;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z5, boolean z6, boolean z7) {
        a aVar = this.f9236i;
        ContentResolver contentResolver = this.f9234d.getContentResolver();
        aVar.getClass();
        return e(z5, z6, z7 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z5, boolean z6, boolean z7) {
        ObjectAnimator objectAnimator = this.f9237v;
        int i7 = 0;
        g gVar = J;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, gVar, 0.0f, 1.0f);
            this.f9237v = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f9237v.setInterpolator(lg.a.f15072b);
            ObjectAnimator objectAnimator2 = this.f9237v;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f9237v = objectAnimator2;
            objectAnimator2.addListener(new n(this, i7));
        }
        int i10 = 1;
        if (this.f9238w == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, gVar, 1.0f, 0.0f);
            this.f9238w = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f9238w.setInterpolator(lg.a.f15072b);
            ObjectAnimator objectAnimator3 = this.f9238w;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f9238w = objectAnimator3;
            objectAnimator3.addListener(new n(this, i10));
        }
        if (isVisible() || z5) {
            ObjectAnimator objectAnimator4 = z5 ? this.f9237v : this.f9238w;
            ObjectAnimator objectAnimator5 = z5 ? this.f9238w : this.f9237v;
            if (!z7) {
                if (objectAnimator5.isRunning()) {
                    boolean z10 = this.E;
                    this.E = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.E = z10;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z11 = this.E;
                    this.E = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.E = z11;
                }
                return super.setVisible(z5, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z12 = !z5 || super.setVisible(z5, false);
                k kVar = this.f9235e;
                if (!z5 ? kVar.f9221h != 0 : kVar.f9220g != 0) {
                    boolean z13 = this.E;
                    this.E = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.E = z13;
                    return z12;
                }
                if (z6 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z12;
                }
                objectAnimator4.resume();
                return z12;
            }
        }
        return false;
    }

    public final void f(c cVar) {
        ArrayList arrayList = this.f9240y;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f9240y.remove(cVar);
        if (this.f9240y.isEmpty()) {
            this.f9240y = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f9237v;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f9238w;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.H = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        return d(z5, z6, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
