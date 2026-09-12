package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import t.a;

/* JADX INFO: loaded from: classes.dex */
public class SimpleArrayMap {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f1221e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1222i;

    public SimpleArrayMap(int i7) {
        this.f1220d = i7 == 0 ? a.f20566a : new int[i7];
        this.f1221e = i7 == 0 ? a.f20568c : new Object[i7 << 1];
    }

    public final int a(Object obj) {
        int i7 = this.f1222i * 2;
        Object[] objArr = this.f1221e;
        if (obj == null) {
            for (int i10 = 1; i10 < i7; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i7; i11 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i7) {
        int i10 = this.f1222i;
        int[] iArr = this.f1220d;
        if (iArr.length < i7) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1220d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1221e, i7 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f1221e = objArrCopyOf;
        }
        if (this.f1222i != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i7, Object obj) {
        int i10 = this.f1222i;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(i10, i7, this.f1220d);
        if (iA < 0 || Intrinsics.areEqual(obj, this.f1221e[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f1220d[i11] == i7) {
            if (Intrinsics.areEqual(obj, this.f1221e[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f1220d[i12] == i7; i12--) {
            if (Intrinsics.areEqual(obj, this.f1221e[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f1222i > 0) {
            this.f1220d = a.f20566a;
            this.f1221e = a.f20568c;
            this.f1222i = 0;
        }
        if (this.f1222i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i7 = this.f1222i;
        if (i7 == 0) {
            return -1;
        }
        int iA = a.a(i7, 0, this.f1220d);
        if (iA < 0 || this.f1221e[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i7 && this.f1220d[i10] == 0) {
            if (this.f1221e[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f1220d[i11] == 0; i11--) {
            if (this.f1221e[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                int i7 = this.f1222i;
                if (i7 != ((SimpleArrayMap) obj).f1222i) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                for (int i10 = 0; i10 < i7; i10++) {
                    Object objF = f(i10);
                    Object objI = i(i10);
                    Object obj2 = simpleArrayMap.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(objF)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(objI, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f1222i != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f1222i;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objF2 = f(i12);
                Object objI2 = i(i12);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objI2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        boolean z5 = false;
        if (i7 >= 0 && i7 < this.f1222i) {
            z5 = true;
        }
        if (z5) {
            return this.f1221e[i7 << 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final Object g(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f1222i)) {
            a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f1221e;
        int i11 = i7 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f1220d;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i12) {
                int i13 = i7 + 1;
                w.e(i7, i13, iArr, iArr, i10);
                Object[] objArr2 = this.f1221e;
                w.d(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f1221e;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1220d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1221e, i15 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f1221e = objArrCopyOf;
            if (i10 != this.f1222i) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                w.e(0, 0, iArr, this.f1220d, i7);
                w.d(0, 0, i11, objArr, this.f1221e);
            }
            if (i7 < i12) {
                int i16 = i7 + 1;
                w.e(i7, i16, iArr, this.f1220d, i10);
                w.d(i11, i16 << 1, i10 << 1, objArr, this.f1221e);
            }
        }
        if (i10 != this.f1222i) {
            throw new ConcurrentModificationException();
        }
        this.f1222i = i12;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f1221e[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f1221e[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i7, Object obj) {
        boolean z5 = false;
        if (i7 >= 0 && i7 < this.f1222i) {
            z5 = true;
        }
        if (!z5) {
            a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i10 = (i7 << 1) + 1;
        Object[] objArr = this.f1221e;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f1220d;
        Object[] objArr = this.f1221e;
        int i7 = this.f1222i;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i7) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i7) {
        boolean z5 = false;
        if (i7 >= 0 && i7 < this.f1222i) {
            z5 = true;
        }
        if (z5) {
            return this.f1221e[(i7 << 1) + 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f1222i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i7 = this.f1222i;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i10 = (iC << 1) + 1;
            Object[] objArr = this.f1221e;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iC;
        int[] iArr = this.f1220d;
        if (i7 >= iArr.length) {
            int i12 = 8;
            if (i7 >= 8) {
                i12 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1220d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1221e, i12 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f1221e = objArrCopyOf;
            if (i7 != this.f1222i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i7) {
            int[] iArr2 = this.f1220d;
            int i13 = i11 + 1;
            w.e(i13, i11, iArr2, iArr2, i7);
            Object[] objArr2 = this.f1221e;
            w.d(i13 << 1, i11 << 1, this.f1222i << 1, objArr2, objArr2);
        }
        int i14 = this.f1222i;
        if (i7 == i14) {
            int[] iArr3 = this.f1220d;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f1221e;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f1222i = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f1222i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1222i * 28);
        sb2.append('{');
        int i7 = this.f1222i;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i10);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objI = i(i10);
            if (objI != sb2) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.areEqual(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.areEqual(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }
}
