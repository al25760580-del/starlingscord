package kotlin.text;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class r extends q {
    public static String b(String str) {
        int length;
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listQ = xq.r.q(new co.q(3, str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!StringsKt.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listQ.size();
        int iF = d0.f(listQ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listQ) {
            int i7 = length + 1;
            if (length < 0) {
                d0.k();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iF) && StringsKt.K(str3)) {
                str3 = null;
            } else {
                String line = b0.x(iIntValue, str3);
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i7;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        CollectionsKt.N(arrayList3, sb2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, null, 124);
        return sb2.toString();
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.K("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listQ = xq.r.q(new co.q(3, str));
        int length = str.length();
        listQ.size();
        int iF = d0.f(listQ);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : listQ) {
            int i10 = i7 + 1;
            String line = null;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            String str2 = (String) obj;
            if ((i7 != 0 && i7 != iF) || !StringsKt.K(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && x.n(str2, i11, "|", false)) {
                    int length3 = "|".length() + i11;
                    Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                    line = str2.substring(length3);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i7 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        CollectionsKt.N(arrayList, sb2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, null, 124);
        return sb2.toString();
    }
}
