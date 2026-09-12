package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f2394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f2395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f2396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f2397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry f2398e;

    public u0(Application application, d3.e owner, Bundle bundle) {
        z0 z0Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f2398e = owner.getSavedStateRegistry();
        this.f2397d = owner.getLifecycle();
        this.f2396c = bundle;
        this.f2394a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (z0.f2413c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                z0.f2413c = new z0(application);
            }
            z0Var = z0.f2413c;
            Intrinsics.checkNotNull(z0Var);
        } else {
            z0Var = new z0(null);
        }
        this.f2395b = z0Var;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final y0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final y0 b(Class modelClass, t2.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(b1.f2333a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(q0.f2383a) == null || extras.a(q0.f2384b) == null) {
            if (this.f2397d != null) {
                return d(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(z0.f2414d);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? v0.a(modelClass, v0.f2402b) : v0.a(modelClass, v0.f2401a);
        if (constructorA == null) {
            return this.f2395b.b(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? v0.b(modelClass, constructorA, q0.a(extras)) : v0.b(modelClass, constructorA, application, q0.a(extras));
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final y0 c(KClass modelClass, t2.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(gn.h.B(modelClass), extras);
    }

    public final y0 d(Class modelClass, String key) {
        y0 y0VarB;
        AutoCloseable autoCloseable;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Lifecycle lifecycle = this.f2397d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || this.f2394a == null) ? v0.a(modelClass, v0.f2402b) : v0.a(modelClass, v0.f2401a);
        if (constructorA == null) {
            if (this.f2394a != null) {
                return this.f2395b.a(modelClass);
            }
            if (a1.f2330a == null) {
                a1.f2330a = new a1();
            }
            a1 a1Var = a1.f2330a;
            Intrinsics.checkNotNull(a1Var);
            return a1Var.a(modelClass);
        }
        SavedStateRegistry registry = this.f2398e;
        Intrinsics.checkNotNull(registry);
        Bundle bundle = this.f2396c;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        n0 n0VarA = b1.a(registry.a(key), bundle);
        o0 closeable = new o0(key, n0VarA);
        closeable.f(lifecycle, registry);
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.f2296e || stateB.a(Lifecycle.State.f2298v)) {
            registry.d();
        } else {
            lifecycle.a(new f(lifecycle, registry));
        }
        if (!zIsAssignableFrom || (application = this.f2394a) == null) {
            y0VarB = v0.b(modelClass, constructorA, n0VarA);
        } else {
            Intrinsics.checkNotNull(application);
            y0VarB = v0.b(modelClass, constructorA, application, n0VarA);
        }
        y0VarB.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        u2.a aVar = y0VarB.f2410a;
        if (aVar == null) {
            return y0VarB;
        }
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (aVar.f20925d) {
            u2.a.a(closeable);
            return y0VarB;
        }
        synchronized (aVar.f20922a) {
            autoCloseable = (AutoCloseable) aVar.f20923b.put("androidx.lifecycle.savedstate.vm.tag", closeable);
        }
        u2.a.a(autoCloseable);
        return y0VarB;
    }
}
