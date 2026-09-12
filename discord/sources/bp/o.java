package bp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends s implements lp.b, lp.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3364a;

    public o(Class klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f3364a = klass;
    }

    @Override // lp.b
    public final d a(up.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Class cls = this.f3364a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return sa.a.j(declaredAnnotations, fqName);
    }

    public final List b() {
        Field[] declaredFields = this.f3364a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return xq.r.q(xq.r.n(xq.r.i(kotlin.collections.y.o(declaredFields), l.f3361d), m.f3362d));
    }

    public final up.c c() {
        return c.a(this.f3364a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.f3364a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return xq.r.q(xq.r.n(xq.r.h(kotlin.collections.y.o(declaredMethods), new i(0, this)), n.f3363d));
    }

    public final up.e e() {
        Class cls = this.f3364a;
        if (!cls.isAnonymousClass()) {
            up.e eVarE = up.e.e(cls.getSimpleName());
            Intrinsics.checkNotNull(eVarE);
            return eVarE;
        }
        String missingDelimiterValue = cls.getName();
        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getName(...)");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(".", "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM = StringsKt.M(0, 6, missingDelimiterValue, ".");
        if (iM != -1) {
            missingDelimiterValue = missingDelimiterValue.substring(1 + iM, missingDelimiterValue.length());
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
        }
        up.e eVarE2 = up.e.e(missingDelimiterValue);
        Intrinsics.checkNotNull(eVarE2);
        return eVarE2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Intrinsics.areEqual(this.f3364a, ((o) obj).f3364a);
        }
        return false;
    }

    public final ArrayList f() {
        Class clazz = this.f3364a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        com.google.firebase.messaging.r rVar = mo.c0.f15938a;
        Object[] objArr = null;
        if (rVar == null) {
            try {
                rVar = new com.google.firebase.messaging.r(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                rVar = new com.google.firebase.messaging.r(objArr, objArr, objArr, objArr);
            }
            mo.c0.f15938a = rVar;
        }
        Method method = (Method) rVar.f6613v;
        objArr = method != null ? (Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new a0(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f3364a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        com.google.firebase.messaging.r rVar = mo.c0.f15938a;
        Boolean bool = null;
        if (rVar == null) {
            try {
                rVar = new com.google.firebase.messaging.r(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                rVar = new com.google.firebase.messaging.r(bool, bool, bool, bool);
            }
            mo.c0.f15938a = rVar;
        }
        Method method = (Method) rVar.f6612i;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f3364a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? n0.f14659d : sa.a.l(declaredAnnotations);
    }

    @Override // lp.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f3364a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f3364a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        com.google.firebase.messaging.r rVar = mo.c0.f15938a;
        Boolean bool = null;
        if (rVar == null) {
            try {
                rVar = new com.google.firebase.messaging.r(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                rVar = new com.google.firebase.messaging.r(bool, bool, bool, bool);
            }
            mo.c0.f15938a = rVar;
        }
        Method method = (Method) rVar.f6610d;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f3364a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(o.class, sb2, ": ");
        sb2.append(this.f3364a);
        return sb2.toString();
    }
}
