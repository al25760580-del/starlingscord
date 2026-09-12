package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements d3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f2389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f2391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rn.u f2392d;

    public s0(SavedStateRegistry savedStateRegistry, c1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f2389a = savedStateRegistry;
        this.f2392d = rn.l.b(new r0(0, viewModelStoreOwner));
    }

    @Override // d3.d
    public final Bundle a() {
        kotlin.collections.w0.d().getClass();
        Bundle source = zs.a.f((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from = this.f2391c;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        for (Map.Entry entry : ((t0) this.f2392d.getValue()).f2393b.entrySet()) {
            String key = (String) entry.getKey();
            Bundle value = ((e.c) ((n0) entry.getValue()).f2375a.f24048w).a();
            Intrinsics.checkNotNullParameter(value, "source");
            if (!value.isEmpty()) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                source.putBundle(key, value);
            }
        }
        this.f2390b = false;
        return source;
    }

    public final void b() {
        if (this.f2390b) {
            return;
        }
        Bundle from = this.f2389a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        kotlin.collections.w0.d().getClass();
        Bundle source = zs.a.f((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from2 = this.f2391c;
        if (from2 != null) {
            Intrinsics.checkNotNullParameter(from2, "from");
            source.putAll(from2);
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        this.f2391c = source;
        this.f2390b = true;
    }
}
