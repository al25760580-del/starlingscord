package eq;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p implements o {
    @Override // eq.o
    public Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return n0.f14659d;
    }

    @Override // eq.o
    public Set b() {
        Collection collectionD = d(f.f8626p, vq.c.f21938d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof k0) {
                up.e name = ((k0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // eq.o
    public Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return n0.f14659d;
    }

    @Override // eq.q
    public Collection d(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return n0.f14659d;
    }

    @Override // eq.o
    public Set e() {
        return null;
    }

    @Override // eq.o
    public Set f() {
        Collection collectionD = d(f.f8627q, vq.c.f21938d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof k0) {
                up.e name = ((k0) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // eq.q
    public vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }
}
