package nq;

import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rn.u;
import vo.i0;
import vo.n;
import vo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f17030d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.e f17031e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n0 f17032i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f17033v;

    static {
        b[] bVarArr = b.f17028d;
        up.e eVarG = up.e.g("<Error module>");
        Intrinsics.checkNotNullExpressionValue(eVarG, "special(...)");
        f17031e = eVarG;
        f17032i = n0.f14659d;
        f17033v = rn.l.b(d.f17029d);
    }

    @Override // vo.z
    public final boolean M(z targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // vo.z
    public final i0 O(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // vo.z
    public final List b0() {
        return f17032i;
    }

    @Override // vo.z
    public final Object c0(g3.a capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // vo.z
    public final so.i f() {
        return (so.i) f17033v.getValue();
    }

    @Override // vo.l
    public final vo.l g() {
        return null;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return wo.g.f22379a;
    }

    @Override // vo.l
    public final up.e getName() {
        return f17031e;
    }

    @Override // vo.l
    public final Object i0(n visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // vo.z
    public final Collection k(up.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return n0.f14659d;
    }

    @Override // vo.l
    public final vo.l a() {
        return this;
    }
}
