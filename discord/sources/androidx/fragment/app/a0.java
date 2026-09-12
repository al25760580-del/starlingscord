package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends Fragment.OnPreAttachedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f2088a;

    public a0(Fragment fragment) {
        this.f2088a = fragment;
    }

    @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
    public final void a() {
        Fragment fragment = this.f2088a;
        fragment.mSavedStateRegistryController.f2737a.a();
        androidx.lifecycle.q0.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
