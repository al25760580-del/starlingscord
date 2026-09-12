package net.time4j;

import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f16791d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Locale f16792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient String f16793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient SortedMap f16794c;

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(b1.J, "am");
        treeMap.put(b1.x(12), "pm");
        f16791d = new y(Locale.ROOT, "iso8601", Collections.unmodifiableSortedMap(treeMap));
        int i7 = yr.a.f23518b;
        new yr.f0(y.class, "CUSTOM_DAY_PERIOD");
    }

    public y(Locale locale, String str, SortedMap sortedMap) {
        this.f16792a = locale;
        this.f16793b = str;
        this.f16794c = Collections.unmodifiableSortedMap(sortedMap);
    }

    public static String a(b1 b1Var) {
        int iIntValue = ((Integer) b1Var.d(b1.U)).intValue();
        if (iIntValue == 0 || iIntValue == 1440) {
            return "midnight";
        }
        if (iIntValue < 720) {
            return "am";
        }
        return iIntValue == 720 ? "noon" : "pm";
    }

    public static String b(Map map, yr.i0 i0Var, yr.y yVar, String str) {
        char upperCase;
        yr.i0 i0Var2 = yr.i0.f23544i;
        yr.i0 i0Var3 = yr.i0.f23543e;
        if (i0Var == i0Var2) {
            i0Var = i0Var3;
        }
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = i0Var.ordinal();
        if (iOrdinal != 0) {
            upperCase = iOrdinal != 3 ? 'a' : 'n';
        } else {
            upperCase = 'w';
        }
        yr.y yVar2 = yr.y.f23565e;
        if (yVar == yVar2) {
            upperCase = Character.toUpperCase(upperCase);
        }
        sb2.append("P(" + upperCase + ")_");
        sb2.append(str);
        String string = sb2.toString();
        if (!map.containsKey(string)) {
            if (yVar == yVar2) {
                return i0Var == i0Var3 ? b(map, i0Var, yr.y.f23564d, str) : b(map, i0Var3, yVar, str);
            }
            if (i0Var != i0Var3) {
                return b(map, i0Var3, yVar, str);
            }
        }
        return string;
    }

    public static Map d(String str, Locale locale) {
        Map map = yr.c.a(str, locale).f23527d;
        return (str.equals("iso8601") || "true".equals(map.get("hasDayPeriods"))) ? map : yr.c.a("iso8601", locale).f23527d;
    }

    public static y e(String str, Locale locale) {
        String language = locale.getLanguage();
        if (language.equals("nn")) {
            locale = new Locale("nb");
        }
        Map mapD = d(str, locale);
        TreeMap treeMap = new TreeMap();
        for (String str2 : mapD.keySet()) {
            if (str2.charAt(0) == 'T' && str2.length() == 5 && Character.isDigit(str2.charAt(1))) {
                int i7 = Integer.parseInt(str2.substring(1, 3));
                int i10 = Integer.parseInt(str2.substring(3, 5));
                b1 b1Var = b1.J;
                if (i7 != 24) {
                    if (i7 < 0 || i7 >= 24 || i10 < 0 || i10 >= 60) {
                        throw new IllegalStateException("Invalid time key: ".concat(str2));
                    }
                    b1Var = (b1) b1Var.l((i7 * 60) + i10, t.f16711e);
                } else if (i10 != 0) {
                    throw new IllegalStateException("Invalid time key: ".concat(str2));
                }
                treeMap.put(b1Var, mapD.get(str2));
            }
        }
        if (treeMap.isEmpty() || language.isEmpty()) {
            return f16791d;
        }
        Iterator it = treeMap.keySet().iterator();
        String str3 = "";
        while (it.hasNext()) {
            String str4 = (String) treeMap.get((b1) it.next());
            if (str4.equals(str3)) {
                it.remove();
            } else {
                str3 = str4;
            }
        }
        return new y(locale, str, treeMap);
    }

    public final boolean c() {
        return this.f16792a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            Locale locale = yVar.f16792a;
            Locale locale2 = this.f16792a;
            if (locale2 == null) {
                if (locale != null) {
                    return false;
                }
            } else if (!locale2.equals(locale)) {
                return false;
            }
            if (this.f16794c.equals(yVar.f16794c) && this.f16793b.equals(yVar.f16793b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16794c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayPeriod[");
        if (c()) {
            sb2.append("locale=");
            sb2.append(this.f16792a);
            sb2.append(',');
            String str = this.f16793b;
            if (!str.equals("iso8601")) {
                sb2.append(",calendar-type=");
                sb2.append(str);
                sb2.append(',');
            }
        }
        sb2.append(this.f16794c);
        sb2.append(']');
        return sb2.toString();
    }
}
