package rq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19542b;

    public a(Object obj, Object obj2) {
        this.f19541a = obj;
        this.f19542b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f19541a, aVar.f19541a) && Intrinsics.areEqual(this.f19542b, aVar.f19542b);
    }

    public final int hashCode() {
        Object obj = this.f19541a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19542b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f19541a + ", upper=" + this.f19542b + ')';
    }
}
