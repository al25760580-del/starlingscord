package ep;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f8590d = new t(e0.STRICT, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rn.k f8592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f8593c;

    public t(e0 reportLevelBefore, rn.k kVar, e0 reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f8591a = reportLevelBefore;
        this.f8592b = kVar;
        this.f8593c = reportLevelAfter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f8591a == tVar.f8591a && Intrinsics.areEqual(this.f8592b, tVar.f8592b) && this.f8593c == tVar.f8593c;
    }

    public final int hashCode() {
        int iHashCode = this.f8591a.hashCode() * 31;
        rn.k kVar = this.f8592b;
        return this.f8593c.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.f19482v)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f8591a + ", sinceVersion=" + this.f8592b + ", reportLevelAfter=" + this.f8593c + ')';
    }

    public t(e0 e0Var, int i7) {
        this(e0Var, (i7 & 2) != 0 ? new rn.k(1, 0, 0) : null, e0Var);
    }
}
