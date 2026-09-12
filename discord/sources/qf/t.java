package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends bf.a {

    @NonNull
    public static final Parcelable.Creator<t> CREATOR = new jf.b(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18862d;

    public t(boolean z5) {
        this.f18862d = z5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && this.f18862d == ((t) obj).f18862d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18862d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18862d ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
