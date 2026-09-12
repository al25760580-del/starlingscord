package zr;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import yr.h0;
import yr.i0;
import yr.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements h0, yr.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f24086a;

    static {
        String[] strArrSplit = g.d("calendar/names/iso8601/iso8601", Locale.ROOT).c("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArrSplit);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        f24086a = setUnmodifiableSet;
        HashSet hashSet2 = new HashSet();
        Iterator it = setUnmodifiableSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(new Locale((String) it.next()));
        }
        for (d dVar : d.values()) {
            hashSet2.add(new Locale(dVar.name()));
        }
        Collections.unmodifiableSet(hashSet2);
    }

    public static String[] h(Locale locale, i0 i0Var) throws Throwable {
        g gVarD = g.d("calendar/names/iso8601/iso8601", locale);
        String[] strArrJ = null;
        if (gVarD != null) {
            i0 i0Var2 = i0.f23544i;
            i0 i0Var3 = i0.f23543e;
            i0 i0Var4 = i0Var == i0Var2 ? i0Var3 : i0Var;
            strArrJ = j(gVarD, 5, i(gVarD, "ERA"), i0Var4, i0Var4 == i0.f23545v ? i0Var3 : null, y.f23564d, 0);
            if (strArrJ == null && i0Var4 != i0Var3) {
                strArrJ = h(locale, i0Var3);
            }
        }
        if (strArrJ != null) {
            return strArrJ;
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for era and locale: " + locale, c.class.getName(), locale.toString());
    }

    public static String i(g gVar, String str) {
        return (gVar.a("useShortKeys") && "true".equals(gVar.c("useShortKeys"))) ? str.substring(0, 1) : str;
    }

    public static String[] j(g gVar, int i7, String str, i0 i0Var, i0 i0Var2, y yVar, int i10) {
        String[] strArrJ;
        String[] strArr = new String[i7];
        boolean z5 = str.length() == 1;
        for (int i11 = 0; i11 < i7; i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('(');
            y yVar2 = y.f23565e;
            if (z5) {
                char cCharAt = i0Var.name().charAt(0);
                if (yVar != yVar2) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                sb2.append(cCharAt);
            } else {
                sb2.append(i0Var.name());
                if (yVar == yVar2) {
                    sb2.append('|');
                    sb2.append(yVar.name());
                }
            }
            sb2.append(")_");
            sb2.append(i11 + i10);
            String string = sb2.toString();
            if (gVar.a(string)) {
                strArr[i11] = gVar.c(string);
            } else {
                if (i0Var2 == null || (strArrJ = j(gVar, i7, str, i0Var2, null, yVar, i10)) == null) {
                    return null;
                }
                strArr[i11] = strArrJ[i11];
            }
        }
        return strArr;
    }

    public static String k(String str, i0 i0Var, y yVar) {
        char cCharAt = i0Var.name().charAt(0);
        if (yVar == y.f23564d) {
            cCharAt = Character.toLowerCase(cCharAt);
        }
        return "P(" + String.valueOf(cCharAt) + ")_" + str;
    }

    public static String[] l(Locale locale, i0 i0Var, y yVar) throws Throwable {
        g gVarD = g.d("calendar/names/iso8601/iso8601", locale);
        if (gVarD != null) {
            i0 i0Var2 = i0.f23544i;
            i0 i0Var3 = i0.f23543e;
            if (i0Var == i0Var2) {
                i0Var = i0Var3;
            }
            String strK = k("am", i0Var, yVar);
            String strK2 = k("pm", i0Var, yVar);
            if (gVarD.a(strK) && gVarD.a(strK2)) {
                return new String[]{gVarD.c(strK), gVarD.c(strK2)};
            }
            if (yVar == y.f23565e) {
                return i0Var == i0Var3 ? l(locale, i0Var, y.f23564d) : l(locale, i0Var3, yVar);
            }
            if (i0Var != i0Var3) {
                return l(locale, i0Var3, yVar);
            }
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for am/pm and locale: " + locale, c.class.getName(), locale.toString());
    }

    public static String[] m(Locale locale, i0 i0Var, y yVar) throws Throwable {
        String[] strArrJ;
        g gVarD = g.d("calendar/names/iso8601/iso8601", locale);
        if (gVarD != null) {
            i0 i0Var2 = i0.f23544i;
            i0 i0Var3 = i0.f23543e;
            i0 i0Var4 = i0Var == i0Var2 ? i0Var3 : i0Var;
            strArrJ = j(gVarD, 12, i(gVarD, "MONTH_OF_YEAR"), i0Var4, null, yVar, 1);
            if (strArrJ == null) {
                y yVar2 = y.f23564d;
                i0 i0Var5 = i0.f23545v;
                y yVar3 = y.f23565e;
                if (yVar == yVar3) {
                    if (i0Var4 != i0Var5) {
                        strArrJ = m(locale, i0Var4, yVar2);
                    }
                } else if (i0Var4 == i0Var3) {
                    strArrJ = m(locale, i0.f23542d, yVar2);
                } else if (i0Var4 == i0Var5) {
                    strArrJ = m(locale, i0Var4, yVar3);
                }
            }
        } else {
            strArrJ = null;
        }
        if (strArrJ != null) {
            return strArrJ;
        }
        throw new MissingResourceException("Cannot find ISO-8601-month for locale: " + locale, c.class.getName(), locale.toString());
    }

    public static String[] n(Locale locale, i0 i0Var, y yVar) throws Throwable {
        String[] strArrJ;
        g gVarD = g.d("calendar/names/iso8601/iso8601", locale);
        if (gVarD != null) {
            i0 i0Var2 = i0.f23544i;
            i0 i0Var3 = i0.f23543e;
            i0 i0Var4 = i0Var == i0Var2 ? i0Var3 : i0Var;
            strArrJ = j(gVarD, 4, i(gVarD, "QUARTER_OF_YEAR"), i0Var4, null, yVar, 1);
            if (strArrJ == null) {
                y yVar2 = y.f23564d;
                i0 i0Var5 = i0.f23545v;
                y yVar3 = y.f23565e;
                if (yVar == yVar3) {
                    if (i0Var4 != i0Var5) {
                        strArrJ = n(locale, i0Var4, yVar2);
                    }
                } else if (i0Var4 == i0Var3) {
                    strArrJ = n(locale, i0.f23542d, yVar2);
                } else if (i0Var4 == i0Var5) {
                    strArrJ = n(locale, i0Var4, yVar3);
                }
            }
        } else {
            strArrJ = null;
        }
        if (strArrJ != null) {
            return strArrJ;
        }
        throw new MissingResourceException("Cannot find ISO-8601-quarter-of-year for locale: " + locale, c.class.getName(), locale.toString());
    }

    public static String[] o(Locale locale, i0 i0Var, y yVar) throws Throwable {
        String[] strArrJ;
        g gVarD = g.d("calendar/names/iso8601/iso8601", locale);
        if (gVarD != null) {
            strArrJ = j(gVarD, 7, i(gVarD, "DAY_OF_WEEK"), i0Var, null, yVar, 1);
            if (strArrJ == null) {
                i0 i0Var2 = i0.f23545v;
                y yVar2 = y.f23564d;
                y yVar3 = y.f23565e;
                if (yVar != yVar3) {
                    i0 i0Var3 = i0.f23543e;
                    if (i0Var == i0Var3) {
                        strArrJ = o(locale, i0.f23542d, yVar2);
                    } else if (i0Var == i0.f23544i) {
                        strArrJ = o(locale, i0Var3, yVar2);
                    } else if (i0Var == i0Var2) {
                        strArrJ = o(locale, i0Var, yVar3);
                    }
                } else if (i0Var != i0Var2) {
                    strArrJ = o(locale, i0Var, yVar2);
                }
            }
        } else {
            strArrJ = null;
        }
        if (strArrJ != null) {
            return strArrJ;
        }
        throw new MissingResourceException("Cannot find ISO-8601-day-of-week for locale: " + locale, c.class.getName(), locale.toString());
    }

    @Override // yr.h0
    public final String[] a(Locale locale, i0 i0Var, y yVar) {
        return l(locale, i0Var, yVar);
    }

    @Override // yr.h0
    public final String[] b(Locale locale, i0 i0Var, y yVar) {
        return n(locale, i0Var, yVar);
    }

    @Override // yr.h0
    public final boolean c(Locale locale) {
        return f24086a.contains(d.a(locale));
    }

    @Override // yr.h0
    public final String[] d(String str, Locale locale, i0 i0Var) {
        return h(locale, i0Var);
    }

    @Override // yr.h0
    public final String[] e(Locale locale, i0 i0Var, y yVar) {
        return o(locale, i0Var, yVar);
    }

    @Override // yr.h0
    public final boolean f(String str) {
        return "iso8601".equals(str);
    }

    @Override // yr.h0
    public final String[] g(String str, Locale locale, i0 i0Var, y yVar, boolean z5) {
        return m(locale, i0Var, yVar);
    }

    public final String toString() {
        return "IsoTextProviderSPI";
    }
}
