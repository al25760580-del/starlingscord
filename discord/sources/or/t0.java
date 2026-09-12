package or;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Map.Entry, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17606e;

    public t0(Object obj, Object obj2) {
        this.f17605d = obj;
        this.f17606e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.areEqual(this.f17605d, t0Var.f17605d) && Intrinsics.areEqual(this.f17606e, t0Var.f17606e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17605d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17606e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f17605d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f17606e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f17605d + ", value=" + this.f17606e + ')';
    }
}
