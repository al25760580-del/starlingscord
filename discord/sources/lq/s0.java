package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo.r0 f15250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jp.a f15251b;

    public s0(vo.r0 typeParameter, jp.a typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        this.f15250a = typeParameter;
        this.f15251b = typeAttr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.areEqual(s0Var.f15250a, this.f15250a) && Intrinsics.areEqual(s0Var.f15251b, this.f15251b);
    }

    public final int hashCode() {
        int iHashCode = this.f15250a.hashCode();
        return this.f15251b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f15250a + ", typeAttr=" + this.f15251b + ')';
    }
}
