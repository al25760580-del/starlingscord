package ei;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends o implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient Map f8335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient int f8336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient m0 f8337x;

    @Override // ei.o
    public final d a() {
        d iVar;
        d dVar = this.f8340i;
        if (dVar != null) {
            return dVar;
        }
        Map map = this.f8335v;
        if (map instanceof NavigableMap) {
            iVar = new f(this, (NavigableMap) map);
        } else {
            iVar = map instanceof SortedMap ? new i(this, (SortedMap) map) : new d(this, map);
        }
        this.f8340i = iVar;
        return iVar;
    }

    public final void b() {
        Map map = this.f8335v;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f8336w = 0;
    }
}
