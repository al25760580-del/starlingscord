package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends bf.a {

    @NonNull
    public static final Parcelable.Creator<l0> CREATOR = new s0(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final short f18837e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short f18838i;

    public l0(short s2, short s5, int i7) {
        this.f18836d = i7;
        this.f18837e = s2;
        this.f18838i = s5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f18836d == l0Var.f18836d && this.f18837e == l0Var.f18837e && this.f18838i == l0Var.f18838i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18836d), Short.valueOf(this.f18837e), Short.valueOf(this.f18838i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f18836d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f18837e);
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(this.f18838i);
        ls.d.U(iT, parcel);
    }
}
