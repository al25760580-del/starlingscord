package rn;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19498e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19499i;

    public v(Object obj, Object obj2, Object obj3) {
        this.f19497d = obj;
        this.f19498e = obj2;
        this.f19499i = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f19497d, vVar.f19497d) && Intrinsics.areEqual(this.f19498e, vVar.f19498e) && Intrinsics.areEqual(this.f19499i, vVar.f19499i);
    }

    public final int hashCode() {
        Object obj = this.f19497d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19498e;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f19499i;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f19497d + ", " + this.f19498e + ", " + this.f19499i + ')';
    }
}
