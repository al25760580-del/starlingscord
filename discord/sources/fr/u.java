package fr;

import ar.n1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends c implements n1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9397v = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9398i;

    public u(long j, u uVar, int i7) {
        super(uVar);
        this.f9398i = j;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // fr.c
    public final boolean d() {
        return f9397v.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f9397v.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i7, CoroutineContext coroutineContext);

    public final void i() {
        if (f9397v.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f9397v;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
