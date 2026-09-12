package kotlin.collections;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public d(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder sbR = a3.e.r(i7, "startIndex: ", i10, ", endIndex: ", ", size: ");
            sbR.append(i11);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a3.e.g(i7, i10, "startIndex: ", " > endIndex: "));
        }
    }

    public static void b(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, i10, "index: ", ", size: "));
        }
    }

    public static void c(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, i10, "index: ", ", size: "));
        }
    }

    public static void d(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder sbR = a3.e.r(i7, "fromIndex: ", i10, ", toIndex: ", ", size: ");
            sbR.append(i11);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a3.e.g(i7, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int e(int i7, int i10) {
        int i11 = i7 + (i7 >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            return i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i11;
    }
}
