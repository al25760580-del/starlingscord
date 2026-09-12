package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f15403c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15406f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15404d = true;

    public g0(int i7, View view) {
        this.f15401a = view;
        this.f15402b = i7;
        this.f15403c = (ViewGroup) view.getParent();
        a(true);
    }

    public final void a(boolean z5) {
        ViewGroup viewGroup;
        if (!this.f15404d || this.f15405e == z5 || (viewGroup = this.f15403c) == null) {
            return;
        }
        this.f15405e = z5;
        mo.c0.O(viewGroup, z5);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15406f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f15406f) {
            d0.b(this.f15402b, this.f15401a);
            ViewGroup viewGroup = this.f15403c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition) {
        transition.D(this);
    }

    @Override // m3.s
    public final void onTransitionPause(Transition transition) {
        a(false);
        if (this.f15406f) {
            return;
        }
        d0.b(this.f15402b, this.f15401a);
    }

    @Override // m3.s
    public final void onTransitionResume(Transition transition) {
        a(true);
        if (this.f15406f) {
            return;
        }
        d0.b(0, this.f15401a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            d0.b(0, this.f15401a);
            ViewGroup viewGroup = this.f15403c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        if (!this.f15406f) {
            d0.b(this.f15402b, this.f15401a);
            ViewGroup viewGroup = this.f15403c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // m3.s
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition) {
    }
}
