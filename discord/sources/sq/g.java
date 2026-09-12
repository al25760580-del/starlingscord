package sq;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.d1;
import lq.z;
import mo.c0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f20502e = new g(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f20503i = new g(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f20504v = new g(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f20505w = new g(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f20506x = new g(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f20507y = new g(5);
    public static final g E = new g(6);
    public static final g F = new g(7);
    public static final g G = new g(8);

    public /* synthetic */ g(int i7) {
        this.f20508d = i7;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 d0VarJ;
        d1 d1VarG;
        z returnType;
        z type;
        boolean zA;
        up.b bVarF;
        z returnType2;
        boolean zA2;
        boolean z5 = true;
        switch (this.f20508d) {
            case 0:
                Intrinsics.checkNotNullParameter((vo.u) obj, "<this>");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((vo.u) obj, "<this>");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((vo.u) obj, "<this>");
                return null;
            case 3:
                vo.u Checks = (vo.u) obj;
                List list = q.j;
                Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
                List listL = Checks.L();
                Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                q0 q0Var = (q0) CollectionsKt.S(listL);
                if (q0Var == null || bq.e.a(q0Var) || q0Var.H != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                vo.u Checks2 = (vo.u) obj;
                List list2 = q.j;
                Intrinsics.checkNotNullParameter(Checks2, "$this$Checks");
                vo.l lVarG = Checks2.g();
                Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
                if (lVarG instanceof vo.f) {
                    up.e eVar = so.i.f20342e;
                    if (so.i.b((vo.f) lVarG, so.o.f20363a)) {
                        return null;
                    }
                }
                Collection collectionH = Checks2.h();
                Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
                Collection collection = collectionH;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        vo.l lVarG2 = ((vo.u) it.next()).g();
                        Intrinsics.checkNotNullExpressionValue(lVarG2, "getContainingDeclaration(...)");
                        if (lVarG2 instanceof vo.f) {
                            up.e eVar2 = so.i.f20342e;
                            if (so.i.b((vo.f) lVarG2, so.o.f20363a)) {
                                return null;
                            }
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(Checks2, "<this>");
                vo.l lVarG3 = Checks2.g();
                vo.f fVar = lVarG3 instanceof vo.f ? (vo.f) lVarG3 : null;
                if (fVar != null) {
                    if (!xp.g.f(fVar)) {
                        fVar = null;
                    }
                    if (fVar != null && (d0VarJ = fVar.j()) != null && (d1VarG = c9.a.G(d0VarJ)) != null && (returnType = Checks2.getReturnType()) != null && Intrinsics.areEqual(((yo.l) Checks2).getName(), r.f20531d)) {
                        Intrinsics.checkNotNullParameter(returnType, "<this>");
                        up.e eVar3 = so.i.f20342e;
                        if (!so.i.C(returnType, so.o.f20376h)) {
                            Intrinsics.checkNotNullParameter(returnType, "<this>");
                            if (so.i.F(returnType)) {
                                if (Checks2.L().size() == 1) {
                                    type = ((q0) Checks2.L().get(0)).getType();
                                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                    if (Intrinsics.areEqual(c9.a.G(type), d1VarG) && Checks2.Z().isEmpty() && Checks2.V() == null) {
                                        return null;
                                    }
                                }
                            }
                        } else if (Checks2.L().size() == 1) {
                            type = ((q0) Checks2.L().get(0)).getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            if (Intrinsics.areEqual(c9.a.G(type), d1VarG)) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                vo.l lVarG4 = Checks2.g();
                Intrinsics.checkNotNullExpressionValue(lVarG4, "getContainingDeclaration(...)");
                if (xp.g.f(lVarG4)) {
                    wp.h hVar = wp.f.f22423b;
                    vo.l lVarG5 = Checks2.g();
                    Intrinsics.checkNotNull(lVarG5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    d0 d0VarJ2 = ((vo.f) lVarG5).j();
                    Intrinsics.checkNotNullExpressionValue(d0VarJ2, "getDefaultType(...)");
                    sb2.append(" or define ''equals(other: " + hVar.X(c9.a.G(d0VarJ2)) + "): Boolean''");
                }
                return sb2.toString();
            case 5:
                vo.u Checks3 = (vo.u) obj;
                List list3 = q.j;
                Intrinsics.checkNotNullParameter(Checks3, "$this$Checks");
                yo.t tVarS = Checks3.S();
                if (tVarS == null) {
                    tVarS = Checks3.V();
                }
                if (tVarS == null) {
                    z5 = false;
                } else {
                    z returnType3 = Checks3.getReturnType();
                    if (returnType3 != null) {
                        z type2 = tVarS.getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        zA = c9.a.A(returnType3, type2);
                    } else {
                        zA = false;
                    }
                    if (!zA) {
                        fq.e eVarB0 = tVarS.B0();
                        Intrinsics.checkNotNullExpressionValue(eVarB0, "getValue(...)");
                        if (eVarB0 instanceof fq.d) {
                            vo.f fVar2 = ((fq.d) eVarB0).f9362d;
                            if (fVar2.y() && (bVarF = bq.e.f(fVar2)) != null) {
                                vo.i iVarP = c0.p(bq.e.j(fVar2), bVarF);
                                vo.q0 q0Var2 = iVarP instanceof vo.q0 ? (vo.q0) iVarP : null;
                                if (q0Var2 == null || (returnType2 = Checks3.getReturnType()) == null) {
                                    zA2 = false;
                                } else {
                                    zA2 = c9.a.A(returnType2, ((jq.v) q0Var2).C0());
                                }
                            } else {
                                zA2 = false;
                            }
                        } else {
                            zA2 = false;
                        }
                        if (!zA2) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                so.i iVar = (so.i) obj;
                s sVar = s.f20546c;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                iVar.getClass();
                d0 d0VarT = iVar.t(so.k.BOOLEAN);
                Intrinsics.checkNotNullExpressionValue(d0VarT, "getBooleanType(...)");
                return d0VarT;
            case 7:
                so.i iVar2 = (so.i) obj;
                t tVar = t.f20547c;
                Intrinsics.checkNotNullParameter(iVar2, "<this>");
                iVar2.getClass();
                d0 d0VarT2 = iVar2.t(so.k.INT);
                Intrinsics.checkNotNullExpressionValue(d0VarT2, "getIntType(...)");
                return d0VarT2;
            default:
                so.i iVar3 = (so.i) obj;
                u uVar = u.f20548c;
                Intrinsics.checkNotNullParameter(iVar3, "<this>");
                d0 d0VarX = iVar3.x();
                Intrinsics.checkNotNullExpressionValue(d0VarX, "getUnitType(...)");
                return d0VarX;
        }
    }
}
