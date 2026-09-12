package g4;

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
public abstract class h implements ListenableFuture {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f9486v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f9487w = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ls.d f9488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f9489y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f9490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile c f9491e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile g f9492i;

    static {
        ls.d fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "d"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f(7);
        }
        f9488x = fVar;
        if (th != null) {
            f9487w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9489y = new Object();
    }

    public static void d(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f9492i;
            if (f9488x.i(hVar, gVar, g.f9483c)) {
                while (gVar != null) {
                    Thread thread = gVar.f9484a;
                    if (thread != null) {
                        gVar.f9484a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f9485b;
                }
                do {
                    cVar = hVar.f9491e;
                } while (!f9488x.g(hVar, cVar, c.f9472d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f9475c;
                    cVar3.f9475c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f9475c;
                    Runnable runnable = cVar2.f9473a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f9481d;
                        if (hVar.f9490d == eVar) {
                            if (f9488x.h(hVar, eVar, g(eVar.f9482e))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, cVar2.f9474b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f9487w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f9469b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f9471a);
        }
        if (obj == f9489y) {
            return null;
        }
        return obj;
    }

    public static Object g(ListenableFuture listenableFuture) {
        Object obj;
        if (listenableFuture instanceof h) {
            Object obj2 = ((h) listenableFuture).f9490d;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar = (a) obj2;
            if (aVar.f9468a) {
                return aVar.f9469b != null ? new a(aVar.f9469b, false) : a.f9467d;
            }
            return obj2;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z5 = true;
        if ((!f9486v) && zIsCancelled) {
            return a.f9467d;
        }
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = z5;
                } catch (Throwable th2) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException e10) {
                if (zIsCancelled) {
                    return new a(e10, false);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e10));
            } catch (ExecutionException e11) {
                return new b(e11.getCause());
            } catch (Throwable th3) {
                return new b(th3);
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f9489y : obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f9491e;
        c cVar2 = c.f9472d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f9475c = cVar;
                if (f9488x.g(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f9491e;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
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
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        a aVar;
        Object obj = this.f9490d;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (f9486v) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z5);
        } else {
            aVar = z5 ? a.f9466c : a.f9467d;
        }
        h hVar = this;
        boolean z6 = false;
        while (true) {
            if (f9488x.h(hVar, obj, aVar)) {
                d(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                ListenableFuture listenableFuture = ((e) obj).f9482e;
                if (!(listenableFuture instanceof h)) {
                    listenableFuture.cancel(z5);
                    break;
                }
                hVar = (h) listenableFuture;
                obj = hVar.f9490d;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z6 = true;
            } else {
                obj = hVar.f9490d;
                if (!(obj instanceof e)) {
                    return z6;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z5;
        g gVar = g.f9483c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9490d;
        if ((obj != null) && (!(obj instanceof e))) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f9492i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z5 = true;
                while (true) {
                    ls.d dVar = f9488x;
                    dVar.w(gVar3, gVar2);
                    if (dVar.i(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9490d;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(gVar3);
                        break;
                    }
                    gVar2 = this.f9492i;
                    if (gVar2 == gVar) {
                    }
                }
            }
            return f(this.f9490d);
        }
        z5 = true;
        while (nanos > 0) {
            Object obj3 = this.f9490d;
            if ((obj3 != null ? z5 : false) && (!(obj3 instanceof e))) {
                return f(obj3);
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
            boolean z6 = (jConvert == 0 || nanos2 > 1000) ? z5 : false;
            if (jConvert > 0) {
                String strJ2 = strJ + jConvert + " " + lowerCase;
                if (z6) {
                    strJ2 = kk.b.j(strJ2, ",");
                }
                strJ = kk.b.j(strJ2, " ");
            }
            if (z6) {
                strJ = strJ + nanos2 + " nanoseconds ";
            }
            string3 = kk.b.j(strJ, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(kk.b.j(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(kk.b.k(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f9490d;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((e) obj).f9482e;
            return com.discord.chat.presentation.list.a.k(sb2, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g gVar) {
        gVar.f9484a = null;
        while (true) {
            g gVar2 = this.f9492i;
            if (gVar2 == g.f9483c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f9485b;
                if (gVar2.f9484a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f9485b = gVar4;
                    if (gVar3.f9484a == null) {
                    }
                } else if (!f9488x.i(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9490d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f9490d;
        return (!(obj instanceof e)) & (obj != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f9490d instanceof a) {
            sb2.append(DigitalCredentialModule.CODE_CANCELLED);
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e10) {
                strH = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strH);
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f9483c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9490d;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return f(obj2);
            }
            g gVar2 = this.f9492i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    ls.d dVar = f9488x;
                    dVar.w(gVar3, gVar2);
                    if (dVar.i(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9490d;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return f(obj);
                    }
                    gVar2 = this.f9492i;
                } while (gVar2 != gVar);
            }
            return f(this.f9490d);
        }
        throw new InterruptedException();
    }
}
