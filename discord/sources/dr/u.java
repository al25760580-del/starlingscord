package dr;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements b0, Flow, er.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f7795d;

    public u(d0 d0Var) {
        this.f7795d = d0Var;
    }

    @Override // er.s
    public final Flow a(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != cr.a.f7343e) && !((i7 == 0 || i7 == -3) && aVar == cr.a.f7342d)) ? new er.g(this, coroutineContext, i7, aVar) : this;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        this.f7795d.collect(flowCollector, continuation);
        return wn.a.f22354d;
    }
}
