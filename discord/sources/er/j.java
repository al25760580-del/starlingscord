package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8688e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f8689i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f8690v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f8689i = kVar;
        this.f8690v = flowCollector;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f8689i, this.f8690v, continuation);
        jVar.f8688e = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f8687d;
        if (i7 == 0) {
            ib.a.L(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f8688e;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            k kVar = this.f8689i;
            Flow flow = kVar.f8676v;
            i iVar = new i(objectRef, coroutineScope, kVar, this.f8690v);
            this.f8687d = 1;
            if (flow.collect(iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        return Unit.f14616a;
    }
}
