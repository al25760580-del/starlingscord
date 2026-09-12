package eq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f8637b;

    public i(o workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.f8637b = workerScope;
    }

    @Override // eq.p, eq.o
    public final Set b() {
        return this.f8637b.b();
    }

    @Override // eq.p, eq.q
    public final Collection d(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        int i7 = f.f8622l & kindFilter.f8631b;
        f fVar = i7 == 0 ? null : new f(i7, kindFilter.f8630a);
        if (fVar == null) {
            return n0.f14659d;
        }
        Collection collectionD = this.f8637b.d(fVar, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionD) {
            if (obj instanceof vo.j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // eq.p, eq.o
    public final Set e() {
        return this.f8637b.e();
    }

    @Override // eq.p, eq.o
    public final Set f() {
        return this.f8637b.f();
    }

    @Override // eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        vo.i iVarG = this.f8637b.g(name, location);
        if (iVarG != null) {
            vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
            if (fVar != null) {
                return fVar;
            }
            if (iVarG instanceof q0) {
                return (q0) iVarG;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.f8637b;
    }
}
