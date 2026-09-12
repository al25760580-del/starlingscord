package com.google.android.gms.internal.play_billing;

import com.discord.age_assurance.DigitalCredentialModule;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class v4 implements x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f6162v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f6163w = Logger.getLogger(v4.class.getName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z1 f6164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f6165y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f6166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile k2 f6167e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile u4 f6168i;

    static {
        z1 m4Var;
        try {
            m4Var = new l3(AtomicReferenceFieldUpdater.newUpdater(u4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(u4.class, u4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v4.class, u4.class, "i"), AtomicReferenceFieldUpdater.newUpdater(v4.class, k2.class, "e"), AtomicReferenceFieldUpdater.newUpdater(v4.class, Object.class, "d"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            m4Var = new m4();
        }
        Throwable th3 = th;
        f6164x = m4Var;
        if (th3 != null) {
            f6163w.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f6165y = new Object();
    }

    public static void d(v4 v4Var) {
        u4 u4Var;
        z1 z1Var;
        k2 k2Var;
        k2 k2Var2;
        k2 k2Var3;
        do {
            u4Var = v4Var.f6168i;
            z1Var = f6164x;
        } while (!z1Var.B(v4Var, u4Var, u4.f6147c));
        while (true) {
            k2Var = null;
            if (u4Var == null) {
                break;
            }
            Thread thread = u4Var.f6148a;
            if (thread != null) {
                u4Var.f6148a = null;
                LockSupport.unpark(thread);
            }
            u4Var = u4Var.f6149b;
        }
        do {
            k2Var2 = v4Var.f6167e;
        } while (!z1Var.t(v4Var, k2Var2, k2.f6029d));
        while (true) {
            k2Var3 = k2Var;
            k2Var = k2Var2;
            if (k2Var == null) {
                break;
            }
            k2Var2 = k2Var.f6032c;
            k2Var.f6032c = k2Var3;
        }
        while (k2Var3 != null) {
            Runnable runnable = k2Var3.f6030a;
            k2 k2Var4 = k2Var3.f6032c;
            f(runnable, k2Var3.f6031b);
            k2Var3 = k2Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f6163w.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", a3.e.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof c1) {
            Throwable th2 = ((c1) obj).f5992a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof x1) {
            throw new ExecutionException(((x1) obj).f6185a);
        }
        if (obj == f6165y) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        k2 k2Var = this.f6167e;
        k2 k2Var2 = k2.f6029d;
        if (k2Var != k2Var2) {
            k2 k2Var3 = new k2(runnable, executor);
            do {
                k2Var3.f6032c = k2Var;
                if (f6164x.t(this, k2Var, k2Var3)) {
                    return;
                } else {
                    k2Var = this.f6167e;
                }
            } while (k2Var != k2Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return a3.e.h(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        c1 c1Var;
        Object obj = this.f6166d;
        if (obj != null) {
            return false;
        }
        if (f6162v) {
            c1Var = new c1(new CancellationException("Future.cancel() was called."));
        } else {
            c1Var = z5 ? c1.f5990b : c1.f5991c;
        }
        if (!f6164x.w(this, obj, c1Var)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb2) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                } catch (Throwable th2) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append(DigitalCredentialModule.CODE_CANCELLED);
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    public final void g(u4 u4Var) {
        u4Var.f6148a = null;
        while (true) {
            u4 u4Var2 = this.f6168i;
            if (u4Var2 != u4.f6147c) {
                u4 u4Var3 = null;
                while (u4Var2 != null) {
                    u4 u4Var4 = u4Var2.f6149b;
                    if (u4Var2.f6148a != null) {
                        u4Var3 = u4Var2;
                    } else if (u4Var3 != null) {
                        u4Var3.f6149b = u4Var4;
                        if (u4Var3.f6148a == null) {
                        }
                    } else if (!f6164x.B(this, u4Var2, u4Var4)) {
                    }
                    u4Var2 = u4Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6166d;
        if (obj2 != null) {
            return h(obj2);
        }
        u4 u4Var = this.f6168i;
        u4 u4Var2 = u4.f6147c;
        if (u4Var != u4Var2) {
            u4 u4Var3 = new u4();
            do {
                z1 z1Var = f6164x;
                z1Var.i(u4Var3, u4Var);
                if (z1Var.B(this, u4Var, u4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(u4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f6166d;
                    } while (obj == null);
                    return h(obj);
                }
                u4Var = this.f6168i;
            } while (u4Var != u4Var2);
        }
        return h(this.f6166d);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6166d instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6166d != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f6166d instanceof c1) {
            sb2.append(DigitalCredentialModule.CODE_CANCELLED);
        } else if (isDone()) {
            e(sb2);
        } else {
            try {
                strConcat = c();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f6166d;
            if (obj != null) {
                return h(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                u4 u4Var = this.f6168i;
                u4 u4Var2 = u4.f6147c;
                if (u4Var != u4Var2) {
                    u4 u4Var3 = new u4();
                    while (true) {
                        z1 z1Var = f6164x;
                        z1Var.i(u4Var3, u4Var);
                        if (z1Var.B(this, u4Var, u4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6166d;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    g(u4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(u4Var3);
                            break;
                        }
                        u4Var = this.f6168i;
                        if (u4Var == u4Var2) {
                        }
                    }
                }
                return h(this.f6166d);
            }
            while (nanos > 0) {
                Object obj3 = this.f6166d;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j5 = -nanos;
                long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(jConvert);
                boolean z5 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z5 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z5) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z5) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(kk.b.k(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
