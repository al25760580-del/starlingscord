package ar;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends hr.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2927i;

    public i0(int i7) {
        super(0L, false);
        this.f2927i = i7;
    }

    public abstract Continuation d();

    public Throwable f(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar.f2958a;
        }
        return null;
    }

    public final void h(Throwable th2) {
        b0.q(new a0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), d().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuationD = d();
            Intrinsics.checkNotNull(continuationD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            fr.g gVar = (fr.g) continuationD;
            xn.c cVar = gVar.f9371w;
            Object obj = gVar.f9373y;
            CoroutineContext context = cVar.getContext();
            Object objC = fr.x.c(context, obj);
            Job job = null;
            y1 y1VarC = objC != fr.x.f9401a ? t.c(cVar, context, objC) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object objI = i();
                Throwable thF = f(objI);
                if (thF == null) {
                    int i7 = this.f2927i;
                    boolean z5 = true;
                    if (i7 != 1 && i7 != 2) {
                        z5 = false;
                    }
                    if (z5) {
                        job = (Job) context2.l(w.f2975e);
                    }
                }
                if (job != null && !job.c()) {
                    CancellationException cancellationExceptionU = job.u();
                    a(cancellationExceptionU);
                    rn.q qVar = Result.f14614e;
                    cVar.resumeWith(ib.a.o(cancellationExceptionU));
                } else if (thF != null) {
                    rn.q qVar2 = Result.f14614e;
                    cVar.resumeWith(ib.a.o(thF));
                } else {
                    rn.q qVar3 = Result.f14614e;
                    cVar.resumeWith(g(objI));
                }
                Unit unit = Unit.f14616a;
            } finally {
                if (y1VarC == null || y1VarC.p0()) {
                    fr.x.a(context, objC);
                }
            }
        } catch (g0 e10) {
            b0.q(e10.f2914d, d().getContext());
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void a(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
