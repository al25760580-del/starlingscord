package yo;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends q0 {
    public final rn.u J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(vo.b containingDeclaration, q0 q0Var, int i7, wo.h annotations, up.e name, lq.z outType, boolean z5, boolean z6, boolean z7, lq.z zVar, vo.n0 source, Function0 destructuringVariables) {
        super(containingDeclaration, q0Var, i7, annotations, name, outType, z5, z6, z7, zVar, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
        this.J = rn.l.b(destructuringVariables);
    }

    @Override // yo.q0
    public final q0 B0(to.f newOwner, up.e newName, int i7) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        wo.h annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        lq.z type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean zC0 = C0();
        vo.o0 NO_SOURCE = vo.n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new p0(newOwner, null, i7, annotations, newName, type, zC0, this.F, this.G, this.H, NO_SOURCE, new yp.d(1, this));
    }
}
