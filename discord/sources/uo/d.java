package uo;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f21198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.b f21201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final up.c f21202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final up.b f21203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f21204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f21205i;
    public static final HashMap j;
    public static final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f21206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f21207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f21208n;

    static {
        StringBuilder sb2 = new StringBuilder();
        to.g gVar = to.g.f20860c;
        sb2.append(gVar.f20864a);
        sb2.append('.');
        sb2.append(gVar.f20865b);
        f21197a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        to.h hVar = to.h.f20861c;
        sb3.append(hVar.f20864a);
        sb3.append('.');
        sb3.append(hVar.f20865b);
        f21198b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        to.j jVar = to.j.f20863c;
        sb4.append(jVar.f20864a);
        sb4.append('.');
        sb4.append(jVar.f20865b);
        f21199c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        to.i iVar = to.i.f20862c;
        sb5.append(iVar.f20864a);
        sb5.append('.');
        sb5.append(iVar.f20865b);
        f21200d = sb5.toString();
        up.b bVarG = yk.a.G(new up.c("kotlin.jvm.functions.FunctionN"));
        f21201e = bVarG;
        f21202f = bVarG.a();
        f21203g = up.h.f21294q;
        d(Class.class);
        f21204h = new HashMap();
        f21205i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        f21206l = new HashMap();
        f21207m = new HashMap();
        up.b bVarG2 = yk.a.G(so.o.B);
        up.c cVar = so.o.J;
        up.c cVar2 = bVarG2.f21258a;
        c cVar3 = new c(d(Iterable.class), bVarG2, new up.b(cVar2, a.a.B(cVar, cVar2), false));
        up.b bVarG3 = yk.a.G(so.o.A);
        up.c cVar4 = so.o.I;
        up.c cVar5 = bVarG3.f21258a;
        c cVar6 = new c(d(Iterator.class), bVarG3, new up.b(cVar5, a.a.B(cVar4, cVar5), false));
        up.b bVarG4 = yk.a.G(so.o.C);
        up.c cVar7 = so.o.K;
        up.c cVar8 = bVarG4.f21258a;
        c cVar9 = new c(d(Collection.class), bVarG4, new up.b(cVar8, a.a.B(cVar7, cVar8), false));
        up.b bVarG5 = yk.a.G(so.o.D);
        up.c cVar10 = so.o.L;
        up.c cVar11 = bVarG5.f21258a;
        c cVar12 = new c(d(List.class), bVarG5, new up.b(cVar11, a.a.B(cVar10, cVar11), false));
        up.b bVarG6 = yk.a.G(so.o.F);
        up.c cVar13 = so.o.N;
        up.c cVar14 = bVarG6.f21258a;
        c cVar15 = new c(d(Set.class), bVarG6, new up.b(cVar14, a.a.B(cVar13, cVar14), false));
        up.b bVarG7 = yk.a.G(so.o.E);
        up.c cVar16 = so.o.M;
        up.c cVar17 = bVarG7.f21258a;
        c cVar18 = new c(d(ListIterator.class), bVarG7, new up.b(cVar17, a.a.B(cVar16, cVar17), false));
        up.c cVar19 = so.o.G;
        up.b bVarG8 = yk.a.G(cVar19);
        up.c cVar20 = so.o.O;
        up.c cVar21 = bVarG8.f21258a;
        c cVar22 = new c(d(Map.class), bVarG8, new up.b(cVar21, a.a.B(cVar20, cVar21), false));
        up.b bVarD = yk.a.G(cVar19).d(so.o.H.f21262a.f());
        up.c cVar23 = so.o.P;
        up.c cVar24 = bVarD.f21258a;
        List<c> listG = d0.g(cVar3, cVar6, cVar9, cVar12, cVar15, cVar18, cVar22, new c(d(Map.Entry.class), bVarD, new up.b(cVar24, a.a.B(cVar23, cVar24), false)));
        f21208n = listG;
        c(Object.class, so.o.f20363a);
        c(String.class, so.o.f20372f);
        c(CharSequence.class, so.o.f20370e);
        b(Throwable.class, so.o.k);
        c(Cloneable.class, so.o.f20366c);
        c(Number.class, so.o.f20377i);
        b(Comparable.class, so.o.f20378l);
        c(Enum.class, so.o.j);
        b(Annotation.class, so.o.f20385s);
        for (c cVar25 : listG) {
            up.b bVar = cVar25.f21194a;
            up.b bVar2 = cVar25.f21195b;
            up.b bVar3 = cVar25.f21196c;
            a(bVar, bVar2);
            f21205i.put(bVar3.a().f21262a, bVar);
            f21206l.put(bVar3, bVar2);
            f21207m.put(bVar2, bVar3);
            up.c cVarA = bVar2.a();
            up.c cVarA2 = bVar3.a();
            j.put(bVar3.a().f21262a, cVarA);
            k.put(cVarA.f21262a, cVarA2);
        }
        for (cq.c cVar26 : cq.c.values()) {
            up.c topLevelFqName = cVar26.f7338v;
            if (topLevelFqName == null) {
                cq.c.a(15);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getWrapperFqName(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            up.b bVar4 = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
            so.k primitiveType = cVar26.d();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            up.c topLevelFqName2 = so.p.f20402l.a(primitiveType.f20352d);
            Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
            a(bVar4, new up.b(topLevelFqName2.b(), topLevelFqName2.f21262a.f()));
        }
        for (up.b bVar5 : so.d.f20334b) {
            up.c topLevelFqName3 = new up.c("kotlin.jvm.internal." + bVar5.f().b() + "CompanionObject");
            Intrinsics.checkNotNullParameter(topLevelFqName3, "topLevelFqName");
            a(new up.b(topLevelFqName3.b(), topLevelFqName3.f21262a.f()), bVar5.d(up.g.f21274b));
        }
        for (int i7 = 0; i7 < 23; i7++) {
            up.c topLevelFqName4 = new up.c(kk.b.h(i7, "kotlin.jvm.functions.Function"));
            Intrinsics.checkNotNullParameter(topLevelFqName4, "topLevelFqName");
            up.b bVar6 = new up.b(topLevelFqName4.b(), topLevelFqName4.f21262a.f());
            up.c cVar27 = so.p.f20402l;
            up.e eVarE = up.e.e("Function" + i7);
            Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
            a(bVar6, new up.b(cVar27, eVarE));
            f21205i.put(new up.c(f21198b + i7).f21262a, f21203g);
        }
        for (int i10 = 0; i10 < 22; i10++) {
            to.i iVar2 = to.i.f20862c;
            f21205i.put(new up.c((iVar2.f20864a + '.' + iVar2.f20865b) + i10).f21262a, f21203g);
        }
        up.c cVar28 = new up.c("kotlin.concurrent.atomics.AtomicInt");
        up.b bVarD2 = d(AtomicInteger.class);
        HashMap map = f21205i;
        map.put(cVar28.f21262a, bVarD2);
        map.put(new up.c("kotlin.concurrent.atomics.AtomicLong").f21262a, d(AtomicLong.class));
        map.put(new up.c("kotlin.concurrent.atomics.AtomicBoolean").f21262a, d(AtomicBoolean.class));
        map.put(new up.c("kotlin.concurrent.atomics.AtomicReference").f21262a, d(AtomicReference.class));
        map.put(new up.c("kotlin.concurrent.atomics.AtomicIntArray").f21262a, d(AtomicIntegerArray.class));
        map.put(new up.c("kotlin.concurrent.atomics.AtomicLongArray").f21262a, d(AtomicLongArray.class));
        map.put(new up.c("kotlin.concurrent.atomics.AtomicArray").f21262a, d(AtomicReferenceArray.class));
        map.put(so.o.f20364b.g().f21262a, d(Void.class));
    }

    public static void a(up.b bVar, up.b bVar2) {
        f21204h.put(bVar.a().f21262a, bVar2);
        f21205i.put(bVar2.a().f21262a, bVar);
    }

    public static void b(Class cls, up.c topLevelFqName) {
        up.b bVarD = d(cls);
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        a(bVarD, new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()));
    }

    public static void c(Class cls, up.d dVar) {
        b(cls, dVar.g());
    }

    public static up.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            up.b bVarD = d(declaringClass);
            up.e eVarE = up.e.e(cls.getSimpleName());
            Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
            return bVarD.d(eVarE);
        }
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        up.c topLevelFqName = new up.c(canonicalName);
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        return new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
    }

    public static boolean e(up.d dVar, String str) {
        Integer intOrNull;
        String str2 = dVar.f21265a;
        if (x.o(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (!StringsKt.T(strSubstring, '0') && (intOrNull = StringsKt.toIntOrNull(strSubstring)) != null && intOrNull.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static up.b f(up.d kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        if (e(kotlinFqName, f21197a) || e(kotlinFqName, f21199c)) {
            return f21201e;
        }
        return (e(kotlinFqName, f21198b) || e(kotlinFqName, f21200d)) ? f21203g : (up.b) f21205i.get(kotlinFqName);
    }
}
