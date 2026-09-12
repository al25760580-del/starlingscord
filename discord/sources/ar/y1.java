package ar;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends fr.t {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ThreadLocal f2984w;

    /* JADX WARN: Illegal instructions before constructor call */
    public y1(Continuation continuation, CoroutineContext coroutineContext) {
        z1 z1Var = z1.f2992d;
        super(continuation, coroutineContext.l(z1Var) == null ? coroutineContext.n(z1Var) : coroutineContext);
        this.f2984w = new ThreadLocal();
        if (continuation.getContext().l(kotlin.coroutines.d.k) instanceof CoroutineDispatcher) {
            return;
        }
        Object objC = fr.x.c(coroutineContext, null);
        fr.x.a(coroutineContext, objC);
        r0(coroutineContext, objC);
    }

    @Override // fr.t
    public final void o0() {
        q0();
    }

    public final boolean p0() {
        boolean z5 = this.threadLocalIsSet && this.f2984w.get() == null;
        this.f2984w.remove();
        return !z5;
    }

    public final void q0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f2984w.get();
            if (pair != null) {
                fr.x.a((CoroutineContext) pair.f14612d, pair.f14613e);
            }
            this.f2984w.remove();
        }
    }

    public final void r0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f2984w.set(new Pair(coroutineContext, obj));
    }

    @Override // fr.t, ar.i1
    public final void v(Object obj) {
        q0();
        Object objU = b0.u(obj);
        Continuation continuation = this.f9396v;
        CoroutineContext context = continuation.getContext();
        Object objC = fr.x.c(context, null);
        y1 y1VarC = objC != fr.x.f9401a ? t.c(continuation, context, objC) : null;
        try {
            continuation.resumeWith(objU);
            Unit unit = Unit.f14616a;
        } finally {
            if (y1VarC == null || y1VarC.p0()) {
                fr.x.a(context, objC);
            }
        }
    }
}
