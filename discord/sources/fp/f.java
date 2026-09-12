package fp;

import bp.t;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import so.o;
import wo.m;
import wo.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9342a = w0.g(new Pair("PACKAGE", EnumSet.noneOf(n.class)), new Pair("TYPE", EnumSet.of(n.CLASS, n.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(n.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(n.TYPE)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9343b = w0.g(new Pair("RUNTIME", m.f22389d), new Pair("CLASS", m.f22390e), new Pair("SOURCE", m.f22391i));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static zp.b a(List arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f9342a.get(up.e.e(((t) it.next()).f3369b.name()).b());
            if (iterable == null) {
                iterable = p0.f14661d;
            }
            i0.o(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(e0.l(arrayList2, 10));
        for (n nVar : arrayList2) {
            up.c topLevelFqName = o.f20387u;
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            up.b bVar = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
            up.e eVarE = up.e.e(nVar.name());
            Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
            arrayList3.add(new zp.i(bVar, eVarE));
        }
        return new zp.b(arrayList3, e.f9341d);
    }
}
