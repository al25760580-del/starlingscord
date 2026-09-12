package j$.time.temporal;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public enum a implements j {
    NANO_OF_SECOND("NanoOfSecond", n.d(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", n.d(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", n.d(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", n.d(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", n.d(0, 999)),
    MILLI_OF_DAY("MilliOfDay", n.d(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", n.d(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", n.d(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", n.d(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", n.d(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", n.d(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", n.d(1, 12)),
    HOUR_OF_DAY("HourOfDay", n.d(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", n.d(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", n.d(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", n.d(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", n.d(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", n.d(1, 7)),
    DAY_OF_MONTH("DayOfMonth", n.e(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", n.e(365, 366)),
    EPOCH_DAY("EpochDay", n.d(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", n.e(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", n.d(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", n.d(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", n.d(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", n.e(999999999, 1000000000)),
    YEAR("Year", n.d(-999999999, 999999999), 0),
    ERA("Era", n.d(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", n.d(Long.MIN_VALUE, LongCompanionObject.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", n.d(-64800, 64800));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13547b;

    static {
        b bVar = b.NANOS;
    }

    public final void f(long j) {
        n nVar = this.f13547b;
        if (!nVar.c(j)) {
            throw new j$.time.a(nVar.b(j, this));
        }
    }

    a(String str, n nVar) {
        this.f13546a = str;
        this.f13547b = nVar;
    }

    a(String str, n nVar, int i7) {
        this.f13546a = str;
        this.f13547b = nVar;
    }

    @Override // j$.time.temporal.j
    public final n c() {
        return this.f13547b;
    }

    @Override // j$.time.temporal.j
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean g() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.j
    public final boolean a(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(this);
    }

    @Override // j$.time.temporal.j
    public final n b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.b(this);
    }

    @Override // j$.time.temporal.j
    public final long e(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13546a;
    }
}
