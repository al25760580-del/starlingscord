package er;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends xn.h implements Function2 {
    public final /* synthetic */ a3.q E;
    public final /* synthetic */ a4.g F;
    public final /* synthetic */ FlowCollector G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Channel f8702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f8703e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8704i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Flow[] f8708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Flow[] flowArr, a3.q qVar, a4.g gVar, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f8708y = flowArr;
        this.E = qVar;
        this.F = gVar;
        this.G = flowCollector;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.f8708y, this.E, this.F, this.G, continuation);
        pVar.f8707x = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[DONT_INVERT, EDGE_INSN: B:35:0x00b7->B:21:0x0078 BREAK  A[LOOP:0: B:28:0x0098->B:41:?]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:28:0x0098->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00db -> B:21:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xn.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: er.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
