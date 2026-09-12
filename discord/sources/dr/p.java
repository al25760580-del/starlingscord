package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends xn.h implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ FlowCollector f7779e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7780i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ xn.h f7781v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.f7781v = (xn.h) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.f7781v, (Continuation) obj3);
        pVar.f7779e = (FlowCollector) obj;
        pVar.f7780i = obj2;
        return pVar.invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // xn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            wn.a r0 = wn.a.f22354d
            int r1 = r4.f7778d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            ib.a.L(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlinx.coroutines.flow.FlowCollector r1 = r4.f7779e
            ib.a.L(r5)
            goto L32
        L1e:
            ib.a.L(r5)
            kotlinx.coroutines.flow.FlowCollector r1 = r4.f7779e
            java.lang.Object r5 = r4.f7780i
            r4.f7779e = r1
            r4.f7778d = r3
            xn.h r3 = r4.f7781v
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.f7779e = r3
            r4.f7778d = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.f14616a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
