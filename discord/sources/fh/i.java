package fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9202b;

    public /* synthetic */ i(j jVar, int i7) {
        this.f9201a = i7;
        this.f9202b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9201a) {
            case 1:
                super.onAnimationEnd(animator);
                j jVar = this.f9202b;
                jVar.c();
                c cVar = jVar.j;
                if (cVar != null) {
                    cVar.a((t) jVar.f9256a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f9201a) {
            case 0:
                super.onAnimationRepeat(animator);
                j jVar = this.f9202b;
                jVar.f9211g = (jVar.f9211g + j.f9203l.length) % jVar.f9210f.f9218e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
