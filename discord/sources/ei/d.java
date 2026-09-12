package ei;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public class d extends AbstractMap {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient b f8293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient n f8294e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Map f8295i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n0 f8296v;

    public d(n0 n0Var, Map map) {
        this.f8296v = n0Var;
        this.f8295i = map;
    }

    public final a0 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z5 = list instanceof RandomAccess;
        n0 n0Var = this.f8296v;
        return new a0(key, z5 ? new h(n0Var, key, list, null) : new l(n0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n0 n0Var = this.f8296v;
        if (this.f8295i == n0Var.f8335v) {
            n0Var.b();
            return;
        }
        c cVar = new c(this);
        while (cVar.hasNext()) {
            cVar.next();
            cVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f8295i;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.f8293d;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f8293d = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f8295i.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f8295i;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z5 = list instanceof RandomAccess;
        n0 n0Var = this.f8296v;
        return z5 ? new h(n0Var, obj, list, null) : new l(n0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f8295i.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        e jVar;
        n0 n0Var = this.f8296v;
        e eVar = n0Var.f8338d;
        if (eVar != null) {
            return eVar;
        }
        Map map = n0Var.f8335v;
        if (map instanceof NavigableMap) {
            jVar = new g(n0Var, (NavigableMap) map);
        } else {
            jVar = map instanceof SortedMap ? new j(n0Var, (SortedMap) map) : new e(n0Var, map);
        }
        n0Var.f8338d = jVar;
        return jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f8295i.remove(obj);
        if (collection == null) {
            return null;
        }
        n0 n0Var = this.f8296v;
        List list = (List) n0Var.f8337x.get();
        list.addAll(collection);
        n0Var.f8336w -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8295i.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f8295i.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.f8294e;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this);
        this.f8294e = nVar2;
        return nVar2;
    }
}
