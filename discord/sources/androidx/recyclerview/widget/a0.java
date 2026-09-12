package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2557a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f2558b;

    public a0(c0 c0Var) {
        this.f2558b = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2557a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2557a) {
            this.f2557a = false;
            return;
        }
        c0 c0Var = this.f2558b;
        if (((Float) c0Var.f2588z.getAnimatedValue()).floatValue() == 0.0f) {
            c0Var.A = 0;
            c0Var.d(0);
        } else {
            c0Var.A = 2;
            c0Var.f2581s.invalidate();
        }
    }
}
