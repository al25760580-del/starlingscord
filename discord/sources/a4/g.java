package a4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class g extends xn.h implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ FlowCollector f128e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f129i;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(3, (Continuation) obj3);
        gVar.f128e = (FlowCollector) obj;
        gVar.f129i = (Object[]) obj2;
        return gVar.invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f127d;
        if (i7 == 0) {
            ib.a.L(obj);
            FlowCollector flowCollector = this.f128e;
            c[] cVarArr = (c[]) this.f129i;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                cVar = a.f120a;
                if (i10 >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArr[i10];
                if (!Intrinsics.areEqual(cVar2, cVar)) {
                    break;
                }
                i10++;
            }
            if (cVar2 != null) {
                cVar = cVar2;
            }
            this.f127d = 1;
            if (flowCollector.emit(cVar, this) == aVar) {
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
