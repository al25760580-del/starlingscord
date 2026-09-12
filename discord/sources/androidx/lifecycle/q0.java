package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kh.f f2383a = new kh.f(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pa.s f2384b = new pa.s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q8.c f2385c = new q8.c();

    public static final n0 a(t2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        d3.e eVar = (d3.e) cVar.a(f2383a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c1 c1Var = (c1) cVar.a(f2384b);
        if (c1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f2385c);
        String key = (String) cVar.a(b1.f2333a);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        d3.d dVarB = eVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        s0 s0Var = dVarB instanceof s0 ? (s0) dVarB : null;
        if (s0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        t0 t0VarC = c(c1Var);
        n0 n0Var = (n0) t0VarC.f2393b.get(key);
        if (n0Var != null) {
            return n0Var;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        s0Var.b();
        Bundle source = s0Var.f2391c;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            if (source.containsKey(key)) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                Bundle source2 = source.getBundle(key);
                if (source2 == null) {
                    kotlin.collections.w0.d().getClass();
                    source2 = zs.a.f((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source2, "source");
                }
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.remove(key);
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.isEmpty()) {
                    s0Var.f2391c = null;
                }
                bundle2 = source2;
            }
        }
        n0 n0VarA = b1.a(bundle2, bundle);
        t0VarC.f2393b.put(key, n0VarA);
        return n0VarA;
    }

    public static final void b(d3.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Lifecycle.State stateB = eVar.getLifecycle().b();
        if (stateB != Lifecycle.State.f2296e && stateB != Lifecycle.State.f2297i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.getSavedStateRegistry().b() == null) {
            s0 s0Var = new s0(eVar.getSavedStateRegistry(), (c1) eVar);
            eVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s0Var);
            eVar.getLifecycle().a(new d3.b(s0Var));
        }
    }

    public static final t0 c(c1 owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        p0 factory = new p0();
        Intrinsics.checkNotNullParameter(owner, "owner");
        CreationExtras defaultCreationExtras = owner instanceof i ? ((i) owner).getDefaultViewModelCreationExtras() : t2.a.f20587b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        ViewModelStore store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(store, factory, defaultCreationExtras);
        KClass modelClass = Reflection.getOrCreateKotlinClass(t0.class);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (t0) rVar.g("androidx.lifecycle.internal.SavedStateHandlesVM", modelClass);
    }
}
