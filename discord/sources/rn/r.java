package rn;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f19489d;

    public r(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f19489d = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Intrinsics.areEqual(this.f19489d, ((r) obj).f19489d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19489d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f19489d + ')';
    }
}
