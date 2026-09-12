package qd;

import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f18768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18771i;

    public n(j jVar, long j, long j5, long j7, long j10, List list, long j11, long j12, long j13) {
        super(jVar, j, j5);
        this.f18766d = j7;
        this.f18767e = j10;
        this.f18768f = list;
        this.f18771i = j11;
        this.f18769g = j12;
        this.f18770h = j13;
    }

    public final long b(long j, long j5) {
        long jD = d(j);
        return jD != -1 ? jD : (int) (f((j5 - this.f18770h) + this.f18771i, j) - c(j, j5));
    }

    public final long c(long j, long j5) {
        long jD = d(j);
        long j7 = this.f18766d;
        if (jD == -1) {
            long j10 = this.f18769g;
            if (j10 != -9223372036854775807L) {
                return Math.max(j7, f((j5 - this.f18770h) - j10, j));
            }
        }
        return j7;
    }

    public abstract long d(long j);

    public final long e(long j, long j5) {
        long j7 = this.f18778b;
        long j10 = this.f18766d;
        List list = this.f18768f;
        if (list != null) {
            return (((q) list.get((int) (j - j10))).f18774b * 1000000) / j7;
        }
        long jD = d(j5);
        return (jD == -1 || j != (j10 + jD) - 1) ? (this.f18767e * 1000000) / j7 : j5 - g(j);
    }

    public final long f(long j, long j5) {
        long jD = d(j5);
        long j7 = this.f18766d;
        if (jD != 0) {
            if (this.f18768f != null) {
                long j10 = (jD + j7) - 1;
                long j11 = j7;
                while (j11 <= j10) {
                    long j12 = ((j10 - j11) / 2) + j11;
                    long jG = g(j12);
                    if (jG < j) {
                        j11 = j12 + 1;
                    } else {
                        if (jG <= j) {
                            return j12;
                        }
                        j10 = j12 - 1;
                    }
                }
                return j11 == j7 ? j11 : j10;
            }
            long j13 = (j / ((this.f18767e * 1000000) / this.f18778b)) + j7;
            if (j13 >= j7) {
                return jD == -1 ? j13 : Math.min(j13, (j7 + jD) - 1);
            }
        }
        return j7;
    }

    public final long g(long j) {
        long j5 = this.f18766d;
        List list = this.f18768f;
        return e0.P(list != null ? ((q) list.get((int) (j - j5))).f18773a - this.f18779c : (j - j5) * this.f18767e, 1000000L, this.f18778b);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        return this.f18768f != null;
    }
}
