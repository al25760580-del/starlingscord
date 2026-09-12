package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends p {
    public w(short s2) {
        super(Short.valueOf(s2));
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        so.i iVarF = module.f();
        iVarF.getClass();
        d0 d0VarT = iVarF.t(so.k.SHORT);
        Intrinsics.checkNotNullExpressionValue(d0VarT, "getShortType(...)");
        return d0VarT;
    }

    @Override // zp.g
    public final String toString() {
        return ((Number) this.f24066a).intValue() + ".toShort()";
    }
}
