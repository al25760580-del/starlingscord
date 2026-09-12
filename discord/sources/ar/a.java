package ar;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends i1 implements Continuation, CoroutineScope {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineContext f2883i;

    public a(CoroutineContext coroutineContext, boolean z5) {
        super(z5);
        P((Job) coroutineContext.l(w.f2975e));
        this.f2883i = coroutineContext.n(this);
    }

    @Override // ar.i1
    public final String D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // ar.i1
    public final void N(androidx.datastore.preferences.protobuf.d1 d1Var) {
        b0.q(d1Var, this.f2883i);
    }

    @Override // ar.i1
    public final void b0(Object obj) {
        if (!(obj instanceof r)) {
            m0(obj);
        } else {
            r rVar = (r) obj;
            l0(rVar.f2958a, r.f2957b.get(rVar) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f2883i;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f2883i;
    }

    public final void n0(z zVar, a aVar, Function2 function2) {
        int iOrdinal = zVar.ordinal();
        if (iOrdinal == 0) {
            zs.a.X(function2, aVar, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                Continuation continuationB = wn.f.b(wn.f.a(aVar, this, function2));
                rn.q qVar = Result.f14614e;
                continuationB.resumeWith(Unit.f14616a);
                return;
            }
            if (iOrdinal != 3) {
                throw new rn.n();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f2883i;
                Object objC = fr.x.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    Object objC2 = !(function2 instanceof xn.a) ? wn.f.c(function2, aVar, this) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(aVar, this);
                    fr.x.a(coroutineContext, objC);
                    if (objC2 != wn.a.f22354d) {
                        rn.q qVar2 = Result.f14614e;
                        resumeWith(objC2);
                    }
                } catch (Throwable th2) {
                    fr.x.a(coroutineContext, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof g0) {
                    th = ((g0) th).f2914d;
                }
                rn.q qVar3 = Result.f14614e;
                resumeWith(ib.a.o(th));
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new r(thA, false);
        }
        Object objV = V(obj);
        if (objV == b0.f2890e) {
            return;
        }
        v(objV);
    }

    public void m0(Object obj) {
    }

    public void l0(Throwable th2, boolean z5) {
    }
}
