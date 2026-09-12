package sn;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Map, Serializable, KMutableMap {

    @NotNull
    public static final f K = new f(null);
    public static final i L;
    public int E;
    public int F;
    public k G;
    public l H;
    public j I;
    public boolean J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f20314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f20315e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f20316i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f20317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20320y;

    static {
        i iVar = new i(0);
        iVar.J = true;
        L = iVar;
    }

    public i() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i7 = this.f20318w * 2;
            int length = this.f20317v.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f20317v;
                int i11 = iArr[iJ];
                if (i11 <= 0) {
                    int i12 = this.f20319x;
                    Object[] objArr = this.f20314d;
                    if (i12 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i13 = i12 + 1;
                    this.f20319x = i13;
                    objArr[i12] = obj;
                    this.f20316i[i12] = iJ;
                    iArr[iJ] = i13;
                    this.F++;
                    this.E++;
                    if (i10 > this.f20318w) {
                        this.f20318w = i10;
                    }
                    return i12;
                }
                if (Intrinsics.areEqual(this.f20314d[i11 - 1], obj)) {
                    return -i11;
                }
                i10++;
                if (i10 > i7) {
                    k(this.f20317v.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f20317v.length - 1 : iJ - 1;
            }
        }
    }

    public final i b() {
        c();
        this.J = true;
        if (this.F > 0) {
            return this;
        }
        i iVar = L;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return iVar;
    }

    public final void c() {
        if (this.J) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f20319x - 1;
        if (i7 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f20316i;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f20317v[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i7) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        sa.a.D(this.f20314d, 0, this.f20319x);
        Object[] objArr = this.f20315e;
        if (objArr != null) {
            sa.a.D(objArr, 0, this.f20319x);
        }
        this.F = 0;
        this.f20319x = 0;
        this.E++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z5) {
        int i7;
        Object[] objArr = this.f20315e;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = this.f20319x;
            if (i10 >= i7) {
                break;
            }
            int[] iArr = this.f20316i;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f20314d;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z5) {
                    iArr[i11] = i12;
                    this.f20317v[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        sa.a.D(this.f20314d, i11, i7);
        if (objArr != null) {
            sa.a.D(objArr, i11, this.f20319x);
        }
        this.f20319x = i11;
    }

    public final boolean e(Collection m5) {
        Intrinsics.checkNotNullParameter(m5, "m");
        for (Object obj : m5) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.I;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.I = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.F == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f20315e;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[iH], entry.getValue());
    }

    public final void g(int i7) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f20314d;
        int length = objArr.length;
        int i10 = this.f20319x;
        int i11 = length - i10;
        int i12 = i10 - this.F;
        if (i11 < i7 && i11 + i12 >= i7 && i12 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i7;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            kotlin.collections.d dVar = kotlin.collections.h.f14644d;
            int length2 = objArr.length;
            dVar.getClass();
            int iE = kotlin.collections.d.e(length2, i13);
            Object[] objArr2 = this.f20314d;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
            this.f20314d = objArrCopyOf2;
            Object[] objArr3 = this.f20315e;
            if (objArr3 != null) {
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f20315e = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f20316i, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f20316i = iArrCopyOf;
            K.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.f20317v.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f20315e;
        Intrinsics.checkNotNull(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i7 = this.f20318w;
        while (true) {
            int i10 = this.f20317v[iJ];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (Intrinsics.areEqual(this.f20314d[i11], obj)) {
                    return i11;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f20317v.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        g gVar = new g(this, 0);
        int i7 = 0;
        while (gVar.hasNext()) {
            int i10 = gVar.f1671d;
            i iVar = (i) gVar.f1674v;
            if (i10 >= iVar.f20319x) {
                throw new NoSuchElementException();
            }
            gVar.f1671d = i10 + 1;
            gVar.f1672e = i10;
            Object obj = iVar.f20314d[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = iVar.f20315e;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[gVar.f1672e];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            gVar.e();
            i7 += iHashCode ^ iHashCode2;
        }
        return i7;
    }

    public final int i(Object obj) {
        int i7 = this.f20319x;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f20316i[i7] >= 0) {
                Object[] objArr = this.f20315e;
                Intrinsics.checkNotNull(objArr);
                if (Intrinsics.areEqual(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.F == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f20320y;
    }

    public final void k(int i7) {
        int[] iArr;
        this.E++;
        int i10 = 0;
        if (this.f20319x > this.F) {
            d(false);
        }
        this.f20317v = new int[i7];
        K.getClass();
        this.f20320y = Integer.numberOfLeadingZeros(i7) + 1;
        while (i10 < this.f20319x) {
            int i11 = i10 + 1;
            int iJ = j(this.f20314d[i10]);
            int i12 = this.f20318w;
            while (true) {
                iArr = this.f20317v;
                if (iArr[iJ] == 0) {
                    break;
                }
                i12--;
                if (i12 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i11;
            this.f20316i[i10] = iJ;
            i10 = i11;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.G;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.G = kVar2;
        return kVar2;
    }

    public final void l(int i7) {
        Object[] objArr = this.f20314d;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f20315e;
        if (objArr2 != null) {
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            objArr2[i7] = null;
        }
        int length = this.f20316i[i7];
        int i10 = this.f20318w * 2;
        int length2 = this.f20317v.length / 2;
        if (i10 > length2) {
            i10 = length2;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = length;
        do {
            length = length == 0 ? this.f20317v.length - 1 : length - 1;
            i12++;
            if (i12 > this.f20318w) {
                this.f20317v[i13] = 0;
            } else {
                int[] iArr = this.f20317v;
                int i14 = iArr[length];
                if (i14 == 0) {
                    iArr[i13] = 0;
                } else {
                    if (i14 < 0) {
                        iArr[i13] = -1;
                    } else {
                        int i15 = i14 - 1;
                        int iJ = j(this.f20314d[i15]) - length;
                        int[] iArr2 = this.f20317v;
                        if ((iJ & (iArr2.length - 1)) >= i12) {
                            iArr2[i13] = i14;
                            this.f20316i[i15] = i13;
                        }
                        i11--;
                    }
                    i13 = length;
                    i12 = 0;
                    i11--;
                }
            }
            this.f20316i[i7] = -1;
            this.F--;
            this.E++;
        } while (i11 >= 0);
        this.f20317v[i13] = -1;
        this.f20316i[i7] = -1;
        this.F--;
        this.E++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f20315e;
        if (objArr == null) {
            int length = this.f20314d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f20315e = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i7 = (-iA) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f20315e;
            if (objArr == null) {
                int length = this.f20314d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f20315e = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i7 = (-iA) - 1;
                if (!Intrinsics.areEqual(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f20315e;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.F;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.F * 3) + 2);
        sb2.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        int i7 = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            if (i7 > 0) {
                sb2.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb2, "sb");
            int i10 = gVar.f1671d;
            i iVar = (i) gVar.f1674v;
            if (i10 >= iVar.f20319x) {
                throw new NoSuchElementException();
            }
            gVar.f1671d = i10 + 1;
            gVar.f1672e = i10;
            Object obj = iVar.f20314d[i10];
            if (obj == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = iVar.f20315e;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[gVar.f1672e];
            if (obj2 == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            gVar.e();
            i7++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.H;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.H = lVar2;
        return lVar2;
    }

    public i(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        K.getClass();
        int iHighestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f20314d = objArr;
        this.f20315e = null;
        this.f20316i = iArr;
        this.f20317v = new int[iHighestOneBit];
        this.f20318w = 2;
        this.f20319x = 0;
        this.f20320y = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
