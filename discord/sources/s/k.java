package s;

import java.util.Arrays;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f19636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f19637e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f19638i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ int f19639v;

    public k(int i7) {
        if (i7 == 0) {
            this.f19637e = t.a.f20567b;
            this.f19638i = t.a.f20568c;
            return;
        }
        int i10 = i7 * 8;
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
        }
        int i13 = i10 / 8;
        this.f19637e = new long[i13];
        this.f19638i = new Object[i13];
    }

    public final void a() {
        int i7 = this.f19639v;
        Object[] objArr = this.f19638i;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f19639v = 0;
        this.f19636d = false;
    }

    public final Object b(long j) {
        Object obj;
        int iB = t.a.b(this.f19637e, this.f19639v, j);
        if (iB < 0 || (obj = this.f19638i[iB]) == l.f19640a) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.f19636d) {
            int i7 = this.f19639v;
            long[] jArr = this.f19637e;
            Object[] objArr = this.f19638i;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != l.f19640a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f19636d = false;
            this.f19639v = i10;
        }
        return t.a.b(this.f19637e, this.f19639v, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        k kVar = (k) objClone;
        kVar.f19637e = (long[]) this.f19637e.clone();
        kVar.f19638i = (Object[]) this.f19638i.clone();
        return kVar;
    }

    public final long d(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f19639v)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f19636d) {
            long[] jArr = this.f19637e;
            Object[] objArr = this.f19638i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != l.f19640a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f19636d = false;
            this.f19639v = i11;
        }
        return this.f19637e[i7];
    }

    public final void e(long j, Object obj) {
        Object obj2 = l.f19640a;
        int iB = t.a.b(this.f19637e, this.f19639v, j);
        if (iB >= 0) {
            this.f19638i[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i10 = this.f19639v;
        if (i7 < i10) {
            Object[] objArr = this.f19638i;
            if (objArr[i7] == obj2) {
                this.f19637e[i7] = j;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f19636d) {
            long[] jArr = this.f19637e;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f19638i;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f19636d = false;
                this.f19639v = i11;
                i7 = ~t.a.b(this.f19637e, i11, j);
            }
        }
        int i13 = this.f19639v;
        if (i13 >= this.f19637e.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f19637e, i17);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f19637e = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f19638i, i17);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f19638i = objArrCopyOf;
        }
        int i18 = this.f19639v;
        if (i18 - i7 != 0) {
            long[] jArr2 = this.f19637e;
            int i19 = i7 + 1;
            w.f(jArr2, jArr2, i19, i7, i18);
            Object[] objArr3 = this.f19638i;
            w.d(i19, i7, this.f19639v, objArr3, objArr3);
        }
        this.f19637e[i7] = j;
        this.f19638i[i7] = obj;
        this.f19639v++;
    }

    public final int f() {
        if (this.f19636d) {
            int i7 = this.f19639v;
            long[] jArr = this.f19637e;
            Object[] objArr = this.f19638i;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != l.f19640a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f19636d = false;
            this.f19639v = i10;
        }
        return this.f19639v;
    }

    public final Object g(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f19639v)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f19636d) {
            long[] jArr = this.f19637e;
            Object[] objArr = this.f19638i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != l.f19640a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f19636d = false;
            this.f19639v = i11;
        }
        return this.f19638i[i7];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f19639v * 28);
        sb2.append('{');
        int i7 = this.f19639v;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object objG = g(i10);
            if (objG != sb2) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public k() {
        this(10);
    }
}
