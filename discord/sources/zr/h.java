package zr;

import java.text.DecimalFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import yr.x;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements yr.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale[] f24098b = new Locale[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f24099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f24100d;

    static {
        String[] strArrSplit = g.d("i18n/numbers/symbol", Locale.ROOT).c("locales").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArrSplit);
        f24099c = Collections.unmodifiableSet(hashSet);
        f24100d = new h();
        HashMap map = new HashMap();
        for (x xVar : x.values()) {
            map.put(xVar.a(), xVar);
        }
        Collections.unmodifiableMap(map);
    }

    @Override // yr.h
    public final String a(Locale locale) {
        String strValueOf = locale.getLanguage().equals("ar") ? "\u200f-" : String.valueOf(DecimalFormatSymbols.getInstance(locale).getMinusSign());
        g gVarD = f24099c.contains(d.a(locale)) ? g.d("i18n/numbers/symbol", locale) : null;
        return (gVarD == null || !gVarD.a("minus")) ? strValueOf : gVarD.c("minus");
    }

    @Override // yr.h
    public final Locale[] b() {
        return f24098b;
    }

    @Override // yr.h
    public final char c(Locale locale) {
        char zeroDigit = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        g gVarD = f24099c.contains(d.a(locale)) ? g.d("i18n/numbers/symbol", locale) : null;
        return (gVarD == null || !gVarD.a("zero")) ? zeroDigit : gVarD.c("zero").charAt(0);
    }

    public final String toString() {
        return "SymbolProviderSPI";
    }
}
