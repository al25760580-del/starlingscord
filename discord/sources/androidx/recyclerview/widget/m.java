package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f2639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2642d;

    public m(View view, ViewPropertyAnimator viewPropertyAnimator, r rVar, RecyclerView.ViewHolder viewHolder) {
        this.f2642d = rVar;
        this.f2639a = viewHolder;
        this.f2640b = view;
        this.f2641c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2640b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2641c.setListener(null);
        r rVar = this.f2642d;
        RecyclerView.ViewHolder viewHolder = this.f2639a;
        rVar.dispatchAddFinished(viewHolder);
        rVar.mAddAnimations.remove(viewHolder);
        rVar.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2642d.dispatchAddStarting(this.f2639a);
    }
}
