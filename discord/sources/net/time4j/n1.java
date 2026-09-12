package net.time4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f16678b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0[] f16679c = {m.f16667v, m.f16669x, m.f16670y, m.E, t.f16710d, t.f16711e, t.f16712i, t.f16713v, t.f16714w, t.f16715x};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yr.r0 f16680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m1 f16681e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16682a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        m1 m1Var = new m1();
        f16681e = m1Var;
        Iterator it = vr.c.f21955b.d(yr.r0.class).iterator();
        yr.r0 r0Var = it.hasNext() ? (yr.r0) it.next() : null;
        if (r0Var != null) {
            m1Var = r0Var;
        }
        f16680d = m1Var;
    }

    public n1(Locale locale) {
        m1 m1Var;
        yr.r0 r0Var;
        String strX;
        String strG;
        o oVar;
        String strB;
        o oVar2 = t.f16711e;
        String str = "reltime/relpattern";
        HashMap map = new HashMap(10);
        HashMap map2 = new HashMap(10);
        HashMap map3 = new HashMap(10);
        HashMap map4 = new HashMap(10);
        HashMap map5 = new HashMap(10);
        HashMap map6 = new HashMap(10);
        i0[] i0VarArr = f16679c;
        int length = i0VarArr.length;
        int i7 = 0;
        while (true) {
            m1Var = f16681e;
            r0Var = f16680d;
            if (i7 >= length) {
                break;
            }
            i0 i0Var = i0VarArr[i7];
            i0[] i0VarArr2 = i0VarArr;
            EnumMap enumMap = new EnumMap(yr.i0.class);
            yr.i0[] i0VarArrValues = yr.i0.values();
            int i10 = length;
            int length2 = i0VarArrValues.length;
            int i11 = i7;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = length2;
                yr.i0 i0Var2 = i0VarArrValues[i12];
                int i14 = i12;
                EnumMap enumMap2 = new EnumMap(yr.z.class);
                yr.z[] zVarArrValues = yr.z.values();
                String str2 = str;
                int length3 = zVarArrValues.length;
                int i15 = 0;
                while (i15 < length3) {
                    int i16 = length3;
                    yr.z zVar = zVarArrValues[i15];
                    try {
                        try {
                            strB = b(r0Var, locale, i0Var == oVar2 ? 'N' : i0Var.a(), i0Var2, zVar);
                        } catch (MissingResourceException unused) {
                            strB = b(m1Var, locale, i0Var == oVar2 ? 'N' : i0Var.a(), i0Var2, zVar);
                        }
                    } catch (MissingResourceException unused2) {
                        i15 = i15;
                    }
                    enumMap2.put(zVar, strB);
                    i15++;
                    length3 = i16;
                }
                enumMap.put(i0Var2, Collections.unmodifiableMap(enumMap2));
                i12 = i14 + 1;
                length2 = i13;
                str = str2;
            }
            String str3 = str;
            map.put(i0Var, Collections.unmodifiableMap(enumMap));
            if (Character.isDigit(i0Var.a())) {
                oVar = oVar2;
            } else {
                EnumMap enumMap3 = new EnumMap(yr.z.class);
                yr.z[] zVarArrValues2 = yr.z.values();
                int length4 = zVarArrValues2.length;
                int i17 = 0;
                while (i17 < length4) {
                    yr.z zVar2 = zVarArrValues2[i17];
                    enumMap3.put(zVar2, a(locale, i0Var, false, false, zVar2));
                    i17++;
                    oVar2 = oVar2;
                }
                oVar = oVar2;
                map2.put(i0Var, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(yr.z.class);
                for (yr.z zVar3 : yr.z.values()) {
                    enumMap4.put(zVar3, a(locale, i0Var, false, true, zVar3));
                }
                map4.put(i0Var, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(yr.z.class);
                yr.z[] zVarArrValues3 = yr.z.values();
                int length5 = zVarArrValues3.length;
                int i18 = 0;
                while (i18 < length5) {
                    yr.z zVar4 = zVarArrValues3[i18];
                    enumMap5.put(zVar4, a(locale, i0Var, true, false, zVar4));
                    i18++;
                    zVarArrValues3 = zVarArrValues3;
                }
                map3.put(i0Var, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(yr.z.class);
                for (yr.z zVar5 : yr.z.values()) {
                    enumMap6.put(zVar5, a(locale, i0Var, true, true, zVar5));
                }
                map5.put(i0Var, Collections.unmodifiableMap(enumMap6));
            }
            i7 = i11 + 1;
            i0VarArr = i0VarArr2;
            length = i10;
            oVar2 = oVar;
            str = str3;
        }
        String str4 = str;
        int i19 = 2;
        while (i19 <= 7) {
            Integer numValueOf = Integer.valueOf(i19);
            EnumMap enumMap7 = new EnumMap(yr.i0.class);
            yr.i0[] i0VarArrValues2 = yr.i0.values();
            int length6 = i0VarArrValues2.length;
            int i20 = 0;
            while (i20 < length6) {
                HashMap map7 = map;
                yr.i0 i0Var3 = i0VarArrValues2[i20];
                try {
                    strG = r0Var.g(locale, i0Var3, i19);
                } catch (MissingResourceException unused3) {
                    strG = m1Var.g(locale, i0Var3, i19);
                }
                int i21 = i19;
                enumMap7.put(i0Var3, strG);
                i20++;
                map = map7;
                i19 = i21;
            }
            map6.put(numValueOf, Collections.unmodifiableMap(enumMap7));
            i19++;
        }
        Collections.unmodifiableMap(map);
        Collections.unmodifiableMap(map2);
        Collections.unmodifiableMap(map3);
        Collections.unmodifiableMap(map4);
        Collections.unmodifiableMap(map5);
        Collections.unmodifiableMap(map6);
        EnumMap enumMap8 = new EnumMap(p1.class);
        EnumMap enumMap9 = new EnumMap(p1.class);
        p1[] p1VarArrValues = p1.values();
        int length7 = p1VarArrValues.length;
        int i22 = 0;
        while (true) {
            strX = "";
            if (i22 < length7) {
                p1 p1Var = p1VarArrValues[i22];
                enumMap8.put(p1Var, "");
                enumMap9.put(p1Var, "");
                i22++;
            } else {
                try {
                    break;
                } catch (MissingResourceException unused4) {
                    m1Var.getClass();
                }
            }
        }
        r0Var.b(locale);
        if (r0Var instanceof zr.j) {
            zr.j jVar = (zr.j) zr.j.class.cast(r0Var);
            yr.z zVar6 = yr.z.f23568e;
            jVar.getClass();
            zr.j.x(locale, str4, "yesterday", null, zVar6);
            strX = zr.j.x(locale, str4, "today", null, zVar6);
            zr.j.x(locale, str4, "tomorrow", null, zVar6);
            for (p1 p1Var2 : p1.values()) {
                enumMap8.put(p1Var2, zr.j.w(p1Var2.name().substring(0, 3).toLowerCase() + "-", locale));
                enumMap9.put(p1Var2, zr.j.w(p1Var2.name().substring(0, 3).toLowerCase() + "+", locale));
            }
        }
        this.f16682a = strX;
        Collections.unmodifiableMap(enumMap8);
        Collections.unmodifiableMap(enumMap9);
    }

    public static String a(Locale locale, i0 i0Var, boolean z5, boolean z6, yr.z zVar) {
        o oVar = t.f16711e;
        try {
            try {
                return c(f16680d, locale, i0Var == oVar ? 'N' : i0Var.a(), z5, z6, zVar);
            } catch (MissingResourceException unused) {
                return c(f16681e, locale, i0Var == oVar ? 'N' : i0Var.a(), z5, z6, zVar);
            }
        } catch (MissingResourceException unused2) {
            locale = locale;
            z5 = z5;
            zVar = zVar;
        }
    }

    public static String b(yr.r0 r0Var, Locale locale, char c8, yr.i0 i0Var, yr.z zVar) {
        if (c8 == '3') {
            return r0Var.e(locale, i0Var, zVar);
        }
        if (c8 == '6') {
            return r0Var.l(locale, i0Var, zVar);
        }
        if (c8 == '9') {
            return r0Var.n(locale, i0Var, zVar);
        }
        if (c8 == 'D') {
            return r0Var.f(locale, i0Var, zVar);
        }
        if (c8 == 'H') {
            return r0Var.d(locale, i0Var, zVar);
        }
        if (c8 == 'S') {
            return r0Var.k(locale, i0Var, zVar);
        }
        if (c8 == 'W') {
            return r0Var.a(locale, i0Var, zVar);
        }
        if (c8 == 'Y') {
            return r0Var.q(locale, i0Var, zVar);
        }
        if (c8 == 'M') {
            return r0Var.r(locale, i0Var, zVar);
        }
        if (c8 == 'N') {
            return r0Var.c(locale, i0Var, zVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c8);
    }

    public static String c(yr.r0 r0Var, Locale locale, char c8, boolean z5, boolean z6, yr.z zVar) {
        if (!z6 || !(r0Var instanceof zr.j)) {
            if (c8 == 'D') {
                return r0Var.o(locale, z5, zVar);
            }
            if (c8 == 'H') {
                return r0Var.m(locale, z5, zVar);
            }
            if (c8 == 'S') {
                return r0Var.j(locale, z5, zVar);
            }
            if (c8 == 'W') {
                return r0Var.s(locale, z5, zVar);
            }
            if (c8 == 'Y') {
                return r0Var.h(locale, z5, zVar);
            }
            if (c8 == 'M') {
                return r0Var.i(locale, z5, zVar);
            }
            if (c8 == 'N') {
                return r0Var.p(locale, z5, zVar);
            }
            throw new UnsupportedOperationException("Unit-ID: " + c8);
        }
        zr.j jVar = (zr.j) zr.j.class.cast(r0Var);
        if (c8 == 'D') {
            jVar.getClass();
            return zr.j.y(locale, 'd', z5, zVar);
        }
        if (c8 == 'H') {
            jVar.getClass();
            return zr.j.y(locale, 'h', z5, zVar);
        }
        if (c8 == 'S') {
            jVar.getClass();
            return zr.j.y(locale, 's', z5, zVar);
        }
        if (c8 == 'W') {
            jVar.getClass();
            return zr.j.y(locale, 'w', z5, zVar);
        }
        if (c8 == 'Y') {
            jVar.getClass();
            return zr.j.y(locale, 'y', z5, zVar);
        }
        if (c8 == 'M') {
            jVar.getClass();
            return zr.j.y(locale, 'm', z5, zVar);
        }
        if (c8 == 'N') {
            jVar.getClass();
            return zr.j.y(locale, 'n', z5, zVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c8);
    }
}
