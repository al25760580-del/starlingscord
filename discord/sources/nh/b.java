package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16833b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f16832a = i7;
        this.f16833b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f16832a) {
            case 1:
                this.f16833b.f16870b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f16832a) {
            case 0:
                this.f16833b.f16870b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
