package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final void a(y0 viewModel, SavedStateRegistry registry, Lifecycle lifecycle) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        viewModel.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        u2.a aVar = viewModel.f2410a;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            synchronized (aVar.f20922a) {
                autoCloseable = (AutoCloseable) aVar.f20923b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        o0 o0Var = (o0) autoCloseable;
        if (o0Var == null || o0Var.f2378i) {
            return;
        }
        o0Var.f(lifecycle, registry);
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.f2296e || stateB.a(Lifecycle.State.f2298v)) {
            registry.d();
        } else {
            lifecycle.a(new f(lifecycle, registry));
        }
    }
}
