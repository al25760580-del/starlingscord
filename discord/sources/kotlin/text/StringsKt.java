package kotlin.text;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/text/q", "kotlin/text/r", "kotlin/text/s", "kotlin/text/t", "kotlin/text/u", "kotlin/text/v", "kotlin/text/w", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/x", "kotlin/text/StringsKt__StringsKt", "kotlin/text/a0", "kotlin/text/b0"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE)
public final class StringsKt extends b0 {
    private StringsKt() {
    }

    public static boolean D(CharSequence charSequence, CharSequence other, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (J(charSequence, (String) other, 0, z5, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.r(charSequence, other, 0, charSequence.length(), z5, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean E(CharSequence charSequence, char c8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return I(charSequence, c8, 0, 2) >= 0;
    }

    public static boolean F(CharSequence charSequence, String suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return charSequence instanceof String ? x.h((String) charSequence, suffix, false) : StringsKt__StringsKt.t(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static boolean G(String str, char c8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && a.a(str.charAt(H(str)), c8, false);
    }

    public static int H(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int I(CharSequence charSequence, char c8, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.s(charSequence, new char[]{c8}, i7, false) : ((String) charSequence).indexOf(c8, i7);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i7, boolean z5, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            z5 = false;
        }
        return StringsKt__StringsKt.q(i7, charSequence, str, z5);
    }

    public static boolean K(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!CharsKt.b(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int L(char c8, int i7, int i10, String str) {
        if ((i10 & 2) != 0) {
            i7 = H(str);
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str != null) {
            return str.lastIndexOf(c8, i7);
        }
        char[] chars = {c8};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (str != null) {
            return str.lastIndexOf(kotlin.collections.y.C(chars), i7);
        }
        int iH = H(str);
        if (i7 > iH) {
            i7 = iH;
        }
        while (-1 < i7) {
            if (a.a(chars[0], str.charAt(i7), false)) {
                return i7;
            }
            i7--;
        }
        return -1;
    }

    public static int M(int i7, int i10, String str, String string) {
        if ((i10 & 2) != 0) {
            i7 = H(str);
        }
        int i11 = i7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return str == null ? StringsKt__StringsKt.r(str, string, i11, 0, false, true) : str.lastIndexOf(string, i11);
    }

    public static String N(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!StringsKt__StringsKt.w(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!F(str, suffix)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "delimiter");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "prefix");
        Intrinsics.checkNotNullParameter("\"", "suffix");
        if (str.length() < 2 || !StringsKt__StringsKt.w(str, "\"") || !F(str, "\"")) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder Q(String str, int i7, int i10, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(s0.g.c(i10, "End index (", i7, ") is less than start index (", ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str, 0, i7);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(replacement);
        sb2.append((CharSequence) str, i10, str.length());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    public static List S(String str, final char[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.v(0, str, String.valueOf(delimiters[0]), false);
        }
        StringsKt__StringsKt.u(0);
        c<IntRange> cVar = new c(str, 0, new Function2() { // from class: kotlin.text.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iS = StringsKt__StringsKt.s(DelimitedRangesSequence, delimiters, iIntValue, false);
                if (iS < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iS), 1);
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ArrayList arrayList = new ArrayList(e0.l(new kotlin.collections.x(3, cVar), 10));
        for (IntRange range : cVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(str.subSequence(range.f14688d, range.f14689e + 1).toString());
        }
        return arrayList;
    }

    public static boolean T(String str, char c8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && a.a(str.charAt(0), c8, false);
    }

    public static String U(char c8, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int I = I(str, c8, 0, 6);
        if (I == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(I + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String V(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iJ = J(missingDelimiterValue, delimiter, 0, false, 6);
        if (iJ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(delimiter.length() + iJ, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W(char c8, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iL = L(c8, 0, 6, str);
        if (iL == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iL + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X(String missingDelimiterValue, char c8) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int I = I(missingDelimiterValue, c8, 0, 6);
        if (I == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, I);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Y(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iJ = J(missingDelimiterValue, delimiter, 0, false, 6);
        if (iJ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iJ);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Z(String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(".", "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM = M(0, 6, str, ".");
        if (iM == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Long a0(String str) {
        boolean z5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
                i7 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z5 = false;
        }
        long j5 = 0;
        long j7 = -256204778801521550L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j5 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j / ((long) 10);
                if (j5 < j7) {
                    return null;
                }
            }
            long j10 = j5 * ((long) 10);
            long j11 = iDigit;
            if (j10 < j + j11) {
                return null;
            }
            j5 = j10 - j11;
            i7++;
        }
        return z5 ? Long.valueOf(j5) : Long.valueOf(-j5);
    }

    public static CharSequence b0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean zB = CharsKt.b(str.charAt(!z5 ? i7 : length));
            if (z5) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i7++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i7, length + 1);
    }
}
