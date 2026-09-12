package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements t, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f2377e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2378i;

    public o0(String key, n0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f2376d = key;
        this.f2377e = handle;
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == n.ON_DESTROY) {
            this.f2378i = false;
            source.getLifecycle().c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void f(Lifecycle lifecycle, SavedStateRegistry registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f2378i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2378i = true;
        lifecycle.a(this);
        registry.c(this.f2376d, (e.c) this.f2377e.f2375a.f24048w);
    }
}
