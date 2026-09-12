package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends AbstractMap {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6197y = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f6198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6199e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f6200i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c1 f6202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f6203x;

    public z2() {
        Map map = Collections.EMPTY_MAP;
        this.f6200i = map;
        this.f6203x = map;
    }

    public final Set a() {
        return this.f6200i.isEmpty() ? Collections.EMPTY_SET : this.f6200i.entrySet();
    }

    public final void b(Object obj) {
        f();
        d();
        f();
        if (this.f6198d == null) {
            this.f6198d = new Object[16];
        }
        if (this.f6199e == 16) {
            a3 a3Var = (a3) this.f6198d[15];
            this.f6199e = 15;
            SortedMap sortedMapE = e();
            a3Var.getClass();
            sortedMapE.put(null, a3Var.f5971d);
        }
        Object[] objArr = this.f6198d;
        int length = objArr.length;
        System.arraycopy(objArr, 0, objArr, 1, 15);
        this.f6198d[0] = new a3(this, obj);
        this.f6199e++;
    }

    public final a3 c(int i7) {
        if (i7 < this.f6199e) {
            return (a3) this.f6198d[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f6199e != 0) {
            this.f6198d = null;
            this.f6199e = 0;
        }
        if (this.f6200i.isEmpty()) {
            return;
        }
        this.f6200i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        return this.f6200i.containsKey(null);
    }

    public final void d() {
        int i7 = this.f6199e - 1;
        if (i7 >= 0) {
            ((a3) this.f6198d[i7]).getClass();
            throw null;
        }
        if (i7 < 0) {
            return;
        }
        ((a3) this.f6198d[i7 / 2]).getClass();
        throw null;
    }

    public final SortedMap e() {
        f();
        if (this.f6200i.isEmpty() && !(this.f6200i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6200i = treeMap;
            this.f6203x = treeMap.descendingMap();
        }
        return (SortedMap) this.f6200i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6202w == null) {
            this.f6202w = new androidx.datastore.preferences.protobuf.c1(this, 1);
        }
        return this.f6202w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return super.equals(obj);
        }
        z2 z2Var = (z2) obj;
        int size = size();
        if (size == z2Var.size()) {
            int i7 = this.f6199e;
            if (i7 != z2Var.f6199e) {
                return entrySet().equals(z2Var.entrySet());
            }
            for (int i10 = 0; i10 < i7; i10++) {
                if (c(i10).equals(z2Var.c(i10))) {
                }
            }
            if (i7 != size) {
                return this.f6200i.equals(z2Var.f6200i);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f6201v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        return this.f6200i.get(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = this.f6199e;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            iHashCode += this.f6198d[i10].hashCode();
        }
        return this.f6200i.size() > 0 ? this.f6200i.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        b(obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        if (this.f6200i.isEmpty()) {
            return null;
        }
        return this.f6200i.remove(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6200i.size() + this.f6199e;
    }
}
