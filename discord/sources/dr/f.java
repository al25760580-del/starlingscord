package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Flow f7727d;

    public f(Flow flow) {
        this.f7727d = flow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, a5.h] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = er.c.f8670b;
        Object objCollect = this.f7727d.collect(new e(this, objectRef, flowCollector), continuation);
        return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
    }
}
