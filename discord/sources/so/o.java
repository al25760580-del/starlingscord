package so;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final up.c A;
    public static final up.c B;
    public static final up.c C;
    public static final up.c D;
    public static final up.c E;
    public static final up.c F;
    public static final up.c G;
    public static final up.c H;
    public static final up.c I;
    public static final up.c J;
    public static final up.c K;
    public static final up.c L;
    public static final up.c M;
    public static final up.c N;
    public static final up.c O;
    public static final up.c P;
    public static final up.d Q;
    public static final up.b R;
    public static final up.b S;
    public static final up.b T;
    public static final up.b U;
    public static final up.b V;
    public static final up.c W;
    public static final up.c X;
    public static final up.c Y;
    public static final up.c Z;
    public static final up.c a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final up.c f20365b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final up.c f20367c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final up.d f20368d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final HashSet f20369d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.d f20370e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final HashSet f20371e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final up.d f20372f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final HashMap f20373f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final up.d f20374g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final HashMap f20375g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final up.d f20376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final up.d f20377i;
    public static final up.d j;
    public static final up.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final up.c f20378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final up.c f20379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final up.c f20380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final up.c f20381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final up.c f20382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final up.c f20383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final up.c f20384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final up.c f20385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final up.c f20386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final up.c f20387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final up.c f20388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final up.c f20389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final up.c f20390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final up.c f20391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final up.c f20392z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.d f20363a = d("Any").f21262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.d f20364b = d("Nothing").f21262a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final up.d f20366c = d("Cloneable").f21262a;

    static {
        d("Suppress");
        f20368d = d("Unit").f21262a;
        f20370e = d("CharSequence").f21262a;
        f20372f = d("String").f21262a;
        f20374g = d("Array").f21262a;
        f20376h = d("Boolean").f21262a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        f20377i = d("Number").f21262a;
        j = d("Enum").f21262a;
        d("Function");
        k = d("Throwable");
        f20378l = d("Comparable");
        up.c cVar = p.f20405o;
        up.e eVarE = up.e.e("IntRange");
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        cVar.a(eVarE);
        up.e eVarE2 = up.e.e("LongRange");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        cVar.a(eVarE2);
        f20379m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        f20380n = d("DeprecationLevel");
        f20381o = d("ReplaceWith");
        f20382p = d("ExtensionFunctionType");
        f20383q = d("ContextFunctionTypeParams");
        up.c cVarD = d("ParameterName");
        f20384r = cVarD;
        yk.a.G(cVarD);
        f20385s = d("Annotation");
        up.c cVarA = a("Target");
        f20386t = cVarA;
        yk.a.G(cVarA);
        f20387u = a("AnnotationTarget");
        f20388v = a("AnnotationRetention");
        up.c cVarA2 = a("Retention");
        f20389w = cVarA2;
        yk.a.G(cVarA2);
        yk.a.G(a("Repeatable"));
        f20390x = a("MustBeDocumented");
        f20391y = d("UnsafeVariance");
        d("PublishedApi");
        up.c cVar2 = p.f20406p;
        up.e eVarE3 = up.e.e("AccessibleLateinitPropertyLiteral");
        Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
        cVar2.a(eVarE3);
        up.c cVar3 = new up.c("kotlin.internal.PlatformDependent");
        f20392z = cVar3;
        yk.a.G(cVar3);
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        up.c cVarB = b("Map");
        G = cVarB;
        up.e eVarE4 = up.e.e("Entry");
        Intrinsics.checkNotNullExpressionValue(eVarE4, "identifier(...)");
        H = cVarB.a(eVarE4);
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        up.c cVarB2 = b("MutableMap");
        O = cVarB2;
        up.e eVarE5 = up.e.e("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(eVarE5, "identifier(...)");
        P = cVarB2.a(eVarE5);
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        up.d dVarE = e("KProperty");
        e("KMutableProperty");
        R = yk.a.G(dVarE.g());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        up.c cVarD2 = d("UByte");
        up.c cVarD3 = d("UShort");
        up.c cVarD4 = d("UInt");
        up.c cVarD5 = d("ULong");
        S = yk.a.G(cVarD2);
        T = yk.a.G(cVarD3);
        U = yk.a.G(cVarD4);
        V = yk.a.G(cVarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        f20365b0 = c("AtomicLongArray");
        f20367c0 = c("AtomicArray");
        int length = k.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (k kVar : k.values()) {
            hashSet.add(kVar.f20352d);
        }
        f20369d0 = hashSet;
        int length2 = k.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (k kVar2 : k.values()) {
            hashSet2.add(kVar2.f20353e);
        }
        f20371e0 = hashSet2;
        int length3 = k.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (k kVar3 : k.values()) {
            String strB = kVar3.f20352d.b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            map.put(d(strB).f21262a, kVar3);
        }
        f20373f0 = map;
        int length4 = k.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (k kVar4 : k.values()) {
            String strB2 = kVar4.f20353e.b();
            Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
            map2.put(d(strB2).f21262a, kVar4);
        }
        f20375g0 = map2;
    }

    public static up.c a(String str) {
        up.c cVar = p.f20403m;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return cVar.a(eVarE);
    }

    public static up.c b(String str) {
        up.c cVar = p.f20404n;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return cVar.a(eVarE);
    }

    public static up.c c(String str) {
        up.c cVar = p.f20407q;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return cVar.a(eVarE);
    }

    public static up.c d(String str) {
        up.c cVar = p.f20402l;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return cVar.a(eVarE);
    }

    public static final up.d e(String simpleName) {
        Intrinsics.checkNotNullParameter(simpleName, "simpleName");
        up.c cVar = p.f20401i;
        up.e eVarE = up.e.e(simpleName);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return cVar.a(eVarE).f21262a;
    }
}
