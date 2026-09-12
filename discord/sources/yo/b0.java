package yo;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends m implements vo.e0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final up.c f23420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f23421y;

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(vo.z module, up.c fqName) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        up.d dVar = fqName.f21262a;
        super(module, wo.g.f22379a, dVar.c() ? up.d.f21264e : dVar.f(), vo.n0.C);
        this.f23420x = fqName;
        this.f23421y = "package " + fqName + " of " + module;
    }

    @Override // yo.m, vo.l
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final vo.z g() {
        vo.l lVarG = super.g();
        Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (vo.z) lVarG;
    }

    @Override // yo.m, vo.m
    public vo.n0 d() {
        vo.o0 NO_SOURCE = vo.n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // vo.l
    public final Object i0(vo.n visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h hVar = (wp.h) ((ph.c) visitor).f18031d;
        hVar.getClass();
        builder.append(hVar.I("package-fragment"));
        String strG = hVar.G(this.f23420x.f21262a);
        if (strG.length() > 0) {
            builder.append(" ");
            builder.append(strG);
        }
        if (hVar.f22428d.n()) {
            builder.append(" in ");
            hVar.P(g(), builder, false);
        }
        return Unit.f14616a;
    }

    @Override // yo.l, fq.a
    public String toString() {
        return this.f23421y;
    }
}
