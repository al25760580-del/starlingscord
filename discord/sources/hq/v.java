package hq;

import kotlin.jvm.internal.Intrinsics;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends a3.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final up.c f11075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(up.c fqName, rp.f nameResolver, pf.b typeTable, n0 n0Var) {
        super(nameResolver, typeTable, n0Var);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        this.f11075e = fqName;
    }

    @Override // a3.r
    public final up.c d() {
        return this.f11075e;
    }
}
