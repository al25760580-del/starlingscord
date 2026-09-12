package ei;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8356e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f8357i;

    public s(t tVar, int i7) {
        this.f8357i = tVar;
        Object obj = t.G;
        this.f8355d = tVar.i()[i7];
        this.f8356e = i7;
    }

    public final void a() {
        int i7 = this.f8356e;
        Object obj = this.f8355d;
        t tVar = this.f8357i;
        if (i7 != -1 && i7 < tVar.size()) {
            if (ls.d.n(obj, tVar.i()[this.f8356e])) {
                return;
            }
        }
        Object obj2 = t.G;
        this.f8356e = tVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8355d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        t tVar = this.f8357i;
        Map mapB = tVar.b();
        if (mapB != null) {
            return mapB.get(this.f8355d);
        }
        a();
        int i7 = this.f8356e;
        if (i7 == -1) {
            return null;
        }
        return tVar.j()[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        t tVar = this.f8357i;
        Map mapB = tVar.b();
        Object obj2 = this.f8355d;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i7 = this.f8356e;
        if (i7 == -1) {
            tVar.put(obj2, obj);
            return null;
        }
        Object obj3 = tVar.j()[i7];
        tVar.j()[this.f8356e] = obj;
        return obj3;
    }
}
