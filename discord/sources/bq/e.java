package bq;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import mq.g;
import vo.e0;
import vo.f;
import vo.i;
import vo.j;
import vo.k0;
import vo.l;
import vo.l0;
import vo.z;
import vq.m;
import xq.h;
import xq.n;
import xq.r;
import yo.b0;
import yo.f0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3383a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(up.e.e("value"), "identifier(...)");
    }

    public static final boolean a(q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        Boolean boolI = m.i(c0.c(q0Var), a.f3376e, c.f3380d);
        Intrinsics.checkNotNullExpressionValue(boolI, "ifAny(...)");
        return boolI.booleanValue();
    }

    public static vo.d b(vo.d dVar, Function1 predicate) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (vo.d) m.g(c0.c(dVar), new a(1), new d(new Ref.ObjectRef(), predicate));
    }

    public static final up.c c(vo.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        up.d dVarH = h(mVar);
        if (!dVarH.d()) {
            dVarH = null;
        }
        if (dVarH != null) {
            return dVarH.g();
        }
        return null;
    }

    public static final f d(wo.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        i iVarG = bVar.getType().r0().g();
        if (iVarG instanceof f) {
            return (f) iVarG;
        }
        return null;
    }

    public static final so.i e(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return j(lVar).f();
    }

    public static final up.b f(i iVar) {
        l lVarG;
        up.b bVarF;
        if (iVar == null || (lVarG = iVar.g()) == null) {
            return null;
        }
        if (lVarG instanceof e0) {
            up.c cVar = ((b0) ((e0) lVarG)).f23420x;
            up.e name = iVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return new up.b(cVar, name);
        }
        if (!(lVarG instanceof j) || (bVarF = f((i) lVarG)) == null) {
            return null;
        }
        up.e name2 = iVar.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return bVarF.d(name2);
    }

    public static final up.c g(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar == null) {
            xp.e.a(3);
            throw null;
        }
        up.c cVarH = xp.e.h(lVar);
        if (cVarH == null) {
            cVarH = xp.e.g(lVar.g()).a(lVar.getName()).g();
        }
        Intrinsics.checkNotNullExpressionValue(cVarH, "getFqNameSafe(...)");
        return cVarH;
    }

    public static final up.d h(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        up.d dVarG = xp.e.g(lVar);
        Intrinsics.checkNotNullExpressionValue(dVarG, "getFqName(...)");
        return dVarG;
    }

    public static final void i(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar.c0(g.f16019a) != null) {
            throw new ClassCastException();
        }
    }

    public static final z j(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        z zVarD = xp.e.d(lVar);
        Intrinsics.checkNotNullExpressionValue(zVarD, "getContainingModule(...)");
        return zVarD;
    }

    public static final vo.d k(vo.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!(dVar instanceof k0)) {
            return dVar;
        }
        l0 l0VarB0 = ((f0) ((k0) dVar)).B0();
        Intrinsics.checkNotNullExpressionValue(l0VarB0, "getCorrespondingProperty(...)");
        return l0VarB0;
    }

    public static final h l(vo.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        vo.d[] elements = {dVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence sequenceO = y.o(elements);
        Collection collectionH = dVar.h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        h elements2 = r.k(CollectionsKt.C(collectionH), new b(1));
        Intrinsics.checkNotNullParameter(sequenceO, "<this>");
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Sequence[] elements3 = {sequenceO, elements2};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Sequence sequenceO2 = y.o(elements3);
        Intrinsics.checkNotNullParameter(sequenceO2, "<this>");
        return n.b(sequenceO2, new n6.e(18));
    }
}
