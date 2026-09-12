package s;

import androidx.collection.SimpleArrayMap;
import androidx.datastore.preferences.protobuf.c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends SimpleArrayMap implements Map {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c1 f19621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f19622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f19623x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SimpleArrayMap map) {
        super(0);
        Intrinsics.checkNotNullParameter(map, "map");
        int i7 = map.f1222i;
        b(this.f1222i + i7);
        if (this.f1222i != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                put(map.f(i10), map.i(i10));
            }
        } else if (i7 > 0) {
            w.e(0, 0, map.f1220d, this.f1220d, i7);
            w.d(0, 0, i7 << 1, map.f1221e, this.f1221e);
            this.f1222i = i7;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        c1 c1Var = this.f19621v;
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(this, 2);
        this.f19621v = c1Var2;
        return c1Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i7 = this.f1222i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f1222i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f19622w;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f19622w = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i7 = this.f1222i;
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (!collection.contains(f(i10))) {
                g(i10);
            }
        }
        return i7 != this.f1222i;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f1222i);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f19623x;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f19623x = dVar2;
        return dVar2;
    }
}
