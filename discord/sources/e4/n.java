package e4;

import kotlin.jvm.internal.Intrinsics;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f7997b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f7996a, nVar.f7996a) && this.f7997b == nVar.f7997b;
    }

    public final int hashCode() {
        return this.f7997b.hashCode() + (this.f7996a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f7996a + ", state=" + this.f7997b + ')';
    }
}
