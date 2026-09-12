package j$.time;

import com.facebook.imageutils.TiffUtil;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.m;
import j$.time.temporal.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements TemporalAccessor {
    public static final i APRIL;
    public static final i AUGUST;
    public static final i DECEMBER;
    public static final i FEBRUARY;
    public static final i JANUARY;
    public static final i JULY;
    public static final i JUNE;
    public static final i MARCH;
    public static final i MAY;
    public static final i NOVEMBER;
    public static final i OCTOBER;
    public static final i SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i[] f13542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f13543b;

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f13543b.clone();
    }

    static {
        i iVar = new i("JANUARY", 0);
        JANUARY = iVar;
        i iVar2 = new i("FEBRUARY", 1);
        FEBRUARY = iVar2;
        i iVar3 = new i("MARCH", 2);
        MARCH = iVar3;
        i iVar4 = new i("APRIL", 3);
        APRIL = iVar4;
        i iVar5 = new i("MAY", 4);
        MAY = iVar5;
        i iVar6 = new i("JUNE", 5);
        JUNE = iVar6;
        i iVar7 = new i("JULY", 6);
        JULY = iVar7;
        i iVar8 = new i("AUGUST", 7);
        AUGUST = iVar8;
        i iVar9 = new i("SEPTEMBER", 8);
        SEPTEMBER = iVar9;
        i iVar10 = new i("OCTOBER", 9);
        OCTOBER = iVar10;
        i iVar11 = new i("NOVEMBER", 10);
        NOVEMBER = iVar11;
        i iVar12 = new i("DECEMBER", 11);
        DECEMBER = iVar12;
        f13543b = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12};
        f13542a = values();
    }

    public static i h(int i7) {
        if (i7 < 1 || i7 > 12) {
            throw new a("Invalid value for MonthOfYear: " + i7);
        }
        return f13542a[i7 - 1];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        if (jVar instanceof j$.time.temporal.a) {
            return jVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return jVar != null && jVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final n b(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return jVar.c();
        }
        return super.b(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int a(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        return super.a(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        if (jVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (jVar instanceof j$.time.temporal.a) {
            throw new m("Unsupported field: " + jVar);
        }
        return jVar.e(this);
    }

    public final int g(boolean z5) {
        switch (h.f13541a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z5 ? 1 : 0) + 91;
            case 3:
                return (z5 ? 1 : 0) + 152;
            case 4:
                return (z5 ? 1 : 0) + 244;
            case 5:
                return (z5 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z5 ? 1 : 0) + 60;
            case 8:
                return (z5 ? 1 : 0) + 121;
            case 9:
                return (z5 ? 1 : 0) + 182;
            case 10:
                return (z5 ? 1 : 0) + 213;
            case 11:
                return (z5 ? 1 : 0) + TiffUtil.TIFF_TAG_ORIENTATION;
            default:
                return (z5 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.k.f13558b) {
            return j$.time.chrono.e.f13475a;
        }
        if (aVar == j$.time.temporal.k.f13559c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.c(aVar);
    }
}
