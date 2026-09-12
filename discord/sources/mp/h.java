package mp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15981b;

    public h(g qualifier, boolean z5) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f15980a = qualifier;
        this.f15981b = z5;
    }

    public static h a(h hVar, g qualifier, boolean z5, int i7) {
        if ((i7 & 1) != 0) {
            qualifier = hVar.f15980a;
        }
        if ((i7 & 2) != 0) {
            z5 = hVar.f15981b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new h(qualifier, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f15980a == hVar.f15980a && this.f15981b == hVar.f15981b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15981b) + (this.f15980a.hashCode() * 31);
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f15980a + ", isForWarningOnly=" + this.f15981b + ')';
    }
}
