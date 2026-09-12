package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        d0 d0VarV = module.f().v();
        Intrinsics.checkNotNullExpressionValue(d0VarV, "getStringType(...)");
        return d0VarV;
    }

    @Override // zp.g
    public final String toString() {
        return s0.g.g(new StringBuilder("\""), (String) this.f24066a, '\"');
    }
}
