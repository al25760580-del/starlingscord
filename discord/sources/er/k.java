package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dr.p f8691w;

    public k(dr.p pVar, Flow flow, CoroutineContext coroutineContext, int i7, cr.a aVar) {
        super(flow, coroutineContext, i7, aVar);
        this.f8691w = pVar;
    }

    @Override // er.e
    public final e e(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        return new k(this.f8691w, this.f8676v, coroutineContext, i7, aVar);
    }

    @Override // er.f
    public final Object g(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        Object objI = ar.b0.i(new j(this, flowCollector, null), continuation);
        return objI == wn.a.f22354d ? objI : Unit.f14616a;
    }
}
