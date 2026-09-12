package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends bf.a {
    public static final Parcelable.Creator<z0> CREATOR = new jf.b(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18894d;

    public z0(boolean z5) {
        this.f18894d = Boolean.valueOf(z5).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && this.f18894d == ((z0) obj).f18894d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18894d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18894d ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
