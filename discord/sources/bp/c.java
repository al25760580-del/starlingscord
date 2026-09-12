package bp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f3340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f3341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f3342d;

    static {
        int i7 = 0;
        List<KClass> listG = kotlin.collections.d0.g(Reflection.getOrCreateKotlinClass(Boolean.TYPE), Reflection.getOrCreateKotlinClass(Byte.TYPE), Reflection.getOrCreateKotlinClass(Character.TYPE), Reflection.getOrCreateKotlinClass(Double.TYPE), Reflection.getOrCreateKotlinClass(Float.TYPE), Reflection.getOrCreateKotlinClass(Integer.TYPE), Reflection.getOrCreateKotlinClass(Long.TYPE), Reflection.getOrCreateKotlinClass(Short.TYPE));
        f3339a = listG;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(listG, 10));
        for (KClass kClass : listG) {
            arrayList.add(new Pair(gn.h.C(kClass), gn.h.D(kClass)));
        }
        f3340b = w0.l(arrayList);
        List<KClass> list = f3339a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(list, 10));
        for (KClass kClass2 : list) {
            arrayList2.add(new Pair(gn.h.D(kClass2), gn.h.C(kClass2)));
        }
        f3341c = w0.l(arrayList2);
        List listG2 = kotlin.collections.d0.g(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, go.n.class, Function8.class, go.o.class, go.a.class, go.b.class, go.c.class, go.d.class, go.e.class, go.f.class, go.g.class, go.h.class, go.i.class, go.j.class, go.k.class, go.l.class, go.m.class);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(listG2, 10));
        for (Object obj : listG2) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i7)));
            i7 = i10;
        }
        f3342d = w0.l(arrayList3);
    }

    public static final up.b a(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(a3.e.j(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(a3.e.j(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null) {
                    up.b bVarA = a(declaringClass);
                    up.e eVarE = up.e.e(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                    return bVarA.d(eVarE);
                }
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                up.c topLevelFqName = new up.c(name);
                Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                return new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
            }
        }
        String name2 = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        up.c cVar = new up.c(name2);
        return new up.b(cVar.b(), zs.a.Y(cVar.f21262a.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return kotlin.text.x.m(name, '.', '/');
            }
            StringBuilder sb2 = new StringBuilder("L");
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb2.append(kotlin.text.x.m(name2, '.', '/'));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(a3.e.j(cls, "Unsupported primitive type: "));
    }

    public static final List c(Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return n0.f14659d;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return xq.r.q(xq.r.k(xq.n.c(b.f3334e, type), b.f3335i));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return kotlin.collections.y.H(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final boolean e(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
