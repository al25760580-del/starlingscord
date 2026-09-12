package zp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq.z f24074a;

    public q(lq.z type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f24074a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f24074a, ((q) obj).f24074a);
    }

    public final int hashCode() {
        return this.f24074a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f24074a + ')';
    }
}
