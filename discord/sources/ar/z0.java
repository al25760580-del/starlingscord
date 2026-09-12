package ar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends d1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2990x = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c1 f2991w;

    public z0(c1 c1Var) {
        this.f2991w = c1Var;
    }

    @Override // ar.d1
    public final boolean j() {
        return true;
    }

    @Override // ar.d1
    public final void k(Throwable th2) {
        if (f2990x.compareAndSet(this, 0, 1)) {
            this.f2991w.invoke(th2);
        }
    }
}
