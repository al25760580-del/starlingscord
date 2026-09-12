package gn;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f10152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f10154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f10155d;

    public k(j top, j right, j bottom, j left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.f10152a = top;
        this.f10153b = right;
        this.f10154c = bottom;
        this.f10155d = left;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10152a == kVar.f10152a && this.f10153b == kVar.f10153b && this.f10154c == kVar.f10154c && this.f10155d == kVar.f10155d;
    }

    public final int hashCode() {
        return this.f10155d.hashCode() + ((this.f10154c.hashCode() + ((this.f10153b.hashCode() + (this.f10152a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewEdges(top=" + this.f10152a + ", right=" + this.f10153b + ", bottom=" + this.f10154c + ", left=" + this.f10155d + ")";
    }
}
