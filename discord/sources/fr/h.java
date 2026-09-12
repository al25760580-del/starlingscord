package fr;

import ar.g0;
import ar.s1;
import ar.t0;
import ar.y1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.h f9374a = new a5.h("UNDEFINED", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f9375b = new a5.h("REUSABLE_CLAIMED", 2);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(kk.b.h(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final u b(Object obj) {
        if (obj == b.f9364a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (u) obj;
    }

    public static final void c(Throwable th2, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = e.f9368a.iterator();
        while (it.hasNext()) {
            try {
                ((ar.x) it.next()).j0(th2, coroutineContext);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    rn.f.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            rn.f.a(th2, new f(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean d(Object obj) {
        return obj == b.f9364a;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(Object obj, Continuation continuation) throws g0 {
        if (!(continuation instanceof g)) {
            continuation.resumeWith(obj);
            return;
        }
        g gVar = (g) continuation;
        CoroutineDispatcher coroutineDispatcher = gVar.f9370v;
        xn.c cVar = gVar.f9371w;
        Throwable thA = Result.a(obj);
        Object rVar = thA == null ? obj : new ar.r(thA, false);
        if (h(coroutineDispatcher, cVar.getContext())) {
            gVar.f9372x = rVar;
            gVar.f2927i = 1;
            g(coroutineDispatcher, cVar.getContext(), gVar);
            return;
        }
        t0 t0VarA = s1.a();
        if (t0VarA.f2965i >= 4294967296L) {
            gVar.f9372x = rVar;
            gVar.f2927i = 1;
            t0VarA.q0(gVar);
            return;
        }
        t0VarA.s0(true);
        try {
            Job job = (Job) cVar.getContext().l(ar.w.f2975e);
            if (job == null || job.c()) {
                Object obj2 = gVar.f9373y;
                CoroutineContext context = cVar.getContext();
                Object objC = x.c(context, obj2);
                y1 y1VarC = objC != x.f9401a ? ar.t.c(cVar, context, objC) : null;
                try {
                    cVar.resumeWith(obj);
                    Unit unit = Unit.f14616a;
                    if (y1VarC == null || y1VarC.p0()) {
                        x.a(context, objC);
                    }
                } catch (Throwable th2) {
                    if (y1VarC == null || y1VarC.p0()) {
                        x.a(context, objC);
                    }
                    throw th2;
                }
            } else {
                gVar.resumeWith(ib.a.o(job.u()));
            }
            while (t0VarA.u0()) {
            }
        } catch (Throwable th3) {
            try {
                gVar.h(th3);
            } finally {
                t0VarA.p0(true);
            }
        }
    }

    public static final void g(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) throws g0 {
        try {
            coroutineDispatcher.l0(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new g0(th2, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean h(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) throws g0 {
        try {
            return coroutineDispatcher.n0(coroutineContext);
        } catch (Throwable th2) {
            throw new g0(th2, coroutineDispatcher, coroutineContext);
        }
    }

    public static final long i(long j, long j5, long j7, String str) {
        String property;
        int i7 = w.f9400a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lA0 = StringsKt.a0(property);
        if (lA0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lA0.longValue();
        if (j5 <= jLongValue && jLongValue <= j7) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j7 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i7, int i10, String str) {
        return (int) i(i7, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }
}
