package com.facebook.hermes.intl;

import ag.b;
import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import op.c;
import x9.a0;
import x9.b0;
import x9.d0;
import x9.e;
import x9.f;
import x9.g;
import x9.i;
import x9.j;
import x9.k;
import x9.l;
import x9.m;
import x9.n;
import x9.o;
import x9.p;
import x9.q;
import x9.z;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class DateTimeFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f4752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f4753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f4759i;
    public final p j;
    public final g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f4760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f4761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f4762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f4763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f4764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f4765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f4766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f4767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f4768t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f4769u;

    /* JADX WARN: Code duplicated, block: B:100:0x039f  */
    /* JADX WARN: Code duplicated, block: B:101:0x03a1 A[Catch: ClassCastException -> 0x03b1, TRY_LEAVE, TryCatch #2 {ClassCastException -> 0x03b1, blocks: (B:94:0x037e, B:93:0x0377, B:95:0x0381, B:98:0x0393, B:101:0x03a1), top: B:331:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:103:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b1 A[PHI: r42
      0x03b1: PHI (r42v4 char) = (r42v2 char), (r42v5 char), (r42v6 char) binds: [B:104:0x03af, B:102:0x03ab, B:326:0x03b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:109:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:113:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:118:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x03db  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:268:0x058c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x058e  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:275:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:277:0x05e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:286:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x060d  */
    /* JADX WARN: Code duplicated, block: B:296:0x062e  */
    /* JADX WARN: Code duplicated, block: B:300:0x063a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0643  */
    /* JADX WARN: Code duplicated, block: B:304:0x0655  */
    /* JADX WARN: Code duplicated, block: B:305:0x0671  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a A[LOOP:2: B:28:0x0097->B:30:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x067e  */
    /* JADX WARN: Code duplicated, block: B:311:0x068e  */
    /* JADX WARN: Code duplicated, block: B:315:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:317:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:318:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:321:0x06d7 A[LOOP:4: B:66:0x01f2->B:321:0x06d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x0678 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:52:0x016b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0173  */
    /* JADX WARN: Code duplicated, block: B:56:0x0194  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0338  */
    /* JADX WARN: Code duplicated, block: B:79:0x0357 A[Catch: ClassCastException -> 0x03af, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x03af, blocks: (B:76:0x033a, B:77:0x0351, B:79:0x0357), top: B:327:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0361  */
    /* JADX WARN: Code duplicated, block: B:83:0x0364  */
    /* JADX WARN: Code duplicated, block: B:85:0x0367  */
    /* JADX WARN: Code duplicated, block: B:97:0x0391  */
    /* JADX WARN: Code duplicated, block: B:98:0x0393 A[Catch: ClassCastException -> 0x03b1, TryCatch #2 {ClassCastException -> 0x03b1, blocks: (B:94:0x037e, B:93:0x0377, B:95:0x0381, B:98:0x0393, B:101:0x03a1), top: B:331:0x037e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.hermes.intl.DateTimeFormat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.hermes.intl.DateTimeFormat] */
    @a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws b {
        String str;
        Object objD;
        Object objD2;
        Object objD3;
        String str2;
        String str3;
        boolean z5;
        Object objC;
        Object objC2;
        Object objC3;
        Object objC4;
        String string;
        String[] availableIDs;
        int length;
        int i7;
        ?? r5;
        String str4;
        int i10;
        boolean z6;
        String id2;
        ?? r6;
        String str5;
        boolean z7;
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        char c8;
        j jVar5;
        j jVar6;
        boolean z10;
        String pattern;
        StringBuilder sb2;
        int i11;
        String string2;
        char cCharAt;
        c cVar;
        b0 b0Var;
        String str6;
        String str7;
        j jVar7;
        e eVar;
        n nVar;
        StringBuilder sb3;
        n nVar2;
        e eVar2;
        String localizedPattern;
        HashMap mapD;
        int i12;
        char c10;
        String str8;
        String string3;
        Calendar calendar;
        b0 b0Var2;
        c cVar2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String[] strArr;
        int i13;
        a0 a0Var = x9.a.f22664e;
        ?? obj = new Object();
        obj.f4752b = null;
        obj.f4753c = null;
        obj.f4769u = null;
        c cVar3 = new c(14);
        cVar3.f17490e = null;
        obj.f4751a = cVar3;
        String str21 = "nu";
        List listAsList = Arrays.asList("ca", "nu", "hc");
        if (!(map instanceof HashMap)) {
            throw new b("Invalid options object !", 9);
        }
        String[] strArr2 = {"weekday", "year", "month", "day"};
        boolean z11 = true;
        for (int i14 = 0; i14 < 4; i14++) {
            if (!(x9.a.c(map, strArr2[i14]) instanceof a0)) {
                z11 = false;
            }
        }
        String[] strArr3 = {"hour", "minute", "second"};
        for (int i15 = 0; i15 < 3; i15++) {
            if (!(x9.a.c(map, strArr3[i15]) instanceof a0)) {
                z11 = false;
            }
        }
        if (x9.a.c(map, "dateStyle") instanceof a0) {
            str = "dateStyle";
            if (!(x9.a.c(map, "timeStyle") instanceof a0)) {
            }
            if (z11) {
                strArr = new String[]{"year", "month", "day"};
                for (i13 = 0; i13 < 3; i13++) {
                    ((HashMap) map).put(strArr[i13], "numeric");
                }
            }
            HashMap map2 = new HashMap();
            map2.put("localeMatcher", x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit"));
            objD = x9.a.d(map, "calendar", 2, a0Var, a0Var);
            if (!(objD instanceof a0)) {
                str20 = (String) objD;
                if (!x9.a.i(0, str20.length() - 1, str20, 3, 8)) {
                    throw new b("Invalid calendar option !", 9);
                }
            }
            map2.put("ca", objD);
            objD2 = x9.a.d(map, "numberingSystem", 2, a0Var, a0Var);
            if (!(objD2 instanceof a0)) {
                str19 = (String) objD2;
                if (!x9.a.i(0, str19.length() - 1, str19, 3, 8)) {
                    throw new b("Invalid numbering system !", 9);
                }
            }
            map2.put("nu", objD2);
            objD3 = x9.a.d(map, "hour12", 1, a0Var, a0Var);
            str2 = "h23";
            str3 = "weekday";
            z5 = objD3 instanceof a0;
            map2.put("hc", z5 ? x9.a.d(map, "hourCycle", 2, new String[]{"h11", "h12", "h23", "h24"}, a0Var) : x9.a.f22665f);
            HashMap mapK = x9.a.k(list, map2, listAsList);
            b0 b0Var3 = (b0) mapK.get("locale");
            obj.f4752b = b0Var3;
            obj.f4753c = b0Var3.a();
            objC = x9.a.c(mapK, "ca");
            if (objC instanceof z) {
                obj.f4754d = true;
                String type = DateFormat.getDateInstance(3, (ULocale) obj.f4752b.c()).getCalendar().getType();
                fk.i iVar = d0.f22687d;
                obj.f4755e = iVar.containsKey(type) ? (String) iVar.get(type) : type;
            } else {
                obj.f4754d = false;
                obj.f4755e = (String) objC;
            }
            objC2 = x9.a.c(mapK, "nu");
            if (objC2 instanceof z) {
                obj.f4756f = true;
                obj.f4757g = NumberingSystem.getInstance((ULocale) obj.f4752b.c()).getName();
            } else {
                obj.f4756f = false;
                obj.f4757g = (String) objC2;
            }
            objC3 = x9.a.c(mapK, "hc");
            objC4 = x9.a.c(map, "timeZone");
            if (objC4 instanceof a0) {
                id2 = Calendar.getInstance((ULocale) obj.f4752b.c()).getTimeZone().getID();
                z6 = z5;
                r6 = obj;
            } else {
                string = objC4.toString();
                availableIDs = TimeZone.getAvailableIDs();
                length = availableIDs.length;
                i7 = 0;
                while (true) {
                    if (i7 < length) {
                        r5 = obj;
                        throw new b("Invalid timezone name!", 9);
                    }
                    str4 = availableIDs[i7];
                    i10 = i7;
                    z6 = z5;
                    if (a(str4).equals(a(string))) {
                        r5 = obj;
                        id2 = str4;
                        r6 = r5;
                        break;
                    } else {
                        r5 = obj;
                        r5 = this;
                        i7 = i10 + 1;
                        str2 = str2;
                        z5 = z6;
                        str3 = str3;
                        str21 = str21;
                    }
                }
            }
            r6.f4769u = id2;
            str5 = str21;
            r6.j = (p) x9.a.l(p.class, x9.a.d(map, str3, 2, new String[]{"long", "short", "narrow"}, a0Var));
            r6.k = (g) x9.a.l(g.class, x9.a.d(map, "era", 2, new String[]{"long", "short", "narrow"}, a0Var));
            String str22 = str2;
            r6.f4760l = (q) x9.a.l(q.class, x9.a.d(map, "year", 2, new String[]{"numeric", "2-digit"}, a0Var));
            r6.f4761m = (l) x9.a.l(l.class, x9.a.d(map, "month", 2, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, a0Var));
            r6.f4762n = (f) x9.a.l(f.class, x9.a.d(map, "day", 2, new String[]{"numeric", "2-digit"}, a0Var));
            Object objD4 = x9.a.d(map, "hour", 2, new String[]{"numeric", "2-digit"}, a0Var);
            r6.f4763o = (i) x9.a.l(i.class, objD4);
            r6.f4764p = (k) x9.a.l(k.class, x9.a.d(map, "minute", 2, new String[]{"numeric", "2-digit"}, a0Var));
            r6.f4765q = (m) x9.a.l(m.class, x9.a.d(map, "second", 2, new String[]{"numeric", "2-digit"}, a0Var));
            r6.f4766r = (o) x9.a.l(o.class, x9.a.d(map, "timeZoneName", 2, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, a0Var));
            r6.f4767s = (e) x9.a.l(e.class, x9.a.d(map, str, 2, new String[]{"full", "long", "medium", "short"}, a0Var));
            Object objD5 = x9.a.d(map, "timeStyle", 2, new String[]{"full", "long", "medium", "short"}, a0Var);
            r6.f4768t = (n) x9.a.l(n.class, objD5);
            z7 = objD4 instanceof a0;
            jVar = j.f22699e;
            jVar2 = j.f22701v;
            jVar3 = j.f22698d;
            jVar4 = j.f22700i;
            if (z7 || !(objD5 instanceof a0)) {
                try {
                    z10 = false;
                    pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) r6.f4752b.c())).toPattern();
                    sb2 = new StringBuilder();
                    for (i11 = 0; i11 < pattern.length(); i11++) {
                        cCharAt = pattern.charAt(i11);
                        c8 = 'h';
                        if (cCharAt == '\'') {
                            z10 = !z10;
                        } else if (!z10 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                            sb2.append(pattern.charAt(i11));
                        }
                        try {
                        } catch (ClassCastException unused) {
                        }
                    }
                    c8 = 'h';
                    string2 = sb2.toString();
                    if (string2.contains(String.valueOf('h'))) {
                        jVar5 = jVar;
                    } else if (string2.contains(String.valueOf('K'))) {
                        jVar5 = jVar3;
                    } else if (string2.contains(String.valueOf('H'))) {
                        jVar5 = jVar4;
                    } else {
                        jVar5 = jVar2;
                    }
                } catch (ClassCastException unused2) {
                    c8 = 'h';
                }
                if (objC3 instanceof z) {
                    jVar6 = jVar5;
                } else {
                    jVar6 = (j) x9.a.l(j.class, objC3);
                }
                if (!z6) {
                    if (((Boolean) objD3).booleanValue()) {
                        if (jVar5 != jVar3 || jVar5 == jVar4) {
                            jVar6 = jVar3;
                        } else {
                            jVar6 = jVar;
                        }
                    } else if (jVar5 != jVar3 || jVar5 == jVar4) {
                        jVar6 = jVar4;
                    } else {
                        jVar6 = jVar2;
                    }
                }
                r6.f4759i = jVar6;
            } else {
                r6.f4759i = j.f22702w;
                c8 = 'h';
            }
            r6.f4758h = objD3;
            cVar = r6.f4751a;
            b0Var = r6.f4752b;
            if (r6.f4754d) {
                str6 = "";
            } else {
                str6 = r6.f4755e;
            }
            if (r6.f4756f) {
                str7 = "";
            } else {
                str7 = r6.f4757g;
            }
            p pVar = r6.j;
            g gVar = r6.k;
            q qVar = r6.f4760l;
            l lVar = r6.f4761m;
            f fVar = r6.f4762n;
            i iVar2 = r6.f4763o;
            k kVar = r6.f4764p;
            m mVar = r6.f4765q;
            o oVar = r6.f4766r;
            jVar7 = r6.f4759i;
            String str23 = r6.f4769u;
            eVar = r6.f4767s;
            nVar = r6.f4768t;
            sb3 = new StringBuilder();
            nVar2 = n.f22710d;
            eVar2 = e.f22689d;
            if (eVar == eVar2 || nVar != nVar2) {
                if (eVar == eVar2) {
                    localizedPattern = ((SimpleDateFormat) DateFormat.getTimeInstance(c.k(nVar), (ULocale) b0Var.c())).toLocalizedPattern();
                } else if (nVar == nVar2) {
                    localizedPattern = ((SimpleDateFormat) DateFormat.getDateInstance(c.g(eVar), (ULocale) b0Var.c())).toLocalizedPattern();
                } else {
                    localizedPattern = ((SimpleDateFormat) DateFormat.getDateTimeInstance(c.g(eVar), c.k(nVar), (ULocale) b0Var.c())).toLocalizedPattern();
                }
                sb3.append(localizedPattern);
                mapD = b0Var.d();
                if (mapD.containsKey("hc")) {
                    str8 = (String) mapD.get("hc");
                    if (str8 != "h11" || str8 == "h12") {
                        c.b(sb3, new char[]{'H', 'K', 'k'}, c8);
                    } else if (str8 == str22 || str8 == "h24") {
                        c.b(sb3, new char[]{'h', 'H', 'K'}, 'k');
                    }
                }
                if (jVar7 != jVar3 || jVar7 == jVar) {
                    i12 = 3;
                    c10 = 'h';
                    c.b(sb3, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    if (jVar7 == jVar4 || jVar7 == jVar2) {
                        i12 = 3;
                        c.b(sb3, new char[]{'h', 'H', 'K'}, 'k');
                    } else {
                        i12 = 3;
                    }
                    c10 = 'h';
                }
                if (!z6 && !(objD3 instanceof z)) {
                    if (((Boolean) objD3).booleanValue()) {
                        char[] cArr = new char[i12];
                        // fill-array-data instruction
                        cArr[0] = 'H';
                        cArr[1] = 'K';
                        cArr[2] = 'k';
                        c.b(sb3, cArr, c10);
                    } else {
                        char[] cArr2 = new char[i12];
                        // fill-array-data instruction
                        cArr2[0] = 'h';
                        cArr2[1] = 'H';
                        cArr2[2] = 'K';
                        c.b(sb3, cArr2, 'k');
                    }
                }
            } else {
                int iOrdinal = pVar.ordinal();
                if (iOrdinal == 0) {
                    str9 = "EEEE";
                } else if (iOrdinal == 1) {
                    str9 = "EEE";
                } else if (iOrdinal == 2) {
                    str9 = "EEEEE";
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException();
                    }
                    str9 = "";
                }
                sb3.append(str9);
                int iOrdinal2 = gVar.ordinal();
                if (iOrdinal2 == 0) {
                    str10 = "GGGG";
                } else if (iOrdinal2 == 1) {
                    str10 = "GGG";
                } else if (iOrdinal2 == 2) {
                    str10 = "G5";
                } else {
                    if (iOrdinal2 != 3) {
                        throw new IllegalArgumentException();
                    }
                    str10 = "";
                }
                sb3.append(str10);
                int iOrdinal3 = qVar.ordinal();
                if (iOrdinal3 == 0) {
                    str11 = "yyyy";
                } else if (iOrdinal3 == 1) {
                    str11 = "yy";
                } else {
                    if (iOrdinal3 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str11 = "";
                }
                sb3.append(str11);
                int iOrdinal4 = lVar.ordinal();
                if (iOrdinal4 == 0) {
                    str12 = "M";
                } else if (iOrdinal4 == 1) {
                    str12 = "MM";
                } else if (iOrdinal4 == 2) {
                    str12 = "MMMM";
                } else if (iOrdinal4 == 3) {
                    str12 = "MMM";
                } else if (iOrdinal4 == 4) {
                    str12 = "MMMMM";
                } else {
                    if (iOrdinal4 != 5) {
                        throw new IllegalArgumentException();
                    }
                    str12 = "";
                }
                sb3.append(str12);
                int iOrdinal5 = fVar.ordinal();
                if (iOrdinal5 == 0) {
                    str13 = "d";
                } else if (iOrdinal5 == 1) {
                    str13 = "dd";
                } else {
                    if (iOrdinal5 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str13 = "";
                }
                sb3.append(str13);
                if (jVar7 == jVar3 || jVar7 == jVar) {
                    int iOrdinal6 = iVar2.ordinal();
                    if (iOrdinal6 == 0) {
                        str14 = "h";
                    } else if (iOrdinal6 == 1) {
                        str14 = "hh";
                    } else {
                        if (iOrdinal6 != 2) {
                            throw new IllegalArgumentException();
                        }
                        str14 = "";
                    }
                    sb3.append(str14);
                } else {
                    int iOrdinal7 = iVar2.ordinal();
                    if (iOrdinal7 == 0) {
                        str18 = "k";
                    } else if (iOrdinal7 == 1) {
                        str18 = "kk";
                    } else {
                        if (iOrdinal7 != 2) {
                            throw new IllegalArgumentException();
                        }
                        str18 = "";
                    }
                    sb3.append(str18);
                }
                int iOrdinal8 = kVar.ordinal();
                if (iOrdinal8 == 0) {
                    str15 = "m";
                } else if (iOrdinal8 == 1) {
                    str15 = "mm";
                } else {
                    if (iOrdinal8 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str15 = "";
                }
                sb3.append(str15);
                int iOrdinal9 = mVar.ordinal();
                if (iOrdinal9 == 0) {
                    str16 = "s";
                } else if (iOrdinal9 == 1) {
                    str16 = "ss";
                } else {
                    if (iOrdinal9 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str16 = "";
                }
                sb3.append(str16);
                switch (oVar.ordinal()) {
                    case 0:
                        str17 = "zzzz";
                        break;
                    case 1:
                        str17 = "OOOO";
                        break;
                    case 2:
                        str17 = "vvvv";
                        break;
                    case 3:
                        str17 = "z";
                        break;
                    case 4:
                        str17 = "O";
                        break;
                    case 5:
                        str17 = "v";
                        break;
                    case 6:
                        str17 = "";
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                sb3.append(str17);
            }
            string3 = sb3.toString();
            if (str6.isEmpty()) {
                calendar = null;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str6);
                b0 b0VarA = b0Var.a();
                b0VarA.e("ca", arrayList);
                calendar = Calendar.getInstance((ULocale) b0VarA.c());
            }
            if (!str7.isEmpty()) {
                try {
                    if (NumberingSystem.getInstanceByName(str7) != null) {
                        throw new b("Invalid numbering system: ".concat(str7), 9);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str7);
                    b0Var2.e(str5, arrayList2);
                } catch (RuntimeException unused3) {
                    throw new b("Invalid numbering system: ".concat(str7), 9);
                }
            }
            if (calendar != null) {
                b0Var2 = b0Var;
                b0Var2 = b0Var;
                cVar2 = cVar;
                cVar2.f17490e = DateFormat.getPatternInstance(calendar, string3, (ULocale) b0Var2.c());
            } else {
                b0Var2 = b0Var;
                b0Var2 = b0Var;
                cVar2 = cVar;
                cVar2.f17490e = DateFormat.getPatternInstance(string3, (ULocale) b0Var2.c());
            }
            ((DateFormat) cVar2.f17490e).setTimeZone(android.icu.util.TimeZone.getTimeZone(str23));
        }
        str = "dateStyle";
        z11 = false;
        if (z11) {
            strArr = new String[]{"year", "month", "day"};
            while (i13 < 3) {
                ((HashMap) map).put(strArr[i13], "numeric");
            }
        }
        HashMap map3 = new HashMap();
        map3.put("localeMatcher", x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit"));
        objD = x9.a.d(map, "calendar", 2, a0Var, a0Var);
        if (!(objD instanceof a0)) {
            str20 = (String) objD;
            if (!x9.a.i(0, str20.length() - 1, str20, 3, 8)) {
                throw new b("Invalid calendar option !", 9);
            }
        }
        map3.put("ca", objD);
        objD2 = x9.a.d(map, "numberingSystem", 2, a0Var, a0Var);
        if (!(objD2 instanceof a0)) {
            str19 = (String) objD2;
            if (!x9.a.i(0, str19.length() - 1, str19, 3, 8)) {
                throw new b("Invalid numbering system !", 9);
            }
        }
        map3.put("nu", objD2);
        objD3 = x9.a.d(map, "hour12", 1, a0Var, a0Var);
        str2 = "h23";
        str3 = "weekday";
        z5 = objD3 instanceof a0;
        map3.put("hc", z5 ? x9.a.d(map, "hourCycle", 2, new String[]{"h11", "h12", "h23", "h24"}, a0Var) : x9.a.f22665f);
        HashMap mapK2 = x9.a.k(list, map3, listAsList);
        b0 b0Var4 = (b0) mapK2.get("locale");
        obj.f4752b = b0Var4;
        obj.f4753c = b0Var4.a();
        objC = x9.a.c(mapK2, "ca");
        if (objC instanceof z) {
            obj.f4754d = false;
            obj.f4755e = (String) objC;
        } else {
            obj.f4754d = true;
            String type2 = DateFormat.getDateInstance(3, (ULocale) obj.f4752b.c()).getCalendar().getType();
            fk.i iVar3 = d0.f22687d;
            obj.f4755e = iVar3.containsKey(type2) ? (String) iVar3.get(type2) : type2;
        }
        objC2 = x9.a.c(mapK2, "nu");
        if (objC2 instanceof z) {
            obj.f4756f = false;
            obj.f4757g = (String) objC2;
        } else {
            obj.f4756f = true;
            obj.f4757g = NumberingSystem.getInstance((ULocale) obj.f4752b.c()).getName();
        }
        objC3 = x9.a.c(mapK2, "hc");
        objC4 = x9.a.c(map, "timeZone");
        if (objC4 instanceof a0) {
            id2 = Calendar.getInstance((ULocale) obj.f4752b.c()).getTimeZone().getID();
            z6 = z5;
            r6 = obj;
        } else {
            string = objC4.toString();
            availableIDs = TimeZone.getAvailableIDs();
            length = availableIDs.length;
            i7 = 0;
            while (true) {
                if (i7 < length) {
                    r5 = obj;
                    throw new b("Invalid timezone name!", 9);
                }
                str4 = availableIDs[i7];
                i10 = i7;
                z6 = z5;
                if (a(str4).equals(a(string))) {
                    r5 = obj;
                    id2 = str4;
                    r6 = r5;
                    break;
                } else {
                    r5 = obj;
                    r5 = this;
                    i7 = i10 + 1;
                    str2 = str2;
                    z5 = z6;
                    str3 = str3;
                    str21 = str21;
                }
            }
        }
        r6.f4769u = id2;
        str5 = str21;
        r6.j = (p) x9.a.l(p.class, x9.a.d(map, str3, 2, new String[]{"long", "short", "narrow"}, a0Var));
        r6.k = (g) x9.a.l(g.class, x9.a.d(map, "era", 2, new String[]{"long", "short", "narrow"}, a0Var));
        String str24 = str2;
        r6.f4760l = (q) x9.a.l(q.class, x9.a.d(map, "year", 2, new String[]{"numeric", "2-digit"}, a0Var));
        r6.f4761m = (l) x9.a.l(l.class, x9.a.d(map, "month", 2, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, a0Var));
        r6.f4762n = (f) x9.a.l(f.class, x9.a.d(map, "day", 2, new String[]{"numeric", "2-digit"}, a0Var));
        Object objD6 = x9.a.d(map, "hour", 2, new String[]{"numeric", "2-digit"}, a0Var);
        r6.f4763o = (i) x9.a.l(i.class, objD6);
        r6.f4764p = (k) x9.a.l(k.class, x9.a.d(map, "minute", 2, new String[]{"numeric", "2-digit"}, a0Var));
        r6.f4765q = (m) x9.a.l(m.class, x9.a.d(map, "second", 2, new String[]{"numeric", "2-digit"}, a0Var));
        r6.f4766r = (o) x9.a.l(o.class, x9.a.d(map, "timeZoneName", 2, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, a0Var));
        r6.f4767s = (e) x9.a.l(e.class, x9.a.d(map, str, 2, new String[]{"full", "long", "medium", "short"}, a0Var));
        Object objD7 = x9.a.d(map, "timeStyle", 2, new String[]{"full", "long", "medium", "short"}, a0Var);
        r6.f4768t = (n) x9.a.l(n.class, objD7);
        z7 = objD6 instanceof a0;
        jVar = j.f22699e;
        jVar2 = j.f22701v;
        jVar3 = j.f22698d;
        jVar4 = j.f22700i;
        if (z7) {
            z10 = false;
            pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) r6.f4752b.c())).toPattern();
            sb2 = new StringBuilder();
            while (i11 < pattern.length()) {
                cCharAt = pattern.charAt(i11);
                c8 = 'h';
                if (cCharAt == '\'') {
                    z10 = !z10;
                } else if (!z10) {
                    sb2.append(pattern.charAt(i11));
                }
            }
            c8 = 'h';
            string2 = sb2.toString();
            if (string2.contains(String.valueOf('h'))) {
                jVar5 = jVar;
            } else if (string2.contains(String.valueOf('K'))) {
                jVar5 = jVar3;
            } else if (string2.contains(String.valueOf('H'))) {
                jVar5 = jVar4;
            } else {
                jVar5 = jVar2;
            }
            if (objC3 instanceof z) {
                jVar6 = jVar5;
            } else {
                jVar6 = (j) x9.a.l(j.class, objC3);
            }
            if (!z6) {
                if (((Boolean) objD3).booleanValue()) {
                    if (jVar5 != jVar3) {
                        jVar6 = jVar3;
                    } else {
                        jVar6 = jVar3;
                    }
                } else if (jVar5 != jVar3) {
                    jVar6 = jVar4;
                } else {
                    jVar6 = jVar4;
                }
            }
            r6.f4759i = jVar6;
        } else {
            z10 = false;
            pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) r6.f4752b.c())).toPattern();
            sb2 = new StringBuilder();
            while (i11 < pattern.length()) {
                cCharAt = pattern.charAt(i11);
                c8 = 'h';
                if (cCharAt == '\'') {
                    z10 = !z10;
                } else if (!z10) {
                    sb2.append(pattern.charAt(i11));
                }
            }
            c8 = 'h';
            string2 = sb2.toString();
            if (string2.contains(String.valueOf('h'))) {
                jVar5 = jVar;
            } else if (string2.contains(String.valueOf('K'))) {
                jVar5 = jVar3;
            } else if (string2.contains(String.valueOf('H'))) {
                jVar5 = jVar4;
            } else {
                jVar5 = jVar2;
            }
            if (objC3 instanceof z) {
                jVar6 = jVar5;
            } else {
                jVar6 = (j) x9.a.l(j.class, objC3);
            }
            if (!z6) {
                if (((Boolean) objD3).booleanValue()) {
                    if (jVar5 != jVar3) {
                        jVar6 = jVar3;
                    } else {
                        jVar6 = jVar3;
                    }
                } else if (jVar5 != jVar3) {
                    jVar6 = jVar4;
                } else {
                    jVar6 = jVar4;
                }
            }
            r6.f4759i = jVar6;
        }
        r6.f4758h = objD3;
        cVar = r6.f4751a;
        b0Var = r6.f4752b;
        if (r6.f4754d) {
            str6 = "";
        } else {
            str6 = r6.f4755e;
        }
        if (r6.f4756f) {
            str7 = "";
        } else {
            str7 = r6.f4757g;
        }
        p pVar2 = r6.j;
        g gVar2 = r6.k;
        q qVar2 = r6.f4760l;
        l lVar2 = r6.f4761m;
        f fVar2 = r6.f4762n;
        i iVar4 = r6.f4763o;
        k kVar2 = r6.f4764p;
        m mVar2 = r6.f4765q;
        o oVar2 = r6.f4766r;
        jVar7 = r6.f4759i;
        String str25 = r6.f4769u;
        eVar = r6.f4767s;
        nVar = r6.f4768t;
        sb3 = new StringBuilder();
        nVar2 = n.f22710d;
        eVar2 = e.f22689d;
        if (eVar == eVar2) {
            if (eVar == eVar2) {
                localizedPattern = ((SimpleDateFormat) DateFormat.getTimeInstance(c.k(nVar), (ULocale) b0Var.c())).toLocalizedPattern();
            } else if (nVar == nVar2) {
                localizedPattern = ((SimpleDateFormat) DateFormat.getDateInstance(c.g(eVar), (ULocale) b0Var.c())).toLocalizedPattern();
            } else {
                localizedPattern = ((SimpleDateFormat) DateFormat.getDateTimeInstance(c.g(eVar), c.k(nVar), (ULocale) b0Var.c())).toLocalizedPattern();
            }
            sb3.append(localizedPattern);
            mapD = b0Var.d();
            if (mapD.containsKey("hc")) {
                str8 = (String) mapD.get("hc");
                if (str8 != "h11") {
                    c.b(sb3, new char[]{'H', 'K', 'k'}, c8);
                } else {
                    c.b(sb3, new char[]{'H', 'K', 'k'}, c8);
                }
            }
            if (jVar7 != jVar3) {
                i12 = 3;
                c10 = 'h';
                c.b(sb3, new char[]{'H', 'K', 'k'}, 'h');
            } else {
                i12 = 3;
                c10 = 'h';
                c.b(sb3, new char[]{'H', 'K', 'k'}, 'h');
            }
            if (!z6) {
                if (((Boolean) objD3).booleanValue()) {
                    char[] cArr3 = new char[i12];
                    // fill-array-data instruction
                    cArr3[0] = 'H';
                    cArr3[1] = 'K';
                    cArr3[2] = 'k';
                    c.b(sb3, cArr3, c10);
                } else {
                    char[] cArr4 = new char[i12];
                    // fill-array-data instruction
                    cArr4[0] = 'h';
                    cArr4[1] = 'H';
                    cArr4[2] = 'K';
                    c.b(sb3, cArr4, 'k');
                }
            }
        } else {
            if (eVar == eVar2) {
                localizedPattern = ((SimpleDateFormat) DateFormat.getTimeInstance(c.k(nVar), (ULocale) b0Var.c())).toLocalizedPattern();
            } else if (nVar == nVar2) {
                localizedPattern = ((SimpleDateFormat) DateFormat.getDateInstance(c.g(eVar), (ULocale) b0Var.c())).toLocalizedPattern();
            } else {
                localizedPattern = ((SimpleDateFormat) DateFormat.getDateTimeInstance(c.g(eVar), c.k(nVar), (ULocale) b0Var.c())).toLocalizedPattern();
            }
            sb3.append(localizedPattern);
            mapD = b0Var.d();
            if (mapD.containsKey("hc")) {
                str8 = (String) mapD.get("hc");
                if (str8 != "h11") {
                    c.b(sb3, new char[]{'H', 'K', 'k'}, c8);
                } else {
                    c.b(sb3, new char[]{'H', 'K', 'k'}, c8);
                }
            }
            if (jVar7 != jVar3) {
                i12 = 3;
                c10 = 'h';
                c.b(sb3, new char[]{'H', 'K', 'k'}, 'h');
            } else {
                i12 = 3;
                c10 = 'h';
                c.b(sb3, new char[]{'H', 'K', 'k'}, 'h');
            }
            if (!z6) {
                if (((Boolean) objD3).booleanValue()) {
                    char[] cArr5 = new char[i12];
                    // fill-array-data instruction
                    cArr5[0] = 'H';
                    cArr5[1] = 'K';
                    cArr5[2] = 'k';
                    c.b(sb3, cArr5, c10);
                } else {
                    char[] cArr6 = new char[i12];
                    // fill-array-data instruction
                    cArr6[0] = 'h';
                    cArr6[1] = 'H';
                    cArr6[2] = 'K';
                    c.b(sb3, cArr6, 'k');
                }
            }
        }
        string3 = sb3.toString();
        if (str6.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(str6);
            b0 b0VarA2 = b0Var.a();
            b0VarA2.e("ca", arrayList3);
            calendar = Calendar.getInstance((ULocale) b0VarA2.c());
        } else {
            calendar = null;
        }
        if (!str7.isEmpty()) {
            if (NumberingSystem.getInstanceByName(str7) != null) {
                throw new b("Invalid numbering system: ".concat(str7), 9);
            }
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(str7);
            b0Var2.e(str5, arrayList4);
        }
        if (calendar != null) {
            b0Var2 = b0Var;
            b0Var2 = b0Var;
            cVar2 = cVar;
            cVar2.f17490e = DateFormat.getPatternInstance(calendar, string3, (ULocale) b0Var2.c());
        } else {
            b0Var2 = b0Var;
            b0Var2 = b0Var;
            cVar2 = cVar;
            cVar2.f17490e = DateFormat.getPatternInstance(string3, (ULocale) b0Var2.c());
        }
        ((DateFormat) cVar2.f17490e).setTimeZone(android.icu.util.TimeZone.getTimeZone(str25));
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt + ' '));
            }
        }
        return sb2.toString();
    }

    @a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String str = (String) x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit");
        String[] strArr = new String[list.size()];
        return str.equals("best fit") ? Arrays.asList(x9.a.f((String[]) list.toArray(strArr))) : Arrays.asList(x9.a.j((String[]) list.toArray(strArr)));
    }

    @a
    public String format(double d6) {
        return ((DateFormat) this.f4751a.f17490e).format(new Date((long) d6));
    }

    @a
    public List<Map<String, String>> formatToParts(double d6) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator toCharacterIterator = ((DateFormat) this.f4751a.f17490e).formatToCharacterIterator(Double.valueOf(d6));
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = toCharacterIterator.first(); cFirst != 65535; cFirst = toCharacterIterator.next()) {
            sb2.append(cFirst);
            if (toCharacterIterator.getIndex() + 1 == toCharacterIterator.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toCharacterIterator.getAttributes().keySet().iterator();
                String str = "literal";
                if (it.hasNext()) {
                    AttributedCharacterIterator.Attribute next = it.next();
                    String string = sb2.toString();
                    if (next == DateFormat.Field.DAY_OF_WEEK) {
                        str = "weekday";
                    } else if (next == DateFormat.Field.ERA) {
                        str = "era";
                    } else if (next == DateFormat.Field.YEAR) {
                        try {
                            Double.parseDouble(string);
                            str = "year";
                        } catch (NumberFormatException unused) {
                            str = "yearName";
                        }
                    } else if (next == DateFormat.Field.MONTH) {
                        str = "month";
                    } else if (next == DateFormat.Field.DAY_OF_MONTH) {
                        str = "day";
                    } else if (next == DateFormat.Field.HOUR0 || next == DateFormat.Field.HOUR1 || next == DateFormat.Field.HOUR_OF_DAY0 || next == DateFormat.Field.HOUR_OF_DAY1) {
                        str = "hour";
                    } else if (next == DateFormat.Field.MINUTE) {
                        str = "minute";
                    } else if (next == DateFormat.Field.SECOND) {
                        str = "second";
                    } else if (next == DateFormat.Field.TIME_ZONE) {
                        str = "timeZoneName";
                    } else if (next == DateFormat.Field.AM_PM) {
                        str = "dayPeriod";
                    } else if (next.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
                        str = "relatedYear";
                    }
                }
                String string2 = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", str);
                map.put("value", string2);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f4753c.f());
        linkedHashMap.put("numberingSystem", this.f4757g);
        linkedHashMap.put("calendar", this.f4755e);
        linkedHashMap.put("timeZone", this.f4769u);
        j jVar = j.f22702w;
        j jVar2 = this.f4759i;
        if (jVar2 != jVar) {
            linkedHashMap.put("hourCycle", jVar2.toString());
            j jVar3 = j.f22698d;
            j jVar4 = this.f4759i;
            if (jVar4 == jVar3 || jVar4 == j.f22699e) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        p pVar = p.f22714d;
        p pVar2 = this.j;
        if (pVar2 != pVar) {
            linkedHashMap.put("weekday", pVar2.toString());
        }
        g gVar = g.f22693d;
        g gVar2 = this.k;
        if (gVar2 != gVar) {
            linkedHashMap.put("era", gVar2.toString());
        }
        q qVar = q.f22716d;
        q qVar2 = this.f4760l;
        if (qVar2 != qVar) {
            linkedHashMap.put("year", qVar2.toString());
        }
        l lVar = l.f22706d;
        l lVar2 = this.f4761m;
        if (lVar2 != lVar) {
            linkedHashMap.put("month", lVar2.toString());
        }
        f fVar = f.f22691d;
        f fVar2 = this.f4762n;
        if (fVar2 != fVar) {
            linkedHashMap.put("day", fVar2.toString());
        }
        i iVar = i.f22696d;
        i iVar2 = this.f4763o;
        if (iVar2 != iVar) {
            linkedHashMap.put("hour", iVar2.toString());
        }
        k kVar = k.f22704d;
        k kVar2 = this.f4764p;
        if (kVar2 != kVar) {
            linkedHashMap.put("minute", kVar2.toString());
        }
        m mVar = m.f22708d;
        m mVar2 = this.f4765q;
        if (mVar2 != mVar) {
            linkedHashMap.put("second", mVar2.toString());
        }
        o oVar = o.f22712d;
        o oVar2 = this.f4766r;
        if (oVar2 != oVar) {
            linkedHashMap.put("timeZoneName", oVar2.toString());
        }
        e eVar = e.f22689d;
        e eVar2 = this.f4767s;
        if (eVar2 != eVar) {
            linkedHashMap.put("dateStyle", eVar2.toString());
        }
        n nVar = n.f22710d;
        n nVar2 = this.f4768t;
        if (nVar2 != nVar) {
            linkedHashMap.put("timeStyle", nVar2.toString());
        }
        return linkedHashMap;
    }
}
