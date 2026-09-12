package ip;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e4.i c8) {
        super(c8, null);
        Intrinsics.checkNotNullParameter(c8, "c");
    }

    @Override // ip.b0
    public void n(ArrayList result, up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // ip.b0
    public final yo.t p() {
        return null;
    }

    @Override // ip.b0
    public final a0 s(bp.x method, ArrayList methodTypeParameters, lq.z returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        return new a0(returnType, valueParameters, methodTypeParameters, n0.f14659d);
    }
}
