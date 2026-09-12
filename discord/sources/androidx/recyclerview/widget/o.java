package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator$ChangeInfo f2654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2657d;

    public o(r rVar, DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2657d = rVar;
        this.f2654a = defaultItemAnimator$ChangeInfo;
        this.f2655b = viewPropertyAnimator;
        this.f2656c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2655b.setListener(null);
        View view = this.f2656c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo = this.f2654a;
        RecyclerView.ViewHolder viewHolder = defaultItemAnimator$ChangeInfo.f2450a;
        r rVar = this.f2657d;
        rVar.dispatchChangeFinished(viewHolder, true);
        rVar.mChangeAnimations.remove(defaultItemAnimator$ChangeInfo.f2450a);
        rVar.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2657d.dispatchChangeStarting(this.f2654a.f2450a, true);
    }
}
