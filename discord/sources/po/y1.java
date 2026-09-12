package po;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.b f18196a;

    static {
        up.c topLevelFqName = new up.c("java.lang.Void");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        f18196a = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k a(vo.u uVar) {
        String strO = ls.d.o(uVar);
        if (strO == null) {
            if (uVar instanceof yo.i0) {
                String strB = bq.e.k(uVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
                strO = ep.z.a(strB);
            } else if (uVar instanceof yo.j0) {
                String strB2 = bq.e.k(uVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
                strO = ep.z.b(strB2);
            } else {
                strO = ((yo.l) uVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(strO, "asString(...)");
            }
        }
        return new k(new tp.e(strO, com.facebook.imagepipeline.nativecode.b.f(uVar, 1)));
    }

    public static com.facebook.imagepipeline.nativecode.b b(vo.l0 possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        vo.l0 l0VarA = ((vo.l0) xp.e.t(possiblyOverriddenProperty)).a();
        Intrinsics.checkNotNullExpressionValue(l0VarA, "getOriginal(...)");
        if (l0VarA instanceof jq.t) {
            jq.t tVar = (jq.t) l0VarA;
            pp.i0 i0Var = tVar.Y;
            vp.m propertySignature = sp.k.f20486d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            sp.e eVar = (sp.e) m3.m.B(i0Var, propertySignature);
            if (eVar != null) {
                return new n(tVar, i0Var, eVar, tVar.Z, tVar.a0);
            }
        } else if (l0VarA instanceof gp.f) {
            gp.f fVar = (gp.f) l0VarA;
            vo.n0 n0VarD = fVar.d();
            ap.f fVar2 = n0VarD instanceof ap.f ? (ap.f) n0VarD : null;
            bp.s sVar = fVar2 != null ? fVar2.f2863d : null;
            if (sVar instanceof bp.u) {
                return new l(((bp.u) sVar).f3370a);
            }
            if (!(sVar instanceof bp.x)) {
                throw new ar.a0("Incorrect resolution sequence for Java field " + l0VarA + " (source = " + sVar + ')');
            }
            Method method = ((bp.x) sVar).f3372a;
            yo.j0 j0Var = fVar.V;
            vo.n0 n0VarD2 = j0Var != null ? j0Var.d() : null;
            ap.f fVar3 = n0VarD2 instanceof ap.f ? (ap.f) n0VarD2 : null;
            bp.s sVar2 = fVar3 != null ? fVar3.f2863d : null;
            bp.x xVar = sVar2 instanceof bp.x ? (bp.x) sVar2 : null;
            return new m(method, xVar != null ? xVar.f3372a : null);
        }
        yo.i0 getter = l0VarA.getGetter();
        Intrinsics.checkNotNull(getter);
        k kVarA = a(getter);
        yo.j0 setter = l0VarA.getSetter();
        return new o(kVarA, setter != null ? a(setter) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c9.a c(vo.u possiblySubstitutedFunction) {
        Method method;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        vo.u uVarA = ((vo.u) xp.e.t(possiblySubstitutedFunction)).a();
        Intrinsics.checkNotNullExpressionValue(uVarA, "getOriginal(...)");
        if (!(uVarA instanceof jq.b)) {
            if (uVarA instanceof gp.e) {
                vo.n0 n0VarD = ((gp.e) uVarA).d();
                ap.f fVar = n0VarD instanceof ap.f ? (ap.f) n0VarD : null;
                bp.s sVar = fVar != null ? fVar.f2863d : null;
                bp.x xVar = sVar instanceof bp.x ? (bp.x) sVar : null;
                if (xVar != null && (method = xVar.f3372a) != null) {
                    return new i(method);
                }
                throw new ar.a0("Incorrect resolution sequence for Java method " + uVarA);
            }
            if (uVarA instanceof gp.b) {
                vo.n0 n0VarD2 = ((gp.b) uVarA).d();
                ap.f fVar2 = n0VarD2 instanceof ap.f ? (ap.f) n0VarD2 : null;
                Object obj = fVar2 != null ? fVar2.f2863d : null;
                if (obj instanceof bp.r) {
                    return new h(((bp.r) obj).f3368a);
                }
                if (obj instanceof bp.o) {
                    Class cls = ((bp.o) obj).f3364a;
                    if (cls.isAnnotation()) {
                        return new g(cls);
                    }
                }
                throw new ar.a0("Incorrect resolution sequence for Java constructor " + uVarA + " (" + obj + ')');
            }
            if (uVarA == 0) {
                mf.f.a(28);
                throw null;
            }
            yo.l lVar = (yo.l) uVarA;
            if ((lVar.getName().equals(so.p.f20395c) && mf.f.z(uVarA)) || ((lVar.getName().equals(so.p.f20393a) && mf.f.z(uVarA)) || (Intrinsics.areEqual(lVar.getName(), uo.a.f21192e) && uVarA.L().isEmpty()))) {
                return a(uVarA);
            }
            throw new ar.a0("Unknown origin of " + uVarA + " (" + uVarA.getClass() + ')');
        }
        jq.m mVar = (jq.m) uVarA;
        vp.a aVarT = mVar.t();
        if (aVarT instanceof pp.a0) {
            vp.g gVar = tp.g.f20880a;
            tp.e eVarC = tp.g.c((pp.a0) aVarT, mVar.N(), mVar.G());
            if (eVarC != null) {
                return new k(eVarC);
            }
        }
        if (aVarT instanceof pp.n) {
            vp.g gVar2 = tp.g.f20880a;
            tp.e eVarA = tp.g.a((pp.n) aVarT, mVar.N(), mVar.G());
            if (eVarA != null) {
                String name = eVarA.k;
                String str = eVarA.f20875l;
                vo.l lVarG = possiblySubstitutedFunction.g();
                Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
                if (xp.g.b(lVarG)) {
                    return new k(eVarA);
                }
                vo.l lVarG2 = possiblySubstitutedFunction.g();
                Intrinsics.checkNotNullExpressionValue(lVarG2, "getContainingDeclaration(...)");
                if (!xp.g.d(lVarG2)) {
                    return new j(eVarA);
                }
                vo.k kVar = (vo.k) possiblySubstitutedFunction;
                if (kVar.q()) {
                    if (!Intrinsics.areEqual(name, "constructor-impl") || !kotlin.text.x.h(str, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                } else {
                    if (!Intrinsics.areEqual(name, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                    vo.f fVarR = kVar.r();
                    Intrinsics.checkNotNullExpressionValue(fVarR, "getConstructedClass(...)");
                    Intrinsics.checkNotNullParameter(fVarR, "<this>");
                    up.b bVarF = bq.e.f(fVarR);
                    Intrinsics.checkNotNull(bVarF);
                    String strB = tp.b.b(bVarF.b());
                    if (kotlin.text.x.h(str, ")V", false)) {
                        String desc = StringsKt.O(str, "V") + strB;
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(desc, "desc");
                        eVarA = new tp.e(name, desc);
                    } else if (!kotlin.text.x.h(str, strB, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                }
                return new k(eVarA);
            }
        }
        return a(uVarA);
    }
}
