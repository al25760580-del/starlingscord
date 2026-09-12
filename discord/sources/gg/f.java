package gg;

import af.t;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bf.a {
    public static final Parcelable.Creator<f> CREATOR = new fd.a(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xe.b f10039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f10040i;

    public f(int i7, xe.b bVar, t tVar) {
        this.f10038d = i7;
        this.f10039e = bVar;
        this.f10040i = tVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f10038d);
        ls.d.N(parcel, 2, this.f10039e, i7);
        ls.d.N(parcel, 3, this.f10040i, i7);
        ls.d.U(iT, parcel);
    }
}
