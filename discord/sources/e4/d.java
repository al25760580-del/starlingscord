package e4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f7969b;

    public d(String key, Long l6) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7968a = key;
        this.f7969b = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f7968a, dVar.f7968a) && Intrinsics.areEqual(this.f7969b, dVar.f7969b);
    }

    public final int hashCode() {
        int iHashCode = this.f7968a.hashCode() * 31;
        Long l6 = this.f7969b;
        return iHashCode + (l6 == null ? 0 : l6.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f7968a + ", value=" + this.f7969b + ')';
    }
}
