package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f2751b;

    public b(CircularProgressDrawable circularProgressDrawable, c cVar) {
        this.f2751b = circularProgressDrawable;
        this.f2750a = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        CircularProgressDrawable circularProgressDrawable = this.f2751b;
        c cVar = this.f2750a;
        circularProgressDrawable.a(1.0f, cVar, true);
        cVar.k = cVar.f2756e;
        cVar.f2761l = cVar.f2757f;
        cVar.f2762m = cVar.f2758g;
        cVar.a((cVar.j + 1) % cVar.f2760i.length);
        if (!circularProgressDrawable.f2747x) {
            circularProgressDrawable.f2746w += 1.0f;
            return;
        }
        circularProgressDrawable.f2747x = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (cVar.f2763n) {
            cVar.f2763n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2751b.f2746w = 0.0f;
    }
}
