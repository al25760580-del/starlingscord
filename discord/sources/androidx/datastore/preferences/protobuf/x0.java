package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends AbstractMap {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1966y = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f1968e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f1969i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1970v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile c1 f1971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f1972x;

    public x0(int i7) {
        this.f1967d = i7;
        Map map = Collections.EMPTY_MAP;
        this.f1969i = map;
        this.f1972x = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i7;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f1968e.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i7 = 0;
            while (i7 <= i12) {
                i11 = (i7 + i12) / 2;
                iCompareTo = comparable.compareTo(((a1) this.f1968e.get(i11)).f1818d);
                if (iCompareTo < 0) {
                    i12 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i7 = i11 + 1;
                }
            }
            i10 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((a1) this.f1968e.get(i12)).f1818d);
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i7 = 0;
                while (i7 <= i12) {
                    i11 = (i7 + i12) / 2;
                    iCompareTo = comparable.compareTo(((a1) this.f1968e.get(i11)).f1818d);
                    if (iCompareTo < 0) {
                        i12 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i7 = i11 + 1;
                    }
                }
                i10 = i7 + 1;
            }
        }
        return -i10;
    }

    public final void b() {
        if (this.f1970v) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f1968e.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1968e.isEmpty()) {
            this.f1968e.clear();
        }
        if (this.f1969i.isEmpty()) {
            return;
        }
        this.f1969i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1969i.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f1969i.isEmpty() ? l0.f1884b : this.f1969i.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1969i.isEmpty() && !(this.f1969i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1969i = treeMap;
            this.f1972x = treeMap.descendingMap();
        }
        return (SortedMap) this.f1969i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1971w == null) {
            this.f1971w = new c1(this, 0);
        }
        return this.f1971w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return super.equals(obj);
        }
        x0 x0Var = (x0) obj;
        int size = size();
        if (size == x0Var.size()) {
            int size2 = this.f1968e.size();
            if (size2 != x0Var.f1968e.size()) {
                return ((AbstractSet) entrySet()).equals(x0Var.entrySet());
            }
            for (int i7 = 0; i7 < size2; i7++) {
                if (c(i7).equals(x0Var.c(i7))) {
                }
            }
            if (size2 != size) {
                return this.f1969i.equals(x0Var.f1969i);
            }
            return true;
        }
        return false;
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((a1) this.f1968e.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f1968e.isEmpty();
        int i7 = this.f1967d;
        if (zIsEmpty && !(this.f1968e instanceof ArrayList)) {
            this.f1968e = new ArrayList(i7);
        }
        int i10 = -(iA + 1);
        if (i10 >= i7) {
            return e().put(comparable, obj);
        }
        if (this.f1968e.size() == i7) {
            a1 a1Var = (a1) this.f1968e.remove(i7 - 1);
            e().put(a1Var.f1818d, a1Var.f1819e);
        }
        this.f1968e.add(i10, new a1(this, comparable, obj));
        return null;
    }

    public final Object g(int i7) {
        b();
        Object obj = ((a1) this.f1968e.remove(i7)).f1819e;
        if (!this.f1969i.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1968e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new a1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((a1) this.f1968e.get(iA)).f1819e : this.f1969i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1968e.size();
        int iHashCode = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode += ((a1) this.f1968e.get(i7)).hashCode();
        }
        return this.f1969i.size() > 0 ? this.f1969i.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return f(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.f1969i.isEmpty()) {
            return null;
        }
        return this.f1969i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1969i.size() + this.f1968e.size();
    }
}
