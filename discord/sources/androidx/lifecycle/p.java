package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class p extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f2380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f2380e = qVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.f2380e, continuation);
        pVar.f2379d = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f2379d;
        q qVar = this.f2380e;
        Lifecycle lifecycle = qVar.f2381d;
        if (lifecycle.b().compareTo(Lifecycle.State.f2296e) >= 0) {
            lifecycle.a(qVar);
        } else {
            Job job = (Job) coroutineScope.getCoroutineContext().l(ar.w.f2975e);
            if (job != null) {
                job.f(null);
            }
        }
        return Unit.f14616a;
    }
}
