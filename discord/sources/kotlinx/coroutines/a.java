package kotlinx.coroutines;

import ar.m0;
import ar.m1;
import ar.q0;
import ar.r0;
import ar.s1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements Runnable {
    public static final a G;
    public static final long H;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l6;
        a aVar = new a();
        G = aVar;
        aVar.s0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l6 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l6 = 1000L;
        }
        H = timeUnit.toNanos(l6.longValue());
    }

    public final synchronized void B0() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            b.f14752y.set(this, null);
            b.E.set(this, null);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.b, ar.e0
    public final m0 P(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j5 = 0;
        if (j > 0) {
            j5 = j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
        }
        if (j5 >= 4611686018427387903L) {
            return m1.f2944d;
        }
        long jNanoTime = System.nanoTime();
        q0 q0Var = new q0(runnable, j5 + jNanoTime);
        A0(jNanoTime, q0Var);
        return q0Var;
    }

    @Override // ar.t0
    public final Thread r0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(G.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1.f2963a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    _thread = null;
                    B0();
                    if (z0()) {
                        return;
                    }
                    r0();
                    return;
                }
                debugStatus = 1;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jT0 = t0();
                    if (jT0 == LongCompanionObject.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == LongCompanionObject.MAX_VALUE) {
                            j = H + jNanoTime;
                        }
                        long j5 = j - jNanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            B0();
                            if (z0()) {
                                return;
                            }
                            r0();
                            return;
                        }
                        if (jT0 > j5) {
                            jT0 = j5;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jT0 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            B0();
                            if (z0()) {
                                return;
                            }
                            r0();
                            return;
                        }
                        LockSupport.parkNanos(this, jT0);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            B0();
            if (!z0()) {
                r0();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.b, ar.t0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // ar.t0
    public final void v0(long j, r0 r0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.b
    public final void w0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.w0(runnable);
    }
}
