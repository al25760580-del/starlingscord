package er;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Flow[] f8698e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8699i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f8700v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cr.h f8701w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Flow[] flowArr, int i7, AtomicInteger atomicInteger, cr.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f8698e = flowArr;
        this.f8699i = i7;
        this.f8700v = atomicInteger;
        this.f8701w = hVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f8698e, this.f8699i, this.f8700v, this.f8701w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f8697d;
        AtomicInteger atomicInteger = this.f8700v;
        cr.h hVar = this.f8701w;
        try {
            if (i7 == 0) {
                ib.a.L(obj);
                Flow[] flowArr = this.f8698e;
                int i10 = this.f8699i;
                Flow flow = flowArr[i10];
                n nVar = new n(hVar, i10);
                this.f8697d = 1;
                if (flow.collect(nVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                hVar.b(null);
            }
            return Unit.f14616a;
        } catch (Throwable th2) {
            if (atomicInteger.decrementAndGet() == 0) {
                hVar.b(null);
            }
            throw th2;
        }
    }
}
