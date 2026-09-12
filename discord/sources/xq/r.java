package xq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public class r extends o {
    public static int e(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            it.next();
            i7++;
            if (i7 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i7;
    }

    public static Sequence f(Sequence sequence, int i7) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return sequence;
        }
        return sequence instanceof c ? ((c) sequence).a(i7) : new b(sequence, i7);
    }

    public static e g(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new e(sequence, predicate, 0);
    }

    public static g h(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new g(sequence, true, predicate);
    }

    public static g i(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new g(sequence, false, predicate);
    }

    public static Object j(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h k(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new h(sequence, transform, p.f23042d);
    }

    public static int l(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i7 = 0;
        for (Object obj2 : sequence) {
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static String m(Sequence sequence, String separator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i7 = 0;
        for (Object obj : sequence) {
            i7++;
            if (i7 > 1) {
                buffer.append((CharSequence) separator);
            }
            kotlin.text.q.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static s n(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new s(sequence, transform);
    }

    public static g o(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        s sVar = new s(sequence, transform);
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        g gVarI = i(sVar, new n6.e(21));
        Intrinsics.checkNotNull(gVarI, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return gVarI;
    }

    public static h p(s sVar, Object obj) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Object[] elements = {obj};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {sVar, y.o(elements)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Sequence sequenceO = y.o(elements2);
        Intrinsics.checkNotNullParameter(sequenceO, "<this>");
        return n.b(sequenceO, new n6.e(18));
    }

    public static List q(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return n0.f14659d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return c0.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
