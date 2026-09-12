package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends bf.a {
    public static final Parcelable.Creator<w0> CREATOR = new s0(18);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18885e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag.y0 f18886i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ag.y0 f18887v;

    public w0(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        af.w.g(bArr);
        ag.y0 y0VarK = ag.y0.k(bArr, bArr.length);
        af.w.g(bArr2);
        ag.y0 y0VarK2 = ag.y0.k(bArr2, bArr2.length);
        af.w.g(bArr3);
        ag.y0 y0VarK3 = ag.y0.k(bArr3, bArr3.length);
        this.f18884d = j;
        this.f18885e = y0VarK;
        this.f18886i = y0VarK2;
        this.f18887v = y0VarK3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f18884d == w0Var.f18884d && af.w.j(this.f18885e, w0Var.f18885e) && af.w.j(this.f18886i, w0Var.f18886i) && af.w.j(this.f18887v, w0Var.f18887v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18884d), this.f18885e, this.f18886i, this.f18887v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 8);
        parcel.writeLong(this.f18884d);
        ls.d.L(parcel, 2, this.f18885e.m());
        ls.d.L(parcel, 3, this.f18886i.m());
        ls.d.L(parcel, 4, this.f18887v.m());
        ls.d.U(iT, parcel);
    }
}
