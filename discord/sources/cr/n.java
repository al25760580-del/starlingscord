package cr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f7385b = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7386a;

    public static final Object a(Object obj) {
        if (obj instanceof m) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Intrinsics.areEqual(this.f7386a, ((n) obj).f7386a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7386a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f7386a;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
