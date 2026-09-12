package qo;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Method method, Object obj) {
        super(method, false, 4);
        Intrinsics.checkNotNullParameter(method, "method");
        this.f18965g = obj;
    }

    @Override // qo.q, qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        return f(this.f18965g, args);
    }
}
