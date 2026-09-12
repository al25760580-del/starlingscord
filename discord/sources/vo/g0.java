package vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21815a;

    public g0(ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f21815a = packageFragments;
    }

    @Override // vo.h0
    public final boolean a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = this.f21815a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((yo.b0) ((e0) it.next())).f23420x, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // vo.h0
    public final void b(up.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f21815a) {
            if (Intrinsics.areEqual(((yo.b0) ((e0) obj)).f23420x, fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // vo.h0
    public final List c(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f21815a) {
            if (Intrinsics.areEqual(((yo.b0) ((e0) obj)).f23420x, fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // vo.h0
    public final Collection k(up.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return xq.r.q(xq.r.h(xq.r.n(CollectionsKt.C(this.f21815a), r.f21839i), new f0(fqName, 0)));
    }
}
