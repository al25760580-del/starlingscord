package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparable f1818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1819e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f1820i;

    public a1(x0 x0Var, Comparable comparable, Object obj) {
        this.f1820i = x0Var;
        this.f1818d = comparable;
        this.f1819e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1818d.compareTo(((a1) obj).f1818d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f1818d;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f1819e;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1818d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1819e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1818d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1819e;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1820i.b();
        Object obj2 = this.f1819e;
        this.f1819e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1818d + "=" + this.f1819e;
    }
}
