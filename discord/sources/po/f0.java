package po;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends d {
    @Override // po.d, vo.n
    public final Object j(yo.h descriptor, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        throw new IllegalStateException("No constructors should appear here: " + descriptor);
    }
}
