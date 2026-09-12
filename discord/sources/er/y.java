package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cr.w f8721d;

    public y(ProducerScope producerScope) {
        this.f8721d = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objP = this.f8721d.p(obj, continuation);
        return objP == wn.a.f22354d ? objP : Unit.f14616a;
    }
}
