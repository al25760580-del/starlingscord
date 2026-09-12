package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends xn.h implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f7757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ref.LongRef f7758e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7759i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f7761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c7.a f7762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Flow f7763y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c7.a aVar, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.f7762x = aVar;
        this.f7763y = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.f7762x, this.f7763y, (Continuation) obj3);
        kVar.f7760v = (CoroutineScope) obj;
        kVar.f7761w = (FlowCollector) obj2;
        return kVar.invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0071  */
    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab A[PHI: r2 r7 r8 r9
      0x00ab: PHI (r2v5 kotlin.jvm.internal.Ref$LongRef) = 
      (r2v7 kotlin.jvm.internal.Ref$LongRef)
      (r2v10 kotlin.jvm.internal.Ref$LongRef)
      (r2v10 kotlin.jvm.internal.Ref$LongRef)
     binds: [B:24:0x00a9, B:14:0x0078, B:17:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r7v2 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r7v12 kotlin.jvm.internal.Ref$ObjectRef)
      (r7v13 kotlin.jvm.internal.Ref$ObjectRef)
      (r7v13 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:24:0x00a9, B:14:0x0078, B:17:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r8v2 ??) = (r8v12 ??), (r8v13 ??), (r8v14 ??) binds: [B:24:0x00a9, B:14:0x0078, B:17:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r9v4 kotlinx.coroutines.flow.FlowCollector) = 
      (r9v5 kotlinx.coroutines.flow.FlowCollector)
      (r9v6 kotlinx.coroutines.flow.FlowCollector)
      (r9v6 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:24:0x00a9, B:14:0x0078, B:17:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x012c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0131  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cr.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xn.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
