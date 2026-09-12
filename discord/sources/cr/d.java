package cr;

import ar.a2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f7349d = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar;
        h hVar = (h) obj;
        ir.f fVar = (ir.f) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f7357e;
        hVar.getClass();
        o oVar2 = (o) h.f7362y.get(hVar);
        while (!hVar.z()) {
            long andIncrement = h.f7358i.getAndIncrement(hVar);
            long j = j.f7366b;
            long j5 = andIncrement / j;
            int i7 = (int) (andIncrement % j);
            if (oVar2.f9398i != j5) {
                o oVarS = hVar.s(j5, oVar2);
                if (oVarS == null) {
                    continue;
                } else {
                    oVar = oVarS;
                }
            } else {
                oVar = oVar2;
            }
            Object objJ = hVar.J(oVar, i7, andIncrement, fVar);
            o oVar3 = oVar;
            if (objJ == j.f7375m) {
                a2 a2Var = fVar instanceof a2 ? (a2) fVar : null;
                if (a2Var != null) {
                    a2Var.b(oVar3, i7);
                }
            } else if (objJ == j.f7377o) {
                if (andIncrement < hVar.w()) {
                    oVar3.b();
                }
                oVar2 = oVar3;
            } else {
                if (objJ == j.f7376n) {
                    throw new IllegalStateException("unexpected");
                }
                oVar3.b();
                ((ir.e) fVar).f13423w = objJ;
            }
            return Unit.f14616a;
        }
        ((ir.e) fVar).f13423w = j.f7374l;
        return Unit.f14616a;
    }
}
