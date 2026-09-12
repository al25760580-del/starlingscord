package ei;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends a1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f8283d).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f8283d.iterator();
        it.getClass();
        di.g gVar = this.f8284e;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new b1(((SortedSet) this.f8283d).headSet(obj), this.f8284e);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f8283d;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f8284e.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new b1(((SortedSet) this.f8283d).subSet(obj, obj2), this.f8284e);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new b1(((SortedSet) this.f8283d).tailSet(obj), this.f8284e);
    }
}
