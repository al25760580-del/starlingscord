package cr;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f7364d = new i(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        o oVar = (o) obj2;
        o oVar2 = j.f7365a;
        h hVar = oVar.f7387w;
        Intrinsics.checkNotNull(hVar);
        return new o(jLongValue, oVar, hVar, 0);
    }
}
