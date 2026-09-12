package vo;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.b f21797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21798b;

    public c0(up.b classId, List typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        this.f21797a = classId;
        this.f21798b = typeParametersCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.areEqual(this.f21797a, c0Var.f21797a) && Intrinsics.areEqual(this.f21798b, c0Var.f21798b);
    }

    public final int hashCode() {
        return this.f21798b.hashCode() + (this.f21797a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f21797a + ", typeParametersCount=" + this.f21798b + ')';
    }
}
