package po;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f18089h;

    public g(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Method[] declaredMethods = jClass.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        this.f18089h = kotlin.collections.y.E(declaredMethods, new f(0));
    }

    @Override // c9.a
    public final String d() {
        return CollectionsKt.O(this.f18089h, "", "<init>(", ")V", b.f18064y, 24);
    }
}
