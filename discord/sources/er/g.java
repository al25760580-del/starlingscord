package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends f {
    public g(Flow flow, CoroutineContext coroutineContext, int i7, cr.a aVar, int i10) {
        super(flow, (i10 & 2) != 0 ? kotlin.coroutines.g.f14681d : coroutineContext, (i10 & 4) != 0 ? -3 : i7, (i10 & 8) != 0 ? cr.a.f7342d : aVar);
    }

    @Override // er.e
    public final e e(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        return new g(this.f8676v, coroutineContext, i7, aVar);
    }

    @Override // er.f
    public final Object g(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f8676v.collect(flowCollector, continuation);
        return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
    }
}
