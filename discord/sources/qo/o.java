package qo;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends q implements f {
    @Override // qo.q, qo.g
    public final Object call(Object[] args) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        d(args);
        ((Field) this.f18970a).set(null, kotlin.collections.y.B(args));
        return Unit.f14616a;
    }
}
