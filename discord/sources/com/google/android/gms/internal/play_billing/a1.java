package com.google.android.gms.internal.play_billing;

import com.discord.age_assurance.DigitalCredentialModule;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends p0 implements k0 {
    public x0 E;
    public ScheduledFuture F;

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof f0) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((f0) obj).f6005b);
            throw cancellationException;
        }
        if (obj instanceof i0) {
            throw new ExecutionException(((i0) obj).f6020a);
        }
        if (obj == p0.f6084v) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof g0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(x0 x0Var) {
        Object obj;
        Throwable thC;
        if (x0Var instanceof k0) {
            Object f0Var = ((a1) x0Var).f6088d;
            if (f0Var instanceof f0) {
                f0 f0Var2 = (f0) f0Var;
                if (f0Var2.f6004a) {
                    Throwable th2 = f0Var2.f6005b;
                    f0Var = th2 != null ? new f0(th2, false) : f0.f6003d;
                }
            }
            Objects.requireNonNull(f0Var);
            return f0Var;
        }
        if ((x0Var instanceof b1) && (thC = ((b1) x0Var).c()) != null) {
            return new i0(thC);
        }
        boolean zIsCancelled = x0Var.isCancelled();
        boolean z5 = true;
        if ((!p0.f6086x) && zIsCancelled) {
            f0 f0Var3 = f0.f6003d;
            Objects.requireNonNull(f0Var3);
            return f0Var3;
        }
        boolean z6 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = x0Var.get();
                        break;
                    } catch (Error e10) {
                        e = e10;
                        return new i0(e);
                    }
                } catch (InterruptedException unused) {
                    z6 = z5;
                } catch (Throwable th3) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e11) {
                e = e11;
                return new i0(e);
            } catch (CancellationException e12) {
                return !zIsCancelled ? new i0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(x0Var)), e12)) : new f0(e12, false);
            } catch (ExecutionException e13) {
                return zIsCancelled ? new f0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(x0Var)), e13), false) : new i0(e13.getCause());
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new f0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(x0Var))), false);
        }
        return obj == null ? p0.f6084v : obj;
    }

    public static void j(a1 a1Var) {
        j0 j0Var = null;
        while (true) {
            a1Var.getClass();
            for (o0 o0VarO = p0.f6087y.o(a1Var); o0VarO != null; o0VarO = o0VarO.f6080b) {
                Thread thread = o0VarO.f6079a;
                if (thread != null) {
                    o0VarO.f6079a = null;
                    LockSupport.unpark(thread);
                }
            }
            x0 x0Var = a1Var.E;
            if ((a1Var.f6088d instanceof f0) & (x0Var != null)) {
                Object obj = a1Var.f6088d;
                x0Var.cancel((obj instanceof f0) && ((f0) obj).f6004a);
            }
            ScheduledFuture scheduledFuture = a1Var.F;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            a1Var.E = null;
            a1Var.F = null;
            j0 j0Var2 = j0Var;
            j0 j0VarE = p0.f6087y.e(a1Var);
            j0 j0Var3 = j0Var2;
            while (j0VarE != null) {
                j0 j0Var4 = j0VarE.f6026c;
                j0VarE.f6026c = j0Var3;
                j0Var3 = j0VarE;
                j0VarE = j0Var4;
            }
            while (j0Var3 != null) {
                Runnable runnable = j0Var3.f6024a;
                j0 j0Var5 = j0Var3.f6026c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof g0) {
                    g0 g0Var = (g0) runnable;
                    a1Var = g0Var.f6013d;
                    if (a1Var.f6088d != g0Var) {
                        continue;
                    } else if (p0.f6087y.E(a1Var, g0Var, h(g0Var.f6014e))) {
                        j0Var = j0Var5;
                    }
                } else {
                    Executor executor = j0Var3.f6025b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                j0Var3 = j0Var5;
            }
            return;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            p0.f6085w.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a3.e.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final void b(Runnable runnable, Executor executor) {
        j0 j0Var;
        j0 j0Var2 = j0.f6023d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (j0Var = this.f6089e) != j0Var2) {
            j0 j0Var3 = new j0(runnable, executor);
            do {
                j0Var3.f6026c = j0Var;
                if (p0.f6087y.A(this, j0Var, j0Var3)) {
                    return;
                } else {
                    j0Var = this.f6089e;
                }
            } while (j0Var != j0Var2);
        }
        k(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.b1
    public final Throwable c() {
        if (!(this instanceof k0)) {
            return null;
        }
        Object obj = this.f6088d;
        if (obj instanceof i0) {
            return ((i0) obj).f6020a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        f0 f0Var;
        Object obj = this.f6088d;
        if (!(obj instanceof g0) && !(obj == null)) {
            return false;
        }
        if (p0.f6086x) {
            f0Var = new f0(new CancellationException("Future.cancel() was called."), z5);
        } else {
            f0Var = z5 ? f0.f6002c : f0.f6003d;
            Objects.requireNonNull(f0Var);
        }
        a1 a1Var = this;
        boolean z6 = false;
        while (true) {
            if (p0.f6087y.E(a1Var, obj, f0Var)) {
                j(a1Var);
                if (obj instanceof g0) {
                    x0 x0Var = ((g0) obj).f6014e;
                    if (x0Var instanceof k0) {
                        a1Var = (a1) x0Var;
                        obj = a1Var.f6088d;
                        if ((obj == null) | (obj instanceof g0)) {
                            z6 = true;
                        }
                    } else {
                        x0Var.cancel(z5);
                    }
                }
                return true;
            }
            obj = a1Var.f6088d;
            if (g(obj)) {
                return z6;
            }
        }
    }

    public final String f() {
        x0 x0Var = this.E;
        ScheduledFuture scheduledFuture = this.F;
        if (x0Var == null) {
            return null;
        }
        String strE = s0.g.e("inputFuture=[", x0Var.toString(), "]");
        if (scheduledFuture == null) {
            return strE;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strE;
        }
        return strE + ", remaining delay=[" + delay + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        o0 o0Var = o0.f6078c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6088d;
        if ((obj2 != null) && g(obj2)) {
            return e(obj2);
        }
        o0 o0Var2 = this.f6090i;
        if (o0Var2 != o0Var) {
            o0 o0Var3 = new o0();
            do {
                z1 z1Var = p0.f6087y;
                z1Var.s(o0Var3, o0Var2);
                if (z1Var.G(this, o0Var2, o0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(o0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f6088d;
                    } while (!((obj != null) & g(obj)));
                    return e(obj);
                }
                o0Var2 = this.f6090i;
            } while (o0Var2 != o0Var);
        }
        Object obj3 = this.f6088d;
        Objects.requireNonNull(obj3);
        return e(obj3);
    }

    public final void i(StringBuilder sb2) {
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
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append("]");
                return;
            } catch (Exception e11) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e11.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6088d instanceof f0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f6088d;
        return (obj != null) & g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f6088d instanceof f0) {
            sb2.append(DigitalCredentialModule.CODE_CANCELLED);
        } else if (isDone()) {
            i(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f6088d;
            if (obj instanceof g0) {
                sb2.append(", setFuture=[");
                x0 x0Var = ((g0) obj).f6014e;
                try {
                    if (x0Var == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(x0Var);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                i(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j5;
        o0 o0Var = o0.f6078c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f6088d;
            if ((obj != null) & g(obj)) {
                return e(obj);
            }
            long j7 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                o0 o0Var2 = this.f6090i;
                if (o0Var2 != o0Var) {
                    o0 o0Var3 = new o0();
                    while (true) {
                        z1 z1Var = p0.f6087y;
                        z1Var.s(o0Var3, o0Var2);
                        if (z1Var.G(this, o0Var2, o0Var3)) {
                            j5 = j7;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6088d;
                                    if ((obj2 != null) & g(obj2)) {
                                        return e(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    d(o0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            d(o0Var3);
                            break;
                        }
                        long j10 = j7;
                        o0Var2 = this.f6090i;
                        if (o0Var2 != o0Var) {
                            j7 = j10;
                        }
                    }
                }
                Object obj3 = this.f6088d;
                Objects.requireNonNull(obj3);
                return e(obj3);
            }
            j5 = 0;
            while (nanos > j5) {
                Object obj4 = this.f6088d;
                if ((obj4 != null) & g(obj4)) {
                    return e(obj4);
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
            if (nanos + 1000 < j5) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                boolean z5 = jConvert == j5 || nanos2 > 1000;
                if (jConvert > j5) {
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
