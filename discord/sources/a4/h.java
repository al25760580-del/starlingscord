package a4;

import a3.q;
import er.p;
import er.r;
import er.v;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f131e;

    public /* synthetic */ h(int i7, Serializable serializable) {
        this.f130d = i7;
        this.f131e = serializable;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation frame) throws Throwable {
        dr.a aVar;
        Throwable th2;
        v vVar;
        switch (this.f130d) {
            case 0:
                Flow[] flowArr = (Flow[]) this.f131e;
                p pVar = new p(flowArr, new q(1, flowArr), new g(3, null), flowCollector, null);
                r rVar = new r(frame, frame.getContext());
                Object objA = a.a.A(rVar, true, rVar, pVar);
                wn.a aVar2 = wn.a.f22354d;
                if (objA == aVar2) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objA != aVar2) {
                    objA = Unit.f14616a;
                }
                return objA == aVar2 ? objA : Unit.f14616a;
            case 1:
                if (frame instanceof dr.a) {
                    aVar = (dr.a) frame;
                    int i7 = aVar.f7703v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        aVar.f7703v = i7 - Integer.MIN_VALUE;
                    } else {
                        aVar = new dr.a(this, frame);
                    }
                } else {
                    aVar = new dr.a(this, frame);
                }
                Object obj = aVar.f7701e;
                Object obj2 = wn.a.f22354d;
                int i10 = aVar.f7703v;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = aVar.f7700d;
                    try {
                        ib.a.L(obj);
                        vVar.releaseIntercepted();
                        return Unit.f14616a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        vVar.releaseIntercepted();
                        throw th2;
                    }
                }
                ib.a.L(obj);
                v vVar2 = new v(flowCollector, aVar.getContext());
                try {
                    aVar.f7700d = vVar2;
                    aVar.f7703v = 1;
                    Object objInvoke = ((xn.h) this.f131e).invoke(vVar2, aVar);
                    if (objInvoke != obj2) {
                        objInvoke = Unit.f14616a;
                        break;
                    }
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    vVar = vVar2;
                    vVar.releaseIntercepted();
                    return Unit.f14616a;
                } catch (Throwable th4) {
                    th2 = th4;
                    vVar = vVar2;
                    vVar.releaseIntercepted();
                    throw th2;
                }
            default:
                k kVar = new k((dr.k) this.f131e, flowCollector, null, 3);
                r rVar2 = new r(frame, frame.getContext());
                Object objA2 = a.a.A(rVar2, true, rVar2, kVar);
                wn.a aVar3 = wn.a.f22354d;
                if (objA2 == aVar3) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return objA2 == aVar3 ? objA2 : Unit.f14616a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Function2 function2) {
        this.f130d = 1;
        this.f131e = (xn.h) function2;
    }
}
