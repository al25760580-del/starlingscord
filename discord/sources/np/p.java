package np;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17017a;

    public p(String str) {
        this.f17017a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f17017a, ((p) obj).f17017a);
    }

    public final int hashCode() {
        return this.f17017a.hashCode();
    }

    public final String toString() {
        return s0.g.g(new StringBuilder("MemberSignature(signature="), this.f17017a, ')');
    }
}
