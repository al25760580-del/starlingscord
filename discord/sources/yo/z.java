package yo;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends l implements vo.z {
    public n8.f E;
    public vo.h0 F;
    public final boolean G;
    public final kq.e H;
    public final rn.u I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final kq.l f23494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final so.i f23495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kotlin.collections.o0 f23496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e0 f23497y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(up.e moduleName, kq.l storageManager, so.i builtIns, int i7) {
        super(wo.g.f22379a, moduleName);
        kotlin.collections.o0 capabilities = w0.d();
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f23494v = storageManager;
        this.f23495w = builtIns;
        if (!moduleName.f21270e) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f23496x = capabilities;
        e0.f23428a.getClass();
        c0(c0.f23423b);
        this.f23497y = d0.f23425b;
        this.G = true;
        this.H = storageManager.c(new bp.i(25, this));
        this.I = rn.l.b(new so.l(this, 2));
    }

    public final void A0() {
        if (this.G) {
            return;
        }
        g3.a aVar = vo.w.f21848a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        c0(vo.w.f21848a);
        String message = "Accessing invalid module descriptor " + this;
        Intrinsics.checkNotNullParameter(message, "message");
        throw new cr.q(message);
    }

    public final void B0(z... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        List descriptors2 = kotlin.collections.y.H(descriptors);
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        kotlin.collections.p0 friends = kotlin.collections.p0.f14661d;
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        n8.f dependencies = new n8.f(descriptors2, friends, kotlin.collections.n0.f14659d, friends);
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.E = dependencies;
    }

    @Override // vo.z
    public final boolean M(vo.z targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (Intrinsics.areEqual(this, targetModule)) {
            return true;
        }
        n8.f fVar = this.E;
        Intrinsics.checkNotNull(fVar);
        return CollectionsKt.E((Set) fVar.f16512v, targetModule) || b0().contains(targetModule) || targetModule.b0().contains(this);
    }

    @Override // vo.z
    public final vo.i0 O(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        A0();
        return (vo.i0) this.H.invoke(fqName);
    }

    @Override // vo.z
    public final List b0() {
        n8.f fVar = this.E;
        if (fVar != null) {
            return (List) fVar.f16511i;
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().f21269d;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // vo.z
    public final Object c0(g3.a capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        this.f23496x.getClass();
        return null;
    }

    @Override // vo.z
    public final so.i f() {
        return this.f23495w;
    }

    @Override // vo.l
    public final vo.l g() {
        return null;
    }

    @Override // vo.l
    public final Object i0(vo.n visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((wp.h) ((ph.c) visitor).f18031d).P(this, builder, true);
        return Unit.f14616a;
    }

    @Override // vo.z
    public final Collection k(up.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        A0();
        A0();
        return ((k) this.I.getValue()).k(fqName, nameFilter);
    }

    @Override // yo.l, fq.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.z0(this));
        if (!this.G) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        vo.h0 h0Var = this.F;
        sb2.append(h0Var != null ? h0Var.getClass().getSimpleName() : null);
        return sb2.toString();
    }
}
