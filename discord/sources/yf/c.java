package yf;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient e f23319i;

    public c(e eVar) {
        this.f23319i = eVar;
    }

    @Override // yf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f23319i.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        e eVar = this.f23319i;
        android.support.v4.media.session.b.z(i7, eVar.size());
        return eVar.get((eVar.size() - 1) - i7);
    }

    @Override // yf.e
    public final e h() {
        return this.f23319i;
    }

    @Override // yf.e, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final e subList(int i7, int i10) {
        e eVar = this.f23319i;
        android.support.v4.media.session.b.B(i7, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i7).h();
    }

    @Override // yf.e, java.util.List
    public final int indexOf(Object obj) {
        e eVar = this.f23319i;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // yf.e, java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f23319i;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23319i.size();
    }
}
