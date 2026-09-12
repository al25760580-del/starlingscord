package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import d3.d;
import d3.e;
import e3.a;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f2738b;

    public SavedStateRegistryController(a aVar) {
        this.f2737a = aVar;
        this.f2738b = new SavedStateRegistry(aVar);
    }

    public final void a(Bundle source) {
        a aVar = this.f2737a;
        e eVar = aVar.f7954a;
        if (!aVar.f7958e) {
            aVar.a();
        }
        if (eVar.getLifecycle().b().a(Lifecycle.State.f2298v)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.getLifecycle().b()).toString());
        }
        if (aVar.f7960g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleW = null;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
            if (source.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleW = c9.a.w("androidx.lifecycle.BundlableSavedStateRegistry.key", source);
            }
        }
        aVar.f7959f = bundleW;
        aVar.f7960g = true;
    }

    public final void b(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "outBundle");
        a aVar = this.f2737a;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        w0.d().getClass();
        Bundle value = zs.a.f((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(value, "source");
        Bundle from = aVar.f7959f;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            value.putAll(from);
        }
        synchronized (aVar.f7956c) {
            try {
                for (Map.Entry entry : aVar.f7957d.entrySet()) {
                    String key = (String) entry.getKey();
                    Bundle value2 = ((d) entry.getValue()).a();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value.putBundle(key, value2);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullParameter(value, "source");
        if (value.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", value);
    }
}
