package ij;

import com.google.zxing.Result;
import e4.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f11806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j[] f11807b;

    @Override // ij.j
    public final Result a(r rVar, Map map) {
        c(map);
        return b(rVar);
    }

    public final Result b(r rVar) throws h {
        j[] jVarArr = this.f11807b;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                try {
                    return jVar.a(rVar, this.f11806a);
                } catch (k unused) {
                }
            }
        }
        throw h.f11808i;
    }

    public final void c(Map map) {
        this.f11806a = map;
        boolean z5 = map != null && map.containsKey(c.f11796i);
        Collection collection = map == null ? null : (Collection) map.get(c.f11795e);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z6 = collection.contains(a.L) || collection.contains(a.M) || collection.contains(a.E) || collection.contains(a.f11792y) || collection.contains(a.f11787e) || collection.contains(a.f11788i) || collection.contains(a.f11789v) || collection.contains(a.f11790w) || collection.contains(a.F) || collection.contains(a.J) || collection.contains(a.K);
            if (z6 && !z5) {
                arrayList.add(new uj.g(map, 0));
            }
            if (collection.contains(a.I)) {
                arrayList.add(new ck.a());
            }
            if (collection.contains(a.f11791x)) {
                arrayList.add(new pj.a());
            }
            if (collection.contains(a.f11786d)) {
                arrayList.add(new jj.b(0));
            }
            if (collection.contains(a.H)) {
                arrayList.add(new jj.b(1));
            }
            if (collection.contains(a.G)) {
                arrayList.add(new sj.a());
            }
            if (z6 && z5) {
                arrayList.add(new uj.g(map, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z5) {
                arrayList.add(new uj.g(map, 0));
            }
            arrayList.add(new ck.a());
            arrayList.add(new pj.a());
            arrayList.add(new jj.b(0));
            arrayList.add(new jj.b(1));
            arrayList.add(new sj.a());
            if (z5) {
                arrayList.add(new uj.g(map, 0));
            }
        }
        this.f11807b = (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    @Override // ij.j
    public final void reset() {
        j[] jVarArr = this.f11807b;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                jVar.reset();
            }
        }
    }
}
