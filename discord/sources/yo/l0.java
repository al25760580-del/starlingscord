package yo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends eq.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo.z f23452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final up.c f23453c;

    public l0(vo.z moduleDescriptor, up.c fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f23452b = moduleDescriptor;
        this.f23453c = fqName;
    }

    @Override // eq.p, eq.q
    public final Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(eq.f.f8620h)) {
            return kotlin.collections.n0.f14659d;
        }
        up.c cVar = this.f23453c;
        if (cVar.f21262a.c() && kindFilter.f8630a.contains(eq.c.f8612a)) {
            return kotlin.collections.n0.f14659d;
        }
        vo.z zVar = this.f23452b;
        Collection collectionK = zVar.k(cVar, nameFilter);
        ArrayList arrayList = new ArrayList(collectionK.size());
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            up.e name = ((up.c) it.next()).f21262a.f();
            if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                Intrinsics.checkNotNullParameter(name, "name");
                v vVar = null;
                if (!name.f21270e) {
                    v vVar2 = (v) zVar.O(cVar.a(name));
                    if (!((Boolean) io.sentry.config.a.H(vVar2.f23487y, v.F[1])).booleanValue()) {
                        vVar = vVar2;
                    }
                }
                vq.m.b(arrayList, vVar);
            }
        }
        return arrayList;
    }

    @Override // eq.p, eq.o
    public final Set e() {
        return kotlin.collections.p0.f14661d;
    }

    public final String toString() {
        return "subpackages of " + this.f23453c + " from " + this.f23452b;
    }
}
