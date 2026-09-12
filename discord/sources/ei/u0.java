package ei;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient w0 f8370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient v0 f8371w;

    public u0(w0 w0Var, v0 v0Var) {
        this.f8370v = w0Var;
        this.f8371w = v0Var;
    }

    @Override // ei.h0, ei.z
    public final e0 a() {
        return this.f8371w;
    }

    @Override // ei.z
    public final int b(int i7, Object[] objArr) {
        return this.f8371w.b(i7, objArr);
    }

    @Override // ei.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8370v.get(obj) != null;
    }

    @Override // ei.z
    public final boolean i() {
        return true;
    }

    @Override // ei.h0
    /* JADX INFO: renamed from: p */
    public final e1 iterator() {
        return this.f8371w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8370v.f8382x;
    }
}
