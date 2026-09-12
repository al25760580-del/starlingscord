package ar;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends p1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Continuation f2933v;

    public j1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f2933v = wn.f.a(this, this, function2);
    }

    @Override // ar.i1
    public final void d0() throws Throwable {
        try {
            Continuation continuationB = wn.f.b(this.f2933v);
            rn.q qVar = Result.f14614e;
            fr.h.f(Unit.f14616a, continuationB);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof g0) {
                th = ((g0) th).f2914d;
            }
            rn.q qVar2 = Result.f14614e;
            resumeWith(ib.a.o(th));
            throw th;
        }
    }
}
