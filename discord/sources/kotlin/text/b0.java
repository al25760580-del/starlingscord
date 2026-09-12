package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends a0 {
    public static char A(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String B(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(0, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(length - i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String x(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String y(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i7;
        if (length < 0) {
            length = 0;
        }
        return B(length, str);
    }

    public static char z(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt.H(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
