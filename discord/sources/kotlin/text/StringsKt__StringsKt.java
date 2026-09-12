package kotlin.text;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1579:1\n80#1,22:1580\n114#1,5:1602\n131#1,5:1607\n80#1,22:1612\n108#1:1634\n80#1,22:1635\n114#1,5:1657\n125#1:1662\n114#1,5:1663\n131#1,5:1668\n142#1:1673\n131#1,5:1674\n80#1,22:1679\n114#1,5:1701\n131#1,5:1706\n1069#2,2:1711\n12717#3,2:1713\n12717#3,2:1715\n295#4,2:1717\n295#4,2:1719\n1563#4:1722\n1634#4,3:1723\n1563#4:1726\n1634#4,3:1727\n1#5:1721\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1580,22\n125#1:1602,5\n142#1:1607,5\n147#1:1612,22\n152#1:1634\n152#1:1635,22\n157#1:1657,5\n162#1:1662\n162#1:1663,5\n167#1:1668,5\n172#1:1673\n172#1:1674,5\n177#1:1679,22\n188#1:1701,5\n199#1:1706,5\n312#1:1711,2\n971#1:1713,2\n995#1:1715,2\n1034#1:1717,2\n1040#1:1719,2\n1401#1:1722\n1401#1:1723,3\n1426#1:1726\n1426#1:1727,3\n*E\n"})
public class StringsKt__StringsKt extends x {
    public static final int q(int i7, CharSequence charSequence, String string, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z5 || !(charSequence instanceof String)) ? r(charSequence, string, i7, charSequence.length(), z5, false) : ((String) charSequence).indexOf(string, i7);
    }

    public static final int r(CharSequence charSequence, CharSequence charSequence2, int i7, int i10, boolean z5, boolean z6) {
        kotlin.ranges.a aVar;
        CharSequence charSequence3 = charSequence2;
        int i11 = i7;
        int i12 = i10;
        if (z6) {
            int iH = StringsKt.H(charSequence);
            if (i11 > iH) {
                i11 = iH;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            kotlin.ranges.a.f14687v.getClass();
            aVar = new kotlin.ranges.a(i11, i12, -1);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length = charSequence.length();
            if (i12 > length) {
                i12 = length;
            }
            aVar = new IntRange(i11, i12, 1);
        }
        boolean z7 = charSequence instanceof String;
        int i13 = aVar.f14690i;
        int i14 = aVar.f14689e;
        int i15 = aVar.f14688d;
        if (z7 && (charSequence3 instanceof String)) {
            if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
                int i16 = i15;
                while (true) {
                    String str = (String) charSequence3;
                    if (x.j(str, z5, 0, i16, (String) charSequence, str.length())) {
                        return i16;
                    }
                    if (i16 != i14) {
                        i16 += i13;
                    }
                }
            }
        } else if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
            int i17 = i15;
            while (!t(charSequence3, 0, charSequence, i17, charSequence3.length(), z5)) {
                if (i17 != i14) {
                    i17 += i13;
                    charSequence3 = charSequence2;
                }
            }
            return i17;
        }
        return -1;
    }

    public static final int s(CharSequence charSequence, char[] chars, int i7, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z5 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.y.C(chars), i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int iH = StringsKt.H(charSequence);
        if (i7 > iH) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i7);
            for (char c8 : chars) {
                if (a.a(c8, cCharAt, z5)) {
                    return i7;
                }
            }
            if (i7 == iH) {
                return -1;
            }
            i7++;
        }
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, final boolean z5, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z5 = false;
        }
        if ((i10 & 4) != 0) {
            i7 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return v(i7, charSequence, str, z5);
            }
        }
        u(i7);
        final List listB = kotlin.collections.w.b(delimiters);
        c<IntRange> cVar = new c(charSequence, i7, new Function2() { // from class: kotlin.text.z
            /* JADX WARN: Code duplicated, block: B:8:0x002a A[EDGE_INSN: B:8:0x002a->B:49:0x00c4 BREAK  A[LOOP:0: B:20:0x0055->B:31:0x0087]] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Pair pair;
                String str2;
                boolean z6;
                Object next2;
                String str3;
                CharSequence DelimitedRangesSequence = (CharSequence) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = listB;
                boolean z7 = z5;
                if (z7 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z10 = DelimitedRangesSequence instanceof String;
                    int i11 = intRange.f14690i;
                    int i12 = intRange.f14689e;
                    if (!z10) {
                        if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                            int i13 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    str2 = (String) next;
                                    z6 = z7;
                                    z7 = z6;
                                } while (!StringsKt__StringsKt.t(str2, 0, DelimitedRangesSequence, i13, str2.length(), z6));
                                String str4 = (String) next;
                                if (str4 == null) {
                                    if (i13 == i12) {
                                        pair = null;
                                        break;
                                    }
                                    i13 += i11;
                                } else {
                                    pair = new Pair(Integer.valueOf(i13), str4);
                                    break;
                                }
                            }
                        } else {
                            pair = null;
                            break;
                        }
                    } else if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                        int i14 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                str3 = (String) next2;
                            } while (!x.j(str3, z7, 0, i14, (String) DelimitedRangesSequence, str3.length()));
                            String str5 = (String) next2;
                            if (str5 == null) {
                                if (i14 == i12) {
                                    pair = null;
                                    break;
                                }
                                i14 += i11;
                            } else {
                                pair = new Pair(Integer.valueOf(i14), str5);
                                break;
                            }
                        }
                    } else {
                        pair = null;
                        break;
                    }
                } else {
                    String str6 = (String) CollectionsKt.Y(list);
                    int iJ = StringsKt.J(DelimitedRangesSequence, str6, iIntValue, false, 4);
                    if (iJ < 0) {
                        pair = null;
                        break;
                    }
                    pair = new Pair(Integer.valueOf(iJ), str6);
                }
                if (pair != null) {
                    return new Pair(pair.f14612d, Integer.valueOf(((String) pair.f14613e).length()));
                }
                return null;
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ArrayList arrayList = new ArrayList(e0.l(new kotlin.collections.x(3, cVar), 10));
        for (IntRange range : cVar) {
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.f14688d, range.f14689e + 1).toString());
        }
        return arrayList;
    }

    public static final boolean t(CharSequence charSequence, int i7, CharSequence other, int i10, int i11, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i7 < 0 || i7 > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!a.a(charSequence.charAt(i7 + i12), other.charAt(i10 + i12), z5)) {
                return false;
            }
        }
        return true;
    }

    public static final void u(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(kk.b.h(i7, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List v(int i7, CharSequence charSequence, String str, boolean z5) {
        u(i7);
        int length = 0;
        int iQ = q(0, charSequence, str, z5);
        if (iQ == -1 || i7 == 1) {
            return kotlin.collections.c0.c(charSequence.toString());
        }
        boolean z6 = i7 > 0;
        int i10 = 10;
        if (z6 && i7 <= 10) {
            i10 = i7;
        }
        ArrayList arrayList = new ArrayList(i10);
        do {
            arrayList.add(charSequence.subSequence(length, iQ).toString());
            length = str.length() + iQ;
            if (z6 && arrayList.size() == i7 - 1) {
                break;
            }
            iQ = q(length, charSequence, str, z5);
        } while (iQ != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean w(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str != null ? x.o(str, prefix, false) : t(str, 0, prefix, 0, prefix.length(), false);
    }
}
