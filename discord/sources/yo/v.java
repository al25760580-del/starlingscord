package yo;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends l implements vo.i0 {
    public static final /* synthetic */ KProperty[] F = {kk.b.p(v.class, "fragments", "getFragments()Ljava/util/List;", 0), kk.b.p(v.class, "empty", "getEmpty()Z", 0)};
    public final eq.k E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z f23484v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final up.c f23485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kq.i f23486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kq.i f23487y;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(z module, up.c fqName, kq.l storageManager) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        up.d dVar = fqName.f21262a;
        super(wo.g.f22379a, dVar.c() ? up.d.f21264e : dVar.f());
        this.f23484v = module;
        this.f23485w = fqName;
        u uVar = new u(this, 0);
        storageManager.getClass();
        this.f23486x = new kq.i(storageManager, uVar);
        this.f23487y = new kq.i(storageManager, new u(this, 1));
        this.E = new eq.k(storageManager, new u(this, 2));
    }

    public final boolean equals(Object obj) {
        vo.i0 i0Var = obj instanceof vo.i0 ? (vo.i0) obj : null;
        if (i0Var == null) {
            return false;
        }
        v vVar = (v) i0Var;
        return Intrinsics.areEqual(this.f23485w, vVar.f23485w) && Intrinsics.areEqual(this.f23484v, vVar.f23484v);
    }

    @Override // vo.l
    public final vo.l g() {
        up.c cVar = this.f23485w;
        if (cVar.f21262a.c()) {
            return null;
        }
        return this.f23484v.O(cVar.b());
    }

    public final int hashCode() {
        return this.f23485w.hashCode() + (this.f23484v.hashCode() * 31);
    }

    @Override // vo.l
    public final Object i0(vo.n visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h hVar = (wp.h) ((ph.c) visitor).f18031d;
        hVar.getClass();
        builder.append(hVar.I("package"));
        String strG = hVar.G(this.f23485w.f21262a);
        if (strG.length() > 0) {
            builder.append(" ");
            builder.append(strG);
        }
        if (hVar.f22428d.n()) {
            builder.append(" in context of ");
            hVar.P(this.f23484v, builder, false);
        }
        return Unit.f14616a;
    }
}
