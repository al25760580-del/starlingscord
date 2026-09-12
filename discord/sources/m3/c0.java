package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15384h;

    public c0(View view, View view2, float f2, float f7) {
        this.f15378b = view;
        this.f15377a = view2;
        this.f15382f = f2;
        this.f15383g = f7;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.f15379c = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15384h = true;
        float f2 = this.f15382f;
        View view = this.f15378b;
        view.setTranslationX(f2);
        view.setTranslationY(this.f15383g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        float f2 = this.f15382f;
        View view = this.f15378b;
        view.setTranslationX(f2);
        view.setTranslationY(this.f15383g);
    }

    @Override // m3.s
    public final void onTransitionCancel(Transition transition) {
        this.f15384h = true;
        float f2 = this.f15382f;
        View view = this.f15378b;
        view.setTranslationX(f2);
        view.setTranslationY(this.f15383g);
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition, boolean z5) {
        if (this.f15384h) {
            return;
        }
        this.f15377a.setTag(R.id.transition_position, null);
    }

    @Override // m3.s
    public final void onTransitionPause(Transition transition) {
        if (this.f15379c == null) {
            this.f15379c = new int[2];
        }
        int[] iArr = this.f15379c;
        View view = this.f15378b;
        view.getLocationOnScreen(iArr);
        this.f15377a.setTag(R.id.transition_position, this.f15379c);
        this.f15380d = view.getTranslationX();
        this.f15381e = view.getTranslationY();
        view.setTranslationX(this.f15382f);
        view.setTranslationY(this.f15383g);
    }

    @Override // m3.s
    public final void onTransitionResume(Transition transition) {
        float f2 = this.f15380d;
        View view = this.f15378b;
        view.setTranslationX(f2);
        view.setTranslationY(this.f15381e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition) {
        onTransitionEnd(transition, false);
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition) {
    }
}
