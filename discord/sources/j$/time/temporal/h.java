package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum h implements l {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13553a;

    static {
        Duration.a(31556952L, 0);
        Duration.a(7889238L, 0);
    }

    h(String str) {
        this.f13553a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13553a;
    }
}
