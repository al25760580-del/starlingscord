package yr;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f23521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f23522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f23523i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f23527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Locale f23529f;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("ar");
        hashSet.add("dv");
        hashSet.add("fa");
        hashSet.add("ha");
        hashSet.add("he");
        hashSet.add("iw");
        hashSet.add("ji");
        hashSet.add("ps");
        hashSet.add("sd");
        hashSet.add("ug");
        hashSet.add("ur");
        hashSet.add("yi");
        Collections.unmodifiableSet(hashSet);
        Iterator it = vr.c.f21955b.d(e.class).iterator();
        new ur.a(it.hasNext() ? (e) it.next() : new zr.c());
        f23521g = new b(1);
        f23522h = new b(0);
        f23523i = new ConcurrentHashMap();
    }

    public c(String str, Locale locale, h0 h0Var) throws Throwable {
        this.f23524a = h0Var.toString();
        int i7 = 0;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(b(str, locale, h0Var, false));
        this.f23525b = mapUnmodifiableMap;
        EnumMap enumMapB = b(str, locale, h0Var, true);
        if (enumMapB == null) {
            this.f23526c = mapUnmodifiableMap;
        } else {
            this.f23526c = Collections.unmodifiableMap(enumMapB);
        }
        EnumMap enumMap = new EnumMap(i0.class);
        i0[] i0VarArrValues = i0.values();
        int length = i0VarArrValues.length;
        int i10 = 0;
        while (i10 < length) {
            i0 i0Var = i0VarArrValues[i10];
            EnumMap enumMap2 = new EnumMap(y.class);
            y[] yVarArrValues = y.values();
            int length2 = yVarArrValues.length;
            int i11 = i7;
            while (i11 < length2) {
                y yVar = yVarArrValues[i11];
                enumMap2.put(yVar, new g0(h0Var.b(locale, i0Var, yVar)));
                i11++;
                i0VarArrValues = i0VarArrValues;
            }
            enumMap.put(i0Var, enumMap2);
            i10++;
            i7 = 0;
        }
        Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(i0.class);
        i0[] i0VarArrValues2 = i0.values();
        int length3 = i0VarArrValues2.length;
        for (int i12 = 0; i12 < length3; i12++) {
            i0 i0Var2 = i0VarArrValues2[i12];
            EnumMap enumMap4 = new EnumMap(y.class);
            y[] yVarArrValues2 = y.values();
            int length4 = yVarArrValues2.length;
            int i13 = 0;
            while (i13 < length4) {
                y yVar2 = yVarArrValues2[i13];
                enumMap4.put(yVar2, new g0(h0Var.e(locale, i0Var2, yVar2)));
                i13++;
                i0VarArrValues2 = i0VarArrValues2;
                length3 = length3;
            }
            enumMap3.put(i0Var2, enumMap4);
        }
        Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(i0.class);
        for (i0 i0Var3 : i0.values()) {
            enumMap5.put(i0Var3, new g0(h0Var.d(str, locale, i0Var3)));
        }
        Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(i0.class);
        i0[] i0VarArrValues3 = i0.values();
        int length5 = i0VarArrValues3.length;
        for (int i14 = 0; i14 < length5; i14++) {
            i0 i0Var4 = i0VarArrValues3[i14];
            EnumMap enumMap7 = new EnumMap(y.class);
            y[] yVarArrValues3 = y.values();
            int length6 = yVarArrValues3.length;
            int i15 = 0;
            while (i15 < length6) {
                y yVar3 = yVarArrValues3[i15];
                enumMap7.put(yVar3, new g0(h0Var.a(locale, i0Var4, yVar3)));
                i15++;
                i0VarArrValues3 = i0VarArrValues3;
            }
            enumMap6.put(i0Var4, enumMap7);
        }
        Collections.unmodifiableMap(enumMap6);
        HashMap map = new HashMap();
        try {
            zr.g gVarD = zr.g.d("calendar/names/" + str + "/" + str, locale);
            gVarD.getClass();
            HashSet hashSet = new HashSet(gVarD.f24095b.keySet());
            zr.g gVar = gVarD;
            while (true) {
                gVar = gVar.f24094a;
                if (gVar == null) {
                    break;
                } else {
                    hashSet.addAll(gVar.f24095b.keySet());
                }
            }
            for (String str2 : Collections.unmodifiableSet(hashSet)) {
                map.put(str2, gVarD.c(str2));
            }
        } catch (MissingResourceException unused) {
        }
        this.f23527d = Collections.unmodifiableMap(map);
        this.f23528e = str;
        this.f23529f = locale;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[PHI: r5
      0x0088: PHI (r5v4 yr.h0) = (r5v3 yr.h0), (r5v5 yr.h0) binds: [B:22:0x0071, B:28:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    public static c a(String str, Locale locale) {
        h0 h0Var;
        if (str == null) {
            throw new NullPointerException("Missing calendar type.");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            sb2.append('-');
            sb2.append(country);
        }
        String string = sb2.toString();
        ConcurrentHashMap concurrentHashMap = f23523i;
        c cVar = (c) concurrentHashMap.get(string);
        if (cVar == null) {
            boolean zIsEmpty = locale.getLanguage().isEmpty();
            h0 h0Var2 = f23522h;
            if (!zIsEmpty || !str.equals("iso8601")) {
                Iterator it = vr.c.f21955b.d(h0.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        h0Var = null;
                        break;
                    }
                    h0Var = (h0) it.next();
                    if (h0Var.f(str) && h0Var.c(locale)) {
                        break;
                    }
                }
                if (h0Var == null) {
                    b bVar = f23521g;
                    bVar.getClass();
                    if ("iso8601".equals(str) && bVar.c(locale)) {
                        h0Var = bVar;
                    }
                    if (h0Var != null) {
                        h0Var2 = h0Var;
                    }
                } else {
                    h0Var2 = h0Var;
                }
            }
            cVar = new c(str, locale, h0Var2);
            c cVar2 = (c) concurrentHashMap.putIfAbsent(string, cVar);
            if (cVar2 != null) {
                return cVar2;
            }
        }
        return cVar;
    }

    public static EnumMap b(String str, Locale locale, h0 h0Var, boolean z5) {
        EnumMap enumMap = new EnumMap(i0.class);
        boolean z6 = false;
        for (i0 i0Var : i0.values()) {
            EnumMap enumMap2 = new EnumMap(y.class);
            for (y yVar : y.values()) {
                String[] strArrG = h0Var.g(str, locale, i0Var, yVar, z5);
                if (z5 && !z6) {
                    z6 = !Arrays.equals(h0Var.g(str, locale, i0Var, yVar, false), strArrG);
                }
                enumMap2.put(yVar, new g0(strArrG));
            }
            enumMap.put(i0Var, enumMap2);
        }
        if (!z5 || z6) {
            return enumMap;
        }
        return null;
    }

    public final g0 c(i0 i0Var, y yVar, boolean z5) {
        return z5 ? (g0) ((Map) this.f23526c.get(i0Var)).get(yVar) : (g0) ((Map) this.f23525b.get(i0Var)).get(yVar);
    }

    public final String toString() {
        return this.f23524a + "(" + this.f23528e + "/" + this.f23529f + ")";
    }
}
