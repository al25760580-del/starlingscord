package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Comparable, f, Serializable {
    private static final long serialVersionUID = -1410512619471503090L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ConcurrentHashMap f16733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f16734w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16736e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient String f16737i;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f16733v = concurrentHashMap;
        new BigDecimal(60);
        new BigDecimal(3600);
        new BigDecimal(-180);
        new BigDecimal(180);
        new BigDecimal(240);
        new BigDecimal(1000000000);
        m mVar = new m(0, 0);
        f16734w = mVar;
        concurrentHashMap.put(0, mVar);
    }

    public m(int i7, int i10) {
        if (i10 != 0) {
            if (Math.abs(i10) > 999999999) {
                throw new IllegalArgumentException(kk.b.h(i10, "Fraction out of range: "));
            }
            if (i7 < -39600 || i7 > 39600) {
                throw new IllegalArgumentException(kk.b.h(i7, "Total seconds out of range while fraction is non-zero: "));
            }
            if ((i7 < 0 && i10 > 0) || (i7 > 0 && i10 < 0)) {
                throw new IllegalArgumentException(a3.e.g(i7, i10, "Different signs: offset=", ", fraction="));
            }
        } else if (i7 < -64800 || i7 > 64800) {
            throw new IllegalArgumentException(kk.b.h(i7, "Total seconds out of range: "));
        }
        boolean z5 = i7 < 0 || i10 < 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z5 ? '-' : '+');
        int iAbs = Math.abs(i7);
        int i11 = iAbs / 3600;
        int i12 = (iAbs / 60) % 60;
        int i13 = iAbs % 60;
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
        sb2.append(':');
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        if (i13 != 0 || i10 != 0) {
            sb2.append(':');
            if (i13 < 10) {
                sb2.append('0');
            }
            sb2.append(i13);
            if (i10 != 0) {
                sb2.append('.');
                String strValueOf = String.valueOf(Math.abs(i10));
                int length = 9 - strValueOf.length();
                for (int i14 = 0; i14 < length; i14++) {
                    sb2.append('0');
                }
                sb2.append(strValueOf);
            }
        }
        this.f16737i = sb2.toString();
        this.f16735d = i7;
        this.f16736e = i10;
    }

    public static String b(int i7, int i10) {
        return "[hours=" + i7 + ",minutes=" + i10 + ']';
    }

    public static m d(int i7, int i10, int i11) {
        if (i7 == 0) {
            throw new NullPointerException("Missing sign.");
        }
        if (i10 < 0 || i10 > 18) {
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + b(i10, i11));
        }
        if (i11 < 0 || i11 > 59) {
            throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + b(i10, i11));
        }
        if (i10 == 18 && i11 != 0) {
            throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + b(i10, i11));
        }
        int i12 = (i11 * 60) + (i10 * 3600);
        if (i7 == 1) {
            i12 = -i12;
        }
        return e(i12, 0);
    }

    public static m e(int i7, int i10) {
        if (i10 != 0) {
            return new m(i7, i10);
        }
        if (i7 == 0) {
            return f16734w;
        }
        if (i7 % 900 != 0) {
            return new m(i7, 0);
        }
        Integer numValueOf = Integer.valueOf(i7);
        ConcurrentHashMap concurrentHashMap = f16733v;
        m mVar = (m) concurrentHashMap.get(numValueOf);
        if (mVar != null) {
            return mVar;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new m(i7, 0));
        return (m) concurrentHashMap.get(numValueOf);
    }

    public static int f(int i7, int i10, String str) {
        int iMin = Math.min(str.length() - i7, i10);
        int i11 = -1;
        for (int i12 = 0; i12 < iMin; i12++) {
            char cCharAt = str.charAt(i7 + i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i11 = i11 == -1 ? cCharAt - '0' : (cCharAt - '0') + (i11 * 10);
        }
        return i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(15, this);
    }

    @Override // net.time4j.tz.f
    public final String a() {
        if (this.f16735d == 0 && this.f16736e == 0) {
            return "Z";
        }
        return "UTC" + this.f16737i;
    }

    public final e c() {
        e eVar = e.M;
        return (this.f16735d == 0 && this.f16736e == 0) ? e.M : new e(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i7 = mVar.f16735d;
        int i10 = this.f16735d;
        if (i10 < i7) {
            return -1;
        }
        if (i10 > i7) {
            return 1;
        }
        int i11 = this.f16736e - mVar.f16736e;
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f16735d == mVar.f16735d && this.f16736e == mVar.f16736e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16736e % 64000) + (~this.f16735d);
    }

    public final String toString() {
        return this.f16737i;
    }
}
