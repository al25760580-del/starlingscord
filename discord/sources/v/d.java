package v;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.d0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f21322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f21323e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21324i = 0;

    public d(Object[] objArr) {
        this.f21322d = objArr;
    }

    public final void a(Object obj) {
        int i7 = this.f21324i + 1;
        if (this.f21322d.length < i7) {
            h(i7);
        }
        Object[] objArr = this.f21322d;
        int i10 = this.f21324i;
        objArr[i10] = obj;
        this.f21324i = i10 + 1;
    }

    public final boolean b(int i7, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f21324i + size;
        if (this.f21322d.length < i11) {
            h(i11);
        }
        Object[] objArr = this.f21322d;
        int i12 = this.f21324i;
        if (i7 != i12) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i12 - i7);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                d0.k();
                throw null;
            }
            objArr[i10 + i7] = obj;
            i10 = i13;
        }
        this.f21324i += size;
        return true;
    }

    public final List c() {
        a aVar = this.f21323e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f21323e = aVar2;
        return aVar2;
    }

    public final void d() {
        Object[] objArr = this.f21322d;
        int i7 = this.f21324i;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f21324i = 0;
    }

    public final Object e(int i7) {
        Object[] objArr = this.f21322d;
        Object obj = objArr[i7];
        int i10 = this.f21324i;
        if (i7 != i10 - 1) {
            int i11 = i7 + 1;
            System.arraycopy(objArr, i11, objArr, i7, i10 - i11);
        }
        int i12 = this.f21324i - 1;
        this.f21324i = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void f(int i7, int i10) {
        if (i10 > i7) {
            int i11 = this.f21324i;
            if (i10 < i11) {
                Object[] objArr = this.f21322d;
                System.arraycopy(objArr, i10, objArr, i7, i11 - i10);
            }
            int i12 = this.f21324i;
            int i13 = i12 - (i10 - i7);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f21322d[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f21324i = i13;
        }
    }

    public final void h(int i7) {
        Object[] objArr = this.f21322d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f21322d = objArr2;
    }
}
