package ei;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object f8300v;

    public d1(Object obj) {
        obj.getClass();
        this.f8300v = obj;
    }

    @Override // ei.h0, ei.z
    public final e0 a() {
        return e0.r(this.f8300v);
    }

    @Override // ei.z
    public final int b(int i7, Object[] objArr) {
        objArr[i7] = this.f8300v;
        return i7 + 1;
    }

    @Override // ei.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8300v.equals(obj);
    }

    @Override // ei.h0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8300v.hashCode();
    }

    @Override // ei.z
    public final boolean i() {
        return false;
    }

    @Override // ei.h0
    /* JADX INFO: renamed from: p */
    public final e1 iterator() {
        return new j0(this.f8300v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f8300v.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
