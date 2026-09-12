package fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9188b;

    public /* synthetic */ f(h hVar, int i7) {
        this.f9187a = i7;
        this.f9188b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9187a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f9188b;
                hVar.c();
                c cVar = hVar.j;
                if (cVar != null) {
                    cVar.a((t) hVar.f9256a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f9187a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f9188b;
                hVar.f9198g = (hVar.f9198g + 4) % hVar.f9197f.f9218e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
