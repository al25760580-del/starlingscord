package fr;

import ar.b0;
import ar.g0;
import ar.i0;
import ar.s1;
import ar.t0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i0 implements CoroutineStackFrame, Continuation {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CoroutineDispatcher f9370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xn.c f9371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f9372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f9373y;

    public g(CoroutineDispatcher coroutineDispatcher, xn.c cVar) {
        super(-1);
        this.f9370v = coroutineDispatcher;
        this.f9371w = cVar;
        this.f9372x = h.f9374a;
        this.f9373y = x.b(cVar.getContext());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.f9371w;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f9371w.getContext();
    }

    @Override // ar.i0
    public final Object i() {
        Object obj = this.f9372x;
        this.f9372x = h.f9374a;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) throws g0 {
        Throwable thA = Result.a(obj);
        Object rVar = thA == null ? obj : new ar.r(thA, false);
        xn.c cVar = this.f9371w;
        CoroutineContext context = cVar.getContext();
        CoroutineDispatcher coroutineDispatcher = this.f9370v;
        if (h.h(coroutineDispatcher, context)) {
            this.f9372x = rVar;
            this.f2927i = 0;
            h.g(coroutineDispatcher, cVar.getContext(), this);
            return;
        }
        t0 t0VarA = s1.a();
        if (t0VarA.f2965i >= 4294967296L) {
            this.f9372x = rVar;
            this.f2927i = 0;
            t0VarA.q0(this);
            return;
        }
        t0VarA.s0(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object objC = x.c(context2, this.f9373y);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.f14616a;
                x.a(context2, objC);
                while (t0VarA.u0()) {
                }
            } catch (Throwable th2) {
                x.a(context2, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                h(th3);
            } finally {
                t0VarA.p0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f9370v + ", " + b0.y(this.f9371w) + ']';
    }

    @Override // ar.i0
    public final Continuation d() {
        return this;
    }
}
