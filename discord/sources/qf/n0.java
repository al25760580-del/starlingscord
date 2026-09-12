package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends bf.a {
    public static final Parcelable.Creator<n0> CREATOR = new jf.b(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18841d;

    public n0(boolean z5) {
        this.f18841d = Boolean.valueOf(z5).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && this.f18841d == ((n0) obj).f18841d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18841d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18841d ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
