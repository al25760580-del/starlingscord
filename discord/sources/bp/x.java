package bp;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends w implements lp.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f3372a;

    public x(Method member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f3372a = member;
    }

    @Override // bp.w
    public final Member b() {
        return this.f3372a;
    }

    public final b0 f() {
        Type type = this.f3372a.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(type, "getGenericReturnType(...)");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z5 = type instanceof Class;
        if (z5) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        if ((type instanceof GenericArrayType) || (z5 && ((Class) type).isArray())) {
            return new h(type);
        }
        return type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
    }

    public final List g() {
        Method method = this.f3372a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // lp.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f3372a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
