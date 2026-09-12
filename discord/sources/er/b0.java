package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f8666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8667e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b4.d f8668i;

    public b0(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.f8666d = coroutineContext;
        this.f8667e = fr.x.b(coroutineContext);
        this.f8668i = new b4.d(flowCollector, (Continuation) null, 8);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objB = c.b(this.f8666d, obj, this.f8667e, this.f8668i, continuation);
        return objB == wn.a.f22354d ? objB : Unit.f14616a;
    }
}
