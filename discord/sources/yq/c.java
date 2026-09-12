package yq;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import kotlin.text.x;
import kotlin.time.Duration;
import lo.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final long a(String str) {
        d dVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.f14747e.getClass();
        char cCharAt2 = str.charAt(0);
        int i7 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z5 = i7 > 0 && StringsKt.T(str, '-');
        if (length <= i7) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i7) != 'P') {
            throw new IllegalArgumentException();
        }
        int i10 = i7 + 1;
        if (i10 == length) {
            throw new IllegalArgumentException();
        }
        d dVar2 = null;
        long jI = 0;
        boolean z6 = false;
        while (i10 < length) {
            if (str.charAt(i10) != 'T') {
                int i11 = i10;
                while (i11 < str.length() && (('0' <= (cCharAt = str.charAt(i11)) && cCharAt < ':') || StringsKt.E("+-.", cCharAt))) {
                    i11++;
                }
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i10;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i12 = length2 + 1;
                if (z6) {
                    if (cCharAt3 == 'H') {
                        dVar = d.HOURS;
                    } else if (cCharAt3 == 'M') {
                        dVar = d.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        dVar = d.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    dVar = d.DAYS;
                }
                if (dVar2 != null && dVar2.compareTo(dVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int I = StringsKt.I(strSubstring, '.', 0, 6);
                if (dVar != d.SECONDS || I <= 0) {
                    jI = Duration.i(jI, h(e(strSubstring), dVar));
                } else {
                    Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring2 = strSubstring.substring(0, I);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    long jI2 = Duration.i(jI, h(e(strSubstring2), dVar));
                    Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring3 = strSubstring.substring(I);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    jI = Duration.i(jI2, f(Double.parseDouble(strSubstring3), dVar));
                }
                dVar2 = dVar;
                i10 = i12;
            } else {
                if (z6 || (i10 = i10 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z6 = true;
            }
        }
        return z5 ? Duration.m(jI) : jI;
    }

    public static final long b(long j) {
        long j5 = (j << 1) + 1;
        a aVar = Duration.f14747e;
        int i7 = b.f23506a;
        return j5;
    }

    public static final long c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? b(j.f(j, -4611686018427387903L, 4611686018427387903L)) : d(j * ((long) 1000000));
    }

    public static final long d(long j) {
        long j5 = j << 1;
        a aVar = Duration.f14747e;
        int i7 = b.f23506a;
        return j5;
    }

    public static final long e(String str) {
        char cCharAt;
        int length = str.length();
        int i7 = (length <= 0 || !StringsKt.E("+-", str.charAt(0))) ? 0 : 1;
        if (length - i7 > 16) {
            int i10 = i7;
            while (true) {
                if (i7 >= length) {
                    if (length - i10 <= 16) {
                        break;
                    }
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return LongCompanionObject.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 == '0') {
                    if (i10 == i7) {
                        i10++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i7++;
            }
        }
        return (!x.o(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(b0.x(1, str));
    }

    public static final long f(double d6, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = e.a(d6, unit, d.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dA);
        if (-4611686018426999999L <= jRound && jRound < 4611686018427000000L) {
            return d(jRound);
        }
        double dA2 = e.a(d6, unit, d.MILLISECONDS);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return c(Math.round(dA2));
    }

    public static final long g(int i7, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? d(e.c(i7, unit, d.NANOSECONDS)) : h(i7, unit);
    }

    public static final long h(long j, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j || j > jC) ? b(j.f(e.b(j, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : d(e.c(j, unit, dVar));
    }
}
