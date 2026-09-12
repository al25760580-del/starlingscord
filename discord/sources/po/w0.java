package po;

import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Type {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type[] f18174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18175e;

    public w0(Type[] types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f18174d = types;
        this.f18175e = Arrays.hashCode(types);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            return Arrays.equals(this.f18174d, ((w0) obj).f18174d);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return kotlin.collections.y.A(this.f18174d, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f18175e;
    }

    public final String toString() {
        return getTypeName();
    }
}
