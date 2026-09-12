package nq;

import eq.o;
import java.util.List;
import kotlin.collections.d1;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.w0;
import lq.y0;
import vo.p;
import vo.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends yo.j {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        l lVar = l.f17061a;
        e eVar = l.f17062b;
        y yVar = y.f21854v;
        vo.g gVar = vo.g.f21808d;
        List list = n0.f14659d;
        super(eVar, name, yVar, gVar, list, kq.l.f14788e);
        yo.h hVar = new yo.h(this, null, wo.g.f22379a, true, vo.c.f21792d, vo.n0.C);
        hVar.P0(list, p.f21827d);
        Intrinsics.checkNotNullExpressionValue(hVar, "apply(...)");
        g gVarB = l.b(h.SCOPE_FOR_ERROR_CLASS, hVar.getName().f21269d, "");
        k kVar = k.ERROR_CLASS;
        hVar.E = new i(l.d(kVar, new String[0]), gVarB, kVar, list, false, new String[0]);
        l0(gVarB, d1.b(hVar), hVar);
    }

    @Override // yo.b, vo.p0
    public final vo.m b(y0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // yo.b
    /* JADX INFO: renamed from: e0 */
    public final vo.f b(y0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // yo.b, yo.y
    public final o i(w0 typeSubstitution, mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return l.b(h.SCOPE_FOR_ERROR_CLASS, getName().f21269d, typeSubstitution.toString());
    }

    @Override // yo.j
    public final String toString() {
        String strB = getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return strB;
    }
}
