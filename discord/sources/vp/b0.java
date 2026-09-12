package vp;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparable f21861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f21862e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f21863i;

    public b0(y yVar, Comparable comparable, Object obj) {
        this.f21863i = yVar;
        this.f21861d = comparable;
        this.f21862e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21861d.compareTo(((b0) obj).f21861d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f21861d;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f21862e;
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
        return this.f21861d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21862e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f21861d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f21862e;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f21863i.b();
        Object obj2 = this.f21862e;
        this.f21862e = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21861d);
        String strValueOf2 = String.valueOf(this.f21862e);
        return a3.e.o(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
