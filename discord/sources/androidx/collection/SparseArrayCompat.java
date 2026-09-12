package androidx.collection;

import java.util.Arrays;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import s.l;
import t.a;

/* JADX INFO: loaded from: classes.dex */
public final class SparseArrayCompat implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f1223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f1224e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f1225i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ int f1226v;

    public SparseArrayCompat(int i7) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f1224e = new int[i13];
        this.f1225i = new Object[i13];
    }

    public final void a(int i7, Object obj) {
        int i10 = this.f1226v;
        if (i10 != 0 && i7 <= this.f1224e[i10 - 1]) {
            e(i7, obj);
            return;
        }
        if (this.f1223d && i10 >= this.f1224e.length) {
            l.a(this);
        }
        int i11 = this.f1226v;
        if (i11 >= this.f1224e.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f1224e, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1224e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1225i, i15);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f1225i = objArrCopyOf;
        }
        this.f1224e[i11] = i7;
        this.f1225i[i11] = obj;
        this.f1226v = i11 + 1;
    }

    public final boolean b(int i7) {
        if (this.f1223d) {
            l.a(this);
        }
        return a.a(this.f1226v, i7, this.f1224e) >= 0;
    }

    public final Object c(int i7) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iA = a.a(this.f1226v, i7, this.f1224e);
        if (iA < 0 || (obj = this.f1225i[iA]) == l.f19641b) {
            return null;
        }
        return obj;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.f1224e = (int[]) this.f1224e.clone();
        sparseArrayCompat.f1225i = (Object[]) this.f1225i.clone();
        return sparseArrayCompat;
    }

    public final int d(int i7) {
        if (this.f1223d) {
            l.a(this);
        }
        return this.f1224e[i7];
    }

    public final void e(int i7, Object obj) {
        int iA = a.a(this.f1226v, i7, this.f1224e);
        if (iA >= 0) {
            this.f1225i[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f1226v;
        if (i10 < i11) {
            Object[] objArr = this.f1225i;
            if (objArr[i10] == l.f19641b) {
                this.f1224e[i10] = i7;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f1223d && i11 >= this.f1224e.length) {
            l.a(this);
            i10 = ~a.a(this.f1226v, i7, this.f1224e);
        }
        int i12 = this.f1226v;
        if (i12 >= this.f1224e.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f1224e, i16);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1224e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1225i, i16);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f1225i = objArrCopyOf;
        }
        int i17 = this.f1226v;
        if (i17 - i10 != 0) {
            int[] iArr = this.f1224e;
            int i18 = i10 + 1;
            w.e(i18, i10, iArr, iArr, i17);
            Object[] objArr2 = this.f1225i;
            w.d(i18, i10, this.f1226v, objArr2, objArr2);
        }
        this.f1224e[i10] = i7;
        this.f1225i[i10] = obj;
        this.f1226v++;
    }

    public final void f(int i7) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iA = a.a(this.f1226v, i7, this.f1224e);
        if (iA >= 0) {
            Object[] objArr = this.f1225i;
            Object obj = objArr[iA];
            Object obj2 = l.f19641b;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f1223d = true;
            }
        }
    }

    public final int g() {
        if (this.f1223d) {
            l.a(this);
        }
        return this.f1226v;
    }

    public final Object h(int i7) {
        if (this.f1223d) {
            l.a(this);
        }
        Object[] objArr = this.f1225i;
        if (i7 < objArr.length) {
            return objArr[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1226v * 28);
        sb2.append('{');
        int i7 = this.f1226v;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object objH = h(i10);
            if (objH != this) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
