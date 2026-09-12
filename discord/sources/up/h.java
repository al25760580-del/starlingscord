package up;

import a5.l0;
import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.f1;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f21286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f21287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f21288i;
    public static final b j;
    public static final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f21289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f21290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f21291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f21292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f21293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f21294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Set f21295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f21296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f21297t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f21298u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f21299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f21300w;

    static {
        c cVar = new c("kotlin");
        f21280a = cVar;
        e eVarE = e.e("reflect");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        c cVarA = cVar.a(eVarE);
        f21281b = cVarA;
        e eVarE2 = e.e("collections");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        c cVarA2 = cVar.a(eVarE2);
        f21282c = cVarA2;
        e eVarE3 = e.e("sequences");
        Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
        cVar.a(eVarE3);
        e eVarE4 = e.e("ranges");
        Intrinsics.checkNotNullExpressionValue(eVarE4, "identifier(...)");
        c cVarA3 = cVar.a(eVarE4);
        f21283d = cVarA3;
        e eVarE5 = e.e(DebugImage.JVM);
        Intrinsics.checkNotNullExpressionValue(eVarE5, "identifier(...)");
        c cVarA4 = cVar.a(eVarE5);
        e eVarE6 = e.e("annotations");
        Intrinsics.checkNotNullExpressionValue(eVarE6, "identifier(...)");
        c cVarA5 = cVar.a(eVarE6);
        e eVarE7 = e.e(DebugImage.JVM);
        Intrinsics.checkNotNullExpressionValue(eVarE7, "identifier(...)");
        cVarA5.a(eVarE7);
        e eVarE8 = e.e("internal");
        Intrinsics.checkNotNullExpressionValue(eVarE8, "identifier(...)");
        cVarA4.a(eVarE8);
        e eVarE9 = e.e("functions");
        Intrinsics.checkNotNullExpressionValue(eVarE9, "identifier(...)");
        cVarA4.a(eVarE9);
        e eVarE10 = e.e("annotation");
        Intrinsics.checkNotNullExpressionValue(eVarE10, "identifier(...)");
        c cVarA6 = cVar.a(eVarE10);
        f21284e = cVarA6;
        e eVarE11 = e.e("internal");
        Intrinsics.checkNotNullExpressionValue(eVarE11, "identifier(...)");
        c cVarA7 = cVar.a(eVarE11);
        e eVarE12 = e.e("ir");
        Intrinsics.checkNotNullExpressionValue(eVarE12, "identifier(...)");
        cVarA7.a(eVarE12);
        e eVarE13 = e.e("coroutines");
        Intrinsics.checkNotNullExpressionValue(eVarE13, "identifier(...)");
        c cVarA8 = cVar.a(eVarE13);
        f21285f = cVarA8;
        e eVarE14 = e.e("intrinsics");
        Intrinsics.checkNotNullExpressionValue(eVarE14, "identifier(...)");
        cVarA8.a(eVarE14);
        e eVarE15 = e.e("enums");
        Intrinsics.checkNotNullExpressionValue(eVarE15, "identifier(...)");
        f21286g = cVar.a(eVarE15);
        e eVarE16 = e.e("contracts");
        Intrinsics.checkNotNullExpressionValue(eVarE16, "identifier(...)");
        cVar.a(eVarE16);
        e eVarE17 = e.e("concurrent");
        Intrinsics.checkNotNullExpressionValue(eVarE17, "identifier(...)");
        c cVarA9 = cVar.a(eVarE17);
        e eVarE18 = e.e("atomics");
        Intrinsics.checkNotNullExpressionValue(eVarE18, "identifier(...)");
        c cVarA10 = cVarA9.a(eVarE18);
        e eVarE19 = e.e("test");
        Intrinsics.checkNotNullExpressionValue(eVarE19, "identifier(...)");
        cVar.a(eVarE19);
        e eVarE20 = e.e("text");
        Intrinsics.checkNotNullExpressionValue(eVarE20, "identifier(...)");
        cVar.a(eVarE20);
        c[] elements = {cVar, cVarA2, cVarA3, cVarA6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        y.J(elements);
        c[] elements2 = {cVar, cVarA2, cVarA3, cVarA6, cVarA, cVarA7, cVarA8, cVarA10};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        y.J(elements2);
        l0.a("Nothing");
        f21287h = l0.a("Unit");
        f21288i = l0.a("Any");
        j = l0.a("Enum");
        l0.a("Annotation");
        k = l0.a("Array");
        b bVarA = l0.a("Boolean");
        b bVarA2 = l0.a("Char");
        b bVarA3 = l0.a("Byte");
        b bVarA4 = l0.a("Short");
        b bVarA5 = l0.a("Int");
        b bVarA6 = l0.a("Long");
        b bVarA7 = l0.a("Float");
        b bVarA8 = l0.a("Double");
        f21289l = l0.g(bVarA3);
        f21290m = l0.g(bVarA4);
        f21291n = l0.g(bVarA5);
        f21292o = l0.g(bVarA6);
        l0.a("CharSequence");
        f21293p = l0.a("String");
        l0.a("Throwable");
        l0.a("Cloneable");
        l0.f("KProperty");
        l0.f("KMutableProperty");
        l0.f("KProperty0");
        l0.f("KMutableProperty0");
        l0.f("KProperty1");
        l0.f("KMutableProperty1");
        l0.f("KProperty2");
        l0.f("KMutableProperty2");
        f21294q = l0.f("KFunction");
        l0.f("KClass");
        l0.f("KCallable");
        l0.f("KType");
        l0.a("Comparable");
        l0.a("Number");
        l0.a("Function");
        b[] elements3 = {bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set setJ = y.J(elements3);
        f21295r = setJ;
        b[] elements4 = {bVarA3, bVarA4, bVarA5, bVarA6};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        y.J(elements4);
        Set set = setJ;
        int iA = v0.a(e0.l(set, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : set) {
            linkedHashMap.put(obj, l0.d(((b) obj).f()));
        }
        l0.c(linkedHashMap);
        b[] elements5 = {f21289l, f21290m, f21291n, f21292o};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set setJ2 = y.J(elements5);
        f21296s = setJ2;
        Set set2 = setJ2;
        int iA2 = v0.a(e0.l(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, l0.d(((b) obj2).f()));
        }
        l0.c(linkedHashMap2);
        Set set3 = f21295r;
        Set set4 = f21296s;
        LinkedHashSet linkedHashSetD = f1.d(set3, set4);
        b bVar = f21293p;
        f1.e(linkedHashSetD, bVar);
        c packageFqName = f21285f;
        e topLevelName = e.e("Continuation");
        Intrinsics.checkNotNullExpressionValue(topLevelName, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        c cVar2 = c.f21261c;
        c relativeClassName = zs.a.Y(topLevelName);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        relativeClassName.f21262a.c();
        l0.b("Iterator");
        l0.b("Iterable");
        l0.b("Collection");
        l0.b("List");
        l0.b("ListIterator");
        l0.b("Set");
        b bVarB = l0.b("Map");
        l0.b("AbstractMap");
        l0.b("MutableIterator");
        l0.b("CharIterator");
        l0.b("MutableIterable");
        l0.b("MutableCollection");
        f21297t = l0.b("MutableList");
        l0.b("MutableListIterator");
        f21298u = l0.b("MutableSet");
        b bVarB2 = l0.b("MutableMap");
        f21299v = bVarB2;
        e eVarE21 = e.e("Entry");
        Intrinsics.checkNotNullExpressionValue(eVarE21, "identifier(...)");
        bVarB.d(eVarE21);
        e eVarE22 = e.e("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(eVarE22, "identifier(...)");
        bVarB2.d(eVarE22);
        l0.a("Result");
        l0.e("IntRange");
        l0.e("LongRange");
        l0.e("CharRange");
        c packageFqName2 = f21284e;
        e topLevelName2 = e.e("AnnotationRetention");
        Intrinsics.checkNotNullExpressionValue(topLevelName2, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName2, "topLevelName");
        c relativeClassName2 = zs.a.Y(topLevelName2);
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName2, "relativeClassName");
        relativeClassName2.f21262a.c();
        e topLevelName3 = e.e("AnnotationTarget");
        Intrinsics.checkNotNullExpressionValue(topLevelName3, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName3, "topLevelName");
        c relativeClassName3 = zs.a.Y(topLevelName3);
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName3, "relativeClassName");
        relativeClassName3.f21262a.c();
        l0.a("DeprecationLevel");
        c cVar3 = f21286g;
        e eVarE23 = e.e("EnumEntries");
        Intrinsics.checkNotNullExpressionValue(eVarE23, "identifier(...)");
        f21300w = new b(cVar3, eVarE23);
        f1.e(f1.e(f1.e(f1.e(f1.d(set3, set4), bVar), f21287h), f21288i), j);
    }
}
