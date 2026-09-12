package hq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.b f11013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11014b;

    public g(up.b classId, e eVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f11013a = classId;
        this.f11014b = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return Intrinsics.areEqual(this.f11013a, ((g) obj).f11013a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11013a.hashCode();
    }
}
