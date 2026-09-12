package ei;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f8390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8392c;

    public y() {
        p.c(4, "initialCapacity");
        this.f8390a = new Object[4];
        this.f8391b = 0;
    }

    public static int d(int i7, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i7 + (i7 >> 1) + 1;
        if (iHighestOneBit < i10) {
            iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f8391b + 1);
        Object[] objArr = this.f8390a;
        int i7 = this.f8391b;
        this.f8391b = i7 + 1;
        objArr[i7] = obj;
    }

    public abstract y b(Object obj);

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size() + this.f8391b);
            if (collection instanceof z) {
                this.f8391b = ((z) collection).b(this.f8391b, this.f8390a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f8390a;
        if (objArr.length < i7) {
            this.f8390a = Arrays.copyOf(objArr, d(objArr.length, i7));
            this.f8392c = false;
        } else if (this.f8392c) {
            this.f8390a = (Object[]) objArr.clone();
            this.f8392c = false;
        }
    }
}
