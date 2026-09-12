package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator$ChangeInfo f2665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2668d;

    public p(r rVar, DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2668d = rVar;
        this.f2665a = defaultItemAnimator$ChangeInfo;
        this.f2666b = viewPropertyAnimator;
        this.f2667c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2666b.setListener(null);
        View view = this.f2667c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo = this.f2665a;
        RecyclerView.ViewHolder viewHolder = defaultItemAnimator$ChangeInfo.f2451b;
        r rVar = this.f2668d;
        rVar.dispatchChangeFinished(viewHolder, false);
        rVar.mChangeAnimations.remove(defaultItemAnimator$ChangeInfo.f2451b);
        rVar.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2668d.dispatchChangeStarting(this.f2665a.f2451b, false);
    }
}
