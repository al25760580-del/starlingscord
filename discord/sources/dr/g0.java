package dr;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlowCollector f7739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xn.h f7740e;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(FlowCollector flowCollector, Function2 function2) {
        this.f7739d = flowCollector;
        this.f7740e = (xn.h) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (((dr.g0) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xn.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.jvm.functions.Function2, xn.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xn.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dr.f0
            if (r0 == 0) goto L13
            r0 = r7
            dr.f0 r0 = (dr.f0) r0
            int r1 = r0.f7732w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7732w = r1
            goto L18
        L13:
            dr.f0 r0 = new dr.f0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7730i
            wn.a r1 = wn.a.f22354d
            int r2 = r0.f7732w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ib.a.L(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            er.v r2 = r0.f7729e
            dr.g0 r4 = r0.f7728d
            ib.a.L(r7)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L3a:
            r7 = move-exception
            goto L79
        L3c:
            ib.a.L(r7)
            er.v r2 = new er.v
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f7739d
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            xn.h r7 = r6.f7740e     // Catch: java.lang.Throwable -> L3a
            r0.f7728d = r6     // Catch: java.lang.Throwable -> L3a
            r0.f7729e = r2     // Catch: java.lang.Throwable -> L3a
            r0.f7732w = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r7 != r1) goto L59
            goto L72
        L59:
            r4 = r6
        L5a:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector r7 = r4.f7739d
            boolean r2 = r7 instanceof dr.g0
            if (r2 == 0) goto L76
            dr.g0 r7 = (dr.g0) r7
            r2 = 0
            r0.f7728d = r2
            r0.f7729e = r2
            r0.f7732w = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f14616a
            return r7
        L76:
            kotlin.Unit r7 = kotlin.Unit.f14616a
            return r7
        L79:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.g0.a(xn.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return this.f7739d.emit(obj, continuation);
    }
}
