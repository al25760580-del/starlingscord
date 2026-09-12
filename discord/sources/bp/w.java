package bp;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import or.y0;
import vo.c1;
import vo.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w extends s implements lp.b, lp.c {
    @Override // lp.b
    public final d a(up.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Member memberB = b();
        Intrinsics.checkNotNull(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        AnnotatedElement annotatedElement = (AnnotatedElement) memberB;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return sa.a.j(declaredAnnotations, fqName);
    }

    public abstract Member b();

    public final up.e c() {
        String name = b().getName();
        return name != null ? up.e.e(name) : up.g.f21273a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    public final ArrayList d(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z5) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        b0 hVar;
        b0 zVar;
        String str;
        boolean z6;
        e4.c cVar;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList2 = new ArrayList(parameterTypes.length);
        a aVar = a.f3331a;
        Member member = b();
        Intrinsics.checkNotNullParameter(member, "member");
        e4.c cVar2 = a.f3332b;
        Object obj = null;
        if (cVar2 == null) {
            synchronized (aVar) {
                cVar2 = a.f3332b;
                if (cVar2 == null) {
                    Intrinsics.checkNotNullParameter(member, "member");
                    Class<?> cls = member.getClass();
                    try {
                        cVar = new e4.c(4, cls.getMethod("getParameters", null), c.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        cVar = new e4.c(4, obj, obj);
                    }
                    a.f3332b = cVar;
                    cVar2 = cVar;
                }
            }
        }
        Method method2 = (Method) cVar2.f7966e;
        if (method2 == null || (method = (Method) cVar2.f7967i) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                Object objInvoke2 = method.invoke(obj2, null);
                Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        for (int i7 = 0; i7 < length; i7++) {
            Type type = parameterTypes[i7];
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z7 = type instanceof Class;
            if (z7) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    zVar = new z(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z7 && ((Class) type).isArray())) {
                        hVar = new h(type);
                    } else {
                        hVar = type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
                    }
                    zVar = hVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    hVar = new h(type);
                } else {
                    hVar = new h(type);
                }
                zVar = hVar;
            }
            if (arrayList != null) {
                str = (String) CollectionsKt.M(i7 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i7 + '+' + size + " (name=" + c() + " type=" + zVar + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z5) {
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                z6 = true;
                if (i7 != parameterTypes.length - 1) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            arrayList2.add(new d0(zVar, parameterAnnotations[i7], str, z6));
        }
        return arrayList2;
    }

    public final y0 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return c1.f21799d;
        }
        if (Modifier.isPrivate(modifiers)) {
            return z0.f21858d;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? zo.c.f24061d : zo.b.f24060d;
        }
        return zo.a.f24059d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && Intrinsics.areEqual(b(), ((w) obj).b());
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Member memberB = b();
        Intrinsics.checkNotNull(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        AnnotatedElement annotatedElement = (AnnotatedElement) memberB;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? n0.f14659d : sa.a.l(declaredAnnotations);
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
