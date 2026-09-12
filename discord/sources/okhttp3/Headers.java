package okhttp3;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.x;

/* JADX INFO: loaded from: classes.dex */
public final class Headers implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f17319d;

    public Headers(String[] strArr) {
        this.f17319d = strArr;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f17319d;
        int length = strArr.length - 2;
        int iA = zn.c.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (true) {
            int i7 = length - 2;
            if (x.i(name, strArr[length], true)) {
                return strArr[length + 1];
            }
            if (length == iA) {
                return null;
            }
            length = i7;
        }
    }

    public final String b(int i7) {
        return this.f17319d[i7 * 2];
    }

    public final fj.c d() {
        fj.c cVar = new fj.c(9);
        i0.q((ArrayList) cVar.f9267e, this.f17319d);
        return cVar;
    }

    public final TreeMap e() {
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            String strB = b(i7);
            Locale locale = Locale.US;
            String strP = a3.e.p(locale, "US", strB, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strP);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strP, arrayList);
            }
            arrayList.add(h(i7));
            i7 = i10;
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f17319d, ((Headers) obj).f17319d);
        }
        return false;
    }

    public final String h(int i7) {
        return this.f17319d[(i7 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17319d);
    }

    public final List i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            if (x.i(name, b(i7), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i7));
            }
            i7 = i10;
        }
        if (arrayList == null) {
            return n0.f14659d;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i7 = 0; i7 < size; i7++) {
            pairArr[i7] = new Pair(b(i7), h(i7));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f17319d.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            String strB = b(i7);
            String strH = h(i7);
            sb2.append(strB);
            sb2.append(": ");
            if (ds.b.p(strB)) {
                strH = "██";
            }
            sb2.append(strH);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            i7 = i10;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
