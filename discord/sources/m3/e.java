package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15395b = false;

    public e(View view) {
        this.f15394a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        d0.f15392a.G(this.f15394a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f15394a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f15395b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // m3.s
    public final void onTransitionPause(Transition transition) {
        View view = this.f15394a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? d0.f15392a.p(view) : 0.0f));
    }

    @Override // m3.s
    public final void onTransitionResume(Transition transition) {
        this.f15394a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        boolean z6 = this.f15395b;
        View view = this.f15394a;
        if (z6) {
            view.setLayerType(0, null);
        }
        if (z5) {
            return;
        }
        e0 e0Var = d0.f15392a;
        e0Var.G(view, 1.0f);
        e0Var.getClass();
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition, boolean z5) {
    }

    @Override // m3.s
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition) {
    }
}
