package m3;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class j implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f15425a;

    public j(Runnable runnable) {
        this.f15425a = runnable;
    }

    @Override // m3.s
    public final void onTransitionEnd(Transition transition) {
        this.f15425a.run();
    }

    @Override // m3.s
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionPause(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionResume(Transition transition) {
    }

    @Override // m3.s
    public final void onTransitionStart(Transition transition) {
    }
}
