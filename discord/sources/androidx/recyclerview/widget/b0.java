package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f2561a;

    public b0(c0 c0Var) {
        this.f2561a = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        c0 c0Var = this.f2561a;
        c0Var.f2567c.setAlpha(iFloatValue);
        c0Var.f2568d.setAlpha(iFloatValue);
        c0Var.f2581s.invalidate();
    }
}
