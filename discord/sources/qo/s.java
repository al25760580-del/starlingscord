package qo;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends q implements f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Method method) {
        super(method, false, 4);
        Intrinsics.checkNotNullParameter(method, "method");
    }

    @Override // qo.q, qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        return f(null, args);
    }
}
