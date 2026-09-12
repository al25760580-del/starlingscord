package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f2110d;

    public c0(Fragment fragment) {
        this.f2110d = fragment;
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner lifecycleOwner, androidx.lifecycle.n nVar) {
        View view;
        if (nVar != androidx.lifecycle.n.ON_STOP || (view = this.f2110d.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
