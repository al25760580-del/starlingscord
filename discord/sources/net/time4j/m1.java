package net.time4j;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements yr.r0 {
    public static String t(String str, String str2, String str3, yr.i0 i0Var, yr.z zVar) {
        int iOrdinal = i0Var.ordinal();
        yr.z zVar2 = yr.z.f23567d;
        if (iOrdinal == 0) {
            return s0.g.e("{0} ", str, zVar == zVar2 ? "" : "s");
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return s0.g.e("{0} ", str2, zVar == zVar2 ? "" : "s");
        }
        if (iOrdinal == 3) {
            return "{0}".concat(str3);
        }
        throw new UnsupportedOperationException(i0Var.name());
    }

    public static String u(String str, boolean z5, yr.z zVar) {
        String str2 = zVar == yr.z.f23567d ? "" : "s";
        return z5 ? s0.g.e("in {0} ", str, str2) : a3.e.m("{0} ", str, str2, " ago");
    }

    public static String v(String str, boolean z5) {
        return a3.e.o(new StringBuilder(), z5 ? "+" : "-", "{0} ", str);
    }

    @Override // yr.r0
    public final String a(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("week", "wk", "w", i0Var, zVar) : "{0} ".concat("w");
    }

    @Override // yr.r0
    public final String b(Locale locale) {
        return "now";
    }

    @Override // yr.r0
    public final String c(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("minute", "min", "m", i0Var, zVar) : "{0} ".concat("min");
    }

    @Override // yr.r0
    public final String d(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("hour", "hr", "h", i0Var, zVar) : "{0} ".concat("h");
    }

    @Override // yr.r0
    public final String e(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("millisecond", "msec", "ms", i0Var, zVar) : "{0} ".concat("ms");
    }

    @Override // yr.r0
    public final String f(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("day", "day", "d", i0Var, zVar) : "{0} ".concat("d");
    }

    @Override // yr.r0
    public final String g(Locale locale, yr.i0 i0Var, int i7) {
        if (i7 < 2) {
            throw new IllegalArgumentException("Size must be greater than 1.");
        }
        StringBuilder sb2 = new StringBuilder(i7 * 5);
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append('{');
            sb2.append(i10);
            sb2.append('}');
            if (i10 < i7 - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    @Override // yr.r0
    public final String h(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("year", z5, zVar) : v("y", z5);
    }

    @Override // yr.r0
    public final String i(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("month", z5, zVar) : v("m", z5);
    }

    @Override // yr.r0
    public final String j(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("second", z5, zVar) : v("s", z5);
    }

    @Override // yr.r0
    public final String k(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("second", "sec", "s", i0Var, zVar) : "{0} ".concat("s");
    }

    @Override // yr.r0
    public final String l(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("microsecond", "µsec", "µs", i0Var, zVar) : "{0} ".concat("µs");
    }

    @Override // yr.r0
    public final String m(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("hour", z5, zVar) : v("h", z5);
    }

    @Override // yr.r0
    public final String n(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("nanosecond", "nsec", "ns", i0Var, zVar) : "{0} ".concat("ns");
    }

    @Override // yr.r0
    public final String o(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("day", z5, zVar) : v("d", z5);
    }

    @Override // yr.r0
    public final String p(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("minute", z5, zVar) : v("min", z5);
    }

    @Override // yr.r0
    public final String q(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("year", "yr", "y", i0Var, zVar) : "{0} ".concat("y");
    }

    @Override // yr.r0
    public final String r(Locale locale, yr.i0 i0Var, yr.z zVar) {
        return locale.getLanguage().equals("en") ? t("month", "mth", "m", i0Var, zVar) : "{0} ".concat("m");
    }

    @Override // yr.r0
    public final String s(Locale locale, boolean z5, yr.z zVar) {
        return locale.getLanguage().equals("en") ? u("week", z5, zVar) : v("w", z5);
    }
}
