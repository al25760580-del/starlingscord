package z;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface d extends f {
    @Override // z.f
    default boolean all(Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(this)).booleanValue();
    }

    @Override // z.f
    default Object foldIn(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }
}
