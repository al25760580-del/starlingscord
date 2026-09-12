package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u0;
import androidx.transition.Transition;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f15409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15412d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.c f15413e;

    public h0(androidx.transition.c cVar, ViewGroup viewGroup, View view, View view2) {
        this.f15413e = cVar;
        this.f15409a = viewGroup;
        this.f15410b = view;
        this.f15411c = view2;
    }

    public final void a() {
        this.f15411c.setTag(R.id.save_overlay_view, null);
        this.f15409a.getOverlay().remove(this.f15410b);
        this.f15412d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f15409a.getOverlay().remove(this.f15410b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f15410b;
        if (view.getParent() == null) {
            u0.a(view, this.f15409a);
        } else {
            this.f15413e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            View view = this.f15411c;
            View view2 = this.f15410b;
            view.setTag(R.id.save_overlay_view, view2);
            u0.a(view2, this.f15409a);
            this.f15412d = true;
        }
    }

    @Override // m3.s
    public final void onTransitionCancel(Transition transition) {
        if (this.f15412d) {
            a();
        }
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition) {
        transition.D(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        a();
    }

    @Override // m3.s
    public final void onTransitionPause(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionResume(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition) {
    }
}
