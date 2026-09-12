package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import j$.time.temporal.n;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements TemporalAccessor, j$.time.chrono.b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f13478d = m(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f13479e = m(999999999, 12, 31);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f13481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f13482c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j$.time.chrono.b bVar = (j$.time.chrono.b) obj;
        if (!(bVar instanceof e)) {
            int iCompare = Long.compare(o(), ((e) bVar).o());
            if (iCompare != 0) {
                return iCompare;
            }
            j$.time.chrono.e eVar = j$.time.chrono.e.f13475a;
            return 0;
        }
        return g((e) bVar);
    }

    public static e m(int i7, int i10, int i11) {
        long j = i7;
        j$.time.temporal.a.YEAR.f(j);
        j$.time.temporal.a.MONTH_OF_YEAR.f(i10);
        j$.time.temporal.a.DAY_OF_MONTH.f(i11);
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.e eVar = j$.time.chrono.e.f13475a;
                if (j$.time.chrono.e.a(j)) {
                    i12 = 29;
                }
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new a("Invalid date 'February 29' as '" + i7 + "' is not a leap year");
                }
                throw new a("Invalid date '" + i.h(i10).name() + " " + i11 + "'");
            }
        }
        return new e(i7, i10, i11);
    }

    public static e n(long j) {
        long j5;
        long j7 = j + 719468;
        if (j7 < 0) {
            long j10 = ((j + 719469) / 146097) - 1;
            j5 = j10 * 400;
            j7 += (-j10) * 146097;
        } else {
            j5 = 0;
        }
        long j11 = ((j7 * 400) + 591) / 146097;
        long j12 = j7 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j7 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i7 = (int) j12;
        int i10 = ((i7 * 5) + 2) / 153;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i7 - (((i10 * 306) + 5) / 10)) + 1;
        long j13 = j11 + j5 + ((long) (i10 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new e(aVar.f13547b.a(j13, aVar), i11, i12);
    }

    public static e h(TemporalAccessor temporalAccessor) {
        e eVar = (e) temporalAccessor.c(j$.time.temporal.k.f13562f);
        if (eVar != null) {
            return eVar;
        }
        throw new a("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) jVar).isDateBased();
        }
        return jVar != null && jVar.a(this);
    }

    public e(int i7, int i10, int i11) {
        this.f13480a = i7;
        this.f13481b = (short) i10;
        this.f13482c = (short) i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final n b(j$.time.temporal.j jVar) {
        int i7;
        if (jVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) jVar;
            if (aVar.isDateBased()) {
                int i10 = d.f13476a[aVar.ordinal()];
                if (i10 == 1) {
                    short s2 = this.f13481b;
                    if (s2 != 2) {
                        i7 = (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11) ? 30 : 31;
                    } else {
                        i7 = l() ? 29 : 28;
                    }
                    return n.d(1L, i7);
                }
                if (i10 == 2) {
                    return n.d(1L, l() ? 366 : 365);
                }
                if (i10 == 3) {
                    return n.d(1L, (i.h(this.f13481b) != i.FEBRUARY || l()) ? 5L : 4L);
                }
                if (i10 != 4) {
                    return aVar.f13547b;
                }
                return this.f13480a <= 0 ? n.d(1L, 1000000000L) : n.d(1L, 999999999L);
            }
            throw new m("Unsupported field: " + jVar);
        }
        return jVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return i(jVar);
        }
        return super.a(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            if (jVar == j$.time.temporal.a.EPOCH_DAY) {
                return o();
            }
            if (jVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return i(jVar);
            }
            return ((((long) this.f13480a) * 12) + ((long) this.f13481b)) - 1;
        }
        return jVar.e(this);
    }

    public final int i(j$.time.temporal.j jVar) {
        int iOrdinal;
        switch (d.f13476a[((j$.time.temporal.a) jVar).ordinal()]) {
            case 1:
                return this.f13482c;
            case 2:
                return k();
            case 3:
                iOrdinal = (this.f13482c - 1) / 7;
                break;
            case 4:
                int i7 = this.f13480a;
                return i7 >= 1 ? i7 : 1 - i7;
            case 5:
                iOrdinal = j().ordinal();
                break;
            case 6:
                iOrdinal = (this.f13482c - 1) % 7;
                break;
            case 7:
                iOrdinal = (k() - 1) % 7;
                break;
            case 8:
                throw new m("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                iOrdinal = (k() - 1) / 7;
                break;
            case 10:
                return this.f13481b;
            case 11:
                throw new m("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f13480a;
            case 13:
                return this.f13480a >= 1 ? 1 : 0;
            default:
                throw new m("Unsupported field: " + jVar);
        }
        return iOrdinal + 1;
    }

    public final int k() {
        return (i.h(this.f13481b).g(l()) + this.f13482c) - 1;
    }

    public final b j() {
        int iFloorMod = (int) Math.floorMod(o() + 3, 7L);
        int i7 = iFloorMod + 1;
        b bVar = b.MONDAY;
        if (i7 < 1 || i7 > 7) {
            throw new a("Invalid value for DayOfWeek: " + i7);
        }
        return b.f13471a[iFloorMod];
    }

    public final boolean l() {
        j$.time.chrono.e eVar = j$.time.chrono.e.f13475a;
        return j$.time.chrono.e.a(this.f13480a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.k.f13562f) {
            return this;
        }
        if (aVar == j$.time.temporal.k.f13557a || aVar == j$.time.temporal.k.f13561e || aVar == j$.time.temporal.k.f13560d || aVar == j$.time.temporal.k.f13563g) {
            return null;
        }
        if (aVar == j$.time.temporal.k.f13558b) {
            return j$.time.chrono.e.f13475a;
        }
        if (aVar == j$.time.temporal.k.f13559c) {
            return j$.time.temporal.b.DAYS;
        }
        return aVar.a(this);
    }

    public final long o() {
        long j;
        long j5 = this.f13480a;
        long j7 = this.f13481b;
        long j10 = 365 * j5;
        if (j5 >= 0) {
            j = ((j5 + 399) / 400) + (((3 + j5) / 4) - ((99 + j5) / 100)) + j10;
        } else {
            j = j10 - ((j5 / (-400)) + ((j5 / (-4)) - (j5 / (-100))));
        }
        long j11 = (((367 * j7) - 362) / 12) + j + ((long) (this.f13482c - 1));
        if (j7 > 2) {
            j11 = !l() ? j11 - 2 : j11 - 1;
        }
        return j11 - 719528;
    }

    public final int g(e eVar) {
        int i7 = this.f13480a - eVar.f13480a;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f13481b - eVar.f13481b;
        return i10 == 0 ? this.f13482c - eVar.f13482c : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && g((e) obj) == 0;
    }

    public final int hashCode() {
        int i7 = this.f13480a;
        return (((i7 << 11) + (this.f13481b << 6)) + this.f13482c) ^ (i7 & (-2048));
    }

    public final String toString() {
        int i7 = this.f13480a;
        short s2 = this.f13481b;
        short s5 = this.f13482c;
        int iAbs = Math.abs(i7);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i7 > 9999) {
                sb2.append('+');
            }
            sb2.append(i7);
        } else if (i7 < 0) {
            sb2.append(i7 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i7 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s2 < 10 ? "-0" : "-");
        sb2.append((int) s2);
        sb2.append(s5 < 10 ? "-0" : "-");
        sb2.append((int) s5);
        return sb2.toString();
    }
}
