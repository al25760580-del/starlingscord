package wr;

import a3.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import yr.c;
import yr.h0;
import yr.i0;
import yr.y;
import zr.d;
import zr.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f22477a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f22478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f22479c;

    static {
        String[] strArrSplit = g.d("calendar/names/generic/generic", Locale.ROOT).c("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArrSplit);
        hashSet.add("");
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        f22479c = setUnmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : setUnmodifiableSet) {
            if (str.isEmpty()) {
                hashSet2.add(Locale.ROOT);
            } else {
                hashSet2.add(new Locale(str));
            }
        }
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("buddhist");
        hashSet3.add("chinese");
        hashSet3.add("coptic");
        hashSet3.add("dangi");
        hashSet3.add("ethiopic");
        hashSet3.add("frenchrev");
        hashSet3.add("hindu");
        hashSet3.add("generic");
        hashSet3.add("hebrew");
        hashSet3.add("indian");
        hashSet3.add("islamic");
        hashSet3.add("japanese");
        hashSet3.add("juche");
        hashSet3.add("persian");
        hashSet3.add("roc");
        hashSet3.add("vietnam");
        f22478b = Collections.unmodifiableSet(hashSet3);
    }

    public static g h(String str, Locale locale) {
        String strM = e.m("calendar/names/", str, "/", str);
        if (!f22479c.contains(d.a(locale))) {
            locale = Locale.ROOT;
        }
        return g.d(strM, locale);
    }

    public static String[] i(g gVar, String str, String str2, int i7, String str3, i0 i0Var, y yVar, boolean z5, int i10) {
        String[] strArr = new String[i7];
        boolean z6 = str3.length() == 1;
        for (int i11 = 0; i11 < i7; i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append('(');
            y yVar2 = y.f23565e;
            if (z6) {
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
                if (z5) {
                    sb2.append("|LEAP");
                }
            }
            sb2.append(")_");
            sb2.append(i11 + i10);
            if (z5 && i11 == 6 && str.equals("hebrew")) {
                sb2.append('L');
            }
            String string = sb2.toString();
            if (!gVar.a(string)) {
                return null;
            }
            String strC = gVar.c(string);
            if (z5 && str.equals("chinese")) {
                boolean zEquals = str2.equals("en");
                i0 i0Var2 = i0.f23545v;
                if (zEquals) {
                    strC = i0Var == i0Var2 ? "i".concat(strC) : "(leap) ".concat(strC);
                } else if (str2.equals("de") || str2.equals("es") || str2.equals("fr") || str2.equals("it") || str2.equals("pt") || str2.equals("ro")) {
                    strC = i0Var == i0Var2 ? "i".concat(strC) : "(i) ".concat(strC);
                } else if (str2.equals("ja")) {
                    strC = "閏".concat(strC);
                } else if (str2.equals("ko")) {
                    strC = "윤".concat(strC);
                } else if (str2.equals("zh")) {
                    strC = "閏".concat(strC);
                } else if (!str2.equals("vi")) {
                    strC = "*".concat(strC);
                } else if (i0Var == i0Var2) {
                    strC = strC.concat("n");
                } else {
                    strC = strC.concat(yVar == yVar2 ? " Nhuận" : " nhuận");
                }
            }
            strArr[i11] = strC;
        }
        return strArr;
    }

    @Override // yr.h0
    public final String[] a(Locale locale, i0 i0Var, y yVar) {
        return f22477a;
    }

    @Override // yr.h0
    public final String[] b(Locale locale, i0 i0Var, y yVar) {
        return f22477a;
    }

    @Override // yr.h0
    public final boolean c(Locale locale) {
        return true;
    }

    @Override // yr.h0
    public final String[] d(String str, Locale locale, i0 i0Var) {
        i0 i0Var2 = i0Var;
        if (str.equals("chinese") || str.equals("vietnam")) {
            return f22477a;
        }
        if (str.equals("japanese")) {
            return i0Var2 == i0.f23545v ? new String[]{"M", "T", "S", "H"} : new String[]{"Meiji", "Taishō", "Shōwa", "Heisei"};
        }
        int i7 = 1;
        if (str.equals("dangi") || str.equals("juche")) {
            String[] strArrD = d("korean", locale, i0Var);
            return new String[]{str.equals("dangi") ? strArrD[0] : strArrD[1]};
        }
        g gVarH = h(str, locale);
        i0 i0Var3 = i0.f23544i;
        i0 i0Var4 = i0.f23543e;
        if (i0Var2 == i0Var3) {
            i0Var2 = i0Var4;
        }
        String language = locale.getLanguage();
        if (str.equals("hindu")) {
            i7 = 6;
        } else if (str.equals("ethiopic") || str.equals("generic") || str.equals("roc") || str.equals("buddhist") || str.equals("korean")) {
            i7 = 2;
        }
        i0 i0Var5 = i0Var2;
        String[] strArrI = i(gVarH, str, language, i7, (gVarH.a("useShortKeys") && "true".equals(gVarH.c("useShortKeys"))) ? "E" : "ERA", i0Var5, y.f23564d, false, 0);
        if (strArrI == null && i0Var5 != i0Var4) {
            strArrI = d(str, locale, i0Var4);
        }
        if (strArrI != null) {
            return strArrI;
        }
        throw new MissingResourceException("Cannot find calendar resource for era.", a.class.getName(), locale.toString());
    }

    @Override // yr.h0
    public final String[] e(Locale locale, i0 i0Var, y yVar) {
        return f22477a;
    }

    @Override // yr.h0
    public final boolean f(String str) {
        return f22478b.contains(str);
    }

    @Override // yr.h0
    public final String[] g(String str, Locale locale, i0 i0Var, y yVar, boolean z5) {
        String str2 = str;
        Locale locale2 = locale;
        if (str2.equals("roc") || str2.equals("buddhist")) {
            List list = c.a("iso8601", locale2).c(i0Var, yVar, false).f23540a;
            return (String[]) list.toArray(new String[list.size()]);
        }
        if (str2.equals("japanese")) {
            return new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }
        if (str2.equals("dangi") || str2.equals("vietnam")) {
            str2 = "chinese";
        } else if (str2.equals("hindu")) {
            str2 = "indian";
        } else if (str2.equals("juche")) {
            return (String[]) c.a("iso8601", locale2).c(i0Var, yVar, false).f23540a.toArray(new String[12]);
        }
        String str3 = str2;
        g gVarH = h(str3, locale2);
        i0 i0Var2 = i0.f23544i;
        i0 i0Var3 = i0.f23543e;
        i0 i0Var4 = i0Var == i0Var2 ? i0Var3 : i0Var;
        String[] strArrI = i(gVarH, str3, locale2.getLanguage(), (str3.equals("coptic") || str3.equals("ethiopic") || str3.equals("generic") || str3.equals("hebrew")) ? 13 : 12, (gVarH.a("useShortKeys") && "true".equals(gVarH.c("useShortKeys"))) ? "M" : "MONTH_OF_YEAR", i0Var4, yVar, z5, 1);
        i0 i0Var5 = i0Var4;
        if (strArrI == null) {
            y yVar2 = y.f23564d;
            i0 i0Var6 = i0.f23545v;
            y yVar3 = y.f23565e;
            if (yVar == yVar3) {
                if (i0Var5 != i0Var6) {
                    strArrI = g(str3, locale2, i0Var5, yVar2, z5);
                }
            } else if (i0Var5 == i0Var3) {
                locale2 = locale;
                strArrI = g(str3, locale2, i0.f23542d, yVar2, z5);
            } else if (i0Var5 == i0Var6) {
                locale2 = locale;
                strArrI = g(str3, locale2, i0Var5, yVar3, z5);
            }
            locale2 = locale;
        }
        if (strArrI != null) {
            return strArrI;
        }
        throw new MissingResourceException("Cannot find calendar month.", a.class.getName(), locale2.toString());
    }

    public final String toString() {
        return "GenericTextProviderSPI";
    }
}
