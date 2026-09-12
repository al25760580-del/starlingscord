package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements TemporalAccessor, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f13534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f13535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g[] f13536g = new g[24];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f13537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f13538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f13539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13540d;

    static {
        int i7 = 0;
        while (true) {
            g[] gVarArr = f13536g;
            if (i7 < gVarArr.length) {
                gVarArr[i7] = new g(i7, 0, 0, 0);
                i7++;
            } else {
                g gVar = gVarArr[0];
                g gVar2 = gVarArr[12];
                f13534e = gVar;
                f13535f = new g(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static g i(long j) {
        j$.time.temporal.a.NANO_OF_DAY.f(j);
        int i7 = (int) (j / 3600000000000L);
        long j5 = j - (((long) i7) * 3600000000000L);
        int i10 = (int) (j5 / 60000000000L);
        long j7 = j5 - (((long) i10) * 60000000000L);
        int i11 = (int) (j7 / 1000000000);
        int i12 = (int) (j7 - (((long) i11) * 1000000000));
        if ((i10 | i11 | i12) == 0) {
            return f13536g[i7];
        }
        return new g(i7, i10, i11, i12);
    }

    public g(int i7, int i10, int i11, int i12) {
        this.f13537a = (byte) i7;
        this.f13538b = (byte) i10;
        this.f13539c = (byte) i11;
        this.f13540d = i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) jVar).g();
        }
        return jVar != null && jVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return h(jVar);
        }
        return super.a(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            if (jVar == j$.time.temporal.a.NANO_OF_DAY) {
                return j();
            }
            if (jVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return j() / 1000;
            }
            return h(jVar);
        }
        return jVar.e(this);
    }

    public final int h(j$.time.temporal.j jVar) {
        switch (f.f13483a[((j$.time.temporal.a) jVar).ordinal()]) {
            case 1:
                return this.f13540d;
            case 2:
                throw new m("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f13540d / 1000;
            case 4:
                throw new m("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f13540d / 1000000;
            case 6:
                return (int) (j() / 1000000);
            case 7:
                return this.f13539c;
            case 8:
                return k();
            case 9:
                return this.f13538b;
            case 10:
                return (this.f13537a * 60) + this.f13538b;
            case 11:
                return this.f13537a % 12;
            case 12:
                int i7 = this.f13537a % 12;
                if (i7 % 12 == 0) {
                    return 12;
                }
                return i7;
            case 13:
                return this.f13537a;
            case 14:
                byte b10 = this.f13537a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f13537a / 12;
            default:
                throw new m("Unsupported field: " + jVar);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.k.f13558b || aVar == j$.time.temporal.k.f13557a || aVar == j$.time.temporal.k.f13561e || aVar == j$.time.temporal.k.f13560d) {
            return null;
        }
        if (aVar == j$.time.temporal.k.f13563g) {
            return this;
        }
        if (aVar == j$.time.temporal.k.f13562f) {
            return null;
        }
        if (aVar == j$.time.temporal.k.f13559c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    public final int k() {
        return (this.f13538b * 60) + (this.f13537a * 3600) + this.f13539c;
    }

    public final long j() {
        return (((long) this.f13539c) * 1000000000) + (((long) this.f13538b) * 60000000000L) + (((long) this.f13537a) * 3600000000000L) + ((long) this.f13540d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g gVar) {
        int iCompare = Integer.compare(this.f13537a, gVar.f13537a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f13538b, gVar.f13538b)) == 0 && (iCompare = Integer.compare(this.f13539c, gVar.f13539c)) == 0) ? Integer.compare(this.f13540d, gVar.f13540d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f13537a == gVar.f13537a && this.f13538b == gVar.f13538b && this.f13539c == gVar.f13539c && this.f13540d == gVar.f13540d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = j();
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f13537a;
        byte b11 = this.f13538b;
        byte b12 = this.f13539c;
        int i7 = this.f13540d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i7 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i7 > 0) {
                sb2.append('.');
                if (i7 % 1000000 == 0) {
                    sb2.append(Integer.toString((i7 / 1000000) + 1000).substring(1));
                } else if (i7 % 1000 == 0) {
                    sb2.append(Integer.toString((i7 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i7 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }
}
