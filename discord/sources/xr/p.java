package xr;

import ag.t;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import lq.x;
import net.time4j.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Comparator, g {
    public static final CopyOnWriteArrayList F = new CopyOnWriteArrayList();
    public static final ReferenceQueue G = new ReferenceQueue();
    public final ga.k E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f23066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f23067e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f23068i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map f23069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f23070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Map f23071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q f23072y;

    public p(Class cls, g gVar, HashMap map, HashMap map2, HashMap map3, HashMap map4, ArrayList arrayList, HashMap map5, q qVar, q qVar2, ga.k kVar, t tVar) {
        if (gVar == null) {
            throw new NullPointerException("Missing chronological merger.");
        }
        this.f23066d = cls;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        this.f23067e = mapUnmodifiableMap;
        this.f23068i = Collections.unmodifiableList(arrayList);
        HashMap map6 = new HashMap();
        for (d dVar : mapUnmodifiableMap.keySet()) {
            if (dVar.getType() == Integer.class) {
                Object obj = this.f23067e.get(dVar);
                if (obj instanceof v0) {
                    map6.put(dVar, (v0) obj);
                }
            }
        }
        this.f23069v = Collections.unmodifiableMap(map6);
        this.f23070w = Collections.unmodifiableMap(map2);
        Collections.unmodifiableMap(map3);
        Collections.unmodifiableMap(map4);
        this.f23071x = Collections.unmodifiableMap(map5);
        this.f23072y = qVar;
        this.E = kVar;
        new o(cls, qVar, qVar2);
        if (tVar == null) {
            ArrayList arrayList2 = new ArrayList(map2.keySet());
            Collections.sort(arrayList2, new x(1, map3));
            arrayList2.get(0);
        }
    }

    public final Object b(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Missing element.");
        }
        Map map = this.f23071x;
        Object obj = map.get(dVar);
        if (obj == null && (dVar instanceof a)) {
            obj = map.get(((a) dVar).j());
        }
        if (obj != null) {
            return obj;
        }
        throw new f("Base unit not found for: " + dVar.name());
    }

    public final ga.k c() {
        ga.k kVar = this.E;
        if (kVar != null) {
            return kVar;
        }
        throw new f("Calendar system is not available.");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((q) obj).i((q) obj2);
    }

    public final j d(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        j jVar = (j) this.f23067e.get(dVar);
        if (jVar != null) {
            return jVar;
        }
        j jVarF = null;
        if ((dVar instanceof a) && e.class.isAssignableFrom(this.f23066d)) {
            a aVar = (a) a.class.cast(dVar);
            String strK = aVar.k(this);
            if (strK != null) {
                throw new l(strK);
            }
            jVarF = aVar.f(this);
        }
        if (jVarF != null) {
            return jVarF;
        }
        throw new l("Cannot find any rule for chronological element \"" + dVar.name() + "\" in: " + this.f23066d.getName());
    }

    public final boolean e(d dVar) {
        return dVar != null && this.f23067e.containsKey(dVar);
    }
}
