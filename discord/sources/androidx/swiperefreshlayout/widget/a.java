package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f2749b;

    public a(CircularProgressDrawable circularProgressDrawable, c cVar) {
        this.f2749b = circularProgressDrawable;
        this.f2748a = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c cVar = this.f2748a;
        CircularProgressDrawable.d(fFloatValue, cVar);
        CircularProgressDrawable circularProgressDrawable = this.f2749b;
        circularProgressDrawable.a(fFloatValue, cVar, false);
        circularProgressDrawable.invalidateSelf();
    }
}
