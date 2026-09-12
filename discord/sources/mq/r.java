package mq;

import kotlin.jvm.internal.Intrinsics;
import lq.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends s {
    public r() {
        super("UNKNOWN", 2);
    }

    @Override // mq.s
    public final s a(d1 nextType) {
        Intrinsics.checkNotNullParameter(nextType, "nextType");
        s sVarB = s.b(nextType);
        return sVarB == s.f16039e ? this : sVarB;
    }
}
