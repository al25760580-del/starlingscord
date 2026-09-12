package ep;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.b f8568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp.o f8570c;

    public l(up.b classId, bp.o oVar, int i7) {
        oVar = (i7 & 4) != 0 ? null : oVar;
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f8568a = classId;
        this.f8569b = null;
        this.f8570c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f8568a, lVar.f8568a) && Intrinsics.areEqual(this.f8569b, lVar.f8569b) && Intrinsics.areEqual(this.f8570c, lVar.f8570c);
    }

    public final int hashCode() {
        int iHashCode = this.f8568a.hashCode() * 31;
        byte[] bArr = this.f8569b;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        bp.o oVar = this.f8570c;
        return iHashCode2 + (oVar != null ? oVar.f3364a.hashCode() : 0);
    }

    public final String toString() {
        return "Request(classId=" + this.f8568a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f8569b) + ", outerClass=" + this.f8570c + ')';
    }
}
