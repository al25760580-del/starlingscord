package ei;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient w0 f8366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object[] f8367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f8368x;

    public t0(w0 w0Var, Object[] objArr, int i7) {
        this.f8366v = w0Var;
        this.f8367w = objArr;
        this.f8368x = i7;
    }

    @Override // ei.z
    public final int b(int i7, Object[] objArr) {
        return a().b(i7, objArr);
    }

    @Override // ei.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8366v.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // ei.z
    public final boolean i() {
        return true;
    }

    @Override // ei.h0
    public final e0 o() {
        return new s0(this);
    }

    @Override // ei.h0
    /* JADX INFO: renamed from: p */
    public final e1 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8368x;
    }
}
