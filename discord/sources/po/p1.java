package po;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f18124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18125e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f18126i;

    public p1(q1 q1Var, int i7, Lazy lazy) {
        this.f18124d = q1Var;
        this.f18125e = i7;
        this.f18126i = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q1 q1Var = this.f18124d;
        Type javaType = q1Var.getJavaType();
        if (javaType instanceof Class) {
            Class cls = (Class) javaType;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.checkNotNull(componentType);
            return componentType;
        }
        boolean z5 = javaType instanceof GenericArrayType;
        int i7 = this.f18125e;
        if (z5) {
            if (i7 == 0) {
                Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                Intrinsics.checkNotNull(genericComponentType);
                return genericComponentType;
            }
            throw new ar.a0("Array type has been queried for a non-0th argument: " + q1Var);
        }
        if (!(javaType instanceof ParameterizedType)) {
            throw new ar.a0("Non-generic type has been queried for arguments: " + q1Var);
        }
        Type type = (Type) ((List) this.f18126i.getValue()).get(i7);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) kotlin.collections.y.t(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) kotlin.collections.y.s(upperBounds);
        }
        Intrinsics.checkNotNull(type2);
        return type2;
    }
}
