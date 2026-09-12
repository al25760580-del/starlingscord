package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7742e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7743i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Continuation continuation, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        super(1, continuation);
        this.f7742e = flowCollector;
        this.f7743i = objectRef;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new h(continuation, this.f7743i, this.f7742e);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((h) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f7741d;
        Ref.ObjectRef objectRef = this.f7743i;
        if (i7 == 0) {
            ib.a.L(obj);
            a5.h hVar = er.c.f8670b;
            Object obj2 = objectRef.element;
            if (obj2 == hVar) {
                obj2 = null;
            }
            this.f7741d = 1;
            if (this.f7742e.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        objectRef.element = null;
        return Unit.f14616a;
    }
}
