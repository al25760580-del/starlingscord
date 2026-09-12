package ga;

import gc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.i f9531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9532b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9533c = 0;

    public c(ue.i iVar) {
        this.f9531a = iVar;
    }

    public final synchronized int a() {
        return this.f9532b.size();
    }

    public final synchronized ArrayList b(o oVar) {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f9532b.entrySet().size());
        for (Map.Entry entry : this.f9532b.entrySet()) {
            if (oVar.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public final synchronized int c() {
        return this.f9533c;
    }

    public final synchronized void d(Object obj, Object obj2) {
        Object objRemove = this.f9532b.remove(obj);
        this.f9533c -= objRemove == null ? 0 : this.f9531a.e(objRemove);
        this.f9532b.put(obj, obj2);
        this.f9533c += this.f9531a.e(obj2);
    }

    public final synchronized Object e(Object obj) {
        Object objRemove;
        objRemove = this.f9532b.remove(obj);
        this.f9533c -= objRemove == null ? 0 : this.f9531a.e(objRemove);
        return objRemove;
    }

    public final synchronized ArrayList f(n8.g gVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f9532b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (gVar.apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                int i7 = this.f9533c;
                Object value = entry.getValue();
                this.f9533c = i7 - (value == null ? 0 : this.f9531a.e(value));
                it.remove();
            }
        }
        return arrayList;
    }
}
