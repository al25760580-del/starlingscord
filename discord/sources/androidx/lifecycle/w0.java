package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LifecycleRegistry f2405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f2406e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2407i;

    public w0(LifecycleRegistry registry, n event) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f2405d = registry;
        this.f2406e = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2407i) {
            return;
        }
        this.f2405d.f(this.f2406e);
        this.f2407i = true;
    }
}
