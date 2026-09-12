package gg;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import ye.n;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends bf.a implements n {
    public static final Parcelable.Creator<b> CREATOR = new fd.a(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10034e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Intent f10035i;

    public b(int i7, int i10, Intent intent) {
        this.f10033d = i7;
        this.f10034e = i10;
        this.f10035i = intent;
    }

    @Override // ye.n
    public final Status a() {
        return this.f10034e == 0 ? Status.f5933w : Status.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f10033d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f10034e);
        ls.d.N(parcel, 3, this.f10035i, i7);
        ls.d.U(iT, parcel);
    }
}
