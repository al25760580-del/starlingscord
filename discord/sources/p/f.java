package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f17721e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakHashMap f17722i = new WeakHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17723v = 0;

    public c a(Object obj) {
        c cVar = this.f17720d;
        while (cVar != null && !cVar.f17713d.equals(obj)) {
            cVar = cVar.f17715i;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f17723v--;
        WeakHashMap weakHashMap = this.f17722i;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f17716v;
        if (cVar != null) {
            cVar.f17715i = cVarA.f17715i;
        } else {
            this.f17720d = cVarA.f17715i;
        }
        c cVar2 = cVarA.f17715i;
        if (cVar2 != null) {
            cVar2.f17716v = cVar;
        } else {
            this.f17721e = cVar;
        }
        cVarA.f17715i = null;
        cVarA.f17716v = null;
        return cVarA.f17714e;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17723v != fVar.f17723v) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f17720d, this.f17721e, 0);
        this.f17722i.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
