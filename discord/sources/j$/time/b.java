package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import j$.time.temporal.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements TemporalAccessor {
    public static final b FRIDAY;
    public static final b MONDAY;
    public static final b SATURDAY;
    public static final b SUNDAY;
    public static final b THURSDAY;
    public static final b TUESDAY;
    public static final b WEDNESDAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b[] f13471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f13472b;

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13472b.clone();
    }

    static {
        b bVar = new b("MONDAY", 0);
        MONDAY = bVar;
        b bVar2 = new b("TUESDAY", 1);
        TUESDAY = bVar2;
        b bVar3 = new b("WEDNESDAY", 2);
        WEDNESDAY = bVar3;
        b bVar4 = new b("THURSDAY", 3);
        THURSDAY = bVar4;
        b bVar5 = new b("FRIDAY", 4);
        FRIDAY = bVar5;
        b bVar6 = new b("SATURDAY", 5);
        SATURDAY = bVar6;
        b bVar7 = new b("SUNDAY", 6);
        SUNDAY = bVar7;
        f13472b = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        f13471a = values();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return jVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return jVar != null && jVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final n b(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return jVar.c();
        }
        return super.b(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        return super.a(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        if (jVar instanceof j$.time.temporal.a) {
            throw new m("Unsupported field: " + jVar);
        }
        return jVar.e(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.k.f13559c) {
            return j$.time.temporal.b.DAYS;
        }
        return super.c(aVar);
    }
}
