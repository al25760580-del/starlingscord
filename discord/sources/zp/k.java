package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends p {
    public k(int i7) {
        super(Integer.valueOf(i7));
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        so.i iVarF = module.f();
        iVarF.getClass();
        d0 d0VarT = iVarF.t(so.k.INT);
        Intrinsics.checkNotNullExpressionValue(d0VarT, "getIntType(...)");
        return d0VarT;
    }
}
