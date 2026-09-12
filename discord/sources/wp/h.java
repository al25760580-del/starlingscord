package wp;

import ep.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import lq.b0;
import lq.b1;
import lq.d1;
import lq.t0;
import lq.z;
import rn.u;
import vo.e0;
import vo.l0;
import vo.r0;
import vo.u0;
import vo.y;
import yo.i0;
import yo.j0;
import yo.q0;
import zp.t;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends f implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f22427f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f22428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f22429e;

    public h(k options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f22428d = options;
        this.f22429e = rn.l.b(new x(24, this));
    }

    public static void W(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static boolean i0(z zVar) {
        if (!xr.m.y(zVar)) {
            return false;
        }
        List listL0 = zVar.l0();
        if (listL0 != null && listL0.isEmpty()) {
            return true;
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            if (((t0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(h hVar, l0 l0Var, StringBuilder sb2) {
        boolean zQ = hVar.q();
        k kVar = hVar.f22428d;
        if (!zQ) {
            tm.e eVar = kVar.f22443g;
            KProperty[] kPropertyArr = k.Y;
            if (!((Boolean) eVar.getValue(kVar, kPropertyArr[5])).booleanValue()) {
                List listZ = l0Var.Z();
                Intrinsics.checkNotNullExpressionValue(listZ, "getContextReceiverParameters(...)");
                hVar.B(sb2, listZ);
                if (hVar.p().contains(i.ANNOTATIONS)) {
                    hVar.x(sb2, l0Var, null);
                    yo.q qVarY = l0Var.Y();
                    if (qVarY != null) {
                        hVar.x(sb2, qVarY, wo.d.FIELD);
                    }
                    yo.q qVarW = l0Var.W();
                    if (qVarW != null) {
                        hVar.x(sb2, qVarW, wo.d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((p) kVar.H.getValue(kVar, kPropertyArr[32])) == p.f22471e) {
                        i0 getter = l0Var.getGetter();
                        if (getter != null) {
                            hVar.x(sb2, getter, wo.d.PROPERTY_GETTER);
                        }
                        j0 setter = l0Var.getSetter();
                        if (setter != null) {
                            hVar.x(sb2, setter, wo.d.PROPERTY_SETTER);
                            List listL = setter.L();
                            Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                            q0 q0Var = (q0) CollectionsKt.Z(listL);
                            Intrinsics.checkNotNull(q0Var);
                            hVar.x(sb2, q0Var, wo.d.SETTER_PARAMETER);
                        }
                    }
                }
                ep.p visibility = l0Var.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                hVar.g0(visibility, sb2);
                hVar.N(sb2, hVar.p().contains(i.CONST) && l0Var.isConst(), "const");
                hVar.K(l0Var, sb2);
                hVar.M(sb2, l0Var);
                hVar.S(sb2, l0Var);
                hVar.N(sb2, hVar.p().contains(i.LATEINIT) && l0Var.a0(), "lateinit");
                hVar.J(sb2, l0Var);
            }
            hVar.d0(l0Var, sb2, false);
            List typeParameters = l0Var.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            hVar.c0(sb2, typeParameters, true);
            hVar.U(sb2, l0Var);
        }
        hVar.P(l0Var, sb2, true);
        sb2.append(": ");
        z type = l0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(hVar.X(type));
        hVar.V(sb2, l0Var);
        hVar.H(l0Var, sb2);
        List typeParameters2 = l0Var.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        hVar.h0(sb2, typeParameters2);
    }

    public static y u(vo.x xVar) {
        if (xVar instanceof vo.f) {
            return ((vo.f) xVar).c() == vo.g.f21809e ? y.f21855w : y.f21852e;
        }
        vo.l lVarG = xVar.g();
        vo.f fVar = lVarG instanceof vo.f ? (vo.f) lVarG : null;
        if (fVar == null) {
            return y.f21852e;
        }
        if (!(xVar instanceof vo.d)) {
            return y.f21852e;
        }
        vo.d dVar = (vo.d) xVar;
        Collection collectionH = dVar.h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        if (!collectionH.isEmpty() && fVar.e() != y.f21852e) {
            return y.f21854v;
        }
        if (fVar.c() != vo.g.f21809e || Intrinsics.areEqual(dVar.getVisibility(), vo.p.f21824a)) {
            return y.f21852e;
        }
        y yVarE = dVar.e();
        y yVar = y.f21855w;
        return yVarE == yVar ? yVar : y.f21854v;
    }

    public final String A(zp.g gVar) {
        k kVar = this.f22428d;
        Function1 function1 = (Function1) kVar.f22456v.getValue(kVar, k.Y[20]);
        if (function1 != null) {
            return (String) function1.invoke(gVar);
        }
        if (gVar instanceof zp.b) {
            Iterable iterable = (Iterable) ((zp.b) gVar).f24066a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strA = A((zp.g) it.next());
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
            return CollectionsKt.O(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof zp.a) {
            return StringsKt.N(w((wo.b) ((zp.a) gVar).f24066a, null), "@");
        }
        if (!(gVar instanceof t)) {
            return gVar.toString();
        }
        zp.s sVar = (zp.s) ((t) gVar).f24066a;
        if (sVar instanceof zp.q) {
            return ((zp.q) sVar).f24074a + "::class";
        }
        if (!(sVar instanceof zp.r)) {
            throw new rn.n();
        }
        zp.f fVar = ((zp.r) sVar).f24075a;
        String strG = fVar.f24064a.a().f21262a.f21265a;
        int i7 = fVar.f24065b;
        for (int i10 = 0; i10 < i7; i10++) {
            strG = kk.b.g('>', "kotlin.Array<", strG);
        }
        return kk.b.j(strG, "::class");
    }

    public final void B(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int i10 = i7 + 1;
            yo.t tVar = (yo.t) it.next();
            x(sb2, tVar, wo.d.RECEIVER);
            z type = tVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(F(type));
            if (i7 == d0.f(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i7 = i10;
        }
    }

    public final void C(StringBuilder sb2, lq.d0 type) {
        x(sb2, type, null);
        if (lq.c.j(type)) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z5 = type instanceof nq.i;
            k kVar = this.f22428d;
            if (z5 && ((nq.i) type).f17045v.f17060e && ((Boolean) kVar.V.getValue(kVar, k.Y[47])).booleanValue()) {
                nq.l lVar = nq.l.f17061a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(type, "type");
                if (z5) {
                    boolean z6 = ((nq.i) type).f17045v.f17060e;
                }
                lq.q0 q0VarR0 = type.r0();
                Intrinsics.checkNotNull(q0VarR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(D(((nq.j) q0VarR0).f17050b[0]));
            } else {
                if (!z5 || ((Boolean) kVar.X.getValue(kVar, k.Y[49])).booleanValue()) {
                    sb2.append(type.r0().toString());
                } else {
                    sb2.append(((nq.i) type).E);
                }
                sb2.append(Y(type.l0()));
            }
        } else {
            lq.q0 q0VarR1 = type.r0();
            Intrinsics.checkNotNullParameter(type, "<this>");
            vo.i iVarG = type.r0().g();
            n8.f fVarH = w3.q.h(type, iVarG instanceof vo.j ? (vo.j) iVarG : null, 0);
            if (fVarH == null) {
                sb2.append(Z(q0VarR1));
                sb2.append(Y(type.l0()));
            } else {
                T(sb2, fVarH);
            }
            Unit unit = Unit.f14616a;
        }
        if (type.t0()) {
            sb2.append("?");
        }
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type instanceof lq.o) {
            sb2.append(" & Any");
        }
    }

    public final String D(String str) {
        int iOrdinal = r().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return s0.g.e("<font color=red><b>", str, "</b></font>");
        }
        throw new rn.n();
    }

    public final String E(String lowerRendered, String upperRendered, so.i builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (com.facebook.imagepipeline.nativecode.c.N(lowerRendered, upperRendered)) {
            return kotlin.text.x.o(upperRendered, "(", false) ? s0.g.e("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        k kVar = this.f22428d;
        tm.e eVar = kVar.f22438b;
        KProperty[] kPropertyArr = k.Y;
        c cVar = (c) eVar.getValue(kVar, kPropertyArr[0]);
        builtIns.getClass();
        vo.f fVarJ = builtIns.j(so.o.C);
        Intrinsics.checkNotNullExpressionValue(fVarJ, "getCollection(...)");
        String strY = StringsKt.Y(cVar.a(fVarJ, this), "Collection");
        String strG = com.facebook.imagepipeline.nativecode.c.G(lowerRendered, kk.b.j(strY, "Mutable"), upperRendered, strY, kk.b.j(strY, "(Mutable)"));
        if (strG != null) {
            return strG;
        }
        String strG2 = com.facebook.imagepipeline.nativecode.c.G(lowerRendered, kk.b.j(strY, "MutableMap.MutableEntry"), upperRendered, kk.b.j(strY, "Map.Entry"), kk.b.j(strY, "(Mutable)Map.(Mutable)Entry"));
        if (strG2 != null) {
            return strG2;
        }
        c cVar2 = (c) kVar.f22438b.getValue(kVar, kPropertyArr[0]);
        vo.f fVarK = builtIns.k("Array");
        Intrinsics.checkNotNullExpressionValue(fVarK, "getArray(...)");
        String strY2 = StringsKt.Y(cVar2.a(fVarK, this), "Array");
        StringBuilder sbN = kk.b.n(strY2);
        sbN.append(o("Array<"));
        String string = sbN.toString();
        StringBuilder sbN2 = kk.b.n(strY2);
        sbN2.append(o("Array<out "));
        String string2 = sbN2.toString();
        StringBuilder sbN3 = kk.b.n(strY2);
        sbN3.append(o("Array<(out) "));
        String strG3 = com.facebook.imagepipeline.nativecode.c.G(lowerRendered, string, upperRendered, string2, sbN3.toString());
        if (strG3 != null) {
            return strG3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String F(z zVar) {
        String strX = X(zVar);
        return ((!i0(zVar) || b1.e(zVar)) && !(zVar instanceof lq.o)) ? strX : kk.b.g(')', "(", strX);
    }

    public final String G(up.d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        fqName.getClass();
        return o(com.facebook.imagepipeline.nativecode.c.F(up.d.e(fqName)));
    }

    public final void H(u0 u0Var, StringBuilder sb2) {
        zp.g gVarI;
        String strA;
        k kVar = this.f22428d;
        if (!((Boolean) kVar.f22455u.getValue(kVar, k.Y[19])).booleanValue() || (gVarI = u0Var.I()) == null || (strA = A(gVarI)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(o(strA));
    }

    public final String I(String str) {
        int iOrdinal = r().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new rn.n();
            }
            k kVar = this.f22428d;
            if (!((Boolean) kVar.W.getValue(kVar, k.Y[48])).booleanValue()) {
                return s0.g.e("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void J(StringBuilder sb2, vo.d dVar) {
        if (p().contains(i.MEMBER_KIND) && t() && dVar.c() != vo.c.f21792d) {
            sb2.append("/*");
            sb2.append(m3.m.U(dVar.c().name()));
            sb2.append("*/ ");
        }
    }

    public final void K(vo.x xVar, StringBuilder sb2) {
        N(sb2, xVar.isExternal(), "external");
        boolean z5 = false;
        N(sb2, p().contains(i.EXPECT) && xVar.y(), "expect");
        if (p().contains(i.ACTUAL) && xVar.o0()) {
            z5 = true;
        }
        N(sb2, z5, "actual");
    }

    public final void L(y yVar, StringBuilder sb2, y yVar2) {
        k kVar = this.f22428d;
        if (((Boolean) kVar.f22450p.getValue(kVar, k.Y[14])).booleanValue() || yVar != yVar2) {
            N(sb2, p().contains(i.MODALITY), m3.m.U(yVar.name()));
        }
    }

    public final void M(StringBuilder sb2, vo.d dVar) {
        if (xp.e.s(dVar) && dVar.e() == y.f21852e) {
            return;
        }
        k kVar = this.f22428d;
        if (((n) kVar.B.getValue(kVar, k.Y[26])) == n.f22463d && dVar.e() == y.f21854v && !dVar.h().isEmpty()) {
            return;
        }
        y yVarE = dVar.e();
        Intrinsics.checkNotNullExpressionValue(yVarE, "getModality(...)");
        L(yVarE, sb2, u(dVar));
    }

    public final void N(StringBuilder sb2, boolean z5, String str) {
        if (z5) {
            sb2.append(I(str));
            sb2.append(" ");
        }
    }

    public final String O(up.e name, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strO = o(com.facebook.imagepipeline.nativecode.c.E(name));
        k kVar = this.f22428d;
        return (((Boolean) kVar.W.getValue(kVar, k.Y[48])).booleanValue() && r() == s.f22474e && z5) ? s0.g.e("<b>", strO, "</b>") : strO;
    }

    public final void P(vo.l lVar, StringBuilder sb2, boolean z5) {
        up.e name = lVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(O(name, z5));
    }

    public final void Q(StringBuilder sb2, z zVar) {
        d1 d1VarW0 = zVar.w0();
        lq.a aVar = d1VarW0 instanceof lq.a ? (lq.a) d1VarW0 : null;
        if (aVar == null) {
            R(sb2, zVar);
            return;
        }
        lq.d0 d0Var = aVar.f15170i;
        lq.d0 d0Var2 = aVar.f15169e;
        k kVar = this.f22428d;
        tm.e eVar = kVar.R;
        KProperty[] kPropertyArr = k.Y;
        if (((Boolean) eVar.getValue(kVar, kPropertyArr[42])).booleanValue()) {
            R(sb2, d0Var2);
            if (((Boolean) kVar.S.getValue(kVar, kPropertyArr[43])).booleanValue()) {
                s sVarR = r();
                q qVar = s.f22474e;
                if (sVarR == qVar) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* ");
                sb2.append("from: ");
                R(sb2, d0Var);
                sb2.append(" */");
                if (r() == qVar) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        R(sb2, d0Var);
        if (((Boolean) kVar.Q.getValue(kVar, kPropertyArr[41])).booleanValue()) {
            s sVarR2 = r();
            q qVar2 = s.f22474e;
            if (sVarR2 == qVar2) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* ");
            sb2.append("= ");
            R(sb2, d0Var2);
            sb2.append(" */");
            if (r() == qVar2) {
                sb2.append("</i></font>");
            }
        }
    }

    public final void R(StringBuilder sb2, z zVar) {
        up.e eVarP;
        String strO;
        k kVar = this.f22428d;
        if ((zVar instanceof b0) && kVar.n()) {
            kq.i iVar = ((b0) zVar).f15177v;
            if (iVar.f14779i == kq.k.f14783d || iVar.f14779i == kq.k.f14784e) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        d1 d1VarW0 = zVar.w0();
        if (d1VarW0 instanceof lq.s) {
            sb2.append(((lq.s) d1VarW0).B0(this, this));
            return;
        }
        if (!(d1VarW0 instanceof lq.d0)) {
            throw new rn.n();
        }
        lq.d0 d0Var = (lq.d0) d1VarW0;
        if (Intrinsics.areEqual(d0Var, b1.f15179b) || d0Var.r0() == b1.f15178a.f17043e) {
            sb2.append("???");
            return;
        }
        lq.q0 q0VarR0 = d0Var.r0();
        if ((q0VarR0 instanceof nq.j) && ((nq.j) q0VarR0).f17049a == nq.k.UNINFERRED_TYPE_VARIABLE) {
            if (!((Boolean) kVar.f22454t.getValue(kVar, k.Y[18])).booleanValue()) {
                sb2.append("???");
                return;
            }
            lq.q0 q0VarR1 = d0Var.r0();
            Intrinsics.checkNotNull(q0VarR1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(D(((nq.j) q0VarR1).f17050b[0]));
            return;
        }
        if (lq.c.j(d0Var)) {
            C(sb2, d0Var);
            return;
        }
        if (!i0(d0Var)) {
            C(sb2, d0Var);
            return;
        }
        int length = sb2.length();
        ((h) this.f22429e.getValue()).x(sb2, d0Var, null);
        boolean z5 = sb2.length() != length;
        z zVarU = xr.m.u(d0Var);
        List listQ = xr.m.q(d0Var);
        boolean zB = xr.m.B(d0Var);
        boolean zT0 = d0Var.t0();
        boolean z6 = zT0 || (z5 && zVarU != null);
        if (z6) {
            if (zB) {
                sb2.insert(length, '(');
            } else {
                if (z5) {
                    CharsKt.b(kotlin.text.b0.z(sb2));
                    if (sb2.charAt(StringsKt.H(sb2) - 1) != ')') {
                        sb2.insert(StringsKt.H(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!listQ.isEmpty()) {
            sb2.append("context(");
            Iterator it = listQ.subList(0, d0.f(listQ)).iterator();
            while (it.hasNext()) {
                Q(sb2, (z) it.next());
                sb2.append(", ");
            }
            Q(sb2, (z) CollectionsKt.Q(listQ));
            sb2.append(") ");
        }
        N(sb2, zB, "suspend");
        if (zVarU != null) {
            boolean z7 = (i0(zVarU) && !zVarU.t0()) || xr.m.B(zVarU) || !zVarU.getAnnotations().isEmpty() || (zVarU instanceof lq.o);
            if (z7) {
                sb2.append("(");
            }
            Q(sb2, zVarU);
            if (z7) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        if (!xr.m.y(d0Var) || d0Var.getAnnotations().z(so.o.f20382p) == null || d0Var.l0().size() > 1) {
            int i7 = 0;
            for (t0 typeProjection : xr.m.v(d0Var)) {
                int i10 = i7 + 1;
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (((Boolean) kVar.U.getValue(kVar, k.Y[45])).booleanValue()) {
                    z zVarB = typeProjection.b();
                    Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                    eVarP = xr.m.p(zVarB);
                } else {
                    eVarP = null;
                }
                if (eVarP != null) {
                    sb2.append(O(eVarP, false));
                    sb2.append(": ");
                }
                Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
                StringBuilder sb3 = new StringBuilder();
                CollectionsKt.N(c0.c(typeProjection), sb3, ", ", null, null, new g(this, 0), 60);
                sb2.append(sb3.toString());
                i7 = i10;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        int iOrdinal = r().ordinal();
        if (iOrdinal == 0) {
            strO = o("->");
        } else {
            if (iOrdinal != 1) {
                throw new rn.n();
            }
            strO = "&rarr;";
        }
        sb2.append(strO);
        sb2.append(" ");
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        xr.m.y(d0Var);
        z zVarB2 = ((t0) CollectionsKt.Q(d0Var.l0())).b();
        Intrinsics.checkNotNullExpressionValue(zVarB2, "getType(...)");
        Q(sb2, zVarB2);
        if (z6) {
            sb2.append(")");
        }
        if (zT0) {
            sb2.append("?");
        }
    }

    public final void S(StringBuilder sb2, vo.d dVar) {
        if (p().contains(i.OVERRIDE) && !dVar.h().isEmpty()) {
            k kVar = this.f22428d;
            if (((n) kVar.B.getValue(kVar, k.Y[26])) != n.f22464e) {
                N(sb2, true, "override");
                if (t()) {
                    sb2.append("/*");
                    sb2.append(dVar.h().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void T(StringBuilder sb2, n8.f fVar) {
        n8.f fVar2 = (n8.f) fVar.f16511i;
        vo.j jVar = (vo.j) fVar.f16510e;
        if (fVar2 != null) {
            T(sb2, fVar2);
            sb2.append('.');
            up.e name = jVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(O(name, false));
        } else {
            lq.q0 q0VarN = jVar.n();
            Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
            sb2.append(Z(q0VarN));
        }
        sb2.append(Y((List) fVar.f16512v));
    }

    public final void U(StringBuilder sb2, vo.d dVar) {
        yo.t tVarV = dVar.V();
        if (tVarV != null) {
            x(sb2, tVarV, wo.d.RECEIVER);
            z type = tVarV.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(F(type));
            sb2.append(".");
        }
    }

    public final void V(StringBuilder sb2, vo.d dVar) {
        yo.t tVarV;
        k kVar = this.f22428d;
        if (((Boolean) kVar.F.getValue(kVar, k.Y[30])).booleanValue() && (tVarV = dVar.V()) != null) {
            sb2.append(" on ");
            z type = tVarV.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(X(type));
        }
    }

    public final String X(z type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f22428d;
        Q(sb2, (z) ((Function1) kVar.f22459y.getValue(kVar, k.Y[23])).invoke(type));
        return sb2.toString();
    }

    public final String Y(List typeArguments) {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o("<"));
        CollectionsKt.N(typeArguments, sb2, ", ", null, null, new g(this, 0), 60);
        sb2.append(o(">"));
        return sb2.toString();
    }

    public final String Z(lq.q0 typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        vo.i klass = typeConstructor.g();
        if ((klass instanceof r0) || (klass instanceof vo.f) || (klass instanceof vo.q0)) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            if (nq.l.f(klass)) {
                return klass.n().toString();
            }
            k kVar = this.f22428d;
            return ((c) kVar.f22438b.getValue(kVar, k.Y[0])).a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof lq.y ? ((lq.y) typeConstructor).c(d.J) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // wp.j
    public final void a() {
        this.f22428d.a();
    }

    public final void a0(r0 r0Var, StringBuilder sb2, boolean z5) {
        if (z5) {
            sb2.append(o("<"));
        }
        if (t()) {
            sb2.append("/*");
            sb2.append(r0Var.getIndex());
            sb2.append("*/ ");
        }
        N(sb2, r0Var.u(), "reified");
        String str = r0Var.getVariance().f15200d;
        boolean z6 = true;
        N(sb2, str.length() > 0, str);
        x(sb2, r0Var, null);
        P(r0Var, sb2, z5);
        int size = r0Var.getUpperBounds().size();
        if ((size > 1 && !z5) || size == 1) {
            z zVar = (z) r0Var.getUpperBounds().iterator().next();
            if (zVar == null) {
                so.i.a(141);
                throw null;
            }
            if (!so.i.y(zVar) || !zVar.t0()) {
                sb2.append(" : ");
                Intrinsics.checkNotNull(zVar);
                sb2.append(X(zVar));
            }
        } else if (z5) {
            for (z zVar2 : r0Var.getUpperBounds()) {
                if (zVar2 == null) {
                    so.i.a(141);
                    throw null;
                }
                if (!so.i.y(zVar2) || !zVar2.t0()) {
                    if (z6) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    Intrinsics.checkNotNull(zVar2);
                    sb2.append(X(zVar2));
                    z6 = false;
                }
            }
        }
        if (z5) {
            sb2.append(o(">"));
        }
    }

    @Override // wp.j
    public final void b() {
        this.f22428d.b();
    }

    public final void b0(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0((r0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // wp.j
    public final void c() {
        this.f22428d.c();
    }

    public final void c0(StringBuilder sb2, List list, boolean z5) {
        k kVar = this.f22428d;
        if (((Boolean) kVar.f22457w.getValue(kVar, k.Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb2.append(o("<"));
        b0(sb2, list);
        sb2.append(o(">"));
        if (z5) {
            sb2.append(" ");
        }
    }

    @Override // wp.j
    public final void d(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f22428d.d(set);
    }

    public final void d0(u0 u0Var, StringBuilder sb2, boolean z5) {
        if (z5 || !(u0Var instanceof q0)) {
            sb2.append(I(u0Var.U() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    @Override // wp.j
    public final void e(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.f22428d.e(linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final void e0(q0 q0Var, boolean z5, StringBuilder sb2, boolean z6) {
        boolean z7;
        if (z6) {
            sb2.append(I("value-parameter"));
            sb2.append(" ");
        }
        if (t()) {
            sb2.append("/*");
            sb2.append(q0Var.f23468y);
            sb2.append("*/ ");
        }
        x(sb2, q0Var, null);
        N(sb2, q0Var.F, "crossinline");
        N(sb2, q0Var.G, "noinline");
        k kVar = this.f22428d;
        tm.e eVar = kVar.f22452r;
        KProperty[] kPropertyArr = k.Y;
        boolean z10 = false;
        if (((Boolean) eVar.getValue(kVar, kPropertyArr[16])).booleanValue()) {
            vo.b bVarD0 = q0Var.g();
            yo.h hVar = bVarD0 instanceof yo.h ? (yo.h) bVarD0 : null;
            if (hVar == null || !hVar.f23444b0) {
                z7 = false;
            } else {
                z7 = true;
            }
        } else {
            z7 = false;
        }
        if (z7) {
            N(sb2, ((Boolean) kVar.f22453s.getValue(kVar, kPropertyArr[17])).booleanValue(), "actual");
        }
        z type = q0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        z zVar = q0Var.H;
        z zVar2 = zVar == null ? type : zVar;
        N(sb2, zVar != null, "vararg");
        if (z7 || (z6 && !q())) {
            d0(q0Var, sb2, z7);
        }
        if (z5) {
            P(q0Var, sb2, z6);
            sb2.append(": ");
        }
        sb2.append(X(zVar2));
        H(q0Var, sb2);
        if (t() && zVar != null) {
            sb2.append(" /*");
            sb2.append(X(type));
            sb2.append("*/");
        }
        if (((Function1) kVar.f22460z.getValue(kVar, kPropertyArr[24])) != null) {
            if (kVar.n() ? q0Var.C0() : bq.e.a(q0Var)) {
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb3 = new StringBuilder(" = ");
            Function1 function1 = (Function1) kVar.f22460z.getValue(kVar, kPropertyArr[24]);
            Intrinsics.checkNotNull(function1);
            sb3.append((String) function1.invoke(q0Var));
            sb2.append(sb3.toString());
        }
    }

    @Override // wp.j
    public final void f() {
        this.f22428d.f();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void f0(StringBuilder builder, List list, boolean z5) {
        boolean z6;
        k kVar = this.f22428d;
        int iOrdinal = ((o) kVar.E.getValue(kVar, k.Y[29])).ordinal();
        if (iOrdinal == 0) {
            z6 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new rn.n();
                }
            } else if (!z5) {
                z6 = true;
            }
            z6 = false;
        }
        int size = list.size();
        s().getClass();
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append("(");
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int i10 = i7 + 1;
            q0 parameter = (q0) it.next();
            s().getClass();
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Intrinsics.checkNotNullParameter(builder, "builder");
            e0(parameter, z6, builder, false);
            s().getClass();
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (i7 != size - 1) {
                builder.append(", ");
            }
            i7 = i10;
        }
        s().getClass();
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(")");
    }

    @Override // wp.j
    public final void g() {
        this.f22428d.g();
    }

    public final boolean g0(ep.p pVar, StringBuilder sb2) {
        if (!p().contains(i.VISIBILITY)) {
            return false;
        }
        k kVar = this.f22428d;
        tm.e eVar = kVar.f22448n;
        KProperty[] kPropertyArr = k.Y;
        if (((Boolean) eVar.getValue(kVar, kPropertyArr[12])).booleanValue()) {
            pVar = vo.p.f(pVar.f8580a.u());
            Intrinsics.checkNotNullExpressionValue(pVar, "toDescriptorVisibility(...)");
        }
        if (!((Boolean) kVar.f22449o.getValue(kVar, kPropertyArr[13])).booleanValue() && Intrinsics.areEqual(pVar, vo.p.j)) {
            return false;
        }
        sb2.append(I(pVar.f8580a.s()));
        sb2.append(" ");
        return true;
    }

    @Override // wp.j
    public final void h() {
        this.f22428d.h();
    }

    public final void h0(StringBuilder sb2, List list) {
        k kVar = this.f22428d;
        if (((Boolean) kVar.f22457w.getValue(kVar, k.Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            List upperBounds = r0Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (z zVar : CollectionsKt.F(1, upperBounds)) {
                StringBuilder sb3 = new StringBuilder();
                up.e name = r0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb3.append(O(name, false));
                sb3.append(" : ");
                Intrinsics.checkNotNull(zVar);
                sb3.append(X(zVar));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(I("where"));
        sb2.append(" ");
        CollectionsKt.N(arrayList, sb2, ", ", null, null, null, 124);
    }

    @Override // wp.j
    public final void i(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f22428d.i(cVar);
    }

    @Override // wp.j
    public final void j(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        this.f22428d.j(oVar);
    }

    @Override // wp.j
    public final Set k() {
        return this.f22428d.k();
    }

    @Override // wp.j
    public final void l() {
        Intrinsics.checkNotNullParameter(s.f22474e, "<set-?>");
        this.f22428d.l();
    }

    @Override // wp.j
    public final void m() {
        this.f22428d.m();
    }

    public final String o(String str) {
        return r().a(str);
    }

    public final Set p() {
        k kVar = this.f22428d;
        return (Set) kVar.f22441e.getValue(kVar, k.Y[3]);
    }

    public final boolean q() {
        k kVar = this.f22428d;
        return ((Boolean) kVar.f22442f.getValue(kVar, k.Y[4])).booleanValue();
    }

    public final s r() {
        k kVar = this.f22428d;
        return (s) kVar.D.getValue(kVar, k.Y[28]);
    }

    public final e s() {
        k kVar = this.f22428d;
        return (e) kVar.C.getValue(kVar, k.Y[27]);
    }

    public final boolean t() {
        k kVar = this.f22428d;
        return ((Boolean) kVar.j.getValue(kVar, k.Y[8])).booleanValue();
    }

    public final String v(vo.l declarationDescriptor) {
        vo.l lVarG;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.i0(new ph.c(this), sb2);
        k kVar = this.f22428d;
        tm.e eVar = kVar.f22439c;
        KProperty[] kPropertyArr = k.Y;
        if (((Boolean) eVar.getValue(kVar, kPropertyArr[1])).booleanValue() && !(declarationDescriptor instanceof e0) && !(declarationDescriptor instanceof vo.i0) && (lVarG = declarationDescriptor.g()) != null && !(lVarG instanceof vo.z)) {
            sb2.append(" ");
            String str = "defined in";
            Intrinsics.checkNotNullParameter("defined in", "message");
            int iOrdinal = r().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new rn.n();
                }
                str = "<i>defined in</i>";
            }
            sb2.append(str);
            sb2.append(" ");
            up.d dVarG = xp.e.g(lVarG);
            Intrinsics.checkNotNullExpressionValue(dVarG, "getFqName(...)");
            sb2.append(dVarG.c() ? "root package" : G(dVarG));
            if (((Boolean) kVar.f22440d.getValue(kVar, kPropertyArr[2])).booleanValue() && (lVarG instanceof e0) && (declarationDescriptor instanceof vo.m)) {
                ((vo.m) declarationDescriptor).d().a();
            }
        }
        return sb2.toString();
    }

    public final String w(wo.b annotation, wo.d dVar) {
        yo.h hVarE;
        List listL;
        k kVar = this.f22428d;
        tm.e eVar = kVar.N;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (dVar != null) {
            sb2.append(dVar.f22373d + ':');
        }
        z type = annotation.getType();
        sb2.append(X(type));
        KProperty[] kPropertyArr = k.Y;
        if (((a) eVar.getValue(kVar, kPropertyArr[38])).f22408d) {
            Map mapB = annotation.b();
            List list = null;
            vo.f fVarD = ((Boolean) kVar.I.getValue(kVar, kPropertyArr[33])).booleanValue() ? bq.e.d(annotation) : null;
            if (fVarD != null && (hVarE = fVarD.E()) != null && (listL = hVarE.L()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listL) {
                    if (((q0) obj).C0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((q0) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = n0.f14659d;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapB.containsKey((up.e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.e0.l(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((up.e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(kotlin.collections.e0.l(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                up.e eVar2 = (up.e) entry.getKey();
                zp.g gVar = (zp.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eVar2.b());
                sb3.append(" = ");
                sb3.append(!list.contains(eVar2) ? A(gVar) : "...");
                arrayList5.add(sb3.toString());
            }
            List listD0 = CollectionsKt.d0(CollectionsKt.V(arrayList4, arrayList5));
            if (((a) eVar.getValue(kVar, k.Y[38])).f22409e || !listD0.isEmpty()) {
                CollectionsKt.N(listD0, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (t() && (lq.c.j(type) || (type.r0().g() instanceof vo.d0))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public final void x(StringBuilder sb2, wo.a aVar, wo.d dVar) {
        if (p().contains(i.ANNOTATIONS)) {
            boolean z5 = aVar instanceof z;
            k kVar = this.f22428d;
            Set setK = z5 ? kVar.k() : (Set) kVar.K.getValue(kVar, k.Y[35]);
            Function1 function1 = (Function1) kVar.M.getValue(kVar, k.Y[37]);
            for (wo.b bVar : aVar.getAnnotations()) {
                if (!CollectionsKt.E(setK, bVar.a()) && !Intrinsics.areEqual(bVar.a(), so.o.f20384r) && (function1 == null || ((Boolean) function1.invoke(bVar)).booleanValue())) {
                    sb2.append(w(bVar, dVar));
                    if (((Boolean) kVar.J.getValue(kVar, k.Y[34])).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    public final void z(vo.j jVar, StringBuilder sb2) {
        List listL = jVar.l();
        Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
        List parameters = jVar.n().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (t() && jVar.z() && parameters.size() > listL.size()) {
            sb2.append(" /*captured type parameters: ");
            b0(sb2, parameters.subList(listL.size(), parameters.size()));
            sb2.append("*/");
        }
    }
}
