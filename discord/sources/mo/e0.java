package mo;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements WildcardType, Type {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final d0 f15945i = new d0(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e0 f15946v = new e0(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type f15947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type f15948e;

    public e0(Type type, Type type2) {
        this.f15947d = type;
        this.f15948e = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f15948e;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f15948e;
        if (type != null) {
            return "? super " + c0.b(type);
        }
        Type type2 = this.f15947d;
        if (type2 == null || Intrinsics.areEqual(type2, Object.class)) {
            return "?";
        }
        return "? extends " + c0.b(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f15947d;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
