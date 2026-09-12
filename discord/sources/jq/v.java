package jq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.e1;
import lq.l0;
import lq.q0;
import lq.y0;
import lq.z;
import pp.u0;
import vo.n0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends yo.e implements m {
    public final u0 H;
    public final rp.f I;
    public final pf.b J;
    public final rp.g K;
    public final l L;
    public d0 M;
    public d0 N;
    public List O;
    public d0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kq.o storageManager, vo.l containingDeclaration, wo.h annotations, up.e name, ep.p visibility, u0 proto, rp.f nameResolver, pf.b typeTable, rp.g versionRequirementTable, l lVar) {
        super(storageManager, containingDeclaration, annotations, name, visibility);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        o0 NO_SOURCE = n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        this.H = proto;
        this.I = nameResolver;
        this.J = typeTable;
        this.K = versionRequirementTable;
        this.L = lVar;
    }

    public final vo.f B0() {
        if (lq.c.j(C0())) {
            return null;
        }
        vo.i iVarG = C0().r0().g();
        if (iVarG instanceof vo.f) {
            return (vo.f) iVarG;
        }
        return null;
    }

    public final d0 C0() {
        d0 d0Var = this.N;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedType");
        return null;
    }

    public final d0 D0() {
        d0 d0Var = this.M;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("underlyingType");
        return null;
    }

    public final void E0(List declaredTypeParameters, d0 underlyingType, d0 expandedType) {
        eq.o oVarN0;
        d0 d0VarW;
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expandedType, "expandedType");
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.E = declaredTypeParameters;
        this.M = underlyingType;
        this.N = expandedType;
        this.O = w3.q.l(this);
        vo.f fVarB0 = B0();
        if (fVarB0 == null || (oVarN0 = fVarB0.n0()) == null) {
            oVarN0 = eq.n.f8648b;
        }
        eq.o oVar = oVarN0;
        bp.i iVar = new bp.i(23, this);
        nq.i iVar2 = b1.f15178a;
        if (nq.l.f(this)) {
            d0VarW = nq.l.c(nq.k.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            q0 q0VarN = n();
            if (q0VarN == null) {
                b1.a(12);
                throw null;
            }
            List listD = b1.d(((yo.d) q0VarN).getParameters());
            l0.f15225e.getClass();
            d0VarW = lq.c.w(l0.f15226i, q0VarN, listD, false, oVar, iVar);
        }
        Intrinsics.checkNotNullExpressionValue(d0VarW, "makeUnsubstitutedType(...)");
        this.P = d0VarW;
    }

    @Override // jq.m
    public final pf.b G() {
        return this.J;
    }

    @Override // jq.m
    public final rp.f N() {
        return this.I;
    }

    @Override // jq.m
    public final l P() {
        return this.L;
    }

    @Override // vo.p0
    public final vo.m b(y0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.f15268a.f()) {
            return this;
        }
        vo.l lVarG = g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        wo.h annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        up.e name = getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        v vVar = new v(this.f23426x, lVarG, annotations, name, this.f23427y, this.H, this.I, this.J, this.K, this.L);
        List listL = l();
        d0 d0VarD0 = D0();
        e1 e1Var = e1.INVARIANT;
        z zVarH = substitutor.h(d0VarD0, e1Var);
        Intrinsics.checkNotNullExpressionValue(zVarH, "safeSubstitute(...)");
        d0 d0VarB = lq.c.b(zVarH);
        z zVarH2 = substitutor.h(C0(), e1Var);
        Intrinsics.checkNotNullExpressionValue(zVarH2, "safeSubstitute(...)");
        vVar.E0(listL, d0VarB, lq.c.b(zVarH2));
        return vVar;
    }

    @Override // vo.i
    public final d0 j() {
        d0 d0Var = this.P;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultTypeImpl");
        return null;
    }

    @Override // jq.m
    public final vp.a t() {
        return this.H;
    }
}
