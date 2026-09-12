package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class x extends StringsKt__StringNumberConversionsKt {
    public static String f(char[] cArr, int i7, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int length = cArr.length;
        dVar.getClass();
        kotlin.collections.d.a(i7, i10, length);
        return new String(cArr, i7, i10 - i7);
    }

    public static String g(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static boolean h(String str, String suffix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z5 ? str.endsWith(suffix) : j(str, true, str.length() - suffix.length(), 0, suffix, suffix.length());
    }

    public static boolean i(String str, String str2, boolean z5) {
        if (str == null) {
            return str2 == null;
        }
        return !z5 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean j(String str, boolean z5, int i7, int i10, String other, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z5 ? str.regionMatches(i7, other, i10, i11) : str.regionMatches(z5, i7, other, i10, i11);
    }

    public static String k(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i10 = 1;
        if (i7 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i7];
            for (int i11 = 0; i11 < i7; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i7) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static String l(String str, String oldValue, String newValue, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i7 = 0;
        int iQ = StringsKt__StringsKt.q(0, str, oldValue, z5);
        if (iQ < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i7, iQ);
            sb2.append(newValue);
            i7 = iQ + length;
            if (iQ >= str.length()) {
                break;
            }
            iQ = StringsKt__StringsKt.q(iQ + i10, str, oldValue, z5);
        } while (iQ > 0);
        sb2.append((CharSequence) str, i7, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String m(String str, char c8, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace = str.replace(c8, c10);
        Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
        return strReplace;
    }

    public static boolean n(String str, int i7, String prefix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z5 ? str.startsWith(prefix, i7) : j(str, z5, i7, 0, prefix, prefix.length());
    }

    public static boolean o(String str, String prefix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z5 ? str.startsWith(prefix) : j(str, z5, 0, 0, prefix, prefix.length());
    }
}
