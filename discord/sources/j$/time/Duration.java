package j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f13452c = new Duration(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13454b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f13453a, duration2.f13453a);
        return iCompare != 0 ? iCompare : this.f13454b - duration2.f13454b;
    }

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public static Duration b(long j) {
        long j5 = j / 1000000000;
        int i7 = (int) (j % 1000000000);
        if (i7 < 0) {
            i7 = (int) (((long) i7) + 1000000000);
            j5--;
        }
        return a(j5, i7);
    }

    public static Duration a(long j, int i7) {
        if ((((long) i7) | j) == 0) {
            return f13452c;
        }
        return new Duration(j, i7);
    }

    public Duration(long j, int i7) {
        this.f13453a = j;
        this.f13454b = i7;
    }

    public long toMillis() {
        return Math.addExact(Math.multiplyExact(this.f13453a, 1000L), this.f13454b / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f13453a == duration.f13453a && this.f13454b == duration.f13454b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13453a;
        return (this.f13454b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f13452c) {
            return "PT0S";
        }
        long j = this.f13453a;
        long j5 = j / 3600;
        int i7 = (int) ((j % 3600) / 60);
        int i10 = (int) (j % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j5 != 0) {
            sb2.append(j5);
            sb2.append('H');
        }
        if (i7 != 0) {
            sb2.append(i7);
            sb2.append('M');
        }
        if (i10 == 0 && this.f13454b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i10 >= 0 || this.f13454b <= 0) {
            sb2.append(i10);
        } else if (i10 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i10 + 1);
        }
        if (this.f13454b > 0) {
            int length = sb2.length();
            if (i10 < 0) {
                sb2.append(2000000000 - ((long) this.f13454b));
            } else {
                sb2.append(((long) this.f13454b) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
