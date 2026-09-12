package hq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rp.e f11048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final up.b f11050f;

    public o(Object obj, Object obj2, rp.e eVar, rp.e eVar2, String filePath, up.b classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f11045a = obj;
        this.f11046b = obj2;
        this.f11047c = eVar;
        this.f11048d = eVar2;
        this.f11049e = filePath;
        this.f11050f = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f11045a, oVar.f11045a) && Intrinsics.areEqual(this.f11046b, oVar.f11046b) && Intrinsics.areEqual(this.f11047c, oVar.f11047c) && Intrinsics.areEqual(this.f11048d, oVar.f11048d) && Intrinsics.areEqual(this.f11049e, oVar.f11049e) && Intrinsics.areEqual(this.f11050f, oVar.f11050f);
    }

    public final int hashCode() {
        int iHashCode = this.f11045a.hashCode() * 31;
        Object obj = this.f11046b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f11047c;
        return this.f11050f.hashCode() + a3.e.d((this.f11048d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31, this.f11049e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f11045a + ", compilerVersion=" + this.f11046b + ", languageVersion=" + this.f11047c + ", expectedVersion=" + this.f11048d + ", filePath=" + this.f11049e + ", classId=" + this.f11050f + ')';
    }
}
