package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f2645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f2650f;

    public n(r rVar, RecyclerView.ViewHolder viewHolder, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2650f = rVar;
        this.f2645a = viewHolder;
        this.f2646b = i7;
        this.f2647c = view;
        this.f2648d = i10;
        this.f2649e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f2646b;
        View view = this.f2647c;
        if (i7 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2648d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2649e.setListener(null);
        r rVar = this.f2650f;
        RecyclerView.ViewHolder viewHolder = this.f2645a;
        rVar.dispatchMoveFinished(viewHolder);
        rVar.mMoveAnimations.remove(viewHolder);
        rVar.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2650f.dispatchMoveStarting(this.f2645a);
    }
}
