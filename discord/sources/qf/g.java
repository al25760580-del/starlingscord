package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends bf.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new s0(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18813d;

    public g(boolean z5) {
        this.f18813d = z5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g) && this.f18813d == ((g) obj).f18813d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18813d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18813d ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
