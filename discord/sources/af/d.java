package af;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends bf.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new m(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f402e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f403i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f404v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f406x;

    public d(j jVar, boolean z5, boolean z6, int[] iArr, int i7, int[] iArr2) {
        this.f401d = jVar;
        this.f402e = z5;
        this.f403i = z6;
        this.f404v = iArr;
        this.f405w = i7;
        this.f406x = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 1, this.f401d, i7);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f402e ? 1 : 0);
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(this.f403i ? 1 : 0);
        int[] iArr = this.f404v;
        if (iArr != null) {
            int iT2 = ls.d.T(4, parcel);
            parcel.writeIntArray(iArr);
            ls.d.U(iT2, parcel);
        }
        ls.d.S(parcel, 5, 4);
        parcel.writeInt(this.f405w);
        int[] iArr2 = this.f406x;
        if (iArr2 != null) {
            int iT3 = ls.d.T(6, parcel);
            parcel.writeIntArray(iArr2);
            ls.d.U(iT3, parcel);
        }
        ls.d.U(iT, parcel);
    }
}
