package bp;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends b0 implements lp.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WildcardType f3350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f3351b;

    public e0(WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f3350a = reflectType;
        this.f3351b = n0.f14659d;
    }

    @Override // bp.b0
    public final Type b() {
        return this.f3350a;
    }

    public final b0 c() {
        WildcardType wildcardType = this.f3350a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Intrinsics.checkNotNull(lowerBounds);
            Object objD = kotlin.collections.y.D(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objD, "single(...)");
            Type type = (Type) objD;
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
        if (upperBounds.length != 1) {
            return null;
        }
        Intrinsics.checkNotNull(upperBounds);
        Type type2 = (Type) kotlin.collections.y.D(upperBounds);
        if (Intrinsics.areEqual(type2, Object.class)) {
            return null;
        }
        Intrinsics.checkNotNull(type2);
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z6 = type2 instanceof Class;
        if (z6) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z6 && ((Class) type2).isArray())) {
            return new h(type2);
        }
        return type2 instanceof WildcardType ? new e0((WildcardType) type2) : new q(type2);
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        return this.f3351b;
    }
}
