package po;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor f18091h;

    public h(Constructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        this.f18091h = constructor;
    }

    @Override // c9.a
    public final String d() {
        Class<?>[] parameterTypes = this.f18091h.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        return kotlin.collections.y.A(parameterTypes, "", "<init>(", ")V", b.E, 24);
    }
}
