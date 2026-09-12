package hq;

import java.util.Set;
import kotlin.collections.d1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f11015c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq.j f11017b;

    static {
        up.c topLevelFqName = so.o.f20366c.g();
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        f11015c = d1.b(new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()));
    }

    public h(j components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f11016a = components;
        this.f11017b = components.f11019a.d(new bp.i(7, this));
    }

    public final vo.f a(up.b classId, e eVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (vo.f) this.f11017b.invoke(new g(classId, eVar));
    }
}
