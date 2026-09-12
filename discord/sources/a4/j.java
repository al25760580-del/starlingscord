package a4;

import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import dr.s;
import e4.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class j implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f135e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f136i;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f134d = i7;
        this.f135e = obj;
        this.f136i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        s sVar;
        Object obj2;
        FlowCollector flowCollector;
        h1.a aVar;
        switch (this.f134d) {
            case 0:
                ((e) this.f135e).b((o) this.f136i, (c) obj);
                return Unit.f14616a;
            case 1:
                if (continuation instanceof s) {
                    sVar = (s) continuation;
                    int i7 = sVar.f7788e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        sVar.f7788e = i7 - Integer.MIN_VALUE;
                    } else {
                        sVar = new s(this, continuation);
                    }
                } else {
                    sVar = new s(this, continuation);
                }
                Object obj3 = sVar.f7787d;
                wn.a aVar2 = wn.a.f22354d;
                int i10 = sVar.f7788e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        flowCollector = sVar.f7791w;
                        obj2 = sVar.f7790v;
                        ib.a.L(obj3);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj3);
                    }
                    return Unit.f14616a;
                }
                ib.a.L(obj3);
                FlowCollector flowCollector2 = (FlowCollector) this.f135e;
                ?? r5 = (xn.h) this.f136i;
                sVar.f7790v = obj;
                sVar.f7791w = flowCollector2;
                sVar.f7788e = 1;
                InlineMarker.mark(6);
                Object objInvoke = r5.invoke(obj, sVar);
                InlineMarker.mark(7);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
                obj2 = obj;
                flowCollector = flowCollector2;
                sVar.f7790v = null;
                sVar.f7791w = null;
                sVar.f7788e = 2;
                if (flowCollector.emit(obj2, sVar) == aVar2) {
                    return aVar2;
                }
                return Unit.f14616a;
            default:
                if (continuation instanceof h1.a) {
                    aVar = (h1.a) continuation;
                    int i11 = aVar.f10278e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aVar.f10278e = i11 - Integer.MIN_VALUE;
                    } else {
                        aVar = new h1.a(this, continuation);
                    }
                } else {
                    aVar = new h1.a(this, continuation);
                }
                Object obj4 = aVar.f10277d;
                wn.a aVar3 = wn.a.f22354d;
                int i12 = aVar.f10278e;
                if (i12 == 0) {
                    ib.a.L(obj4);
                    FlowCollector flowCollector3 = (FlowCollector) this.f135e;
                    h2.b bVar = (h2.b) obj;
                    h2.c key = ((PlayServicesDevicePerformance) this.f136i).f1574d;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Object obj5 = bVar.f10288a.get(key);
                    aVar.f10278e = 1;
                    if (flowCollector3.emit(obj5, aVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj4);
                }
                return Unit.f14616a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(FlowCollector flowCollector, Function2 function2) {
        this.f134d = 1;
        this.f135e = flowCollector;
        this.f136i = (xn.h) function2;
    }
}
