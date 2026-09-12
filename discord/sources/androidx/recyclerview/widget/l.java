package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f2635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2638d;

    public l(View view, ViewPropertyAnimator viewPropertyAnimator, r rVar, RecyclerView.ViewHolder viewHolder) {
        this.f2638d = rVar;
        this.f2635a = viewHolder;
        this.f2636b = viewPropertyAnimator;
        this.f2637c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2636b.setListener(null);
        this.f2637c.setAlpha(1.0f);
        r rVar = this.f2638d;
        RecyclerView.ViewHolder viewHolder = this.f2635a;
        rVar.dispatchRemoveFinished(viewHolder);
        rVar.mRemoveAnimations.remove(viewHolder);
        rVar.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2638d.dispatchRemoveStarting(this.f2635a);
    }
}
