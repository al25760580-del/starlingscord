package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends bf.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18859d;

    public r0(String str) {
        this.f18859d = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return af.w.j(this.f18859d, ((r0) obj).f18859d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18859d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f18859d, parcel, 1);
        ls.d.U(iT, parcel);
    }
}
