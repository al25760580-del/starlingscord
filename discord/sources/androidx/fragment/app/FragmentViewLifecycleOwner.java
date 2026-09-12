package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewLifecycleOwner implements androidx.lifecycle.i, d3.e, androidx.lifecycle.c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fragment f2080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewModelStore f2081e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f2082i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LifecycleRegistry f2083v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SavedStateRegistryController f2084w = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, x xVar) {
        this.f2080d = fragment;
        this.f2081e = viewModelStore;
        this.f2082i = xVar;
    }

    public final void a(androidx.lifecycle.n nVar) {
        this.f2083v.f(nVar);
    }

    public final void b() {
        if (this.f2083v == null) {
            this.f2083v = new LifecycleRegistry(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            e3.a aVar = new e3.a(this, new androidx.lifecycle.r0(27, this));
            this.f2084w = new SavedStateRegistryController(aVar);
            aVar.a();
            this.f2082i.run();
        }
    }

    @Override // androidx.lifecycle.i
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f2080d;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        t2.c cVar = new t2.c(0);
        if (application != null) {
            cVar.b(androidx.lifecycle.z0.f2414d, application);
        }
        cVar.b(androidx.lifecycle.q0.f2383a, fragment);
        cVar.b(androidx.lifecycle.q0.f2384b, this);
        if (fragment.getArguments() != null) {
            cVar.b(androidx.lifecycle.q0.f2385c, fragment.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.f2083v;
    }

    @Override // d3.e
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f2084w.f2738b;
    }

    @Override // androidx.lifecycle.c1
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f2081e;
    }
}
