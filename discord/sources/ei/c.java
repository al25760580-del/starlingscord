package ei;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8286d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterator f8287e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f8288i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8289v;

    public c(l lVar) {
        this.f8289v = lVar;
        Collection collection = lVar.f8325e;
        this.f8288i = collection;
        this.f8287e = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        l lVar = (l) this.f8289v;
        lVar.b();
        if (lVar.f8325e != ((Collection) this.f8288i)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8286d) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f8287e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8286d) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f8287e.next();
                this.f8288i = (Collection) entry.getValue();
                return ((d) this.f8289v).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f8287e.next();
                this.f8288i = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f8287e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8286d) {
            case 0:
                if (!(((Collection) this.f8288i) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f8287e.remove();
                ((d) this.f8289v).f8296v.f8336w -= ((Collection) this.f8288i).size();
                ((Collection) this.f8288i).clear();
                this.f8288i = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f8288i;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f8287e.remove();
                ((e) this.f8289v).f8302e.f8336w -= collection.size();
                collection.clear();
                this.f8288i = null;
                return;
            default:
                this.f8287e.remove();
                l lVar = (l) this.f8289v;
                lVar.f8328w.f8336w--;
                lVar.d();
                return;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.f8289v = lVar;
        this.f8288i = lVar.f8325e;
        this.f8287e = listIterator;
    }

    public c(e eVar, Iterator it) {
        this.f8289v = eVar;
        this.f8287e = it;
    }

    public c(d dVar) {
        this.f8289v = dVar;
        this.f8287e = dVar.f8295i.entrySet().iterator();
    }
}
