package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, KMutableCollection, KMutableSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f19624d = t.a.f20566a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f19625e = t.a.f20568c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19626i;

    public f(int i7) {
        if (i7 > 0) {
            l.b(this, i7);
        }
    }

    public final Object a(int i7) {
        int i10 = this.f19626i;
        Object[] objArr = this.f19625e;
        Object obj = objArr[i7];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f19624d;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i11) {
                int i12 = i7 + 1;
                w.e(i7, i12, iArr, iArr, i10);
                Object[] objArr2 = this.f19625e;
                w.d(i7, i12, i10, objArr2, objArr2);
            }
            this.f19625e[i11] = null;
        } else {
            l.b(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i7 > 0) {
                w.h(iArr, this.f19624d, i7, 6);
                w.g(0, i7, 6, objArr, this.f19625e);
            }
            if (i7 < i11) {
                int i13 = i7 + 1;
                w.e(i7, i13, iArr, this.f19624d, i10);
                w.d(i7, i13, i10, objArr, this.f19625e);
            }
        }
        if (i10 != this.f19626i) {
            throw new ConcurrentModificationException();
        }
        this.f19626i = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int iC;
        int i10 = this.f19626i;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = l.c(this, null, 0);
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iC = l.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        int[] iArr = this.f19624d;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f19625e;
            l.b(this, i12);
            if (i10 != this.f19626i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f19624d;
            if (iArr2.length != 0) {
                w.h(iArr, iArr2, iArr.length, 6);
                w.g(0, objArr.length, 6, objArr, this.f19625e);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f19624d;
            int i13 = i11 + 1;
            w.e(i13, i11, iArr3, iArr3, i10);
            Object[] objArr2 = this.f19625e;
            w.d(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f19626i;
        if (i10 == i14) {
            int[] iArr4 = this.f19624d;
            if (i11 < iArr4.length) {
                iArr4[i11] = i7;
                this.f19625e[i11] = obj;
                this.f19626i = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f19626i;
        int i7 = this.f19626i;
        int[] iArr = this.f19624d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f19625e;
            l.b(this, size);
            int i10 = this.f19626i;
            if (i10 > 0) {
                w.h(iArr, this.f19624d, i10, 6);
                w.g(0, this.f19626i, 6, objArr, this.f19625e);
            }
        }
        if (this.f19626i != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f19626i != 0) {
            int[] iArr = t.a.f20566a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f19624d = iArr;
            Object[] objArr = t.a.f20568c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f19625e = objArr;
            this.f19626i = 0;
        }
        if (this.f19626i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = l.c(this, null, 0);
        } else {
            iC = l.c(this, obj, obj.hashCode());
        }
        return iC >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f19626i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f19626i;
            for (int i10 = 0; i10 < i7; i10++) {
                if (!((Set) obj).contains(this.f19625e[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f19624d;
        int i7 = this.f19626i;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f19626i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = l.c(this, null, 0);
        } else {
            iC = l.c(this, obj, obj.hashCode());
        }
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        for (int i7 = this.f19626i - 1; -1 < i7; i7--) {
            if (!CollectionsKt.E(elements, this.f19625e[i7])) {
                a(i7);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f19626i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return w.j(this.f19625e, 0, this.f19626i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f19626i * 14);
        sb2.append('{');
        int i7 = this.f19626i;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f19625e[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i7 = this.f19626i;
        if (array.length < i7) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i7);
        } else if (array.length > i7) {
            array[i7] = null;
        }
        w.d(0, 0, this.f19626i, this.f19625e, array);
        Intrinsics.checkNotNull(array);
        return array;
    }
}
