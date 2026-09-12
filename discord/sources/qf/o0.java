package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends bf.a {
    public static final Parcelable.Creator<o0> CREATOR = new jf.b(17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18844d;

    public o0(String str) {
        af.w.g(str);
        this.f18844d = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.f18844d.equals(((o0) obj).f18844d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18844d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f18844d, parcel, 1);
        ls.d.U(iT, parcel);
    }
}
