package bp;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f3344a;

    public d(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f3344a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        lp.a pVar;
        Annotation annotation = this.f3344a;
        Method[] declaredMethods = gn.h.B(gn.h.z(annotation)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object value = method.invoke(annotation, null);
            Intrinsics.checkNotNullExpressionValue(value, "invoke(...)");
            up.e eVarE = up.e.e(method.getName());
            Intrinsics.checkNotNullParameter(value, "value");
            if (c.e(value.getClass())) {
                pVar = new t(eVarE, (Enum) value);
            } else if (value instanceof Annotation) {
                pVar = new f(eVarE, (Annotation) value);
            } else if (value instanceof Object[]) {
                pVar = new g(eVarE, (Object[]) value);
            } else {
                pVar = value instanceof Class ? new p(eVarE, (Class) value) : new v(eVarE, value);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3344a == ((d) obj).f3344a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3344a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(d.class, sb2, ": ");
        sb2.append(this.f3344a);
        return sb2.toString();
    }
}
