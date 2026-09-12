package ei;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static int a(int i7) {
        if (i7 < 3) {
            c(i7, "expectedSize");
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }

    public static void c(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i7);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object d(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            if (i7 <= 256) {
                return new byte[i7];
            }
            return i7 <= 65536 ? new short[i7] : new int[i7];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i7);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean e(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean f(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static a1 g(Set set, di.g gVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof a1)) {
                return new b1(set2, gVar);
            }
            a1 a1Var = (a1) set2;
            di.g gVar2 = a1Var.f8284e;
            gVar2.getClass();
            return new b1((SortedSet) a1Var.f8283d, new di.h(Arrays.asList(gVar2, gVar)));
        }
        if (!(set instanceof a1)) {
            set.getClass();
            return new a1(set, gVar);
        }
        a1 a1Var2 = (a1) set;
        di.g gVar3 = a1Var2.f8284e;
        gVar3.getClass();
        return new a1(a1Var2.f8283d, new di.h(Arrays.asList(gVar3, gVar)));
    }

    public static Object h(String str, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return kk.b.f(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int j(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static z0 k(Set set, h0 h0Var) {
        ls.l.f(set, "set1");
        ls.l.f(h0Var, "set2");
        return new z0(set, h0Var);
    }

    public static int l(int i7, int i10, int i11) {
        return (i7 & (~i11)) | (i10 & i11);
    }

    public static ArrayList m(Object... objArr) {
        int length = objArr.length;
        c(length, "arraySize");
        ArrayList arrayList = new ArrayList(mo.c0.G(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int n(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iQ = q(obj);
        int i10 = iQ & i7;
        int iR = r(i10, obj3);
        if (iR != 0) {
            int i11 = ~i7;
            int i12 = iQ & i11;
            int i13 = -1;
            while (true) {
                int i14 = iR - 1;
                int i15 = iArr[i14];
                if ((i15 & i11) == i12 && ls.d.n(obj, objArr[i14]) && (objArr2 == null || ls.d.n(obj2, objArr2[i14]))) {
                    int i16 = i15 & i7;
                    if (i13 == -1) {
                        s(i10, i16, obj3);
                        return i14;
                    }
                    iArr[i13] = l(iArr[i13], i16, i7);
                    return i14;
                }
                int i17 = i15 & i7;
                if (i17 == 0) {
                    break;
                }
                i13 = i14;
                iR = i17;
            }
        }
        return -1;
    }

    public static void o(List list, di.g gVar, int i7, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (gVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            list.remove(i11);
        }
    }

    public static int p(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }

    public static int q(Object obj) {
        return p(obj == null ? 0 : obj.hashCode());
    }

    public static int r(int i7, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i7] & 65535 : ((int[]) obj)[i7];
    }

    public static void s(int i7, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }
}
