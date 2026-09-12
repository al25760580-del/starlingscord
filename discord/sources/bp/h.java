package bp;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b0 implements lp.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f3355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f3356c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Type reflectType) {
        b0 hVar;
        b0 zVar;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f3354a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> type = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(type, "getComponentType(...)");
                    Intrinsics.checkNotNullParameter(type, "type");
                    hVar = (type == 0 || !type.isPrimitive()) ? ((type instanceof GenericArrayType) || (type != 0 && type.isArray())) ? new h(type) : type instanceof WildcardType ? new e0((WildcardType) type) : new q(type) : new z(type);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type type2 = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(type2, "getGenericComponentType(...)");
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z5 = type2 instanceof Class;
        if (z5) {
            Class cls2 = (Class) type2;
            zVar = cls2.isPrimitive() ? new z(cls2) : zVar;
            this.f3355b = zVar;
            this.f3356c = n0.f14659d;
        }
        hVar = ((type2 instanceof GenericArrayType) || (z5 && ((Class) type2).isArray())) ? new h(type2) : type2 instanceof WildcardType ? new e0((WildcardType) type2) : new q(type2);
        zVar = hVar;
        this.f3355b = zVar;
        this.f3356c = n0.f14659d;
    }

    @Override // bp.b0
    public final Type b() {
        return this.f3354a;
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        return this.f3356c;
    }
}
