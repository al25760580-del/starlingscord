package to;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f20866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20867b;

    public l(k kind, int i7) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f20866a = kind;
        this.f20867b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f20866a, lVar.f20866a) && this.f20867b == lVar.f20867b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20867b) + (this.f20866a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
        sb2.append(this.f20866a);
        sb2.append(", arity=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f20867b, ')');
    }
}
