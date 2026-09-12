package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import ar.q1;
import com.discord.R;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ga.k f2333a = new ga.k();

    public static n0 a(Bundle source, Bundle bundle) {
        if (source == null) {
            source = bundle;
        }
        if (source == null) {
            n0 n0Var = new n0();
            new LinkedHashMap();
            n0Var.f2375a = new zl.e(kotlin.collections.w0.d());
            return n0Var;
        }
        ClassLoader classLoader = n0.class.getClassLoader();
        Intrinsics.checkNotNull(classLoader);
        source.setClassLoader(classLoader);
        Intrinsics.checkNotNullParameter(source, "source");
        sn.i builder = new sn.i(source.size());
        for (String str : source.keySet()) {
            Intrinsics.checkNotNull(str);
            builder.put(str, source.get(str));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        sn.i initialState = builder.b();
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        n0 n0Var2 = new n0();
        new LinkedHashMap();
        n0Var2.f2375a = new zl.e(initialState);
        return n0Var2;
    }

    public static final LifecycleOwner b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            Object parent = view.getParent();
            if (parent == null) {
                Object tag2 = view.getTag(R.id.view_tree_disjoint_parent);
                parent = tag2 instanceof ViewParent ? (ViewParent) tag2 : null;
            }
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static final q c(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        while (true) {
            q qVar = (q) ((AtomicReference) lifecycle.f2294a.f9547e).get();
            if (qVar != null) {
                return qVar;
            }
            q1 q1Var = new q1();
            hr.e eVar = ar.k0.f2938a;
            q qVar2 = new q(lifecycle, kotlin.coroutines.e.c(q1Var, fr.q.f9394a.f3388w));
            AtomicReference atomicReference = (AtomicReference) lifecycle.f2294a.f9547e;
            do {
                if (atomicReference.compareAndSet(null, qVar2)) {
                    hr.e eVar2 = ar.k0.f2938a;
                    ar.b0.t(qVar2, fr.q.f9394a.f3388w, new p(qVar2, null), 2);
                    return qVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final void d(View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
