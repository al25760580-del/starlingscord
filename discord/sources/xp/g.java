package xp;

import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.z;
import vo.a0;
import vo.l0;
import vo.s0;
import vo.u0;
import vo.v;
import yo.i0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23000a = 0;

    static {
        up.c topLevelFqName = new up.c("kotlin.jvm.JvmInline");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        up.c packageFqName = topLevelFqName.b();
        up.e topLevelName = topLevelFqName.f21262a.f();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        up.c cVar = up.c.f21261c;
        up.c relativeClassName = zs.a.Y(topLevelName);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        relativeClassName.f21262a.c();
    }

    public static final boolean a(vo.d dVar) {
        s0 s0VarJ0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!(dVar instanceof i0)) {
            return false;
        }
        l0 l0VarB0 = ((i0) dVar).B0();
        Intrinsics.checkNotNullExpressionValue(l0VarB0, "getCorrespondingProperty(...)");
        Intrinsics.checkNotNullParameter(l0VarB0, "<this>");
        if (l0VarB0.V() != null) {
            return false;
        }
        vo.l lVarG = l0VarB0.g();
        vo.f fVar = lVarG instanceof vo.f ? (vo.f) lVarG : null;
        if (fVar == null || (s0VarJ0 = fVar.j0()) == null) {
            return false;
        }
        up.e name = l0VarB0.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return s0VarJ0.a(name);
    }

    public static final boolean b(vo.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return (lVar instanceof vo.f) && (((vo.f) lVar).j0() instanceof v);
    }

    public static final boolean c(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        vo.i iVarG = zVar.r0().g();
        if (iVarG != null) {
            return b(iVarG);
        }
        return false;
    }

    public static final boolean d(vo.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return (lVar instanceof vo.f) && (((vo.f) lVar).j0() instanceof a0);
    }

    public static final boolean e(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.V() != null) {
            return false;
        }
        vo.l lVarG = u0Var.g();
        up.e eVar = null;
        vo.f fVar = lVarG instanceof vo.f ? (vo.f) lVarG : null;
        if (fVar != null) {
            int i7 = bq.e.f3383a;
            s0 s0VarJ0 = fVar.j0();
            v vVar = s0VarJ0 instanceof v ? (v) s0VarJ0 : null;
            if (vVar != null) {
                eVar = vVar.f21845a;
            }
        }
        return Intrinsics.areEqual(eVar, u0Var.getName());
    }

    public static final boolean f(vo.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return b(lVar) || d(lVar);
    }

    public static final boolean g(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        vo.i iVarG = zVar.r0().g();
        if (iVarG != null) {
            return f(iVarG);
        }
        return false;
    }

    public static final boolean h(z receiver) {
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        vo.i iVarG = receiver.r0().g();
        if (iVarG == null || !d(iVarG)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return !b1.e(receiver);
    }

    public static final d0 i(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        vo.i iVarG = zVar.r0().g();
        vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
        if (fVar != null) {
            int i7 = bq.e.f3383a;
            s0 s0VarJ0 = fVar.j0();
            v vVar = s0VarJ0 instanceof v ? (v) s0VarJ0 : null;
            if (vVar != null) {
                return (d0) vVar.f21846b;
            }
        }
        return null;
    }
}
