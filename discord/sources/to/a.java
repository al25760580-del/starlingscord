package to;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import vo.z;
import yo.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements xo.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq.l f20852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f20853b;

    public a(kq.l storageManager, yo.z module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f20852a = storageManager;
        this.f20853b = module;
    }

    @Override // xo.c
    public final vo.f a(up.b classId) {
        up.c cVar;
        l lVarA;
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.f21260c || classId.g()) {
            return null;
        }
        String str = classId.f21259b.f21262a.f21265a;
        if (!StringsKt.D(str, "Function", false) || (lVarA = m.f20868c.a(str, (cVar = classId.f21258a))) == null) {
            return null;
        }
        k kVar = lVarA.f20866a;
        int i7 = lVarA.f20867b;
        List list = (List) io.sentry.config.a.H(((v) this.f20853b.O(cVar)).f23486x, v.F[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof iq.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (CollectionsKt.firstOrNull(arrayList2) == null) {
            return new c(this.f20852a, (iq.c) CollectionsKt.K(arrayList), kVar, i7);
        }
        throw new ClassCastException();
    }

    @Override // xo.c
    public final Collection b(up.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return p0.f14661d;
    }

    @Override // xo.c
    public final boolean c(up.c packageFqName, up.e name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String strB = name.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return (x.o(strB, "Function", false) || x.o(strB, "KFunction", false) || x.o(strB, "SuspendFunction", false) || x.o(strB, "KSuspendFunction", false)) && m.f20868c.a(strB, packageFqName) != null;
    }
}
