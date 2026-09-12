package ei;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Map, Serializable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final w0 f8376y = new w0(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient t0 f8377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient u0 f8378e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient v0 f8379i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object f8380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object[] f8381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f8382x;

    public w0(Object obj, Object[] objArr, int i7) {
        this.f8380v = obj;
        this.f8381w = objArr;
        this.f8382x = i7;
    }

    public static w0 a(Map map) {
        if ((map instanceof w0) && !(map instanceof SortedMap)) {
            return (w0) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z5 = setEntrySet instanceof Collection;
        a1.d dVar = new a1.d(z5 ? setEntrySet.size() : 4, 6);
        if (z5) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) dVar.f18i;
            if (size > objArr.length) {
                dVar.f18i = Arrays.copyOf(objArr, y.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            dVar.x(entry.getKey(), entry.getValue());
        }
        return dVar.b();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h0 entrySet() {
        t0 t0Var = this.f8377d;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this, this.f8381w, this.f8382x);
        this.f8377d = t0Var2;
        return t0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        v0 v0Var = this.f8379i;
        if (v0Var == null) {
            v0Var = new v0(this.f8381w, 1, this.f8382x);
            this.f8379i = v0Var;
        }
        return v0Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return p.e(this, obj);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f8381w;
            if (this.f8382x == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f8380v;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iP = p.p(obj.hashCode());
                    while (true) {
                        int i7 = iP & length;
                        int i10 = bArr[i7] & 255;
                        if (i10 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            obj2 = objArr[i10 ^ 1];
                        } else {
                            iP = i7 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iP2 = p.p(obj.hashCode());
                    while (true) {
                        int i11 = iP2 & length2;
                        int i12 = sArr[i11] & 65535;
                        if (i12 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iP2 = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iP3 = p.p(obj.hashCode());
                    while (true) {
                        int i13 = iP3 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iP3 = i13 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return p.j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        u0 u0Var = this.f8378e;
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0(this, new v0(this.f8381w, 0, this.f8382x));
        this.f8378e = u0Var2;
        return u0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8382x;
    }

    public final String toString() {
        int i7 = this.f8382x;
        p.c(i7, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i7) * 8, 1073741824L));
        sb2.append('{');
        e1 it = ((t0) entrySet()).iterator();
        boolean z5 = true;
        while (true) {
            c0 c0Var = (c0) it;
            if (!c0Var.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) c0Var.next();
            if (!z5) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z5 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        v0 v0Var = this.f8379i;
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0(this.f8381w, 1, this.f8382x);
        this.f8379i = v0Var2;
        return v0Var2;
    }
}
