package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements TemporalAccessor, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f13455c = new Instant(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13457b;

    public static Instant now() {
        ConcurrentMap concurrentMap = ZoneOffset.f13465c;
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f13456a, instant2.f13456a);
        return iCompare != 0 ? iCompare : this.f13457b - instant2.f13457b;
    }

    static {
        h(-31557014167219200L, 0L);
        h(31556889864403199L, 999999999L);
    }

    public static Instant h(long j, long j5) {
        return g(Math.addExact(j, Math.floorDiv(j5, 1000000000L)), (int) Math.floorMod(j5, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        return g(Math.floorDiv(j, 1000L), ((int) Math.floorMod(j, 1000L)) * 1000000);
    }

    public static Instant g(long j, int i7) {
        if ((((long) i7) | j) == 0) {
            return f13455c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new a("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i7);
    }

    public Instant(long j, int i7) {
        this.f13456a = j;
        this.f13457b = i7;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return jVar == j$.time.temporal.a.INSTANT_SECONDS || jVar == j$.time.temporal.a.NANO_OF_SECOND || jVar == j$.time.temporal.a.MICRO_OF_SECOND || jVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return jVar != null && jVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar != null) {
            int i7 = c.f13473a[((j$.time.temporal.a) jVar).ordinal()];
            if (i7 == 1) {
                return this.f13457b;
            }
            if (i7 == 2) {
                return this.f13457b / 1000;
            }
            if (i7 == 3) {
                return this.f13457b / 1000000;
            }
            if (i7 == 4) {
                j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
                aVar.f13547b.a(this.f13456a, aVar);
            }
            throw new m("Unsupported field: " + jVar);
        }
        return super.b(jVar).a(f((j$.time.temporal.a) jVar), jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        int i7;
        if (jVar instanceof j$.time.temporal.a) {
            int i10 = c.f13473a[((j$.time.temporal.a) jVar).ordinal()];
            if (i10 == 1) {
                i7 = this.f13457b;
            } else if (i10 == 2) {
                i7 = this.f13457b / 1000;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return this.f13456a;
                    }
                    throw new m("Unsupported field: " + jVar);
                }
                i7 = this.f13457b / 1000000;
            }
            return i7;
        }
        return jVar.e(this);
    }

    public long getEpochSecond() {
        return this.f13456a;
    }

    public int getNano() {
        return this.f13457b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.k.f13559c) {
            return j$.time.temporal.b.NANOS;
        }
        if (aVar == j$.time.temporal.k.f13558b || aVar == j$.time.temporal.k.f13557a || aVar == j$.time.temporal.k.f13561e || aVar == j$.time.temporal.k.f13560d || aVar == j$.time.temporal.k.f13562f || aVar == j$.time.temporal.k.f13563g) {
            return null;
        }
        return aVar.a(this);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        ZoneOffset zoneOffset2;
        int i7 = OffsetDateTime.f13462c;
        Objects.requireNonNull(zoneOffset, "zone");
        j$.time.zone.c cVar = new j$.time.zone.c(zoneOffset);
        if (cVar.f13572c.length == 0) {
            zoneOffset2 = cVar.f13571b[0];
        } else {
            long epochSecond = getEpochSecond();
            if (cVar.f13574e.length > 0) {
                long[] jArr = cVar.f13572c;
                if (epochSecond > jArr[jArr.length - 1]) {
                    ZoneOffset[] zoneOffsetArr = cVar.f13573d;
                    int i10 = e.n(Math.floorDiv(epochSecond + ((long) zoneOffsetArr[zoneOffsetArr.length - 1].f13469a), 86400L)).f13480a;
                    Integer numValueOf = Integer.valueOf(i10);
                    j$.time.zone.a[] aVarArr = (j$.time.zone.a[]) ((ConcurrentHashMap) cVar.f13575f).get(numValueOf);
                    Object obj = null;
                    if (aVarArr == null) {
                        j$.time.zone.b[] bVarArr = cVar.f13574e;
                        j$.time.zone.a[] aVarArr2 = new j$.time.zone.a[bVarArr.length];
                        if (bVarArr.length > 0) {
                            j$.time.zone.b bVar = bVarArr[0];
                            throw null;
                        }
                        if (i10 < 2100) {
                            ((ConcurrentHashMap) cVar.f13575f).putIfAbsent(numValueOf, aVarArr2);
                        }
                        aVarArr = aVarArr2;
                    }
                    if (aVarArr.length <= 0) {
                        throw null;
                    }
                    j$.time.zone.a aVar = aVarArr[0];
                    obj.getClass();
                    throw null;
                }
            }
            int iBinarySearch = Arrays.binarySearch(cVar.f13572c, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffset2 = cVar.f13573d[iBinarySearch + 1];
        }
        return new OffsetDateTime(LocalDateTime.h(getEpochSecond(), getNano(), zoneOffset2), zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f13456a == instant.f13456a && this.f13457b == instant.f13457b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13456a;
        return (this.f13457b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }
}
