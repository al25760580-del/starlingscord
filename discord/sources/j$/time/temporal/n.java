package j$.time.temporal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13567d;

    public static n d(long j, long j5) {
        if (j > j5) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new n(j, j, j5, j5);
    }

    public static n e(long j, long j5) {
        if (j > j5) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j5) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new n(1L, 1L, j, j5);
    }

    public n(long j, long j5, long j7, long j10) {
        this.f13564a = j;
        this.f13565b = j5;
        this.f13566c = j7;
        this.f13567d = j10;
    }

    public final int a(long j, j jVar) {
        if (this.f13564a < -2147483648L || this.f13567d > 2147483647L || !c(j)) {
            throw new j$.time.a(b(j, jVar));
        }
        return (int) j;
    }

    public final boolean c(long j) {
        return j >= this.f13564a && j <= this.f13567d;
    }

    public final String b(long j, j jVar) {
        if (jVar != null) {
            return "Invalid value for " + jVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f13564a == nVar.f13564a && this.f13565b == nVar.f13565b && this.f13566c == nVar.f13566c && this.f13567d == nVar.f13567d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13564a;
        long j5 = this.f13565b;
        long j7 = j + (j5 << 16) + (j5 >> 48);
        long j10 = this.f13566c;
        long j11 = j7 + (j10 << 32) + (j10 >> 32);
        long j12 = this.f13567d;
        long j13 = j11 + (j12 << 48) + (j12 >> 16);
        return (int) (j13 ^ (j13 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13564a);
        if (this.f13564a != this.f13565b) {
            sb2.append('/');
            sb2.append(this.f13565b);
        }
        sb2.append(" - ");
        sb2.append(this.f13566c);
        if (this.f13566c != this.f13567d) {
            sb2.append('/');
            sb2.append(this.f13567d);
        }
        return sb2.toString();
    }
}
