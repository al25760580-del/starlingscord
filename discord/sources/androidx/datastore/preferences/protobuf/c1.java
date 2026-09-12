package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.z2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c1 extends AbstractSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f1832e;

    public /* synthetic */ c1(Map map, int i7) {
        this.f1831d = i7;
        this.f1832e = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f1831d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((x0) this.f1832e).f((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                z2 z2Var = (z2) this.f1832e;
                if (entry2.getKey() != null) {
                    throw new ClassCastException();
                }
                z2Var.b(entry2.getValue());
                return true;
            case 2:
            default:
                return super.add(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((vp.y) this.f1832e).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f1831d) {
            case 0:
                ((x0) this.f1832e).clear();
                break;
            case 1:
                ((z2) this.f1832e).clear();
                break;
            case 2:
            default:
                super.clear();
                break;
            case 3:
                ((vp.y) this.f1832e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f1831d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((x0) this.f1832e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((z2) this.f1832e).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
            default:
                return super.contains(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((vp.y) this.f1832e).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f1831d) {
            case 0:
                return new b1((x0) this.f1832e, 0);
            case 1:
                return new b1((z2) this.f1832e);
            case 2:
                return new s.c((s.e) this.f1832e);
            default:
                return new b1((vp.y) this.f1832e, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f1831d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((x0) this.f1832e).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((z2) this.f1832e).remove(entry2.getKey());
                return true;
            case 2:
            default:
                return super.remove(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((vp.y) this.f1832e).remove(entry3.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1831d) {
            case 0:
                return ((x0) this.f1832e).size();
            case 1:
                return ((z2) this.f1832e).size();
            case 2:
                return ((s.e) this.f1832e).f1222i;
            default:
                return ((vp.y) this.f1832e).size();
        }
    }
}
