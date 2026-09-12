package af;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends bf.a {
    public static final Parcelable.Creator<e0> CREATOR = new m(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xe.d[] f416e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f417i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f418v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.K(parcel, 1, this.f415d);
        ls.d.Q(parcel, 2, this.f416e, i7);
        int i10 = this.f417i;
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(i10);
        ls.d.N(parcel, 4, this.f418v, i7);
        ls.d.U(iT, parcel);
    }
}
