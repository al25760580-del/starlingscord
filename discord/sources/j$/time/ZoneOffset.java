package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends k implements TemporalAccessor, Comparable<ZoneOffset>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient String f13470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f13465c = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f13466d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ZoneOffset f13467e = g(-64800);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f13468f = g(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f13469a - this.f13469a;
    }

    public static ZoneOffset g(int i7) {
        if (i7 < -64800 || i7 > 64800) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i7 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i7);
            ConcurrentMap concurrentMap = f13465c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i7));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
            f13466d.putIfAbsent(zoneOffset2.f13470b, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i7);
    }

    public ZoneOffset(int i7) {
        String string;
        if (ZoneOffset.class == ZoneOffset.class || ZoneOffset.class == l.class) {
            this.f13469a = i7;
            if (i7 == 0) {
                string = "Z";
            } else {
                int iAbs = Math.abs(i7);
                StringBuilder sb2 = new StringBuilder();
                int i10 = iAbs / 3600;
                int i11 = (iAbs / 60) % 60;
                sb2.append(i7 < 0 ? "-" : "+");
                sb2.append(i10 < 10 ? "0" : "");
                sb2.append(i10);
                sb2.append(i11 < 10 ? ":0" : ":");
                sb2.append(i11);
                int i12 = iAbs % 60;
                if (i12 != 0) {
                    sb2.append(i12 < 10 ? ":0" : ":");
                    sb2.append(i12);
                }
                string = sb2.toString();
            }
            this.f13470b = string;
            return;
        }
        throw new AssertionError("Invalid subclass");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return jVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return jVar != null && jVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f13469a;
        }
        if (jVar != null) {
            throw new m("Unsupported field: " + jVar);
        }
        return super.b(jVar).a(f(jVar), jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f13469a;
        }
        if (jVar instanceof j$.time.temporal.a) {
            throw new m("Unsupported field: " + jVar);
        }
        return jVar.e(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.k.f13560d || aVar == j$.time.temporal.k.f13561e) ? this : super.c(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f13469a == ((ZoneOffset) obj).f13469a;
    }

    public final int hashCode() {
        return this.f13469a;
    }

    public final String toString() {
        return this.f13470b;
    }
}
