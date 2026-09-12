package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends p {
    public d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        so.i iVarF = module.f();
        iVarF.getClass();
        d0 d0VarT = iVarF.t(so.k.BYTE);
        Intrinsics.checkNotNullExpressionValue(d0VarT, "getByteType(...)");
        return d0VarT;
    }

    @Override // zp.g
    public final String toString() {
        return ((Number) this.f24066a).intValue() + ".toByte()";
    }
}
