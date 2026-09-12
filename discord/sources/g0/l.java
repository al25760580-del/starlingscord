package g0;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((u.r) obj).getClass();
        if (obj2 != null) {
            throw new ClassCastException();
        }
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(null, "$this$null");
        throw null;
    }
}
