package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends bf.a {
    public static final Parcelable.Creator<m0> CREATOR = new jf.b(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18839d;

    public m0(long j) {
        this.f18839d = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f18839d == ((m0) obj).f18839d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18839d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 8);
        parcel.writeLong(this.f18839d);
        ls.d.U(iT, parcel);
    }
}
