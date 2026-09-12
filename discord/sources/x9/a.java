package x9;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f22660a = {"best fit", "lookup"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f22661b = {"base", "accent", "case", "variant"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f22662c = {"upper", "lower", "false"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f22663d = {"sort", "search"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f22664e = new a0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f22665f = new z();

    public static String a(String str, String[] strArr) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static Object b(String str, Object obj, Object obj2, Double d6, Object obj3) throws ag.b {
        if (obj instanceof a0) {
            return obj3;
        }
        if (!(obj instanceof Double)) {
            throw new ag.b(str.concat(" value is invalid."), 9);
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || dDoubleValue > d6.doubleValue() || dDoubleValue < ((Double) obj2).doubleValue()) {
            throw new ag.b(str.concat(" value is invalid."), 9);
        }
        return obj;
    }

    public static Object c(Object obj, String str) {
        HashMap map = (HashMap) obj;
        if (!map.containsKey(str)) {
            return f22664e;
        }
        Object obj2 = map.get(str);
        return obj2 == null ? f22665f : obj2;
    }

    public static Object d(Map map, String str, int i7, Object obj, Object obj2) throws ag.b {
        Object objC = c(map, str);
        if (objC instanceof a0) {
            return obj2;
        }
        if (objC instanceof z) {
            objC = "";
        }
        if (i7 == 1 && !(objC instanceof Boolean)) {
            throw new ag.b("Boolean option expected but not found", 9);
        }
        if (i7 == 2 && !(objC instanceof String)) {
            throw new ag.b("String option expected but not found", 9);
        }
        if ((obj instanceof a0) || Arrays.asList((Object[]) obj).contains(objC)) {
            return objC;
        }
        throw new ag.b("String option expected but not found", 9);
    }

    public static e4.r e(String[] strArr) throws ag.b {
        e4.r rVar = new e4.r(25);
        for (String str : strArr) {
            b0 b0VarG = g(str);
            ULocale[] availableLocales = ULocale.getAvailableLocales();
            b0VarG.b();
            ULocale.Builder builder = new ULocale.Builder();
            builder.setLocale(b0VarG.f22667a);
            builder.clearExtensions();
            boolean[] zArr = new boolean[1];
            ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{builder.build()}, availableLocales, zArr);
            if (zArr[0] || uLocaleAcceptLanguage == null) {
                uLocaleAcceptLanguage = null;
            }
            if (uLocaleAcceptLanguage != null) {
                rVar.f8034e = new b0(uLocaleAcceptLanguage);
                rVar.f8035i = b0VarG.d();
                return rVar;
            }
        }
        rVar.f8034e = new b0(ULocale.getDefault(ULocale.Category.FORMAT));
        return rVar;
    }

    public static String[] f(String[] strArr) throws ag.b {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            b0 b0VarG = g(str);
            ULocale[] availableLocales = ULocale.getAvailableLocales();
            b0VarG.b();
            ULocale.Builder builder = new ULocale.Builder();
            builder.setLocale(b0VarG.f22667a);
            builder.clearExtensions();
            ULocale[] uLocaleArr = {builder.build()};
            boolean[] zArr = new boolean[1];
            ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
            if (zArr[0] || uLocaleAcceptLanguage == null) {
                uLocaleAcceptLanguage = null;
            }
            if (uLocaleAcceptLanguage != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static b0 g(String str) throws ag.b {
        b0 b0Var = new b0();
        b0Var.f22667a = null;
        b0Var.f22668b = null;
        b0Var.f22669c = false;
        ULocale.Builder builder = new ULocale.Builder();
        b0Var.f22668b = builder;
        try {
            builder.setLanguageTag(str);
            b0Var.f22669c = true;
            return b0Var;
        } catch (RuntimeException e10) {
            throw new ag.b(e10.getMessage(), 9);
        }
    }

    public static String[] h() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean i(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        int i13;
        if (i10 >= charSequence.length() || (i13 = (i10 - i7) + 1) < i11 || i13 > i12) {
            return false;
        }
        while (i7 <= i10) {
            char cCharAt = charSequence.charAt(i7);
            if (!((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) && (cCharAt < '0' || cCharAt > '9')) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public static String[] j(String[] strArr) throws ag.b {
        ArrayList arrayList = new ArrayList();
        String[] strArrH = h();
        for (String str : strArr) {
            b0 b0VarG = g(str);
            b0VarG.b();
            ULocale.Builder builder = new ULocale.Builder();
            builder.setLocale(b0VarG.f22667a);
            builder.clearExtensions();
            String strA = a(builder.build().toLanguageTag(), strArrH);
            if (strA != null && !strA.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static HashMap k(List list, HashMap map, List list2) throws ag.b {
        e4.r rVarE;
        Object obj;
        Object obj2;
        String str;
        HashMap map2 = new HashMap();
        if (((String) c(map, "localeMatcher")).equals("lookup")) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            String[] strArrH = h();
            rVarE = new e4.r(25);
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    rVarE.f8034e = new b0(ULocale.getDefault(ULocale.Category.FORMAT));
                    break;
                }
                b0 b0VarG = g(strArr[i7]);
                b0VarG.b();
                ULocale.Builder builder = new ULocale.Builder();
                builder.setLocale(b0VarG.f22667a);
                builder.clearExtensions();
                String strA = a(builder.build().toLanguageTag(), strArrH);
                if (!strA.isEmpty()) {
                    rVarE.f8034e = g(strA);
                    rVarE.f8035i = b0VarG.d();
                    break;
                }
                i7++;
            }
        } else {
            rVarE = e((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            boolean zIsEmpty = ((HashMap) rVarE.f8035i).isEmpty();
            z zVar = f22665f;
            if (zIsEmpty || !((HashMap) rVarE.f8035i).containsKey(str2)) {
                obj = zVar;
            } else {
                String str3 = (String) ((HashMap) rVarE.f8035i).get(str2);
                if (str3.isEmpty()) {
                    str = str3;
                    str = "true";
                }
                str = str3;
                hashSet.add(str2);
                obj = str;
            }
            Object obj3 = obj;
            if (map.containsKey(str2)) {
                Object objC = c(map, str2);
                if ((objC instanceof String) && ((String) objC).isEmpty()) {
                    obj2 = objC;
                    obj2 = objC;
                    obj2 = Boolean.TRUE;
                }
                obj2 = objC;
                obj2 = objC;
                obj2 = objC;
                obj3 = obj;
                if (!(obj2 instanceof a0) && !obj2.equals(obj)) {
                    obj3 = obj;
                    hashSet.remove(str2);
                    obj3 = obj2;
                }
            }
            obj3 = obj;
            boolean z5 = obj3 instanceof z;
            Object objC2 = obj3;
            if (!z5) {
                objC2 = d0.c(obj3, str2);
            }
            if (!(objC2 instanceof String) || d0.a(str2, (String) objC2, (b0) rVarE.f8034e)) {
                map2.put(str2, objC2);
            } else {
                map2.put(str2, zVar);
            }
        }
        for (String str4 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String str5 = (String) d0.c((String) ((HashMap) rVarE.f8035i).get(str4), str4);
            if (str5 == null || d0.a(str4, str5, (b0) rVarE.f8034e)) {
                arrayList.add(str5);
                ((b0) rVarE.f8034e).e(str4, arrayList);
            }
        }
        map2.put("locale", (b0) rVarE.f8034e);
        return map2;
    }

    public static Enum l(Class cls, Object obj) {
        try {
            if (obj instanceof a0) {
                return Enum.valueOf(cls, "UNDEFINED");
            }
            if (obj instanceof z) {
                return null;
            }
            String str = (String) obj;
            if (str.equals("2-digit")) {
                return Enum.valueOf(cls, "DIGIT2");
            }
            for (Enum r5 : (Enum[]) cls.getEnumConstants()) {
                if (r5.name().compareToIgnoreCase(str) == 0) {
                    return r5;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
