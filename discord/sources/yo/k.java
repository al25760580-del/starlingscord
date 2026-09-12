package yo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements vo.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23450b;

    public k(List providers, String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f23449a = providers;
        this.f23450b = debugName;
        providers.size();
        CollectionsKt.l0(providers).size();
    }

    @Override // vo.h0
    public final boolean a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List list = this.f23449a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!sa.a.s((vo.h0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // vo.h0
    public final void b(up.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator it = this.f23449a.iterator();
        while (it.hasNext()) {
            sa.a.e((vo.h0) it.next(), fqName, packageFragments);
        }
    }

    @Override // vo.h0
    public final List c(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23449a.iterator();
        while (it.hasNext()) {
            sa.a.e((vo.h0) it.next(), fqName, arrayList);
        }
        return CollectionsKt.i0(arrayList);
    }

    @Override // vo.h0
    public final Collection k(up.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f23449a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((vo.h0) it.next()).k(fqName, nameFilter));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f23450b;
    }
}
