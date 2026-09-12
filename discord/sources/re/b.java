package re;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import qf.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends bf.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new s0(26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19368e;

    public b(boolean z5, String str) {
        if (z5) {
            w.g(str);
        }
        this.f19367d = z5;
        this.f19368e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19367d == bVar.f19367d && w.j(this.f19368e, bVar.f19368e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19367d), this.f19368e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f19367d ? 1 : 0);
        ls.d.O(this.f19368e, parcel, 2);
        ls.d.U(iT, parcel);
    }
}
