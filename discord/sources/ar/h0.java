package ar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends fr.t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2921w = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // fr.t, ar.i1
    public final void t(Object obj) throws g0 {
        v(obj);
    }

    @Override // fr.t, ar.i1
    public final void v(Object obj) throws g0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2921w;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                fr.h.f(b0.u(obj), wn.f.b(this.f9396v));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
