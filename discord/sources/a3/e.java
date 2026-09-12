package a3;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void A(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void B(StringBuilder sb2, boolean z5, String str, boolean z6, String str2) {
        sb2.append(z5);
        sb2.append(str);
        sb2.append(z6);
        sb2.append(str2);
    }

    public static int a(int i7, int i10, float f2) {
        return (Float.hashCode(f2) + i7) * i10;
    }

    public static int b(int i7, int i10, int i11) {
        return androidx.datastore.preferences.protobuf.i.y(i7) + i10 + i11;
    }

    public static int c(int i7, int i10, int i11, int i12) {
        return androidx.datastore.preferences.protobuf.i.z(i7) + i10 + i11 + i12;
    }

    public static int d(int i7, int i10, String str) {
        return (str.hashCode() + i7) * i10;
    }

    public static int e(int i7, int i10, Function1 function1) {
        return (function1.hashCode() + i7) * i10;
    }

    public static int f(List list, int i7, int i10) {
        return (list.hashCode() + i7) * i10;
    }

    public static String g(int i7, int i10, String str, String str2) {
        return str + i7 + str2 + i10;
    }

    public static String h(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String i(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String j(Class cls, String str) {
        return str + cls;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb2, long j, String str) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String p(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static String q(Object[] objArr, int i7, Locale locale, String str, String str2) {
        String str3 = String.format(locale, str, Arrays.copyOf(objArr, i7));
        Intrinsics.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static StringBuilder r(int i7, String str, int i10, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder s(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder t(String str, String str2, String str3, int i7, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i7);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder u(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static Map v(String str, String str2) {
        return v0.b(new Pair(str, str2));
    }

    public static void w(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str, String str2, String str3) {
        je.b.N(str3, str + str2);
    }

    public static void z(StringBuilder sb2, int i7, String str, int i10, String str2) {
        sb2.append(i7);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }
}
