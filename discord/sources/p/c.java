package p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17714e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f17715i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f17716v;

    public c(Object obj, Object obj2) {
        this.f17713d = obj;
        this.f17714e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17713d.equals(cVar.f17713d) && this.f17714e.equals(cVar.f17714e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17713d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17714e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f17713d.hashCode() ^ this.f17714e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17713d + "=" + this.f17714e;
    }
}
