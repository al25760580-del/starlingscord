package bp;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends b0 implements lp.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f3375b;

    public z(Class reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f3374a = reflectType;
        this.f3375b = n0.f14659d;
    }

    @Override // bp.b0
    public final Type b() {
        return this.f3374a;
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        return this.f3375b;
    }
}
