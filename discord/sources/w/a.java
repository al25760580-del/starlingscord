package w;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Map.Entry, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f21962e;

    public a(Object obj, Object obj2) {
        this.f21961d = obj;
        this.f21962e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.areEqual(entry.getKey(), this.f21961d) && Intrinsics.areEqual(entry.getValue(), this.f21962e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21961d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21962e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f21961d;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f21962e;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21961d);
        sb2.append('=');
        sb2.append(this.f21962e);
        return sb2.toString();
    }
}
