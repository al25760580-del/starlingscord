package zp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f24075a;

    public r(f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24075a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f24075a, ((r) obj).f24075a);
    }

    public final int hashCode() {
        return this.f24075a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f24075a + ')';
    }
}
