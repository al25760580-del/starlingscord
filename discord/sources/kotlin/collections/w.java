package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class w extends u {
    public static List b(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static void c(int i7, int i10, int i11, byte[] bArr, byte[] destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i10, destination, i7, i11 - i10);
    }

    public static void d(int i7, int i10, int i11, Object[] objArr, Object[] destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i10, destination, i7, i11 - i10);
    }

    public static void e(int i7, int i10, int[] iArr, int[] destination, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i10, destination, i7, i11 - i10);
    }

    public static void f(long[] jArr, long[] destination, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i10, destination, i7, i11 - i10);
    }

    public static /* synthetic */ void g(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        d(0, i7, i10, objArr, objArr2);
    }

    public static /* synthetic */ void h(int[] iArr, int[] iArr2, int i7, int i10) {
        if ((i10 & 8) != 0) {
            i7 = iArr.length;
        }
        e(0, 0, iArr, iArr2, i7);
    }

    public static byte[] i(byte[] bArr, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        t.a(i7, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i7);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] j(Object[] objArr, int i7, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        t.a(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void k(Object[] objArr, Object obj, int i7, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i7, i10, obj);
    }

    public static void l(long[] jArr, long j) {
        int length = jArr.length;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static void n(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
