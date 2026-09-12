package hi;

import com.discord.age_assurance.DigitalCredentialModule;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
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
public abstract class m extends ii.a implements ListenableFuture {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f10789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f10790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final gn.h f10791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f10792y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f10793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile c f10794e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile l f10795i;

    static {
        boolean z5;
        Throwable th2;
        gn.h eVar;
        try {
            z5 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z5 = false;
        }
        f10789v = z5;
        f10790w = Logger.getLogger(m.class.getName());
        Throwable th3 = null;
        try {
            eVar = new k();
            th2 = null;
        } catch (Throwable th4) {
            th2 = th4;
            try {
                eVar = new d(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m.class, l.class, "i"), AtomicReferenceFieldUpdater.newUpdater(m.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "d"));
            } catch (Throwable th5) {
                th3 = th5;
                eVar = new e();
            }
        }
        f10791x = eVar;
        if (th3 != null) {
            Logger logger = f10790w;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th2);
            logger.log(level, "SafeAtomicHelper is broken!", th3);
        }
        f10792y = new Object();
    }

    public static void e(m mVar) {
        for (l lVarY = f10791x.y(mVar); lVarY != null; lVarY = lVarY.f10788b) {
            Thread thread = lVarY.f10787a;
            if (thread != null) {
                lVarY.f10787a = null;
                LockSupport.unpark(thread);
            }
        }
        c cVarX = f10791x.x(mVar);
        c cVar = null;
        while (cVarX != null) {
            c cVar2 = cVarX.f10774c;
            cVarX.f10774c = cVar;
            cVar = cVarX;
            cVarX = cVar2;
        }
        while (cVar != null) {
            c cVar3 = cVar.f10774c;
            Runnable runnable = cVar.f10772a;
            Objects.requireNonNull(runnable);
            Executor executor = cVar.f10773b;
            Objects.requireNonNull(executor);
            f(runnable, executor);
            cVar = cVar3;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 57);
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            f10790w.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f10769a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f10770a);
        }
        if (obj == f10792y) {
            return null;
        }
        return obj;
    }

    public static Object h(m mVar) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = mVar.get();
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
    public void a(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2 = c.f10771d;
        ls.l.f(executor, "Executor was null.");
        if (!isDone() && (cVar = this.f10794e) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f10774c = cVar;
                if (f10791x.k(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f10794e;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            d(sb2, objH);
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
    public boolean cancel(boolean z5) {
        a aVar;
        Object obj = this.f10793d;
        if (obj != null) {
            return false;
        }
        if (f10789v) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z5);
        } else {
            aVar = z5 ? a.f10767b : a.f10768c;
            Objects.requireNonNull(aVar);
        }
        if (!f10791x.l(this, obj, aVar)) {
            return false;
        }
        e(this);
        return true;
    }

    public final void d(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j5;
        l lVar = l.f10786c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10793d;
        if (obj != null) {
            return g(obj);
        }
        long j7 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar2 = this.f10795i;
            if (lVar2 != lVar) {
                l lVar3 = new l();
                while (true) {
                    gn.h hVar = f10791x;
                    hVar.P(lVar3, lVar2);
                    if (hVar.m(this, lVar2, lVar3)) {
                        j5 = j7;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(lVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10793d;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(lVar3);
                        break;
                    }
                    long j10 = j7;
                    lVar2 = this.f10795i;
                    if (lVar2 != lVar) {
                        j7 = j10;
                    }
                }
            }
            Object obj3 = this.f10793d;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        j5 = 0;
        while (nanos > j5) {
            Object obj4 = this.f10793d;
            if (obj4 != null) {
                return g(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb2.append("Waited ");
        sb2.append(j);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < j5) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z5 = jConvert == j5 || nanos2 > 1000;
            if (jConvert > j5) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + strValueOf.length() + 21);
                sb3.append(strValueOf);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z5) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z5) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 33);
                sb4.append(strValueOf2);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + String.valueOf(string3).length() + 5);
        sb5.append(string3);
        sb5.append(" for ");
        sb5.append(string);
        throw new TimeoutException(sb5.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public boolean isCancelled() {
        return this.f10793d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f10793d != null;
    }

    public final void j(l lVar) {
        lVar.f10787a = null;
        while (true) {
            l lVar2 = this.f10795i;
            if (lVar2 == l.f10786c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f10788b;
                if (lVar2.f10787a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f10788b = lVar4;
                    if (lVar3.f10787a == null) {
                    }
                } else if (!f10791x.m(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append(DigitalCredentialModule.CODE_CANCELLED);
        } else if (isDone()) {
            c(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                string = i();
                int i7 = di.f.f7635a;
                if (string == null || string.isEmpty()) {
                    string = null;
                }
            } catch (RuntimeException | StackOverflowError e10) {
                String strValueOf = String.valueOf(e10.getClass());
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(strValueOf);
                string = sb3.toString();
            }
            if (string != null) {
                sb2.append(", info=[");
                sb2.append(string);
                sb2.append("]");
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                c(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        l lVar = l.f10786c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f10793d;
            if (obj2 != null) {
                return g(obj2);
            }
            l lVar2 = this.f10795i;
            if (lVar2 != lVar) {
                l lVar3 = new l();
                do {
                    gn.h hVar = f10791x;
                    hVar.P(lVar3, lVar2);
                    if (hVar.m(this, lVar2, lVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10793d;
                            } else {
                                j(lVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    lVar2 = this.f10795i;
                } while (lVar2 != lVar);
            }
            Object obj3 = this.f10793d;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
