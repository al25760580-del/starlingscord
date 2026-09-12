package yo;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lq.b1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends m implements vo.q0 {
    public static final /* synthetic */ KProperty[] G = {kk.b.p(e.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)};
    public List E;
    public final d F;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kq.o f23426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ep.p f23427y;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(kq.o storageManager, vo.l containingDeclaration, wo.h annotations, up.e name, ep.p visibilityImpl) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        vo.o0 sourceElement = vo.n0.C;
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        super(containingDeclaration, annotations, name, sourceElement);
        this.f23426x = storageManager;
        this.f23427y = visibilityImpl;
        ((kq.l) storageManager).b(new ep.x(25, this));
        this.F = new d(this);
    }

    @Override // yo.m
    /* JADX INFO: renamed from: A0 */
    public final vo.m a() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return this;
    }

    @Override // yo.m, yo.l, vo.l
    public final vo.i a() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return this;
    }

    @Override // vo.x, vo.o
    public final ep.p getVisibility() {
        return this.f23427y;
    }

    @Override // vo.l
    public final Object i0(vo.n visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h hVar = (wp.h) ((ph.c) visitor).f18031d;
        hVar.getClass();
        hVar.x(builder, this, null);
        ep.p pVar = this.f23427y;
        Intrinsics.checkNotNullExpressionValue(pVar, "getVisibility(...)");
        hVar.g0(pVar, builder);
        hVar.K(this, builder);
        builder.append(hVar.I("typealias"));
        builder.append(" ");
        hVar.P(this, builder, true);
        List listL = l();
        Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
        hVar.c0(builder, listL, false);
        hVar.z(this, builder);
        builder.append(" = ");
        builder.append(hVar.X(((jq.v) this).D0()));
        return Unit.f14616a;
    }

    @Override // vo.x
    public final boolean isExternal() {
        return false;
    }

    @Override // vo.j
    public final List l() {
        List list = this.E;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("declaredTypeParametersImpl");
        return null;
    }

    @Override // vo.i
    public final lq.q0 n() {
        return this.F;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // yo.l, fq.a
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // vo.x
    public final boolean y() {
        return false;
    }

    @Override // vo.j
    public final boolean z() {
        return b1.c(((jq.v) this).D0(), new bp.i(22, this), null);
    }

    @Override // yo.m, yo.l, vo.l
    public final vo.l a() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return this;
    }
}
