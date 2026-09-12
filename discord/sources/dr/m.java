package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f7767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7768e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7769i;

    public m(Ref.IntRef intRef, int i7, FlowCollector flowCollector) {
        this.f7767d = intRef;
        this.f7768e = i7;
        this.f7769i = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        l lVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i7 = lVar.f7766i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.f7766i = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, continuation);
            }
        } else {
            lVar = new l(this, continuation);
        }
        Object obj2 = lVar.f7764d;
        wn.a aVar = wn.a.f22354d;
        int i10 = lVar.f7766i;
        if (i10 == 0) {
            ib.a.L(obj2);
            Ref.IntRef intRef = this.f7767d;
            int i11 = intRef.element;
            if (i11 < this.f7768e) {
                intRef.element = i11 + 1;
                return Unit.f14616a;
            }
            lVar.f7766i = 1;
            if (this.f7769i.emit(obj, lVar) == aVar) {
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
