package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.n;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements TemporalAccessor, j$.time.chrono.c, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f13458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f13459d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13461b;

    static {
        e eVar = e.f13478d;
        g gVar = g.f13534e;
        Objects.requireNonNull(eVar, "date");
        Objects.requireNonNull(gVar, "time");
        f13458c = new LocalDateTime(eVar, gVar);
        e eVar2 = e.f13479e;
        g gVar2 = g.f13535f;
        Objects.requireNonNull(eVar2, "date");
        Objects.requireNonNull(gVar2, "time");
        f13459d = new LocalDateTime(eVar2, gVar2);
    }

    public static LocalDateTime h(long j, int i7, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j5 = i7;
        j$.time.temporal.a.NANO_OF_SECOND.f(j5);
        long j7 = j + ((long) zoneOffset.f13469a);
        return new LocalDateTime(e.n(Math.floorDiv(j7, 86400L)), g.i((((long) ((int) Math.floorMod(j7, 86400L))) * 1000000000) + j5));
    }

    public LocalDateTime(e eVar, g gVar) {
        this.f13460a = eVar;
        this.f13461b = gVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (!(jVar instanceof j$.time.temporal.a)) {
            return jVar != null && jVar.a(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) jVar;
        return aVar.isDateBased() || aVar.g();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final n b(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) jVar).g() ? this.f13461b.b(jVar) : this.f13460a.b(jVar);
        }
        return jVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) jVar).g() ? this.f13461b.a(jVar) : this.f13460a.a(jVar);
        }
        return super.a(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) jVar).g() ? this.f13461b.f(jVar) : this.f13460a.f(jVar);
        }
        return jVar.e(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar != j$.time.temporal.k.f13562f) {
            if (aVar == j$.time.temporal.k.f13557a || aVar == j$.time.temporal.k.f13561e || aVar == j$.time.temporal.k.f13560d) {
                return null;
            }
            if (aVar != j$.time.temporal.k.f13563g) {
                if (aVar == j$.time.temporal.k.f13558b) {
                    this.f13460a.getClass();
                    return j$.time.chrono.e.f13475a;
                }
                if (aVar == j$.time.temporal.k.f13559c) {
                    return j$.time.temporal.b.NANOS;
                }
                return aVar.a(this);
            }
            return this.f13461b;
        }
        return this.f13460a;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.c cVar) {
        int iCompare;
        if (cVar instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) cVar;
            int iG = this.f13460a.g(localDateTime.f13460a);
            return iG == 0 ? this.f13461b.compareTo(localDateTime.f13461b) : iG;
        }
        e eVar = this.f13460a;
        LocalDateTime localDateTime2 = (LocalDateTime) cVar;
        e eVar2 = localDateTime2.f13460a;
        if (eVar2 != null) {
            eVar.getClass();
            iCompare = eVar.g(eVar2);
        } else {
            iCompare = Long.compare(eVar.o(), eVar2.o());
            if (iCompare == 0) {
                j$.time.chrono.e eVar3 = j$.time.chrono.e.f13475a;
                iCompare = 0;
            }
        }
        if (iCompare != 0 || (iCompare = this.f13461b.compareTo(localDateTime2.f13461b)) != 0) {
            return iCompare;
        }
        this.f13460a.getClass();
        j$.time.chrono.e eVar4 = j$.time.chrono.e.f13475a;
        cVar.getClass();
        ((LocalDateTime) cVar).f13460a.getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f13460a.equals(localDateTime.f13460a) && this.f13461b.equals(localDateTime.f13461b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13460a.hashCode() ^ this.f13461b.hashCode();
    }

    public final String toString() {
        return this.f13460a.toString() + 'T' + this.f13461b.toString();
    }
}
