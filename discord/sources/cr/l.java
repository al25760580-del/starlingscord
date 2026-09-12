package cr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f7384a;

    public l(Throwable th2) {
        this.f7384a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Intrinsics.areEqual(this.f7384a, ((l) obj).f7384a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f7384a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // cr.m
    public final String toString() {
        return "Closed(" + this.f7384a + ')';
    }
}
