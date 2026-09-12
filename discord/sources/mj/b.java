package mj;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15840e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15841i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f15842v;

    public b(int i7, int i10) {
        if (i7 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f15839d = i7;
        this.f15840e = i10;
        int i11 = (i7 + 31) / 32;
        this.f15841i = i11;
        this.f15842v = new int[i11 * i10];
    }

    public final void a(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f15841i);
        int[] iArr = this.f15842v;
        iArr[i11] = (1 << (i7 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i7, int i10) {
        return ((this.f15842v[(i7 / 32) + (i10 * this.f15841i)] >>> (i7 & 31)) & 1) != 0;
    }

    public final int[] c() {
        int[] iArr = this.f15842v;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i7 = this.f15841i;
        int i10 = length / i7;
        int i11 = (length % i7) << 5;
        int i12 = iArr[length];
        int i13 = 31;
        while ((i12 >>> i13) == 0) {
            i13--;
        }
        return new int[]{i11 + i13, i10};
    }

    public final Object clone() {
        return new b(this.f15839d, this.f15840e, this.f15841i, (int[]) this.f15842v.clone());
    }

    public final a d(a aVar, int i7) {
        int i10 = aVar.f15838e;
        int i11 = this.f15839d;
        if (i10 < i11) {
            aVar = new a(i11);
        } else {
            int length = aVar.f15837d.length;
            for (int i12 = 0; i12 < length; i12++) {
                aVar.f15837d[i12] = 0;
            }
        }
        int i13 = this.f15841i;
        int i14 = i7 * i13;
        for (int i15 = 0; i15 < i13; i15++) {
            aVar.f15837d[(i15 << 5) / 32] = this.f15842v[i14 + i15];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            iArr = this.f15842v;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f15841i;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        while ((iArr[i10] << (31 - i7)) == 0) {
            i7++;
        }
        return new int[]{i13 + i7, i12};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15839d == bVar.f15839d && this.f15840e == bVar.f15840e && this.f15841i == bVar.f15841i && Arrays.equals(this.f15842v, bVar.f15842v);
    }

    public final void f(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f15841i);
        int[] iArr = this.f15842v;
        iArr[i11] = (1 << (i7 & 31)) | iArr[i11];
    }

    public final void g(int i7, int i10, int i11, int i12) {
        if (i10 < 0 || i7 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i12 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i13 = i11 + i7;
        int i14 = i12 + i10;
        if (i14 > this.f15840e || i13 > this.f15839d) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i10 < i14) {
            int i15 = this.f15841i * i10;
            for (int i16 = i7; i16 < i13; i16++) {
                int i17 = (i16 / 32) + i15;
                int[] iArr = this.f15842v;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public final int hashCode() {
        int i7 = this.f15839d;
        return Arrays.hashCode(this.f15842v) + (((((((i7 * 31) + i7) * 31) + this.f15840e) * 31) + this.f15841i) * 31);
    }

    public final String toString() {
        int i7 = this.f15839d;
        int i10 = this.f15840e;
        StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i7; i12++) {
                sb2.append(b(i12, i11) ? "X " : "  ");
            }
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }

    public b(int i7, int i10, int i11, int[] iArr) {
        this.f15839d = i7;
        this.f15840e = i10;
        this.f15841i = i11;
        this.f15842v = iArr;
    }
}
