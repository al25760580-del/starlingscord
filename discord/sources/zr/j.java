package zr;

import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import java.util.MissingResourceException;
import yr.i0;
import yr.r0;
import yr.z;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements r0 {
    public static String A(char c8, int i7, String str) {
        int length = str.length();
        int i10 = length - 2;
        for (int i11 = 0; i11 < i10; i11++) {
            if (str.charAt(i11) == '{') {
                int i12 = i11 + 1;
                if (str.charAt(i12) == c8) {
                    int i13 = i11 + 2;
                    if (str.charAt(i13) == '}') {
                        StringBuilder sb2 = new StringBuilder(length + 8);
                        sb2.append(str);
                        sb2.replace(i12, i13, String.valueOf(i7));
                        return sb2.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    public static String t(char c8, i0 i0Var, z zVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c8);
        int iOrdinal = i0Var.ordinal();
        if (iOrdinal == 0) {
            sb2.append('w');
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            sb2.append('s');
        } else {
            if (iOrdinal != 3) {
                throw new UnsupportedOperationException(i0Var.name());
            }
            sb2.append('n');
        }
        sb2.append(zVar.ordinal());
        return sb2.toString();
    }

    public static String u(char c8, boolean z5, z zVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c8);
        sb2.append(z5 ? '+' : '-');
        sb2.append(zVar.ordinal());
        return sb2.toString();
    }

    public static String v(i0 i0Var, String str) {
        StringBuilder sb2 = new StringBuilder("L");
        int iOrdinal = i0Var.ordinal();
        if (iOrdinal == 0) {
            sb2.append('w');
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            sb2.append('s');
        } else {
            if (iOrdinal != 3) {
                throw new UnsupportedOperationException(i0Var.name());
            }
            sb2.append('n');
        }
        sb2.append('-');
        sb2.append(str);
        return sb2.toString();
    }

    public static String w(String str, Locale locale) {
        boolean z5 = true;
        g gVar = null;
        for (Locale locale2 : g.b(locale)) {
            g gVarD = (!z5 || gVar == null) ? g.d("i18n/reltime/relpattern", locale2) : gVar;
            if (z5) {
                if (locale2.equals(gVarD.f24097d)) {
                    z5 = false;
                } else {
                    gVar = gVarD;
                }
            }
            if (gVarD.f24095b.keySet().contains(str)) {
                return gVarD.c(str);
            }
        }
        return "";
    }

    public static String x(Locale locale, String str, String str2, String str3, z zVar) {
        boolean z5 = true;
        g gVar = null;
        for (Locale locale2 : g.b(locale)) {
            g gVarD = (!z5 || gVar == null) ? g.d("i18n/".concat(str), locale2) : gVar;
            if (z5) {
                if (locale2.equals(gVarD.f24097d)) {
                    z5 = false;
                } else {
                    gVar = gVarD;
                }
            }
            if (gVarD.f24095b.keySet().contains(str2)) {
                return gVarD.c(str2);
            }
            if (zVar != z.f23568e && gVarD.f24095b.keySet().contains(str3)) {
                return gVarD.c(str3);
            }
        }
        throw new MissingResourceException(a3.e.m("Can't find resource for bundle ", str, ".properties, key ", str2), str.concat(".properties"), str2);
    }

    public static String y(Locale locale, char c8, boolean z5, z zVar) {
        return x(locale, "reltime/relpattern", u(c8, z5, zVar), u(c8, z5, z.f23568e), zVar);
    }

    public static String z(Locale locale, char c8, i0 i0Var, z zVar) {
        return x(locale, "units/upattern", t(c8, i0Var, zVar), t(c8, i0Var, z.f23568e), zVar);
    }

    @Override // yr.r0
    public final String a(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'W', i0Var, zVar);
    }

    @Override // yr.r0
    public final String b(Locale locale) {
        return x(locale, "reltime/relpattern", "now", null, z.f23568e);
    }

    @Override // yr.r0
    public final String c(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'N', i0Var, zVar);
    }

    @Override // yr.r0
    public final String d(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'H', i0Var, zVar);
    }

    @Override // yr.r0
    public final String e(Locale locale, i0 i0Var, z zVar) {
        return z(locale, '3', i0Var, zVar);
    }

    @Override // yr.r0
    public final String f(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'D', i0Var, zVar);
    }

    @Override // yr.r0
    public final String g(Locale locale, i0 i0Var, int i7) throws Throwable {
        int i10;
        if (i7 < 2) {
            throw new IllegalArgumentException("Size must be greater than 1.");
        }
        g gVarD = g.d("i18n/units/upattern", locale);
        String strV = v(i0Var, String.valueOf(i7));
        if (gVarD.a(strV)) {
            return gVarD.c(strV);
        }
        String strC = gVarD.c(v(i0Var, ViewProps.END));
        if (i7 == 2) {
            return strC;
        }
        String strC2 = gVarD.c(v(i0Var, ViewProps.START));
        String strC3 = gVarD.c(v(i0Var, "middle"));
        String strA = A('0', i7 - 2, A('1', i7 - 1, strC));
        int i11 = i7 - 3;
        String strA2 = strA;
        while (i11 >= 0) {
            String str = i11 == 0 ? strC2 : strC3;
            int length = str.length();
            int i12 = length - 1;
            while (true) {
                if (i12 < 0) {
                    i10 = -1;
                    break;
                }
                if (i12 >= 2 && str.charAt(i12) == '}' && str.charAt(i12 - 1) == '1') {
                    i10 = i12 - 2;
                    if (str.charAt(i10) == '{') {
                        break;
                    }
                }
                i12--;
            }
            if (i10 > -1) {
                strA = str.substring(0, i10) + strA2;
                if (i10 < length - 3) {
                    StringBuilder sbN = kk.b.n(strA);
                    sbN.append(str.substring(i10 + 3));
                    strA = sbN.toString();
                }
            }
            if (i11 > 0) {
                strA2 = A('0', i11, strA);
            }
            i11--;
        }
        return strA;
    }

    @Override // yr.r0
    public final String h(Locale locale, boolean z5, z zVar) {
        return y(locale, 'Y', z5, zVar);
    }

    @Override // yr.r0
    public final String i(Locale locale, boolean z5, z zVar) {
        return y(locale, 'M', z5, zVar);
    }

    @Override // yr.r0
    public final String j(Locale locale, boolean z5, z zVar) {
        return y(locale, 'S', z5, zVar);
    }

    @Override // yr.r0
    public final String k(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'S', i0Var, zVar);
    }

    @Override // yr.r0
    public final String l(Locale locale, i0 i0Var, z zVar) {
        return z(locale, '6', i0Var, zVar);
    }

    @Override // yr.r0
    public final String m(Locale locale, boolean z5, z zVar) {
        return y(locale, 'H', z5, zVar);
    }

    @Override // yr.r0
    public final String n(Locale locale, i0 i0Var, z zVar) {
        return z(locale, '9', i0Var, zVar);
    }

    @Override // yr.r0
    public final String o(Locale locale, boolean z5, z zVar) {
        return y(locale, 'D', z5, zVar);
    }

    @Override // yr.r0
    public final String p(Locale locale, boolean z5, z zVar) {
        return y(locale, 'N', z5, zVar);
    }

    @Override // yr.r0
    public final String q(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'Y', i0Var, zVar);
    }

    @Override // yr.r0
    public final String r(Locale locale, i0 i0Var, z zVar) {
        return z(locale, 'M', i0Var, zVar);
    }

    @Override // yr.r0
    public final String s(Locale locale, boolean z5, z zVar) {
        return y(locale, 'W', z5, zVar);
    }
}
