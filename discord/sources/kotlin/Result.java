package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes3.dex */
public final class Result implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final q f14614e = new q(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14615d;

    public /* synthetic */ Result(Object obj) {
        this.f14615d = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof r) {
            return ((r) obj).f19489d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return Intrinsics.areEqual(this.f14615d, ((Result) obj).f14615d);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f14615d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f14615d;
        if (obj instanceof r) {
            return ((r) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
