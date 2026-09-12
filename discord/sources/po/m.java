package po;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f18108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f18109g;

    public m(Method getterMethod, Method method) {
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        this.f18108f = getterMethod;
        this.f18109g = method;
    }

    @Override // com.facebook.imagepipeline.nativecode.b
    public final String e() {
        return gn.h.h(this.f18108f);
    }
}
