package y;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import xq.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends xn.g implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f23100e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23101i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23102v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f23104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f23105y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f23105y = eVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f23105y, continuation);
        dVar.f23104x = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((k) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:26:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x009c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xn.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
