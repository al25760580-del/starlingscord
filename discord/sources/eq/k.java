package eq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8640b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8641c;

    public k(o oVar) {
        this.f8641c = oVar;
    }

    @Override // eq.o
    public Collection a(up.e name, dp.c location) {
        switch (this.f8640b) {
            case 1:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(location, "location");
                return sa.a.E(k(name, location), l.f8644v);
            default:
                return k(name, location);
        }
    }

    @Override // eq.o
    public final Set b() {
        return l().b();
    }

    @Override // eq.o
    public Collection c(up.e name, dp.a location) {
        switch (this.f8640b) {
            case 1:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(location, "location");
                return sa.a.E(j(name, location), l.f8643i);
            default:
                return j(name, location);
        }
    }

    @Override // eq.q
    public Collection d(f kindFilter, Function1 nameFilter) {
        switch (this.f8640b) {
            case 1:
                Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
                Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
                Collection collectionI = i(kindFilter, nameFilter);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((vo.l) obj) instanceof vo.b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
                return CollectionsKt.V(sa.a.E(arrayList, l.f8645w), arrayList2);
            default:
                return i(kindFilter, nameFilter);
        }
    }

    @Override // eq.o
    public final Set e() {
        return l().e();
    }

    @Override // eq.o
    public final Set f() {
        return l().f();
    }

    @Override // eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l().g(name, location);
    }

    public final o h() {
        if (!(l() instanceof k)) {
            return l();
        }
        o oVarL = l();
        Intrinsics.checkNotNull(oVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((k) oVarL).h();
    }

    public final Collection i(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return l().d(kindFilter, nameFilter);
    }

    public final Collection j(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l().c(name, location);
    }

    public final Collection k(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l().a(name, location);
    }

    public final o l() {
        switch (this.f8640b) {
            case 0:
                return (o) ((kq.i) this.f8641c).invoke();
            default:
                return (o) this.f8641c;
        }
    }

    public k(kq.o storageManager, Function0 getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        j jVar = new j(0, getScope);
        kq.l lVar = (kq.l) storageManager;
        lVar.getClass();
        this.f8641c = new kq.i(lVar, jVar);
    }
}
