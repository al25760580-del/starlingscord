package uo;

import java.util.List;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import vo.n0;
import vo.o0;
import vo.y;
import yo.k0;
import yo.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends eq.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.e f21192e;

    static {
        up.e eVarE = up.e.e("clone");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        f21192e = eVarE;
    }

    @Override // eq.h
    public final List h() {
        vo.c cVar = vo.c.f21792d;
        o0 o0Var = n0.C;
        yo.b bVar = this.f8635b;
        k0 k0VarM0 = k0.M0(bVar, f21192e, cVar, o0Var);
        t tVarU0 = bVar.u0();
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f14659d;
        k0VarM0.G0(null, tVarU0, n0Var, n0Var, n0Var, bq.e.e(bVar).e(), y.f21854v, vo.p.f21826c);
        return c0.c(k0VarM0);
    }
}
