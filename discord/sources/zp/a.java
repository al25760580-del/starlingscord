package zp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(wo.b value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return ((wo.b) this.f24066a).getType();
    }
}
