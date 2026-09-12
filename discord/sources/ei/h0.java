package ei;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends z implements Set {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8309i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient e0 f8310e;

    public static int j(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static h0 k(int i7, Object... objArr) {
        if (i7 == 0) {
            return x0.G;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new d1(obj);
        }
        int iJ = j(i7);
        Object[] objArr2 = new Object[iJ];
        int i10 = iJ - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i13);
                throw new NullPointerException(sb2.toString());
            }
            int iHashCode = obj2.hashCode();
            int iP = p.p(iHashCode);
            while (true) {
                int i14 = iP & i10;
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
                iP++;
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new d1(obj4);
        }
        if (j(i12) < iJ / 2) {
            return k(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new x0(i11, i10, i12, objArr, objArr2);
    }

    public static h0 m(Collection collection) {
        if ((collection instanceof h0) && !(collection instanceof SortedSet)) {
            h0 h0Var = (h0) collection;
            if (!h0Var.i()) {
                return h0Var;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    @Override // ei.z
    public e0 a() {
        e0 e0Var = this.f8310e;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0VarO = o();
        this.f8310e = e0VarO;
        return e0VarO;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h0) && (this instanceof x0) && (((h0) obj) instanceof x0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return p.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p.j(this);
    }

    public e0 o() {
        Object[] array = toArray(z.f8394d);
        c0 c0Var = e0.f8303e;
        return e0.j(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract e1 iterator();
}
