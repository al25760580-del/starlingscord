package vp;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractList implements RandomAccess, s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f21917e = new d0(new r());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21918d;

    public r() {
        this.f21918d = new ArrayList();
    }

    @Override // vp.s
    public final d O(int i7) {
        d tVar;
        ArrayList arrayList = this.f21918d;
        Object obj = arrayList.get(i7);
        if (obj instanceof d) {
            tVar = (d) obj;
        } else if (obj instanceof String) {
            try {
                tVar = new t(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            tVar = new t(bArr2);
        }
        if (tVar != obj) {
            arrayList.set(i7, tVar);
        }
        return tVar;
    }

    @Override // vp.s
    public final void T(t tVar) {
        this.f21918d.add(tVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f21918d.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f21918d.size(), collection);
    }

    @Override // vp.s
    public final List c() {
        return Collections.unmodifiableList(this.f21918d);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f21918d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // vp.s
    public final d0 f() {
        return new d0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f21918d;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strS = dVar.s();
            if (dVar.j()) {
                arrayList.set(i7, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = p.f21915a;
        try {
            String str = new String(bArr, "UTF-8");
            if (a0.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
            return str;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        Object objRemove = this.f21918d.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof d) {
            return ((d) objRemove).s();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = p.f21915a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Object obj2 = this.f21918d.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof d) {
            return ((d) obj2).s();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = p.f21915a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21918d.size();
    }

    public r(s sVar) {
        this.f21918d = new ArrayList(sVar.size());
        addAll(sVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection instanceof s) {
            collection = ((s) collection).c();
        }
        boolean zAddAll = this.f21918d.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
