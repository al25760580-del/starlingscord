package uo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.d0;
import kotlin.collections.f1;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f21249a = f1.e(np.f.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f21250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f21251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f21252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f21253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f21254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f21255g;

    static {
        List<cq.c> listG = d0.g(cq.c.BOOLEAN, cq.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cq.c cVar : listG) {
            up.c cVar2 = cVar.f7338v;
            if (cVar2 == null) {
                cq.c.a(15);
                throw null;
            }
            String strB = cVar2.f21262a.f().b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            i0.o(linkedHashSet, np.f.f(strB, cVar.f7336e + "Value()" + cVar.c()));
        }
        f21250b = f1.d(f1.d(f1.d(f1.d(f1.d(f1.d(linkedHashSet, np.f.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), np.f.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), np.f.f("Double", "isInfinite()Z", "isNaN()Z")), np.f.f("Float", "isInfinite()Z", "isNaN()Z")), np.f.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), np.f.f("CharSequence", "isEmpty()Z"));
        f21251c = np.f.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f21252d = f1.d(f1.d(f1.d(f1.d(f1.d(f1.d(np.f.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), np.f.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), np.f.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), np.f.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), np.f.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), np.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), np.f.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f21253e = f1.d(f1.d(np.f.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), np.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), np.f.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        cq.c cVar3 = cq.c.BOOLEAN;
        cq.c cVar4 = cq.c.BYTE;
        List listG2 = d0.g(cVar3, cVar4, cq.c.DOUBLE, cq.c.FLOAT, cVar4, cq.c.INT, cq.c.LONG, cq.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listG2.iterator();
        while (it.hasNext()) {
            up.c cVar5 = ((cq.c) it.next()).f7338v;
            if (cVar5 == null) {
                cq.c.a(15);
                throw null;
            }
            String strB2 = cVar5.f21262a.f().b();
            Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
            String[] strArrA = np.f.a("Ljava/lang/String;");
            i0.o(linkedHashSet2, np.f.f(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)));
        }
        String[] strArrA2 = np.f.a("D");
        LinkedHashSet linkedHashSetD = f1.d(linkedHashSet2, np.f.f("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = np.f.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f21254f = f1.d(linkedHashSetD, np.f.f("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = np.f.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f21255g = np.f.f("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }

    public static boolean a(up.d arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "fqName");
        if (Intrinsics.areEqual(arrayFqName, so.o.f20374g)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return so.o.f20375g0.get(arrayFqName) != null;
    }
}
