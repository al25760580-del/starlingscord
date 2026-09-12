package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import j$.time.temporal.n;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements TemporalAccessor, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13462c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f13463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f13464b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f13464b.equals(offsetDateTime2.f13464b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f13463a.d(this.f13464b), offsetDateTime2.f13463a.d(offsetDateTime2.f13464b));
            if (iCompare == 0) {
                iCompare = this.f13463a.f13461b.f13540d - offsetDateTime2.f13463a.f13461b.f13540d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f13458c;
        ZoneOffset zoneOffset = ZoneOffset.f13468f;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f13459d;
        ZoneOffset zoneOffset2 = ZoneOffset.f13467e;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f13463a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f13464b = zoneOffset;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return true;
        }
        return jVar != null && jVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final n b(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            if (jVar != j$.time.temporal.a.INSTANT_SECONDS && jVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f13463a.b(jVar);
            }
            return ((j$.time.temporal.a) jVar).f13547b;
        }
        return jVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar != null) {
            int i7 = j.f13544a[((j$.time.temporal.a) jVar).ordinal()];
            if (i7 == 1) {
                throw new m("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i7 == 2) {
                return this.f13464b.f13469a;
            }
            return this.f13463a.a(jVar);
        }
        return super.a(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            int i7 = j.f13544a[((j$.time.temporal.a) jVar).ordinal()];
            if (i7 == 1) {
                return this.f13463a.d(this.f13464b);
            }
            if (i7 == 2) {
                return this.f13464b.f13469a;
            }
            return this.f13463a.f(jVar);
        }
        return jVar.e(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f13463a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.k.f13560d || aVar == j$.time.temporal.k.f13561e) {
            return this.f13464b;
        }
        if (aVar == j$.time.temporal.k.f13557a) {
            return null;
        }
        if (aVar == j$.time.temporal.k.f13562f) {
            return this.f13463a.f13460a;
        }
        if (aVar == j$.time.temporal.k.f13563g) {
            return this.f13463a.f13461b;
        }
        if (aVar == j$.time.temporal.k.f13558b) {
            return j$.time.chrono.e.f13475a;
        }
        if (aVar == j$.time.temporal.k.f13559c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f13463a.equals(offsetDateTime.f13463a) && this.f13464b.equals(offsetDateTime.f13464b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13463a.hashCode() ^ this.f13464b.f13469a;
    }

    public final String toString() {
        return this.f13463a.toString() + this.f13464b.f13470b;
    }
}
