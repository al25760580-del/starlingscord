package ar;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends xn.g implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fr.k f2922e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f2923i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i1 f2926x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, Continuation continuation) {
        super(2, continuation);
        this.f2926x = i1Var;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        h1 h1Var = new h1(this.f2926x, continuation);
        h1Var.f2925w = obj;
        return h1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((xq.k) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xn.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            wn.a r0 = wn.a.f22354d
            int r1 = r5.f2924v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            ar.o r1 = r5.f2923i
            fr.k r3 = r5.f2922e
            java.lang.Object r4 = r5.f2925w
            xq.k r4 = (xq.k) r4
            ib.a.L(r6)
            goto L7a
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            ib.a.L(r6)
            goto L7f
        L24:
            ib.a.L(r6)
            java.lang.Object r6 = r5.f2925w
            xq.k r6 = (xq.k) r6
            ar.i1 r1 = r5.f2926x
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = ar.i1.f2928d
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof ar.o
            if (r4 == 0) goto L41
            ar.o r1 = (ar.o) r1
            ar.i1 r1 = r1.f2947w
            r5.f2924v = r3
            r6.a(r1, r5)
            return r0
        L41:
            boolean r3 = r1 instanceof ar.x0
            if (r3 == 0) goto L7f
            ar.x0 r1 = (ar.x0) r1
            ar.k1 r1 = r1.d()
            if (r1 == 0) goto L7f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = fr.m.f9382d
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            fr.m r3 = (fr.m) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5e:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r6 != 0) goto L7f
            boolean r6 = r1 instanceof ar.o
            if (r6 == 0) goto L7a
            ar.o r1 = (ar.o) r1
            ar.i1 r6 = r1.f2947w
            r5.f2925w = r4
            r5.f2922e = r3
            r5.f2923i = r1
            r5.f2924v = r2
            r4.a(r6, r5)
            wn.a r6 = wn.a.f22354d
            return r0
        L7a:
            fr.m r1 = r1.g()
            goto L5e
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f14616a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
