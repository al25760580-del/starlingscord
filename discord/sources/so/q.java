package so;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.c0;
import lq.e1;
import vo.u;
import vo.y;
import yo.a0;
import yo.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f20409a;

    static {
        nq.l lVar = nq.l.f17061a;
        uo.m mVar = new uo.m(nq.l.f17062b, p.f20398f, 1);
        vo.g gVar = vo.g.f21808d;
        up.e eVarF = p.f20399g.f21262a.f();
        kq.b bVar = kq.l.f14788e;
        a0 a0Var = new a0(mVar, eVarF, bVar);
        a0Var.E = y.f21855w;
        ep.p pVar = vo.p.f21828e;
        if (pVar == null) {
            a0.K(9);
            throw null;
        }
        a0Var.F = pVar;
        List listC = c0.c(o0.F0(a0Var, e1.IN_VARIANCE, up.e.e("T"), 0, bVar));
        if (listC == null) {
            a0.K(14);
            throw null;
        }
        if (a0Var.H != null) {
            throw new IllegalStateException("Type parameters are already set for " + a0Var.getName());
        }
        ArrayList arrayList = new ArrayList(listC);
        a0Var.H = arrayList;
        a0Var.G = new lq.l(a0Var, arrayList, a0Var.I, a0Var.J);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            a0.K(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((yo.h) ((u) it.next())).E = a0Var.j();
        }
        f20409a = a0Var;
    }
}
