package fq;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo.f f9362d;

    public d(vo.f classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f9362d = classDescriptor;
    }

    public final boolean equals(Object obj) {
        d dVar = obj instanceof d ? (d) obj : null;
        return Intrinsics.areEqual(this.f9362d, dVar != null ? dVar.f9362d : null);
    }

    @Override // fq.e
    public final z getType() {
        d0 d0VarJ = this.f9362d.j();
        Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
        return d0VarJ;
    }

    public final int hashCode() {
        return this.f9362d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        d0 d0VarJ = this.f9362d.j();
        Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
        sb2.append(d0VarJ);
        sb2.append('}');
        return sb2.toString();
    }
}
