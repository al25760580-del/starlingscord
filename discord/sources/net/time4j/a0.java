package net.time4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16590a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    public a0(Class cls, String str) {
        char c8;
        Locale locale;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        ?? r5 = 0;
        int i7 = 0;
        ?? r6 = 0;
        while (true) {
            yr.n0 n0Var = yr.n0.f23554a;
            if (i7 >= length) {
                if (arrayList.size() > 1) {
                    throw new IllegalArgumentException("Open square bracket without closing one.");
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Empty or invalid pattern.");
                }
                List list = (List) arrayList.get(0);
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Missing format pattern.");
                }
                if (list.get(0) == n0Var || kk.b.f(1, list) == n0Var) {
                    throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
                }
                int size = list.size();
                int iA = ((yr.j0) list.get(size - 1)).a();
                for (int i10 = size - 2; i10 >= 0; i10--) {
                    yr.j0 j0Var = (yr.j0) list.get(i10);
                    if (j0Var == n0Var) {
                        iA = 0;
                    } else {
                        list.set(i10, j0Var.b(iA));
                        iA += j0Var.a();
                    }
                }
                this.f16590a = Collections.unmodifiableList(list);
                return;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt == '#') {
                r6++;
            } else if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i11 = i7 + 1;
                while (i11 < length && str.charAt(i11) == cCharAt) {
                    i11++;
                }
                int i12 = i11 - i7;
                Enum enumA = a(cCharAt);
                List list2 = (List) kk.b.e(1, arrayList);
                if (cCharAt != 'f') {
                    list2.add(new yr.m0(i12, r6 + i12, enumA));
                } else {
                    if (r6 > 0) {
                        throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
                    }
                    list2.add(new yr.k0(i12, a(cCharAt)));
                }
                i7 = i11 - 1;
                r6 = r5;
            } else {
                if (r6 > 0) {
                    throw new IllegalArgumentException("Char # must be followed by unit symbol.");
                }
                if (cCharAt == '\'') {
                    int i13 = i7 + 1;
                    int i14 = i13;
                    while (i14 < length) {
                        if (str.charAt(i14) == '\'') {
                            int i15 = i14 + 1;
                            if (i15 >= length || str.charAt(i15) != '\'') {
                                break;
                            } else {
                                i14 = i15;
                            }
                        }
                        i14++;
                    }
                    if (i14 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: ".concat(str));
                    }
                    if (i13 == i14) {
                        b(arrayList).add(new yr.l0(String.valueOf('\''), r5));
                    } else {
                        b(arrayList).add(new yr.l0(str.substring(i13, i14).replace("''", "'"), r5));
                    }
                    i7 = i14;
                    r6 = r6;
                } else if (cCharAt == '[') {
                    arrayList.add(new ArrayList());
                    r6 = r6;
                } else if (cCharAt == ']') {
                    int size2 = arrayList.size();
                    int i16 = size2 - 1;
                    if (i16 < 1) {
                        throw new IllegalArgumentException("Closing square bracket without open one.");
                    }
                    ((List) arrayList.get(size2 - 2)).add(new yr.l0((List) arrayList.remove(i16)));
                    r6 = r6;
                } else if (cCharAt == '.') {
                    b(arrayList).add(new yr.p0('.', ','));
                    r6 = r6;
                } else if (cCharAt == ',') {
                    b(arrayList).add(new yr.p0(',', '.'));
                    r6 = r6;
                } else if (cCharAt == '-') {
                    b(arrayList).add(new yr.q0(r5, r5));
                    r6 = r6;
                } else {
                    if (cCharAt == '+') {
                        b(arrayList).add(new yr.q0(true, r5));
                        r6 = r6;
                    } else if (cCharAt == '{') {
                        int i17 = i7 + 1;
                        int i18 = i17;
                        while (i18 < length && str.charAt(i18) != '}') {
                            i18++;
                        }
                        String strSubstring = str.substring(i17, i18);
                        ?? Split = strSubstring.split(":");
                        if (Split.length > 9 || Split.length < 4) {
                            throw new IllegalArgumentException("Plural information has wrong format: ".concat(strSubstring));
                        }
                        if (Split[r5].length() != 1) {
                            throw new IllegalArgumentException("Plural information has wrong symbol: ".concat(strSubstring));
                        }
                        Enum enumA2 = a(Split[r5].charAt(r5));
                        String[] strArrSplit = Split[2].split("-|_");
                        String str2 = strArrSplit[r5];
                        ?? r18 = r5;
                        if (strArrSplit.length > 1) {
                            String str3 = strArrSplit[1];
                            char c10 = 1;
                            if (strArrSplit.length > 2) {
                                String str4 = strArrSplit[2];
                                if (strArrSplit.length > 3) {
                                    throw new IllegalArgumentException("Plural information has wrong locale: ".concat(strSubstring));
                                }
                                locale = new Locale(str2, str3, str4);
                                c8 = c10;
                            } else {
                                locale = new Locale(str2, str3);
                                c8 = c10;
                            }
                        } else {
                            c8 = 1;
                            locale = new Locale(str2);
                        }
                        EnumMap enumMap = new EnumMap(yr.z.class);
                        yr.e0 e0VarA = yr.e0.a(locale);
                        for (int i19 = 3; i19 < Split.length; i19++) {
                            String[] strArrSplit2 = Split[i19].split("=");
                            if (strArrSplit2.length != 2) {
                                throw new IllegalArgumentException("Plural information has wrong format: ".concat(strSubstring));
                            }
                            enumMap.put(yr.z.valueOf(strArrSplit2[r18 == true ? 1 : 0]), strArrSplit2[c8]);
                        }
                        if (enumMap.isEmpty()) {
                            throw new IllegalArgumentException("Missing plural forms: ".concat(strSubstring));
                        }
                        if (!enumMap.containsKey(yr.z.f23568e)) {
                            throw new IllegalArgumentException("Missing plural category OTHER: ".concat(strSubstring));
                        }
                        b(arrayList).add(new yr.o0(enumA2, Split[c8], e0VarA, enumMap));
                        i7 = i18;
                    } else {
                        ?? r19 = r5;
                        if (cCharAt == '|') {
                            b(arrayList).add(n0Var);
                        } else {
                            b(arrayList).add(new yr.l0(String.valueOf(cCharAt), r19));
                        }
                    }
                    i7++;
                    r5 = 0;
                    r6 = r6;
                }
            }
            i7++;
            r5 = 0;
            r6 = r6;
        }
    }

    public static List b(ArrayList arrayList) {
        return (List) kk.b.e(1, arrayList);
    }

    public final Enum a(char c8) {
        if (c8 == 'I') {
            return m.f16664d;
        }
        if (c8 == 'M') {
            return m.f16669x;
        }
        if (c8 == 'Q') {
            return m.f16668w;
        }
        if (c8 == 'W') {
            return m.f16670y;
        }
        if (c8 == 'Y') {
            return m.f16667v;
        }
        if (c8 == 'f') {
            return t.f16715x;
        }
        if (c8 == 'h') {
            return t.f16710d;
        }
        if (c8 == 'm') {
            return t.f16711e;
        }
        if (c8 == 's') {
            return t.f16712i;
        }
        switch (c8) {
            case 'C':
                return m.f16665e;
            case 'D':
                return m.E;
            case 'E':
                return m.f16666i;
            default:
                throw new IllegalArgumentException("Unsupported pattern symbol: " + c8);
        }
    }
}
