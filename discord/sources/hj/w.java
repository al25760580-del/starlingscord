package hj;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends c implements x, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10915e;

    static {
        new w();
    }

    public w(ArrayList arrayList) {
        super(true);
        this.f10915e = arrayList;
    }

    @Override // hj.x
    public final void B(g gVar) {
        a();
        this.f10915e.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        a();
        this.f10915e.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // hj.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f10915e.size(), collection);
    }

    @Override // hj.x
    public final List c() {
        return Collections.unmodifiableList(this.f10915e);
    }

    @Override // hj.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f10915e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // hj.x
    public final x f() {
        return this.f10806d ? new x0(this) : this;
    }

    @Override // hj.s
    public final s g(int i7) {
        List list = this.f10915e;
        if (i7 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(list);
        return new w(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        List list = this.f10915e;
        Object obj = list.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof g)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, t.f10906a);
            if (e1.f10825a.v(bArr, 0, bArr.length) == 0) {
                list.set(i7, str);
            }
            return str;
        }
        g gVar = (g) obj;
        String str2 = gVar.size() == 0 ? "" : new String(gVar.f10831e, gVar.e(), gVar.size(), t.f10906a);
        int iE = gVar.e();
        if (e1.f10825a.v(gVar.f10831e, iE, gVar.size() + iE) == 0) {
            list.set(i7, str2);
        }
        return str2;
    }

    @Override // hj.c, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        Object objRemove = this.f10915e.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof g)) {
            return new String((byte[]) objRemove, t.f10906a);
        }
        g gVar = (g) objRemove;
        return gVar.size() == 0 ? "" : new String(gVar.f10831e, gVar.e(), gVar.size(), t.f10906a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        Object obj2 = this.f10915e.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g)) {
            return new String((byte[]) obj2, t.f10906a);
        }
        g gVar = (g) obj2;
        return gVar.size() == 0 ? "" : new String(gVar.f10831e, gVar.e(), gVar.size(), t.f10906a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10915e.size();
    }

    public w() {
        super(false);
        this.f10915e = Collections.EMPTY_LIST;
    }

    @Override // hj.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof x) {
            collection = ((x) collection).c();
        }
        boolean zAddAll = this.f10915e.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public w(int i7) {
        this(new ArrayList(i7));
    }
}
