package sn;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Map.Entry, KMutableMap.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f20311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20312e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20313i;

    public h(i map, int i7) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f20311d = map;
        this.f20312e = i7;
        this.f20313i = map.E;
    }

    public final void a() {
        if (this.f20311d.E != this.f20313i) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f20311d.f20314d[this.f20312e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f20311d.f20315e;
        Intrinsics.checkNotNull(objArr);
        return objArr[this.f20312e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        i iVar = this.f20311d;
        iVar.c();
        Object[] objArr = iVar.f20315e;
        if (objArr == null) {
            int length = iVar.f20314d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            iVar.f20315e = objArr;
        }
        int i7 = this.f20312e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
