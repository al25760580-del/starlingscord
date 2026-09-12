package ag;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends l implements Set {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f574i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient q f575e;

    public static s i(int i7, Object... objArr) {
        if (i7 == 0) {
            return d0.G;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new g0(obj);
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
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i14 = iRotateLeft & i10;
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
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new g0(obj4);
        }
        if (j(i12) < iJ / 2) {
            return i(i12, objArr);
        }
        if (i12 <= 0) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new d0(i11, i10, i12, objArr, objArr2);
    }

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

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s) && (this instanceof d0) && (((s) obj) instanceof d0) && ((d0) this).f516w != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c.b(this);
    }

    public q k() {
        q qVar = this.f575e;
        if (qVar != null) {
            return qVar;
        }
        q qVarM = m();
        this.f575e = qVarM;
        return qVarM;
    }

    public q m() {
        Object[] array = toArray(l.f535d);
        m mVar = q.f567e;
        return q.k(array.length, array);
    }
}
