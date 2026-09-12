package uo;

import java.util.Collection;
import kotlin.collections.d1;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xo.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final up.e f21215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final up.b f21216g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq.i f21218b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f21213d = {kk.b.p(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f21212c = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.c f21214e = so.p.f20402l;

    static {
        up.d dVar = so.o.f20366c;
        f21215f = dVar.f();
        up.c topLevelFqName = dVar.g();
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        f21216g = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
    }

    public g(kq.l storageManager, yo.z moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        f computeContainingDeclaration = f.f21210e;
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.f21217a = moduleDescriptor;
        this.f21218b = new kq.i(storageManager, new fp.b(14, this, storageManager));
    }

    @Override // xo.c
    public final vo.f a(up.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (!Intrinsics.areEqual(classId, f21216g)) {
            return null;
        }
        return (yo.j) io.sentry.config.a.H(this.f21218b, f21213d[0]);
    }

    @Override // xo.c
    public final Collection b(up.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (!Intrinsics.areEqual(packageFqName, f21214e)) {
            return p0.f14661d;
        }
        return d1.b((yo.j) io.sentry.config.a.H(this.f21218b, f21213d[0]));
    }

    @Override // xo.c
    public final boolean c(up.c packageFqName, up.e name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, f21215f) && Intrinsics.areEqual(packageFqName, f21214e);
    }
}
