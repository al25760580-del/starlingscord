package er;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr.h f8695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8696e;

    public n(cr.h hVar, int i7) {
        this.f8695d = hVar;
        this.f8696e = i7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (ar.b0.B(r0) == r1) goto L21;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof er.m
            if (r0 == 0) goto L13
            r0 = r7
            er.m r0 = (er.m) r0
            int r1 = r0.f8694i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8694i = r1
            goto L18
        L13:
            er.m r0 = new er.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f8692d
            wn.a r1 = wn.a.f22354d
            int r2 = r0.f8694i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ib.a.L(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ib.a.L(r7)
            goto L4b
        L36:
            ib.a.L(r7)
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
            int r2 = r5.f8696e
            r7.<init>(r2, r6)
            r0.f8694i = r4
            cr.h r6 = r5.f8695d
            java.lang.Object r6 = r6.p(r7, r0)
            if (r6 != r1) goto L4b
            goto L53
        L4b:
            r0.f8694i = r3
            java.lang.Object r6 = ar.b0.B(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r6 = kotlin.Unit.f14616a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: er.n.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
