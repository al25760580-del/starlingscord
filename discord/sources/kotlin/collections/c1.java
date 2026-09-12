package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends h implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f14633e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14634i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14636w;

    public c1(int i7, Object[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f14633e = buffer;
        if (i7 < 0) {
            throw new IllegalArgumentException(kk.b.h(i7, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i7 <= buffer.length) {
            this.f14634i = buffer.length;
            this.f14636w = i7;
        } else {
            StringBuilder sbS = a3.e.s(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbS.append(buffer.length);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f14636w;
    }

    public final void b() {
        if (2 > this.f14636w) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 2, size = " + this.f14636w).toString());
        }
        int i7 = this.f14635v;
        int i10 = this.f14634i;
        int i11 = (i7 + 2) % i10;
        Object[] objArr = this.f14633e;
        if (i7 > i11) {
            w.k(objArr, null, i7, i10);
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            Arrays.fill(objArr, 0, i11, (Object) null);
        } else {
            w.k(objArr, null, i7, i11);
        }
        this.f14635v = i11;
        this.f14636w -= 2;
    }

    @Override // kotlin.collections.h, java.util.List
    public final Object get(int i7) {
        d dVar = h.f14644d;
        int i10 = this.f14636w;
        dVar.getClass();
        d.b(i7, i10);
        return this.f14633e[(this.f14635v + i7) % this.f14634i];
    }

    @Override // kotlin.collections.h, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new b1(this);
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i7 = this.f14636w;
        if (length < i7) {
            array = Arrays.copyOf(array, i7);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i10 = this.f14636w;
        int i11 = this.f14635v;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f14633e;
            if (i13 >= i10 || i11 >= this.f14634i) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        c0.d(i10, array);
        return array;
    }
}
