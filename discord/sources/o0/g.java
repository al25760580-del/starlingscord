package o0;

import com.discord.age_assurance.DigitalCredentialModule;
import com.google.common.util.concurrent.ListenableFuture;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements ListenableFuture {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f17092v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f17093w = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ib.a f17094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f17095y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f17096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile c f17097e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile f f17098i;

    static {
        ib.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "i"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "d"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e();
        }
        f17094x = eVar;
        if (th != null) {
            f17093w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f17095y = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f17098i;
        } while (!f17094x.h(gVar, fVar, f.f17089c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f17090a;
            if (thread != null) {
                fVar.f17090a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f17091b;
        }
        gVar.d();
        do {
            cVar2 = gVar.f17097e;
        } while (!f17094x.f(gVar, cVar2, c.f17080d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f17083c;
            cVar.f17083c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f17083c;
            f(cVar3.f17081a, cVar3.f17082b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f17093w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f17078b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f17079a);
        }
        if (obj == f17095y) {
            return null;
        }
        return obj;
    }

    public static Object h(g gVar) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f17097e;
        c cVar2 = c.f17080d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f17083c = cVar;
                if (f17094x.f(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f17097e;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append(DigitalCredentialModule.CODE_CANCELLED);
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        a aVar;
        Object obj = this.f17096d;
        if (obj == null) {
            if (f17092v) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z5);
            } else {
                aVar = z5 ? a.f17075c : a.f17076d;
            }
            if (f17094x.g(this, obj, aVar)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f17089c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f17096d;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f17098i;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                while (true) {
                    ib.a aVar = f17094x;
                    aVar.C(fVar3, fVar2);
                    if (aVar.h(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17096d;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(fVar3);
                        break;
                    }
                    fVar2 = this.f17098i;
                    if (fVar2 == fVar) {
                    }
                }
            }
            return g(this.f17096d);
        }
        while (nanos > 0) {
            Object obj3 = this.f17096d;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM = kk.b.m(j, "Waited ", " ");
        sbM.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM.toString();
        if (nanos + 1000 < 0) {
            String strJ = kk.b.j(string3, " (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z5 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strJ2 = strJ + jConvert + " " + lowerCase;
                if (z5) {
                    strJ2 = kk.b.j(strJ2, ",");
                }
                strJ = kk.b.j(strJ2, " ");
            }
            if (z5) {
                strJ = strJ + nanos2 + " nanoseconds ";
            }
            string3 = kk.b.j(strJ, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(kk.b.j(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(kk.b.k(string3, " for ", string));
    }

    public final void i(f fVar) {
        fVar.f17090a = null;
        while (true) {
            f fVar2 = this.f17098i;
            if (fVar2 == f.f17089c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f17091b;
                if (fVar2.f17090a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f17091b = fVar4;
                    if (fVar3.f17090a == null) {
                    }
                } else if (!f17094x.h(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17096d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17096d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f17096d instanceof a) {
            sb2.append(DigitalCredentialModule.CODE_CANCELLED);
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f17089c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f17096d;
            if (obj2 != null) {
                return g(obj2);
            }
            f fVar2 = this.f17098i;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    ib.a aVar = f17094x;
                    aVar.C(fVar3, fVar2);
                    if (aVar.h(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f17096d;
                            } else {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    fVar2 = this.f17098i;
                } while (fVar2 != fVar);
            }
            return g(this.f17096d);
        }
        throw new InterruptedException();
    }
}
