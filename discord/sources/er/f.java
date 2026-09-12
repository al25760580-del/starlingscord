package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Flow f8676v;

    public f(Flow flow, CoroutineContext coroutineContext, int i7, cr.a aVar) {
        super(coroutineContext, i7, aVar);
        this.f8676v = flow;
    }

    @Override // er.e
    public final Object c(ProducerScope producerScope, Continuation continuation) {
        Object objG = g(new y(producerScope), continuation);
        return objG == wn.a.f22354d ? objG : Unit.f14616a;
    }

    @Override // er.e, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        if (this.f8674e == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            ar.s sVar = new ar.s(0);
            CoroutineContext coroutineContext = this.f8673d;
            CoroutineContext coroutineContextN = !((Boolean) coroutineContext.Y(bool, sVar)).booleanValue() ? context.n(coroutineContext) : ar.t.a(context, coroutineContext, false);
            if (Intrinsics.areEqual(coroutineContextN, context)) {
                Object objG = g(flowCollector, continuation);
                return objG == wn.a.f22354d ? objG : Unit.f14616a;
            }
            vn.a aVar = kotlin.coroutines.d.k;
            if (Intrinsics.areEqual(coroutineContextN.l(aVar), context.l(aVar))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(flowCollector instanceof y) && !(flowCollector instanceof u)) {
                    flowCollector = new b0(flowCollector, context2);
                }
                Object objB = c.b(coroutineContextN, flowCollector, fr.x.b(coroutineContextN), new b4.d(this, (Continuation) null, 7), continuation);
                return objB == wn.a.f22354d ? objB : Unit.f14616a;
            }
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
    }

    public abstract Object g(FlowCollector flowCollector, Continuation continuation);

    @Override // er.e
    public final String toString() {
        return this.f8676v + " -> " + super.toString();
    }
}
