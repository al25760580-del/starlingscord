package x4;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import l4.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements Choreographer.FrameCallback {
    public float E;
    public int F;
    public float G;
    public float H;
    public i I;
    public boolean J;
    public boolean K;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f22630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f22632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f22633y;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f22622e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(g());
        h(true);
    }

    public final float d() {
        i iVar = this.I;
        if (iVar == null) {
            return 0.0f;
        }
        float f2 = this.E;
        float f7 = iVar.f14872l;
        return (f2 - f7) / (iVar.f14873m - f7);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z5 = false;
        if (this.J) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        i iVar = this.I;
        if (iVar == null || !this.J) {
            return;
        }
        long j5 = this.f22632x;
        float fAbs = (j5 != 0 ? j - j5 : 0L) / ((1.0E9f / iVar.f14874n) / Math.abs(this.f22630v));
        float f2 = this.f22633y;
        if (g()) {
            fAbs = -fAbs;
        }
        float f7 = f2 + fAbs;
        float f10 = f();
        float fE = e();
        PointF pointF = g.f22635a;
        if (f7 >= f10 && f7 <= fE) {
            z5 = true;
        }
        float f11 = this.f22633y;
        float fB = g.b(f7, f(), e());
        this.f22633y = fB;
        if (this.K) {
            fB = (float) Math.floor(fB);
        }
        this.E = fB;
        this.f22632x = j;
        if (!this.K || this.f22633y != f11) {
            c();
        }
        if (!z5) {
            if (getRepeatCount() == -1 || this.F < getRepeatCount()) {
                Iterator it = this.f22622e.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.F++;
                if (getRepeatMode() == 2) {
                    this.f22631w = !this.f22631w;
                    this.f22630v = -this.f22630v;
                } else {
                    float fE2 = g() ? e() : f();
                    this.f22633y = fE2;
                    this.E = fE2;
                }
                this.f22632x = j;
            } else {
                float f12 = this.f22630v < 0.0f ? f() : e();
                this.f22633y = f12;
                this.E = f12;
                h(true);
                a(g());
            }
        }
        if (this.I == null) {
            return;
        }
        float f13 = this.E;
        if (f13 < this.G || f13 > this.H) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.G), Float.valueOf(this.H), Float.valueOf(this.E)));
        }
    }

    public final float e() {
        i iVar = this.I;
        if (iVar == null) {
            return 0.0f;
        }
        float f2 = this.H;
        return f2 == 2.14748365E9f ? iVar.f14873m : f2;
    }

    public final float f() {
        i iVar = this.I;
        if (iVar == null) {
            return 0.0f;
        }
        float f2 = this.G;
        return f2 == -2.14748365E9f ? iVar.f14872l : f2;
    }

    public final boolean g() {
        return this.f22630v < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f2;
        float fE;
        float f7;
        if (this.I == null) {
            return 0.0f;
        }
        if (g()) {
            f2 = e() - this.E;
            fE = e();
            f7 = f();
        } else {
            f2 = this.E - f();
            fE = e();
            f7 = f();
        }
        return f2 / (fE - f7);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        i iVar = this.I;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.b();
    }

    public final void h(boolean z5) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z5) {
            this.J = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.J;
    }

    public final void j(float f2) {
        if (this.f22633y == f2) {
            return;
        }
        float fB = g.b(f2, f(), e());
        this.f22633y = fB;
        if (this.K) {
            fB = (float) Math.floor(fB);
        }
        this.E = fB;
        this.f22632x = 0L;
        c();
    }

    public final void k(float f2, float f7) {
        if (f2 > f7) {
            throw new IllegalArgumentException("minFrame (" + f2 + ") must be <= maxFrame (" + f7 + ")");
        }
        i iVar = this.I;
        float f10 = iVar == null ? -3.4028235E38f : iVar.f14872l;
        float f11 = iVar == null ? Float.MAX_VALUE : iVar.f14873m;
        float fB = g.b(f2, f10, f11);
        float fB2 = g.b(f7, f10, f11);
        if (fB == this.G && fB2 == this.H) {
            return;
        }
        this.G = fB;
        this.H = fB2;
        j((int) g.b(this.E, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i7) {
        super.setRepeatMode(i7);
        if (i7 == 2 || !this.f22631w) {
            return;
        }
        this.f22631w = false;
        this.f22630v = -this.f22630v;
    }
}
