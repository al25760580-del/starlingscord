package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1635c;

    public /* synthetic */ b1(Object obj, View view, int i7) {
        this.f1633a = i7;
        this.f1635c = obj;
        this.f1634b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1633a) {
            case 0:
                ((d1) this.f1635c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1633a) {
            case 0:
                ((d1) this.f1635c).onAnimationEnd();
                break;
            case 1:
                p1 p1Var = (p1) this.f1635c;
                p1Var.f1715a.d(1.0f);
                k1.e((View) this.f1634b, p1Var);
                break;
            default:
                ((s.e) this.f1635c).remove(animator);
                ((Transition) this.f1634b).L.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1633a) {
            case 0:
                ((d1) this.f1635c).d();
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((Transition) this.f1634b).L.add(animator);
                break;
        }
    }

    public b1(Transition transition, s.e eVar) {
        this.f1633a = 2;
        this.f1634b = transition;
        this.f1635c = eVar;
    }
}
