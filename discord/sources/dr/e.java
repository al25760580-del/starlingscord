package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7725e;

    public e(f fVar, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        this.f7724d = objectRef;
        this.f7725e = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i7 = dVar.f7721i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f7721i = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object obj2 = dVar.f7719d;
        wn.a aVar = wn.a.f22354d;
        int i10 = dVar.f7721i;
        if (i10 == 0) {
            ib.a.L(obj2);
            Ref.ObjectRef objectRef = this.f7724d;
            T t5 = objectRef.element;
            if (t5 != er.c.f8670b && Intrinsics.areEqual(t5, obj)) {
                return Unit.f14616a;
            }
            objectRef.element = obj;
            dVar.f7721i = 1;
            if (this.f7725e.emit(obj, dVar) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj2);
        }
        return Unit.f14616a;
    }
}
