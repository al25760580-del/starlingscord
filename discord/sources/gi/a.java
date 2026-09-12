package gi;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import ls.l;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10045e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10046i;

    public a(int i7, int i10, int[] iArr) {
        this.f10044d = iArr;
        this.f10045e = i7;
        this.f10046i = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && c0.A(((Integer) obj).intValue(), this.f10045e, this.f10046i, this.f10044d) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        int size = size();
        if (aVar.size() != size) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f10044d[this.f10045e + i7] != aVar.f10044d[aVar.f10045e + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        l.e(i7, size());
        return Integer.valueOf(this.f10044d[this.f10045e + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = this.f10045e; i10 < this.f10046i; i10++) {
            i7 = (i7 * 31) + this.f10044d[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f10046i;
        int i10 = this.f10045e;
        int iA = c0.A(iIntValue, i10, i7, this.f10044d);
        if (iA >= 0) {
            return iA - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f10046i;
            do {
                i10--;
                i7 = this.f10045e;
                if (i10 < i7) {
                    i10 = -1;
                    break;
                }
            } while (this.f10044d[i10] != iIntValue);
            if (i10 >= 0) {
                return i10 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        l.e(i7, size());
        int i10 = this.f10045e + i7;
        int[] iArr = this.f10044d;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10046i - this.f10045e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        l.h(i7, i10, size());
        if (i7 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f10045e;
        return new a(i7 + i11, i11 + i10, this.f10044d);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f10044d;
        int i7 = this.f10045e;
        sb2.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 >= this.f10046i) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i7]);
        }
    }
}
