package ep;

import kotlin.jvm.internal.Intrinsics;
import vo.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements xp.f {
    @Override // xp.f
    public final int a() {
        return 3;
    }

    @Override // xp.f
    public final int b(vo.b superDescriptor, vo.b subDescriptor, vo.f fVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof l0) || !(superDescriptor instanceof l0)) {
            return 3;
        }
        l0 l0Var = (l0) subDescriptor;
        l0 l0Var2 = (l0) superDescriptor;
        if (!Intrinsics.areEqual(l0Var.getName(), l0Var2.getName())) {
            return 3;
        }
        if (m3.m.F(l0Var) && m3.m.F(l0Var2)) {
            return 1;
        }
        return (m3.m.F(l0Var) || m3.m.F(l0Var2)) ? 2 : 3;
    }
}
