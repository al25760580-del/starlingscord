package z;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f23573a = new c();

    @Override // z.f
    public final boolean all(Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return true;
    }

    @Override // z.f
    public final Object foldIn(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return obj;
    }

    @Override // z.f
    public final f then(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other;
    }

    public final String toString() {
        return "Modifier";
    }
}
