package mq;

import kotlin.jvm.internal.Intrinsics;
import lq.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends s {
    public p() {
        super("NOT_NULL", 3);
    }

    @Override // mq.s
    public final s a(d1 nextType) {
        Intrinsics.checkNotNullParameter(nextType, "nextType");
        return this;
    }
}
