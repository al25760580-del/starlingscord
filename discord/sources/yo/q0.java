package yo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lq.y0;
import vo.u0;

/* JADX INFO: loaded from: classes3.dex */
public class q0 extends r0 implements vo.j0, u0 {
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final lq.z H;
    public final q0 I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f23468y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(vo.b containingDeclaration, q0 q0Var, int i7, wo.h annotations, up.e name, lq.z outType, boolean z5, boolean z6, boolean z7, lq.z zVar, vo.n0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f23468y = i7;
        this.E = z5;
        this.F = z6;
        this.G = z7;
        this.H = zVar;
        this.I = q0Var == null ? this : q0Var;
    }

    public q0 B0(to.f newOwner, up.e newName, int i7) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        wo.h annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        lq.z type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean zC0 = C0();
        vo.o0 NO_SOURCE = vo.n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new q0(newOwner, null, i7, annotations, newName, type, zC0, this.F, this.G, this.H, NO_SOURCE);
    }

    public final boolean C0() {
        if (!this.E) {
            return false;
        }
        vo.b bVarG = g();
        Intrinsics.checkNotNull(bVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        vo.c cVarC = ((vo.d) bVarG).c();
        cVarC.getClass();
        return cVarC != vo.c.f21793e;
    }

    @Override // yo.m, vo.l
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final vo.b g() {
        vo.l lVarG = super.g();
        Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (vo.b) lVarG;
    }

    @Override // yo.m, yo.l, vo.l
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final q0 a() {
        q0 q0Var = this.I;
        return q0Var == this ? this : q0Var.a();
    }

    @Override // vo.u0
    public final /* bridge */ /* synthetic */ zp.g I() {
        return null;
    }

    @Override // vo.u0
    public final boolean U() {
        return false;
    }

    @Override // vo.p0
    public final vo.m b(y0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.f15268a.f()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // vo.o
    public final ep.p getVisibility() {
        ep.p LOCAL = vo.p.f21829f;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // vo.b
    public final Collection h() {
        Collection collectionH = g().h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        Collection collection = collectionH;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((q0) ((vo.b) it.next()).L().get(this.f23468y));
        }
        return arrayList;
    }

    @Override // vo.l
    public final Object i0(vo.n visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((wp.h) ((ph.c) visitor).f18031d).e0(this, true, builder, true);
        return Unit.f14616a;
    }
}
