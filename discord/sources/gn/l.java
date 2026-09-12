package gn;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f10157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f10158c;

    public l(a insets, n mode, k edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f10156a = insets;
        this.f10157b = mode;
        this.f10158c = edges;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f10156a, lVar.f10156a) && this.f10157b == lVar.f10157b && Intrinsics.areEqual(this.f10158c, lVar.f10158c);
    }

    public final int hashCode() {
        return this.f10158c.hashCode() + ((this.f10157b.hashCode() + (this.f10156a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f10156a + ", mode=" + this.f10157b + ", edges=" + this.f10158c + ")";
    }
}
