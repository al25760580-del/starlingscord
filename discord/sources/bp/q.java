package bp;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends b0 implements lp.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3367b;

    public q(Type reflectType) {
        s oVar;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f3366a = reflectType;
        if (reflectType instanceof Class) {
            oVar = new o((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            oVar = new c0((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        }
        this.f3367b = oVar;
    }

    @Override // bp.b0, lp.b
    public final d a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // bp.b0
    public final Type b() {
        return this.f3366a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    public final ArrayList c() {
        b0 hVar;
        b0 zVar;
        List<Type> listC = c.c(this.f3366a);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(listC, 10));
        for (Type type : listC) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z5 = type instanceof Class;
            if (z5) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    zVar = new z(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z5 && ((Class) type).isArray())) {
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
            arrayList.add(zVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.f3366a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // lp.b
    public final Collection getAnnotations() {
        return n0.f14659d;
    }
}
