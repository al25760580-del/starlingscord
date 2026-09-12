package jq;

import hq.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import pp.s0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i extends AdaptedFunctionReference implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 p3 = (s0) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((c0) this.receiver).d(p3, true);
    }
}
