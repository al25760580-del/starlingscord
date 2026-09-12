package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f8683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8684e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f8685i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f8686v;

    public i(Ref.ObjectRef objectRef, CoroutineScope coroutineScope, k kVar, FlowCollector flowCollector) {
        this.f8683d = objectRef;
        this.f8684e = coroutineScope;
        this.f8685i = kVar;
        this.f8686v = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, ar.p1] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        h hVar;
        i iVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i7 = hVar.f8682x;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                hVar.f8682x = i7 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, continuation);
            }
        } else {
            hVar = new h(this, continuation);
        }
        Object obj2 = hVar.f8680v;
        wn.a aVar = wn.a.f22354d;
        int i10 = hVar.f8682x;
        if (i10 == 0) {
            ib.a.L(obj2);
            Job job = (Job) this.f8683d.element;
            if (job != null) {
                job.f(new l("Child of the scoped flow was cancelled"));
                hVar.f8677d = this;
                hVar.f8678e = obj;
                hVar.f8679i = job;
                hVar.f8682x = 1;
                if (job.a0(hVar) == aVar) {
                    return aVar;
                }
            }
            iVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = hVar.f8678e;
            iVar = hVar.f8677d;
            ib.a.L(obj2);
        }
        Object obj3 = obj;
        Ref.ObjectRef objectRef = iVar.f8683d;
        CoroutineScope coroutineScope = iVar.f8684e;
        ar.z zVar = ar.z.f2985d;
        objectRef.element = ar.b0.t(coroutineScope, null, new a4.k(iVar.f8685i, iVar.f8686v, obj3, null, 2), 1);
        return Unit.f14616a;
    }
}
