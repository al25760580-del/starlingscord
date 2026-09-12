package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient q f546i;

    public n(q qVar) {
        this.f546i = qVar;
    }

    @Override // ag.q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f546i.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        q qVar = this.f546i;
        c.e(i7, qVar.size());
        return qVar.get((qVar.size() - 1) - i7);
    }

    @Override // ag.q
    public final q i() {
        return this.f546i;
    }

    @Override // ag.q, java.util.List
    public final int indexOf(Object obj) {
        q qVar = this.f546i;
        int iLastIndexOf = qVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (qVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // ag.q, java.util.List
    /* JADX INFO: renamed from: j */
    public final q subList(int i7, int i10) {
        q qVar = this.f546i;
        c.m(i7, i10, qVar.size());
        return qVar.subList(qVar.size() - i10, qVar.size() - i7).i();
    }

    @Override // ag.q, java.util.List
    public final int lastIndexOf(Object obj) {
        q qVar = this.f546i;
        int iIndexOf = qVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (qVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f546i.size();
    }
}
