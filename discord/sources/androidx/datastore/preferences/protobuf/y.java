package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b implements z, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1973e;

    static {
        new y(10).f1821d = false;
    }

    public y(int i7) {
        this(new ArrayList(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object U(int i7) {
        return this.f1973e.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        a();
        this.f1973e.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f1973e.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final List c() {
        return Collections.unmodifiableList(this.f1973e);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f1973e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final z f() {
        return this.f1821d ? new i1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.t
    public final t g(int i7) {
        ArrayList arrayList = this.f1973e;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new y(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f1973e;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof e)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, u.f1936a);
            if (q1.f1929a.i(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
            return str;
        }
        e eVar = (e) obj;
        String str2 = eVar.size() == 0 ? "" : new String(eVar.f1838e, eVar.b(), eVar.size(), u.f1936a);
        int iB = eVar.b();
        if (q1.f1929a.i(eVar.f1838e, iB, eVar.size() + iB) == 0) {
            arrayList.set(i7, str2);
        }
        return str2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        Object objRemove = this.f1973e.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof e)) {
            return new String((byte[]) objRemove, u.f1936a);
        }
        e eVar = (e) objRemove;
        return eVar.size() == 0 ? "" : new String(eVar.f1838e, eVar.b(), eVar.size(), u.f1936a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        Object obj2 = this.f1973e.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof e)) {
            return new String((byte[]) obj2, u.f1936a);
        }
        e eVar = (e) obj2;
        return eVar.size() == 0 ? "" : new String(eVar.f1838e, eVar.b(), eVar.size(), u.f1936a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1973e.size();
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final void u(e eVar) {
        a();
        this.f1973e.add(eVar);
        ((AbstractList) this).modCount++;
    }

    public y(ArrayList arrayList) {
        this.f1973e = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof z) {
            collection = ((z) collection).c();
        }
        boolean zAddAll = this.f1973e.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
