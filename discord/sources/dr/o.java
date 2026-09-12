package dr;

import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f7775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7776e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e2.n f7777i;

    public o(Ref.BooleanRef booleanRef, FlowCollector flowCollector, e2.n nVar) {
        this.f7775d = booleanRef;
        this.f7776e = flowCollector;
        this.f7777i = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.f7776e.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dr.n
            if (r0 == 0) goto L13
            r0 = r8
            dr.n r0 = (dr.n) r0
            int r1 = r0.f7774w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7774w = r1
            goto L18
        L13:
            dr.n r0 = new dr.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f7772i
            wn.a r1 = wn.a.f22354d
            int r2 = r0.f7774w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ib.a.L(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f7771e
            dr.o r2 = r0.f7770d
            ib.a.L(r8)
            goto L68
        L3d:
            ib.a.L(r8)
            goto L55
        L41:
            ib.a.L(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f7775d
            boolean r8 = r8.element
            if (r8 == 0) goto L58
            r0.f7774w = r5
            kotlinx.coroutines.flow.FlowCollector r8 = r6.f7776e
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L55
            goto L83
        L55:
            kotlin.Unit r7 = kotlin.Unit.f14616a
            return r7
        L58:
            r0.f7770d = r6
            r0.f7771e = r7
            r0.f7774w = r4
            e2.n r8 = r6.f7777i
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            goto L83
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f7775d
            r8.element = r5
            kotlinx.coroutines.flow.FlowCollector r8 = r2.f7776e
            r2 = 0
            r0.f7770d = r2
            r0.f7771e = r2
            r0.f7774w = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r7 = kotlin.Unit.f14616a
            return r7
        L87:
            kotlin.Unit r7 = kotlin.Unit.f14616a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.o.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
