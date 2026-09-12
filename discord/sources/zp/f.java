package zp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.b f24064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24065b;

    public f(up.b classId, int i7) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f24064a = classId;
        this.f24065b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f24064a, fVar.f24064a) && this.f24065b == fVar.f24065b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24065b) + (this.f24064a.hashCode() * 31);
    }

    public final String toString() {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            i7 = this.f24065b;
            if (i10 >= i7) {
                break;
            }
            sb2.append("kotlin/Array<");
            i10++;
        }
        sb2.append(this.f24064a);
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
