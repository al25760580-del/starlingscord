package z;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f23572b;

    public b(f outer, f inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f23571a = outer;
        this.f23572b = inner;
    }

    @Override // z.f
    public final boolean all(Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return this.f23571a.all(predicate) && this.f23572b.all(predicate);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f23571a, bVar.f23571a) && Intrinsics.areEqual(this.f23572b, bVar.f23572b);
    }

    @Override // z.f
    public final Object foldIn(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return this.f23572b.foldIn(this.f23571a.foldIn(obj, operation), operation);
    }

    public final int hashCode() {
        return (this.f23572b.hashCode() * 31) + this.f23571a.hashCode();
    }

    public final String toString() {
        return g.g(new StringBuilder("["), (String) foldIn("", a.f23570d), ']');
    }
}
