package eq;

import ep.x;
import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vo.l0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8634d = {kk.b.p(h.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo.b f8635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq.i f8636c;

    public h(kq.l storageManager, yo.b containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f8635b = containingClass;
        x xVar = new x(1, this);
        storageManager.getClass();
        this.f8636c = new kq.i(storageManager, xVar);
    }

    @Override // eq.p, eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) io.sentry.config.a.H(this.f8636c, f8634d[0]);
        if (list.isEmpty()) {
            return n0.f14659d;
        }
        vq.g gVar = new vq.g();
        for (Object obj : list) {
            if ((obj instanceof l0) && Intrinsics.areEqual(((l0) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // eq.p, eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) io.sentry.config.a.H(this.f8636c, f8634d[0]);
        if (list.isEmpty()) {
            return n0.f14659d;
        }
        vq.g gVar = new vq.g();
        for (Object obj : list) {
            if ((obj instanceof k0) && Intrinsics.areEqual(((k0) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // eq.p, eq.q
    public final Collection d(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(f.f8624n.f8631b)) {
            return n0.f14659d;
        }
        return (List) io.sentry.config.a.H(this.f8636c, f8634d[0]);
    }

    public abstract List h();
}
