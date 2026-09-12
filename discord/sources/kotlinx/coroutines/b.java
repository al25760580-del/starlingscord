package kotlinx.coroutines;

import ar.b0;
import ar.c0;
import ar.e0;
import ar.h;
import ar.k;
import ar.m0;
import ar.p0;
import ar.r0;
import ar.s0;
import ar.s1;
import ar.t0;
import fr.p;
import fr.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends t0 implements e0 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14752y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleted$volatile");

    public final void A0(long j, r0 r0Var) {
        int iB;
        Thread threadR0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        r0 r0Var2 = null;
        if (F.get(this) == 1) {
            iB = 1;
        } else {
            s0 s0Var = (s0) atomicReferenceFieldUpdater.get(this);
            if (s0Var == null) {
                s0 s0Var2 = new s0();
                s0Var2.f2962c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, s0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj);
                s0Var = (s0) obj;
            }
            iB = r0Var.b(j, s0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                v0(j, r0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        s0 s0Var3 = (s0) atomicReferenceFieldUpdater.get(this);
        if (s0Var3 != null) {
            synchronized (s0Var3) {
                r0[] r0VarArr = s0Var3.f9406a;
                r0Var2 = r0VarArr != null ? r0VarArr[0] : null;
            }
        }
        if (r0Var2 != r0Var || Thread.currentThread() == (threadR0 = r0())) {
            return;
        }
        LockSupport.unpark(threadR0);
    }

    public m0 P(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return c0.f2901a.P(j, runnable, coroutineContext);
    }

    @Override // ar.e0
    public final void e0(long j, k kVar) {
        long j5 = 0;
        if (j > 0) {
            j5 = j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
        }
        if (j5 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            p0 p0Var = new p0(this, j5 + jNanoTime, kVar);
            A0(jNanoTime, p0Var);
            kVar.w(new h(2, p0Var));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        w0(runnable);
    }

    @Override // ar.t0
    public void shutdown() {
        r0 r0VarB;
        s1.f2963a.set(null);
        F.set(this, 1);
        a5.h hVar = b0.f2888c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14752y;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, hVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                if (obj instanceof p) {
                    ((p) obj).b();
                    break;
                }
                if (obj == hVar) {
                    break;
                }
                p pVar = new p(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                pVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (t0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            s0 s0Var = (s0) E.get(this);
            if (s0Var == null) {
                return;
            }
            synchronized (s0Var) {
                r0VarB = y.f9405b.get(s0Var) > 0 ? s0Var.b(0) : null;
            }
            if (r0VarB == null) {
                return;
            } else {
                v0(jNanoTime, r0VarB);
            }
        }
    }

    @Override // ar.t0
    public final long t0() {
        Runnable runnable;
        r0 r0Var;
        a5.h hVar = b0.f2888c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14752y;
        if (!u0()) {
            x0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof p) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                        p pVar = (p) obj;
                        Object objD = pVar.d();
                        if (objD != p.f9389g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        p pVarC = pVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != hVar) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ArrayDeque arrayDeque = this.f2967w;
            if (((arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof p) {
                        long j = p.f9388f.get((p) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == hVar) {
                        return LongCompanionObject.MAX_VALUE;
                    }
                }
                s0 s0Var = (s0) E.get(this);
                if (s0Var != null) {
                    synchronized (s0Var) {
                        r0[] r0VarArr = s0Var.f9406a;
                        r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    }
                    if (r0Var != null) {
                        long jNanoTime = r0Var.f2959d - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return LongCompanionObject.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void w0(Runnable runnable) {
        x0();
        if (!y0(runnable)) {
            a.G.w0(runnable);
            return;
        }
        Thread threadR0 = r0();
        if (Thread.currentThread() != threadR0) {
            LockSupport.unpark(threadR0);
        }
    }

    public final void x0() {
        r0 r0VarB;
        s0 s0Var = (s0) E.get(this);
        if (s0Var == null || y.f9405b.get(s0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.f9406a;
                    r0VarB = null;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (r0Var != null) {
                        r0VarB = ((jNanoTime - r0Var.f2959d) > 0L ? 1 : ((jNanoTime - r0Var.f2959d) == 0L ? 0 : -1)) >= 0 ? y0(r0Var) : false ? s0Var.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (r0VarB != null);
    }

    public final boolean y0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14752y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (F.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof p)) {
                if (obj == b0.f2888c) {
                    return false;
                }
                p pVar = new p(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                pVar.a((Runnable) obj);
                pVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
            p pVar2 = (p) obj;
            int iA = pVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                p pVarC = pVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean z0() {
        Object obj;
        long j;
        ArrayDeque arrayDeque = this.f2967w;
        if (arrayDeque != null ? arrayDeque.isEmpty() : true) {
            s0 s0Var = (s0) E.get(this);
            if (s0Var == null) {
                obj = f14752y.get(this);
                if (obj != null) {
                    if (obj instanceof p) {
                        j = p.f9388f.get((p) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b0.f2888c) {
                    }
                }
                return true;
            }
            if (y.f9405b.get(s0Var) == 0) {
                obj = f14752y.get(this);
                if (obj != null) {
                    if (obj instanceof p) {
                        j = p.f9388f.get((p) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b0.f2888c) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
