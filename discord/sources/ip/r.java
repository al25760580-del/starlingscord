package ip;

import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends yo.b0 {
    public static final /* synthetic */ KProperty[] K = {kk.b.p(r.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), kk.b.p(r.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};
    public final bp.y E;
    public final e4.i F;
    public final kq.i G;
    public final d H;
    public final kq.c I;
    public final wo.h J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e4.i outerContext, bp.y jPackage) {
        super(((hp.a) outerContext.f7980e).f10969o, jPackage.f3373a);
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.E = jPackage;
        e4.i iVarI = ls.l.i(outerContext, this, null, 6);
        this.F = iVarI;
        ((hp.a) outerContext.f7980e).f10960d.c().f11021c.getClass();
        rp.e eVar = rp.e.f19536g;
        hp.a aVar = (hp.a) iVarI.f7980e;
        kq.o oVar = aVar.f10957a;
        q qVar = new q(this, 0);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.G = new kq.i(lVar, qVar);
        this.H = new d(iVarI, jPackage, this);
        q qVar2 = new q(this, 1);
        n0 n0Var = n0.f14659d;
        kq.l lVar2 = (kq.l) oVar;
        lVar2.getClass();
        if (n0Var == null) {
            kq.l.a(27);
            throw null;
        }
        this.I = new kq.c(lVar2, qVar2, n0Var);
        this.J = aVar.f10976v.f8598c ? wo.g.f22379a : mf.f.F(iVarI, jPackage);
        ((kq.l) oVar).b(new q(this, 2));
    }

    @Override // vo.e0
    public final eq.o J() {
        return this.H;
    }

    @Override // yo.b0, yo.m, vo.m
    public final vo.n0 d() {
        return new ga.l(this);
    }

    @Override // fq.a, wo.a
    public final wo.h getAnnotations() {
        return this.J;
    }

    @Override // yo.b0, yo.l, fq.a
    public final String toString() {
        return "Lazy Java package fragment: " + this.f23420x + " of module " + ((hp.a) this.F.f7980e).f10969o;
    }
}
