package mo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements ParameterizedType, Type {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f15959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type f15960e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Type[] f15961i;

    public y(Class rawType, Type type, ArrayList typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f15959d = rawType;
        this.f15960e = type;
        this.f15961i = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return Intrinsics.areEqual(this.f15959d, parameterizedType.getRawType()) && Intrinsics.areEqual(this.f15960e, parameterizedType.getOwnerType()) && Arrays.equals(this.f15961i, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f15961i;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f15960e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f15959d;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f15959d;
        Type type = this.f15960e;
        if (type != null) {
            sb2.append(c0.b(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(c0.b(cls));
        }
        Type[] typeArr = this.f15961i;
        if (typeArr.length != 0) {
            kotlin.collections.y.x(typeArr, sb2, ", ", "<", ">", x.f15958d);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f15959d.hashCode();
        Type type = this.f15960e;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f15961i);
    }

    public final String toString() {
        return getTypeName();
    }
}
