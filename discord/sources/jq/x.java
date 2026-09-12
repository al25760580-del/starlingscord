package jq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kq.l storageManager, Function0 compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // jq.a, wo.h
    public final boolean isEmpty() {
        return false;
    }
}
