package m3;

import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15375a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f15376b;

    public c(ViewGroup viewGroup) {
        this.f15376b = viewGroup;
    }

    @Override // m3.u, m3.s
    public final void onTransitionCancel(Transition transition) {
        mo.c0.O(this.f15376b, false);
        this.f15375a = true;
    }

    @Override // m3.u, m3.s
    public final void onTransitionEnd(Transition transition) {
        if (!this.f15375a) {
            mo.c0.O(this.f15376b, false);
        }
        transition.D(this);
    }

    @Override // m3.u, m3.s
    public final void onTransitionPause(Transition transition) {
        mo.c0.O(this.f15376b, false);
    }

    @Override // m3.u, m3.s
    public final void onTransitionResume(Transition transition) {
        mo.c0.O(this.f15376b, true);
    }
}
