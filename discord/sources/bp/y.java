package bp;

import java.util.Collection;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends s implements lp.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.c f3373a;

    public y(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f3373a = fqName;
    }

    @Override // lp.b
    public final d a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return Intrinsics.areEqual(this.f3373a, ((y) obj).f3373a);
        }
        return false;
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        return n0.f14659d;
    }

    public final int hashCode() {
        return this.f3373a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(y.class, sb2, ": ");
        sb2.append(this.f3373a);
        return sb2.toString();
    }
}
