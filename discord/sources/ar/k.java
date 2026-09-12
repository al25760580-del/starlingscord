package ar;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public class k extends i0 implements CancellableContinuation, CoroutineStackFrame, a2 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Continuation f2936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CoroutineContext f2937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2934x = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2935y = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle$volatile");

    public k(int i7, Continuation continuation) {
        super(i7);
        this.f2936v = continuation;
        this.f2937w = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f2885d;
    }

    public static Object D(n1 n1Var, Object obj, int i7, Function3 function3) {
        if (obj instanceof r) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (function3 != null || (n1Var instanceof i)) {
            return new q(obj, n1Var instanceof i ? (i) n1Var : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() throws g0 {
        Continuation continuation = this.f2936v;
        Throwable th2 = null;
        fr.g gVar = continuation instanceof fr.g ? (fr.g) continuation : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fr.g.E;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                a5.h hVar = fr.h.f9375b;
                if (obj != hVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, hVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == hVar);
            }
            if (th2 == null) {
                return;
            }
            o();
            m(th2);
        }
    }

    public final void B(Object obj, int i7, Function3 function3) throws g0 {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2935y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof n1)) {
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (l.f2939c.compareAndSet(lVar, 0, 1)) {
                        if (function3 != null) {
                            l(function3, lVar.f2958a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objD = D((n1) obj2, obj, i7, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!x()) {
                        o();
                    }
                    p(i7);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void C(CoroutineDispatcher coroutineDispatcher, Unit unit) {
        Continuation continuation = this.f2936v;
        fr.g gVar = continuation instanceof fr.g ? (fr.g) continuation : null;
        B(unit, (gVar != null ? gVar.f9370v : null) == coroutineDispatcher ? 4 : this.f2927i, null);
    }

    public final a5.h E(Object obj, Function3 function3) {
        a5.h hVar = b0.f2886a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2935y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof n1)) {
                return null;
            }
            Object objD = D((n1) obj2, obj, this.f2927i, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!x()) {
                        o();
                    }
                    return hVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // ar.i0
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2935y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof n1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof r) {
                return;
            }
            if (!(obj instanceof q)) {
                cancellationException2 = cancellationException;
                q qVar = new q(obj, (i) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            q qVar2 = (q) obj;
            if (qVar2.f2955e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            q qVarA = q.a(qVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, qVarA)) {
                    i iVar = qVar2.f2952b;
                    if (iVar != null) {
                        j(iVar, cancellationException);
                    }
                    Function3 function3 = qVar2.f2953c;
                    if (function3 != null) {
                        l(function3, cancellationException, qVar2.f2951a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // ar.a2
    public final void b(fr.u uVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f2934x;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i7));
        w(uVar);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean c() {
        return f2935y.get(this) instanceof n1;
    }

    @Override // ar.i0
    public final Continuation d() {
        return this.f2936v;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final a5.h e(Object obj, Function3 function3) {
        return E(obj, function3);
    }

    @Override // ar.i0
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // ar.i0
    public final Object g(Object obj) {
        return obj instanceof q ? ((q) obj).f2951a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f2936v;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f2937w;
    }

    @Override // ar.i0
    public final Object i() {
        return f2935y.get(this);
    }

    public final void j(i iVar, Throwable th2) {
        try {
            iVar.a(th2);
        } catch (Throwable th3) {
            b0.q(new androidx.datastore.preferences.protobuf.d1("Exception in invokeOnCancellation handler for " + this, th3), this.f2937w);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void k(Object obj, Function3 function3) throws g0 {
        B(obj, this.f2927i, function3);
    }

    public final void l(Function3 function3, Throwable th2, Object obj) {
        CoroutineContext coroutineContext = this.f2937w;
        try {
            function3.invoke(th2, obj, coroutineContext);
        } catch (Throwable th3) {
            b0.q(new androidx.datastore.preferences.protobuf.d1("Exception in resume onCancellation handler for " + this, th3), coroutineContext);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean m(Throwable th2) throws g0 {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2935y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n1)) {
                return false;
            }
            boolean z5 = (obj instanceof i) || (obj instanceof fr.u);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            l lVar = new l(cancellationException, z5);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    n1 n1Var = (n1) obj;
                    if (n1Var instanceof i) {
                        j((i) obj, th2);
                    } else if (n1Var instanceof fr.u) {
                        n((fr.u) obj, th2);
                    }
                    if (!x()) {
                        o();
                    }
                    p(this.f2927i);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void n(fr.u uVar, Throwable th2) {
        CoroutineContext coroutineContext = this.f2937w;
        int i7 = f2934x.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.h(i7, coroutineContext);
        } catch (Throwable th3) {
            b0.q(new androidx.datastore.preferences.protobuf.d1("Exception in invokeOnCancellation handler for " + this, th3), coroutineContext);
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var == null) {
            return;
        }
        m0Var.dispose();
        atomicReferenceFieldUpdater.set(this, m1.f2944d);
    }

    public final void p(int i7) throws g0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f2934x;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i7 == 4;
                Continuation continuation = this.f2936v;
                if (!z5 && (continuation instanceof fr.g)) {
                    boolean z6 = i7 == 1 || i7 == 2;
                    int i12 = this.f2927i;
                    if (z6 == (i12 == 1 || i12 == 2)) {
                        fr.g gVar = (fr.g) continuation;
                        CoroutineDispatcher coroutineDispatcher = gVar.f9370v;
                        CoroutineContext context = gVar.f9371w.getContext();
                        if (fr.h.h(coroutineDispatcher, context)) {
                            fr.h.g(coroutineDispatcher, context, this);
                            return;
                        }
                        t0 t0VarA = s1.a();
                        if (t0VarA.f2965i >= 4294967296L) {
                            t0VarA.q0(this);
                            return;
                        }
                        t0VarA.s0(true);
                        try {
                            b0.v(this, continuation, true);
                            do {
                            } while (t0VarA.u0());
                        } catch (Throwable th2) {
                            try {
                                h(th2);
                            } finally {
                                t0VarA.p0(true);
                            }
                        }
                        return;
                    }
                }
                b0.v(this, continuation, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(i1 i1Var) {
        return i1Var.u();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        Job job;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f2934x;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i10 = i7 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f2935y.get(this);
                if (obj instanceof r) {
                    throw ((r) obj).f2958a;
                }
                int i11 = this.f2927i;
                if ((i11 != 1 && i11 != 2) || (job = (Job) this.f2937w.l(w.f2975e)) == null || job.c()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionU = job.u();
                a(cancellationExceptionU);
                throw cancellationExceptionU;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((m0) E.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return wn.a.f22354d;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new r(thA, false);
        }
        B(obj, this.f2927i, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void s(Object obj) throws g0 {
        p(this.f2927i);
    }

    public final void t() {
        m0 m0VarU = u();
        if (m0VarU == null || (f2935y.get(this) instanceof n1)) {
            return;
        }
        m0VarU.dispose();
        E.set(this, m1.f2944d);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(b0.y(this.f2936v));
        sb2.append("){");
        Object obj = f2935y.get(this);
        if (obj instanceof n1) {
            str = "Active";
        } else {
            str = obj instanceof l ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(b0.o(this));
        return sb2.toString();
    }

    public final m0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job = (Job) this.f2937w.l(w.f2975e);
        if (job == null) {
            return null;
        }
        m0 m0VarR = b0.r(job, new m(this, 0));
        do {
            atomicReferenceFieldUpdater = E;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m0VarR)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m0VarR;
    }

    public final void v(Function1 function1) {
        w(new h(1, function1));
    }

    public final void w(n1 n1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2935y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof i) || (obj instanceof fr.u)) {
                y(n1Var, obj);
                throw null;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!r.f2957b.compareAndSet(rVar, 0, 1)) {
                    y(n1Var, obj);
                    throw null;
                }
                if (obj instanceof l) {
                    Throwable th2 = rVar.f2958a;
                    if (n1Var instanceof i) {
                        j((i) n1Var, th2);
                        return;
                    } else {
                        Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((fr.u) n1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof q)) {
                if (n1Var instanceof fr.u) {
                    return;
                }
                Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                q qVar = new q(obj, (i) n1Var, (Function3) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            q qVar2 = (q) obj;
            if (qVar2.f2952b != null) {
                y(n1Var, obj);
                throw null;
            }
            if (n1Var instanceof fr.u) {
                return;
            }
            Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            i iVar = (i) n1Var;
            Throwable th3 = qVar2.f2955e;
            if (th3 != null) {
                j(iVar, th3);
                return;
            }
            q qVarA = q.a(qVar2, iVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f2927i != 2) {
            return false;
        }
        Continuation continuation = this.f2936v;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        fr.g gVar = (fr.g) continuation;
        gVar.getClass();
        return fr.g.E.get(gVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
