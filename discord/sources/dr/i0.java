package dr;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xn.h f7753e;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(v vVar, Function2 function2) {
        this.f7752d = vVar;
        this.f7753e = (xn.h) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        h0 h0Var;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i7 = h0Var.f7746i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                h0Var.f7746i = i7 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, continuation);
            }
        } else {
            h0Var = new h0(this, continuation);
        }
        Object obj = h0Var.f7744d;
        wn.a aVar = wn.a.f22354d;
        int i10 = h0Var.f7746i;
        if (i10 == 0) {
            ib.a.L(obj);
            g0 g0Var = new g0(flowCollector, this.f7753e);
            h0Var.f7746i = 1;
            if (this.f7752d.collect(g0Var, h0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        throw new rn.h();
    }
}
