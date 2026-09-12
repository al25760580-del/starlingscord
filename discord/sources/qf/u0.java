package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends bf.a {
    public static final Parcelable.Creator<u0> CREATOR = new s0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag.y0 f18870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18871e;

    public u0(ag.y0 y0Var, ag.y0 y0Var2) {
        this.f18870d = y0Var;
        this.f18871e = y0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return af.w.j(this.f18870d, u0Var.f18870d) && af.w.j(this.f18871e, u0Var.f18871e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18870d, this.f18871e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ag.y0 y0Var = this.f18870d;
        ls.d.L(parcel, 1, y0Var == null ? null : y0Var.m());
        ag.y0 y0Var2 = this.f18871e;
        ls.d.L(parcel, 2, y0Var2 != null ? y0Var2.m() : null);
        ls.d.U(iT, parcel);
    }
}
