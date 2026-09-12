package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends FragmentContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f2100d;

    public b0(Fragment fragment) {
        this.f2100d = fragment;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final View b(int i7) {
        Fragment fragment = this.f2100d;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i7);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final boolean c() {
        return this.f2100d.mView != null;
    }
}
