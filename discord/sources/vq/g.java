package vq;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f21945e;

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i7 == 2 || i7 == 3) {
            objArr[1] = "iterator";
        } else if (i7 == 5 || i7 == 6 || i7 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i7 = this.f21944d;
        if (i7 == 0) {
            this.f21945e = obj;
        } else if (i7 == 1) {
            this.f21945e = new Object[]{this.f21945e, obj};
        } else {
            Object[] objArr = (Object[]) this.f21945e;
            int length = objArr.length;
            if (i7 >= length) {
                int i10 = ((length * 3) / 2) + 1;
                int i11 = i7 + 1;
                if (i10 < i11) {
                    i10 = i11;
                }
                Object[] objArr2 = new Object[i10];
                this.f21945e = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f21944d] = obj;
        }
        this.f21944d++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f21945e = null;
        this.f21944d = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i10;
        if (i7 >= 0 && i7 < (i10 = this.f21944d)) {
            return i10 == 1 ? this.f21945e : ((Object[]) this.f21945e)[i7];
        }
        StringBuilder sbS = a3.e.s(i7, "Index: ", ", Size: ");
        sbS.append(this.f21944d);
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i7 = this.f21944d;
        if (i7 == 0) {
            return e.f21940d;
        }
        if (i7 == 1) {
            return new f(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i10;
        Object obj;
        if (i7 < 0 || i7 >= (i10 = this.f21944d)) {
            StringBuilder sbS = a3.e.s(i7, "Index: ", ", Size: ");
            sbS.append(this.f21944d);
            throw new IndexOutOfBoundsException(sbS.toString());
        }
        if (i10 == 1) {
            obj = this.f21945e;
            this.f21945e = null;
        } else {
            Object[] objArr = (Object[]) this.f21945e;
            Object obj2 = objArr[i7];
            if (i10 == 2) {
                this.f21945e = objArr[1 - i7];
            } else {
                int i11 = (i10 - i7) - 1;
                if (i11 > 0) {
                    System.arraycopy(objArr, i7 + 1, objArr, i7, i11);
                }
                objArr[this.f21944d - 1] = null;
            }
            obj = obj2;
        }
        this.f21944d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f21944d)) {
            StringBuilder sbS = a3.e.s(i7, "Index: ", ", Size: ");
            sbS.append(this.f21944d);
            throw new IndexOutOfBoundsException(sbS.toString());
        }
        if (i10 == 1) {
            Object obj2 = this.f21945e;
            this.f21945e = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f21945e;
        Object obj3 = objArr[i7];
        objArr[i7] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21944d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i7 = this.f21944d;
        if (i7 >= 2) {
            Arrays.sort((Object[]) this.f21945e, 0, i7, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
            throw null;
        }
        int length = objArr.length;
        int i7 = this.f21944d;
        if (i7 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f21945e;
                return objArr2;
            }
            objArr[0] = this.f21945e;
        } else {
            if (length < i7) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f21945e, i7, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                a(6);
                throw null;
            }
            if (i7 != 0) {
                System.arraycopy(this.f21945e, 0, objArr, 0, i7);
            }
        }
        int i10 = this.f21944d;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        if (i7 >= 0 && i7 <= (i10 = this.f21944d)) {
            if (i10 == 0) {
                this.f21945e = obj;
            } else if (i10 == 1 && i7 == 0) {
                this.f21945e = new Object[]{obj, this.f21945e};
            } else {
                Object[] objArr = new Object[i10 + 1];
                if (i10 == 1) {
                    objArr[0] = this.f21945e;
                } else {
                    Object[] objArr2 = (Object[]) this.f21945e;
                    System.arraycopy(objArr2, 0, objArr, 0, i7);
                    System.arraycopy(objArr2, i7, objArr, i7 + 1, this.f21944d - i7);
                }
                objArr[i7] = obj;
                this.f21945e = objArr;
            }
            this.f21944d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbS = a3.e.s(i7, "Index: ", ", Size: ");
        sbS.append(this.f21944d);
        throw new IndexOutOfBoundsException(sbS.toString());
    }
}
