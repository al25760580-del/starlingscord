package j$.time.temporal;

import com.facebook.imageutils.TiffUtil;
import java.util.Objects;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements j {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f13550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f13551b;

    @Override // j$.time.temporal.j
    public final boolean isDateBased() {
        return true;
    }

    public static boolean f(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object obj = (j$.time.chrono.d) temporalAccessor.c(k.f13558b);
        if (obj == null) {
            obj = j$.time.chrono.e.f13475a;
        }
        return ((j$.time.chrono.a) obj).equals(j$.time.chrono.e.f13475a);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f13551b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.j
            public final n c() {
                return n.e(90L, 92L);
            }

            @Override // j$.time.temporal.j
            public final boolean a(TemporalAccessor temporalAccessor) {
                return temporalAccessor.e(a.DAY_OF_YEAR) && temporalAccessor.e(a.MONTH_OF_YEAR) && temporalAccessor.e(a.YEAR) && g.f(temporalAccessor);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.j
            public final n b(TemporalAccessor temporalAccessor) {
                if (!a(temporalAccessor)) {
                    throw new m("Unsupported field: DayOfQuarter");
                }
                long jF = temporalAccessor.f(g.QUARTER_OF_YEAR);
                if (jF == 1) {
                    long jF2 = temporalAccessor.f(a.YEAR);
                    j$.time.chrono.e eVar = j$.time.chrono.e.f13475a;
                    return j$.time.chrono.e.a(jF2) ? n.d(1L, 91L) : n.d(1L, 90L);
                }
                if (jF == 2) {
                    return n.d(1L, 91L);
                }
                if (jF == 3 || jF == 4) {
                    return n.d(1L, 92L);
                }
                return c();
            }

            @Override // j$.time.temporal.j
            public final long e(TemporalAccessor temporalAccessor) {
                if (!a(temporalAccessor)) {
                    throw new m("Unsupported field: DayOfQuarter");
                }
                int iA = temporalAccessor.a(a.DAY_OF_YEAR);
                int iA2 = temporalAccessor.a(a.MONTH_OF_YEAR);
                long jF = temporalAccessor.f(a.YEAR);
                int i7 = (iA2 - 1) / 3;
                j$.time.chrono.e eVar = j$.time.chrono.e.f13475a;
                return iA - g.f13550a[i7 + (j$.time.chrono.e.a(jF) ? 4 : 0)];
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.j
            public final n c() {
                return n.d(1L, 4L);
            }

            @Override // j$.time.temporal.j
            public final boolean a(TemporalAccessor temporalAccessor) {
                return temporalAccessor.e(a.MONTH_OF_YEAR) && g.f(temporalAccessor);
            }

            @Override // j$.time.temporal.j
            public final long e(TemporalAccessor temporalAccessor) {
                if (!a(temporalAccessor)) {
                    throw new m("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.f(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.j
            public final n c() {
                return n.e(52L, 53L);
            }

            @Override // j$.time.temporal.j
            public final boolean a(TemporalAccessor temporalAccessor) {
                return temporalAccessor.e(a.EPOCH_DAY) && g.f(temporalAccessor);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.j
            public final n b(TemporalAccessor temporalAccessor) {
                if (a(temporalAccessor)) {
                    return g.h(j$.time.e.h(temporalAccessor));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.j
            public final long e(TemporalAccessor temporalAccessor) {
                int i7;
                if (!a(temporalAccessor)) {
                    throw new m("Unsupported field: WeekOfWeekBasedYear");
                }
                j$.time.e eVarH = j$.time.e.h(temporalAccessor);
                int iOrdinal = eVarH.j().ordinal();
                int i10 = 1;
                int iK = eVarH.k() - 1;
                int i11 = (3 - iOrdinal) + iK;
                int i12 = i11 - ((i11 / 7) * 7);
                int i13 = i12 - 3;
                if (i13 < -3) {
                    i13 = i12 + 4;
                }
                if (iK >= i13) {
                    int i14 = ((iK - i13) / 7) + 1;
                    if (i14 != 53 || i13 == -3 || (i13 == -2 && eVarH.l())) {
                        i10 = i14;
                    }
                } else {
                    if (eVarH.k() != 180) {
                        int i15 = eVarH.f13480a;
                        long j = i15;
                        a.YEAR.f(j);
                        a.DAY_OF_YEAR.f(180);
                        j$.time.chrono.e eVar = j$.time.chrono.e.f13475a;
                        boolean zA = j$.time.chrono.e.a(j);
                        j$.time.i iVarH = j$.time.i.h(6);
                        int iG = iVarH.g(zA);
                        int i16 = j$.time.h.f13541a[iVarH.ordinal()];
                        if (i16 != 1) {
                            i7 = (i16 == 2 || i16 == 3 || i16 == 4 || i16 == 5) ? 30 : 31;
                        } else {
                            i7 = zA ? 29 : 28;
                        }
                        if (180 > (iG + i7) - 1) {
                            iVarH = j$.time.i.f13542a[((((int) 1) + 12) + iVarH.ordinal()) % 12];
                        }
                        eVarH = new j$.time.e(i15, iVarH.ordinal() + 1, 181 - iVarH.g(zA));
                    }
                    a aVar = a.YEAR;
                    int iA = aVar.f13547b.a(((long) eVarH.f13480a) - 1, aVar);
                    short s2 = eVarH.f13481b;
                    int iMin = eVarH.f13482c;
                    if (s2 == 2) {
                        iMin = Math.min(iMin, j$.time.chrono.e.a((long) iA) ? 29 : 28);
                    } else if (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11) {
                        iMin = Math.min(iMin, 30);
                    }
                    i10 = (int) g.h(new j$.time.e(iA, s2, iMin)).f13567d;
                }
                return i10;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.j
            public final n c() {
                return a.YEAR.f13547b;
            }

            @Override // j$.time.temporal.j
            public final boolean a(TemporalAccessor temporalAccessor) {
                return temporalAccessor.e(a.EPOCH_DAY) && g.f(temporalAccessor);
            }

            @Override // j$.time.temporal.j
            public final long e(TemporalAccessor temporalAccessor) {
                if (a(temporalAccessor)) {
                    return g.g(j$.time.e.h(temporalAccessor));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f13551b = new g[]{gVar, gVar2, gVar3, gVar4};
        f13550a = new int[]{0, 90, 181, 273, 0, 91, 182, TiffUtil.TIFF_TAG_ORIENTATION};
    }

    public n b(TemporalAccessor temporalAccessor) {
        return c();
    }

    public static n h(j$.time.e eVar) {
        j$.time.e eVarM = j$.time.e.m(g(eVar), 1, 1);
        return n.d(1L, (eVarM.j() == j$.time.b.THURSDAY || (eVarM.j() == j$.time.b.WEDNESDAY && eVarM.l())) ? 53 : 52);
    }

    public static int g(j$.time.e eVar) {
        int i7 = eVar.f13480a;
        int iK = eVar.k();
        if (iK <= 3) {
            return iK - eVar.j().ordinal() < -2 ? i7 - 1 : i7;
        }
        if (iK >= 363) {
            return ((iK - 363) - (eVar.l() ? 1 : 0)) - eVar.j().ordinal() >= 0 ? i7 + 1 : i7;
        }
        return i7;
    }
}
