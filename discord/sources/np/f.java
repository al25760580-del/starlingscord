package np;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lq.d0;
import lq.z;
import pp.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements hq.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f16997b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f16998c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f16999d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f17000e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f17001f = new f();

    public static String[] a(String... signatures) {
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k b(String representation) {
        cq.c cVar;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.getClass();
        char cCharAt = representation.charAt(0);
        cq.c[] cVarArrValues = cq.c.values();
        int length = cVarArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i7];
            if (cVar.c().charAt(0) == cCharAt) {
                break;
            }
            i7++;
        }
        if (cVar != null) {
            return new j(cVar);
        }
        if (cCharAt == 'V') {
            return new j(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new h(b(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.G(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return new i(strSubstring2);
    }

    public static i d(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new i(internalName);
    }

    public static LinkedHashSet e(String internalName, String... signatures) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return e(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet g(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return e(j(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static String h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/function/".concat(name);
    }

    public static String i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/lang/" + name;
    }

    public static String j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/".concat(name);
    }

    public static String k(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/concurrent/atomic/".concat(name);
    }

    public static String l(k type) {
        String strC;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof h) {
            return "[" + l(((h) type).f17005i);
        }
        if (type instanceof j) {
            cq.c cVar = ((j) type).f17007i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (type instanceof i) {
            return s0.g.g(new StringBuilder("L"), ((i) type).f17006i, ';');
        }
        throw new rn.n();
    }

    @Override // hq.n
    public z c(s0 proto, String flexibleId, d0 lowerBound, d0 upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        if (Intrinsics.areEqual(flexibleId, "kotlin.jvm.PlatformType")) {
            return proto.l(sp.k.f20489g) ? new jp.i(lowerBound, upperBound) : lq.c.e(lowerBound, upperBound);
        }
        return nq.l.c(nq.k.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
