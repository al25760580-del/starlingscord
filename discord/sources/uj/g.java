package uj;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h[] f21160b;

    public g(Map map, int i7) {
        this.f21159a = i7;
        switch (i7) {
            case 1:
                Collection collection = map == null ? null : (Collection) map.get(ij.c.f11795e);
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(ij.a.E)) {
                        arrayList.add(new e(0));
                    } else if (collection.contains(ij.a.L)) {
                        arrayList.add(new e(3));
                    }
                    if (collection.contains(ij.a.f11792y)) {
                        arrayList.add(new e(2));
                    }
                    if (collection.contains(ij.a.M)) {
                        arrayList.add(new e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new e(0));
                    arrayList.add(new e(2));
                    arrayList.add(new e(1));
                }
                this.f21160b = (k[]) arrayList.toArray(new k[arrayList.size()]);
                break;
            default:
                Collection collection2 = map == null ? null : (Collection) map.get(ij.c.f11795e);
                boolean z5 = (map == null || map.get(ij.c.f11799x) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(ij.a.E) || collection2.contains(ij.a.L) || collection2.contains(ij.a.f11792y) || collection2.contains(ij.a.M)) {
                        arrayList2.add(new g(map, 1));
                    }
                    if (collection2.contains(ij.a.f11788i)) {
                        arrayList2.add(new c(z5));
                    }
                    if (collection2.contains(ij.a.f11789v)) {
                        arrayList2.add(new d());
                    }
                    if (collection2.contains(ij.a.f11790w)) {
                        arrayList2.add(new b());
                    }
                    if (collection2.contains(ij.a.F)) {
                        arrayList2.add(new f());
                    }
                    if (collection2.contains(ij.a.f11787e)) {
                        arrayList2.add(new a());
                    }
                    if (collection2.contains(ij.a.J)) {
                        arrayList2.add(new vj.e());
                    }
                    if (collection2.contains(ij.a.K)) {
                        arrayList2.add(new wj.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new g(map, 1));
                    arrayList2.add(new c(false));
                    arrayList2.add(new a());
                    arrayList2.add(new d());
                    arrayList2.add(new b());
                    arrayList2.add(new f());
                    arrayList2.add(new vj.e());
                    arrayList2.add(new wj.c());
                }
                this.f21160b = (h[]) arrayList2.toArray(new h[arrayList2.size()]);
                break;
        }
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) throws ij.h {
        switch (this.f21159a) {
            case 0:
                for (h hVar : this.f21160b) {
                    try {
                        return hVar.b(i7, aVar, map);
                    } catch (ij.k unused) {
                    }
                }
                throw ij.h.f11808i;
            default:
                int[] iArrM = k.m(aVar);
                for (k kVar : (k[]) this.f21160b) {
                    try {
                        Result resultK = kVar.k(i7, aVar, iArrM, map);
                        boolean z5 = resultK.f6651d == ij.a.E && resultK.f6648a.charAt(0) == '0';
                        Collection collection = map == null ? null : (Collection) map.get(ij.c.f11795e);
                        ij.a aVar2 = ij.a.L;
                        boolean z6 = collection == null || collection.contains(aVar2);
                        if (!z5 || !z6) {
                            return resultK;
                        }
                        Result result = new Result(resultK.f6648a.substring(1), resultK.f6649b, resultK.f6650c, aVar2);
                        result.a(resultK.f6652e);
                        return result;
                    } catch (ij.k unused2) {
                    }
                }
                throw ij.h.f11808i;
        }
    }

    @Override // uj.h, ij.j
    public final void reset() {
        switch (this.f21159a) {
            case 0:
                for (h hVar : this.f21160b) {
                    hVar.reset();
                }
                break;
            default:
                for (k kVar : (k[]) this.f21160b) {
                    kVar.getClass();
                }
                break;
        }
    }
}
