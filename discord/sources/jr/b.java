package jr;

import ar.b0;
import ar.g0;
import ar.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f implements Mutex {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14071g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = c.f14072a;

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object a(xn.c frame) throws g0 {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f.f14079f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else {
                if (i10 <= 0) {
                    k kVarP = b0.p(wn.f.b(frame));
                    try {
                        c(new a(this, kVarP));
                        Object objR = kVarP.r();
                        wn.a aVar = wn.a.f22354d;
                        if (objR == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (objR != aVar) {
                            objR = Unit.f14616a;
                        }
                        return objR == aVar ? objR : Unit.f14616a;
                    } catch (Throwable th2) {
                        kVarP.A();
                        throw th2;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f14071g.set(this, null);
                    return Unit.f14616a;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void b(Object obj) {
        while (Math.max(f.f14079f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14071g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a5.h hVar = c.f14072a;
            if (obj2 != hVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, hVar)) {
                        d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(b0.o(this));
        sb2.append("[isLocked=");
        sb2.append(Math.max(f.f14079f.get(this), 0) == 0);
        sb2.append(",owner=");
        sb2.append(f14071g.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
