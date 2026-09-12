package nq;

import ep.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lq.y0;
import lq.z;
import vo.l0;
import vo.n;
import vo.n0;
import vo.y;
import yo.h0;
import yo.i0;
import yo.j0;
import yo.q;
import yo.t;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f17034d;

    public f() {
        l lVar = l.f17061a;
        a aVar = l.f17063c;
        y yVar = y.f21854v;
        p pVar = vo.p.f21828e;
        b[] bVarArr = b.f17028d;
        h0 h0VarC0 = h0.C0(aVar, yVar, pVar, true, up.e.g("<Error property>"), vo.c.f21792d, n0.C);
        i iVar = l.f17065e;
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f14659d;
        h0VarC0.I0(iVar, n0Var, null, null, n0Var);
        this.f17034d = h0VarC0;
    }

    @Override // vo.l0
    public final boolean A() {
        return this.f17034d.P;
    }

    @Override // vo.u0
    public final zp.g I() {
        return this.f17034d.I();
    }

    @Override // vo.b
    public final List L() {
        this.f17034d.L();
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameters(...)");
        return list;
    }

    @Override // vo.b
    public final Object R(vo.a aVar) {
        throw null;
    }

    @Override // vo.b
    public final t S() {
        return this.f17034d.R;
    }

    @Override // vo.u0
    public final boolean U() {
        return this.f17034d.f23445y;
    }

    @Override // vo.b
    public final t V() {
        return this.f17034d.S;
    }

    @Override // vo.l0
    public final q W() {
        return this.f17034d.X;
    }

    @Override // vo.l0
    public final q Y() {
        return this.f17034d.W;
    }

    @Override // vo.b
    public final List Z() {
        List listZ = this.f17034d.Z();
        Intrinsics.checkNotNullExpressionValue(listZ, "getContextReceiverParameters(...)");
        return listZ;
    }

    @Override // vo.l
    public final l0 a() {
        l0 l0VarA = this.f17034d.a();
        Intrinsics.checkNotNullExpressionValue(l0VarA, "getOriginal(...)");
        return l0VarA;
    }

    @Override // vo.u0
    public final boolean a0() {
        return this.f17034d.L;
    }

    @Override // vo.p0
    public final l0 b(y0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this.f17034d.b(substitutor);
    }

    @Override // vo.d
    public final vo.c c() {
        vo.c cVarC = this.f17034d.c();
        Intrinsics.checkNotNullExpressionValue(cVarC, "getKind(...)");
        return cVarC;
    }

    @Override // vo.m
    public final n0 d() {
        n0 n0VarD = this.f17034d.d();
        Intrinsics.checkNotNullExpressionValue(n0VarD, "getSource(...)");
        return n0VarD;
    }

    @Override // vo.d
    public final vo.d d0(vo.f fVar, y yVar, p pVar) {
        h0 h0VarB0 = this.f17034d.d0(fVar, yVar, pVar);
        Intrinsics.checkNotNullExpressionValue(h0VarB0, "copy(...)");
        return h0VarB0;
    }

    @Override // vo.x
    public final y e() {
        y yVarE = this.f17034d.e();
        Intrinsics.checkNotNullExpressionValue(yVarE, "getModality(...)");
        return yVarE;
    }

    @Override // vo.l
    public final vo.l g() {
        vo.l lVarG = this.f17034d.g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        return lVarG;
    }

    @Override // vo.d
    public final void g0(Collection overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
        this.f17034d.I = overriddenDescriptors;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        wo.h annotations = this.f17034d.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // vo.l0
    public final i0 getGetter() {
        return this.f17034d.U;
    }

    @Override // vo.l
    public final up.e getName() {
        up.e name = this.f17034d.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // vo.b
    public final z getReturnType() {
        return this.f17034d.getReturnType();
    }

    @Override // vo.l0
    public final j0 getSetter() {
        return this.f17034d.V;
    }

    @Override // vo.t0
    public final z getType() {
        z type = this.f17034d.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @Override // vo.b
    public final List getTypeParameters() {
        List typeParameters = this.f17034d.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // vo.o
    public final p getVisibility() {
        p visibility = this.f17034d.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // vo.d, vo.b
    public final Collection h() {
        Collection collectionH = this.f17034d.h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        return collectionH;
    }

    @Override // vo.l
    public final Object i0(n nVar, Object obj) {
        h0 h0Var = this.f17034d;
        h0Var.getClass();
        return nVar.f(h0Var, obj);
    }

    @Override // vo.u0
    public final boolean isConst() {
        return this.f17034d.isConst();
    }

    @Override // vo.x
    public final boolean isExternal() {
        return this.f17034d.isExternal();
    }

    @Override // vo.l0
    public final ArrayList m() {
        ArrayList arrayListM = this.f17034d.m();
        Intrinsics.checkNotNullExpressionValue(arrayListM, "getAccessors(...)");
        return arrayListM;
    }

    @Override // vo.x
    public final boolean o0() {
        this.f17034d.getClass();
        return false;
    }

    @Override // vo.b
    public final boolean v() {
        this.f17034d.getClass();
        return false;
    }

    @Override // vo.x
    public final boolean y() {
        return this.f17034d.N;
    }
}
