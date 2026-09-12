package androidx.fragment.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements MenuProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2244a;

    public s0(FragmentManager fragmentManager) {
        this.f2244a = fragmentManager;
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean a(MenuItem menuItem) {
        return this.f2244a.p(menuItem);
    }

    @Override // androidx.core.view.MenuProvider
    public final void b(Menu menu) {
        this.f2244a.q(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public final void c(Menu menu, MenuInflater menuInflater) {
        this.f2244a.k(menu, menuInflater);
    }

    @Override // androidx.core.view.MenuProvider
    public final void d(Menu menu) {
        this.f2244a.t(menu);
    }
}
