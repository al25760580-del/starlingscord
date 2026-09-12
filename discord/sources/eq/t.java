package eq;

import ep.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.w0;
import lq.y0;
import rn.u;
import vo.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f8657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f8658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f8659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f8660e;

    public t(o workerScope, y0 givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f8657b = workerScope;
        rn.l.b(new x(2, givenSubstitutor));
        w0 w0VarG = givenSubstitutor.g();
        Intrinsics.checkNotNullExpressionValue(w0VarG, "getSubstitution(...)");
        this.f8658c = com.facebook.imagepipeline.nativecode.c.Q(w0VarG).c();
        this.f8660e = rn.l.b(new x(3, this));
    }

    @Override // eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return h(this.f8657b.a(name, location));
    }

    @Override // eq.o
    public final Set b() {
        return this.f8657b.b();
    }

    @Override // eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return h(this.f8657b.c(name, location));
    }

    @Override // eq.q
    public final Collection d(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f8660e.getValue();
    }

    @Override // eq.o
    public final Set e() {
        return this.f8657b.e();
    }

    @Override // eq.o
    public final Set f() {
        return this.f8657b.f();
    }

    @Override // eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        vo.i iVarG = this.f8657b.g(name, location);
        if (iVarG != null) {
            return (vo.i) i(iVarG);
        }
        return null;
    }

    public final Collection h(Collection collection) {
        if (this.f8658c.f15268a.f() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((vo.l) it.next()));
        }
        return linkedHashSet;
    }

    public final vo.l i(vo.l lVar) {
        y0 y0Var = this.f8658c;
        if (y0Var.f15268a.f()) {
            return lVar;
        }
        if (this.f8659d == null) {
            this.f8659d = new HashMap();
        }
        HashMap map = this.f8659d;
        Intrinsics.checkNotNull(map);
        Object objB = map.get(lVar);
        if (objB == null) {
            if (!(lVar instanceof p0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + lVar).toString());
            }
            objB = ((p0) lVar).b(y0Var);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + lVar + " substitution fails");
            }
            map.put(lVar, objB);
        }
        vo.l lVar2 = (vo.l) objB;
        Intrinsics.checkNotNull(lVar2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return lVar2;
    }
}
