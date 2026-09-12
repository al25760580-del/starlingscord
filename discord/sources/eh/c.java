package eh;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f8192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8193b;

    public c(e eVar, float f2) {
        this.f8193b = eVar;
        this.f8192a = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8193b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f8192a);
    }
}
