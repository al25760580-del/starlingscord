package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends o implements Set {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f6139i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient s f6140e;

    public static int j(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static u m(int i7, Object... objArr) {
        if (i7 == 0) {
            return c0.G;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new d0(obj);
        }
        int iJ = j(i7);
        Object[] objArr2 = new Object[iJ];
        int i10 = iJ - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(kk.b.h(i13, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iA = z1.a(iHashCode);
            while (true) {
                int i14 = iA & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new d0(obj4);
        }
        if (j(i12) < iJ / 2) {
            return m(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new c0(i11, i10, i12, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public s e() {
        s sVar = this.f6140e;
        if (sVar != null) {
            return sVar;
        }
        s sVarK = k();
        this.f6140e = sVarK;
        return sVarK;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u) && (this instanceof c0) && (((u) obj) instanceof c0) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public s k() {
        Object[] array = toArray(o.f6077d);
        p pVar = s.f6118e;
        return s.k(array.length, array);
    }
}
