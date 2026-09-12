package lo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public class j extends i {
    public static double b(double d6, double d7, double d8) {
        if (d7 <= d8) {
            if (d6 < d7) {
                return d7;
            }
            return d6 > d8 ? d8 : d6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d8 + " is less than minimum " + d7 + '.');
    }

    public static float c(float f2, float f7, float f10) {
        if (f7 <= f10) {
            if (f2 < f7) {
                return f7;
            }
            return f2 > f10 ? f10 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f7 + '.');
    }

    public static int d(int i7, int i10, int i11) {
        if (i10 <= i11) {
            if (i7 < i10) {
                return i10;
            }
            return i7 > i11 ? i11 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static int e(int i7, IntRange range) {
        int i10 = range.f14689e;
        int i11 = range.f14688d;
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (i7 < Integer.valueOf(i11).intValue()) {
                return Integer.valueOf(i11).intValue();
            }
            return i7 > Integer.valueOf(i10).intValue() ? Integer.valueOf(i10).intValue() : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long f(long j, long j5, long j7) {
        if (j5 <= j7) {
            if (j < j5) {
                return j5;
            }
            return j > j7 ? j7 : j;
        }
        StringBuilder sbM = kk.b.m(j7, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbM.append(j5);
        sbM.append('.');
        throw new IllegalArgumentException(sbM.toString());
    }

    public static kotlin.ranges.a g(int i7, IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        i.a(i7 > 0, Integer.valueOf(i7));
        a aVar = kotlin.ranges.a.f14687v;
        int i10 = intRange.f14688d;
        int i11 = intRange.f14689e;
        if (intRange.f14690i <= 0) {
            i7 = -i7;
        }
        aVar.getClass();
        return new kotlin.ranges.a(i10, i11, i7);
    }

    public static e h(h hVar, long j) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        i.a(j > 0, Long.valueOf(j));
        d dVar = e.f15158v;
        long j5 = hVar.f15159d;
        long j7 = hVar.f15160e;
        if (hVar.f15161i <= 0) {
            j = -j;
        }
        long j10 = j;
        dVar.getClass();
        return new e(j5, j7, j10);
    }

    public static IntRange i(int i7, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new IntRange(i7, i10 - 1, 1);
        }
        IntRange.f14685w.getClass();
        return IntRange.f14686x;
    }
}
