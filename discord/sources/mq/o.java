package mq;

import kotlin.jvm.internal.Intrinsics;
import lq.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends s {
    public o() {
        super("ACCEPT_NULL", 1);
    }

    @Override // mq.s
    public final s a(d1 nextType) {
        Intrinsics.checkNotNullParameter(nextType, "nextType");
        return s.b(nextType);
    }
}
