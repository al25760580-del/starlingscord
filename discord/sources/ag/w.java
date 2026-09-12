package ag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends r implements NavigableMap {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final w f586x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient e0 f587i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient q f588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient w f589w;

    static {
        e0 e0VarR = x.r(a0.f499e);
        m mVar = q.f567e;
        f586x = new w(e0VarR, c0.f510w, null);
    }

    public w(e0 e0Var, q qVar, w wVar) {
        this.f587i = e0Var;
        this.f588v = qVar;
        this.f589w = wVar;
    }

    public static w b(TreeMap treeMap) {
        Set set;
        a0 a0Var = a0.f499e;
        Comparator comparator = treeMap.comparator();
        int i7 = 1;
        boolean zEquals = comparator == null ? true : a0Var.equals(comparator);
        Set setEntrySet = treeMap.entrySet();
        if (setEntrySet instanceof Collection) {
            set = setEntrySet;
        } else {
            Iterator it = setEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            set = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) set.toArray(r.f568e);
        int length = entryArr.length;
        if (length == 0) {
            return c(a0Var);
        }
        int i10 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i11 = 0; i11 < 1; i11++) {
                if (objArr[i11] == null) {
                    throw new NullPointerException(kk.b.h(i11, "at index "));
                }
            }
            e0 e0Var = new e0(q.k(1, objArr), a0Var);
            Object[] objArr2 = {value};
            while (i10 < 1) {
                if (objArr2[i10] == null) {
                    throw new NullPointerException(kk.b.h(i10, "at index "));
                }
                i10++;
            }
            return new w(e0Var, q.k(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i10 < length) {
                Map.Entry entry2 = entryArr[i10];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                c.f(key2, value2);
                objArr3[i10] = key2;
                objArr4[i10] = value2;
                i10++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new t(0));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            c.f(objArr3[0], value3);
            while (i7 < length) {
                Map.Entry entry4 = entryArr[i7 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i7];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                c.f(key4, value4);
                objArr3[i7] = key4;
                objArr4[i7] = value4;
                if (a0Var.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(a3.e.m("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i7++;
                key3 = key4;
            }
        }
        return new w(new e0(q.k(length, objArr3), a0Var), q.k(length, objArr4), null);
    }

    public static w c(Comparator comparator) {
        if (a0.f499e.equals(comparator)) {
            return f586x;
        }
        e0 e0VarR = x.r(comparator);
        m mVar = q.f567e;
        return new w(e0VarR, c0.f510w, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f587i.f594v;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final w headMap(Object obj, boolean z5) {
        obj.getClass();
        return g(0, this.f587i.s(obj, z5));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f587i.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        w wVar = this.f589w;
        if (wVar != null) {
            return wVar;
        }
        boolean zIsEmpty = isEmpty();
        e0 e0Var = this.f587i;
        if (!zIsEmpty) {
            return new w((e0) e0Var.descendingSet(), this.f588v.i(), this);
        }
        Comparator comparator = e0Var.f594v;
        return c((comparator instanceof b0 ? (b0) comparator : new k(comparator)).b());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final w subMap(Object obj, boolean z5, Object obj2, boolean z6) {
        obj.getClass();
        obj2.getClass();
        if (this.f587i.f594v.compare(obj, obj2) <= 0) {
            return headMap(obj2, z6).tailMap(obj, z5);
        }
        throw new IllegalArgumentException(c.d("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final w tailMap(Object obj, boolean z5) {
        obj.getClass();
        return g(this.f587i.t(obj, z5), this.f588v.size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().k().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f587i.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    public final w g(int i7, int i10) {
        q qVar = this.f588v;
        if (i7 == 0) {
            if (i10 == qVar.size()) {
                return this;
            }
            i7 = 0;
        }
        e0 e0Var = this.f587i;
        return i7 == i10 ? c(e0Var.f594v) : new w(e0Var.v(i7, i10), qVar.subList(i7, i10), null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // ag.r, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        e0 e0Var = this.f587i;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(e0Var.f521x, obj, e0Var.f594v);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f588v.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f587i;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().k().get(this.f588v.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f587i.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f587i;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f588v.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f588v;
    }
}
