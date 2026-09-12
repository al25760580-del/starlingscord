package he;

import ei.a1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f10714d;

    public v(Map map) {
        this.f10714d = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f10714d.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f10714d.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((a1) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ei.p.g(this.f10714d.entrySet(), new u(1));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && ei.p.e(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f10714d.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ei.p.j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f10714d;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return ei.p.g(this.f10714d.keySet(), new u(0));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f10714d.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f10714d.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f10714d.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f10714d;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f10714d.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f10714d.values();
    }
}
