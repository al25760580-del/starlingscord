package vp;

import androidx.datastore.preferences.protobuf.c1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends AbstractMap {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f21930x = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f21932e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f21933i = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile c1 f21935w;

    public y(int i7) {
        this.f21931d = i7;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i7;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f21932e.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i7 = 0;
            while (i7 <= i12) {
                i11 = (i7 + i12) / 2;
                iCompareTo = comparable.compareTo(((b0) this.f21932e.get(i11)).f21861d);
                if (iCompareTo < 0) {
                    i12 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i7 = i11 + 1;
                }
            }
            i10 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((b0) this.f21932e.get(i12)).f21861d);
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i7 = 0;
                while (i7 <= i12) {
                    i11 = (i7 + i12) / 2;
                    iCompareTo = comparable.compareTo(((b0) this.f21932e.get(i11)).f21861d);
                    if (iCompareTo < 0) {
                        i12 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i7 = i11 + 1;
                    }
                }
                i10 = i7 + 1;
            }
        }
        return -i10;
    }

    public final void b() {
        if (this.f21934v) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f21933i.isEmpty() ? a0.f21860b : this.f21933i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f21932e.isEmpty()) {
            this.f21932e.clear();
        }
        if (this.f21933i.isEmpty()) {
            return;
        }
        this.f21933i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f21933i.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f21933i.isEmpty() && !(this.f21933i instanceof TreeMap)) {
            this.f21933i = new TreeMap();
        }
        return (SortedMap) this.f21933i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b0) this.f21932e.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f21932e.isEmpty();
        int i7 = this.f21931d;
        if (zIsEmpty && !(this.f21932e instanceof ArrayList)) {
            this.f21932e = new ArrayList(i7);
        }
        int i10 = -(iA + 1);
        if (i10 >= i7) {
            return d().put(comparable, obj);
        }
        if (this.f21932e.size() == i7) {
            b0 b0Var = (b0) this.f21932e.remove(i7 - 1);
            d().put(b0Var.f21861d, b0Var.f21862e);
        }
        this.f21932e.add(i10, new b0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f21935w == null) {
            this.f21935w = new c1(this, 3);
        }
        return this.f21935w;
    }

    public final Object f(int i7) {
        b();
        Object obj = ((b0) this.f21932e.remove(i7)).f21862e;
        if (!this.f21933i.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f21932e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b0) this.f21932e.get(iA)).f21862e : this.f21933i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f21933i.isEmpty()) {
            return null;
        }
        return this.f21933i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21933i.size() + this.f21932e.size();
    }
}
