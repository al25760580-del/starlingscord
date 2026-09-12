package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import lo.j;
import org.jetbrains.annotations.NotNull;
import s0.g;
import yq.a;
import yq.b;
import yq.c;
import yq.d;
import yq.e;

/* JADX INFO: loaded from: classes3.dex */
public final class Duration implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f14747e = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f14748i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f14749v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14750d;

    static {
        int i7 = b.f23506a;
        f14748i = c.b(4611686018427387903L);
        f14749v = c.b(-4611686018427387903L);
    }

    public /* synthetic */ Duration(long j) {
        this.f14750d = j;
    }

    public static final long a(long j, long j5) {
        long j7 = 1000000;
        long j10 = j5 / j7;
        long j11 = j + j10;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            return c.b(j.f(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return c.d((j11 * j7) + (j5 - (j10 * j7)));
    }

    public static final void b(StringBuilder sb2, int i7, int i10, int i11, String str, boolean z5) {
        CharSequence charSequenceSubSequence;
        sb2.append(i7);
        if (i10 != 0) {
            sb2.append('.');
            String strValueOf = String.valueOf(i10);
            Intrinsics.checkNotNullParameter(strValueOf, "<this>");
            Intrinsics.checkNotNullParameter(strValueOf, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(g.d(i11, "Desired length ", " is less than zero."));
            }
            if (i11 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i11);
                int length = i11 - strValueOf.length();
                int i12 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                sb3.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb3;
            }
            String string = charSequenceSubSequence.toString();
            int i13 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i13 = length2;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length2 = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z5 || i15 >= 3) {
                sb2.append((CharSequence) string, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) string, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static int c(long j, long j5) {
        long j7 = j ^ j5;
        if (j7 < 0 || (((int) j7) & 1) == 0) {
            return Intrinsics.compare(j, j5);
        }
        int i7 = (((int) j) & 1) - (((int) j5) & 1);
        return j < 0 ? -i7 : i7;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || h(j)) ? k(j, d.MILLISECONDS) : j >> 1;
    }

    public static final int e(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) (k(j, d.MINUTES) % ((long) 60));
    }

    public static final int f(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final int g(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) (k(j, d.SECONDS) % ((long) 60));
    }

    public static final boolean h(long j) {
        return j == f14748i || j == f14749v;
    }

    public static final long i(long j, long j5) {
        if (h(j)) {
            if (!h(j5) || (j5 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (h(j5)) {
            return j5;
        }
        int i7 = ((int) j) & 1;
        if (i7 != (((int) j5) & 1)) {
            return i7 == 1 ? a(j >> 1, j5 >> 1) : a(j5 >> 1, j >> 1);
        }
        long j7 = (j >> 1) + (j5 >> 1);
        if (i7 == 0) {
            return (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) ? c.b(j7 / ((long) 1000000)) : c.d(j7);
        }
        return c.c(j7);
    }

    public static final double j(long j, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f14748i) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f14749v) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(j >> 1, (((int) j) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
    }

    public static final long k(long j, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f14748i) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j == f14749v) {
            return Long.MIN_VALUE;
        }
        return e.b(j >> 1, (((int) j) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
    }

    public static String l(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f14748i) {
            return "Infinity";
        }
        if (j == f14749v) {
            return "-Infinity";
        }
        int i7 = 0;
        boolean z5 = j < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append('-');
        }
        if (j < 0) {
            j = m(j);
        }
        long jK = k(j, d.DAYS);
        int iK = h(j) ? 0 : (int) (k(j, d.HOURS) % ((long) 24));
        int iE = e(j);
        int iG = g(j);
        int iF = f(j);
        boolean z6 = jK != 0;
        boolean z7 = iK != 0;
        boolean z10 = iE != 0;
        boolean z11 = (iG == 0 && iF == 0) ? false : true;
        if (z6) {
            sb2.append(jK);
            sb2.append('d');
            i7 = 1;
        }
        if (z7 || (z6 && (z10 || z11))) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            sb2.append(iK);
            sb2.append('h');
            i7 = i10;
        }
        if (z10 || (z11 && (z7 || z6))) {
            int i11 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            sb2.append(iE);
            sb2.append('m');
            i7 = i11;
        }
        if (z11) {
            int i12 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            if (iG != 0 || z6 || z7 || z10) {
                b(sb2, iG, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                b(sb2, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb2, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb2.append(iF);
                sb2.append("ns");
            }
            i7 = i12;
        }
        if (z5 && i7 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long m(long j) {
        long j5 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i7 = b.f23506a;
        return j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f14750d, ((Duration) obj).f14750d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.f14750d == ((Duration) obj).f14750d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14750d);
    }

    public final String toString() {
        return l(this.f14750d);
    }
}
