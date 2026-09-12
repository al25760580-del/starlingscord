package j$.time.temporal;

import j$.time.Duration;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements l {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13549a;

    static {
        Duration.b(1L);
        Duration.b(1000L);
        Duration.b(1000000L);
        Duration.a(1L, 0);
        Duration.a(60L, 0);
        Duration.a(3600L, 0);
        Duration.a(43200L, 0);
        Duration.a(86400L, 0);
        Duration.a(604800L, 0);
        Duration.a(2629746L, 0);
        Duration.a(31556952L, 0);
        Duration.a(315569520L, 0);
        Duration.a(3155695200L, 0);
        Duration.a(31556952000L, 0);
        Duration.a(31556952000000000L, 0);
        Duration.a(Math.addExact(LongCompanionObject.MAX_VALUE, Math.floorDiv(999999999L, 1000000000L)), (int) Math.floorMod(999999999L, 1000000000L));
    }

    b(String str) {
        this.f13549a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13549a;
    }
}
