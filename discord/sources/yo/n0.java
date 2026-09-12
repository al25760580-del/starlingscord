package yo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends s implements m0 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final kq.o f23460b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final vo.q0 f23461c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public h f23462d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f23459f0 = {kk.b.p(n0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0)};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final d0 f23458e0 = new d0();

    public n0(kq.o oVar, vo.q0 q0Var, h hVar, m0 m0Var, wo.h hVar2, vo.c cVar, vo.n0 n0Var) {
        super(up.g.f21277e, cVar, q0Var, m0Var, n0Var, hVar2);
        this.f23460b0 = oVar;
        this.f23461c0 = q0Var;
        fp.b bVar = new fp.b(20, this, hVar);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        new kq.h(lVar, bVar);
        this.f23462d0 = hVar;
    }

    @Override // yo.s
    public final s D0(up.e eVar, vo.c kind, vo.l newOwner, vo.u uVar, vo.n0 source, wo.h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        vo.c cVar = vo.c.f21792d;
        if (kind != cVar) {
            vo.c cVar2 = vo.c.f21795v;
        }
        return new n0(this.f23460b0, this.f23461c0, this.f23462d0, this, annotations, cVar, source);
    }

    @Override // yo.s, yo.m, yo.l, vo.l
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final m0 a() {
        vo.u uVarA = super.a();
        Intrinsics.checkNotNull(uVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (m0) uVarA;
    }

    @Override // yo.s, vo.u, vo.p0
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final n0 b(y0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        vo.u uVarB = super.b(substitutor);
        Intrinsics.checkNotNull(uVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        n0 n0Var = (n0) uVarB;
        lq.z zVar = n0Var.E;
        Intrinsics.checkNotNull(zVar);
        y0 y0VarD = y0.d(zVar);
        Intrinsics.checkNotNullExpressionValue(y0VarD, "create(...)");
        h hVarB = this.f23462d0.A0().b(y0VarD);
        if (hVarB == null) {
            return null;
        }
        n0Var.f23462d0 = hVarB;
        return n0Var;
    }

    @Override // yo.s, vo.d
    public final vo.d d0(vo.f newOwner, vo.y modality, ep.p visibility) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        vo.c kind = vo.c.f21793e;
        Intrinsics.checkNotNullParameter(kind, "kind");
        r rVarH0 = H0(y0.f15267b);
        rVarH0.V(newOwner);
        rVarH0.f23471i = modality;
        rVarH0.e(visibility);
        rVarH0.f23474x = kind;
        rVarH0.J = false;
        vo.l lVarE0 = rVarH0.U.E0(rVarH0);
        Intrinsics.checkNotNull(lVarE0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (m0) lVarE0;
    }

    @Override // yo.m, vo.l
    public final vo.j g() {
        return this.f23461c0;
    }

    @Override // yo.s, vo.b
    public final lq.z getReturnType() {
        lq.z zVar = this.E;
        Intrinsics.checkNotNull(zVar);
        return zVar;
    }

    @Override // vo.k
    public final boolean q() {
        return this.f23462d0.f23444b0;
    }

    @Override // vo.k
    public final vo.f r() {
        vo.f fVarR = this.f23462d0.r();
        Intrinsics.checkNotNullExpressionValue(fVarR, "getConstructedClass(...)");
        return fVarR;
    }

    @Override // yo.m, vo.l
    public final vo.l g() {
        return this.f23461c0;
    }
}
