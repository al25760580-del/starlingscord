package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f2196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f2197e;

    public m0(n0 n0Var, j1 j1Var) {
        this.f2197e = n0Var;
        this.f2196d = j1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        j1 j1Var = this.f2196d;
        Fragment fragment = j1Var.f2168c;
        j1Var.k();
        b2.j((ViewGroup) fragment.mView.getParent(), this.f2197e.f2204d).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
