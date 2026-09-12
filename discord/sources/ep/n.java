package ep;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.h f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8574c;

    public n(mp.h hVar, Collection collection) {
        this(hVar, collection, hVar.f15980a == mp.g.f15978i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f8572a, nVar.f8572a) && Intrinsics.areEqual(this.f8573b, nVar.f8573b) && this.f8574c == nVar.f8574c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8574c) + ((this.f8573b.hashCode() + (this.f8572a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f8572a + ", qualifierApplicabilityTypes=" + this.f8573b + ", definitelyNotNull=" + this.f8574c + ')';
    }

    public n(mp.h nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z5) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f8572a = nullabilityQualifier;
        this.f8573b = qualifierApplicabilityTypes;
        this.f8574c = z5;
    }
}
