package xr;

import ag.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.time4j.x;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f23055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f23057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f23058d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f23059e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f23060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f23061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f23062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f23063i;
    public final q j;
    public final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ga.k f23064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f23065m;

    public n(Class cls, Class cls2, g gVar, q qVar, q qVar2, ga.k kVar) {
        this.f23055a = cls2;
        this.f23056b = cls2.getName().startsWith("net.time4j.");
        this.f23057c = gVar;
        this.f23065m = null;
        if (qVar == null) {
            throw new NullPointerException("Missing minimum of range.");
        }
        if (qVar2 == null) {
            throw new NullPointerException("Missing maximum of range.");
        }
        if (c.class.isAssignableFrom(cls2) && kVar == null) {
            throw new NullPointerException("Missing calendar system.");
        }
        this.f23060f = new HashMap();
        this.f23061g = new HashMap();
        this.f23062h = new HashMap();
        this.f23063i = new HashMap();
        this.j = qVar;
        this.k = qVar2;
        this.f23064l = kVar;
        this.f23065m = null;
    }

    public final void a(d dVar, j jVar, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Missing base unit.");
        }
        b(dVar, jVar);
        this.f23063i.put(dVar, obj);
    }

    public final void b(d dVar, j jVar) {
        boolean z5 = this.f23056b;
        HashMap map = this.f23058d;
        if (!z5) {
            if (dVar == null) {
                throw new NullPointerException("Static initialization problem: Check if given element statically refer to any chronology causing premature class loading.");
            }
            String strName = dVar.name();
            for (d dVar2 : map.keySet()) {
                if (dVar2.equals(dVar) || dVar2.name().equals(strName)) {
                    throw new IllegalArgumentException(a3.e.l("Element duplicate found: ", strName));
                }
            }
        }
        map.put(dVar, jVar);
    }

    public final void c(x xVar) {
        if (xVar == null) {
            throw new NullPointerException("Missing chronological extension.");
        }
        ArrayList arrayList = this.f23059e;
        if (arrayList.contains(xVar)) {
            return;
        }
        arrayList.add(xVar);
    }

    public final void d(Enum r10, s sVar, double d6, Set set) {
        if (r10 == null) {
            throw new NullPointerException("Missing time unit.");
        }
        boolean z5 = this.f23056b;
        HashMap map = this.f23060f;
        if (!z5) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (it.next().equals(r10)) {
                    throw new IllegalArgumentException("Unit duplicate found: " + r10.toString());
                }
            }
            String strName = ((Enum) Enum.class.cast(r10)).name();
            for (Object obj : map.keySet()) {
                if ((obj instanceof Enum) && ((Enum) Enum.class.cast(obj)).name().equals(strName)) {
                    throw new IllegalArgumentException(a3.e.l("Unit duplicate found: ", strName));
                }
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                throw new NullPointerException("Found convertible unit which is null.");
            }
        }
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Not a number: " + d6);
        }
        if (Double.isInfinite(d6)) {
            throw new IllegalArgumentException("Infinite: " + d6);
        }
        map.put(r10, sVar);
        this.f23061g.put(r10, Double.valueOf(d6));
        HashSet hashSet = new HashSet(set);
        hashSet.remove(r10);
        this.f23062h.put(r10, hashSet);
    }

    public final p e() {
        HashMap map = this.f23060f;
        if (map.isEmpty()) {
            throw new IllegalStateException("No time unit was registered.");
        }
        p pVar = new p(this.f23055a, this.f23057c, this.f23058d, map, this.f23061g, this.f23062h, this.f23059e, this.f23063i, this.j, this.k, this.f23064l, this.f23065m);
        p.F.add(new i(pVar, p.G));
        return pVar;
    }
}
