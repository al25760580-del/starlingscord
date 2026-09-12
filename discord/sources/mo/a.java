package mo;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type f15935d;

    public a(Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f15935d = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.areEqual(this.f15935d, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f15935d;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return c0.b(this.f15935d) + "[]";
    }

    public final int hashCode() {
        return this.f15935d.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
