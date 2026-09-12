package ue;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends bf.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new rf.b(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21094e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f21095i;

    public a(int i7, int i10, Bundle bundle) {
        this.f21093d = i7;
        this.f21094e = i10;
        this.f21095i = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f21093d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f21094e);
        ls.d.K(parcel, 3, this.f21095i);
        ls.d.U(iT, parcel);
    }
}
