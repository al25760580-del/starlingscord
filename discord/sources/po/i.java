package po;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends c9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f18096h;

    public i(Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f18096h = method;
    }

    @Override // c9.a
    public final String d() {
        return gn.h.h(this.f18096h);
    }
}
