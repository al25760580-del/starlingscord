package ag;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w f584v;

    public v(w wVar) {
        this.f584v = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f584v.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // ag.l
    public final i0 e() {
        return k().listIterator(0);
    }

    @Override // ag.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return c.b(this.f584v.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // ag.s
    public final q m() {
        return new u(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f584v.f588v.size();
    }
}
