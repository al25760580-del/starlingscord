package eq;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vo.l0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8652f = {kk.b.p(s.class, "functions", "getFunctions()Ljava/util/List;", 0), kk.b.p(s.class, "properties", "getProperties()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq.j f8653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.i f8655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.i f8656e;

    public s(kq.l storageManager, jq.j containingClass, boolean z5) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f8653b = containingClass;
        this.f8654c = z5;
        vo.g gVar = vo.g.f21808d;
        r rVar = new r(this, 0);
        storageManager.getClass();
        this.f8655d = new kq.i(storageManager, rVar);
        this.f8656e = new kq.i(storageManager, new r(this, 1));
    }

    @Override // eq.p, eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) io.sentry.config.a.H(this.f8656e, f8652f[1]);
        vq.g gVar = new vq.g();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((l0) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // eq.p, eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) io.sentry.config.a.H(this.f8655d, f8652f[0]);
        vq.g gVar = new vq.g();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((k0) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // eq.p, eq.q
    public final Collection d(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        KProperty[] kPropertyArr = f8652f;
        return CollectionsKt.V((List) io.sentry.config.a.H(this.f8655d, kPropertyArr[0]), (List) io.sentry.config.a.H(this.f8656e, kPropertyArr[1]));
    }

    @Override // eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }
}
