package to;

import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends eq.h {
    @Override // eq.h
    public final List h() {
        yo.b bVar = this.f8635b;
        Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        c cVar = (c) bVar;
        k kVar = cVar.f20857y;
        if (Intrinsics.areEqual(kVar, g.f20860c)) {
            return c0.c(ib.a.m(cVar, false));
        }
        return Intrinsics.areEqual(kVar, j.f20863c) ? c0.c(ib.a.m(cVar, true)) : n0.f14659d;
    }
}
