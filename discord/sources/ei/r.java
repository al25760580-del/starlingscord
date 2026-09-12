package ei;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f8351e;

    public /* synthetic */ r(t tVar, int i7) {
        this.f8350d = i7;
        this.f8351e = tVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8350d) {
            case 0:
                this.f8351e.clear();
                break;
            default:
                this.f8351e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f8350d) {
            case 0:
                t tVar = this.f8351e;
                Map mapB = tVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = tVar.d(entry.getKey());
                    if (iD != -1 && ls.d.n(tVar.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f8351e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8350d) {
            case 0:
                t tVar = this.f8351e;
                Map mapB = tVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new q(tVar, 1);
            default:
                t tVar2 = this.f8351e;
                Map mapB2 = tVar2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new q(tVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f8350d) {
            case 0:
                t tVar = this.f8351e;
                Map mapB = tVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!tVar.f()) {
                        int iC = tVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = tVar.f8359d;
                        Objects.requireNonNull(obj2);
                        int iN = p.n(key, value, iC, obj2, tVar.h(), tVar.i(), tVar.j());
                        if (iN != -1) {
                            tVar.e(iN, iC);
                            tVar.f8364x--;
                            tVar.f8363w += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                t tVar2 = this.f8351e;
                Map mapB2 = tVar2.b();
                if (mapB2 != null) {
                    return mapB2.keySet().remove(obj);
                }
                return tVar2.g(obj) != t.G;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f8350d) {
            case 0:
                break;
        }
        return this.f8351e.size();
    }
}
