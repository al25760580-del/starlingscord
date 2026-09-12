package af;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends bf.a {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new m(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f457e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f458i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f460w;

    public j(int i7, int i10, int i11, boolean z5, boolean z6) {
        this.f456d = i7;
        this.f457e = z5;
        this.f458i = z6;
        this.f459v = i10;
        this.f460w = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f456d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f457e ? 1 : 0);
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(this.f458i ? 1 : 0);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f459v);
        ls.d.S(parcel, 5, 4);
        parcel.writeInt(this.f460w);
        ls.d.U(iT, parcel);
    }
}
