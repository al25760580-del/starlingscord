package ar;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.h f2886a = new a5.h("RESUME_TOKEN", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f2887b = new a5.h("REMOVED_TASK", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.h f2888c = new a5.h("CLOSED_EMPTY", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5.h f2889d = new a5.h("COMPLETING_ALREADY", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a5.h f2890e = new a5.h("COMPLETING_WAITING_CHILDREN", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a5.h f2891f = new a5.h("COMPLETING_RETRY", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5.h f2892g = new a5.h("TOO_LATE_TO_CANCEL", 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a5.h f2893h = new a5.h("SEALED", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o0 f2894i = new o0(false);
    public static final o0 j = new o0(true);

    public static final Object A(CoroutineContext coroutineContext, Function2 function2, Continuation frame) throws Throwable {
        Object objZ;
        CoroutineContext context = frame.getContext();
        CoroutineContext coroutineContextN = !((Boolean) coroutineContext.Y(Boolean.FALSE, new s(0))).booleanValue() ? context.n(coroutineContext) : t.a(context, coroutineContext, false);
        l(coroutineContextN);
        if (coroutineContextN == context) {
            fr.t tVar = new fr.t(frame, coroutineContextN);
            objZ = a.a.A(tVar, true, tVar, function2);
        } else {
            vn.a aVar = kotlin.coroutines.d.k;
            if (Intrinsics.areEqual(coroutineContextN.l(aVar), context.l(aVar))) {
                y1 y1Var = new y1(frame, coroutineContextN);
                CoroutineContext coroutineContext2 = y1Var.f2883i;
                Object objC = fr.x.c(coroutineContext2, null);
                try {
                    Object objA = a.a.A(y1Var, true, y1Var, function2);
                    fr.x.a(coroutineContext2, objC);
                    objZ = objA;
                } catch (Throwable th2) {
                    fr.x.a(coroutineContext2, objC);
                    throw th2;
                }
            } else {
                h0 h0Var = new h0(frame, coroutineContextN);
                zs.a.X(function2, h0Var, h0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.f2921w;
                while (true) {
                    int i7 = atomicIntegerFieldUpdater.get(h0Var);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objZ = z(i1.f2928d.get(h0Var));
                        if (!(objZ instanceof r)) {
                            break;
                        }
                        throw ((r) objZ).f2958a;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(h0Var, 0, 1)) {
                        objZ = wn.a.f22354d;
                        break;
                    }
                }
            }
        }
        if (objZ == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object B(xn.c frame) {
        Object obj;
        CoroutineContext context = frame.getContext();
        l(context);
        Continuation continuationB = wn.f.b(frame);
        fr.g gVar = continuationB instanceof fr.g ? (fr.g) continuationB : null;
        if (gVar == null) {
            obj = Unit.f14616a;
        } else {
            CoroutineDispatcher coroutineDispatcher = gVar.f9370v;
            if (fr.h.h(coroutineDispatcher, context)) {
                gVar.f9372x = Unit.f14616a;
                gVar.f2927i = 1;
                coroutineDispatcher.m0(context, gVar);
            } else {
                b2 b2Var = new b2(b2.f2896i);
                CoroutineContext coroutineContextN = context.n(b2Var);
                Unit unit = Unit.f14616a;
                gVar.f9372x = unit;
                gVar.f2927i = 1;
                coroutineDispatcher.m0(coroutineContextN, gVar);
                if (b2Var.f2897e) {
                    t0 t0VarA = s1.a();
                    ArrayDeque arrayDeque = t0VarA.f2967w;
                    if (arrayDeque != null ? arrayDeque.isEmpty() : true) {
                        obj = Unit.f14616a;
                    } else {
                        if (t0VarA.f2965i >= 4294967296L) {
                            gVar.f9372x = unit;
                            gVar.f2927i = 1;
                            t0VarA.q0(gVar);
                            obj = wn.a.f22354d;
                        } else {
                            t0VarA.s0(true);
                            try {
                                gVar.run();
                                do {
                                } while (t0VarA.u0());
                            } catch (Throwable th2) {
                                try {
                                    gVar.h(th2);
                                } catch (Throwable th3) {
                                    t0VarA.p0(true);
                                    throw th3;
                                }
                            }
                            t0VarA.p0(true);
                            obj = Unit.f14616a;
                        }
                    }
                }
            }
            obj = wn.a.f22354d;
        }
        wn.a aVar = wn.a.f22354d;
        if (obj == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj == aVar ? obj : Unit.f14616a;
    }

    public static p a() {
        p pVar = new p(true);
        pVar.P(null);
        return pVar;
    }

    public static final fr.d b(CoroutineContext coroutineContext) {
        if (coroutineContext.l(w.f2975e) == null) {
            coroutineContext = coroutineContext.n(new b1());
        }
        return new fr.d(coroutineContext);
    }

    public static final fr.d c() {
        q1 q1Var = new q1();
        hr.e eVar = k0.f2938a;
        return new fr.d(kotlin.coroutines.e.c(q1Var, fr.q.f9394a));
    }

    public static d0 d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i7) {
        if ((i7 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f14681d;
        }
        z zVar = z.f2985d;
        CoroutineContext coroutineContextB = t.b(coroutineScope, coroutineContext);
        z zVar2 = z.f2985d;
        d0 d0Var = new d0(coroutineContextB, true);
        d0Var.n0(zVar, d0Var, function2);
        return d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void e(xn.c cVar) {
        f0 frame;
        if (cVar instanceof f0) {
            frame = (f0) cVar;
            int i7 = frame.f2910e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f2910e = i7 - Integer.MIN_VALUE;
            } else {
                frame = new f0(cVar);
            }
        } else {
            frame = new f0(cVar);
        }
        Object obj = frame.f2909d;
        wn.a aVar = wn.a.f22354d;
        int i10 = frame.f2910e;
        if (i10 == 0) {
            ib.a.L(obj);
            frame.f2910e = 1;
            k kVar = new k(1, wn.f.b(frame));
            kVar.t();
            Object objR = kVar.r();
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR == aVar) {
                return;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        throw new rn.h();
    }

    public static final void f(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().l(w.f2975e);
        if (job != null) {
            job.f(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static final Object g(Job job, Continuation continuation) {
        job.f(null);
        Object objA0 = job.a0((xn.c) continuation);
        return objA0 == wn.a.f22354d ? objA0 : Unit.f14616a;
    }

    public static final void h(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence sequenceQ;
        Job job = (Job) coroutineContext.l(w.f2975e);
        if (job == null || (sequenceQ = job.q()) == null) {
            return;
        }
        Iterator it = sequenceQ.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).f(cancellationException);
        }
    }

    public static final Object i(Function2 function2, Continuation frame) throws Throwable {
        fr.t tVar = new fr.t(frame, frame.getContext());
        Object objA = a.a.A(tVar, true, tVar, function2);
        if (objA == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    public static final Object j(long j5, Continuation frame) {
        if (j5 <= 0) {
            return Unit.f14616a;
        }
        k kVar = new k(1, wn.f.b(frame));
        kVar.t();
        if (j5 < LongCompanionObject.MAX_VALUE) {
            n(kVar.f2937w).e0(j5, kVar);
        }
        Object objR = kVar.r();
        wn.a aVar = wn.a.f22354d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.f14616a;
    }

    public static final Object k(long j5, Continuation continuation) {
        yq.a aVar = Duration.f14747e;
        long jD = 0;
        boolean z5 = j5 > 0;
        if (z5) {
            jD = Duration.d(Duration.i(j5, yq.c.h(999999L, yq.d.NANOSECONDS)));
        } else if (z5) {
            throw new rn.n();
        }
        Object objJ = j(jD, continuation);
        return objJ == wn.a.f22354d ? objJ : Unit.f14616a;
    }

    public static final void l(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.l(w.f2975e);
        if (job != null && !job.c()) {
            throw job.u();
        }
    }

    public static final CoroutineDispatcher m(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        j0 j0Var = executor instanceof j0 ? (j0) executor : null;
        return (j0Var == null || (coroutineDispatcher = j0Var.f2932d) == null) ? new u0(executor) : coroutineDispatcher;
    }

    public static final e0 n(CoroutineContext coroutineContext) {
        CoroutineContext.Element elementL = coroutineContext.l(kotlin.coroutines.d.k);
        e0 e0Var = elementL instanceof e0 ? (e0) elementL : null;
        return e0Var == null ? c0.f2901a : e0Var;
    }

    public static final String o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final k p(Continuation continuation) {
        k kVar;
        k kVar2;
        if (!(continuation instanceof fr.g)) {
            return new k(1, continuation);
        }
        fr.g gVar = (fr.g) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fr.g.E;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            kVar = null;
            a5.h hVar = fr.h.f9375b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, hVar);
                kVar2 = null;
                break;
            }
            if (obj instanceof k) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, hVar)) {
                        kVar2 = (k) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == obj);
            } else if (obj != hVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (kVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f2935y;
            Object obj2 = atomicReferenceFieldUpdater2.get(kVar2);
            if (!(obj2 instanceof q) || ((q) obj2).f2954d == null) {
                k.f2934x.set(kVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kVar2, b.f2885d);
                kVar = kVar2;
            } else {
                kVar2.o();
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new k(2, continuation);
    }

    public static final void q(Throwable th2, CoroutineContext coroutineContext) {
        if (th2 instanceof g0) {
            th2 = ((g0) th2).f2914d;
        }
        try {
            x xVar = (x) coroutineContext.l(w.f2974d);
            if (xVar != null) {
                xVar.j0(th2, coroutineContext);
            } else {
                fr.h.c(th2, coroutineContext);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                rn.f.a(runtimeException, th2);
                th2 = runtimeException;
            }
            fr.h.c(th2, coroutineContext);
        }
    }

    public static m0 r(Job job, d1 d1Var) {
        if (job instanceof i1) {
            return ((i1) job).Q(true, d1Var);
        }
        return job.c0(d1Var.j(), true, new c1(1, d1Var, d1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean s(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().l(w.f2975e);
        if (job != null) {
            return job.c();
        }
        return true;
    }

    public static p1 t(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i7) {
        z zVar = z.f2988v;
        if ((i7 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f14681d;
        }
        if ((i7 & 2) != 0) {
            zVar = z.f2985d;
        }
        CoroutineContext coroutineContextB = t.b(coroutineScope, coroutineContext);
        p1 j1Var = zVar == z.f2986e ? new j1(coroutineContextB, function2) : new p1(coroutineContextB, true);
        j1Var.n0(zVar, j1Var, function2);
        return j1Var;
    }

    public static final Object u(Object obj) {
        if (obj instanceof r) {
            rn.q qVar = Result.f14614e;
            return ib.a.o(((r) obj).f2958a);
        }
        rn.q qVar2 = Result.f14614e;
        return obj;
    }

    public static final void v(k kVar, Continuation continuation, boolean z5) {
        Object objG;
        Object obj = k.f2935y.get(kVar);
        Throwable thF = kVar.f(obj);
        if (thF != null) {
            rn.q qVar = Result.f14614e;
            objG = ib.a.o(thF);
        } else {
            rn.q qVar2 = Result.f14614e;
            objG = kVar.g(obj);
        }
        if (!z5) {
            continuation.resumeWith(objG);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        fr.g gVar = (fr.g) continuation;
        xn.c cVar = gVar.f9371w;
        Object obj2 = gVar.f9373y;
        CoroutineContext context = cVar.getContext();
        Object objC = fr.x.c(context, obj2);
        y1 y1VarC = objC != fr.x.f9401a ? t.c(cVar, context, objC) : null;
        try {
            gVar.f9371w.resumeWith(objG);
            Unit unit = Unit.f14616a;
        } finally {
            if (y1VarC == null || y1VarC.p0()) {
                fr.x.a(context, objC);
            }
        }
    }

    public static final Object w(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        t0 t0VarA;
        CoroutineContext coroutineContextA;
        long jT0;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.k;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.l(fVar);
        if (dVar == null) {
            t0VarA = s1.a();
            coroutineContextA = t.a(kotlin.coroutines.g.f14681d, coroutineContext.n(t0VarA), true);
            hr.e eVar = k0.f2938a;
            if (coroutineContextA != eVar && coroutineContextA.l(fVar) == null) {
                coroutineContextA = coroutineContextA.n(eVar);
            }
        } else {
            if (dVar instanceof t0) {
            }
            t0VarA = (t0) s1.f2963a.get();
            coroutineContextA = t.a(kotlin.coroutines.g.f14681d, coroutineContext, true);
            hr.e eVar2 = k0.f2938a;
            if (coroutineContextA != eVar2 && coroutineContextA.l(fVar) == null) {
                coroutineContextA = coroutineContextA.n(eVar2);
            }
        }
        f fVar2 = new f(coroutineContextA, threadCurrentThread, t0VarA);
        fVar2.n0(z.f2985d, fVar2, function2);
        t0 t0Var = fVar2.f2908w;
        if (t0Var != null) {
            int i7 = t0.f2964x;
            t0Var.s0(false);
        }
        while (true) {
            if (t0Var != null) {
                try {
                    jT0 = t0Var.t0();
                } catch (Throwable th2) {
                    if (t0Var != null) {
                        int i10 = t0.f2964x;
                        t0Var.p0(false);
                    }
                    throw th2;
                }
            } else {
                jT0 = LongCompanionObject.MAX_VALUE;
            }
            if (fVar2.isCompleted()) {
                break;
            }
            LockSupport.parkNanos(fVar2, jT0);
            if (Thread.interrupted()) {
                fVar2.x(new InterruptedException());
            }
        }
        if (t0Var != null) {
            int i11 = t0.f2964x;
            t0Var.p0(false);
        }
        Object objZ = z(i1.f2928d.get(fVar2));
        r rVar = objZ instanceof r ? (r) objZ : null;
        if (rVar == null) {
            return objZ;
        }
        throw rVar.f2958a;
    }

    public static final String y(Continuation continuation) {
        Object objO;
        if (continuation instanceof fr.g) {
            return ((fr.g) continuation).toString();
        }
        try {
            rn.q qVar = Result.f14614e;
            objO = continuation + '@' + o(continuation);
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (Result.a(objO) != null) {
            objO = continuation.getClass().getName() + '@' + o(continuation);
        }
        return (String) objO;
    }

    public static final Object z(Object obj) {
        x0 x0Var;
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        return (y0Var == null || (x0Var = y0Var.f2983a) == null) ? obj : x0Var;
    }
}
