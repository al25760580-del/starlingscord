package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends g {
    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        d0 d0VarX0 = module.f().o().x0(true);
        if (d0VarX0 != null) {
            Intrinsics.checkNotNullExpressionValue(d0VarX0, "getNullableNothingType(...)");
            return d0VarX0;
        }
        so.i.a(50);
        throw null;
    }
}
