package androidx.core.util;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Pools$SynchronizedPool extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1582c;

    public Pools$SynchronizedPool(int i7) {
        super(i7);
        this.f1582c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, k1.b
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f1582c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // androidx.core.util.Pools$SimplePool, k1.b
    public final boolean release(Object instance) {
        boolean zRelease;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f1582c) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}
