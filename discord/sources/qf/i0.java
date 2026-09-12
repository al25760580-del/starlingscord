package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends bf.a {

    @NonNull
    public static final Parcelable.Creator<i0> CREATOR = new s0(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18825d;

    public i0(boolean z5) {
        this.f18825d = z5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && this.f18825d == ((i0) obj).f18825d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18825d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18825d ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
