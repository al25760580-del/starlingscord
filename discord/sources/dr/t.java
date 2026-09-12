package dr;

import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Flow {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7792d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Flow f7793e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7794i;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Flow flow, Function2 function2) {
        this.f7793e = flow;
        this.f7794i = (xn.h) function2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f7792d) {
            case 0:
                Object objCollect = this.f7793e.collect(new a4.j(flowCollector, (xn.h) this.f7794i), continuation);
                return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
            default:
                Object objCollect2 = this.f7793e.collect(new a4.j(2, flowCollector, (PlayServicesDevicePerformance) this.f7794i), continuation);
                return objCollect2 == wn.a.f22354d ? objCollect2 : Unit.f14616a;
        }
    }

    public t(Flow flow, PlayServicesDevicePerformance playServicesDevicePerformance) {
        this.f7793e = flow;
        this.f7794i = playServicesDevicePerformance;
    }
}
