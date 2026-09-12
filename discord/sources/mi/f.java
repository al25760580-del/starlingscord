package mi;

import a5.l0;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import pa.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements c {
    public static final com.google.firebase.messaging.j E = new com.google.firebase.messaging.j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f15809e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f15810i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f15811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f15812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReference f15813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s f15814y;

    public f(ArrayList arrayList, ArrayList arrayList2, s sVar) {
        ni.i iVar = ni.i.f16951d;
        this.f15808d = new HashMap();
        this.f15809e = new HashMap();
        this.f15810i = new HashMap();
        this.f15811v = new HashSet();
        this.f15813x = new AtomicReference();
        k kVar = new k();
        this.f15812w = kVar;
        this.f15814y = sVar;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.b(kVar, k.class, ui.b.class, ui.a.class));
        arrayList3.add(b.b(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((xi.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f15814y.o(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((b) it4.next()).f15800b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f15811v.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f15811v.add(obj.toString());
                    }
                }
            }
            if (this.f15808d.isEmpty()) {
                a.a.e(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f15808d.keySet());
                arrayList6.addAll(arrayList3);
                a.a.e(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.f15808d.put(bVar2, new m(new ji.b(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f15813x.get();
        if (bool != null) {
            a(this.f15808d, bool.booleanValue());
        }
    }

    public final void a(HashMap map, boolean z5) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            xi.a aVar = (xi.a) entry.getValue();
            int i7 = bVar.f15802d;
            if (i7 == 1 || (i7 == 2 && z5)) {
                aVar.get();
            }
        }
        k kVar = this.f15812w;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f15824b;
                if (arrayDeque != null) {
                    kVar.f15824b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw s0.g.a(it);
            }
        }
    }

    @Override // mi.c
    public final synchronized xi.a e(q qVar) {
        l0.l(qVar, "Null interface requested.");
        return (xi.a) this.f15809e.get(qVar);
    }

    @Override // mi.c
    public final synchronized xi.a g(q qVar) {
        n nVar = (n) this.f15810i.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return E;
    }

    public final void h() {
        for (b bVar : this.f15808d.keySet()) {
            for (i iVar : bVar.f15801c) {
                if (iVar.f15821b == 2 && !this.f15810i.containsKey(iVar.f15820a)) {
                    HashMap map = this.f15810i;
                    q qVar = iVar.f15820a;
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.f15830b = null;
                    nVar.f15829a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f15829a.addAll(set);
                    map.put(qVar, nVar);
                } else if (this.f15809e.containsKey(iVar.f15820a)) {
                    continue;
                } else {
                    int i7 = iVar.f15821b;
                    if (i7 == 1) {
                        throw new j("Unsatisfied dependency for component " + bVar + ": " + iVar.f15820a);
                    }
                    if (i7 != 2) {
                        HashMap map2 = this.f15809e;
                        q qVar2 = iVar.f15820a;
                        mc.q qVar3 = o.f15831c;
                        com.google.firebase.messaging.j jVar = o.f15832d;
                        o oVar = new o();
                        oVar.f15833a = qVar3;
                        oVar.f15834b = jVar;
                        map2.put(qVar2, oVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f15803e == 0) {
                xi.a aVar = (xi.a) this.f15808d.get(bVar);
                for (q qVar : bVar.f15800b) {
                    HashMap map = this.f15809e;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new io.sentry.react.d(9, (o) ((xi.a) map.get(qVar)), aVar));
                    } else {
                        map.put(qVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap map = this.f15810i;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f15808d.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f15803e != 0) {
                xi.a aVar = (xi.a) entry.getValue();
                for (q qVar : bVar.f15800b) {
                    if (!map2.containsKey(qVar)) {
                        map2.put(qVar, new HashSet());
                    }
                    ((Set) map2.get(qVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                n nVar = (n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.sentry.react.d(10, nVar, (xi.a) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f15830b = null;
                nVar2.f15829a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f15829a.addAll(set);
                map.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
