package jp;

import eq.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.e1;
import lq.i0;
import lq.l0;
import lq.q0;
import lq.t0;
import lq.w0;
import lq.z;
import lq.z0;
import nq.k;
import nq.l;
import vo.r0;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14009d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f14010b = new io.sentry.internal.debugmeta.c(new e());

    static {
        z0 z0Var = z0.f15271e;
        f14008c = m.S(z0Var, false, null, 5).b(b.f13998i);
        f14009d = m.S(z0Var, false, null, 5).b(b.f13997e);
    }

    @Override // lq.w0
    public final t0 e(z key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new i0(i(key, new a(z0.f15271e, false, false, null, 62)));
    }

    public final Pair h(d0 d0Var, vo.f fVar, a aVar) {
        if (d0Var.r0().getParameters().isEmpty()) {
            return new Pair(d0Var, Boolean.FALSE);
        }
        if (so.i.z(d0Var)) {
            t0 t0Var = (t0) d0Var.l0().get(0);
            e1 e1VarA = t0Var.a();
            z zVarB = t0Var.b();
            Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
            return new Pair(lq.c.t(c0.c(new i0(i(zVarB, aVar), e1VarA)), d0Var.q0(), d0Var.r0(), d0Var.t0()), Boolean.FALSE);
        }
        if (lq.c.j(d0Var)) {
            return new Pair(l.c(k.ERROR_RAW_TYPE, d0Var.r0().toString()), Boolean.FALSE);
        }
        o oVarX = fVar.x(this);
        Intrinsics.checkNotNullExpressionValue(oVarX, "getMemberScope(...)");
        l0 l0VarQ0 = d0Var.q0();
        q0 q0VarN = fVar.n();
        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
        List<r0> parameters = fVar.n().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(e0.l(parameters, 10));
        for (r0 r0Var : parameters) {
            Intrinsics.checkNotNull(r0Var);
            io.sentry.internal.debugmeta.c cVar = this.f14010b;
            arrayList.add(e.a(r0Var, aVar, cVar, cVar.y0(r0Var, aVar)));
        }
        return new Pair(lq.c.w(l0VarQ0, q0VarN, arrayList, d0Var.t0(), oVarX, new f(fVar, this, d0Var, aVar)), Boolean.TRUE);
    }

    public final z i(z zVar, a aVar) {
        vo.i iVarG = zVar.r0().g();
        if (iVarG instanceof r0) {
            aVar.getClass();
            return i(this.f14010b.y0((r0) iVarG, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(iVarG instanceof vo.f)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + iVarG).toString());
        }
        vo.i iVarG2 = lq.c.E(zVar).r0().g();
        if (iVarG2 instanceof vo.f) {
            Pair pairH = h(lq.c.l(zVar), (vo.f) iVarG, f14008c);
            d0 d0Var = (d0) pairH.f14612d;
            boolean zBooleanValue = ((Boolean) pairH.f14613e).booleanValue();
            Pair pairH2 = h(lq.c.E(zVar), (vo.f) iVarG2, f14009d);
            d0 d0Var2 = (d0) pairH2.f14612d;
            return (zBooleanValue || ((Boolean) pairH2.f14613e).booleanValue()) ? new i(d0Var, d0Var2) : lq.c.e(d0Var, d0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + iVarG2 + "\" while for lower it's \"" + iVarG + '\"').toString());
    }
}
